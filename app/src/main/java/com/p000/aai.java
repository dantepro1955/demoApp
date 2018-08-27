package com.p000;

import io.fabric.sdk.android.services.concurrency.internal.RetryState;

/* compiled from: RetryManager */
/* renamed from: aai */
class aai {
    /* renamed from: a */
    long f73a;
    /* renamed from: b */
    private RetryState f74b;

    public aai(RetryState retryState) {
        if (retryState == null) {
            throw new NullPointerException("retryState must not be null");
        }
        this.f74b = retryState;
    }

    /* renamed from: a */
    public boolean m81a(long j) {
        return j - this.f73a >= 1000000 * this.f74b.b();
    }

    /* renamed from: b */
    public void m82b(long j) {
        this.f73a = j;
        this.f74b = this.f74b.e();
    }

    /* renamed from: a */
    public void m80a() {
        this.f73a = 0;
        this.f74b = this.f74b.f();
    }
}
