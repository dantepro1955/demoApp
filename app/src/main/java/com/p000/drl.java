package com.p000;

import java.util.List;
import p000.dnm.C5007a;

/* renamed from: drl */
public final class drl {
    /* renamed from: a */
    private dre f22738a;
    /* renamed from: b */
    private dot f22739b;
    /* renamed from: c */
    private sp f22740c = null;
    /* renamed from: d */
    private sq f22741d = null;
    /* renamed from: e */
    private sq f22742e = null;
    /* renamed from: f */
    private rg f22743f;
    /* renamed from: g */
    private rg f22744g;
    /* renamed from: h */
    private final dov f22745h;
    /* renamed from: i */
    private drj f22746i;
    /* renamed from: j */
    private String f22747j;
    /* renamed from: k */
    private boolean f22748k;
    /* renamed from: l */
    private final Object f22749l;

    /* renamed from: drl$2 */
    class C50542 implements dov {
        /* renamed from: a */
        private /* synthetic */ drl f22729a;

        C50542(drl drl) {
            this.f22729a = drl;
        }

        /* renamed from: a */
        public final void mo4564a() {
            czl.m25828a(this.f22729a, "Shutdown Complte");
        }

        /* renamed from: a */
        public final void mo4565a(String str) {
            synchronized (this.f22729a.f22749l) {
                czl.m25828a(this.f22729a, "Connected with session ID " + str);
                this.f22729a.f22747j = str;
            }
        }

        /* renamed from: a */
        public final void mo4566a(short s) {
            czl.m25828a(this.f22729a, "Disconnected reasoncode [" + s + "]");
        }

        /* renamed from: b */
        public final void mo4567b(short s) {
            czl.m25830b(this.f22729a, "Connection failed reasonCode [" + s + "]");
        }
    }

