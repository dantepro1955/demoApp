package com.p000;

import android.util.Log;

/* compiled from: Logy */
/* renamed from: dth */
public class dth {
    /* renamed from: a */
    public static int f22890a = -1;

    /* renamed from: a */
    public static void m29259a(String str, String str2) {
        if (f22890a >= 1) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m29261b(String str, String str2) {
        if (f22890a >= 0) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m29262c(String str, String str2) {
        if (f22890a > -1) {
            Log.w(str, str2);
        }
    }

    /* renamed from: a */
    public static void m29260a(String str, String str2, Throwable th) {
        if (f22890a > -1) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m29263d(String str, String str2) {
        if (f22890a != -2) {
            Log.e(str, str2);
        }
    }
}
