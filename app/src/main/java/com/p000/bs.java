package com.p000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: Transition */
/* renamed from: bs */
public abstract class bs implements bw {
    /* renamed from: a */
    bv f5920a;

    public bs() {
        this(false);
    }

    bs(boolean z) {
        if (!z) {
            if (VERSION.SDK_INT >= 23) {
                this.f5920a = new bt();
            } else if (VERSION.SDK_INT >= 19) {
                this.f5920a = new bx();
            } else {
                this.f5920a = new bu();
            }
            this.f5920a.m8633a((bw) this);
        }
    }

    /* renamed from: a */
    public Animator mo1077a(ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        return null;
    }

    /* renamed from: a */
    public bs m7987a(long j) {
        this.f5920a.mo1196a(j);
        return this;
    }

    /* renamed from: a */
    public bs m7988a(TimeInterpolator timeInterpolator) {
        this.f5920a.mo1197a(timeInterpolator);
        return this;
    }

    public String toString() {
        return this.f5920a.toString();
    }
}
