package com.p000;

import android.os.RemoteException;
import java.util.Random;
import p000.azt.C0930a;

@bhd
/* renamed from: bdt */
class bdt {
    /* renamed from: a */
    azt f5698a;
    /* renamed from: b */
    azz f5699b;
    /* renamed from: c */
    bgc f5700c;
    /* renamed from: d */
    bbn f5701d;
    /* renamed from: e */
    azs f5702e;
    /* renamed from: f */
    biq f5703f;

    /* renamed from: bdt$a */
    static class C1081a extends C0930a {
        /* renamed from: a */
        private final azt f5697a;

        /* renamed from: bdt$a$1 */
        class C10801 implements Runnable {
            C10801(C1081a c1081a) {
            }

            public void run() {
                ako.m2358t().m7686a();
            }
        }

        C1081a(azt azt) {
            this.f5697a = azt;
        }

        /* renamed from: a */
        public void mo859a() throws RemoteException {
            bdy a = bdy.m7706a();
            float floatValue = ((Float) bbb.bg.m7064c()).floatValue();
            if (((float) (a.m7713g() + a.m7712f())) <= ((float) a.m7714h()) * floatValue || Float.isNaN(floatValue)) {
                int intValue = ((Integer) bbb.be.m7064c()).intValue();
                int intValue2 = ((Integer) bbb.bf.m7064c()).intValue();
                if (intValue <= 0 || intValue2 < 0) {
                    ako.m2358t().m7686a();
                } else {
                    bkg.f6710a.postDelayed(new C10801(this), (long) (new Random().nextInt(intValue2 + 1) + intValue));
                }
            }
            this.f5697a.mo859a();
        }

        /* renamed from: a */
        public void mo860a(int i) throws RemoteException {
            this.f5697a.mo860a(i);
        }

        /* renamed from: b */
        public void mo861b() throws RemoteException {
            this.f5697a.mo861b();
        }

        /* renamed from: c */
        public void mo862c() throws RemoteException {
            this.f5697a.mo862c();
        }

        /* renamed from: d */
        public void mo863d() throws RemoteException {
            this.f5697a.mo863d();
        }
    }

    bdt() {
    }

    /* renamed from: a */
    void m7672a(akf akf) {
        if (this.f5698a != null) {
            akf.mo227a(new C1081a(this.f5698a));
        }
        if (this.f5699b != null) {
            akf.mo228a(this.f5699b);
        }
        if (this.f5700c != null) {
            akf.mo231a(this.f5700c);
        }
        if (this.f5701d != null) {
            akf.mo230a(this.f5701d);
        }
        if (this.f5702e != null) {
            akf.mo226a(this.f5702e);
        }
        if (this.f5703f != null) {
            akf.mo233a(this.f5703f);
        }
    }
}
