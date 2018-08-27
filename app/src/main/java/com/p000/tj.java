package com.p000;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tj */
public class tj implements Runnable {
    /* renamed from: a */
    final /* synthetic */ AppLovinInterstitialActivity f25552a;

    public tj(AppLovinInterstitialActivity appLovinInterstitialActivity) {
        this.f25552a = appLovinInterstitialActivity;
    }

    public void run() {
        try {
            if (!AppLovinInterstitialActivity.u(this.f25552a) && AppLovinInterstitialActivity.p(this.f25552a) != null) {
                AppLovinInterstitialActivity.c(this.f25552a, true);
                AppLovinInterstitialActivity.p(this.f25552a).setVisibility(0);
                Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration((long) AppLovinInterstitialActivity.l(this.f25552a).m34680e());
                alphaAnimation.setRepeatCount(0);
                AppLovinInterstitialActivity.p(this.f25552a).startAnimation(alphaAnimation);
                if (AppLovinInterstitialActivity.s(this.f25552a) && AppLovinInterstitialActivity.v(this.f25552a) != null) {
                    AppLovinInterstitialActivity.v(this.f25552a).setVisibility(0);
                    AppLovinInterstitialActivity.v(this.f25552a).bringToFront();
                }
            }
        } catch (Throwable th) {
            AppLovinInterstitialActivity.c(this.f25552a).mo5610c("AppLovinInterstitialActivity", "Unable to show skip button: " + th);
        }
    }
}
