package com.p000;

/* renamed from: us */
class us implements Runnable {
    /* renamed from: a */
    final /* synthetic */ ty f25645a;

    private us(ty tyVar) {
        this.f25645a = tyVar;
    }

    public void run() {
        if (this.f25645a.f25585m != null) {
            try {
                tc a = new tz().m34238a(this.f25645a.f25574b, this.f25645a.f25573a);
                a.mo5546a(new un(this.f25645a));
                a.mo5547a(new uo(this.f25645a));
                a.mo5545a(new um(this.f25645a));
                a.mo5544a(this.f25645a.f25585m);
            } catch (Throwable th) {
            }
        }
    }
}
