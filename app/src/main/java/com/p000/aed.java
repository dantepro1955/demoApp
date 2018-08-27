package com.p000;

import com.facebook.internal.Utility;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: DefaultExtractorInput */
/* renamed from: aed */
public final class aed implements aeh {
    /* renamed from: a */
    private static final byte[] f746a = new byte[4096];
    /* renamed from: b */
    private final agp f747b;
    /* renamed from: c */
    private final long f748c;
    /* renamed from: d */
    private long f749d;
    /* renamed from: e */
    private byte[] f750e = new byte[Utility.DEFAULT_STREAM_BUFFER_SIZE];
    /* renamed from: f */
    private int f751f;
    /* renamed from: g */
    private int f752g;

    public aed(agp agp, long j, long j2) {
        this.f747b = agp;
        this.f749d = j;
        this.f748c = j2;
    }

    /* renamed from: a */
    public int mo113a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int d = m951d(bArr, i, i2);
        if (d == 0) {
            d = m950a(bArr, i, i2, 0, true);
        }
        m955g(d);
        return d;
    }

    /* renamed from: a */
    public boolean mo115a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int d = m951d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = m950a(bArr, i, i2, d, z);
        }
        m955g(d);
        return d != -1;
    }

    /* renamed from: b */
    public void mo118b(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo115a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public int mo112a(int i) throws IOException, InterruptedException {
        int e = m953e(i);
        if (e == 0) {
            e = m950a(f746a, 0, Math.min(i, f746a.length), 0, true);
        }
        m955g(e);
        return e;
    }

    /* renamed from: a */
    public boolean m959a(int i, boolean z) throws IOException, InterruptedException {
        int e = m953e(i);
        while (e < i && e != -1) {
            e = m950a(f746a, -e, Math.min(i, f746a.length + e), e, z);
        }
        m955g(e);
        return e != -1;
    }

    /* renamed from: b */
    public void mo117b(int i) throws IOException, InterruptedException {
        m959a(i, false);
    }

    /* renamed from: b */
    public boolean mo119b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!m964b(i2, z)) {
            return false;
        }
        System.arraycopy(this.f750e, this.f751f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: c */
    public void mo122c(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        mo119b(bArr, i, i2, false);
    }

    /* renamed from: b */
    public boolean m964b(int i, boolean z) throws IOException, InterruptedException {
        m952d(i);
        int min = Math.min(this.f752g - this.f751f, i);
        this.f752g += i - min;
        while (min < i) {
            min = m950a(this.f750e, this.f751f, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.f751f += i;
        return true;
    }

    /* renamed from: c */
    public void mo121c(int i) throws IOException, InterruptedException {
        m964b(i, false);
    }

    /* renamed from: a */
    public void mo114a() {
        this.f751f = 0;
    }

    /* renamed from: b */
    public long mo116b() {
        return this.f749d + ((long) this.f751f);
    }

    /* renamed from: c */
    public long mo120c() {
        return this.f749d;
    }

    /* renamed from: d */
    public long mo123d() {
        return this.f748c;
    }

    /* renamed from: d */
    private void m952d(int i) {
        int i2 = this.f751f + i;
        if (i2 > this.f750e.length) {
            this.f750e = Arrays.copyOf(this.f750e, Math.max(this.f750e.length * 2, i2));
        }
    }

    /* renamed from: e */
    private int m953e(int i) {
        int min = Math.min(this.f752g, i);
        m954f(min);
        return min;
    }

    /* renamed from: d */
    private int m951d(byte[] bArr, int i, int i2) {
        if (this.f752g == 0) {
            return 0;
        }
        int min = Math.min(this.f752g, i2);
        System.arraycopy(this.f750e, 0, bArr, i, min);
        m954f(min);
        return min;
    }

    /* renamed from: f */
    private void m954f(int i) {
        this.f752g -= i;
        this.f751f = 0;
        System.arraycopy(this.f750e, i, this.f750e, 0, this.f752g);
    }

    /* renamed from: a */
    private int m950a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int read = this.f747b.read(bArr, i + i3, i2 - i3);
        if (read != -1) {
            return i3 + read;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: g */
    private void m955g(int i) {
        if (i != -1) {
            this.f749d += (long) i;
        }
    }
}
