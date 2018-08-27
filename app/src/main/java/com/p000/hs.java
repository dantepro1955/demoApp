package com.p000;

/* compiled from: SparseArrayCompat */
/* renamed from: hs */
public class hs<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f23820a = new Object();
    /* renamed from: b */
    private boolean f23821b;
    /* renamed from: c */
    private int[] f23822c;
    /* renamed from: d */
    private Object[] f23823d;
    /* renamed from: e */
    private int f23824e;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m30603a();
    }

    public hs() {
        this(10);
    }

    public hs(int i) {
        this.f23821b = false;
        if (i == 0) {
            this.f23822c = hj.f23796a;
            this.f23823d = hj.f23798c;
        } else {
            int a = hj.m30579a(i);
            this.f23822c = new int[a];
            this.f23823d = new Object[a];
        }
        this.f23824e = 0;
    }

    /* renamed from: a */
    public hs<E> m30603a() {
        try {
            hs<E> hsVar = (hs) super.clone();
            try {
                hsVar.f23822c = (int[]) this.f23822c.clone();
                hsVar.f23823d = (Object[]) this.f23823d.clone();
                return hsVar;
            } catch (CloneNotSupportedException e) {
                return hsVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E m30604a(int i) {
        return m30605a(i, null);
    }

    /* renamed from: a */
    public E m30605a(int i, E e) {
        int a = hj.m30580a(this.f23822c, this.f23824e, i);
        return (a < 0 || this.f23823d[a] == f23820a) ? e : this.f23823d[a];
    }

    /* renamed from: b */
    public void m30607b(int i) {
        int a = hj.m30580a(this.f23822c, this.f23824e, i);
        if (a >= 0 && this.f23823d[a] != f23820a) {
            this.f23823d[a] = f23820a;
            this.f23821b = true;
        }
    }

    /* renamed from: c */
    public void m30610c(int i) {
        m30607b(i);
    }

    /* renamed from: d */
    public void m30612d(int i) {
        if (this.f23823d[i] != f23820a) {
            this.f23823d[i] = f23820a;
            this.f23821b = true;
        }
    }

    /* renamed from: d */
    private void m30602d() {
        int i = this.f23824e;
        int[] iArr = this.f23822c;
        Object[] objArr = this.f23823d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f23820a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f23821b = false;
        this.f23824e = i2;
    }

    /* renamed from: b */
    public void m30608b(int i, E e) {
        int a = hj.m30580a(this.f23822c, this.f23824e, i);
        if (a >= 0) {
            this.f23823d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f23824e || this.f23823d[a] != f23820a) {
            if (this.f23821b && this.f23824e >= this.f23822c.length) {
                m30602d();
                a = hj.m30580a(this.f23822c, this.f23824e, i) ^ -1;
            }
            if (this.f23824e >= this.f23822c.length) {
                int a2 = hj.m30579a(this.f23824e + 1);
                Object obj = new int[a2];
                Object obj2 = new Object[a2];
                System.arraycopy(this.f23822c, 0, obj, 0, this.f23822c.length);
                System.arraycopy(this.f23823d, 0, obj2, 0, this.f23823d.length);
                this.f23822c = obj;
                this.f23823d = obj2;
            }
            if (this.f23824e - a != 0) {
                System.arraycopy(this.f23822c, a, this.f23822c, a + 1, this.f23824e - a);
                System.arraycopy(this.f23823d, a, this.f23823d, a + 1, this.f23824e - a);
            }
            this.f23822c[a] = i;
            this.f23823d[a] = e;
            this.f23824e++;
            return;
        }
        this.f23822c[a] = i;
        this.f23823d[a] = e;
    }

    /* renamed from: b */
    public int m30606b() {
        if (this.f23821b) {
            m30602d();
        }
        return this.f23824e;
    }

    /* renamed from: e */
    public int m30613e(int i) {
        if (this.f23821b) {
            m30602d();
        }
        return this.f23822c[i];
    }

    /* renamed from: f */
    public E m30614f(int i) {
        if (this.f23821b) {
            m30602d();
        }
        return this.f23823d[i];
    }

    /* renamed from: g */
    public int m30615g(int i) {
        if (this.f23821b) {
            m30602d();
        }
        return hj.m30580a(this.f23822c, this.f23824e, i);
    }

    /* renamed from: c */
    public void m30609c() {
        int i = this.f23824e;
        Object[] objArr = this.f23823d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f23824e = 0;
        this.f23821b = false;
    }

    /* renamed from: c */
    public void m30611c(int i, E e) {
        if (this.f23824e == 0 || i > this.f23822c[this.f23824e - 1]) {
            if (this.f23821b && this.f23824e >= this.f23822c.length) {
                m30602d();
            }
            int i2 = this.f23824e;
            if (i2 >= this.f23822c.length) {
                int a = hj.m30579a(i2 + 1);
                Object obj = new int[a];
                Object obj2 = new Object[a];
                System.arraycopy(this.f23822c, 0, obj, 0, this.f23822c.length);
                System.arraycopy(this.f23823d, 0, obj2, 0, this.f23823d.length);
                this.f23822c = obj;
                this.f23823d = obj2;
            }
            this.f23822c[i2] = i;
            this.f23823d[i2] = e;
            this.f23824e = i2 + 1;
            return;
        }
        m30608b(i, e);
    }

    public String toString() {
        if (m30606b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f23824e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f23824e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m30613e(i));
            stringBuilder.append('=');
            hs f = m30614f(i);
            if (f != this) {
                stringBuilder.append(f);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
