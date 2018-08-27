package com.p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.internal.zzmn;
import p000.bgo.C0218a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bgn */
public abstract class bgn extends bkb {
    /* renamed from: a */
    protected final C0218a f6095a;
    /* renamed from: b */
    protected final Context f6096b;
    /* renamed from: c */
    protected final Object f6097c = new Object();
    /* renamed from: d */
    protected final Object f6098d = new Object();
    /* renamed from: e */
    protected final C1254a f6099e;
    /* renamed from: f */
    protected zzmn f6100f;

    /* renamed from: bgn$1 */
    class C11681 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bgn f6091a;

        C11681(bgn bgn) {
            this.f6091a = bgn;
        }

        public void run() {
            this.f6091a.mo197b();
        }
    }

    /* renamed from: bgn$a */
    public static final class C1170a extends Exception {
        /* renamed from: a */
        private final int f6094a;

        public C1170a(String str, int i) {
            super(str);
            this.f6094a = i;
        }

        /* renamed from: a */
        public int m8309a() {
            return this.f6094a;
        }
    }

    protected bgn(Context context, C1254a c1254a, C0218a c0218a) {
        super(true);
        this.f6096b = context;
        this.f6099e = c1254a;
        this.f6100f = c1254a.f6530b;
        this.f6095a = c0218a;
    }

    /* renamed from: a */
    protected abstract bjt mo1179a(int i);

    /* renamed from: a */
    public void mo196a() {
        int a;
        synchronized (this.f6097c) {
            bky.m9006b("AdRendererBackgroundTask started.");
            int i = this.f6099e.f6533e;
            try {
                mo1180a(SystemClock.elapsedRealtime());
            } catch (C1170a e) {
                a = e.m8309a();
                if (a == 3 || a == -1) {
                    bky.m9010d(e.getMessage());
                } else {
                    bky.m9011e(e.getMessage());
                }
                if (this.f6100f == null) {
                    this.f6100f = new zzmn(a);
                } else {
                    this.f6100f = new zzmn(a, this.f6100f.f15085k);
                }
                bkg.f6710a.post(new C11681(this));
                i = a;
            }
            final bjt a2 = mo1179a(i);
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ bgn f6093b;

                public void run() {
                    synchronized (this.f6093b.f6097c) {
                        this.f6093b.m8313a(a2);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    protected abstract void mo1180a(long j) throws C1170a;

    /* renamed from: a */
    protected void m8313a(bjt bjt) {
        this.f6095a.mo243b(bjt);
    }

    /* renamed from: b */
    public void mo197b() {
    }
}
