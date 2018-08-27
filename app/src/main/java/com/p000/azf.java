package com.p000;

import p000.azt.C0930a;

@bhd
/* renamed from: azf */
public final class azf extends C0930a {
    /* renamed from: a */
    private final aht f5123a;

    public azf(aht aht) {
        this.f5123a = aht;
    }

    /* renamed from: a */
    public void mo859a() {
        this.f5123a.onAdClosed();
    }

    /* renamed from: a */
    public void mo860a(int i) {
        this.f5123a.onAdFailedToLoad(i);
    }

    /* renamed from: b */
    public void mo861b() {
        this.f5123a.onAdLeftApplication();
    }

    /* renamed from: c */
    public void mo862c() {
        this.f5123a.onAdLoaded();
    }

    /* renamed from: d */
    public void mo863d() {
        this.f5123a.onAdOpened();
    }
}
