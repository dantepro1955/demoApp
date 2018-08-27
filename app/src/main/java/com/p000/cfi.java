package com.p000;

/* renamed from: cfi */
final /* synthetic */ class cfi implements Runnable {
    /* renamed from: a */
    private final cfg f9033a;

    private cfi(cfg cfg) {
        this.f9033a = cfg;
    }

    /* renamed from: a */
    public static Runnable m12968a(cfg cfg) {
        return new cfi(cfg);
    }

    public void run() {
        this.f9033a.H().setRefreshing(false);
    }
}
