package com.p000;

import java.io.IOException;

/* compiled from: VarintReader */
/* renamed from: age */
final class age {
    /* renamed from: a */
    private static final long[] f1257a = new long[]{128, 64, 32, 16, 8, 4, 2, 1};
    /* renamed from: b */
    private final byte[] f1258b = new byte[8];
    /* renamed from: c */
    private int f1259c;
    /* renamed from: d */
    private int f1260d;

    /* renamed from: a */
    public void m1414a() {
        this.f1259c = 0;
        this.f1260d = 0;
    }

    /* renamed from: a */
    public long m1413a(aeh aeh, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f1259c == 0) {
            if (!aeh.mo115a(this.f1258b, 0, 1, z)) {
                return -1;
            }
            this.f1260d = age.m1411a(this.f1258b[0] & 255);
            if (this.f1260d == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f1259c = 1;
        }
        if (this.f1260d > i) {
            this.f1259c = 0;
            return -2;
        }
        if (this.f1260d != 1) {
            aeh.mo118b(this.f1258b, 1, this.f1260d - 1);
        }
        this.f1259c = 0;
        return age.m1412a(this.f1258b, this.f1260d, z2);
    }

    /* renamed from: b */
    public int m1415b() {
        return this.f1260d;
    }

    /* renamed from: a */
    public static int m1411a(int i) {
        for (int i2 = 0; i2 < f1257a.length; i2++) {
            if ((f1257a[i2] & ((long) i)) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static long m1412a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f1257a[i - 1] ^ -1;
        }
        long j2 = j;
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (((long) bArr[i2]) & 255);
        }
        return j2;
    }
}
