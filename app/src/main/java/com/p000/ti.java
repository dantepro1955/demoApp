package com.p000;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: ti */
public class ti implements Runnable {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25551a;

    public ti(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25551a = appLovinInterstitialActivity;
    }

    public void run() {
        try {
            if (AppLovinInterstitialActivity.r(this.f25551a)) {
                AppLovinInterstitialActivity.o(this.f25551a).setVisibility(0);
                return;
            }
            AppLovinInterstitialActivity.b(this.f25551a, true);
            if (AppLovinInterstitialActivity.s(this.f25551a) && AppLovinInterstitialActivity.t(this.f25551a) != null) {
                AppLovinInterstitialActivity.t(this.f25551a).setVisibility(0);
                AppLovinInterstitialActivity.t(this.f25551a).bringToFront();
            }
            AppLovinInterstitialActivity.o(this.f25551a).setVisibility(0);
            AppLovinInterstitialActivity.o(this.f25551a).bringToFront();
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) AppLovinInterstitialActivity.l(this.f25551a).m34680e());
            alphaAnimation.setRepeatCount(0);
            AppLovinInterstitialActivity.o(this.f25551a).startAnimation(alphaAnimation);
        } catch (Throwable th) {
            this.f25551a.dismiss();
        }
    }
}
