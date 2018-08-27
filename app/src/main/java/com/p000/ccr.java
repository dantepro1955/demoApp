package com.p000;

/* renamed from: ccr */
final /* synthetic */ class ccr implements Runnable {
    /* renamed from: a */
    private final ccp f8747a;
    /* renamed from: b */
    private final cct f8748b;
    /* renamed from: c */
    private final int f8749c;

    private ccr(ccp ccp, cct cct, int i) {
        this.f8747a = ccp;
        this.f8748b = cct;
        this.f8749c = i;
    }

    /* renamed from: a */
    public static Runnable m12568a(ccp ccp, cct cct, int i) {
        return new ccr(ccp, cct, i);
    }

    public void run() {
        ccp.m12406a(this.f8747a, this.f8748b, this.f8749c);
    }
}
