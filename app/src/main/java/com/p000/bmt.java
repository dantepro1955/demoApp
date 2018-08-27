package com.p000;

/* renamed from: bmt */
public class bmt extends Exception {
    /* renamed from: a */
    public final bdv f4013a;
    /* renamed from: b */
    private long f4014b;

    public bmt() {
        this.f4013a = null;
    }

    public bmt(bdv bdv) {
        this.f4013a = bdv;
    }

    public bmt(Throwable th) {
        super(th);
        this.f4013a = null;
    }

    /* renamed from: a */
    void m5063a(long j) {
        this.f4014b = j;
    }
}
