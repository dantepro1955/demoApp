package com.p000;

@bhd
/* renamed from: bdl */
public class bdl extends bkb {
    /* renamed from: a */
    final blo f5651a;
    /* renamed from: b */
    final bdn f5652b;
    /* renamed from: c */
    private final String f5653c;

    /* renamed from: bdl$1 */
    class C10501 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bdl f5650a;

        C10501(bdl bdl) {
            this.f5650a = bdl;
        }

        public void run() {
            ako.m2334B().m7597b(this.f5650a);
        }
    }

    bdl(blo blo, bdn bdn, String str) {
        this.f5651a = blo;
        this.f5652b = bdn;
        this.f5653c = str;
        ako.m2334B().m7595a(this);
    }

    /* renamed from: a */
    public void mo196a() {
        try {
            this.f5652b.mo1005a(this.f5653c);
        } finally {
            bkg.f6710a.post(new C10501(this));
        }
    }

    /* renamed from: b */
    public void mo197b() {
        this.f5652b.mo1006b();
    }
}
