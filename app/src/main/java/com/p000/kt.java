package com.p000;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityRecord;

@TargetApi(14)
/* compiled from: AccessibilityRecordCompatIcs */
/* renamed from: kt */
class kt {
    /* renamed from: a */
    public static void m32313a(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    /* renamed from: b */
    public static void m32315b(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    /* renamed from: c */
    public static void m32316c(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    /* renamed from: d */
    public static void m32317d(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    /* renamed from: a */
    public static void m32314a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    /* renamed from: e */
    public static void m32318e(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }
}
