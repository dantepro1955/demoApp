package com.p000;

import android.annotation.TargetApi;
import android.view.WindowInsets;

@TargetApi(20)
/* compiled from: WindowInsetsCompatApi20 */
/* renamed from: kc */
class kc {
    /* renamed from: a */
    public static Object m31907a(Object obj) {
        return ((WindowInsets) obj).consumeSystemWindowInsets();
    }

    /* renamed from: b */
    public static int m31909b(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetBottom();
    }

    /* renamed from: c */
    public static int m31910c(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    /* renamed from: d */
    public static int m31911d(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetRight();
    }

    /* renamed from: e */
    public static int m31912e(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetTop();
    }

    /* renamed from: f */
    public static boolean m31913f(Object obj) {
        return ((WindowInsets) obj).hasSystemWindowInsets();
    }

    /* renamed from: a */
    public static Object m31908a(Object obj, int i, int i2, int i3, int i4) {
        return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
    }
}
