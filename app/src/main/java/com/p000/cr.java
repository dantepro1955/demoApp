package com.p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: VisibilityKitKat */
/* renamed from: cr */
class cr extends bx implements cp {

    /* compiled from: VisibilityKitKat */
    /* renamed from: cr$a */
    static class C4532a extends Visibility {
        /* renamed from: a */
        private final cq f19999a;

        C4532a(cq cqVar) {
            this.f19999a = cqVar;
        }

        public void captureStartValues(TransitionValues transitionValues) {
            bx.a(this.f19999a, transitionValues);
        }

        public void captureEndValues(TransitionValues transitionValues) {
            bx.b(this.f19999a, transitionValues);
        }

        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            return this.f19999a.a(viewGroup, bx.a(transitionValues), bx.a(transitionValues2));
        }

        public boolean isVisible(TransitionValues transitionValues) {
            if (transitionValues == null) {
                return false;
            }
            cj cjVar = new cj();
            bx.a(transitionValues, cjVar);
            return this.f19999a.m24358c(cjVar);
        }

        public Animator onAppear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
            return this.f19999a.m24356a(viewGroup, bx.a(transitionValues), i, bx.a(transitionValues2), i2);
        }

        public Animator onDisappear(ViewGroup viewGroup, TransitionValues transitionValues, int i, TransitionValues transitionValues2, int i2) {
            return this.f19999a.m24357b(viewGroup, bx.a(transitionValues), i, bx.a(transitionValues2), i2);
        }
    }

    cr() {
    }

    /* renamed from: a */
    public void m24530a(bw bwVar, Object obj) {
        this.b = bwVar;
        if (obj == null) {
            this.a = new C4532a((cq) bwVar);
        } else {
            this.a = (Visibility) obj;
        }
    }

    /* renamed from: a */
    public boolean mo4118a(cj cjVar) {
        return ((Visibility) this.a).isVisible(cr.d(cjVar));
    }

    /* renamed from: a */
    public Animator mo4117a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((Visibility) this.a).onAppear(viewGroup, cr.d(cjVar), i, cr.d(cjVar2), i2);
    }

    /* renamed from: b */
    public Animator mo4119b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((Visibility) this.a).onDisappear(viewGroup, cr.d(cjVar), i, cr.d(cjVar2), i2);
    }
}
