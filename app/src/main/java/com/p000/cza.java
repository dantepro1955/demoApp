package com.p000;

import java.util.List;
import p000.cyl.C3615a;

/* renamed from: cza */
final class cza extends cyy<cym> implements cyl {
    /* renamed from: b */
    private C3615a f20732b;
    /* renamed from: c */
    private boolean f20733c;

    public cza(czv czv, C3615a c3615a, Object obj) {
        super(czv, czv.m25910j(), obj);
        synchronized (this.a) {
            this.f20732b = c3615a;
        }
        this.f20733c = false;
        m25725b();
    }

    /* renamed from: a */
    protected final cyv<cym> mo4241a(drl drl, String str, List<dtj> list) {
        return new cyz(this, drl, str, list) {
            /* renamed from: a */
            final /* synthetic */ cza f20731a;

            /* renamed from: a */
            protected final void mo4239a(final cys cys) {
                this.f20731a.a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C46831 f20728b;

                    public final void run() {
                        if (this.f20728b.f20731a.f20732b != null) {
                            this.f20728b.f20731a.f20732b.onError(this.f20728b.f20731a, cys);
                        }
                    }
                });
            }

            /* renamed from: a */
            protected final /* synthetic */ void mo4240a(Object obj) {
                final cym cym = (cym) obj;
                this.f20731a.a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C46831 f20730b;

                    public final void run() {
                        if (this.f20730b.f20731a.f20732b != null) {
                            this.f20730b.f20731a.f20732b.onResults(this.f20730b.f20731a, cym);
                        }
                    }
                });
            }
        };
    }

    /* renamed from: a */
    public final void mo4242a() {
        if (this.f20733c) {
            super.mo4242a();
        }
    }

    /* renamed from: c */
    final void m25741c() {
        this.f20733c = true;
    }
}
