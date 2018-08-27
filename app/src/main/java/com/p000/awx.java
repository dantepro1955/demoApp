package com.p000;

import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.io.IOException;

/* renamed from: awx */
public final class awx {
    /* renamed from: a */
    private final byte[] f4794a;
    /* renamed from: b */
    private int f4795b;
    /* renamed from: c */
    private int f4796c;
    /* renamed from: d */
    private int f4797d;
    /* renamed from: e */
    private int f4798e;
    /* renamed from: f */
    private int f4799f;
    /* renamed from: g */
    private int f4800g = MoPubClientPositioning.NO_REPEAT;
    /* renamed from: h */
    private int f4801h;
    /* renamed from: i */
    private int f4802i = 64;
    /* renamed from: j */
    private int f4803j = 67108864;

    private awx(byte[] bArr, int i, int i2) {
        this.f4794a = bArr;
        this.f4795b = i;
        this.f4796c = i + i2;
        this.f4798e = i;
    }

    /* renamed from: a */
    public static long m6174a(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    /* renamed from: a */
    public static awx m6175a(byte[] bArr, int i, int i2) {
        return new awx(bArr, i, i2);
    }

    /* renamed from: r */
    private void m6176r() {
        this.f4796c += this.f4797d;
        int i = this.f4796c;
        if (i > this.f4800g) {
            this.f4797d = i - this.f4800g;
            this.f4796c -= this.f4797d;
            return;
        }
        this.f4797d = 0;
    }

    /* renamed from: a */
    public int m6177a() throws IOException {
        if (m6199o()) {
            this.f4799f = 0;
            return 0;
        }
        this.f4799f = m6194j();
        if (this.f4799f != 0) {
            return this.f4799f;
        }
        throw axe.m6297d();
    }

    /* renamed from: a */
    public void m6178a(int i) throws axe {
        if (this.f4799f != i) {
            throw axe.m6298e();
        }
    }

    /* renamed from: a */
    public void m6179a(axf axf) throws IOException {
        int j = m6194j();
        if (this.f4801h >= this.f4802i) {
            throw axe.m6300g();
        }
        j = m6183c(j);
        this.f4801h++;
        axf.mo722b(this);
        m6178a(0);
        this.f4801h--;
        m6186d(j);
    }

    /* renamed from: a */
    public byte[] m6180a(int i, int i2) {
        if (i2 == 0) {
            return axi.f4847l;
        }
        Object obj = new byte[i2];
        System.arraycopy(this.f4794a, this.f4795b + i, obj, 0, i2);
        return obj;
    }

    /* renamed from: b */
    public void m6181b() throws IOException {
        int a;
        do {
            a = m6177a();
            if (a == 0) {
                return;
            }
        } while (m6182b(a));
    }

    /* renamed from: b */
    public boolean m6182b(int i) throws IOException {
        switch (axi.m6309a(i)) {
            case 0:
                m6187e();
                return true;
            case 1:
                m6197m();
                return true;
            case 2:
                m6189f(m6194j());
                return true;
            case 3:
                m6181b();
                m6178a(axi.m6310a(axi.m6312b(i), 4));
                return true;
            case 4:
                return false;
            case 5:
                m6196l();
                return true;
            default:
                throw axe.m6299f();
        }
    }

    /* renamed from: c */
    public int m6183c(int i) throws axe {
        if (i < 0) {
            throw axe.m6295b();
        }
        int i2 = this.f4798e + i;
        int i3 = this.f4800g;
        if (i2 > i3) {
            throw axe.m6294a();
        }
        this.f4800g = i2;
        m6176r();
        return i3;
    }

    /* renamed from: c */
    public long m6184c() throws IOException {
        return m6195k();
    }

    /* renamed from: d */
    public long m6185d() throws IOException {
        return m6195k();
    }

    /* renamed from: d */
    public void m6186d(int i) {
        this.f4800g = i;
        m6176r();
    }

    /* renamed from: e */
    public int m6187e() throws IOException {
        return m6194j();
    }

    /* renamed from: e */
    public void m6188e(int i) {
        if (i > this.f4798e - this.f4795b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f4798e - this.f4795b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f4798e = this.f4795b + i;
        }
    }

    /* renamed from: f */
    public void m6189f(int i) throws IOException {
        if (i < 0) {
            throw axe.m6295b();
        } else if (this.f4798e + i > this.f4800g) {
            m6189f(this.f4800g - this.f4798e);
            throw axe.m6294a();
        } else if (i <= this.f4796c - this.f4798e) {
            this.f4798e += i;
        } else {
            throw axe.m6294a();
        }
    }

    /* renamed from: f */
    public boolean m6190f() throws IOException {
        return m6194j() != 0;
    }

    /* renamed from: g */
    public String m6191g() throws IOException {
        int j = m6194j();
        if (j < 0) {
            throw axe.m6295b();
        } else if (j > this.f4796c - this.f4798e) {
            throw axe.m6294a();
        } else {
            String str = new String(this.f4794a, this.f4798e, j, axd.f4831a);
            this.f4798e = j + this.f4798e;
            return str;
        }
    }

    /* renamed from: h */
    public byte[] m6192h() throws IOException {
        int j = m6194j();
        if (j < 0) {
            throw axe.m6295b();
        } else if (j == 0) {
            return axi.f4847l;
        } else {
            if (j > this.f4796c - this.f4798e) {
                throw axe.m6294a();
            }
            Object obj = new byte[j];
            System.arraycopy(this.f4794a, this.f4798e, obj, 0, j);
            this.f4798e = j + this.f4798e;
            return obj;
        }
    }

    /* renamed from: i */
    public long m6193i() throws IOException {
        return awx.m6174a(m6195k());
    }

    /* renamed from: j */
    public int m6194j() throws IOException {
        byte q = m6201q();
        if (q >= (byte) 0) {
            return q;
        }
        int i = q & 127;
        byte q2 = m6201q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 7);
        }
        i |= (q2 & 127) << 7;
        q2 = m6201q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 14);
        }
        i |= (q2 & 127) << 14;
        q2 = m6201q();
        if (q2 >= (byte) 0) {
            return i | (q2 << 21);
        }
        i |= (q2 & 127) << 21;
        q2 = m6201q();
        i |= q2 << 28;
        if (q2 >= (byte) 0) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (m6201q() >= (byte) 0) {
                return i;
            }
        }
        throw axe.m6296c();
    }

    /* renamed from: k */
    public long m6195k() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte q = m6201q();
            j |= ((long) (q & 127)) << i;
            if ((q & 128) == 0) {
                return j;
            }
        }
        throw axe.m6296c();
    }

    /* renamed from: l */
    public int m6196l() throws IOException {
        return (((m6201q() & 255) | ((m6201q() & 255) << 8)) | ((m6201q() & 255) << 16)) | ((m6201q() & 255) << 24);
    }

    /* renamed from: m */
    public long m6197m() throws IOException {
        byte q = m6201q();
        byte q2 = m6201q();
        return ((((((((((long) q2) & 255) << 8) | (((long) q) & 255)) | ((((long) m6201q()) & 255) << 16)) | ((((long) m6201q()) & 255) << 24)) | ((((long) m6201q()) & 255) << 32)) | ((((long) m6201q()) & 255) << 40)) | ((((long) m6201q()) & 255) << 48)) | ((((long) m6201q()) & 255) << 56);
    }

    /* renamed from: n */
    public int m6198n() {
        if (this.f4800g == MoPubClientPositioning.NO_REPEAT) {
            return -1;
        }
        return this.f4800g - this.f4798e;
    }

    /* renamed from: o */
    public boolean m6199o() {
        return this.f4798e == this.f4796c;
    }

    /* renamed from: p */
    public int m6200p() {
        return this.f4798e - this.f4795b;
    }

    /* renamed from: q */
    public byte m6201q() throws IOException {
        if (this.f4798e == this.f4796c) {
            throw axe.m6294a();
        }
        byte[] bArr = this.f4794a;
        int i = this.f4798e;
        this.f4798e = i + 1;
        return bArr[i];
    }
}
