package com.p000;

import java.util.Vector;
import p000.dnm.C5007a;
import p000.rh.C5006j;

/* renamed from: drh */
public abstract class drh implements dre {
    /* renamed from: a */
    protected drg f22675a;
    /* renamed from: b */
    protected final String f22676b;
    /* renamed from: c */
    protected final dot f22677c;
    /* renamed from: d */
    protected final drj f22678d;
    /* renamed from: e */
    private drf f22679e;
    /* renamed from: f */
    private dpv f22680f;
    /* renamed from: g */
    private dpu f22681g;
    /* renamed from: h */
    private final doy f22682h;
    /* renamed from: i */
    private final dpx f22683i;

    /* renamed from: drh$1 */
    class C50471 implements doy {
        /* renamed from: a */
        final /* synthetic */ drh f22664a;

        /* renamed from: drh$1$2 */
        class C50462 implements Runnable {
            /* renamed from: a */
            private /* synthetic */ C50471 f22663a;

            C50462(C50471 c50471) {
                this.f22663a = c50471;
            }

            public final void run() {
                this.f22663a.f22664a.f22675a.mo4680d();
            }
        }

        C50471(drh drh) {
            this.f22664a = drh;
        }

        /* renamed from: a */
        public final void mo4557a() {
            czl.m25831c(this.f22664a, "PDX Create Command Failed");
            qu.m33922a(new C50462(this));
        }

        /* renamed from: a */
        public final void mo4558a(final String str) {
            qu.m33922a(new Runnable(this) {
                /* renamed from: b */
                private /* synthetic */ C50471 f22662b;

                public final void run() {
                    drg drg = this.f22662b.f22664a.f22675a;
                    String str = str;
                }
            });
        }
    }

    /* renamed from: drh$2 */
    class C50522 implements dpx {
        /* renamed from: a */
        final /* synthetic */ drh f22674a;

        C50522(drh drh) {
            this.f22674a = drh;
        }

        /* renamed from: a */
        public final void mo4559a(final dni dni) {
            czl.m25828a(this.f22674a, "PDX Query Result Returned");
            qu.m33922a(new Runnable(this) {
                /* renamed from: b */
                private /* synthetic */ C50522 f22670b;

                public final void run() {
                    this.f22670b.f22674a.f22675a.mo4677a(dni);
                }
            });
        }

        /* renamed from: a */
        public final void mo4560a(final dpy dpy) {
            czl.m25828a(this.f22674a, "PDX Query Error Returned: " + dpy.mo4539g() + "(" + dpy.mo4540h() + ")");
            qu.m33922a(new Runnable(this) {
                /* renamed from: b */
                private /* synthetic */ C50522 f22668b;

                public final void run() {
                    drg drg = this.f22668b.f22674a.f22675a;
                    dpy.mo4539g();
                    drg.mo4678a(dpy.mo4540h());
                }
            });
        }

        /* renamed from: a */
        public final void mo4561a(dpz dpz) {
            czl.m25828a(this.f22674a, "PDX Query Retry Returned: " + dpz.mo4542h() + "(" + dpz.mo4541g() + ")");
            final String i = dpz.mo4543i();
            final String g = dpz.mo4541g();
            qu.m33922a(new Runnable(this) {
                /* renamed from: c */
                private /* synthetic */ C50522 f22673c;

                public final void run() {
                    drg drg = this.f22673c.f22674a.f22675a;
                    String str = i;
                    String str2 = g;
                    drg.mo4679b(str);
                }
            });
        }

        /* renamed from: a */
        public final void mo4562a(final short s) {
            switch (s) {
                case (short) 1:
                case (short) 3:
                    czl.m25828a(this.f22674a, "PDX Command Event: " + s);
                    qu.m33922a(new Runnable(this) {
                        /* renamed from: b */
                        private /* synthetic */ C50522 f22666b;

                        public final void run() {
                            drg drg = this.f22666b.f22674a.f22675a;
                            short s = s;
                            drg.mo4681e();
                        }
                    });
                    return;
                default:
                    return;
            }
        }
    }

    public drh(dot dot, drj drj, drf drf) {
        this(dot, drj, drj.m28858j(), drf);
    }

    public drh(dot dot, drj drj, String str, drf drf) {
        this.f22679e = drf;
        this.f22677c = dot;
        this.f22678d = drj;
        if (str == null) {
            str = drj.m28858j();
        }
        this.f22676b = str;
        this.f22682h = new C50471(this);
        this.f22683i = new C50522(this);
        this.f22680f = null;
        this.f22681g = null;
    }

