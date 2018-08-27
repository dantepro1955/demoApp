package com.p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.transition.Fade;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: FadeKitKat */
/* renamed from: bn */
class bn extends bx implements cp {
    public bn(bw bwVar) {
        mo1198a(bwVar, (Object) new Fade());
    }

    public bn(bw bwVar, int i) {
        mo1198a(bwVar, (Object) new Fade(i));
    }

    /* renamed from: a */
    public boolean m9837a(cj cjVar) {
        return ((Fade) this.a).isVisible(bx.m8797d(cjVar));
    }

    /* renamed from: a */
    public Animator m9836a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((Fade) this.a).onAppear(viewGroup, bx.m8797d(cjVar), i, bx.m8797d(cjVar2), i2);
    }

    /* renamed from: b */
    public Animator m9838b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((Fade) this.a).onDisappear(viewGroup, bx.m8797d(cjVar), i, bx.m8797d(cjVar2), i2);
    }
}
