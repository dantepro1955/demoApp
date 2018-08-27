package com.p000;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: ts */
class ts implements AnimationListener {
    /* renamed from: a */
    final /* synthetic */ boolean f25566a;
    /* renamed from: b */
    final /* synthetic */ tr f25567b;

    ts(tr trVar, boolean z) {
        this.f25567b = trVar;
        this.f25566a = z;
    }

    public void onAnimationEnd(Animation animation) {
        if (!this.f25566a) {
            AppLovinInterstitialActivity.m(this.f25567b.f25565a).setVisibility(4);
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        AppLovinInterstitialActivity.m(this.f25567b.f25565a).setVisibility(0);
    }
}
