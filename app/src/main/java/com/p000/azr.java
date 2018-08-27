package com.p000;

@bhd
/* renamed from: azr */
public class azr extends aht {
    /* renamed from: a */
    private final Object f5188a = new Object();
    /* renamed from: b */
    private aht f5189b;

    /* renamed from: a */
    public void m6796a(aht aht) {
        synchronized (this.f5188a) {
            this.f5189b = aht;
        }
    }

    public void onAdClosed() {
        synchronized (this.f5188a) {
            if (this.f5189b != null) {
                this.f5189b.onAdClosed();
            }
        }
    }

    public void onAdFailedToLoad(int i) {
        synchronized (this.f5188a) {
            if (this.f5189b != null) {
                this.f5189b.onAdFailedToLoad(i);
            }
        }
    }

    public void onAdLeftApplication() {
        synchronized (this.f5188a) {
            if (this.f5189b != null) {
                this.f5189b.onAdLeftApplication();
            }
        }
    }

    public void onAdLoaded() {
        synchronized (this.f5188a) {
            if (this.f5189b != null) {
                this.f5189b.onAdLoaded();
            }
        }
    }

    public void onAdOpened() {
        synchronized (this.f5188a) {
            if (this.f5189b != null) {
                this.f5189b.onAdOpened();
            }
        }
    }
}
