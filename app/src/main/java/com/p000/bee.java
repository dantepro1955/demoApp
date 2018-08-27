package com.p000;

import android.content.Context;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import p000.beb.C1084a;
import p000.blh.C0242c;
import p000.blh.C0892a;
import p000.blh.C1318b;

@bhd
/* renamed from: bee */
public class bee {
    /* renamed from: a */
    private final Object f5811a;
    /* renamed from: b */
    private final Context f5812b;
    /* renamed from: c */
    private final String f5813c;
    /* renamed from: d */
    private final zzqh f5814d;
    /* renamed from: e */
    private bkl<beb> f5815e;
    /* renamed from: f */
    private bkl<beb> f5816f;
    /* renamed from: g */
    private C1114d f5817g;
    /* renamed from: h */
    private int f5818h;

    /* renamed from: bee$a */
    static class C1104a {
        /* renamed from: a */
        static int f5790a = 60000;
        /* renamed from: b */
        static int f5791b = 10000;
    }

    /* renamed from: bee$b */
    public static class C1105b<T> implements bkl<T> {
        /* renamed from: a */
        public void mo1031a(T t) {
        }
    }

    /* renamed from: bee$c */
    public static class C1109c extends bli<bef> {
        /* renamed from: d */
        private final Object f5798d = new Object();
        /* renamed from: e */
        private final C1114d f5799e;
        /* renamed from: f */
        private boolean f5800f;

        /* renamed from: bee$c$1 */
        class C11061 implements C0242c<bef> {
            C11061(C1109c c1109c) {
            }

            /* renamed from: a */
            public void m7798a(bef bef) {
                bkc.m9012a("Ending javascript session.");
                ((beg) bef).mo1036a();
            }

            /* renamed from: a */
            public /* synthetic */ void mo289a(Object obj) {
                m7798a((bef) obj);
            }
        }

        /* renamed from: bee$c$2 */
        class C11072 implements C0242c<bef> {
            /* renamed from: a */
            final /* synthetic */ C1109c f5792a;

            C11072(C1109c c1109c) {
                this.f5792a = c1109c;
            }

            /* renamed from: a */
            public void m7800a(bef bef) {
                bkc.m9012a("Releasing engine reference.");
                this.f5792a.f5799e.l_();
            }

            /* renamed from: a */
            public /* synthetic */ void mo289a(Object obj) {
                m7800a((bef) obj);
            }
        }

        /* renamed from: bee$c$3 */
        class C11083 implements C0892a {
            /* renamed from: a */
            final /* synthetic */ C1109c f5793a;

            C11083(C1109c c1109c) {
                this.f5793a = c1109c;
            }

            /* renamed from: a */
            public void mo852a() {
                this.f5793a.f5799e.l_();
            }
        }

        public C1109c(C1114d c1114d) {
            this.f5799e = c1114d;
        }

        public void j_() {
            synchronized (this.f5798d) {
                if (this.f5800f) {
                    return;
                }
                this.f5800f = true;
                mo1032a(new C11061(this), new C1318b());
                mo1032a(new C11072(this), new C11083(this));
            }
        }
    }

    /* renamed from: bee$d */
    public static class C1114d extends bli<beb> {
        /* renamed from: d */
        private final Object f5806d = new Object();
        /* renamed from: e */
        private bkl<beb> f5807e;
        /* renamed from: f */
        private boolean f5808f;
        /* renamed from: g */
        private int f5809g;

        /* renamed from: bee$d$3 */
        class C11133 implements C0242c<beb> {
            /* renamed from: a */
            final /* synthetic */ C1114d f5805a;

            C11133(C1114d c1114d) {
                this.f5805a = c1114d;
            }

            /* renamed from: a */
            public void m7813a(final beb beb) {
                ako.m2343e().m9106a(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C11133 f5804b;

                    public void run() {
                        this.f5804b.f5805a.f5807e.mo1031a(beb);
                        beb.mo1019a();
                    }
                });
            }

            /* renamed from: a */
            public /* synthetic */ void mo289a(Object obj) {
                m7813a((beb) obj);
            }
        }

        public C1114d(bkl<beb> bkl) {
            this.f5807e = bkl;
            this.f5808f = false;
            this.f5809g = 0;
        }

        /* renamed from: c */
        public void m7816c() {
            boolean z = true;
            synchronized (this.f5806d) {
                if (this.f5809g < 0) {
                    z = false;
                }
                aoi.m4684a(z);
                bkc.m9012a("Releasing root reference. JS Engine will be destroyed once other references are released.");
                this.f5808f = true;
                m7817d();
            }
        }

