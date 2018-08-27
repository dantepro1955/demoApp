package com.p000;

import java.util.List;

/* renamed from: cyv */
abstract class cyv<ResultType> {
    /* renamed from: a */
    private final drl f20680a;
    /* renamed from: b */
    private final String f20681b;
    /* renamed from: c */
    private rd<ResultType> f20682c;
    /* renamed from: d */
    private final List<dtj> f20683d;
    /* renamed from: e */
    private boolean f20684e = false;
    /* renamed from: f */
    private final drf f20685f = new C46701(this);
    /* renamed from: g */
    private dre f20686g;

    /* renamed from: cyv$1 */
    class C46701 implements drf {
        /* renamed from: a */
        private /* synthetic */ cyv f20679a;

        C46701(cyv cyv) {
            this.f20679a = cyv;
        }

        /* renamed from: a */
        public final void mo4233a(dre dre) {
            if (this.f20679a.f20686g == dre) {
                if (this.f20679a.f20682c != null) {
                    this.f20679a.mo4240a(this.f20679a.f20682c.mo4245b());
                } else {
                    this.f20679a.mo4240a(null);
                }
                this.f20679a.f20686g = null;
            }
        }

        /* renamed from: a */
        public final void mo4234a(dre dre, int i, String str, String str2) {
            if (this.f20679a.f20686g == dre) {
                this.f20679a.mo4239a(new czt(i, str, str2));
            }
        }
    }

    cyv(drl drl, String str, List<dtj> list) {
        this.f20680a = drl;
        this.f20681b = str;
        this.f20683d = list;
    }

    /* renamed from: a */
    protected abstract dre mo4237a(drl drl, String str, List<dtj> list, rd<ResultType> rdVar, drf drf);

    /* renamed from: a */
    protected abstract rd<ResultType> mo4238a();

    /* renamed from: a */
    protected abstract void mo4239a(cys cys);

    /* renamed from: a */
    protected abstract void mo4240a(ResultType resultType);

    /* renamed from: b */
    public final void m25687b() {
        if (!this.f20680a.m28899b()) {
            czl.m25831c(this, "Unable to create command transaction. Transaction runner is invalid.");
            mo4239a(new czt(0, null, null));
        } else if (!this.f20684e) {
            this.f20682c = mo4238a();
            this.f20686g = mo4237a(this.f20680a, this.f20681b, this.f20683d, this.f20682c, this.f20685f);
            if (this.f20686g == null) {
                czl.m25831c(this, "Unable to create command transaction");
                mo4239a(new czt(0, null, null));
                return;
            }
            this.f20684e = true;
            this.f20686g.mo4475a();
        }
    }
}
