package com.p000;

import com.facebook.common.time.Clock;

/* compiled from: PtsTimestampAdjuster */
/* renamed from: afx */
public final class afx {
    /* renamed from: a */
    private final long f1211a;
    /* renamed from: b */
    private long f1212b;
    /* renamed from: c */
    private volatile long f1213c = Long.MIN_VALUE;

    public afx(long j) {
        this.f1211a = j;
    }

    /* renamed from: a */
    public void m1353a() {
        this.f1213c = Long.MIN_VALUE;
    }

    /* renamed from: a */
    public long m1352a(long j) {
        long j2;
        long j3;
        if (this.f1213c != Long.MIN_VALUE) {
            j2 = (this.f1213c + 4294967296L) / 8589934592L;
            j3 = ((j2 - 1) * 8589934592L) + j;
            j2 = (j2 * 8589934592L) + j;
            if (Math.abs(j3 - this.f1213c) >= Math.abs(j2 - this.f1213c)) {
                j3 = j2;
            }
        } else {
            j3 = j;
        }
        j2 = afx.m1351b(j3);
        if (this.f1211a != Clock.MAX_TIME && this.f1213c == Long.MIN_VALUE) {
            this.f1212b = this.f1211a - j2;
        }
        this.f1213c = j3;
        return this.f1212b + j2;
    }

    /* renamed from: b */
    public static long m1351b(long j) {
        return (1000000 * j) / 90000;
    }
}
