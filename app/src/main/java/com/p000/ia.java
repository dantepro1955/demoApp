package com.p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.Gravity;

@TargetApi(17)
/* compiled from: GravityCompatJellybeanMr1 */
/* renamed from: ia */
class ia {
    /* renamed from: a */
    public static int m30738a(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* renamed from: a */
    public static void m30739a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }
}
