package com.p000;

import android.os.Build.VERSION;
import android.view.View;

/* compiled from: AnimatorCompatHelper */
/* renamed from: cu */
public final class cu {
    /* renamed from: a */
    private static final cv f20244a;

    static {
        if (VERSION.SDK_INT >= 12) {
            f20244a = new cx();
        } else {
            f20244a = new cw();
        }
    }

    /* renamed from: a */
    public static void m24983a(View view) {
        f20244a.mo4173a(view);
    }
}
