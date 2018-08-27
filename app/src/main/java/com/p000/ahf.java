package com.p000;

import java.util.Arrays;

/* compiled from: LongArray */
/* renamed from: ahf */
public final class ahf {
    /* renamed from: a */
    private int f1469a;
    /* renamed from: b */
    private long[] f1470b;

    public ahf() {
        this(32);
    }

    public ahf(int i) {
        this.f1470b = new long[i];
    }

    /* renamed from: a */
    public void m1530a(long j) {
        if (this.f1469a == this.f1470b.length) {
            this.f1470b = Arrays.copyOf(this.f1470b, this.f1469a * 2);
        }
        long[] jArr = this.f1470b;
        int i = this.f1469a;
        this.f1469a = i + 1;
        jArr[i] = j;
    }

    /* renamed from: a */
    public long m1529a(int i) {
        if (i >= 0 && i < this.f1469a) {
            return this.f1470b[i];
        }
        throw new IndexOutOfBoundsException("Invalid size " + i + ", size is " + this.f1469a);
    }

    /* renamed from: a */
    public int m1528a() {
        return this.f1469a;
    }
}
