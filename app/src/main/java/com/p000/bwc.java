package com.p000;

import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter */
/* renamed from: bwc */
public class bwc implements Closeable, Flushable {
    /* renamed from: a */
    private static final String[] f7823a = new String[128];
    /* renamed from: b */
    private static final String[] f7824b = ((String[]) f7823a.clone());
    /* renamed from: c */
    private final Writer f7825c;
    /* renamed from: d */
    private int[] f7826d = new int[32];
    /* renamed from: e */
    private int f7827e = 0;
    /* renamed from: f */
    private String f7828f;
    /* renamed from: g */
    private String f7829g;
    /* renamed from: h */
    private boolean f7830h;
    /* renamed from: i */
    private boolean f7831i;
    /* renamed from: j */
    private String f7832j;
    /* renamed from: k */
    private boolean f7833k;

    static {
        for (int i = 0; i <= 31; i++) {
            f7823a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        f7823a[34] = "\\\"";
        f7823a[92] = "\\\\";
        f7823a[9] = "\\t";
        f7823a[8] = "\\b";
        f7823a[10] = "\\n";
        f7823a[13] = "\\r";
        f7823a[12] = "\\f";
        f7824b[60] = "\\u003c";
        f7824b[62] = "\\u003e";
        f7824b[38] = "\\u0026";
        f7824b[61] = "\\u003d";
        f7824b[39] = "\\u0027";
    }

    public bwc(Writer writer) {
        m11275a(6);
        this.f7829g = ":";
        this.f7833k = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f7825c = writer;
    }

    /* renamed from: c */
    public final void m11291c(String str) {
        if (str.length() == 0) {
            this.f7828f = null;
            this.f7829g = ":";
            return;
        }
        this.f7828f = str;
        this.f7829g = ": ";
    }

    /* renamed from: b */
    public final void m11289b(boolean z) {
        this.f7830h = z;
    }

    /* renamed from: g */
    public boolean m11297g() {
        return this.f7830h;
    }

    /* renamed from: c */
    public final void m11292c(boolean z) {
        this.f7831i = z;
    }

    /* renamed from: h */
    public final boolean m11298h() {
        return this.f7831i;
    }

    /* renamed from: d */
    public final void m11294d(boolean z) {
        this.f7833k = z;
    }

    /* renamed from: i */
    public final boolean m11299i() {
        return this.f7833k;
    }

    /* renamed from: b */
    public bwc mo1572b() throws IOException {
        m11278j();
        return m11274a(1, "[");
    }

    /* renamed from: c */
    public bwc mo1574c() throws IOException {
        return m11273a(1, 2, "]");
    }

    /* renamed from: d */
    public bwc mo1576d() throws IOException {
        m11278j();
        return m11274a(3, "{");
    }

    /* renamed from: e */
    public bwc mo1577e() throws IOException {
        return m11273a(3, 5, "}");
    }

    /* renamed from: a */
    private bwc m11274a(int i, String str) throws IOException {
        m11281m();
        m11275a(i);
        this.f7825c.write(str);
        return this;
    }

    /* renamed from: a */
    private bwc m11273a(int i, int i2, String str) throws IOException {
        int a = mo1566a();
        if (a != i2 && a != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f7832j != null) {
            throw new IllegalStateException("Dangling name: " + this.f7832j);
        } else {
            this.f7827e--;
            if (a == i2) {
                m11279k();
            }
            this.f7825c.write(str);
            return this;
        }
    }

    /* renamed from: a */
    private void m11275a(int i) {
        if (this.f7827e == this.f7826d.length) {
            Object obj = new int[(this.f7827e * 2)];
            System.arraycopy(this.f7826d, 0, obj, 0, this.f7827e);
            this.f7826d = obj;
        }
        int[] iArr = this.f7826d;
        int i2 = this.f7827e;
        this.f7827e = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: a */
    private int mo1566a() {
        if (this.f7827e != 0) {
            return this.f7826d[this.f7827e - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: b */
    private void m11276b(int i) {
        this.f7826d[this.f7827e - 1] = i;
    }

    /* renamed from: a */
    public bwc mo1570a(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f7832j != null) {
            throw new IllegalStateException();
        } else if (this.f7827e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        } else {
            this.f7832j = str;
            return this;
        }
    }

    /* renamed from: j */
    private void m11278j() throws IOException {
        if (this.f7832j != null) {
            m11280l();
            m11277d(this.f7832j);
            this.f7832j = null;
        }
    }

    /* renamed from: b */
    public bwc mo1573b(String str) throws IOException {
        if (str == null) {
            return mo1578f();
        }
        m11278j();
        m11281m();
        m11277d(str);
        return this;
    }

    /* renamed from: f */
    public bwc mo1578f() throws IOException {
        if (this.f7832j != null) {
            if (this.f7833k) {
                m11278j();
            } else {
                this.f7832j = null;
                return this;
            }
        }
        m11281m();
        this.f7825c.write("null");
        return this;
    }

    /* renamed from: a */
    public bwc mo1571a(boolean z) throws IOException {
        m11278j();
        m11281m();
        this.f7825c.write(z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: a */
    public bwc mo1568a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo1578f();
        }
        m11278j();
        m11281m();
        this.f7825c.write(bool.booleanValue() ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
        return this;
    }

    /* renamed from: a */
    public bwc mo1567a(long j) throws IOException {
        m11278j();
        m11281m();
        this.f7825c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public bwc mo1569a(Number number) throws IOException {
        if (number == null) {
            return mo1578f();
        }
        m11278j();
        CharSequence obj = number.toString();
        if (this.f7830h || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            m11281m();
            this.f7825c.append(obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public void flush() throws IOException {
        if (this.f7827e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f7825c.flush();
    }

    public void close() throws IOException {
        this.f7825c.close();
        int i = this.f7827e;
        if (i > 1 || (i == 1 && this.f7826d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f7827e = 0;
    }

    /* renamed from: d */
    private void m11277d(String str) throws IOException {
        int i = 0;
        String[] strArr = this.f7831i ? f7824b : f7823a;
        this.f7825c.write("\"");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            String str2;
            if (charAt < '') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    this.f7825c.write(str, i, i2 - i);
                }
                this.f7825c.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == ' ') {
                    str2 = "\\u2028";
                } else if (charAt == ' ') {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.f7825c.write(str, i, i2 - i);
                }
                this.f7825c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f7825c.write(str, i, length - i);
        }
        this.f7825c.write("\"");
    }

    /* renamed from: k */
    private void m11279k() throws IOException {
        if (this.f7828f != null) {
            this.f7825c.write("\n");
            int i = this.f7827e;
            for (int i2 = 1; i2 < i; i2++) {
                this.f7825c.write(this.f7828f);
            }
        }
    }

    /* renamed from: l */
    private void m11280l() throws IOException {
        int a = mo1566a();
        if (a == 5) {
            this.f7825c.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m11279k();
        m11276b(4);
    }

    /* renamed from: m */
    private void m11281m() throws IOException {
        switch (mo1566a()) {
            case 1:
                m11276b(2);
                m11279k();
                return;
            case 2:
                this.f7825c.append(',');
                m11279k();
                return;
            case 4:
                this.f7825c.append(this.f7829g);
                m11276b(5);
                return;
            case 6:
                break;
            case 7:
                if (!this.f7830h) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                break;
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        m11276b(7);
    }
}
