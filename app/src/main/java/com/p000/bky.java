package com.p000;

import android.util.Log;

@bhd
/* renamed from: bky */
public class bky {
    /* renamed from: a */
    public static void m9004a(String str, Throwable th) {
        if (bky.m9005a(3)) {
            Log.d("Ads", str, th);
        }
    }

    /* renamed from: a */
    public static boolean m9005a(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }

    /* renamed from: b */
    public static void m9006b(String str) {
        if (bky.m9005a(3)) {
            Log.d("Ads", str);
        }
    }

    /* renamed from: b */
    public static void m9007b(String str, Throwable th) {
        if (bky.m9005a(6)) {
            Log.e("Ads", str, th);
        }
    }

    /* renamed from: c */
    public static void m9008c(String str) {
        if (bky.m9005a(6)) {
            Log.e("Ads", str);
        }
    }

    /* renamed from: c */
    public static void m9009c(String str, Throwable th) {
        if (bky.m9005a(5)) {
            Log.w("Ads", str, th);
        }
    }

    /* renamed from: d */
    public static void m9010d(String str) {
        if (bky.m9005a(4)) {
            Log.i("Ads", str);
        }
    }

    /* renamed from: e */
    public static void m9011e(String str) {
        if (bky.m9005a(5)) {
            Log.w("Ads", str);
        }
    }
}
