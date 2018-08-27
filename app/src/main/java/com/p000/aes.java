package com.p000;

import com.mopub.mobileads.VastIconXmlManager;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ScriptTagPayloadReader */
/* renamed from: aes */
final class aes extends aet {
    public aes(aep aep) {
        super(aep);
    }

    /* renamed from: a */
    protected boolean mo152a(ahk ahk) {
        return true;
    }

    /* renamed from: a */
    protected void mo151a(ahk ahk, long j) throws adq {
        if (aes.m1120b(ahk) != 2) {
            throw new adq();
        }
        if (!"onMetaData".equals(aes.m1123e(ahk))) {
            return;
        }
        if (aes.m1120b(ahk) != 8) {
            throw new adq();
        }
        Map h = aes.m1126h(ahk);
        if (h.containsKey(VastIconXmlManager.DURATION)) {
            double doubleValue = ((Double) h.get(VastIconXmlManager.DURATION)).doubleValue();
            if (doubleValue > 0.0d) {
                m1102a((long) (doubleValue * 1000000.0d));
            }
        }
    }

    /* renamed from: b */
    private static int m1120b(ahk ahk) {
        return ahk.m1570f();
    }

    /* renamed from: c */
    private static Boolean m1121c(ahk ahk) {
        boolean z = true;
        if (ahk.m1570f() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: d */
    private static Double m1122d(ahk ahk) {
        return Double.valueOf(Double.longBitsToDouble(ahk.m1576l()));
    }

    /* renamed from: e */
    private static String m1123e(ahk ahk) {
        int g = ahk.m1571g();
        int d = ahk.m1567d();
        ahk.m1566c(g);
        return new String(ahk.f1493a, d, g);
    }

    /* renamed from: f */
    private static ArrayList<Object> m1124f(ahk ahk) {
        int o = ahk.m1579o();
        ArrayList<Object> arrayList = new ArrayList(o);
        for (int i = 0; i < o; i++) {
            arrayList.add(aes.m1119a(ahk, aes.m1120b(ahk)));
        }
        return arrayList;
    }

    /* renamed from: g */
    private static HashMap<String, Object> m1125g(ahk ahk) {
        HashMap<String, Object> hashMap = new HashMap();
        while (true) {
            String e = aes.m1123e(ahk);
            int b = aes.m1120b(ahk);
            if (b == 9) {
                return hashMap;
            }
            hashMap.put(e, aes.m1119a(ahk, b));
        }
    }

    /* renamed from: h */
    private static HashMap<String, Object> m1126h(ahk ahk) {
        int o = ahk.m1579o();
        HashMap<String, Object> hashMap = new HashMap(o);
        for (int i = 0; i < o; i++) {
            hashMap.put(aes.m1123e(ahk), aes.m1119a(ahk, aes.m1120b(ahk)));
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Date m1127i(ahk ahk) {
        Date date = new Date((long) aes.m1122d(ahk).doubleValue());
        ahk.m1566c(2);
        return date;
    }

    /* renamed from: a */
    private static Object m1119a(ahk ahk, int i) {
        switch (i) {
            case 0:
                return aes.m1122d(ahk);
            case 1:
                return aes.m1121c(ahk);
            case 2:
                return aes.m1123e(ahk);
            case 3:
                return aes.m1125g(ahk);
            case 8:
                return aes.m1126h(ahk);
            case 10:
                return aes.m1124f(ahk);
            case 11:
                return aes.m1127i(ahk);
            default:
                return null;
        }
    }
}
