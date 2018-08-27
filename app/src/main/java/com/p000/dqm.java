package com.p000;

/* renamed from: dqm */
public abstract class dqm extends drg {
    /* renamed from: a */
    protected final int f22612a;
    /* renamed from: c */
    private final String f22613c;
    /* renamed from: d */
    private final String f22614d;
    /* renamed from: e */
    private final boolean f22615e;

    public dqm(drh drh, int i, String str, String str2, boolean z) {
        super(drh);
        this.f22612a = i;
        this.f22613c = str;
        this.f22614d = str2;
        this.f22615e = z;
    }

    /* renamed from: h */
    public void mo4550h() {
        czl.m25828a((Object) this, "Transaction error code: " + this.f22612a);
        if (this.f22613c != null && this.f22613c.length() > 0) {
            czl.m25828a((Object) this, "Transaction error text: " + this.f22613c);
        }
        if (this.f22614d != null && this.f22614d.length() > 0) {
            czl.m25828a((Object) this, "Transaction suggestion: " + this.f22614d);
        }
        this.b.m28831s();
        final drf q = this.b.m28829q();
        if (this.f22615e) {
            q.mo4234a(this.b, this.f22612a, this.f22613c, this.f22614d);
            q.mo4233a(this.b);
            return;
        }
        qu.m33922a(new Runnable(this) {
            /* renamed from: b */
            private /* synthetic */ dqm f22610b;

            public final void run() {
                q.mo4234a(this.f22610b.b, this.f22610b.f22612a, this.f22610b.f22613c, this.f22610b.f22614d);
                q.mo4233a(this.f22610b.b);
            }
        });
    }
}
