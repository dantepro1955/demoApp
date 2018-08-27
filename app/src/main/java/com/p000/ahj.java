package com.p000;

/* compiled from: ParsableBitArray */
/* renamed from: ahj */
public final class ahj {
    /* renamed from: a */
    public byte[] f1489a;
    /* renamed from: b */
    private int f1490b;
    /* renamed from: c */
    private int f1491c;
    /* renamed from: d */
    private int f1492d;

    public ahj(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ahj(byte[] bArr, int i) {
        this.f1489a = bArr;
        this.f1492d = i;
    }

    /* renamed from: a */
    public void m1549a(byte[] bArr) {
        m1550a(bArr, bArr.length);
    }

    /* renamed from: a */
    public void m1550a(byte[] bArr, int i) {
        this.f1489a = bArr;
        this.f1490b = 0;
        this.f1491c = 0;
        this.f1492d = i;
    }

    /* renamed from: a */
    public int m1547a() {
        return ((this.f1492d - this.f1490b) * 8) - this.f1491c;
    }

    /* renamed from: a */
    public void m1548a(int i) {
        this.f1490b = i / 8;
        this.f1491c = i - (this.f1490b * 8);
        m1546g();
    }

    /* renamed from: b */
    public void m1551b(int i) {
        this.f1490b += i / 8;
        this.f1491c += i % 8;
        if (this.f1491c > 7) {
            this.f1490b++;
            this.f1491c -= 8;
        }
        m1546g();
    }

    /* renamed from: b */
    public boolean m1552b() {
        return m1554c(1) == 1;
    }

    /* renamed from: c */
    public int m1554c(int i) {
        int i2 = 0;
        if (i != 0) {
            int i3;
            int i4 = i / 8;
            int i5 = 0;
            for (i3 = 0; i3 < i4; i3++) {
                if (this.f1491c != 0) {
                    i2 = ((this.f1489a[this.f1490b] & 255) << this.f1491c) | ((this.f1489a[this.f1490b + 1] & 255) >>> (8 - this.f1491c));
                } else {
                    i2 = this.f1489a[this.f1490b];
                }
                i -= 8;
                i5 |= (i2 & 255) << i;
                this.f1490b++;
            }
            if (i > 0) {
                i3 = this.f1491c + i;
                byte b = (byte) (255 >> (8 - i));
                if (i3 > 8) {
                    i2 = (b & (((this.f1489a[this.f1490b] & 255) << (i3 - 8)) | ((this.f1489a[this.f1490b + 1] & 255) >> (16 - i3)))) | i5;
                    this.f1490b++;
                } else {
                    i2 = (b & ((this.f1489a[this.f1490b] & 255) >> (8 - i3))) | i5;
                    if (i3 == 8) {
                        this.f1490b++;
                    }
                }
                this.f1491c = i3 % 8;
            } else {
                i2 = i5;
            }
            m1546g();
        }
        return i2;
    }

    /* renamed from: c */
    public int m1553c() {
        Object obj = null;
        int i = this.f1490b;
        int i2 = this.f1491c;
        int i3 = 0;
        while (this.f1490b < this.f1492d && !m1552b()) {
            i3++;
        }
        if (this.f1490b == this.f1492d) {
            obj = 1;
        }
        this.f1490b = i;
        this.f1491c = i2;
        return obj != null ? -1 : (i3 * 2) + 1;
    }

    /* renamed from: d */
    public int m1555d() {
        return m1545f();
    }

    /* renamed from: e */
    public int m1556e() {
        int f = m1545f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    /* renamed from: f */
    private int m1545f() {
        int i = 0;
        int i2 = 0;
        while (!m1552b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = m1554c(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    private void m1546g() {
        boolean z = this.f1490b >= 0 && this.f1491c >= 0 && this.f1491c < 8 && (this.f1490b < this.f1492d || (this.f1490b == this.f1492d && this.f1491c == 0));
        ahb.m1516b(z);
    }
}
