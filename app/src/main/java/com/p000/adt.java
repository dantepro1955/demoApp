package com.p000;

import java.util.Arrays;
import p000.adm.C0100b;
import p000.ads.C0108a;

/* compiled from: SampleSourceTrackRenderer */
/* renamed from: adt */
public abstract class adt extends adv {
    /* renamed from: a */
    private final C0108a[] f519a;
    /* renamed from: b */
    private int[] f520b;
    /* renamed from: c */
    private int[] f521c;
    /* renamed from: d */
    private C0108a f522d;
    /* renamed from: e */
    private int f523e;
    /* renamed from: f */
    private long f524f;

    /* renamed from: a */
    protected abstract void mo77a(long j, long j2, boolean z) throws ade;

    /* renamed from: a */
    protected abstract boolean mo78a(ado ado) throws C0100b;

    /* renamed from: c */
    protected abstract void mo79c(long j) throws ade;

    public adt(ads... adsArr) {
        this.f519a = new C0108a[adsArr.length];
        for (int i = 0; i < adsArr.length; i++) {
            this.f519a[i] = adsArr[i].mo133a();
        }
    }

    /* renamed from: a */
    protected final boolean mo52a(long j) throws ade {
        int i;
        int i2 = 1;
        for (C0108a a : this.f519a) {
            i2 &= a.mo139a(j);
        }
        if (i2 == 0) {
            return false;
        }
        i2 = 0;
        for (C0108a a2 : this.f519a) {
            i2 += a2.mo145c();
        }
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        int length = this.f519a.length;
        i2 = 0;
        long j2 = 0;
        int i3 = 0;
        while (i3 < length) {
            C0108a c0108a = this.f519a[i3];
            int c = c0108a.mo145c();
            i = i2;
            i2 = 0;
            while (i2 < c) {
                ado a3 = c0108a.mo132a(i2);
                try {
                    if (mo78a(a3)) {
                        iArr[i] = i3;
                        iArr2[i] = i2;
                        i++;
                        if (j2 != -1) {
                            long j3 = a3.f624e;
                            if (j3 == -1) {
                                j2 = -1;
                            } else if (j3 != -2) {
                                j2 = Math.max(j2, j3);
                            }
                        }
                    }
                    i2++;
                } catch (Throwable e) {
                    throw new ade(e);
                }
            }
            i3++;
            i2 = i;
        }
        this.f524f = j2;
        this.f520b = Arrays.copyOf(iArr, i2);
        this.f521c = Arrays.copyOf(iArr2, i2);
        return true;
    }

    /* renamed from: a */
    protected void mo74a(int i, long j, boolean z) throws ade {
        long f = m689f(j);
        this.f522d = this.f519a[this.f520b[i]];
        this.f523e = this.f521c[i];
        this.f522d.mo134a(this.f523e, f);
        mo79c(f);
    }

    /* renamed from: b */
    protected final void mo53b(long j) throws ade {
        long f = m689f(j);
        this.f522d.mo142b(f);
        mo80d(f);
    }

    /* renamed from: a */
    protected final void mo51a(long j, long j2) throws ade {
        long f = m689f(j);
        mo77a(mo80d(f), j2, this.f522d.mo144b(this.f523e, f));
    }

    /* renamed from: f */
    protected long mo58f() {
        return this.f522d.mo147d();
    }

    /* renamed from: e */
    protected long mo57e() {
        return this.f524f;
    }

    /* renamed from: d */
    protected void mo56d() throws ade {
        if (this.f522d != null) {
            m675a(this.f522d);
            return;
        }
        for (C0108a a : this.f519a) {
            m675a(a);
        }
    }

    /* renamed from: j */
    protected void mo75j() throws ade {
        this.f522d.mo146c(this.f523e);
        this.f522d = null;
    }

    /* renamed from: s */
    protected void mo76s() throws ade {
        for (C0108a e : this.f519a) {
            e.mo149e();
        }
    }

    protected final int g_() {
        return this.f521c.length;
    }

    /* renamed from: a */
    protected final ado mo50a(int i) {
        return this.f519a[this.f520b[i]].mo132a(this.f521c[i]);
    }

    /* renamed from: f */
    protected long m689f(long j) {
        return j;
    }

    /* renamed from: a */
    protected final int m677a(long j, adp adp, adr adr) {
        return this.f522d.mo131a(this.f523e, j, adp, adr);
    }

    /* renamed from: d */
    private long mo80d(long j) throws ade {
        long b = this.f522d.mo140b(this.f523e);
        if (b == Long.MIN_VALUE) {
            return j;
        }
        mo79c(b);
        return b;
    }

    /* renamed from: a */
    private void m675a(C0108a c0108a) throws ade {
        try {
            c0108a.mo141b();
        } catch (Throwable e) {
            throw new ade(e);
        }
    }
}
