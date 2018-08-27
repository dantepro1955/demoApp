package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(14)
/* compiled from: ViewCompatICS */
/* renamed from: jh */
class jh {
    /* renamed from: a */
    public static boolean m31709a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: b */
    public static boolean m31711b(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static void m31707a(View view, Object obj) {
        view.setAccessibilityDelegate((AccessibilityDelegate) obj);
    }

    /* renamed from: b */
    public static void m31710b(View view, Object obj) {
        view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) obj);
    }

    /* renamed from: a */
    public static void m31708a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }
}
