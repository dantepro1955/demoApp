package com.p000;

import java.util.List;
import p000.cyn.C3613a;

/* renamed from: czf */
final class czf extends cyy<cyo> implements cyn {
    /* renamed from: b */
    private C3613a f20749b;
    /* renamed from: c */
    private String f20750c;
    /* renamed from: d */
    private cys f20751d = null;

    czf(czv czv, String str, C3613a c3613a, Object obj) {
        super(czv, czv.m25911k(), obj);
        this.f20750c = str;
        synchronized (this.a) {
            this.f20749b = c3613a;
        }
        m25725b();
    }

    /* renamed from: a */
    protected final cyv<cyo> mo4241a(drl drl, String str, List<dtj> list) {
        return new cze(this, drl, str, this.f20750c, list) {
            /* renamed from: a */
            final /* synthetic */ czf f20748a;

            /* renamed from: a */
            protected final void mo4239a(cys cys) {
                this.f20748a.f20751d = cys;
            }

            /* renamed from: a */
            protected final /* synthetic */ void mo4240a(Object obj) {
                final cyo cyo = (cyo) obj;
                this.f20748a.a(new Runnable(this) {
                    /* renamed from: b */
                    private /* synthetic */ C46881 f20747b;

                    public final void run() {
                        if (this.f20747b.f20748a.f20749b != null) {
                            this.f20747b.f20748a.f20749b.onComplete(this.f20747b.f20748a, cyo, this.f20747b.f20748a.f20751d);
                        }
                    }
                });
            }
        };
    }
}
