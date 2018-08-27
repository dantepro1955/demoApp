package com.p000;

/* renamed from: axb */
public final class axb implements Cloneable {
    /* renamed from: a */
    private static final axc f4823a = new axc();
    /* renamed from: b */
    private boolean f4824b;
    /* renamed from: c */
    private int[] f4825c;
    /* renamed from: d */
    private axc[] f4826d;
    /* renamed from: e */
    private int f4827e;

    axb() {
        this(10);
    }

    axb(int i) {
        this.f4824b = false;
        int c = m6271c(i);
        this.f4825c = new int[c];
        this.f4826d = new axc[c];
        this.f4827e = 0;
    }

    /* renamed from: a */
    private boolean m6269a(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private boolean m6270a(axc[] axcArr, axc[] axcArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!axcArr[i2].equals(axcArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private int m6271c(int i) {
        return m6272d(i * 4) / 4;
    }

    /* renamed from: d */
    private int m6272d(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: e */
    private int m6273e(int i) {
        int i2 = 0;
        int i3 = this.f4827e - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            int i5 = this.f4825c[i4];
            if (i5 < i) {
                i2 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    int m6274a() {
        return this.f4827e;
    }

    /* renamed from: a */
    axc m6275a(int i) {
        int e = m6273e(i);
        return (e < 0 || this.f4826d[e] == f4823a) ? null : this.f4826d[e];
    }

    /* renamed from: a */
    void m6276a(int i, axc axc) {
        int e = m6273e(i);
        if (e >= 0) {
            this.f4826d[e] = axc;
            return;
        }
        e ^= -1;
        if (e >= this.f4827e || this.f4826d[e] != f4823a) {
            if (this.f4827e >= this.f4825c.length) {
                int c = m6271c(this.f4827e + 1);
                Object obj = new int[c];
                Object obj2 = new axc[c];
                System.arraycopy(this.f4825c, 0, obj, 0, this.f4825c.length);
                System.arraycopy(this.f4826d, 0, obj2, 0, this.f4826d.length);
                this.f4825c = obj;
                this.f4826d = obj2;
            }
            if (this.f4827e - e != 0) {
                System.arraycopy(this.f4825c, e, this.f4825c, e + 1, this.f4827e - e);
                System.arraycopy(this.f4826d, e, this.f4826d, e + 1, this.f4827e - e);
            }
            this.f4825c[e] = i;
            this.f4826d[e] = axc;
            this.f4827e++;
            return;
        }
        this.f4825c[e] = i;
        this.f4826d[e] = axc;
    }

    /* renamed from: b */
    axc m6277b(int i) {
        return this.f4826d[i];
    }

    /* renamed from: b */
    public boolean m6278b() {
        return m6274a() == 0;
    }

    /* renamed from: c */
    public final axb m6279c() {
        int a = m6274a();
        axb axb = new axb(a);
        System.arraycopy(this.f4825c, 0, axb.f4825c, 0, a);
        for (int i = 0; i < a; i++) {
            if (this.f4826d[i] != null) {
                axb.f4826d[i] = (axc) this.f4826d[i].clone();
            }
        }
        axb.f4827e = a;
        return axb;
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m6279c();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axb)) {
            return false;
        }
        axb axb = (axb) obj;
        return m6274a() != axb.m6274a() ? false : m6269a(this.f4825c, axb.f4825c, this.f4827e) && m6270a(this.f4826d, axb.f4826d, this.f4827e);
    }

    public int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.f4827e; i2++) {
            i = (((i * 31) + this.f4825c[i2]) * 31) + this.f4826d[i2].hashCode();
        }
        return i;
    }
}
