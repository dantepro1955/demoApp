package com.p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: TransitionKitKat */
/* renamed from: bx */
class bx extends bv {
    /* renamed from: a */
    Transition f6497a;
    /* renamed from: b */
    bw f6498b;

    /* compiled from: TransitionKitKat */
    /* renamed from: bx$a */
    static class C1572a extends Transition {
        /* renamed from: a */
        private bw f8054a;

        public C1572a(bw bwVar) {
            this.f8054a = bwVar;
        }

        public void captureStartValues(TransitionValues transitionValues) {
            bx.m8794a(this.f8054a, transitionValues);
        }

        public void captureEndValues(TransitionValues transitionValues) {
            bx.m8796b(this.f8054a, transitionValues);
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            return this.f8054a.mo1077a(viewGroup, bx.m8792a(transitionValues), bx.m8792a(transitionValues2));
        }
    }

    bx() {
    }

    /* renamed from: a */
    static void m8793a(TransitionValues transitionValues, cj cjVar) {
        if (transitionValues != null) {
            cjVar.f9414b = transitionValues.view;
            if (transitionValues.values.size() > 0) {
                cjVar.f9413a.putAll(transitionValues.values);
            }
        }
    }

    /* renamed from: a */
    static void m8795a(cj cjVar, TransitionValues transitionValues) {
        if (cjVar != null) {
            transitionValues.view = cjVar.f9414b;
            if (cjVar.f9413a.size() > 0) {
                transitionValues.values.putAll(cjVar.f9413a);
            }
        }
    }

    /* renamed from: a */
    static void m8794a(bw bwVar, TransitionValues transitionValues) {
        cj cjVar = new cj();
        bx.m8793a(transitionValues, cjVar);
        bwVar.mo1078a(cjVar);
        bx.m8795a(cjVar, transitionValues);
    }

    /* renamed from: b */
    static void m8796b(bw bwVar, TransitionValues transitionValues) {
        cj cjVar = new cj();
        bx.m8793a(transitionValues, cjVar);
        bwVar.mo1079b(cjVar);
        bx.m8795a(cjVar, transitionValues);
    }

    /* renamed from: a */
    static cj m8792a(TransitionValues transitionValues) {
        if (transitionValues == null) {
            return null;
        }
        cj cjVar = new cj();
        bx.m8793a(transitionValues, cjVar);
        return cjVar;
    }

    /* renamed from: d */
    static TransitionValues m8797d(cj cjVar) {
        if (cjVar == null) {
            return null;
        }
        TransitionValues transitionValues = new TransitionValues();
        bx.m8795a(cjVar, transitionValues);
        return transitionValues;
    }

    /* renamed from: a */
    public void mo1198a(bw bwVar, Object obj) {
        this.f6498b = bwVar;
        if (obj == null) {
            this.f6497a = new C1572a(bwVar);
        } else {
            this.f6497a = (Transition) obj;
        }
    }

    /* renamed from: b */
    public void mo1199b(cj cjVar) {
        TransitionValues transitionValues = new TransitionValues();
        bx.m8795a(cjVar, transitionValues);
        this.f6497a.captureEndValues(transitionValues);
        bx.m8793a(transitionValues, cjVar);
    }

    /* renamed from: c */
    public void mo1200c(cj cjVar) {
        TransitionValues transitionValues = new TransitionValues();
        bx.m8795a(cjVar, transitionValues);
        this.f6497a.captureStartValues(transitionValues);
        bx.m8793a(transitionValues, cjVar);
    }

    /* renamed from: a */
    public Animator mo1195a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        TransitionValues transitionValues;
        TransitionValues transitionValues2 = null;
        if (cjVar != null) {
            transitionValues = new TransitionValues();
            bx.m8795a(cjVar, transitionValues);
        } else {
            transitionValues = null;
        }
        if (cjVar2 != null) {
            transitionValues2 = new TransitionValues();
            bx.m8795a(cjVar2, transitionValues2);
        }
        return this.f6497a.createAnimator(viewGroup, transitionValues, transitionValues2);
    }

    /* renamed from: a */
    public bv mo1196a(long j) {
        this.f6497a.setDuration(j);
        return this;
    }

    /* renamed from: a */
    public bv mo1197a(TimeInterpolator timeInterpolator) {
        this.f6497a.setInterpolator(timeInterpolator);
        return this;
    }

    public String toString() {
        return this.f6497a.toString();
    }
}