    /* renamed from: a */
    private void m28816a(C5006j c5006j) throws drk {
        try {
            this.f22681g.mo4545a(c5006j);
        } catch (Throwable e) {
            throw new drk("Error sending parameter (TransactionAlreadyFinishedException)", e);
        } catch (Throwable e2) {
            throw new drk("Error sending parameter (TransactionExpiredException)", e2);
        }
    }

    /* renamed from: a */
    public final void mo4475a() {
        this.f22675a.mo4675g();
    }

    /* renamed from: a */
    protected void mo4633a(dni dni) {
    }

    /* renamed from: a */
    public final void m28819a(drg drg) {
        this.f22675a.mo4940k();
        this.f22675a = drg;
        this.f22675a.mo4550h();
    }

    /* renamed from: a */
    public final void m28820a(String str) throws dox {
        if (this.f22680f != null) {
            dni u = m28833u();
            String i = this.f22678d.m28857i();
            String k = this.f22678d.m28859k();
            String l = this.f22678d.m28860l();
            String m = this.f22678d.m28861m();
            String o = this.f22678d.m28862o();
            drj drj = this.f22678d;
            String q = drj.m28847q();
            drj drj2 = this.f22678d;
            String n = drj.m28846n();
            String b = this.f22678d.m28850b();
            String g = this.f22678d.m28855g();
            u.mo4459b("ui_language", this.f22676b.substring(0, 2).toLowerCase());
            u.mo4459b("phone_submodel", k);
            u.mo4459b("phone_OS", l);
            u.mo4459b("locale", m);
            u.mo4459b("nmdp_version", n);
            u.mo4459b("nmaid", b);
            u.mo4459b("network_type", o);
            if (g != null) {
                u.mo4459b("subscription_id", g);
            }
            byte[] bArr = new byte[100];
            try {
                bArr = this.f22678d.m28849a(bArr);
            } catch (Throwable th) {
            }
            u.mo4456a("app_transaction_id", bArr);
            mo4633a(u);
            this.f22681g = this.f22680f.mo4528a(this.f22683i, str, q, this.f22676b, i, k, u);
        }
    }

    /* renamed from: a */
    public final void m28821a(String str, dni dni) throws drk {
        m28816a(this.f22680f.mo4529a(str, dni));
    }

    /* renamed from: a */
    public final void m28822a(String str, String str2) throws drk {
        m28816a(this.f22680f.mo4531a(str, str2));
    }

    /* renamed from: a */
    public final void m28823a(String str, String str2, dnk dnk) throws drk {
        dni u = m28833u();
        u.mo4459b("tts_input", str2);
        u.mo4459b("tts_type", str);
        m28816a(this.f22680f.mo4530a("TEXT_TO_READ", u, dnk));
    }

    /* renamed from: b */
    public final dnk m28824b(String str) throws drk {
        C5006j a = this.f22680f.mo4527a(str);
        m28816a(a);
        return a;
    }

    /* renamed from: b */
    public final void m28825b(String str, dni dni) throws drk {
        m28816a(this.f22680f.mo4534d(str, dni));
    }

    /* renamed from: c */
    public final void m28826c(String str, dni dni) throws drk {
        m28816a(this.f22680f.mo4532b(str, dni));
    }

    /* renamed from: d */
    public final void m28827d(String str, dni dni) throws drk {
        m28816a(this.f22680f.mo4533c(str, dni));
    }

    /* renamed from: p */
    public final void mo4563p() {
        this.f22675a.mo4682i();
    }

    /* renamed from: q */
    public final drf m28829q() {
        return this.f22679e;
    }

    /* renamed from: r */
    public final void m28830r() {
        Vector vector = new Vector();
        vector.add(new dnm("Android_Context", this.f22678d.m28848a(), C5007a.f22310a));
        dot dot = this.f22677c;
        doy doy = this.f22682h;
        this.f22678d.m28850b();
        this.f22680f = dpw.m28681a(dot, doy, vector);
    }

    /* renamed from: s */
    public final void m28831s() {
        if (this.f22680f != null) {
            try {
                this.f22680f.mo4514a();
            } catch (dox e) {
            }
            this.f22680f = null;
        }
    }

    /* renamed from: t */
    public final void m28832t() throws drk {
        try {
            this.f22681g.mo4544a();
        } catch (Throwable e) {
            throw new drk("Error ending PDX command (TransactionAlreadyFinishedException)", e);
        } catch (Throwable e2) {
            throw new drk("Error ending PDX command (TransactionExpiredException)", e2);
        }
    }

    /* renamed from: u */
    public final dni m28833u() {
        return this.f22680f.mo4536j();
    }

    /* renamed from: v */
    public final dnj m28834v() {
        return this.f22680f.mo4537k();
    }
}
