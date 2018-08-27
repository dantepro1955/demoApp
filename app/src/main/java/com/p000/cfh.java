package com.p000;

/* renamed from: cfh */
final /* synthetic */ class cfh implements Runnable {
    /* renamed from: a */
    private final cfg f9032a;

    private cfh(cfg cfg) {
        this.f9032a = cfg;
    }

    /* renamed from: a */
    public static Runnable m12967a(cfg cfg) {
        return new cfh(cfg);
    }

    public void run() {
        cfg.m12951a(this.f9032a);
    }
}
