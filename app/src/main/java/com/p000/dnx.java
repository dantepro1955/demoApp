package com.p000;

import android.util.Log;

/* compiled from: DaoLog */
/* renamed from: dnx */
public class dnx {
    /* renamed from: a */
    public static int m28322a(String str) {
        return Log.d("greenDAO", str);
    }

    /* renamed from: b */
    public static int m28324b(String str) {
        return Log.w("greenDAO", str);
    }

    /* renamed from: a */
    public static int m28323a(String str, Throwable th) {
        return Log.w("greenDAO", str, th);
    }

    /* renamed from: b */
    public static int m28325b(String str, Throwable th) {
        return Log.e("greenDAO", str, th);
    }
}
