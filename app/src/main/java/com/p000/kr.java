package com.p000;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

@TargetApi(19)
/* compiled from: AccessibilityNodeProviderCompatKitKat */
/* renamed from: kr */
class kr {

    /* compiled from: AccessibilityNodeProviderCompatKitKat */
    /* renamed from: kr$a */
    interface C5493a {
        /* renamed from: a */
        Object mo5124a(int i);

        /* renamed from: a */
        List<Object> mo5125a(String str, int i);

        /* renamed from: a */
        boolean mo5126a(int i, int i2, Bundle bundle);

        /* renamed from: b */
        Object mo5127b(int i);
    }

    /* renamed from: a */
    public static Object m32288a(final C5493a c5493a) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) c5493a.mo5124a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return c5493a.mo5125a(str, i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return c5493a.mo5126a(i, i2, bundle);
            }

            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) c5493a.mo5127b(i);
            }
        };
    }
}
