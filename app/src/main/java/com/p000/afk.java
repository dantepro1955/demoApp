package com.p000;

/* compiled from: TrackSampleTable */
/* renamed from: afk */
final class afk {
    /* renamed from: a */
    public final int f1075a;
    /* renamed from: b */
    public final long[] f1076b;
    /* renamed from: c */
    public final int[] f1077c;
    /* renamed from: d */
    public final int f1078d;
    /* renamed from: e */
    public final long[] f1079e;
    /* renamed from: f */
    public final int[] f1080f;

    afk(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z;
        boolean z2 = true;
        ahb.m1514a(iArr.length == jArr2.length);
        if (jArr.length == jArr2.length) {
            z = true;
        } else {
            z = false;
        }
        ahb.m1514a(z);
        if (iArr2.length != jArr2.length) {
            z2 = false;
        }
        ahb.m1514a(z2);
        this.f1076b = jArr;
        this.f1077c = iArr;
        this.f1078d = i;
        this.f1079e = jArr2;
        this.f1080f = iArr2;
        this.f1075a = jArr.length;
    }

    /* renamed from: a */
    public int m1254a(long j) {
        for (int a = ahr.m1594a(this.f1079e, j, true, false); a >= 0; a--) {
            if ((this.f1080f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m1255b(long j) {
        for (int b = ahr.m1603b(this.f1079e, j, true, false); b < this.f1079e.length; b++) {
            if ((this.f1080f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
