package com.p000;

/* compiled from: LongSparseArray */
/* renamed from: hm */
public class hm<E> implements Cloneable {
    /* renamed from: a */
    private static final Object f23801a = new Object();
    /* renamed from: b */
    private boolean f23802b;
    /* renamed from: c */
    private long[] f23803c;
    /* renamed from: d */
    private Object[] f23804d;
    /* renamed from: e */
    private int f23805e;

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m30588a();
    }

    public hm() {
        this(10);
    }

    public hm(int i) {
        this.f23802b = false;
        if (i == 0) {
            this.f23803c = hj.f23797b;
            this.f23804d = hj.f23798c;
        } else {
            int b = hj.m30583b(i);
            this.f23803c = new long[b];
            this.f23804d = new Object[b];
        }
        this.f23805e = 0;
    }

    /* renamed from: a */
    public hm<E> m30588a() {
        try {
            hm<E> hmVar = (hm) super.clone();
            try {
                hmVar.f23803c = (long[]) this.f23803c.clone();
                hmVar.f23804d = (Object[]) this.f23804d.clone();
                return hmVar;
            } catch (CloneNotSupportedException e) {
                return hmVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E m30589a(long j) {
        return m30590a(j, null);
    }

    /* renamed from: a */
    public E m30590a(long j, E e) {
        int a = hj.m30581a(this.f23803c, this.f23805e, j);
        return (a < 0 || this.f23804d[a] == f23801a) ? e : this.f23804d[a];
    }

    /* renamed from: b */
    public void m30594b(long j) {
        int a = hj.m30581a(this.f23803c, this.f23805e, j);
        if (a >= 0 && this.f23804d[a] != f23801a) {
            this.f23804d[a] = f23801a;
            this.f23802b = true;
        }
    }

    /* renamed from: c */
    public void m30598c(long j) {
        m30594b(j);
    }

    /* renamed from: a */
    public void m30591a(int i) {
        if (this.f23804d[i] != f23801a) {
            this.f23804d[i] = f23801a;
            this.f23802b = true;
        }
    }

    /* renamed from: d */
    private void m30587d() {
        int i = this.f23805e;
        long[] jArr = this.f23803c;
        Object[] objArr = this.f23804d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f23801a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f23802b = false;
        this.f23805e = i2;
    }

    /* renamed from: b */
    public void m30595b(long j, E e) {
        int a = hj.m30581a(this.f23803c, this.f23805e, j);
        if (a >= 0) {
            this.f23804d[a] = e;
            return;
        }
        a ^= -1;
        if (a >= this.f23805e || this.f23804d[a] != f23801a) {
            if (this.f23802b && this.f23805e >= this.f23803c.length) {
                m30587d();
                a = hj.m30581a(this.f23803c, this.f23805e, j) ^ -1;
            }
            if (this.f23805e >= this.f23803c.length) {
                int b = hj.m30583b(this.f23805e + 1);
                Object obj = new long[b];
                Object obj2 = new Object[b];
                System.arraycopy(this.f23803c, 0, obj, 0, this.f23803c.length);
                System.arraycopy(this.f23804d, 0, obj2, 0, this.f23804d.length);
                this.f23803c = obj;
                this.f23804d = obj2;
            }
            if (this.f23805e - a != 0) {
                System.arraycopy(this.f23803c, a, this.f23803c, a + 1, this.f23805e - a);
                System.arraycopy(this.f23804d, a, this.f23804d, a + 1, this.f23805e - a);
            }
            this.f23803c[a] = j;
            this.f23804d[a] = e;
            this.f23805e++;
            return;
        }
        this.f23803c[a] = j;
        this.f23804d[a] = e;
    }

    /* renamed from: b */
    public int m30592b() {
        if (this.f23802b) {
            m30587d();
        }
        return this.f23805e;
    }

    /* renamed from: b */
    public long m30593b(int i) {
        if (this.f23802b) {
            m30587d();
        }
        return this.f23803c[i];
    }

    /* renamed from: c */
    public E m30596c(int i) {
        if (this.f23802b) {
            m30587d();
        }
        return this.f23804d[i];
    }

    /* renamed from: c */
    public void m30597c() {
        int i = this.f23805e;
        Object[] objArr = this.f23804d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f23805e = 0;
        this.f23802b = false;
    }

    public String toString() {
        if (m30592b() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f23805e * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f23805e; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(m30593b(i));
            stringBuilder.append('=');
            hm c = m30596c(i);
            if (c != this) {
                stringBuilder.append(c);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
