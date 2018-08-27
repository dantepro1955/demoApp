package com.p000;

/* compiled from: ANRWatchDog */
/* renamed from: cri$3 */
class cri$3 implements Runnable {
    /* renamed from: a */
    final /* synthetic */ cri f20002a;

    cri$3(cri cri) {
        this.f20002a = cri;
    }

    public void run() {
        cri.a(this.f20002a, (cri.a(this.f20002a) + 1) % 10);
    }
}
