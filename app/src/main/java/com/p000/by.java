package com.p000;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: TransitionManager */
/* renamed from: by */
public class by {
    /* renamed from: a */
    private static cb f8161a;

    static {
        if (VERSION.SDK_INT < 19) {
            f8161a = new ca();
        } else {
            f8161a = new cc();
        }
    }

    /* renamed from: a */
    public static void m11715a(ViewGroup viewGroup, bs bsVar) {
        f8161a.mo1629a(viewGroup, bsVar == null ? null : bsVar.f5920a);
    }
}
