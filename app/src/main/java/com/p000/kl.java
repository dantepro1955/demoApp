package com.p000;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(16)
/* compiled from: AccessibilityNodeInfoCompatJellyBean */
/* renamed from: kl */
class kl {
    /* renamed from: a */
    public static boolean m32252a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    /* renamed from: a */
    public static void m32251a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    /* renamed from: a */
    public static void m32250a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    /* renamed from: b */
    public static int m32253b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    /* renamed from: c */
    public static boolean m32255c(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }

    /* renamed from: b */
    public static void m32254b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }
}
