package com.p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.view.ViewGroup;

@TargetApi(14)
/* compiled from: TransitionIcs */
/* renamed from: bu */
class bu extends bv {
    /* renamed from: a */
    cd f6377a;
    /* renamed from: b */
    bw f6378b;

    /* compiled from: TransitionIcs */
    /* renamed from: bu$a */
    static class C1492a extends cd {
        /* renamed from: a */
        private bw f7663a;

        public C1492a(bw bwVar) {
            this.f7663a = bwVar;
        }

        /* renamed from: a */
        public void mo1165a(cj cjVar) {
            this.f7663a.mo1078a(cjVar);
        }

        /* renamed from: b */
        public void mo1168b(cj cjVar) {
            this.f7663a.mo1079b(cjVar);
        }

        /* renamed from: a */
        public Animator mo1258a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
            return this.f7663a.mo1077a(viewGroup, cjVar, cjVar2);
        }
    }

    bu() {
    }

    /* renamed from: a */
    public void mo1198a(bw bwVar, Object obj) {
        this.f6378b = bwVar;
        if (obj == null) {
            this.f6377a = new C1492a(bwVar);
        } else {
            this.f6377a = (cd) obj;
        }
    }

    /* renamed from: b */
    public void mo1199b(cj cjVar) {
        this.f6377a.mo1168b(cjVar);
    }

    /* renamed from: c */
    public void mo1200c(cj cjVar) {
        this.f6377a.mo1165a(cjVar);
    }

    /* renamed from: a */
    public Animator mo1195a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        return this.f6377a.mo1258a(viewGroup, cjVar, cjVar2);
    }

    /* renamed from: a */
    public bv mo1196a(long j) {
        this.f6377a.mo1159a(j);
        return this;
    }

    /* renamed from: a */
    public bv mo1197a(TimeInterpolator timeInterpolator) {
        this.f6377a.mo1160a(timeInterpolator);
        return this;
    }

    public String toString() {
        return this.f6377a.toString();
    }
}
