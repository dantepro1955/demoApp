package com.p000;

import android.os.Build.VERSION;

/* compiled from: Global */
/* renamed from: cae */
public class cae {
    /* renamed from: a */
    public static final boolean f8431a;
    /* renamed from: b */
    public static final long f8432b = cqw.d(5);
    /* renamed from: c */
    public static final long f8433c = cqw.d(30);
    /* renamed from: d */
    public static final long f8434d = cqw.b(1);
    /* renamed from: e */
    public static final long f8435e = cqw.c(1);
    /* renamed from: f */
    public static final long f8436f = cqw.b(5);

    /* renamed from: a */
    public static String m12035a() {
        return "https://api.9gag.com";
    }

    static {
        boolean z;
        if (VERSION.SDK_INT >= 14) {
            z = true;
        } else {
            z = false;
        }
        f8431a = z;
    }
}
