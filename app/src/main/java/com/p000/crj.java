package com.p000;

import com.taplytics.sdk.Taplytics;
import com.taplytics.sdk.TaplyticsRunningExperimentsListener;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: TaplyticsHelper */
/* renamed from: crj */
public class crj {
    /* renamed from: a */
    private static boolean f20003a;
    /* renamed from: b */
    private static final Object f20004b = new Object();
    /* renamed from: c */
    private static final Map<Class<?>, crm> f20005c = new hh();

    /* compiled from: TaplyticsHelper */
    /* renamed from: crj$1 */
    static class C45341 implements TaplyticsRunningExperimentsListener {
        C45341() {
        }

        public void runningExperimentsAndVariation(Map<String, String> map) {
            if (map != null && !map.isEmpty()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (Entry entry : map.entrySet()) {
                    if (stringBuilder.length() > 0) {
                        stringBuilder.append(",");
                    }
                    stringBuilder.append((String) entry.getKey()).append("=");
                    stringBuilder.append((String) entry.getValue());
                }
                cjp.a(stringBuilder.toString());
                dit.m27490f(stringBuilder.toString());
                dit.m27474a("Experiment", "UpdateExperiment");
            }
        }
    }

    /* renamed from: a */
    public static void m24574a() {
        if (!f20003a) {
            f20003a = true;
            Taplytics.getRunningExperimentsAndVariations(new C45341());
        }
    }

    /* renamed from: a */
    public static <T extends crm> T m24573a(crm crm) {
        crm crm2;
        synchronized (f20004b) {
            Class cls = crm.getClass();
            if (!f20005c.containsKey(cls)) {
                f20005c.put(crm.getClass(), crm);
            }
            crm2 = (crm) f20005c.get(cls);
        }
        return crm2;
    }

    /* renamed from: a */
    public static void m24575a(Class<?> cls) {
        synchronized (f20004b) {
            if (f20005c.containsKey(cls)) {
                f20005c.remove(cls);
            }
        }
    }

    /* renamed from: b */
    public static <T extends crm> T m24578b(Class<T> cls) {
        crm crm;
        synchronized (f20004b) {
            crm = (crm) f20005c.get(cls);
        }
        return crm;
    }

    /* renamed from: a */
    public static void m24576a(String str) {
        Taplytics.logEvent(str);
    }

    /* renamed from: a */
    public static void m24577a(String str, String str2, int i) {
        crj.m24576a(str2);
        chn.a("Taplytics", str2, str, Long.valueOf((long) i));
    }
}
