package com.p000;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: JsonTreeReader */
/* renamed from: bvo */
public final class bvo extends bwa {
    /* renamed from: b */
    private static final Reader f7817b = new C15321();
    /* renamed from: c */
    private static final Object f7818c = new Object();
    /* renamed from: d */
    private Object[] f7819d = new Object[32];
    /* renamed from: e */
    private int f7820e = 0;
    /* renamed from: f */
    private String[] f7821f = new String[32];
    /* renamed from: g */
    private int[] f7822g = new int[32];

    /* compiled from: JsonTreeReader */
    /* renamed from: bvo$1 */
    static class C15321 extends Reader {
        C15321() {
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }

        public void close() throws IOException {
            throw new AssertionError();
        }
    }

    public bvo(buh buh) {
        super(f7817b);
        m11252a((Object) buh);
    }

    /* renamed from: a */
    public void mo1548a() throws IOException {
        m11251a(bwb.BEGIN_ARRAY);
        m11252a(((bue) m11253s()).iterator());
        this.f7822g[this.f7820e - 1] = 0;
    }

    /* renamed from: b */
    public void mo1549b() throws IOException {
        m11251a(bwb.END_ARRAY);
        m11254t();
        m11254t();
        if (this.f7820e > 0) {
            int[] iArr = this.f7822g;
            int i = this.f7820e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: c */
    public void mo1550c() throws IOException {
        m11251a(bwb.BEGIN_OBJECT);
        m11252a(((buk) m11253s()).m11085a().iterator());
    }

    /* renamed from: d */
    public void mo1552d() throws IOException {
        m11251a(bwb.END_OBJECT);
        m11254t();
        m11254t();
        if (this.f7820e > 0) {
            int[] iArr = this.f7822g;
            int i = this.f7820e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: e */
    public boolean mo1553e() throws IOException {
        bwb f = mo1554f();
        return (f == bwb.END_OBJECT || f == bwb.END_ARRAY) ? false : true;
    }

    /* renamed from: f */
    public bwb mo1554f() throws IOException {
        if (this.f7820e == 0) {
            return bwb.END_DOCUMENT;
        }
        Object s = m11253s();
        if (s instanceof Iterator) {
            boolean z = this.f7819d[this.f7820e - 2] instanceof buk;
            Iterator it = (Iterator) s;
            if (!it.hasNext()) {
                return z ? bwb.END_OBJECT : bwb.END_ARRAY;
            } else {
                if (z) {
                    return bwb.NAME;
                }
                m11252a(it.next());
                return mo1554f();
            }
        } else if (s instanceof buk) {
            return bwb.BEGIN_OBJECT;
        } else {
            if (s instanceof bue) {
                return bwb.BEGIN_ARRAY;
            }
            if (s instanceof bun) {
                bun bun = (bun) s;
                if (bun.m11104q()) {
                    return bwb.STRING;
                }
                if (bun.m11095a()) {
                    return bwb.BOOLEAN;
                }
                if (bun.m11103p()) {
                    return bwb.NUMBER;
                }
                throw new AssertionError();
            } else if (s instanceof buj) {
                return bwb.NULL;
            } else {
                if (s == f7818c) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: s */
    private Object m11253s() {
        return this.f7819d[this.f7820e - 1];
    }

    /* renamed from: t */
    private Object m11254t() {
        Object[] objArr = this.f7819d;
        int i = this.f7820e - 1;
        this.f7820e = i;
        Object obj = objArr[i];
        this.f7819d[this.f7820e] = null;
        return obj;
    }

    /* renamed from: a */
    private void m11251a(bwb bwb) throws IOException {
        if (mo1554f() != bwb) {
            throw new IllegalStateException("Expected " + bwb + " but was " + mo1554f() + m11255u());
        }
    }

    /* renamed from: g */
    public String mo1555g() throws IOException {
        m11251a(bwb.NAME);
        Entry entry = (Entry) ((Iterator) m11253s()).next();
        String str = (String) entry.getKey();
        this.f7821f[this.f7820e - 1] = str;
        m11252a(entry.getValue());
        return str;
    }

    /* renamed from: h */
    public String mo1556h() throws IOException {
        bwb f = mo1554f();
        if (f == bwb.STRING || f == bwb.NUMBER) {
            String c = ((bun) m11254t()).mo1539c();
            if (this.f7820e > 0) {
                int[] iArr = this.f7822g;
                int i = this.f7820e - 1;
                iArr[i] = iArr[i] + 1;
            }
            return c;
        }
        throw new IllegalStateException("Expected " + bwb.STRING + " but was " + f + m11255u());
    }

    /* renamed from: i */
    public boolean mo1557i() throws IOException {
        m11251a(bwb.BOOLEAN);
        boolean g = ((bun) m11254t()).mo1543g();
        if (this.f7820e > 0) {
            int[] iArr = this.f7822g;
            int i = this.f7820e - 1;
            iArr[i] = iArr[i] + 1;
        }
        return g;
    }

    /* renamed from: j */
    public void mo1558j() throws IOException {
        m11251a(bwb.NULL);
        m11254t();
        if (this.f7820e > 0) {
            int[] iArr = this.f7822g;
            int i = this.f7820e - 1;
            iArr[i] = iArr[i] + 1;
        }
    }

    /* renamed from: k */
    public double mo1559k() throws IOException {
        bwb f = mo1554f();
        if (f == bwb.NUMBER || f == bwb.STRING) {
            double d = ((bun) m11253s()).mo1540d();
            if (m11249q() || !(Double.isNaN(d) || Double.isInfinite(d))) {
                m11254t();
                if (this.f7820e > 0) {
                    int[] iArr = this.f7822g;
                    int i = this.f7820e - 1;
                    iArr[i] = iArr[i] + 1;
                }
                return d;
            }
            throw new NumberFormatException("JSON forbids NaN and infinities: " + d);
        }
        throw new IllegalStateException("Expected " + bwb.NUMBER + " but was " + f + m11255u());
    }

    /* renamed from: l */
    public long mo1560l() throws IOException {
        bwb f = mo1554f();
        if (f == bwb.NUMBER || f == bwb.STRING) {
            long e = ((bun) m11253s()).mo1541e();
            m11254t();
            if (this.f7820e > 0) {
                int[] iArr = this.f7822g;
                int i = this.f7820e - 1;
                iArr[i] = iArr[i] + 1;
            }
            return e;
        }
        throw new IllegalStateException("Expected " + bwb.NUMBER + " but was " + f + m11255u());
    }

    /* renamed from: m */
    public int mo1561m() throws IOException {
        bwb f = mo1554f();
        if (f == bwb.NUMBER || f == bwb.STRING) {
            int f2 = ((bun) m11253s()).mo1542f();
            m11254t();
            if (this.f7820e > 0) {
                int[] iArr = this.f7822g;
                int i = this.f7820e - 1;
                iArr[i] = iArr[i] + 1;
            }
            return f2;
        }
        throw new IllegalStateException("Expected " + bwb.NUMBER + " but was " + f + m11255u());
    }

    public void close() throws IOException {
        this.f7819d = new Object[]{f7818c};
        this.f7820e = 1;
    }

    /* renamed from: n */
    public void mo1562n() throws IOException {
        if (mo1554f() == bwb.NAME) {
            mo1555g();
            this.f7821f[this.f7820e - 2] = "null";
        } else {
            m11254t();
            this.f7821f[this.f7820e - 1] = "null";
        }
        int[] iArr = this.f7822g;
        int i = this.f7820e - 1;
        iArr[i] = iArr[i] + 1;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: o */
    public void mo1563o() throws IOException {
        m11251a(bwb.NAME);
        Entry entry = (Entry) ((Iterator) m11253s()).next();
        m11252a(entry.getValue());
        m11252a(new bun((String) entry.getKey()));
    }

    /* renamed from: a */
    private void m11252a(Object obj) {
        if (this.f7820e == this.f7819d.length) {
            Object obj2 = new Object[(this.f7820e * 2)];
            Object obj3 = new int[(this.f7820e * 2)];
            Object obj4 = new String[(this.f7820e * 2)];
            System.arraycopy(this.f7819d, 0, obj2, 0, this.f7820e);
            System.arraycopy(this.f7822g, 0, obj3, 0, this.f7820e);
            System.arraycopy(this.f7821f, 0, obj4, 0, this.f7820e);
            this.f7819d = obj2;
            this.f7822g = obj3;
            this.f7821f = obj4;
        }
        Object[] objArr = this.f7819d;
        int i = this.f7820e;
        this.f7820e = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: p */
    public String mo1564p() {
        StringBuilder append = new StringBuilder().append('$');
        int i = 0;
        while (i < this.f7820e) {
            if (this.f7819d[i] instanceof bue) {
                i++;
                if (this.f7819d[i] instanceof Iterator) {
                    append.append('[').append(this.f7822g[i]).append(']');
                }
            } else if (this.f7819d[i] instanceof buk) {
                i++;
                if (this.f7819d[i] instanceof Iterator) {
                    append.append('.');
                    if (this.f7821f[i] != null) {
                        append.append(this.f7821f[i]);
                    }
                }
            }
            i++;
        }
        return append.toString();
    }

    /* renamed from: u */
    private String m11255u() {
        return " at path " + mo1564p();
    }
}
