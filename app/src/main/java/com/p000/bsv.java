package com.p000;

import android.text.TextUtils;

/* renamed from: bsv */
public final class bsv {
    /* renamed from: a */
    public static <T> T m10706a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: a */
    public static <T> T m10707a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static String m10708a(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: a */
    public static void m10709a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
