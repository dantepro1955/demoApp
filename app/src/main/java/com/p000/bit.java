package com.p000;

import p000.biq.C1077a;

@bhd
/* renamed from: bit */
public class bit extends C1077a {
    /* renamed from: a */
    private final aku f6469a;

    public bit(aku aku) {
        this.f6469a = aku;
    }

    /* renamed from: a */
    public void mo1009a() {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoAdLoaded();
        }
    }

    /* renamed from: a */
    public void mo1010a(int i) {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoAdFailedToLoad(i);
        }
    }

    /* renamed from: a */
    public void mo1011a(bin bin) {
        if (this.f6469a != null) {
            this.f6469a.onRewarded(new bir(bin));
        }
    }

    /* renamed from: b */
    public void mo1012b() {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoAdOpened();
        }
    }

    /* renamed from: c */
    public void mo1013c() {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoStarted();
        }
    }

    /* renamed from: d */
    public void mo1014d() {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoAdClosed();
        }
    }

    /* renamed from: e */
    public void mo1015e() {
        if (this.f6469a != null) {
            this.f6469a.onRewardedVideoAdLeftApplication();
        }
    }
}
