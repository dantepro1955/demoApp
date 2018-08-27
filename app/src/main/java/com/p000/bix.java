package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzec;
import p000.biy.C1248a;
import p000.bjt.C1254a;

@bhd
/* renamed from: bix */
public class bix extends bkb implements biz, bjc {
    /* renamed from: a */
    private final C1254a f6477a;
    /* renamed from: b */
    private final Context f6478b;
    /* renamed from: c */
    private final bje f6479c;
    /* renamed from: d */
    private final bjc f6480d;
    /* renamed from: e */
    private final Object f6481e;
    /* renamed from: f */
    private final String f6482f;
    /* renamed from: g */
    private final String f6483g;
    /* renamed from: h */
    private final bem f6484h;
    /* renamed from: i */
    private final long f6485i;
    /* renamed from: j */
    private int f6486j = 0;
    /* renamed from: k */
    private int f6487k = 3;
    /* renamed from: l */
    private biy f6488l;

    public bix(Context context, String str, String str2, bem bem, C1254a c1254a, bje bje, bjc bjc, long j) {
        this.f6478b = context;
        this.f6482f = str;
        this.f6483g = str2;
        this.f6484h = bem;
        this.f6477a = c1254a;
        this.f6479c = bje;
        this.f6481e = new Object();
        this.f6480d = bjc;
        this.f6485i = j;
    }

    /* renamed from: a */
    private void m8770a(zzec zzec, bey bey) {
        this.f6479c.m8841b().m8819a((bjc) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.f6482f)) {
                bey.mo1064a(zzec, this.f6483g, this.f6484h.f5822a);
            } else {
                bey.mo1063a(zzec, this.f6483g);
            }
        } catch (Throwable e) {
            bky.m9009c("Fail to load ad from adapter.", e);
            mo1227a(this.f6482f, 0);
        }
    }

    /* renamed from: b */
    private void m8772b(long j) {
        while (true) {
            synchronized (this.f6481e) {
                if (this.f6486j != 0) {
                    break;
                } else if (!m8778a(j)) {
                    this.f6488l = new C1248a().m8787a(this.f6487k).m8788a(ako.m2349k().mo607b() - j).m8789a(this.f6482f).m8791b(this.f6484h.f5825d).m8790a();
                    return;
                }
            }
        }
        this.f6488l = new C1248a().m8788a(ako.m2349k().mo607b() - j).m8787a(1 == this.f6486j ? 6 : this.f6487k).m8789a(this.f6482f).m8791b(this.f6484h.f5825d).m8790a();
    }

    /* renamed from: a */
    public void mo196a() {
        if (this.f6479c != null && this.f6479c.m8841b() != null && this.f6479c.m8840a() != null) {
            final bjb b = this.f6479c.m8841b();
            b.m8819a(null);
            b.m8818a((biz) this);
            final zzec zzec = this.f6477a.f6529a.f15034c;
            final bey a = this.f6479c.m8840a();
            try {
                if (a.mo1070g()) {
                    bkx.f6798a.post(new Runnable(this) {
                        /* renamed from: c */
                        final /* synthetic */ bix f6472c;

                        public void run() {
                            this.f6472c.m8770a(zzec, a);
                        }
                    });
                } else {
                    bkx.f6798a.post(new Runnable(this) {
                        /* renamed from: d */
                        final /* synthetic */ bix f6476d;

                        public void run() {
                            try {
                                a.mo1058a(aqr.m4967a(this.f6476d.f6478b), zzec, null, b, this.f6476d.f6483g);
                            } catch (Throwable e) {
                                Throwable th = e;
                                String str = "Fail to initialize adapter ";
                                String valueOf = String.valueOf(this.f6476d.f6482f);
                                bky.m9009c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), th);
                                this.f6476d.mo1227a(this.f6476d.f6482f, 0);
                            }
                        }
                    });
                }
            } catch (Throwable e) {
                bky.m9009c("Fail to check if adapter is initialized.", e);
                mo1227a(this.f6482f, 0);
            }
            m8772b(ako.m2349k().mo607b());
            b.m8819a(null);
            b.m8818a(null);
            if (this.f6486j == 1) {
                this.f6480d.mo1226a(this.f6482f);
            } else {
                this.f6480d.mo1227a(this.f6482f, this.f6487k);
            }
        }
    }

    /* renamed from: a */
    public void mo1225a(int i) {
        mo1227a(this.f6482f, 0);
    }

    /* renamed from: a */
    public void mo1226a(String str) {
        synchronized (this.f6481e) {
            this.f6486j = 1;
            this.f6481e.notify();
        }
    }

    /* renamed from: a */
    public void mo1227a(String str, int i) {
        synchronized (this.f6481e) {
            this.f6486j = 2;
            this.f6487k = i;
            this.f6481e.notify();
        }
    }

    /* renamed from: a */
    protected boolean m8778a(long j) {
        long b = this.f6485i - (ako.m2349k().mo607b() - j);
        if (b <= 0) {
            this.f6487k = 4;
            return false;
        }
        try {
            this.f6481e.wait(b);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f6487k = 5;
            return false;
        }
    }

    /* renamed from: b */
    public void mo197b() {
    }

    /* renamed from: e */
    public biy m8780e() {
        biy biy;
        synchronized (this.f6481e) {
            biy = this.f6488l;
        }
        return biy;
    }

    /* renamed from: f */
    public bem m8781f() {
        return this.f6484h;
    }

    /* renamed from: g */
    public void mo1228g() {
        m8770a(this.f6477a.f6529a.f15034c, this.f6479c.m8840a());
    }
}
