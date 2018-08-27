package com.p000;

import com.facebook.common.util.ByteConstants;
import com.facebook.internal.ServerProtocol;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

/* compiled from: JsonReader */
/* renamed from: bwa */
public class bwa implements Closeable {
    /* renamed from: b */
    private static final char[] f7801b = ")]}'\n".toCharArray();
    /* renamed from: a */
    int f7802a = 0;
    /* renamed from: c */
    private final Reader f7803c;
    /* renamed from: d */
    private boolean f7804d = false;
    /* renamed from: e */
    private final char[] f7805e = new char[ByteConstants.KB];
    /* renamed from: f */
    private int f7806f = 0;
    /* renamed from: g */
    private int f7807g = 0;
    /* renamed from: h */
    private int f7808h = 0;
    /* renamed from: i */
    private int f7809i = 0;
    /* renamed from: j */
    private long f7810j;
    /* renamed from: k */
    private int f7811k;
    /* renamed from: l */
    private String f7812l;
    /* renamed from: m */
    private int[] f7813m = new int[32];
    /* renamed from: n */
    private int f7814n = 0;
    /* renamed from: o */
    private String[] f7815o;
    /* renamed from: p */
    private int[] f7816p;

    /* compiled from: JsonReader */
    /* renamed from: bwa$1 */
    static class C15571 extends bvd {
        C15571() {
        }

