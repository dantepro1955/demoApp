package com.p000;

import p000.adf.C0084a;

/* compiled from: TrackRenderer */
/* renamed from: adv */
public abstract class adv implements C0084a {
    /* renamed from: a */
    private int f476a;

    /* renamed from: a */
    protected abstract ado mo50a(int i);

    /* renamed from: a */
    protected abstract void mo51a(long j, long j2) throws ade;

    /* renamed from: a */
    protected abstract boolean mo52a(long j) throws ade;

    /* renamed from: b */
    protected abstract void mo53b(long j) throws ade;

    /* renamed from: b */
    protected abstract boolean mo54b();

    /* renamed from: c */
    protected abstract boolean mo55c();

    /* renamed from: d */
    protected abstract void mo56d() throws ade;

    /* renamed from: e */
    protected abstract long mo57e();

    /* renamed from: f */
    protected abstract long mo58f();

    protected abstract int g_();

    /* renamed from: g */
    protected adi mo90g() {
        return null;
    }

    /* renamed from: t */
    protected final int m593t() {
        return this.f476a;
    }

    /* renamed from: g */
    final int m587g(long j) throws ade {
        boolean z;
        int i = 1;
        if (this.f476a == 0) {
            z = true;
        } else {
            z = false;
        }
        ahb.m1516b(z);
        if (!mo52a(j)) {
            i = 0;
        }
        this.f476a = i;
        return this.f476a;
    }

    /* renamed from: b */
    final void m580b(int i, long j, boolean z) throws ade {
        boolean z2 = true;
        if (this.f476a != 1) {
            z2 = false;
        }
        ahb.m1516b(z2);
        this.f476a = 2;
        mo74a(i, j, z);
    }

    /* renamed from: a */
    protected void mo74a(int i, long j, boolean z) throws ade {
    }

    /* renamed from: u */
    final void m594u() throws ade {
        ahb.m1516b(this.f476a == 2);
        this.f476a = 3;
        mo81h();
    }

    /* renamed from: h */
    protected void mo81h() throws ade {
    }

    /* renamed from: v */
    final void m595v() throws ade {
        ahb.m1516b(this.f476a == 3);
        this.f476a = 2;
        mo82i();
    }

    /* renamed from: i */
    protected void mo82i() throws ade {
    }

    /* renamed from: w */
    final void m596w() throws ade {
        ahb.m1516b(this.f476a == 2);
        this.f476a = 1;
        mo75j();
    }

    /* renamed from: j */
    protected void mo75j() throws ade {
    }

    /* renamed from: x */
    final void m597x() throws ade {
        boolean z = (this.f476a == 2 || this.f476a == 3 || this.f476a == -1) ? false : true;
        ahb.m1516b(z);
        this.f476a = -1;
        mo76s();
    }

    /* renamed from: s */
    protected void mo76s() throws ade {
    }

    /* renamed from: a */
    public void mo49a(int i, Object obj) throws ade {
    }
}
