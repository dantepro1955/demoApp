package com.p000;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.View;

@TargetApi(12)
/* compiled from: HoneycombMr1AnimatorCompatProvider */
/* renamed from: cx */
class cx implements cv {
    /* renamed from: a */
    private TimeInterpolator f20472a;

    cx() {
    }

    /* renamed from: a */
    public void mo4173a(View view) {
        if (this.f20472a == null) {
            this.f20472a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.f20472a);
    }
}
