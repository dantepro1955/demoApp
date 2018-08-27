package com.p000;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

@TargetApi(16)
/* compiled from: AccessibilityNodeProviderCompatJellyBean */
/* renamed from: kq */
class kq {

    /* compiled from: AccessibilityNodeProviderCompatJellyBean */
    /* renamed from: kq$a */
    interface C5489a {
        /* renamed from: a */
        Object mo5120a(int i);

        /* renamed from: a */
        List<Object> mo5121a(String str, int i);

        /* renamed from: a */
        boolean mo5122a(int i, int i2, Bundle bundle);
    }

    /* renamed from: a */
    public static Object m32287a(final C5489a c5489a) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) c5489a.mo5120a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return c5489a.mo5121a(str, i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return c5489a.mo5122a(i, i2, bundle);
            }
        };
    }
}
