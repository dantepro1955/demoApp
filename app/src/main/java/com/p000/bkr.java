package com.p000;

@bhd
/* renamed from: bkr */
public class bkr {
    /* renamed from: a */
    private long f6782a;
    /* renamed from: b */
    private long f6783b = Long.MIN_VALUE;
    /* renamed from: c */
    private Object f6784c = new Object();

    public bkr(long j) {
        this.f6782a = j;
    }

    /* renamed from: a */
    public boolean m9265a() {
        boolean z;
        synchronized (this.f6784c) {
            long b = ako.m2349k().mo607b();
            if (this.f6783b + this.f6782a > b) {
                z = false;
            } else {
                this.f6783b = b;
                z = true;
            }
        }
        return z;
    }
}
