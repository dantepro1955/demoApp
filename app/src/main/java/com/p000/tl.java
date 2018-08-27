package com.p000;

import com.applovin.adview.AppLovinInterstitialActivity;
import java.util.UUID;

/* renamed from: tl */
public class tl implements Runnable {
    /* renamed from: a */
    final /* synthetic */ int f25555a;
    /* renamed from: b */
    final /* synthetic */ UUID f25556b;
    /* renamed from: c */
    final /* synthetic */ AppLovinInterstitialActivity f25557c;

    public tl(AppLovinInterstitialActivity appLovinInterstitialActivity, int i, UUID uuid) {
        this.f25557c = appLovinInterstitialActivity;
        this.f25555a = i;
        this.f25556b = uuid;
    }

    public void run() {
        AppLovinInterstitialActivity.a(this.f25557c, this.f25555a, this.f25556b);
    }
}
