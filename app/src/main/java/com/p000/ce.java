package com.p000;

import android.animation.Animator;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: TransitionSet */
/* renamed from: ce */
public class ce extends bs {
    public ce() {
        super(true);
        if (VERSION.SDK_INT < 19) {
            this.a = new cf(this);
        } else {
            this.a = new ch(this);
        }
    }

    /* renamed from: a */
    public ce m7990a(int i) {
        ((cg) this.a).mo1699b(i);
        return this;
    }

    /* renamed from: a */
    public ce m7991a(bs bsVar) {
        ((cg) this.a).mo1700b(bsVar.f5920a);
        return this;
    }

    /* renamed from: b */
    public void mo1079b(cj cjVar) {
        this.a.mo1199b(cjVar);
    }

    /* renamed from: a */
    public void mo1078a(cj cjVar) {
        this.a.mo1200c(cjVar);
    }

    /* renamed from: a */
    public Animator mo1077a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        return this.a.mo1195a(viewGroup, cjVar, cjVar2);
    }
}
