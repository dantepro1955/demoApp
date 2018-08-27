package com.p000;

import android.annotation.TargetApi;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(14)
/* compiled from: AccessibilityDelegateCompatIcs */
/* renamed from: hv */
class hv {

    /* compiled from: AccessibilityDelegateCompatIcs */
    /* renamed from: hv$a */
    public interface C5369a {
        /* renamed from: a */
        void mo4819a(View view, int i);

        /* renamed from: a */
        void mo4820a(View view, Object obj);

        /* renamed from: a */
        boolean mo4821a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo4822a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo4823b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo4824c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo4825d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: a */
    public static Object m30688a() {
        return new AccessibilityDelegate();
    }

    /* renamed from: a */
    public static Object m30689a(final C5369a c5369a) {
        return new AccessibilityDelegate() {
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c5369a.mo4821a(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c5369a.mo4823b(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c5369a.mo4820a(view, (Object) accessibilityNodeInfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c5369a.mo4824c(view, accessibilityEvent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c5369a.mo4822a(viewGroup, view, accessibilityEvent);
            }

            public void sendAccessibilityEvent(View view, int i) {
                c5369a.mo4819a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c5369a.mo4825d(view, accessibilityEvent);
            }
        };
    }

    /* renamed from: a */
    public static boolean m30692a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m30694b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m30691a(Object obj, View view, Object obj2) {
        ((AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    /* renamed from: c */
    public static void m30695c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m30693a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m30690a(Object obj, View view, int i) {
        ((AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    /* renamed from: d */
    public static void m30696d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
