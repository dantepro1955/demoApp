package com.p000;

import android.os.Build.VERSION;

/* renamed from: aqd */
public final class aqd {
    /* renamed from: a */
    public static boolean m4911a() {
        int i = VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public static boolean m4912b() {
        int i = VERSION.SDK_INT;
        return true;
    }

    /* renamed from: c */
    public static boolean m4913c() {
        return VERSION.SDK_INT >= 15;
    }

    /* renamed from: d */
    public static boolean m4914d() {
        return VERSION.SDK_INT >= 16;
    }

    /* renamed from: e */
    public static boolean m4915e() {
        return VERSION.SDK_INT >= 17;
    }

    /* renamed from: f */
    public static boolean m4916f() {
        return VERSION.SDK_INT >= 18;
    }

    /* renamed from: g */
    public static boolean m4917g() {
        return VERSION.SDK_INT >= 19;
    }

    /* renamed from: h */
    public static boolean m4918h() {
        return VERSION.SDK_INT >= 20;
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m4919i() {
        return aqd.m4920j();
    }

    /* renamed from: j */
    public static boolean m4920j() {
        return VERSION.SDK_INT >= 21;
    }

    /* renamed from: k */
    public static boolean m4921k() {
        return VERSION.SDK_INT >= 23;
    }

    /* renamed from: l */
    public static boolean m4922l() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: m */
    public static boolean m4923m() {
        return VERSION.SDK_INT > 25 || "O".equals(VERSION.CODENAME) || VERSION.CODENAME.startsWith("OMR");
    }
}
