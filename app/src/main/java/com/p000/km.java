package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(17)
/* compiled from: AccessibilityNodeInfoCompatJellybeanMr1 */
/* renamed from: km */
class km {
    /* renamed from: a */
    public static void m32256a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setLabelFor(view);
    }
}
