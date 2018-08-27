package com.p000;

import android.annotation.TargetApi;
import android.view.View;

@TargetApi(19)
/* compiled from: ViewCompatKitKat */
/* renamed from: jl */
class jl {
    /* renamed from: a */
    public static void m31735a(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: a */
    public static boolean m31736a(View view) {
        return view.isLaidOut();
    }

    /* renamed from: b */
    public static boolean m31737b(View view) {
        return view.isAttachedToWindow();
    }
}