        /* renamed from: a */
        public void mo1583a(bwa bwa) throws IOException {
            if (bwa instanceof bvo) {
                ((bvo) bwa).mo1563o();
                return;
            }
            int i = bwa.f7802a;
            if (i == 0) {
                i = bwa.m11250r();
            }
            if (i == 13) {
                bwa.f7802a = 9;
            } else if (i == 12) {
                bwa.f7802a = 8;
            } else if (i == 14) {
                bwa.f7802a = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + bwa.mo1554f() + bwa.m11230x());
            }
        }
    }

    static {
        bvd.f7754a = new C15571();
    }

    public bwa(Reader reader) {
        int[] iArr = this.f7813m;
        int i = this.f7814n;
        this.f7814n = i + 1;
        iArr[i] = 6;
        this.f7815o = new String[32];
        this.f7816p = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.f7803c = reader;
    }

    /* renamed from: a */
    public final void m11234a(boolean z) {
        this.f7804d = z;
    }

    /* renamed from: q */
    public final boolean m11249q() {
        return this.f7804d;
    }

    /* renamed from: a */
    public void mo1548a() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 3) {
            m11216a(1);
            this.f7816p[this.f7814n - 1] = 0;
            this.f7802a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo1554f() + m11230x());
    }

    /* renamed from: b */
    public void mo1549b() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 4) {
            this.f7814n--;
            int[] iArr = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f7802a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo1554f() + m11230x());
    }

    /* renamed from: c */
    public void mo1550c() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 1) {
            m11216a(3);
            this.f7802a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo1554f() + m11230x());
    }

    /* renamed from: d */
    public void mo1552d() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 2) {
            this.f7814n--;
            this.f7815o[this.f7814n] = null;
            int[] iArr = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f7802a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo1554f() + m11230x());
    }

    /* renamed from: e */
    public boolean mo1553e() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: f */
    public bwb mo1554f() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        switch (i) {
            case 1:
                return bwb.BEGIN_OBJECT;
            case 2:
                return bwb.END_OBJECT;
            case 3:
                return bwb.BEGIN_ARRAY;
            case 4:
                return bwb.END_ARRAY;
            case 5:
            case 6:
                return bwb.BOOLEAN;
            case 7:
                return bwb.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return bwb.STRING;
            case 12:
            case 13:
            case 14:
                return bwb.NAME;
            case 15:
            case 16:
                return bwb.NUMBER;
            case 17:
                return bwb.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: r */
    int m11250r() throws IOException {
        int b;
        int i = this.f7813m[this.f7814n - 1];
        if (i == 1) {
            this.f7813m[this.f7814n - 1] = 2;
        } else if (i == 2) {
            switch (m11219b(true)) {
                case 44:
                    break;
                case 59:
                    m11228v();
                    break;
                case 93:
                    this.f7802a = 4;
                    return 4;
                default:
                    throw m11220b("Unterminated array");
            }
        } else if (i == 3 || i == 5) {
            this.f7813m[this.f7814n - 1] = 4;
            if (i == 5) {
                switch (m11219b(true)) {
                    case 44:
                        break;
                    case 59:
                        m11228v();
                        break;
                    case 125:
                        this.f7802a = 2;
                        return 2;
                    default:
                        throw m11220b("Unterminated object");
                }
            }
            b = m11219b(true);
            switch (b) {
                case 34:
                    this.f7802a = 13;
                    return 13;
                case 39:
                    m11228v();
                    this.f7802a = 12;
                    return 12;
                case 125:
                    if (i != 5) {
                        this.f7802a = 2;
                        return 2;
                    }
                    throw m11220b("Expected name");
                default:
                    m11228v();
                    this.f7806f--;
                    if (m11217a((char) b)) {
                        this.f7802a = 14;
                        return 14;
                    }
                    throw m11220b("Expected name");
            }
        } else if (i == 4) {
            this.f7813m[this.f7814n - 1] = 5;
            switch (m11219b(true)) {
                case 58:
                    break;
                case 61:
                    m11228v();
                    if ((this.f7806f < this.f7807g || m11222b(1)) && this.f7805e[this.f7806f] == '>') {
                        this.f7806f++;
                        break;
                    }
                default:
                    throw m11220b("Expected ':'");
            }
        } else if (i == 6) {
            if (this.f7804d) {
                m11232z();
            }
            this.f7813m[this.f7814n - 1] = 7;
        } else if (i == 7) {
            if (m11219b(false) == -1) {
                this.f7802a = 17;
                return 17;
            }
            m11228v();
            this.f7806f--;
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        switch (m11219b(true)) {
            case 34:
                this.f7802a = 9;
                return 9;
            case 39:
                m11228v();
                this.f7802a = 8;
                return 8;
            case 44:
            case 59:
                break;
            case 91:
                this.f7802a = 3;
                return 3;
            case 93:
                if (i == 1) {
                    this.f7802a = 4;
                    return 4;
                }
                break;
            case 123:
                this.f7802a = 1;
                return 1;
            default:
                this.f7806f--;
                b = mo1563o();
                if (b != 0) {
                    return b;
                }
                b = m11225s();
                if (b != 0) {
                    return b;
                }
                if (m11217a(this.f7805e[this.f7806f])) {
                    m11228v();
                    this.f7802a = 10;
                    return 10;
                }
                throw m11220b("Expected value");
        }
        if (i == 1 || i == 2) {
            m11228v();
            this.f7806f--;
            this.f7802a = 7;
            return 7;
        }
        throw m11220b("Unexpected value");
    }

    /* renamed from: o */
    private int mo1563o() throws IOException {
        String str;
        int i;
        char c = this.f7805e[this.f7806f];
        String str2;
        if (c == 't' || c == 'T') {
            str = ServerProtocol.DIALOG_RETURN_SCOPES_TRUE;
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            if (this.f7806f + i2 >= this.f7807g && !m11222b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f7805e[this.f7806f + i2];
            if (c2 != str.charAt(i2) && c2 != r1.charAt(i2)) {
                return 0;
            }
            i2++;
        }
        if ((this.f7806f + length < this.f7807g || m11222b(length + 1)) && m11217a(this.f7805e[this.f7806f + length])) {
            return 0;
        }
        this.f7806f += length;
        this.f7802a = i;
        return i;
    }

    /* renamed from: s */
    private int m11225s() throws IOException {
        char[] cArr = this.f7805e;
        int i = this.f7806f;
        long j = 0;
        Object obj = null;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        int i5 = this.f7807g;
        int i6 = i;
        while (true) {
            Object obj2;
            if (i6 + i4 == i5) {
                if (i4 == cArr.length) {
                    return 0;
                }
                if (m11222b(i4 + 1)) {
                    i6 = this.f7806f;
                    i5 = this.f7807g;
                } else if (i3 != 2 && i2 != 0 && (j != Long.MIN_VALUE || obj != null)) {
                    if (obj == null) {
                        j = -j;
                    }
                    this.f7810j = j;
                    this.f7806f += i4;
                    this.f7802a = 15;
                    return 15;
                } else if (i3 == 2 && i3 != 4 && i3 != 7) {
                    return 0;
                } else {
                    this.f7811k = i4;
                    this.f7802a = 16;
                    return 16;
                }
            }
            char c = cArr[i6 + i4];
            int i7;
            switch (c) {
                case '+':
                    if (i3 != 5) {
                        return 0;
                    }
                    i = 6;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case '-':
                    if (i3 == 0) {
                        i = 1;
                        i7 = i2;
                        obj2 = 1;
                        i3 = i7;
                        continue;
                    } else if (i3 == 5) {
                        i = 6;
                        i3 = i2;
                        obj2 = obj;
                        break;
                    } else {
                        return 0;
                    }
                case '.':
                    if (i3 != 2) {
                        return 0;
                    }
                    i = 3;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                case 'E':
                case 'e':
                    if (i3 != 2 && i3 != 4) {
                        return 0;
                    }
                    i = 5;
                    i3 = i2;
                    obj2 = obj;
                    continue;
                default:
                    if (c >= '0' && c <= '9') {
                        if (i3 != 1 && i3 != 0) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 5 && i3 != 6) {
                                        i = i3;
                                        i3 = i2;
                                        obj2 = obj;
                                        break;
                                    }
                                    i = 7;
                                    i3 = i2;
                                    obj2 = obj;
                                    break;
                                }
                                i = 4;
                                i3 = i2;
                                obj2 = obj;
                                break;
                            } else if (j != 0) {
                                long j2 = (10 * j) - ((long) (c - 48));
                                i = (j > -922337203685477580L || (j == -922337203685477580L && j2 < j)) ? 1 : 0;
                                i &= i2;
                                obj2 = obj;
                                j = j2;
                                i7 = i3;
                                i3 = i;
                                i = i7;
                                break;
                            } else {
                                return 0;
                            }
                        }
                        j = (long) (-(c - 48));
                        i = 2;
                        i3 = i2;
                        obj2 = obj;
                        continue;
                    } else if (m11217a(c)) {
                        return 0;
                    }
                    break;
            }
            if (i3 != 2) {
            }
            if (i3 == 2) {
            }
            this.f7811k = i4;
            this.f7802a = 16;
            return 16;
            i4++;
            obj = obj2;
            i2 = i3;
            i3 = i;
        }
    }

    /* renamed from: a */
    private boolean m11217a(char c) throws IOException {
        switch (c) {
            case '\t':
            case '\n':
            case '\f':
            case '\r':
            case ' ':
            case ',':
            case ':':
            case '[':
            case ']':
            case '{':
            case '}':
                break;
            case '#':
            case '/':
            case ';':
            case '=':
            case '\\':
                m11228v();
                break;
            default:
                return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo1555g() throws IOException {
        String t;
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 14) {
            t = m11226t();
        } else if (i == 12) {
            t = m11221b('\'');
        } else if (i == 13) {
            t = m11221b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo1554f() + m11230x());
        }
        this.f7802a = 0;
        this.f7815o[this.f7814n - 1] = t;
        return t;
    }

    /* renamed from: h */
    public String mo1556h() throws IOException {
        String t;
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 10) {
            t = m11226t();
        } else if (i == 8) {
            t = m11221b('\'');
        } else if (i == 9) {
            t = m11221b('\"');
        } else if (i == 11) {
            t = this.f7812l;
            this.f7812l = null;
        } else if (i == 15) {
            t = Long.toString(this.f7810j);
        } else if (i == 16) {
            t = new String(this.f7805e, this.f7806f, this.f7811k);
            this.f7806f += this.f7811k;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo1554f() + m11230x());
        }
        this.f7802a = 0;
        int[] iArr = this.f7816p;
        int i2 = this.f7814n - 1;
        iArr[i2] = iArr[i2] + 1;
        return t;
    }

    /* renamed from: i */
    public boolean mo1557i() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 5) {
            this.f7802a = 0;
            int[] iArr = this.f7816p;
            i = this.f7814n - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        } else if (i == 6) {
            this.f7802a = 0;
            int[] iArr2 = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo1554f() + m11230x());
        }
    }

    /* renamed from: j */
    public void mo1558j() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 7) {
            this.f7802a = 0;
            int[] iArr = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo1554f() + m11230x());
    }

    /* renamed from: k */
    public double mo1559k() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 15) {
            this.f7802a = 0;
            int[] iArr = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f7810j;
        }
        if (i == 16) {
            this.f7812l = new String(this.f7805e, this.f7806f, this.f7811k);
            this.f7806f += this.f7811k;
        } else if (i == 8 || i == 9) {
            this.f7812l = m11221b(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f7812l = m11226t();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + mo1554f() + m11230x());
        }
        this.f7802a = 11;
        double parseDouble = Double.parseDouble(this.f7812l);
        if (this.f7804d || !(Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            this.f7812l = null;
            this.f7802a = 0;
            int[] iArr2 = this.f7816p;
            int i3 = this.f7814n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new bwd("JSON forbids NaN and infinities: " + parseDouble + m11230x());
    }

    /* renamed from: l */
    public long mo1560l() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        if (i == 15) {
            this.f7802a = 0;
            int[] iArr = this.f7816p;
            int i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f7810j;
        }
        long parseLong;
        if (i == 16) {
            this.f7812l = new String(this.f7805e, this.f7806f, this.f7811k);
            this.f7806f += this.f7811k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.f7812l = m11226t();
            } else {
                this.f7812l = m11221b(i == 8 ? '\'' : '\"');
            }
            try {
                parseLong = Long.parseLong(this.f7812l);
                this.f7802a = 0;
                int[] iArr2 = this.f7816p;
                int i3 = this.f7814n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException e) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + mo1554f() + m11230x());
        }
        this.f7802a = 11;
        double parseDouble = Double.parseDouble(this.f7812l);
        parseLong = (long) parseDouble;
        if (((double) parseLong) != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f7812l + m11230x());
        }
        this.f7812l = null;
        this.f7802a = 0;
        iArr2 = this.f7816p;
        i3 = this.f7814n - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseLong;
    }

    /* renamed from: b */
    private String m11221b(char c) throws IOException {
        char[] cArr = this.f7805e;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            int i = this.f7806f;
            int i2 = this.f7807g;
            int i3 = i;
            while (i3 < i2) {
                int i4 = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f7806f = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    return stringBuilder.toString();
                }
                if (c2 == '\\') {
                    this.f7806f = i4;
                    stringBuilder.append(cArr, i, (i4 - i) - 1);
                    stringBuilder.append(m11231y());
                    i = this.f7806f;
                    i2 = this.f7807g;
                    i4 = i;
                } else if (c2 == '\n') {
                    this.f7808h++;
                    this.f7809i = i4;
                }
                i3 = i4;
            }
            stringBuilder.append(cArr, i, i3 - i);
            this.f7806f = i3;
        } while (m11222b(1));
        throw m11220b("Unterminated string");
    }

    /* renamed from: t */
    private String m11226t() throws IOException {
        StringBuilder stringBuilder = null;
        int i = 0;
        while (true) {
            String str;
            if (this.f7806f + i < this.f7807g) {
                switch (this.f7805e[this.f7806f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m11228v();
                        break;
                    default:
                        i++;
                        continue;
                }
            } else if (i >= this.f7805e.length) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(this.f7805e, this.f7806f, i);
                this.f7806f = i + this.f7806f;
                if (m11222b(1)) {
                    i = 0;
                } else {
                    i = 0;
                }
            } else if (m11222b(i + 1)) {
            }
            if (stringBuilder == null) {
                str = new String(this.f7805e, this.f7806f, i);
            } else {
                stringBuilder.append(this.f7805e, this.f7806f, i);
                str = stringBuilder.toString();
            }
            this.f7806f = i + this.f7806f;
            return str;
        }
    }

    /* renamed from: c */
    private void m11223c(char c) throws IOException {
        char[] cArr = this.f7805e;
        do {
            int i = this.f7806f;
            int i2 = this.f7807g;
            int i3 = i;
            while (i3 < i2) {
                i = i3 + 1;
                char c2 = cArr[i3];
                if (c2 == c) {
                    this.f7806f = i;
                    return;
                }
                if (c2 == '\\') {
                    this.f7806f = i;
                    m11231y();
                    i = this.f7806f;
                    i2 = this.f7807g;
                } else if (c2 == '\n') {
                    this.f7808h++;
                    this.f7809i = i;
                }
                i3 = i;
            }
            this.f7806f = i3;
        } while (m11222b(1));
        throw m11220b("Unterminated string");
    }

    /* renamed from: u */
    private void m11227u() throws IOException {
        do {
            int i = 0;
            while (this.f7806f + i < this.f7807g) {
                switch (this.f7805e[this.f7806f + i]) {
                    case '\t':
                    case '\n':
                    case '\f':
                    case '\r':
                    case ' ':
                    case ',':
                    case ':':
                    case '[':
                    case ']':
                    case '{':
                    case '}':
                        break;
                    case '#':
                    case '/':
                    case ';':
                    case '=':
                    case '\\':
                        m11228v();
                        break;
                    default:
                        i++;
                }
                this.f7806f = i + this.f7806f;
                return;
            }
            this.f7806f = i + this.f7806f;
        } while (m11222b(1));
    }

    /* renamed from: m */
    public int mo1561m() throws IOException {
        int i = this.f7802a;
        if (i == 0) {
            i = m11250r();
        }
        int[] iArr;
        int i2;
        if (i == 15) {
            i = (int) this.f7810j;
            if (this.f7810j != ((long) i)) {
                throw new NumberFormatException("Expected an int but was " + this.f7810j + m11230x());
            }
            this.f7802a = 0;
            iArr = this.f7816p;
            i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
        } else {
            if (i == 16) {
                this.f7812l = new String(this.f7805e, this.f7806f, this.f7811k);
                this.f7806f += this.f7811k;
            } else if (i == 8 || i == 9 || i == 10) {
                if (i == 10) {
                    this.f7812l = m11226t();
                } else {
                    this.f7812l = m11221b(i == 8 ? '\'' : '\"');
                }
                try {
                    i = Integer.parseInt(this.f7812l);
                    this.f7802a = 0;
                    iArr = this.f7816p;
                    i2 = this.f7814n - 1;
                    iArr[i2] = iArr[i2] + 1;
                } catch (NumberFormatException e) {
                }
            } else {
                throw new IllegalStateException("Expected an int but was " + mo1554f() + m11230x());
            }
            this.f7802a = 11;
            double parseDouble = Double.parseDouble(this.f7812l);
            i = (int) parseDouble;
            if (((double) i) != parseDouble) {
                throw new NumberFormatException("Expected an int but was " + this.f7812l + m11230x());
            }
            this.f7812l = null;
            this.f7802a = 0;
            iArr = this.f7816p;
            i2 = this.f7814n - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return i;
    }

    public void close() throws IOException {
        this.f7802a = 0;
        this.f7813m[0] = 8;
        this.f7814n = 1;
        this.f7803c.close();
    }

    /* renamed from: n */
    public void mo1562n() throws IOException {
        int i = 0;
        do {
            int i2 = this.f7802a;
            if (i2 == 0) {
                i2 = m11250r();
            }
            if (i2 == 3) {
                m11216a(1);
                i++;
            } else if (i2 == 1) {
                m11216a(3);
                i++;
            } else if (i2 == 4) {
                this.f7814n--;
                i--;
            } else if (i2 == 2) {
                this.f7814n--;
                i--;
            } else if (i2 == 14 || i2 == 10) {
                m11227u();
            } else if (i2 == 8 || i2 == 12) {
                m11223c('\'');
            } else if (i2 == 9 || i2 == 13) {
                m11223c('\"');
            } else if (i2 == 16) {
                this.f7806f += this.f7811k;
            }
            this.f7802a = 0;
        } while (i != 0);
        int[] iArr = this.f7816p;
        int i3 = this.f7814n - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f7815o[this.f7814n - 1] = "null";
    }

    /* renamed from: a */
    private void m11216a(int i) {
        if (this.f7814n == this.f7813m.length) {
            Object obj = new int[(this.f7814n * 2)];
            Object obj2 = new int[(this.f7814n * 2)];
            Object obj3 = new String[(this.f7814n * 2)];
            System.arraycopy(this.f7813m, 0, obj, 0, this.f7814n);
            System.arraycopy(this.f7816p, 0, obj2, 0, this.f7814n);
            System.arraycopy(this.f7815o, 0, obj3, 0, this.f7814n);
            this.f7813m = obj;
            this.f7816p = obj2;
            this.f7815o = obj3;
        }
        int[] iArr = this.f7813m;
        int i2 = this.f7814n;
        this.f7814n = i2 + 1;
        iArr[i2] = i;
    }

    /* renamed from: b */
    private boolean m11222b(int i) throws IOException {
        Object obj = this.f7805e;
        this.f7809i -= this.f7806f;
        if (this.f7807g != this.f7806f) {
            this.f7807g -= this.f7806f;
            System.arraycopy(obj, this.f7806f, obj, 0, this.f7807g);
        } else {
            this.f7807g = 0;
        }
        this.f7806f = 0;
        do {
            int read = this.f7803c.read(obj, this.f7807g, obj.length - this.f7807g);
            if (read == -1) {
                return false;
            }
            this.f7807g = read + this.f7807g;
            if (this.f7808h == 0 && this.f7809i == 0 && this.f7807g > 0 && obj[0] == '﻿') {
                this.f7806f++;
                this.f7809i++;
                i++;
            }
        } while (this.f7807g < i);
        return true;
    }

    /* renamed from: b */
    private int m11219b(boolean z) throws IOException {
        char[] cArr = this.f7805e;
        int i = this.f7806f;
        int i2 = this.f7807g;
        while (true) {
            if (i == i2) {
                this.f7806f = i;
                if (m11222b(1)) {
                    i = this.f7806f;
                    i2 = this.f7807g;
                } else if (!z) {
                    return -1;
                } else {
                    throw new EOFException("End of input" + m11230x());
                }
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f7808h++;
                this.f7809i = i3;
                i = i3;
            } else if (c == ' ' || c == '\r') {
                i = i3;
            } else if (c == '\t') {
                i = i3;
            } else if (c == '/') {
                this.f7806f = i3;
                if (i3 == i2) {
                    this.f7806f--;
                    boolean b = m11222b(2);
                    this.f7806f++;
                    if (!b) {
                        return c;
                    }
                }
                m11228v();
                switch (cArr[this.f7806f]) {
                    case '*':
                        this.f7806f++;
                        if (m11218a("*/")) {
                            i = this.f7806f + 2;
                            i2 = this.f7807g;
                            break;
                        }
                        throw m11220b("Unterminated comment");
                    case '/':
                        this.f7806f++;
                        m11229w();
                        i = this.f7806f;
                        i2 = this.f7807g;
                        break;
                    default:
                        return c;
                }
            } else if (c == '#') {
                this.f7806f = i3;
                m11228v();
                m11229w();
                i = this.f7806f;
                i2 = this.f7807g;
            } else {
                this.f7806f = i3;
                return c;
            }
        }
    }

    /* renamed from: v */
    private void m11228v() throws IOException {
        if (!this.f7804d) {
            throw m11220b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: w */
    private void m11229w() throws IOException {
        char c;
        do {
            if (this.f7806f < this.f7807g || m11222b(1)) {
                char[] cArr = this.f7805e;
                int i = this.f7806f;
                this.f7806f = i + 1;
                c = cArr[i];
                if (c == '\n') {
                    this.f7808h++;
                    this.f7809i = this.f7806f;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: a */
    private boolean m11218a(String str) throws IOException {
        while (true) {
            if (this.f7806f + str.length() > this.f7807g && !m11222b(str.length())) {
                return false;
            }
            if (this.f7805e[this.f7806f] == '\n') {
                this.f7808h++;
                this.f7809i = this.f7806f + 1;
            } else {
                int i = 0;
                while (i < str.length()) {
                    if (this.f7805e[this.f7806f + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f7806f++;
        }
    }

    public String toString() {
        return getClass().getSimpleName() + m11230x();
    }

    /* renamed from: x */
    private String m11230x() {
        return " at line " + (this.f7808h + 1) + " column " + ((this.f7806f - this.f7809i) + 1) + " path " + mo1564p();
    }

    /* renamed from: p */
    public String mo1564p() {
        StringBuilder append = new StringBuilder().append('$');
        int i = this.f7814n;
        for (int i2 = 0; i2 < i; i2++) {
            switch (this.f7813m[i2]) {
                case 1:
                case 2:
                    append.append('[').append(this.f7816p[i2]).append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    append.append('.');
                    if (this.f7815o[i2] == null) {
                        break;
                    }
                    append.append(this.f7815o[i2]);
                    break;
                default:
                    break;
            }
        }
        return append.toString();
    }

    /* renamed from: y */
    private char m11231y() throws IOException {
        if (this.f7806f != this.f7807g || m11222b(1)) {
            char[] cArr = this.f7805e;
            int i = this.f7806f;
            this.f7806f = i + 1;
            char c = cArr[i];
            switch (c) {
                case '\n':
                    this.f7808h++;
                    this.f7809i = this.f7806f;
                    return c;
                case '\"':
                case '\'':
                case '/':
                case '\\':
                    return c;
                case 'b':
                    return '\b';
                case 'f':
                    return '\f';
                case 'n':
                    return '\n';
                case 'r':
                    return '\r';
                case 't':
                    return '\t';
                case 'u':
                    if (this.f7806f + 4 <= this.f7807g || m11222b(4)) {
                        int i2 = this.f7806f;
                        int i3 = i2 + 4;
                        int i4 = i2;
                        c = '\u0000';
                        for (i = i4; i < i3; i++) {
                            char c2 = this.f7805e[i];
                            c = (char) (c << 4);
                            if (c2 >= '0' && c2 <= '9') {
                                c = (char) (c + (c2 - 48));
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                c = (char) (c + ((c2 - 97) + 10));
                            } else if (c2 < 'A' || c2 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.f7805e, this.f7806f, 4));
                            } else {
                                c = (char) (c + ((c2 - 65) + 10));
                            }
                        }
                        this.f7806f += 4;
                        return c;
                    }
                    throw m11220b("Unterminated escape sequence");
                default:
                    throw m11220b("Invalid escape sequence");
            }
        }
        throw m11220b("Unterminated escape sequence");
    }

    /* renamed from: b */
    private IOException m11220b(String str) throws IOException {
        throw new bwd(str + m11230x());
    }

    /* renamed from: z */
    private void m11232z() throws IOException {
        m11219b(true);
        this.f7806f--;
        if (this.f7806f + f7801b.length <= this.f7807g || m11222b(f7801b.length)) {
            int i = 0;
            while (i < f7801b.length) {
                if (this.f7805e[this.f7806f + i] == f7801b[i]) {
                    i++;
                } else {
                    return;
                }
            }
            this.f7806f += f7801b.length;
        }
    }
}
