package com.p000;

import android.animation.Animator;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: ChangeBounds */
/* renamed from: bh */
public class bh extends bs {
    public bh() {
        super(true);
        if (VERSION.SDK_INT < 19) {
            this.a = new bi(this);
        } else {
            this.a = new bj(this);
        }
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
