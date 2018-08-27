package com.p000;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

@TargetApi(16)
/* compiled from: ViewCompatJB */
/* renamed from: jj */
class jj {
    /* renamed from: a */
    public static boolean m31718a(View view) {
        return view.hasTransientState();
    }

    /* renamed from: b */
    public static void m31719b(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: a */
    public static void m31714a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m31716a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m31717a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: c */
    public static int m31720c(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: a */
    public static void m31713a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: d */
    public static ViewParent m31721d(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: e */
    public static int m31722e(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: f */
    public static int m31723f(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: g */
    public static void m31724g(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: h */
    public static boolean m31725h(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: i */
    public static boolean m31726i(View view) {
        return view.hasOverlappingRendering();
    }

    /* renamed from: a */
    public static void m31715a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
