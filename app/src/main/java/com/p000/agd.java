package com.p000;

import java.io.IOException;

/* compiled from: Sniffer */
/* renamed from: agd */
final class agd {
    /* renamed from: a */
    private final ahk f1255a = new ahk(8);
    /* renamed from: b */
    private int f1256b;

    /* renamed from: a */
    public boolean m1410a(aeh aeh) throws IOException, InterruptedException {
        long d = aeh.mo123d();
        long j = (d == -1 || d > 1024) ? 1024 : d;
        int i = (int) j;
        aeh.mo122c(this.f1255a.f1493a, 0, 4);
        j = this.f1255a.m1574j();
        this.f1256b = 4;
        while (j != 440786851) {
            int i2 = this.f1256b + 1;
            this.f1256b = i2;
            if (i2 == i) {
                return false;
            }
            aeh.mo122c(this.f1255a.f1493a, 0, 1);
            j = ((j << 8) & -256) | ((long) (this.f1255a.f1493a[0] & 255));
        }
        j = m1409b(aeh);
        long j2 = (long) this.f1256b;
        if (j == Long.MIN_VALUE) {
            return false;
        }
        if (d != -1 && j2 + j >= d) {
            return false;
        }
        while (((long) this.f1256b) < j2 + j) {
            if (m1409b(aeh) == Long.MIN_VALUE) {
                return false;
            }
            d = m1409b(aeh);
            if (d < 0 || d > 2147483647L) {
                return false;
            }
            if (d != 0) {
                aeh.mo121c((int) d);
                this.f1256b = (int) (d + ((long) this.f1256b));
            }
        }
        return ((long) this.f1256b) == j + j2;
    }

    /* renamed from: b */
    private long m1409b(aeh aeh) throws IOException, InterruptedException {
        int i = 0;
        aeh.mo122c(this.f1255a.f1493a, 0, 1);
        int i2 = this.f1255a.f1493a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i4++;
            i3 >>= 1;
        }
        i3 = (i3 ^ -1) & i2;
        aeh.mo122c(this.f1255a.f1493a, 1, i4);
        while (i < i4) {
            i3 = (i3 << 8) + (this.f1255a.f1493a[i + 1] & 255);
            i++;
        }
        this.f1256b += i4 + 1;
        return (long) i3;
    }
}
