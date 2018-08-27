package com.p000;

import android.annotation.TargetApi;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

@TargetApi(21)
/* compiled from: PopupWindowCompatApi21 */
/* renamed from: ls */
class ls {
    /* renamed from: a */
    private static Field f24454a;

    static {
        try {
            f24454a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f24454a.setAccessible(true);
        } catch (Throwable e) {
            Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }

    /* renamed from: a */
    static void m32505a(PopupWindow popupWindow, boolean z) {
        if (f24454a != null) {
            try {
                f24454a.set(popupWindow, Boolean.valueOf(z));
            } catch (Throwable e) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }
}
