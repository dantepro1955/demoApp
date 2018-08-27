package com.p000;

import java.nio.charset.Charset;

/* compiled from: ParsableByteArray */
/* renamed from: ahk */
public final class ahk {
    /* renamed from: a */
    public byte[] f1493a;
    /* renamed from: b */
    private int f1494b;
    /* renamed from: c */
    private int f1495c;

    public ahk(int i) {
        this.f1493a = new byte[i];
        this.f1495c = this.f1493a.length;
    }

    public ahk(byte[] bArr) {
        this.f1493a = bArr;
        this.f1495c = bArr.length;
    }

    /* renamed from: a */
    public void m1561a(byte[] bArr, int i) {
        this.f1493a = bArr;
        this.f1495c = i;
        this.f1494b = 0;
    }

    /* renamed from: a */
    public void m1558a() {
        this.f1494b = 0;
        this.f1495c = 0;
    }

    /* renamed from: b */
    public int m1563b() {
        return this.f1495c - this.f1494b;
    }

    /* renamed from: c */
    public int m1565c() {
        return this.f1495c;
    }

    /* renamed from: a */
    public void m1559a(int i) {
        boolean z = i >= 0 && i <= this.f1493a.length;
        ahb.m1514a(z);
        this.f1495c = i;
    }

    /* renamed from: d */
    public int m1567d() {
        return this.f1494b;
    }

    /* renamed from: e */
    public int m1569e() {
        return this.f1493a == null ? 0 : this.f1493a.length;
    }

    /* renamed from: b */
    public void m1564b(int i) {
        boolean z = i >= 0 && i <= this.f1495c;
        ahb.m1514a(z);
        this.f1494b = i;
    }

    /* renamed from: c */
    public void m1566c(int i) {
        m1564b(this.f1494b + i);
    }

    /* renamed from: a */
    public void m1560a(ahj ahj, int i) {
        m1562a(ahj.f1489a, 0, i);
        ahj.m1548a(0);
    }

    /* renamed from: a */
    public void m1562a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f1493a, this.f1494b, bArr, i, i2);
        this.f1494b += i2;
    }

    /* renamed from: f */
    public int m1570f() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: g */
    public int m1571g() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f1493a;
        int i3 = this.f1494b;
        this.f1494b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: h */
    public short m1572h() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f1493a;
        int i3 = this.f1494b;
        this.f1494b = i3 + 1;
        return (short) (i2 | (bArr2[i3] & 255));
    }

    /* renamed from: i */
    public int m1573i() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        byte[] bArr2 = this.f1493a;
        int i3 = this.f1494b;
        this.f1494b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f1493a;
        i3 = this.f1494b;
        this.f1494b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: j */
    public long m1574j() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        byte[] bArr2 = this.f1493a;
        int i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        return j | (((long) bArr2[i2]) & 255);
    }

    /* renamed from: k */
    public int m1575k() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        byte[] bArr2 = this.f1493a;
        int i3 = this.f1494b;
        this.f1494b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 16;
        bArr2 = this.f1493a;
        i3 = this.f1494b;
        this.f1494b = i3 + 1;
        i2 |= (bArr2[i3] & 255) << 8;
        bArr2 = this.f1493a;
        i3 = this.f1494b;
        this.f1494b = i3 + 1;
        return i2 | (bArr2[i3] & 255);
    }

    /* renamed from: l */
    public long m1576l() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        byte[] bArr2 = this.f1493a;
        int i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 48;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 40;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 32;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 24;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 16;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        j |= (((long) bArr2[i2]) & 255) << 8;
        bArr2 = this.f1493a;
        i2 = this.f1494b;
        this.f1494b = i2 + 1;
        return j | (((long) bArr2[i2]) & 255);
    }

    /* renamed from: m */
    public int m1577m() {
        byte[] bArr = this.f1493a;
        int i = this.f1494b;
        this.f1494b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        byte[] bArr2 = this.f1493a;
        int i3 = this.f1494b;
        this.f1494b = i3 + 1;
        i2 |= bArr2[i3] & 255;
        this.f1494b += 2;
        return i2;
    }

    /* renamed from: n */
    public int m1578n() {
        return (((m1570f() << 21) | (m1570f() << 14)) | (m1570f() << 7)) | m1570f();
    }

    /* renamed from: o */
    public int m1579o() {
        int k = m1575k();
        if (k >= 0) {
            return k;
        }
        throw new IllegalStateException("Top bit not zero: " + k);
    }

    /* renamed from: p */
    public long m1580p() {
        long l = m1576l();
        if (l >= 0) {
            return l;
        }
        throw new IllegalStateException("Top bit not zero: " + l);
    }

    /* renamed from: d */
    public String m1568d(int i) {
        return m1557a(i, Charset.defaultCharset());
    }

    /* renamed from: a */
    public String m1557a(int i, Charset charset) {
        String str = new String(this.f1493a, this.f1494b, i, charset);
        this.f1494b += i;
        return str;
    }
}
