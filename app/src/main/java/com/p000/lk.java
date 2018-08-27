package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

@TargetApi(14)
/* compiled from: EdgeEffectCompatIcs */
/* renamed from: lk */
class lk {
    /* renamed from: a */
    public static Object m32431a(Context context) {
        return new EdgeEffect(context);
    }

    /* renamed from: a */
    public static void m32432a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    /* renamed from: a */
    public static boolean m32433a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    /* renamed from: b */
    public static void m32437b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    /* renamed from: a */
    public static boolean m32434a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    /* renamed from: c */
    public static boolean m32438c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    /* renamed from: a */
    public static boolean m32435a(Object obj, int i) {
        ((EdgeEffect) obj).onAbsorb(i);
        return true;
    }

    /* renamed from: a */
    public static boolean m32436a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }
}
