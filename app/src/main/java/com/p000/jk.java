package com.p000;

import android.annotation.TargetApi;
import android.graphics.Paint;
import android.view.Display;
import android.view.View;

@TargetApi(17)
/* compiled from: ViewCompatJellybeanMr1 */
/* renamed from: jk */
class jk {
    /* renamed from: a */
    public static void m31729a(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: a */
    public static int m31727a(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: b */
    public static int m31730b(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: c */
    public static int m31731c(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: a */
    public static void m31728a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: d */
    public static int m31732d(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: e */
    public static boolean m31733e(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: f */
    public static Display m31734f(View view) {
        return view.getDisplay();
    }
}
