package com.p000;

import p000.cyr.C3620a;

/* renamed from: czj */
final class czj extends czn<cyq> implements cyr {
    /* renamed from: b */
    private C3620a f20786b;

    public czj(czv czv, String str, int i, String str2, C3620a c3620a, Object obj) {
        super(czv, str, i, str2, null, obj);
        synchronized (this.a) {
            this.f20786b = c3620a;
        }
        m25817e();
    }

    /* renamed from: a */
    protected final czh<cyq> mo4256a(drl drl, String str, boolean z, boolean z2, String str2, String str3, C4697d c4697d) {
        return new czi(this, drl, str, z, z2, str2, c4697d) {
            /* renamed from: a */
            final /* synthetic */ czj f20779a;

            /* renamed from: czj$1$2 */
            class C46922 implements Runnable {
                /* renamed from: a */
                private /* synthetic */ C46951 f20775a;

                C46922(C46951 c46951) {
                    this.f20775a = c46951;
                }

                public final void run() {
                    if (this.f20775a.f20779a.f20786b != null) {
                        this.f20775a.f20779a.f20786b.onRecordingBegin(this.f20775a.f20779a);
                    }
                }
            }

            /* renamed from: czj$1$3 */
            class C46933 implements Runnable {
                /* renamed from: a */
                private /* synthetic */ C46951 f20776a;

                C46933(C46951 c46951) {
                    this.f20776a = c46951;
                }

                public final void run() {
                    if (this.f20776a.f20779a.f20786b != null) {
                        this.f20776a.f20779a.f20786b.onRecordingDone(this.f20776a.f20779a);
                    }
                }
            }

            /* renamed from: a */
            protected final void mo4251a(final cys cys) {
                this.f20779a.a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C46951 f20774b;

                    public final void run() {
                        if (this.f20774b.f20779a.f20786b != null) {
                            this.f20774b.f20779a.f20786b.onError(this.f20774b.f20779a, cys);
                        }
                    }
                });
            }

            /* renamed from: a */
            protected final /* synthetic */ void mo4252a(Object obj) {
                final cyq cyq = (cyq) obj;
                this.f20779a.a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C46951 f20778b;

                    public final void run() {
                        if (this.f20778b.f20779a.f20786b != null) {
                            this.f20778b.f20779a.f20786b.onResults(this.f20778b.f20779a, cyq);
                        }
                    }
                });
            }

            /* renamed from: b */
            protected final void mo4253b() {
                this.f20779a.a(new C46922(this));
            }

            /* renamed from: c */
            protected final void mo4254c() {
                this.f20779a.a(new C46933(this));
            }
        };
    }
}
