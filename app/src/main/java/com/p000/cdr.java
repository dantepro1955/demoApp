package com.p000;

import com.google.android.gms.ads.formats.NativeAdView;

/* renamed from: cdr */
final /* synthetic */ class cdr implements Runnable {
    /* renamed from: a */
    private final NativeAdView f8827a;

    private cdr(NativeAdView nativeAdView) {
        this.f8827a = nativeAdView;
    }

    /* renamed from: a */
    public static Runnable m12686a(NativeAdView nativeAdView) {
        return new cdr(nativeAdView);
    }

    public void run() {
        this.f8827a.m19285a();
    }
}
