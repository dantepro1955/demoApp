package com.p000;

import android.annotation.TargetApi;
import android.transition.TransitionSet;

@TargetApi(19)
/* compiled from: TransitionSetKitKat */
/* renamed from: ch */
class ch extends bx implements cg {
    /* renamed from: c */
    private TransitionSet f9173c = new TransitionSet();

    /* renamed from: b */
    public /* synthetic */ cg mo1699b(int i) {
        return m13162a(i);
    }

    /* renamed from: b */
    public /* synthetic */ cg mo1700b(bv bvVar) {
        return m13163a(bvVar);
    }

    public ch(bw bwVar) {
        mo1198a(bwVar, (Object) this.f9173c);
    }

    /* renamed from: a */
    public ch m13162a(int i) {
        this.f9173c.setOrdering(i);
        return this;
    }

    /* renamed from: a */
    public ch m13163a(bv bvVar) {
        this.f9173c.addTransition(((bx) bvVar).f6497a);
        return this;
    }
}
