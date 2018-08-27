package com.p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.ViewGroup;

@TargetApi(14)
/* compiled from: FadeIcs */
/* renamed from: bm */
class bm extends bu implements cp {
    public bm(bw bwVar) {
        mo1198a(bwVar, new bo());
    }

    public bm(bw bwVar, int i) {
        mo1198a(bwVar, new bo(i));
    }

    /* renamed from: a */
    public boolean m9609a(cj cjVar) {
        return ((bo) this.a).c(cjVar);
    }

    /* renamed from: a */
    public Animator m9608a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((bo) this.a).m10081a(viewGroup, cjVar, i, cjVar2, i2);
    }

    /* renamed from: b */
    public Animator m9610b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((bo) this.a).m10083b(viewGroup, cjVar, i, cjVar, i);
    }
}
