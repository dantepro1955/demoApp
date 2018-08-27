package com.p000;

import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.impl.adview.C1789u;

/* renamed from: tk */
public class tk implements Runnable {
    /* renamed from: a */
    final /* synthetic */ C1789u f25553a;
    /* renamed from: b */
    final /* synthetic */ AppLovinInterstitialActivity f25554b;

    public tk(AppLovinInterstitialActivity appLovinInterstitialActivity, C1789u c1789u) {
        this.f25554b = appLovinInterstitialActivity;
        this.f25553a = c1789u;
    }

    public void run() {
        if (this.f25553a.equals(AppLovinInterstitialActivity.o(this.f25554b))) {
            AppLovinInterstitialActivity.w(this.f25554b);
        } else if (this.f25553a.equals(AppLovinInterstitialActivity.p(this.f25554b))) {
            AppLovinInterstitialActivity.x(this.f25554b);
        }
    }
}
