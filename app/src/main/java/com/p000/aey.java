package com.p000;

import p000.aex.C0139a;

/* compiled from: VbriSeeker */
/* renamed from: aey */
final class aey implements C0139a {
    /* renamed from: a */
    private final long[] f924a;
    /* renamed from: b */
    private final long[] f925b;
    /* renamed from: c */
    private final long f926c;

    /* renamed from: a */
    public static aey m1156a(ahh ahh, ahk ahk, long j, long j2) {
        ahk.m1566c(10);
        int k = ahk.m1575k();
        if (k <= 0) {
            return null;
        }
        int i = ahh.f1481d;
        long a = ahr.m1595a((long) k, ((long) (i >= 32000 ? 1152 : 576)) * 1000000, (long) i);
        int g = ahk.m1571g();
        int g2 = ahk.m1571g();
        int g3 = ahk.m1571g();
        ahk.m1566c(2);
        long j3 = j + ((long) ahh.f1480c);
        long[] jArr = new long[(g + 1)];
        long[] jArr2 = new long[(g + 1)];
        jArr[0] = 0;
        jArr2[0] = j3;
        for (k = 1; k < jArr.length; k++) {
            int f;
            long j4;
            switch (g3) {
                case 1:
                    f = ahk.m1570f();
                    break;
                case 2:
                    f = ahk.m1571g();
                    break;
                case 3:
                    f = ahk.m1573i();
                    break;
                case 4:
                    f = ahk.m1579o();
                    break;
                default:
                    return null;
            }
            j3 += (long) (f * g2);
            jArr[k] = (((long) k) * a) / ((long) g);
            if (j2 == -1) {
                j4 = j3;
            } else {
                j4 = Math.min(j2, j3);
            }
            jArr2[k] = j4;
        }
        return new aey(jArr, jArr2, a);
    }

    private aey(long[] jArr, long[] jArr2, long j) {
        this.f924a = jArr;
        this.f925b = jArr2;
        this.f926c = j;
    }

    /* renamed from: a */
    public boolean mo110a() {
        return true;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        return this.f925b[ahr.m1594a(this.f924a, j, true, true)];
    }

    /* renamed from: a */
    public long mo157a(long j) {
        return this.f924a[ahr.m1594a(this.f925b, j, true, true)];
    }

    /* renamed from: b */
    public long mo158b() {
        return this.f926c;
    }
}
