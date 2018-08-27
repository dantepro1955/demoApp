package com.p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.widget.VisibilityAwareImageButton;
import android.view.View;
import p000.an.C0316d;

@TargetApi(21)
/* compiled from: FloatingActionButtonLollipop */
/* renamed from: ag */
public class ag extends ae {
    /* renamed from: q */
    private InsetDrawable f1245q;

    /* compiled from: FloatingActionButtonLollipop */
    /* renamed from: ag$a */
    static class C0157a extends GradientDrawable {
        C0157a() {
        }

        public boolean isStateful() {
            return true;
        }
    }

    public ag(VisibilityAwareImageButton visibilityAwareImageButton, aj ajVar, C0316d c0316d) {
        super(visibilityAwareImageButton, ajVar, c0316d);
    }

    /* renamed from: a */
    void mo42a(ColorStateList colorStateList, Mode mode, int i, int i2) {
        Drawable layerDrawable;
        this.d = fp.m21159g(m551k());
        fp.m21148a(this.d, colorStateList);
        if (mode != null) {
            fp.m21151a(this.d, mode);
        }
        if (i2 > 0) {
            this.f = m529a(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{this.f, this.d});
        } else {
            this.f = null;
            layerDrawable = this.d;
        }
        this.e = new RippleDrawable(ColorStateList.valueOf(i), layerDrawable, null);
        this.g = this.e;
        this.o.mo418a(this.e);
    }

    /* renamed from: a */
    void mo39a(int i) {
        if (this.e instanceof RippleDrawable) {
            ((RippleDrawable) this.e).setColor(ColorStateList.valueOf(i));
        } else {
            super.mo39a(i);
        }
    }

    /* renamed from: a */
    void mo38a(float f, float f2) {
        if (VERSION.SDK_INT != 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            Animator animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(b);
            stateListAnimator.addState(j, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
            animatorSet.setInterpolator(b);
            stateListAnimator.addState(k, animatorSet);
            animatorSet = new AnimatorSet();
            r2 = new Animator[3];
            r2[0] = ObjectAnimator.ofFloat(this.n, "elevation", new float[]{f}).setDuration(0);
            r2[1] = ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{this.n.getTranslationZ()}).setDuration(100);
            r2[2] = ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100);
            animatorSet.playSequentially(r2);
            animatorSet.setInterpolator(b);
            stateListAnimator.addState(l, animatorSet);
            animatorSet = new AnimatorSet();
            animatorSet.play(ObjectAnimator.ofFloat(this.n, "elevation", new float[]{0.0f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.n, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(0));
            animatorSet.setInterpolator(b);
            stateListAnimator.addState(m, animatorSet);
            this.n.setStateListAnimator(stateListAnimator);
        } else if (this.n.isEnabled()) {
            this.n.setElevation(f);
            if (this.n.isFocused() || this.n.isPressed()) {
                this.n.setTranslationZ(f2);
            } else {
                this.n.setTranslationZ(0.0f);
            }
        } else {
            this.n.setElevation(0.0f);
            this.n.setTranslationZ(0.0f);
        }
        if (this.o.mo419b()) {
            m547g();
        }
    }

    /* renamed from: a */
    public float mo37a() {
        return this.n.getElevation();
    }

    /* renamed from: c */
    void mo48c() {
        m547g();
    }

    /* renamed from: b */
    void mo166b(Rect rect) {
        if (this.o.mo419b()) {
            this.f1245q = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            this.o.mo418a(this.f1245q);
            return;
        }
        this.o.mo418a(this.e);
    }

    /* renamed from: a */
    void mo45a(int[] iArr) {
    }

    /* renamed from: b */
    void mo46b() {
    }

    /* renamed from: d */
    boolean mo108d() {
        return false;
    }

    /* renamed from: j */
    C5797y mo167j() {
        return new C5798z();
    }

    /* renamed from: l */
    GradientDrawable mo168l() {
        return new C0157a();
    }

    /* renamed from: a */
    void mo44a(Rect rect) {
        if (this.o.mo419b()) {
            float a = this.o.mo416a();
            float a2 = mo37a() + this.i;
            int ceil = (int) Math.ceil((double) ai.m1647b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) ai.m1644a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }
}