        /* renamed from: d */
        protected void m7817d() {
            synchronized (this.f5806d) {
                aoi.m4684a(this.f5809g >= 0);
                if (this.f5808f && this.f5809g == 0) {
                    bkc.m9012a("No reference is left (including root). Cleaning up engine.");
                    mo1032a(new C11133(this), new C1318b());
                } else {
                    bkc.m9012a("There are still references to the engine. Not destroying.");
                }
            }
        }

        public C1109c k_() {
            final C1109c c1109c = new C1109c(this);
            synchronized (this.f5806d) {
                mo1032a(new C0242c<beb>(this) {
                    /* renamed from: a */
                    public void m7810a(beb beb) {
                        bkc.m9012a("Getting a new session for JS Engine.");
                        c1109c.mo1033a(beb.mo1026b());
                    }

                    /* renamed from: a */
                    public /* synthetic */ void mo289a(Object obj) {
                        m7810a((beb) obj);
                    }
                }, new C0892a(this) {
                    /* renamed from: a */
                    public void mo852a() {
                        bkc.m9012a("Rejecting reference for JS Engine.");
                        c1109c.mo1034a();
                    }
                });
                aoi.m4684a(this.f5809g >= 0);
                this.f5809g++;
            }
            return c1109c;
        }

        protected void l_() {
            boolean z = true;
            synchronized (this.f5806d) {
                if (this.f5809g < 1) {
                    z = false;
                }
                aoi.m4684a(z);
                bkc.m9012a("Releasing 1 reference for JS Engine");
                this.f5809g--;
                m7817d();
            }
        }
    }

    /* renamed from: bee$e */
    public static class C1115e extends bli<bef> {
        /* renamed from: d */
        private C1109c f5810d;

        public C1115e(C1109c c1109c) {
            this.f5810d = c1109c;
        }

        /* renamed from: a */
        public void mo1034a() {
            this.f5810d.mo1034a();
        }

        /* renamed from: a */
        public void m7819a(bef bef) {
            this.f5810d.mo1033a(bef);
        }

        /* renamed from: a */
        public void mo1032a(C0242c<bef> c0242c, C0892a c0892a) {
            this.f5810d.mo1032a(c0242c, c0892a);
        }

        /* renamed from: a */
        public /* synthetic */ void mo1033a(Object obj) {
            m7819a((bef) obj);
        }

        /* renamed from: b */
        public int mo1035b() {
            return this.f5810d.mo1035b();
        }

        public void finalize() {
            this.f5810d.j_();
            this.f5810d = null;
        }
    }

    public bee(Context context, zzqh zzqh, String str) {
        this.f5811a = new Object();
        this.f5818h = 1;
        this.f5813c = str;
        this.f5812b = context.getApplicationContext();
        this.f5814d = zzqh;
        this.f5815e = new C1105b();
        this.f5816f = new C1105b();
    }

    public bee(Context context, zzqh zzqh, String str, bkl<beb> bkl, bkl<beb> bkl2) {
        this(context, zzqh, str);
        this.f5815e = bkl;
        this.f5816f = bkl2;
    }

    /* renamed from: c */
    private C1114d m7827c(final avc avc) {
        final C1114d c1114d = new C1114d(this.f5816f);
        ako.m2343e().m9106a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bee f5785c;

            public void run() {
                final beb a = this.f5785c.m7833a(this.f5785c.f5812b, this.f5785c.f5814d, avc);
                a.mo1021a(new C1084a(this) {
                    /* renamed from: b */
                    final /* synthetic */ C11011 f5774b;

                    /* renamed from: bee$1$1$1 */
                    class C10951 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C10961 f5772a;

                        /* renamed from: bee$1$1$1$1 */
                        class C10941 implements Runnable {
                            /* renamed from: a */
                            final /* synthetic */ C10951 f5771a;

                            C10941(C10951 c10951) {
                                this.f5771a = c10951;
                            }

                            public void run() {
                                a.mo1019a();
                            }
                        }

                        C10951(C10961 c10961) {
                            this.f5772a = c10961;
                        }

                        /* JADX WARNING: inconsistent code. */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void run() {
                            /*
                            r3 = this;
                            r0 = r3.f5772a;
                            r0 = r0.f5774b;
                            r0 = r0.f5785c;
                            r1 = r0.f5811a;
                            monitor-enter(r1);
                            r0 = r3.f5772a;	 Catch:{ all -> 0x0043 }
                            r0 = r0.f5774b;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0 = r0.mo1035b();	 Catch:{ all -> 0x0043 }
                            r2 = -1;
                            if (r0 == r2) goto L_0x0025;
                        L_0x0018:
                            r0 = r3.f5772a;	 Catch:{ all -> 0x0043 }
                            r0 = r0.f5774b;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0 = r0.mo1035b();	 Catch:{ all -> 0x0043 }
                            r2 = 1;
                            if (r0 != r2) goto L_0x0027;
                        L_0x0025:
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                        L_0x0026:
                            return;
                        L_0x0027:
                            r0 = r3.f5772a;	 Catch:{ all -> 0x0043 }
                            r0 = r0.f5774b;	 Catch:{ all -> 0x0043 }
                            r0 = r0;	 Catch:{ all -> 0x0043 }
                            r0.mo1034a();	 Catch:{ all -> 0x0043 }
                            r0 = p000.ako.m2343e();	 Catch:{ all -> 0x0043 }
                            r2 = new bee$1$1$1$1;	 Catch:{ all -> 0x0043 }
                            r2.<init>(r3);	 Catch:{ all -> 0x0043 }
                            r0.m9106a(r2);	 Catch:{ all -> 0x0043 }
                            r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                            p000.bkc.m9012a(r0);	 Catch:{ all -> 0x0043 }
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            goto L_0x0026;
                        L_0x0043:
                            r0 = move-exception;
                            monitor-exit(r1);	 Catch:{ all -> 0x0043 }
                            throw r0;
                            */
                            throw new UnsupportedOperationException("Method not decompiled: bee.1.1.1.run():void");
                        }
                    }

                    /* renamed from: a */
                    public void mo1016a() {
                        bkg.f6710a.postDelayed(new C10951(this), (long) C1104a.f5791b);
                    }
                });
                a.mo1023a("/jsLoaded", new bcy(this) {
                    /* renamed from: b */
                    final /* synthetic */ C11011 f5776b;

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    /* renamed from: a */
                    public void mo277a(p000.blo r4, Map<String, String> r5) {
                        /*
                        r3 = this;
                        r0 = r3.f5776b;
                        r0 = r0.f5785c;
                        r1 = r0.f5811a;
                        monitor-enter(r1);
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.mo1035b();	 Catch:{ all -> 0x0051 }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r0 = r0.mo1035b();	 Catch:{ all -> 0x0051 }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f5785c;	 Catch:{ all -> 0x0051 }
                        r2 = 0;
                        r0.f5818h = r2;	 Catch:{ all -> 0x0051 }
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f5785c;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f5815e;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.mo1031a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.mo1033a(r2);	 Catch:{ all -> 0x0051 }
                        r0 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r0 = r0.f5785c;	 Catch:{ all -> 0x0051 }
                        r2 = r3.f5776b;	 Catch:{ all -> 0x0051 }
                        r2 = r0;	 Catch:{ all -> 0x0051 }
                        r0.f5817g = r2;	 Catch:{ all -> 0x0051 }
                        r0 = "Successfully loaded JS Engine.";
                        p000.bkc.m9012a(r0);	 Catch:{ all -> 0x0051 }
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        goto L_0x0020;
                    L_0x0051:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x0051 }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: bee.1.2.a(blo, java.util.Map):void");
                    }
                });
                final bkt bkt = new bkt();
                bcy c10983 = new bcy(this) {
                    /* renamed from: c */
                    final /* synthetic */ C11011 f5779c;

                    /* renamed from: a */
                    public void mo277a(blo blo, Map<String, String> map) {
                        synchronized (this.f5779c.f5785c.f5811a) {
                            bky.m9010d("JS Engine is requesting an update");
                            if (this.f5779c.f5785c.f5818h == 0) {
                                bky.m9010d("Starting reload.");
                                this.f5779c.f5785c.f5818h = 2;
                                this.f5779c.f5785c.m7835a(avc);
                            }
                            a.mo1028b("/requestReload", (bcy) bkt.m9266a());
                        }
                    }
                };
                bkt.m9267a(c10983);
                a.mo1023a("/requestReload", c10983);
                if (this.f5785c.f5813c.endsWith(".js")) {
                    a.mo1022a(this.f5785c.f5813c);
                } else if (this.f5785c.f5813c.startsWith("<html>")) {
                    a.mo1030c(this.f5785c.f5813c);
                } else {
                    a.mo1027b(this.f5785c.f5813c);
                }
                bkg.f6710a.postDelayed(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C11011 f5782b;

                    /* renamed from: bee$1$4$1 */
                    class C10991 implements Runnable {
                        /* renamed from: a */
                        final /* synthetic */ C11004 f5780a;

                        C10991(C11004 c11004) {
                            this.f5780a = c11004;
                        }

                        public void run() {
                            a.mo1019a();
                        }
                    }

                    /* JADX WARNING: inconsistent code. */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void run() {
                        /*
                        r3 = this;
                        r0 = r3.f5782b;
                        r0 = r0.f5785c;
                        r1 = r0.f5811a;
                        monitor-enter(r1);
                        r0 = r3.f5782b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.mo1035b();	 Catch:{ all -> 0x003b }
                        r2 = -1;
                        if (r0 == r2) goto L_0x001f;
                    L_0x0014:
                        r0 = r3.f5782b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0 = r0.mo1035b();	 Catch:{ all -> 0x003b }
                        r2 = 1;
                        if (r0 != r2) goto L_0x0021;
                    L_0x001f:
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                    L_0x0020:
                        return;
                    L_0x0021:
                        r0 = r3.f5782b;	 Catch:{ all -> 0x003b }
                        r0 = r0;	 Catch:{ all -> 0x003b }
                        r0.mo1034a();	 Catch:{ all -> 0x003b }
                        r0 = p000.ako.m2343e();	 Catch:{ all -> 0x003b }
                        r2 = new bee$1$4$1;	 Catch:{ all -> 0x003b }
                        r2.<init>(r3);	 Catch:{ all -> 0x003b }
                        r0.m9106a(r2);	 Catch:{ all -> 0x003b }
                        r0 = "Could not receive loaded message in a timely manner. Rejecting.";
                        p000.bkc.m9012a(r0);	 Catch:{ all -> 0x003b }
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        goto L_0x0020;
                    L_0x003b:
                        r0 = move-exception;
                        monitor-exit(r1);	 Catch:{ all -> 0x003b }
                        throw r0;
                        */
                        throw new UnsupportedOperationException("Method not decompiled: bee.1.4.run():void");
                    }
                }, (long) C1104a.f5790a);
            }
        });
        return c1114d;
    }

    /* renamed from: a */
    protected beb m7833a(Context context, zzqh zzqh, avc avc) {
        return new bed(context, zzqh, avc, null);
    }

    /* renamed from: a */
    public C1109c m7834a() {
        return m7836b(null);
    }

    /* renamed from: a */
    protected C1114d m7835a(avc avc) {
        final C1114d c = m7827c(avc);
        c.mo1032a(new C0242c<beb>(this) {
            /* renamed from: b */
            final /* synthetic */ bee f5787b;

            /* renamed from: a */
            public void m7793a(beb beb) {
                synchronized (this.f5787b.f5811a) {
                    this.f5787b.f5818h = 0;
                    if (!(this.f5787b.f5817g == null || c == this.f5787b.f5817g)) {
                        bkc.m9012a("New JS engine is loaded, marking previous one as destroyable.");
                        this.f5787b.f5817g.m7816c();
                    }
                    this.f5787b.f5817g = c;
                }
            }

            /* renamed from: a */
            public /* synthetic */ void mo289a(Object obj) {
                m7793a((beb) obj);
            }
        }, new C0892a(this) {
            /* renamed from: b */
            final /* synthetic */ bee f5789b;

            /* renamed from: a */
            public void mo852a() {
                synchronized (this.f5789b.f5811a) {
                    this.f5789b.f5818h = 1;
                    bkc.m9012a("Failed loading new engine. Marking new engine destroyable.");
                    c.m7816c();
                }
            }
        });
        return c;
    }

    /* renamed from: b */
    public C1109c m7836b(avc avc) {
        C1109c k_;
        synchronized (this.f5811a) {
            if (this.f5817g == null || this.f5817g.mo1035b() == -1) {
                this.f5818h = 2;
                this.f5817g = m7835a(avc);
                k_ = this.f5817g.k_();
            } else if (this.f5818h == 0) {
                k_ = this.f5817g.k_();
            } else if (this.f5818h == 1) {
                this.f5818h = 2;
                m7835a(avc);
                k_ = this.f5817g.k_();
            } else if (this.f5818h == 2) {
                k_ = this.f5817g.k_();
            } else {
                k_ = this.f5817g.k_();
            }
        }
        return k_;
    }
}
