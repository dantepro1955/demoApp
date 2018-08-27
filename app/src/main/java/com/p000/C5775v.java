package com.p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: AnimationUtils */
/* renamed from: v */
public class C5775v {
    /* renamed from: a */
    public static final Interpolator f25656a = new LinearInterpolator();
    /* renamed from: b */
    public static final Interpolator f25657b = new kw();
    /* renamed from: c */
    public static final Interpolator f25658c = new kv();
    /* renamed from: d */
    public static final Interpolator f25659d = new kx();
    /* renamed from: e */
    public static final Interpolator f25660e = new DecelerateInterpolator();

    /* compiled from: AnimationUtils */
    /* renamed from: v$a */
    static class C5774a implements AnimationListener {
        C5774a() {
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationEnd(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* renamed from: a */
    static float m34289a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: a */
    public static int m34290a(int i, int i2, float f) {
        return Math.round(((float) (i2 - i)) * f) + i;
    }
}
