package com.p000;

import android.animation.Animator;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: Visibility */
/* renamed from: cn */
public abstract class cn extends bs implements cq {
    cn(boolean z) {
        super(true);
        if (!z) {
            if (VERSION.SDK_INT >= 19) {
                this.a = new cr();
            } else {
                this.a = new co();
            }
            this.a.m8633a((bw) this);
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

    /* renamed from: c */
    public boolean m9309c(cj cjVar) {
        return ((cp) this.a).a(cjVar);
    }

    /* renamed from: a */
    public Animator m9305a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((cp) this.a).a(viewGroup, cjVar, i, cjVar2, i2);
    }

    /* renamed from: b */
    public Animator m9307b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((cp) this.a).b(viewGroup, cjVar, i, cjVar2, i2);
    }
}
