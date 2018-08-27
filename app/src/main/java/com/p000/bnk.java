package com.p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: bnk */
abstract class bnk {
    /* renamed from: b */
    private static volatile Handler f7050b;
    /* renamed from: a */
    private final bmw f7051a;
    /* renamed from: c */
    private final Runnable f7052c = new C13561(this);
    /* renamed from: d */
    private volatile long f7053d;

    /* renamed from: bnk$1 */
    class C13561 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bnk f7108a;

        C13561(bnk bnk) {
            this.f7108a = bnk;
        }

        public void run() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f7108a.f7051a.m9773h().m2515a((Runnable) this);
                return;
            }
            boolean c = this.f7108a.m9819c();
            this.f7108a.f7053d = 0;
            if (c) {
                this.f7108a.mo1350a();
            }
        }
    }

    bnk(bmw bmw) {
        aoi.m4679a((Object) bmw);
        this.f7051a = bmw;
    }

    /* renamed from: e */
    private Handler m9814e() {
        if (f7050b != null) {
            return f7050b;
        }
        Handler handler;
        synchronized (bnk.class) {
            if (f7050b == null) {
                f7050b = new Handler(this.f7051a.m9767b().getMainLooper());
            }
            handler = f7050b;
        }
        return handler;
    }

    /* renamed from: a */
    public abstract void mo1350a();

    /* renamed from: a */
    public void m9816a(long j) {
        m9820d();
        if (j >= 0) {
            this.f7053d = this.f7051a.m9769d().mo606a();
            if (!m9814e().postDelayed(this.f7052c, j)) {
                this.f7051a.m9771f().zze("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: b */
    public long m9817b() {
        return this.f7053d == 0 ? 0 : Math.abs(this.f7051a.m9769d().mo606a() - this.f7053d);
    }

    /* renamed from: b */
    public void m9818b(long j) {
        long j2 = 0;
        if (!m9819c()) {
            return;
        }
        if (j < 0) {
            m9820d();
            return;
        }
        long abs = j - Math.abs(this.f7051a.m9769d().mo606a() - this.f7053d);
        if (abs >= 0) {
            j2 = abs;
        }
        m9814e().removeCallbacks(this.f7052c);
        if (!m9814e().postDelayed(this.f7052c, j2)) {
            this.f7051a.m9771f().zze("Failed to adjust delayed post. time", Long.valueOf(j2));
        }
    }

    /* renamed from: c */
    public boolean m9819c() {
        return this.f7053d != 0;
    }

    /* renamed from: d */
    public void m9820d() {
        this.f7053d = 0;
        m9814e().removeCallbacks(this.f7052c);
    }
}
