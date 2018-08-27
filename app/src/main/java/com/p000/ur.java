package com.p000;

/* renamed from: ur */
class ur implements Runnable {
    /* renamed from: a */
    final /* synthetic */ ty f25643a;
    /* renamed from: b */
    private final yy f25644b;

    public ur(ty tyVar, yy yyVar) {
        this.f25643a = tyVar;
        this.f25644b = yyVar;
    }

    public void run() {
        za g = this.f25643a.f25594v;
        if (g != null && this.f25644b != null) {
            try {
                g.mo5526a(this.f25644b);
            } catch (Throwable th) {
                this.f25643a.f25576d.mo5611c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }
}
