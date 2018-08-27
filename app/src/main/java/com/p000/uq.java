package com.p000;

/* renamed from: uq */
class uq implements Runnable {
    /* renamed from: a */
    final /* synthetic */ ty f25641a;
    /* renamed from: b */
    private final yy f25642b;

    public uq(ty tyVar, yy yyVar) {
        this.f25641a = tyVar;
        this.f25642b = yyVar;
    }

    public void run() {
        yz h = this.f25641a.f25596x;
        if (h != null && this.f25642b != null) {
            try {
                h.mo5528a(this.f25642b);
            } catch (Throwable th) {
                this.f25641a.f25576d.mo5611c("AppLovinAdView", "Exception while notifying ad click listener", th);
            }
        }
    }
}
