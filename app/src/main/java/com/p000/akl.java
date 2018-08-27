package com.p000;

import android.os.Handler;
import com.google.android.gms.internal.zzec;
import java.lang.ref.WeakReference;

@bhd
/* renamed from: akl */
public class akl {
    /* renamed from: a */
    private final C0265a f1865a;
    /* renamed from: b */
    private final Runnable f1866b;
    /* renamed from: c */
    private zzec f1867c;
    /* renamed from: d */
    private boolean f1868d;
    /* renamed from: e */
    private boolean f1869e;
    /* renamed from: f */
    private long f1870f;

    /* renamed from: akl$a */
    public static class C0265a {
        /* renamed from: a */
        private final Handler f1864a;

        public C0265a(Handler handler) {
            this.f1864a = handler;
        }

        /* renamed from: a */
        public void m2271a(Runnable runnable) {
            this.f1864a.removeCallbacks(runnable);
        }

        /* renamed from: a */
        public boolean m2272a(Runnable runnable, long j) {
            return this.f1864a.postDelayed(runnable, j);
        }
    }

    public akl(ajt ajt) {
        this(ajt, new C0265a(bkg.f6710a));
    }

    akl(ajt ajt, C0265a c0265a) {
        this.f1868d = false;
        this.f1869e = false;
        this.f1870f = 0;
        this.f1865a = c0265a;
        final WeakReference weakReference = new WeakReference(ajt);
        this.f1866b = new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ akl f1863b;

            public void run() {
                this.f1863b.f1868d = false;
                ajt ajt = (ajt) weakReference.get();
                if (ajt != null) {
                    ajt.m1983c(this.f1863b.f1867c);
                }
            }
        };
    }

    /* renamed from: a */
    public void m2275a() {
        this.f1868d = false;
        this.f1865a.m2271a(this.f1866b);
    }

    /* renamed from: a */
    public void m2276a(zzec zzec) {
        this.f1867c = zzec;
    }

    /* renamed from: a */
    public void m2277a(zzec zzec, long j) {
        if (this.f1868d) {
            bky.m9011e("An ad refresh is already scheduled.");
            return;
        }
        this.f1867c = zzec;
        this.f1868d = true;
        this.f1870f = j;
        if (!this.f1869e) {
            bky.m9010d("Scheduling ad refresh " + j + " milliseconds from now.");
            this.f1865a.m2272a(this.f1866b, j);
        }
    }

    /* renamed from: b */
    public void m2278b() {
        this.f1869e = true;
        if (this.f1868d) {
            this.f1865a.m2271a(this.f1866b);
        }
    }

    /* renamed from: b */
    public void m2279b(zzec zzec) {
        m2277a(zzec, 60000);
    }

    /* renamed from: c */
    public void m2280c() {
        this.f1869e = false;
        if (this.f1868d) {
            this.f1868d = false;
            m2277a(this.f1867c, this.f1870f);
        }
    }

    /* renamed from: d */
    public boolean m2281d() {
        return this.f1868d;
    }
}
