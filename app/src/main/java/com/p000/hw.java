package com.p000;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

@TargetApi(16)
/* compiled from: AccessibilityDelegateCompatJellyBean */
/* renamed from: hw */
class hw {

    /* compiled from: AccessibilityDelegateCompatJellyBean */
    /* renamed from: hw$a */
    public interface C5371a {
        /* renamed from: a */
        Object mo4837a(View view);

        /* renamed from: a */
        void mo4838a(View view, int i);

        /* renamed from: a */
        void mo4839a(View view, Object obj);

        /* renamed from: a */
        boolean mo4840a(View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo4841a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo4842a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo4843b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo4844c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo4845d(View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: a */
    public static Object m30697a(final C5371a c5371a) {
        return new AccessibilityDelegate() {
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return c5371a.mo4841a(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c5371a.mo4843b(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                c5371a.mo4839a(view, (Object) accessibilityNodeInfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                c5371a.mo4844c(view, accessibilityEvent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return c5371a.mo4842a(viewGroup, view, accessibilityEvent);
            }

            public void sendAccessibilityEvent(View view, int i) {
                c5371a.mo4838a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                c5371a.mo4845d(view, accessibilityEvent);
            }

            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                return (AccessibilityNodeProvider) c5371a.mo4837a(view);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return c5371a.mo4840a(view, i, bundle);
            }
        };
    }

    /* renamed from: a */
    public static Object m30698a(Object obj, View view) {
        return ((AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    /* renamed from: a */
    public static boolean m30699a(Object obj, View view, int i, Bundle bundle) {
        return ((AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
