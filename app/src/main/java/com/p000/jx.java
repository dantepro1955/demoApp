package com.p000;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(19)
/* compiled from: ViewPropertyAnimatorCompatKK */
/* renamed from: jx */
class jx {
    /* renamed from: a */
    public static void m31877a(final View view, final ka kaVar) {
        AnimatorUpdateListener animatorUpdateListener = null;
        if (kaVar != null) {
            animatorUpdateListener = new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    kaVar.mo5228a(view);
                }
            };
        }
        view.animate().setUpdateListener(animatorUpdateListener);
    }
}
