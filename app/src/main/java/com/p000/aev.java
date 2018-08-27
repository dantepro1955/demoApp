package com.p000;

import p000.aex.C0139a;

/* compiled from: ConstantBitrateSeeker */
/* renamed from: aev */
final class aev implements C0139a {
    /* renamed from: a */
    private final long f905a;
    /* renamed from: b */
    private final int f906b;
    /* renamed from: c */
    private final long f907c;

    public aev(long j, int i, long j2) {
        long j3 = -1;
        this.f905a = j;
        this.f906b = i;
        if (j2 != -1) {
            j3 = mo157a(j2);
        }
        this.f907c = j3;
    }

    /* renamed from: a */
    public boolean mo110a() {
        return this.f907c != -1;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        return this.f907c == -1 ? 0 : this.f905a + ((((long) this.f906b) * j) / 8000000);
    }

    /* renamed from: a */
    public long mo157a(long j) {
        return ((Math.max(0, j - this.f905a) * 1000000) * 8) / ((long) this.f906b);
    }

    /* renamed from: b */
    public long mo158b() {
        return this.f907c;
    }
}
