package com.p000;

import android.text.TextUtils;

/* compiled from: Assertions */
/* renamed from: ahb */
public final class ahb {
    /* renamed from: a */
    public static void m1514a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m1515a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m1516b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public static void m1517b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static <T> T m1512a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static String m1513a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }
}
