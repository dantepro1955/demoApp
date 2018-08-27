package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.view.View;
import android.view.animation.Interpolator;

@TargetApi(14)
/* compiled from: ViewPropertyAnimatorCompatICS */
/* renamed from: jv */
class jv {
    /* renamed from: a */
    public static void m31866a(View view, long j) {
        view.animate().setDuration(j);
    }

    /* renamed from: a */
    public static void m31865a(View view, float f) {
        view.animate().alpha(f);
    }

    /* renamed from: b */
    public static void m31870b(View view, float f) {
        view.animate().translationX(f);
    }

    /* renamed from: c */
    public static void m31873c(View view, float f) {
        view.animate().translationY(f);
    }

    /* renamed from: a */
    public static long m31864a(View view) {
        return view.animate().getDuration();
    }

    /* renamed from: a */
    public static void m31867a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    /* renamed from: b */
    public static void m31871b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    /* renamed from: d */
    public static void m31874d(View view, float f) {
        view.animate().scaleX(f);
    }

    /* renamed from: e */
    public static void m31875e(View view, float f) {
        view.animate().scaleY(f);
    }

    /* renamed from: b */
    public static void m31869b(View view) {
        view.animate().cancel();
    }

    /* renamed from: c */
    public static void m31872c(View view) {
        view.animate().start();
    }

    /* renamed from: a */
    public static void m31868a(final View view, final jy jyVar) {
        if (jyVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    jyVar.mo3879c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    jyVar.mo3878b(view);
                }

                public void onAnimationStart(Animator animator) {
                    jyVar.mo3877a(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
