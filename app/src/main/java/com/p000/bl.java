package com.p000;

import android.animation.Animator;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: Fade */
/* renamed from: bl */
public class bl extends cn {
    public bl(int i) {
        super(true);
        if (VERSION.SDK_INT >= 19) {
            if (i > 0) {
                this.a = new bn(this, i);
            } else {
                this.a = new bn(this);
            }
        } else if (i > 0) {
            this.a = new bm(this, i);
        } else {
            this.a = new bm(this);
        }
    }

    public bl() {
        this(-1);
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
