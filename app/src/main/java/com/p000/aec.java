package com.p000;

/* compiled from: ChunkIndex */
/* renamed from: aec */
public final class aec implements aeo {
    /* renamed from: a */
    public final int f741a;
    /* renamed from: b */
    public final int[] f742b;
    /* renamed from: c */
    public final long[] f743c;
    /* renamed from: d */
    public final long[] f744d;
    /* renamed from: e */
    public final long[] f745e;

    public aec(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f741a = iArr.length;
        this.f742b = iArr;
        this.f743c = jArr;
        this.f744d = jArr2;
        this.f745e = jArr3;
    }

    /* renamed from: a */
    public int m935a(long j) {
        return ahr.m1594a(this.f745e, j, true, true);
    }

    /* renamed from: a */
    public boolean mo110a() {
        return true;
    }

    /* renamed from: b */
    public long mo111b(long j) {
        return this.f743c[m935a(j)];
    }
}
