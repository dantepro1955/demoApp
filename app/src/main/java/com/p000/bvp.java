package com.p000;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter */
/* renamed from: bvp */
public final class bvp extends bwc {
    /* renamed from: a */
    private static final Writer f7834a = new C15331();
    /* renamed from: b */
    private static final bun f7835b = new bun("closed");
    /* renamed from: c */
    private final List<buh> f7836c = new ArrayList();
    /* renamed from: d */
    private String f7837d;
    /* renamed from: e */
    private buh f7838e = buj.f7702a;

    /* compiled from: JsonTreeWriter */
    /* renamed from: bvp$1 */
    static class C15331 extends Writer {
        C15331() {
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }

        public void flush() throws IOException {
            throw new AssertionError();
        }

        public void close() throws IOException {
            throw new AssertionError();
        }
    }

    public bvp() {
        super(f7834a);
    }

    /* renamed from: a */
    public buh mo1566a() {
        if (this.f7836c.isEmpty()) {
            return this.f7838e;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f7836c);
    }

    /* renamed from: j */
    private buh m11301j() {
        return (buh) this.f7836c.get(this.f7836c.size() - 1);
    }

    /* renamed from: a */
    private void m11300a(buh buh) {
        if (this.f7837d != null) {
            if (!buh.m11071k() || m11299i()) {
                ((buk) m11301j()).m11086a(this.f7837d, buh);
            }
            this.f7837d = null;
        } else if (this.f7836c.isEmpty()) {
            this.f7838e = buh;
        } else {
            buh j = m11301j();
            if (j instanceof bue) {
                ((bue) j).m11078a(buh);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public bwc mo1572b() throws IOException {
        buh bue = new bue();
        m11300a(bue);
        this.f7836c.add(bue);
        return this;
    }

    /* renamed from: c */
    public bwc mo1574c() throws IOException {
        if (this.f7836c.isEmpty() || this.f7837d != null) {
            throw new IllegalStateException();
        } else if (m11301j() instanceof bue) {
            this.f7836c.remove(this.f7836c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: d */
    public bwc mo1576d() throws IOException {
        buh buk = new buk();
        m11300a(buk);
        this.f7836c.add(buk);
        return this;
    }

    /* renamed from: e */
    public bwc mo1577e() throws IOException {
        if (this.f7836c.isEmpty() || this.f7837d != null) {
            throw new IllegalStateException();
        } else if (m11301j() instanceof buk) {
            this.f7836c.remove(this.f7836c.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public bwc mo1570a(String str) throws IOException {
        if (this.f7836c.isEmpty() || this.f7837d != null) {
            throw new IllegalStateException();
        } else if (m11301j() instanceof buk) {
            this.f7837d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    public bwc mo1573b(String str) throws IOException {
        if (str == null) {
            return mo1578f();
        }
        m11300a(new bun(str));
        return this;
    }

    /* renamed from: f */
    public bwc mo1578f() throws IOException {
        m11300a(buj.f7702a);
        return this;
    }

    /* renamed from: a */
    public bwc mo1571a(boolean z) throws IOException {
        m11300a(new bun(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: a */
    public bwc mo1568a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo1578f();
        }
        m11300a(new bun(bool));
        return this;
    }

    /* renamed from: a */
    public bwc mo1567a(long j) throws IOException {
        m11300a(new bun(Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public bwc mo1569a(Number number) throws IOException {
        if (number == null) {
            return mo1578f();
        }
        if (!m11297g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m11300a(new bun(number));
        return this;
    }

    public void flush() throws IOException {
    }

    public void close() throws IOException {
        if (this.f7836c.isEmpty()) {
            this.f7836c.add(f7835b);
            return;
        }
        throw new IOException("Incomplete document");
    }
}
