package com.p000;

import com.mopub.nativeads.AdMobStaticNativeAd;

/* renamed from: cdq */
final /* synthetic */ class cdq implements Runnable {
    /* renamed from: a */
    private final AdMobStaticNativeAd f8826a;

    private cdq(AdMobStaticNativeAd adMobStaticNativeAd) {
        this.f8826a = adMobStaticNativeAd;
    }

    /* renamed from: a */
    public static Runnable m12685a(AdMobStaticNativeAd adMobStaticNativeAd) {
        return new cdq(adMobStaticNativeAd);
    }

    public void run() {
        this.f8826a.destroy();
    }
}
