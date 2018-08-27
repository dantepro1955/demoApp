package com.p000;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;

@TargetApi(11)
/* compiled from: ViewCompatHC */
/* renamed from: jg */
class jg {
    /* renamed from: a */
    static long m31683a() {
        return ValueAnimator.getFrameDelay();
    }

    /* renamed from: a */
    public static float m31680a(View view) {
        return view.getAlpha();
    }

    /* renamed from: a */
    public static void m31686a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: b */
    public static int m31688b(View view) {
        return view.getLayerType();
    }

    /* renamed from: a */
    public static int m31682a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: c */
    public static int m31692c(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: d */
    public static int m31694d(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: e */
    public static float m31696e(View view) {
        return view.getTranslationX();
    }

    /* renamed from: f */
    public static float m31698f(View view) {
        return view.getTranslationY();
    }

    /* renamed from: g */
    public static float m31700g(View view) {
        return view.getX();
    }

    /* renamed from: h */
    public static float m31702h(View view) {
        return view.getY();
    }

    /* renamed from: i */
    public static float m31703i(View view) {
        return view.getScaleX();
    }

    /* renamed from: a */
    public static void m31684a(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: b */
    public static void m31689b(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: j */
    public static Matrix m31704j(View view) {
        return view.getMatrix();
    }

    /* renamed from: c */
    public static void m31693c(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: d */
    public static void m31695d(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: e */
    public static void m31697e(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: f */
    public static void m31699f(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: g */
    public static void m31701g(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: k */
    public static void m31705k(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: a */
    public static void m31687a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    /* renamed from: b */
    public static void m31691b(View view, boolean z) {
        view.setActivated(z);
    }

    /* renamed from: a */
    public static int m31681a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    /* renamed from: a */
    static void m31685a(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            jg.m31706l(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                jg.m31706l((View) parent);
            }
        }
    }

    /* renamed from: b */
    static void m31690b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            jg.m31706l(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                jg.m31706l((View) parent);
            }
        }
    }

    /* renamed from: l */
    private static void m31706l(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
