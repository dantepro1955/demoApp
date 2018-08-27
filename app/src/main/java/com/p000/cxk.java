package com.p000;

/* compiled from: FailReason */
/* renamed from: cxk */
public class cxk {
    /* renamed from: a */
    private final C4654a f20600a;
    /* renamed from: b */
    private final Throwable f20601b;

    /* compiled from: FailReason */
    /* renamed from: cxk$a */
    public enum C4654a {
        IO_ERROR,
        DECODING_ERROR,
        NETWORK_DENIED,
        OUT_OF_MEMORY,
        UNKNOWN
    }

    public cxk(C4654a c4654a, Throwable th) {
        this.f20600a = c4654a;
        this.f20601b = th;
    }

    /* renamed from: a */
    public C4654a m25537a() {
        return this.f20600a;
    }
}
