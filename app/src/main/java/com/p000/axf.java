package com.p000;

import java.io.IOException;

/* renamed from: axf */
public abstract class axf {
    protected volatile int ah = -1;

    /* renamed from: a */
    public static final <T extends axf> T m5613a(T t, byte[] bArr) throws axe {
        return axf.m5616b(t, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static final void m5614a(axf axf, byte[] bArr, int i, int i2) {
        try {
            awy a = awy.m6206a(bArr, i, i2);
            axf.mo719a(a);
            a.m6243b();
        } catch (Throwable e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* renamed from: a */
    public static final byte[] m5615a(axf axf) {
        byte[] bArr = new byte[axf.m5622g()];
        axf.m5614a(axf, bArr, 0, bArr.length);
        return bArr;
    }

    /* renamed from: b */
    public static final <T extends axf> T m5616b(T t, byte[] bArr, int i, int i2) throws axe {
        try {
            awx a = awx.m6175a(bArr, i, i2);
            t.mo722b(a);
            a.m6178a(0);
            return t;
        } catch (axe e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    protected int mo718a() {
        return 0;
    }

    /* renamed from: a */
    public void mo719a(awy awy) throws IOException {
    }

    /* renamed from: b */
    public abstract axf mo722b(awx awx) throws IOException;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo721e();
    }

    /* renamed from: e */
    public axf mo721e() throws CloneNotSupportedException {
        return (axf) super.clone();
    }

    /* renamed from: f */
    public int m5621f() {
        if (this.ah < 0) {
            m5622g();
        }
        return this.ah;
    }

    /* renamed from: g */
    public int m5622g() {
        int a = mo718a();
        this.ah = a;
        return a;
    }

    public String toString() {
        return axg.m6301a(this);
    }
}
