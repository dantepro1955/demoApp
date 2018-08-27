package com.p000;

/* renamed from: brw */
class brw extends brv {
    /* renamed from: a */
    private static final Object f7477a = new Object();
    /* renamed from: k */
    private static brw f7478k;
    /* renamed from: b */
    private bra f7479b;
    /* renamed from: c */
    private volatile bqz f7480c;
    /* renamed from: d */
    private int f7481d = 1800000;
    /* renamed from: e */
    private boolean f7482e = true;
    /* renamed from: f */
    private boolean f7483f = false;
    /* renamed from: g */
    private boolean f7484g = true;
    /* renamed from: h */
    private boolean f7485h = true;
    /* renamed from: i */
    private brb f7486i = new C14331(this);
    /* renamed from: j */
    private boolean f7487j = false;

    /* renamed from: brw$1 */
    class C14331 implements brb {
        /* renamed from: a */
        final /* synthetic */ brw f7475a;

        C14331(brw brw) {
            this.f7475a = brw;
        }
    }

    /* renamed from: brw$2 */
    class C14342 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ brw f7476a;

        C14342(brw brw) {
            this.f7476a = brw;
        }

        public void run() {
            this.f7476a.f7479b.m10488a();
        }
    }

    private brw() {
    }

    /* renamed from: b */
    public static brw m10573b() {
        if (f7478k == null) {
            f7478k = new brw();
        }
        return f7478k;
    }

    /* renamed from: a */
    public synchronized void mo1423a() {
        if (this.f7483f) {
            this.f7480c.m10484a(new C14342(this));
        } else {
            brd.m10498d("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f7482e = true;
        }
    }
}
