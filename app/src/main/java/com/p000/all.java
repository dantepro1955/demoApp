package com.p000;

import com.inmobi.commons.analytics.db.AnalyticsEvent;

/* renamed from: all */
public final class all {
    /* renamed from: a */
    public static String m2473a(int i) {
        return all.m2474a("cd", i);
    }

    /* renamed from: a */
    private static String m2474a(String str, int i) {
        if (i >= 1) {
            return new StringBuilder(String.valueOf(str).length() + 11).append(str).append(i).toString();
        }
        bnw.m10035a("index out of range for prefix", str);
        return "";
    }

    /* renamed from: b */
    public static String m2475b(int i) {
        return all.m2474a("cm", i);
    }

    /* renamed from: c */
    public static String m2476c(int i) {
        return all.m2474a("&pr", i);
    }

    /* renamed from: d */
    public static String m2477d(int i) {
        return all.m2474a("pr", i);
    }

    /* renamed from: e */
    public static String m2478e(int i) {
        return all.m2474a("&promo", i);
    }

    /* renamed from: f */
    public static String m2479f(int i) {
        return all.m2474a("promo", i);
    }

    /* renamed from: g */
    public static String m2480g(int i) {
        return all.m2474a(AnalyticsEvent.TYPE_TAG_TRANSACTION, i);
    }

    /* renamed from: h */
    public static String m2481h(int i) {
        return all.m2474a("&il", i);
    }

    /* renamed from: i */
    public static String m2482i(int i) {
        return all.m2474a("il", i);
    }
}
