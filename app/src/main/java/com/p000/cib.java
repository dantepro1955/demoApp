package com.p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.analytics.Tracker;
import p000.ald.C0276a;
import p000.ald.C0277b;

/* compiled from: GAMetricsController */
/* renamed from: cib */
public class cib {
    /* renamed from: a */
    private static final Handler f9324a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private static final caf f9325b = caf.m12046a();

    /* renamed from: a */
    public static void m13642a(String str) {
        Tracker a = f9325b.m12064c().m14101a();
        if (a != null && f9325b.m12077h().mo1775o() <= f9325b.m12087q().mo1791h()) {
            a.setScreenName(str);
            a.send(new C0276a().mo319a());
        }
    }

    /* renamed from: a */
    public static void m13643a(String str, String str2, String str3, Long l) {
        Tracker a = f9325b.m12064c().m14101a();
        if (a != null && f9325b.m12077h().mo1775o() <= f9325b.m12087q().mo1791h()) {
            C0277b b = new C0277b().m2441a(str).m2443b(str2);
            if (str3 != null) {
                b.m2444c(str3);
            }
            if (l != null) {
                b.m2440a(l.longValue());
            }
            a.send(b.mo319a());
        }
    }
}
