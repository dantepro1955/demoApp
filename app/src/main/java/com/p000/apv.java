package com.p000;

import android.os.SystemClock;

/* renamed from: apv */
public class apv implements apt {
    /* renamed from: a */
    private static apv f3929a = new apv();

    private apv() {
    }

    /* renamed from: d */
    public static apt m4885d() {
        return f3929a;
    }

    /* renamed from: a */
    public long mo606a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public long mo607b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: c */
    public long mo608c() {
        return System.nanoTime();
    }
}
