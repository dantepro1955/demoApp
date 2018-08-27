package com.p000;

import java.util.Arrays;

/* compiled from: SegmentedByteString */
/* renamed from: dsf */
final class dsf extends drt {
    /* renamed from: f */
    final transient byte[][] f22801f;
    /* renamed from: g */
    final transient int[] f22802g;

    dsf(drq drq, int i) {
        int i2 = 0;
        super(null);
        dsj.m29130a(drq.f22760b, 0, (long) i);
        dsd dsd = drq.f22759a;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            if (dsd.f22794c == dsd.f22793b) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += dsd.f22794c - dsd.f22793b;
            i3++;
            dsd = dsd.f22797f;
        }
        this.f22801f = new byte[i3][];
        this.f22802g = new int[(i3 * 2)];
        dsd dsd2 = drq.f22759a;
        i4 = 0;
        while (i2 < i) {
            this.f22801f[i4] = dsd2.f22792a;
            int i5 = (dsd2.f22794c - dsd2.f22793b) + i2;
            if (i5 > i) {
                i5 = i;
            }
            this.f22802g[i4] = i5;
            this.f22802g[this.f22801f.length + i4] = dsd2.f22793b;
            dsd2.f22795d = true;
            i4++;
            dsd2 = dsd2.f22797f;
            i2 = i5;
        }
    }

    /* renamed from: a */
    public String mo4616a() {
        return m29113j().mo4616a();
    }

    /* renamed from: b */
    public String mo4620b() {
        return m29113j().mo4620b();
    }

    /* renamed from: f */
    public String mo4625f() {
        return m29113j().mo4625f();
    }

    /* renamed from: g */
    public drt mo4626g() {
        return m29113j().mo4626g();
    }

    /* renamed from: c */
    public drt mo4621c() {
        return m29113j().mo4621c();
    }

    /* renamed from: d */
    public drt mo4622d() {
        return m29113j().mo4622d();
    }

    /* renamed from: e */
    public drt mo4623e() {
        return m29113j().mo4623e();
    }

    /* renamed from: a */
    public drt mo4615a(int i, int i2) {
        return m29113j().mo4615a(i, i2);
    }

    /* renamed from: a */
    public byte mo4614a(int i) {
        dsj.m29130a((long) this.f22802g[this.f22801f.length - 1], (long) i, 1);
        int b = m29112b(i);
        return this.f22801f[b][(i - (b == 0 ? 0 : this.f22802g[b - 1])) + this.f22802g[this.f22801f.length + b]];
    }

    /* renamed from: b */
    private int m29112b(int i) {
        int binarySearch = Arrays.binarySearch(this.f22802g, 0, this.f22801f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    /* renamed from: h */
    public int mo4627h() {
        return this.f22802g[this.f22801f.length - 1];
    }

    /* renamed from: i */
    public byte[] mo4629i() {
        int i = 0;
        Object obj = new byte[this.f22802g[this.f22801f.length - 1]];
        int length = this.f22801f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f22802g[length + i];
            int i4 = this.f22802g[i];
            System.arraycopy(this.f22801f[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    /* renamed from: a */
    void mo4617a(drq drq) {
        int i = 0;
        int length = this.f22801f.length;
        int i2 = 0;
        while (i < length) {
            int i3 = this.f22802g[length + i];
            int i4 = this.f22802g[i];
            dsd dsd = new dsd(this.f22801f[i], i3, (i3 + i4) - i2);
            if (drq.f22759a == null) {
                dsd.f22798g = dsd;
                dsd.f22797f = dsd;
                drq.f22759a = dsd;
            } else {
                drq.f22759a.f22798g.m29107a(dsd);
            }
            i++;
            i2 = i4;
        }
        drq.f22760b = ((long) i2) + drq.f22760b;
    }

    /* renamed from: a */
    public boolean mo4618a(int i, drt drt, int i2, int i3) {
        if (i < 0 || i > mo4627h() - i3) {
            return false;
        }
        int b = m29112b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f22802g[b - 1];
            int min = Math.min(i3, ((this.f22802g[b] - i4) + i4) - i);
            if (!drt.mo4619a(i2, this.f22801f[b], (i - i4) + this.f22802g[this.f22801f.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo4619a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo4627h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m29112b(i);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.f22802g[b - 1];
            int min = Math.min(i3, ((this.f22802g[b] - i4) + i4) - i);
            if (!dsj.m29132a(this.f22801f[b], (i - i4) + this.f22802g[this.f22801f.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: j */
    private drt m29113j() {
        return new drt(mo4629i());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean z;
        if ((obj instanceof drt) && ((drt) obj).mo4627h() == mo4627h() && mo4618a(0, (drt) obj, 0, mo4627h())) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.d;
        if (i == 0) {
            i = 1;
            int length = this.f22801f.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                byte[] bArr = this.f22801f[i2];
                int i4 = this.f22802g[length + i2];
                int i5 = this.f22802g[i2];
                i3 = (i5 - i3) + i4;
                int i6 = i4;
                i4 = i;
                for (i = i6; i < i3; i++) {
                    i4 = (i4 * 31) + bArr[i];
                }
                i2++;
                i3 = i5;
                i = i4;
            }
            this.d = i;
        }
        return i;
    }

    public String toString() {
        return m29113j().toString();
    }

    private Object writeReplace() {
        return m29113j();
    }
}
