package com.p000;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

@TargetApi(19)
/* compiled from: AccessibilityNodeInfoCompatKitKat */
/* renamed from: ko */
class ko {
    /* renamed from: a */
    public static void m32260a(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionInfo((CollectionInfo) obj2);
    }

    /* renamed from: b */
    public static void m32262b(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionItemInfo((CollectionItemInfo) obj2);
    }

    /* renamed from: a */
    public static Object m32259a(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z);
    }

    /* renamed from: a */
    public static Object m32258a(int i, int i2, int i3, int i4, boolean z) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    /* renamed from: a */
    public static void m32261a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setContentInvalid(z);
    }

    /* renamed from: b */
    public static void m32263b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setDismissable(z);
    }
}
