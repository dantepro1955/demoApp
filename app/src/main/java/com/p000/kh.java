package com.p000;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import java.util.List;

@TargetApi(21)
/* compiled from: AccessibilityNodeInfoCompatApi21 */
/* renamed from: kh */
class kh {
    /* renamed from: a */
    static List<Object> m32197a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActionList();
    }

    /* renamed from: a */
    public static boolean m32199a(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityAction) obj2);
    }

    /* renamed from: a */
    public static Object m32195a(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z, i3);
    }

    /* renamed from: a */
    public static Object m32194a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
    }

    /* renamed from: a */
    public static void m32198a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setError(charSequence);
    }

    /* renamed from: a */
    static Object m32196a(int i, CharSequence charSequence) {
        return new AccessibilityAction(i, charSequence);
    }

    /* renamed from: b */
    static int m32200b(Object obj) {
        return ((AccessibilityAction) obj).getId();
    }

    /* renamed from: c */
    static CharSequence m32201c(Object obj) {
        return ((AccessibilityAction) obj).getLabel();
    }
}
