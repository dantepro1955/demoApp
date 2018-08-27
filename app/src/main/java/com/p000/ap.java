package com.p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;
import p000.an.C0317e;
import p000.an.C0317e.C0312b;
import p000.an.C0317e.C0314a;

@TargetApi(12)
/* compiled from: ValueAnimatorCompatImplHoneycombMr1 */
/* renamed from: ap */
class ap extends C0317e {
    /* renamed from: a */
    private final ValueAnimator f3877a = new ValueAnimator();

    ap() {
    }

    /* renamed from: a */
    public void mo574a() {
        this.f3877a.start();
    }

    /* renamed from: b */
    public boolean mo581b() {
        return this.f3877a.isRunning();
    }

    /* renamed from: a */
    public void mo580a(Interpolator interpolator) {
        this.f3877a.setInterpolator(interpolator);
    }

    /* renamed from: a */
    public void mo579a(final C0312b c0312b) {
        this.f3877a.addUpdateListener(new AnimatorUpdateListener(this) {
            /* renamed from: b */
            final /* synthetic */ ap f3874b;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                c0312b.mo357a();
            }
        });
    }

    /* renamed from: a */
    public void mo578a(final C0314a c0314a) {
        this.f3877a.addListener(new AnimatorListenerAdapter(this) {
            /* renamed from: b */
            final /* synthetic */ ap f3876b;

            public void onAnimationStart(Animator animator) {
                c0314a.mo358a();
            }

            public void onAnimationEnd(Animator animator) {
                c0314a.mo359b();
            }

            public void onAnimationCancel(Animator animator) {
                c0314a.mo360c();
            }
        });
    }

    /* renamed from: a */
    public void mo576a(int i, int i2) {
        this.f3877a.setIntValues(new int[]{i, i2});
    }

    /* renamed from: c */
    public int mo582c() {
        return ((Integer) this.f3877a.getAnimatedValue()).intValue();
    }

    /* renamed from: a */
    public void mo575a(float f, float f2) {
        this.f3877a.setFloatValues(new float[]{f, f2});
    }

    /* renamed from: d */
    public float mo583d() {
        return ((Float) this.f3877a.getAnimatedValue()).floatValue();
    }

    /* renamed from: a */
    public void mo577a(long j) {
        this.f3877a.setDuration(j);
    }

    /* renamed from: e */
    public void mo584e() {
        this.f3877a.cancel();
    }

    /* renamed from: f */
    public float mo585f() {
        return this.f3877a.getAnimatedFraction();
    }

    /* renamed from: g */
    public void mo586g() {
        this.f3877a.end();
    }

    /* renamed from: h */
    public long mo587h() {
        return this.f3877a.getDuration();
    }
}
