package com.p000;

import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: th */
class th implements Runnable {
    /* renamed from: a */
    final /* synthetic */ int f25548a;
    /* renamed from: b */
    final /* synthetic */ int f25549b;
    /* renamed from: c */
    final /* synthetic */ tg f25550c;

    th(tg tgVar, int i, int i2) {
        this.f25550c = tgVar;
        this.f25548a = i;
        this.f25549b = i2;
    }

    public void run() {
        AppLovinInterstitialActivity.c(this.f25550c.f25547a.f25546a).mo5612d("AppLovinInterstitialActivity", "Media player error (" + this.f25548a + "," + this.f25549b + ") - showing close button.");
        AppLovinInterstitialActivity.d(this.f25550c.f25547a.f25546a);
    }
}
