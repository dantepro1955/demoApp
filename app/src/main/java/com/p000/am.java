package com.p000;

import android.content.Context;
import android.content.res.TypedArray;
import p000.mx.C5568a;

/* compiled from: ThemeUtils */
/* renamed from: am */
public class am {
    /* renamed from: a */
    private static final int[] f2025a = new int[]{C5568a.colorPrimary};

    /* renamed from: a */
    public static void m2549a(Context context) {
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f2025a);
        if (!obtainStyledAttributes.hasValue(0)) {
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (i != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
