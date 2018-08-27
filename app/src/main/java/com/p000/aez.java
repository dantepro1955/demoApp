package com.p000;

import p000.aex.C0139a;

/* compiled from: XingSeeker */
/* renamed from: aez */
final class aez implements C0139a {
    /* renamed from: a */
    private final long f927a;
    /* renamed from: b */
    private final long f928b;
    /* renamed from: c */
    private final long f929c;
    /* renamed from: d */
    private final long[] f930d;
    /* renamed from: e */
    private final long f931e;
    /* renamed from: g */
    private final int f932g;

    /* renamed from: a */
    public static aez m1162a(ahh ahh, ahk ahk, long j, long j2) {
        int i = ahh.f1484g;
        int i2 = ahh.f1481d;
        long j3 = j + ((long) ahh.f1480c);
        int k = ahk.m1575k();
        if ((k & 1) == 1) {
            int o = ahk.m1579o();
            if (o != 0) {
                long a = ahr.m1595a((long) o, ((long) i) * 1000000, (long) i2);
                if ((k & 6) != 6) {
                    return new aez(j3, a, j2);
                }
                long o2 = (long) ahk.m1579o();
                ahk.m1566c(1);
                long[] jArr = new long[99];
                for (o = 0; o < 99; o++) {
                    jArr[o] = (long) ahk.m1570f();
                }
                return new aez(j3, a, j2, jArr, o2, ahh.f1480c);
            }
        }
        return null;
    }

    private aez(long j, long j2, long j3) {
        this(j, j2, j3, null, 0, 0);
    }

    private aez(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f927a = j;
        this.f928b = j2;
        this.f929c = j3;
        this.f930d = jArr;
        this.f931e = j4;
        this.f932g = i;
    }

    /* renamed from: a */
    public boolean mo110a() {
        return this.f930d != null;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        float f = 256.0f;
        float f2 = 0.0f;
        if (!mo110a()) {
            return this.f927a;
        }
        float f3 = (((float) j) * 100.0f) / ((float) this.f928b);
        if (f3 <= 0.0f) {
            f = 0.0f;
        } else if (f3 < 100.0f) {
            int i = (int) f3;
            if (i != 0) {
                f2 = (float) this.f930d[i - 1];
            }
            if (i < 99) {
                f = (float) this.f930d[i];
            }
            f = ((f - f2) * (f3 - ((float) i))) + f2;
        }
        return Math.min(this.f927a + Math.round((((double) f) * 0.00390625d) * ((double) this.f931e)), this.f929c != -1 ? this.f929c - 1 : ((this.f927a - ((long) this.f932g)) + this.f931e) - 1);
    }

    /* renamed from: a */
    public long mo157a(long j) {
        if (!mo110a() || j < this.f927a) {
            return 0;
        }
        double d = (256.0d * ((double) (j - this.f927a))) / ((double) this.f931e);
        int a = ahr.m1594a(this.f930d, (long) d, true, false) + 1;
        long a2 = m1161a(a);
        long j2 = a == 0 ? 0 : this.f930d[a - 1];
        long j3 = a == 99 ? 256 : this.f930d[a];
        return a2 + (j3 == j2 ? 0 : (long) ((((double) (m1161a(a + 1) - a2)) * (d - ((double) j2))) / ((double) (j3 - j2))));
    }

    /* renamed from: b */
    public long mo158b() {
        return this.f928b;
    }

    /* renamed from: a */
    private long m1161a(int i) {
        return (this.f928b * ((long) i)) / 100;
    }
}
