package com.p000;

import android.annotation.TargetApi;
import android.transition.TransitionManager;
import android.view.ViewGroup;

@TargetApi(19)
/* compiled from: TransitionManagerStaticsKitKat */
/* renamed from: cc */
class cc extends cb {
    cc() {
    }

    /* renamed from: a */
    public void mo1629a(ViewGroup viewGroup, bv bvVar) {
        TransitionManager.beginDelayedTransition(viewGroup, bvVar == null ? null : ((bx) bvVar).f6497a);
    }
}
