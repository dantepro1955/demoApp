package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(16)
/* compiled from: ViewPropertyAnimatorCompatJB */
/* renamed from: jw */
class jw {
    /* renamed from: a */
    public static void m31876a(final View view, final jy jyVar) {
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
