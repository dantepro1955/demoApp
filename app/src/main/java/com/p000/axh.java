package com.p000;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: axh */
final class axh {
    /* renamed from: a */
    final int f4834a;
    /* renamed from: b */
    final byte[] f4835b;

    axh(int i, byte[] bArr) {
        this.f4834a = i;
        this.f4835b = bArr;
    }

    /* renamed from: a */
    int m6307a() {
        return (awy.m6225f(this.f4834a) + 0) + this.f4835b.length;
    }

    /* renamed from: a */
    void m6308a(awy awy) throws IOException {
        awy.m6254e(this.f4834a);
        awy.m6253d(this.f4835b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axh)) {
            return false;
        }
        axh axh = (axh) obj;
        return this.f4834a == axh.f4834a && Arrays.equals(this.f4835b, axh.f4835b);
    }

    public int hashCode() {
        return ((this.f4834a + 527) * 31) + Arrays.hashCode(this.f4835b);
    }
}