    public drl(drj drj) {
        this.f22746i = drj;
        this.f22738a = null;
        this.f22745h = new C50542(this);
        this.f22747j = null;
        this.f22748k = true;
        this.f22749l = new Object();
        this.f22743f = this.f22746i.m28864r();
        this.f22744g = this.f22746i.m28865s();
        this.f22739b = m28891e();
        if (this.f22739b == null) {
            this.f22748k = false;
            this.f22746i = null;
            return;
        }
        this.f22740c = this.f22739b.mo4507a();
        if (this.f22740c != null) {
            try {
                ss c = this.f22740c.mo5517c("SpeechKit");
                c.mo5523a("Version", "1.6.0.0B06");
                c.mo5523a("DnsAddress", this.f22746i.m28852d());
                this.f22741d = c.mo5521a();
                c = this.f22741d.mo5518a("SpeechKit App");
                c.mo5523a("Version", this.f22746i.m28853e());
                this.f22742e = c.mo5521a();
            } catch (so e) {
                czl.m25830b(this, "Application Session is already open");
            } catch (sr e2) {
                czl.m25830b(this, "Session event already committed");
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m28888a(drl drl) {
        czl.m25830b(drl, "Restarting NMSP manager");
        drl.f22743f = drl.f22746i.m28864r();
        drl.f22744g = drl.f22746i.m28865s();
        drl.f22738a = null;
        drl.f22739b.y_();
        drl.f22739b = drl.m28891e();
        if (drl.f22739b == null) {
            drl.f22746i = null;
            drl.f22748k = false;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m28889a(drl drl, dre dre) {
        if (dre == drl.f22738a) {
            drl.f22738a = null;
        }
    }

    /* renamed from: e */
    private dot m28891e() {
        try {
            short f = (short) this.f22746i.m28854f();
            String d = this.f22746i.m28852d();
            String t = this.f22746i.m28866t();
            boolean h = this.f22746i.m28856h();
            qv qvVar = new qv();
            qvVar.m33930a((Object) new dnm("Android_Context", this.f22746i.m28848a(), C5007a.f22310a));
            if (t != null) {
                qvVar.m33930a((Object) new dnm("SocketConnectionSetting", t.getBytes(), C5007a.f22310a));
            }
            if (h) {
                qvVar.m33930a((Object) new dnm("SSL_Socket_Enable", "TRUE".getBytes(), C5007a.f22310a));
            }
            qvVar.m33930a((Object) new dnm("Calllog_Disable", "TRUE".getBytes(), C5007a.f22310a));
            return dou.m28504a(d, f, this.f22746i.m28850b(), this.f22746i.m28851c(), this.f22746i.m28863p(), this.f22744g, this.f22743f, "calllog.data", qvVar.m33936c(), this.f22745h);
        } catch (Throwable th) {
            czl.m25829a(this, "Unable to create NMSP manager", th);
            return null;
        }
    }

    /* renamed from: f */
    private void m28892f() {
        rg r = this.f22746i.m28864r();
        rg s = this.f22746i.m28865s();
        if (this.f22743f != r || this.f22744g != s) {
            czl.m25830b(this, "Supported codecs changed, restarting NMSP manager");
            this.f22738a = null;
            this.f22743f = r;
            this.f22744g = s;
            this.f22739b.y_();
            this.f22739b = m28891e();
            if (this.f22739b == null) {
                this.f22746i = null;
                this.f22748k = false;
            }
        }
    }

    /* renamed from: a */
    public final dre m28893a(final drf drf) {
        if (!this.f22748k || this.f22738a != null) {
            return null;
        }
        m28892f();
        dre dza = new dza(this.f22739b, this.f22746i, new drf(this) {
            /* renamed from: b */
            private /* synthetic */ drl f22737b;

            /* renamed from: a */
            public final void mo4233a(dre dre) {
                drl.m28889a(this.f22737b, dre);
                drf.mo4233a(dre);
            }

            /* renamed from: a */
            public final void mo4234a(dre dre, int i, String str, String str2) {
                drf.mo4234a(dre, i, str, str2);
                if (i == 1) {
                    drl.m28888a(this.f22737b);
                }
            }
        });
        this.f22738a = dza;
        return dza;
    }

    /* renamed from: a */
    public final dre m28894a(String str, String str2, String str3, boolean z, final qn qnVar) {
        if (!this.f22748k) {
            return null;
        }
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
        }
        m28892f();
        dot dot = this.f22739b;
        drj drj = this.f22746i;
        rg rgVar = this.f22743f;
        dre qrVar = new qr(dot, drj, str, str2, str3, z, new qn(this) {
            /* renamed from: b */
            private /* synthetic */ drl f22735b;

            /* renamed from: a */
            public final void mo4233a(dre dre) {
                drl.m28889a(this.f22735b, dre);
                qnVar.mo4233a(dre);
            }

            /* renamed from: a */
            public final void mo4234a(dre dre, int i, String str, String str2) {
                qnVar.mo4234a(dre, i, str, str2);
                if (i == 1) {
                    drl.m28888a(this.f22735b);
                }
            }

            public final void b_(dre dre) {
                qnVar.b_(dre);
            }
        });
        this.f22738a = qrVar;
        return qrVar;
    }

    /* renamed from: a */
    public final dre m28895a(String str, List<dtj> list, rd<?> rdVar, final drf drf) {
        if (!this.f22748k) {
            return null;
        }
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
        }
        m28892f();
        dre dti = new dti(this.f22739b, this.f22746i, str, list, rdVar, new drf(this) {
            /* renamed from: b */
            private /* synthetic */ drl f22731b;

            /* renamed from: a */
            public final void mo4233a(dre dre) {
                drl.m28889a(this.f22731b, dre);
                drf.mo4233a(dre);
            }

            /* renamed from: a */
            public final void mo4234a(dre dre, int i, String str, String str2) {
                drf.mo4234a(dre, i, str, str2);
                if (i == 1) {
                    drl.m28888a(this.f22731b);
                }
            }
        });
        this.f22738a = dti;
        return dti;
    }

    /* renamed from: a */
    public final dre m28896a(List<dtj> list, String str, rd<?> rdVar, final drf drf) {
        if (!this.f22748k) {
            return null;
        }
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
        }
        m28892f();
        dre dyz = new dyz(this.f22739b, this.f22746i, list, str, rdVar, new drf(this) {
            /* renamed from: b */
            private /* synthetic */ drl f22733b;

            /* renamed from: a */
            public final void mo4233a(dre dre) {
                drl.m28889a(this.f22733b, dre);
                drf.mo4233a(dre);
            }

            /* renamed from: a */
            public final void mo4234a(dre dre, int i, String str, String str2) {
                drf.mo4234a(dre, i, str, str2);
                if (i == 1) {
                    drl.m28888a(this.f22733b);
                }
            }
        });
        this.f22738a = dyz;
        return dyz;
    }

    /* renamed from: a */
    public final dze m28897a(String str, boolean z, boolean z2, String str2, qy qyVar, qy qyVar2, qy qyVar3, qy qyVar4, rd<?> rdVar, C4697d c4697d, C0951b c0951b) {
        if (!this.f22748k) {
            return null;
        }
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
        }
        m28892f();
        final C0951b c0951b2 = c0951b;
        Object c5525m = new C5525m(this.f22739b, this.f22746i, str, z, z2, str2, null, qyVar, qyVar2, qyVar3, qyVar4, rdVar, c4697d, new C0951b(this) {
            /* renamed from: b */
            private /* synthetic */ drl f22728b;

            /* renamed from: a */
            public final void m28871a(dre dre) {
                drl.m28889a(this.f22728b, dre);
                c0951b2.a(dre);
            }

            /* renamed from: a */
            public final void m28872a(dre dre, int i, String str, String str2) {
                c0951b2.a(dre, i, str, str2);
                if (i == 1) {
                    drl.m28888a(this.f22728b);
                }
            }

            public final void a_(dre dre) {
                c0951b2.a_(dre);
            }

            /* renamed from: b */
            public final void m28873b(dre dre) {
                c0951b2.b(dre);
            }

            /* renamed from: c */
            public final void m28874c(dre dre) {
                c0951b2.c(dre);
            }
        });
        this.f22738a = c5525m;
        return c5525m;
    }

    /* renamed from: a */
    public final void m28898a() {
        this.f22748k = false;
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
            this.f22738a = null;
        }
        if (this.f22739b != null) {
            this.f22739b.y_();
            this.f22739b = null;
        }
        this.f22746i = null;
    }

    /* renamed from: b */
    public final boolean m28899b() {
        return this.f22748k;
    }

    /* renamed from: c */
    public final String m28900c() {
        String str;
        synchronized (this.f22749l) {
            str = this.f22747j;
        }
        return str;
    }

    /* renamed from: d */
    public final void m28901d() {
        if (this.f22738a != null) {
            this.f22738a.mo4563p();
            this.f22738a = null;
        }
    }
}
