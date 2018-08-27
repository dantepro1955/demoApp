package com.p000;

import p000.cyu.C3618a;

/* renamed from: cyw */
final class cyw implements cyu {
    /* renamed from: a */
    private String f20693a;
    /* renamed from: b */
    private String f20694b;
    /* renamed from: c */
    private final C3618a f20695c;
    /* renamed from: d */
    private final drl f20696d;
    /* renamed from: e */
    private final qn f20697e = new C46711(this);
    /* renamed from: f */
    private dre f20698f = null;
    /* renamed from: g */
    private C4672a f20699g = null;
    /* renamed from: h */
    private cys f20700h = null;
    /* renamed from: i */
    private final qv f20701i = new qv();

    /* renamed from: cyw$1 */
    class C46711 implements qn {
        /* renamed from: a */
        private /* synthetic */ cyw f20687a;

        C46711(cyw cyw) {
            this.f20687a = cyw;
        }

        /* renamed from: a */
        public final void mo4233a(dre dre) {
            if (this.f20687a.f20700h != null) {
                if (this.f20687a.f20698f == dre) {
                    this.f20687a.m25700a(this.f20687a.f20699g.f20689b, this.f20687a.f20699g.f20692e, this.f20687a.f20700h);
                    this.f20687a.f20698f = null;
                    this.f20687a.f20699g = null;
                    this.f20687a.f20700h = null;
                }
            } else if (this.f20687a.f20698f == dre) {
                this.f20687a.f20695c.onSpeakingDone(this.f20687a, this.f20687a.f20699g.f20689b, null, this.f20687a.f20699g.f20692e);
                if (this.f20687a.f20701i.m33933f() > 0) {
                    this.f20687a.m25697a((C4672a) this.f20687a.f20701i.m33931d());
                    return;
                }
                this.f20687a.f20698f = null;
                this.f20687a.f20699g = null;
            }
        }

        /* renamed from: a */
        public final void mo4234a(dre dre, int i, String str, String str2) {
            if (this.f20687a.f20698f == dre) {
                this.f20687a.f20700h = new czt(i, str, str2);
            }
        }

        public final void b_(dre dre) {
            if (this.f20687a.f20698f == dre) {
                this.f20687a.f20695c.onSpeakingBegin(this.f20687a, this.f20687a.f20699g.f20689b, this.f20687a.f20699g.f20692e);
            }
        }
    }

    /* renamed from: cyw$a */
    class C4672a {
        /* renamed from: a */
        private final boolean f20688a;
        /* renamed from: b */
        private final String f20689b;
        /* renamed from: c */
        private final String f20690c;
        /* renamed from: d */
        private final String f20691d;
        /* renamed from: e */
        private final Object f20692e;

        public C4672a(boolean z, String str, String str2, String str3, Object obj) {
            this.f20688a = z;
            this.f20689b = str;
            this.f20690c = str2;
            this.f20691d = str3;
            this.f20692e = obj;
        }
    }

    cyw(drl drl, String str, String str2, C3618a c3618a) {
        this.f20693a = str;
        this.f20694b = str2;
        this.f20695c = c3618a;
        this.f20696d = drl;
    }

    /* renamed from: a */
    private void m25697a(C4672a c4672a) {
        if (this.f20696d.m28899b()) {
            this.f20700h = null;
            this.f20698f = this.f20696d.m28894a(c4672a.f20689b, c4672a.f20690c, c4672a.f20691d, c4672a.f20688a, this.f20697e);
            if (this.f20698f == null) {
                czl.m25831c(this, "Unable to create TTS transaction");
                m25700a(c4672a.f20689b, c4672a.f20692e, new czt(0, null, null));
                return;
            }
            this.f20699g = c4672a;
            this.f20698f.mo4475a();
            return;
        }
        czl.m25831c(this, "Unable to create TTS transaction. Transaction runner is invalid.");
        m25700a(c4672a.f20689b, c4672a.f20692e, new czt(0, null, null));
    }

    /* renamed from: a */
    private void m25700a(String str, Object obj, cys cys) {
        this.f20695c.onSpeakingDone(this, str, cys, obj);
        int f = this.f20701i.m33933f();
        for (int i = 0; i < f; i++) {
            C4672a c4672a = (C4672a) this.f20701i.m33929a(i);
            this.f20695c.onSpeakingDone(this, c4672a.f20689b, cys, c4672a.f20692e);
        }
        this.f20701i.m33932e();
    }

    /* renamed from: a */
    public final void mo4236a(String str, Object obj) {
        C4672a c4672a = new C4672a(false, str, this.f20693a, this.f20694b, obj);
        if (this.f20698f == null) {
            m25697a(c4672a);
        } else {
            this.f20701i.m33930a((Object) c4672a);
        }
    }
}
