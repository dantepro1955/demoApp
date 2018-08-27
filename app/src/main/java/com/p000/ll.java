package com.p000;

import android.annotation.TargetApi;
import android.widget.EdgeEffect;

@TargetApi(21)
/* compiled from: EdgeEffectCompatLollipop */
/* renamed from: ll */
class ll {
    /* renamed from: a */
    public static boolean m32439a(Object obj, float f, float f2) {
        ((EdgeEffect) obj).onPull(f, f2);
        return true;
    }
}
