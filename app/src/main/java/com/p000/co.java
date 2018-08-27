package com.p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.view.ViewGroup;

@TargetApi(14)
/* compiled from: VisibilityIcs */
/* renamed from: co */
class co extends bu implements cp {

    /* compiled from: VisibilityIcs */
    /* renamed from: co$a */
    static class C1786a extends cs {
        /* renamed from: a */
        private cq f9904a;

        C1786a(cq cqVar) {
            this.f9904a = cqVar;
        }

        /* renamed from: a */
        public void m14944a(cj cjVar) {
            this.f9904a.a(cjVar);
        }

        /* renamed from: b */
        public void m14946b(cj cjVar) {
            this.f9904a.b(cjVar);
        }

        /* renamed from: a */
        public Animator m14943a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
            return this.f9904a.a(viewGroup, cjVar, cjVar2);
        }

        /* renamed from: c */
        public boolean m14947c(cj cjVar) {
            return this.f9904a.c(cjVar);
        }

        /* renamed from: a */
        public Animator m14942a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
            return this.f9904a.a(viewGroup, cjVar, i, cjVar2, i2);
        }

        /* renamed from: b */
        public Animator m14945b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
            return this.f9904a.b(viewGroup, cjVar, i, cjVar2, i2);
        }
    }

    co() {
    }

    /* renamed from: a */
    public void mo1198a(bw bwVar, Object obj) {
        this.b = bwVar;
        if (obj == null) {
            this.a = new C1786a((cq) bwVar);
        } else {
            this.a = (cs) obj;
        }
    }

    /* renamed from: a */
    public boolean m14950a(cj cjVar) {
        return ((cs) this.a).c(cjVar);
    }

    /* renamed from: a */
    public Animator m14948a(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((cs) this.a).a(viewGroup, cjVar, i, cjVar2, i2);
    }

    /* renamed from: b */
    public Animator m14951b(ViewGroup viewGroup, cj cjVar, int i, cj cjVar2, int i2) {
        return ((cs) this.a).b(viewGroup, cjVar, i, cjVar2, i2);
    }
}
