package com.p000;

import com.google.android.gms.ads.formats.NativeAdView;

/* renamed from: cdp */
final /* synthetic */ class cdp implements Runnable {
    /* renamed from: a */
    private final NativeAdView f8825a;

    private cdp(NativeAdView nativeAdView) {
        this.f8825a = nativeAdView;
    }

    /* renamed from: a */
    public static Runnable m12684a(NativeAdView nativeAdView) {
        return new cdp(nativeAdView);
    }

    public void run() {
        this.f8825a.m19285a();
    }
}
