package com.p000;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityEvent;

@TargetApi(19)
/* compiled from: AccessibilityEventCompatKitKat */
/* renamed from: kf */
class kf {
    /* renamed from: a */
    public static void m31925a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    /* renamed from: a */
    public static int m31924a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }
}
