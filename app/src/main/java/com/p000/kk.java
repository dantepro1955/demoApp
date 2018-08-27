package com.p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(14)
/* compiled from: AccessibilityNodeInfoCompatIcs */
/* renamed from: kk */
class kk {
    /* renamed from: a */
    public static Object m32210a() {
        return AccessibilityNodeInfo.obtain();
    }

    /* renamed from: a */
    public static Object m32211a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    /* renamed from: a */
    public static void m32212a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    /* renamed from: a */
    public static void m32214a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    /* renamed from: b */
    public static int m32217b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    /* renamed from: a */
    public static void m32213a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    /* renamed from: b */
    public static void m32218b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    /* renamed from: c */
    public static int m32222c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getChildCount();
    }

    /* renamed from: d */
    public static CharSequence m32227d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    /* renamed from: e */
    public static CharSequence m32231e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    /* renamed from: f */
    public static CharSequence m32233f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    /* renamed from: g */
    public static CharSequence m32235g(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    /* renamed from: h */
    public static boolean m32238h(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    /* renamed from: i */
    public static boolean m32240i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    /* renamed from: j */
    public static boolean m32241j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    /* renamed from: k */
    public static boolean m32242k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    /* renamed from: l */
    public static boolean m32243l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    /* renamed from: m */
    public static boolean m32244m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    /* renamed from: n */
    public static boolean m32245n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    /* renamed from: o */
    public static boolean m32246o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    /* renamed from: p */
    public static boolean m32247p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    /* renamed from: q */
    public static boolean m32248q(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    /* renamed from: c */
    public static void m32223c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    /* renamed from: d */
    public static void m32228d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    /* renamed from: a */
    public static void m32216a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setCheckable(z);
    }

    /* renamed from: b */
    public static void m32221b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setChecked(z);
    }

    /* renamed from: a */
    public static void m32215a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    /* renamed from: c */
    public static void m32226c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    /* renamed from: b */
    public static void m32220b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    /* renamed from: d */
    public static void m32230d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    /* renamed from: e */
    public static void m32232e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    /* renamed from: f */
    public static void m32234f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    /* renamed from: g */
    public static void m32236g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    /* renamed from: c */
    public static void m32225c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    /* renamed from: b */
    public static void m32219b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    /* renamed from: h */
    public static void m32237h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    /* renamed from: i */
    public static void m32239i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    /* renamed from: c */
    public static void m32224c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    /* renamed from: d */
    public static void m32229d(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setText(charSequence);
    }

    /* renamed from: r */
    public static void m32249r(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
