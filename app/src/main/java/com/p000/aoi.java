package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: aoi */
public final class aoi {
    /* renamed from: a */
    public static int m4678a(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: a */
    public static <T> T m4679a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static <T> T m4680a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m4681a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: a */
    public static String m4682a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m4683a(Handler handler) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException("Must be called on the handler thread");
        }
    }

    /* renamed from: a */
    public static void m4684a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m4685a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m4686a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m4687b(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    public static void m4688b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m4689b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m4690b(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public static void m4691c(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
