package com.p000;

/* renamed from: ua */
class ua implements Runnable {
    /* renamed from: a */
    final /* synthetic */ yy f25603a;
    /* renamed from: b */
    final /* synthetic */ ty f25604b;

    ua(ty tyVar, yy yyVar) {
        this.f25604b = tyVar;
        this.f25603a = yyVar;
    }

    public void run() {
        try {
            if (this.f25604b.f25593u != null) {
                this.f25604b.f25593u.mo5549a(this.f25603a);
            }
        } catch (Throwable th) {
            this.f25604b.f25576d.mo5613e("AppLovinSdk", "Exception while running app load callback: " + th.getMessage());
        }
    }
}
