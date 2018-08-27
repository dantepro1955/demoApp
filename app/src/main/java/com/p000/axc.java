package com.p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: axc */
class axc implements Cloneable {
    /* renamed from: a */
    private axa<?, ?> f4828a;
    /* renamed from: b */
    private Object f4829b;
    /* renamed from: c */
    private List<axh> f4830c = new ArrayList();

    axc() {
    }

    /* renamed from: c */
    private byte[] m6280c() throws IOException {
        byte[] bArr = new byte[m6281a()];
        m6282a(awy.m6205a(bArr));
        return bArr;
    }

    /* renamed from: a */
    int m6281a() {
        if (this.f4829b != null) {
            return this.f4828a.m6263a(this.f4829b);
        }
        int i = 0;
        for (axh a : this.f4830c) {
            i = a.m6307a() + i;
        }
        return i;
    }

    /* renamed from: a */
    void m6282a(awy awy) throws IOException {
        if (this.f4829b != null) {
            this.f4828a.m6264a(this.f4829b, awy);
            return;
        }
        for (axh a : this.f4830c) {
            a.m6308a(awy);
        }
    }

    /* renamed from: a */
    void m6283a(axh axh) {
        this.f4830c.add(axh);
    }

    /* renamed from: b */
    public final axc m6284b() {
        axc axc = new axc();
        try {
            axc.f4828a = this.f4828a;
            if (this.f4830c == null) {
                axc.f4830c = null;
            } else {
                axc.f4830c.addAll(this.f4830c);
            }
            if (this.f4829b != null) {
                if (this.f4829b instanceof axf) {
                    axc.f4829b = (axf) ((axf) this.f4829b).clone();
                } else if (this.f4829b instanceof byte[]) {
                    axc.f4829b = ((byte[]) this.f4829b).clone();
                } else if (this.f4829b instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) this.f4829b;
                    r4 = new byte[bArr.length][];
                    axc.f4829b = r4;
                    for (r2 = 0; r2 < bArr.length; r2++) {
                        r4[r2] = (byte[]) bArr[r2].clone();
                    }
                } else if (this.f4829b instanceof boolean[]) {
                    axc.f4829b = ((boolean[]) this.f4829b).clone();
                } else if (this.f4829b instanceof int[]) {
                    axc.f4829b = ((int[]) this.f4829b).clone();
                } else if (this.f4829b instanceof long[]) {
                    axc.f4829b = ((long[]) this.f4829b).clone();
                } else if (this.f4829b instanceof float[]) {
                    axc.f4829b = ((float[]) this.f4829b).clone();
                } else if (this.f4829b instanceof double[]) {
                    axc.f4829b = ((double[]) this.f4829b).clone();
                } else if (this.f4829b instanceof axf[]) {
                    axf[] axfArr = (axf[]) this.f4829b;
                    r4 = new axf[axfArr.length];
                    axc.f4829b = r4;
                    for (r2 = 0; r2 < axfArr.length; r2++) {
                        r4[r2] = (axf) axfArr[r2].clone();
                    }
                }
            }
            return axc;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m6284b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axc)) {
            return false;
        }
        axc axc = (axc) obj;
        if (this.f4829b != null && axc.f4829b != null) {
            return this.f4828a == axc.f4828a ? !this.f4828a.f4820b.isArray() ? this.f4829b.equals(axc.f4829b) : this.f4829b instanceof byte[] ? Arrays.equals((byte[]) this.f4829b, (byte[]) axc.f4829b) : this.f4829b instanceof int[] ? Arrays.equals((int[]) this.f4829b, (int[]) axc.f4829b) : this.f4829b instanceof long[] ? Arrays.equals((long[]) this.f4829b, (long[]) axc.f4829b) : this.f4829b instanceof float[] ? Arrays.equals((float[]) this.f4829b, (float[]) axc.f4829b) : this.f4829b instanceof double[] ? Arrays.equals((double[]) this.f4829b, (double[]) axc.f4829b) : this.f4829b instanceof boolean[] ? Arrays.equals((boolean[]) this.f4829b, (boolean[]) axc.f4829b) : Arrays.deepEquals((Object[]) this.f4829b, (Object[]) axc.f4829b) : false;
        } else {
            if (this.f4830c != null && axc.f4830c != null) {
                return this.f4830c.equals(axc.f4830c);
            }
            try {
                return Arrays.equals(m6280c(), axc.m6280c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public int hashCode() {
        try {
            return Arrays.hashCode(m6280c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }
}
