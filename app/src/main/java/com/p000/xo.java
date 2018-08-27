package com.p000;

/* renamed from: xo */
class xo implements Runnable {
    /* renamed from: a */
    final /* synthetic */ xk f25985a;
    /* renamed from: b */
    private final String f25986b;
    /* renamed from: c */
    private final wo f25987c;
    /* renamed from: d */
    private final xl f25988d;

    xo(xk xkVar, wo woVar, xl xlVar) {
        this.f25985a = xkVar;
        this.f25986b = woVar.m34642a();
        this.f25987c = woVar;
        this.f25988d = xlVar;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            yi.m34893a();
            if (this.f25985a.f25973a.m34417v()) {
                this.f25985a.f25974b.mo5608b(this.f25986b, "Task re-scheduled...");
                this.f25985a.m34804a(this.f25987c, this.f25988d, 2000);
            } else if (this.f25985a.f25973a.m34397b()) {
                this.f25985a.f25974b.mo5608b(this.f25986b, "Task started execution...");
                this.f25987c.run();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (this.f25987c instanceof xx) {
                    xx xxVar = (xx) this.f25987c;
                    xu.m34826a().m34828a(xxVar.mo5599e(), currentTimeMillis2, yl.m34913a(this.f25985a.f25973a), xxVar.mo5600f());
                }
                this.f25985a.f25974b.mo5608b(this.f25986b, "Task executed successfully in " + currentTimeMillis2 + "ms.");
                wv m = this.f25985a.f25973a.m34408m();
                m.m34703a(this.f25986b + "_count");
                m.m34704a(this.f25986b + "_time", currentTimeMillis2);
            } else {
                if (this.f25985a.f25973a.m34418w()) {
                    this.f25985a.f25973a.m34419x();
                } else {
                    this.f25985a.f25974b.mo5610c(this.f25986b, "Task not executed, SDK is disabled");
                }
                this.f25987c.mo5598b();
            }
        } catch (Throwable th) {
            this.f25985a.f25974b.mo5609b(this.f25986b, "Task failed execution in " + (System.currentTimeMillis() - currentTimeMillis) + "ms.", th);
        }
    }
}
