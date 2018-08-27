package com.p000;

import com.applovin.adview.AppLovinInterstitialActivity;

/* renamed from: tq */
class tq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ int f25562a;
    /* renamed from: b */
    final /* synthetic */ int f25563b;
    /* renamed from: c */
    final /* synthetic */ tp f25564c;

    tq(tp tpVar, int i, int i2) {
        this.f25564c = tpVar;
        this.f25562a = i;
        this.f25563b = i2;
    }

    public void run() {
        AppLovinInterstitialActivity.c(this.f25564c.f25561a).mo5612d("AppLovinInterstitialActivity", "Video view error (" + this.f25562a + "," + this.f25563b + ") - showing close button.");
        AppLovinInterstitialActivity.d(this.f25564c.f25561a);
    }
}
