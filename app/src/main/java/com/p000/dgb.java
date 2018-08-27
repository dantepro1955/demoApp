package com.p000;

/* compiled from: MorpheusNotifController */
/* renamed from: dgb */
public class dgb {
    /* renamed from: a */
    private dga f21542a;
    /* renamed from: b */
    private int f21543b = -1;

    /* compiled from: MorpheusNotifController */
    /* renamed from: dgb$1 */
    class C48851 extends Thread {
        /* renamed from: a */
        final /* synthetic */ dgb f21540a;

        C48851(dgb dgb) {
            this.f21540a = dgb;
        }

        public void run() {
            dgd.m27158b(this.f21540a.f21542a);
            dhe.m27280a().m27269c(new dge(0, this.f21540a.f21542a));
        }
    }

    /* compiled from: MorpheusNotifController */
    /* renamed from: dgb$2 */
    class C48862 extends Thread {
        /* renamed from: a */
        final /* synthetic */ dgb f21541a;

        C48862(dgb dgb) {
            this.f21541a = dgb;
        }

        public void run() {
            this.f21541a.f21543b = dgd.m27157a(this.f21541a.f21542a);
            dhe.m27280a().m27269c(new dge(this.f21541a.f21543b, this.f21541a.f21542a));
        }
    }

    public dgb(dga dga) {
        this.f21542a = dga;
    }

    /* renamed from: a */
    public void m27154a() {
        new C48851(this).start();
    }

    /* renamed from: b */
    public void m27155b() {
        new C48862(this).start();
    }

    /* renamed from: c */
    public int m27156c() {
        if (this.f21543b != -1) {
            return this.f21543b;
        }
        m27155b();
        return 0;
    }
}
