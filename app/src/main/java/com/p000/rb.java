package com.p000;

/* renamed from: rb */
public final class rb {
    /* renamed from: a */
    private final qy f25280a;
    /* renamed from: b */
    private final Object f25281b;
    /* renamed from: c */
    private final Object f25282c;
    /* renamed from: d */
    private final qw f25283d;
    /* renamed from: e */
    private final Object f25284e;
    /* renamed from: f */
    private boolean f25285f = false;
    /* renamed from: g */
    private boolean f25286g = false;

    public rb(qy qyVar, Object obj, Object obj2, final qw qwVar) {
        this.f25280a = qyVar;
        this.f25281b = obj2;
        this.f25282c = obj;
        this.f25284e = new Object();
        this.f25283d = new qw(this) {
            /* renamed from: b */
            private /* synthetic */ rb f25279b;

            /* renamed from: a */
            public final void mo4745a(Object obj) {
                synchronized (this.f25279b.f25284e) {
                    this.f25279b.f25286g = true;
                }
                qwVar.mo4745a(obj);
            }

            /* renamed from: b */
            public final void mo4746b(Object obj) {
                qwVar.mo4746b(obj);
            }

            /* renamed from: c */
            public final void mo4747c(Object obj) {
                synchronized (this.f25279b.f25284e) {
                    this.f25279b.f25286g = true;
                }
                qwVar.mo4747c(obj);
            }
        };
    }

    /* renamed from: a */
    public final void m33956a() {
        if (this.f25285f) {
            czl.m25831c(this, "Prompt already started");
            return;
        }
        this.f25285f = true;
        this.f25280a.mo4473a(this.f25282c, this.f25283d, this.f25281b);
    }

    /* renamed from: b */
    public final void m33957b() {
        if (this.f25285f) {
            synchronized (this.f25284e) {
                if (!this.f25286g) {
                    czl.m25828a((Object) this, "Stopping prompt");
                    this.f25286g = true;
                    this.f25280a.mo4472a();
                }
            }
        }
    }
}
