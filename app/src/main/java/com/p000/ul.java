package com.p000;

/* renamed from: ul */
class ul implements Runnable {
    /* renamed from: a */
    final /* synthetic */ int f25635a;
    /* renamed from: b */
    final /* synthetic */ ty f25636b;

    ul(ty tyVar, int i) {
        this.f25636b = tyVar;
        this.f25635a = i;
    }

    public void run() {
        try {
            if (this.f25636b.f25593u != null) {
                this.f25636b.f25593u.mo5548a(this.f25635a);
            }
        } catch (Throwable th) {
            this.f25636b.f25576d.mo5611c("AppLovinAdView", "Exception while running app load  callback", th);
        }
    }
}
