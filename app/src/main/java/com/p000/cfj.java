package com.p000;

import p000.cfg.C17072;

/* renamed from: cfj */
final /* synthetic */ class cfj implements Runnable {
    /* renamed from: a */
    private final C17072 f9034a;

    private cfj(C17072 c17072) {
        this.f9034a = c17072;
    }

    /* renamed from: a */
    public static Runnable m12969a(C17072 c17072) {
        return new cfj(c17072);
    }

    public void run() {
        this.f9034a.f9026b.H().setRefreshing(false);
    }
}
