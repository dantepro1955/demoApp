package com.p000;

import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.stetho.dumpapp.Framer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* compiled from: Buffer */
/* renamed from: drq */
public final class drq implements drr, drs, Cloneable {
    /* renamed from: c */
    private static final byte[] f22758c = new byte[]{(byte) 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    /* renamed from: a */
    dsd f22759a;
    /* renamed from: b */
    long f22760b;

    /* compiled from: Buffer */
    /* renamed from: drq$1 */
    class C50621 extends OutputStream {
        /* renamed from: a */
        final /* synthetic */ drq f22756a;

        C50621(drq drq) {
            this.f22756a = drq;
        }

        public void write(int i) {
            this.f22756a.m28966b((byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            this.f22756a.m28968b(bArr, i, i2);
        }

        public void flush() {
        }

        public void close() {
        }

        public String toString() {
            return this.f22756a + ".outputStream()";
        }
    }

    /* compiled from: Buffer */
    /* renamed from: drq$2 */
    class C50632 extends InputStream {
        /* renamed from: a */
        final /* synthetic */ drq f22757a;

        C50632(drq drq) {
            this.f22757a = drq;
        }

        public int read() {
            if (this.f22757a.f22760b > 0) {
                return this.f22757a.mo4591i() & 255;
            }
            return -1;
        }

        public int read(byte[] bArr, int i, int i2) {
            return this.f22757a.mo4568a(bArr, i, i2);
        }

        public int available() {
            return (int) Math.min(this.f22757a.f22760b, 2147483647L);
        }

        public void close() {
        }

        public String toString() {
            return this.f22757a + ".inputStream()";
        }
    }

    /* renamed from: b */
    public /* synthetic */ drr mo4578b(drt drt) throws IOException {
        return m28953a(drt);
    }

    /* renamed from: b */
    public /* synthetic */ drr mo4579b(String str) throws IOException {
        return m28954a(str);
    }

    /* renamed from: c */
    public /* synthetic */ drr mo4581c(byte[] bArr) throws IOException {
        return m28967b(bArr);
    }

    /* renamed from: c */
    public /* synthetic */ drr mo4582c(byte[] bArr, int i, int i2) throws IOException {
        return m28968b(bArr, i, i2);
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m29013w();
    }

    /* renamed from: g */
    public /* synthetic */ drr mo4586g(int i) throws IOException {
        return m28978d(i);
    }

    /* renamed from: h */
    public /* synthetic */ drr mo4589h(int i) throws IOException {
        return m28973c(i);
    }

    /* renamed from: i */
    public /* synthetic */ drr mo4592i(int i) throws IOException {
        return m28966b(i);
    }

    /* renamed from: l */
    public /* synthetic */ drr mo4596l(long j) throws IOException {
        return m28998k(j);
    }

    /* renamed from: m */
    public /* synthetic */ drr mo4597m(long j) throws IOException {
        return m28995j(j);
    }

    /* renamed from: n */
    public /* synthetic */ drr mo4600n(long j) throws IOException {
        return m28993i(j);
    }

    /* renamed from: y */
    public /* synthetic */ drr mo4605y() throws IOException {
        return m28977d();
    }

    /* renamed from: a */
    public long m28946a() {
        return this.f22760b;
    }

    /* renamed from: b */
    public drq mo4577b() {
        return this;
    }

    /* renamed from: c */
    public OutputStream m28976c() {
        return new C50621(this);
    }

    /* renamed from: d */
    public drq m28977d() {
        return this;
    }

    /* renamed from: e */
    public drr mo4584e() {
        return this;
    }

    /* renamed from: f */
    public boolean mo4585f() {
        return this.f22760b == 0;
    }

    /* renamed from: a */
    public void mo4573a(long j) throws EOFException {
        if (this.f22760b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public boolean mo4580b(long j) {
        return this.f22760b >= j;
    }

    /* renamed from: g */
    public InputStream mo4587g() {
        return new C50632(this);
    }

    /* renamed from: a */
    public drq m28952a(drq drq, long j, long j2) {
        if (drq == null) {
            throw new IllegalArgumentException("out == null");
        }
        dsj.m29130a(this.f22760b, j, j2);
        if (j2 != 0) {
            drq.f22760b += j2;
            dsd dsd = this.f22759a;
            while (j >= ((long) (dsd.f22794c - dsd.f22793b))) {
                j -= (long) (dsd.f22794c - dsd.f22793b);
                dsd = dsd.f22797f;
            }
            while (j2 > 0) {
                dsd dsd2 = new dsd(dsd);
                dsd2.f22793b = (int) (((long) dsd2.f22793b) + j);
                dsd2.f22794c = Math.min(dsd2.f22793b + ((int) j2), dsd2.f22794c);
                if (drq.f22759a == null) {
                    dsd2.f22798g = dsd2;
                    dsd2.f22797f = dsd2;
                    drq.f22759a = dsd2;
                } else {
                    drq.f22759a.f22798g.m29107a(dsd2);
                }
                j2 -= (long) (dsd2.f22794c - dsd2.f22793b);
                dsd = dsd.f22797f;
                j = 0;
            }
        }
        return this;
    }

    /* renamed from: h */
    public long m28989h() {
        long j = this.f22760b;
        if (j == 0) {
            return 0;
        }
        dsd dsd = this.f22759a.f22798g;
        if (dsd.f22794c >= Utility.DEFAULT_STREAM_BUFFER_SIZE || !dsd.f22796e) {
            return j;
        }
        return j - ((long) (dsd.f22794c - dsd.f22793b));
    }

    /* renamed from: i */
    public byte mo4591i() {
        if (this.f22760b == 0) {
            throw new IllegalStateException("size == 0");
        }
        dsd dsd = this.f22759a;
        int i = dsd.f22793b;
        int i2 = dsd.f22794c;
        int i3 = i + 1;
        byte b = dsd.f22792a[i];
        this.f22760b--;
        if (i3 == i2) {
            this.f22759a = dsd.m29105a();
            dse.m29111a(dsd);
        } else {
            dsd.f22793b = i3;
        }
        return b;
    }

    /* renamed from: c */
    public byte m28972c(long j) {
        dsj.m29130a(this.f22760b, j, 1);
        dsd dsd = this.f22759a;
        while (true) {
            int i = dsd.f22794c - dsd.f22793b;
            if (j < ((long) i)) {
                return dsd.f22792a[dsd.f22793b + ((int) j)];
            }
            j -= (long) i;
            dsd = dsd.f22797f;
        }
    }

    /* renamed from: j */
    public short mo4593j() {
        if (this.f22760b < 2) {
            throw new IllegalStateException("size < 2: " + this.f22760b);
        }
        dsd dsd = this.f22759a;
        int i = dsd.f22793b;
        int i2 = dsd.f22794c;
        if (i2 - i < 2) {
            return (short) (((mo4591i() & 255) << 8) | (mo4591i() & 255));
        }
        byte[] bArr = dsd.f22792a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f22760b -= 2;
        if (i4 == i2) {
            this.f22759a = dsd.m29105a();
            dse.m29111a(dsd);
        } else {
            dsd.f22793b = i4;
        }
        return (short) i;
    }

    /* renamed from: k */
    public int mo4594k() {
        if (this.f22760b < 4) {
            throw new IllegalStateException("size < 4: " + this.f22760b);
        }
        dsd dsd = this.f22759a;
        int i = dsd.f22793b;
        int i2 = dsd.f22794c;
        if (i2 - i < 4) {
            return ((((mo4591i() & 255) << 24) | ((mo4591i() & 255) << 16)) | ((mo4591i() & 255) << 8)) | (mo4591i() & 255);
        }
        byte[] bArr = dsd.f22792a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        i3 = i4 + 1;
        i |= (bArr[i4] & 255) << 8;
        i4 = i3 + 1;
        i |= bArr[i3] & 255;
        this.f22760b -= 4;
        if (i4 == i2) {
            this.f22759a = dsd.m29105a();
            dse.m29111a(dsd);
            return i;
        }
        dsd.f22793b = i4;
        return i;
    }

    /* renamed from: l */
    public long mo4595l() {
        if (this.f22760b < 8) {
            throw new IllegalStateException("size < 8: " + this.f22760b);
        }
        dsd dsd = this.f22759a;
        int i = dsd.f22793b;
        int i2 = dsd.f22794c;
        if (i2 - i < 8) {
            return ((((long) mo4594k()) & 4294967295L) << 32) | (((long) mo4594k()) & 4294967295L);
        }
        byte[] bArr = dsd.f22792a;
        int i3 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        i = i3 + 1;
        long j2 = ((((long) bArr[i3]) & 255) << 48) | j;
        int i4 = i + 1;
        i = i4 + 1;
        j2 = (j2 | ((((long) bArr[i]) & 255) << 40)) | ((((long) bArr[i4]) & 255) << 32);
        i4 = i + 1;
        i = i4 + 1;
        j2 = (j2 | ((((long) bArr[i]) & 255) << 24)) | ((((long) bArr[i4]) & 255) << 16);
        i4 = i + 1;
        int i5 = i4 + 1;
        long j3 = (((long) bArr[i4]) & 255) | (j2 | ((((long) bArr[i]) & 255) << 8));
        this.f22760b -= 8;
        if (i5 == i2) {
            this.f22759a = dsd.m29105a();
            dse.m29111a(dsd);
            return j3;
        }
        dsd.f22793b = i5;
        return j3;
    }

    /* renamed from: m */
    public short mo4598m() {
        return dsj.m29129a(mo4593j());
    }

    /* renamed from: n */
    public int mo4599n() {
        return dsj.m29128a(mo4594k());
    }

    /* renamed from: o */
    public long mo4601o() {
        if (this.f22760b == 0) {
            throw new IllegalStateException("size == 0");
        }
        long j = 0;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        long j2 = -7;
        do {
            dsd dsd = this.f22759a;
            byte[] bArr = dsd.f22792a;
            int i2 = dsd.f22793b;
            int i3 = dsd.f22794c;
            while (i2 < i3) {
                int i4 = bArr[i2];
                if (i4 >= (byte) 48 && i4 <= (byte) 57) {
                    int i5 = 48 - i4;
                    if (j < -922337203685477580L || (j == -922337203685477580L && ((long) i5) < j2)) {
                        drq b = new drq().m28995j(j).m28966b(i4);
                        if (obj == null) {
                            b.mo4591i();
                        }
                        throw new NumberFormatException("Number too large: " + b.m29008r());
                    }
                    j = (j * 10) + ((long) i5);
                } else if (i4 != 45 || i != 0) {
                    if (i != 0) {
                        obj2 = 1;
                        if (i2 != i3) {
                            this.f22759a = dsd.m29105a();
                            dse.m29111a(dsd);
                        } else {
                            dsd.f22793b = i2;
                        }
                        if (obj2 == null) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9] or '-' character but was 0x" + Integer.toHexString(i4));
                    }
                } else {
                    obj = 1;
                    j2--;
                }
                i2++;
                i++;
            }
            if (i2 != i3) {
                dsd.f22793b = i2;
            } else {
                this.f22759a = dsd.m29105a();
                dse.m29111a(dsd);
            }
            if (obj2 == null) {
                break;
            }
        } while (this.f22759a != null);
        this.f22760b -= (long) i;
        if (obj != null) {
            return j;
        }
        return -j;
    }

    /* renamed from: p */
    public long mo4602p() {
        if (this.f22760b == 0) {
            throw new IllegalStateException("size == 0");
        }
        long j = 0;
        int i = 0;
        Object obj = null;
        do {
            dsd dsd = this.f22759a;
            byte[] bArr = dsd.f22792a;
            int i2 = dsd.f22793b;
            int i3 = dsd.f22794c;
            int i4 = i2;
            while (i4 < i3) {
                byte b = bArr[i4];
                if (b >= (byte) 48 && b <= (byte) 57) {
                    i2 = b - 48;
                } else if (b >= (byte) 97 && b <= (byte) 102) {
                    i2 = (b - 97) + 10;
                } else if (b < (byte) 65 || b > (byte) 70) {
                    if (i != 0) {
                        obj = 1;
                        if (i4 != i3) {
                            this.f22759a = dsd.m29105a();
                            dse.m29111a(dsd);
                        } else {
                            dsd.f22793b = i4;
                        }
                        if (obj == null) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b));
                    }
                } else {
                    i2 = (b - 65) + 10;
                }
                if ((-1152921504606846976L & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new drq().m28998k(j).m28966b((int) b).m29008r());
                }
                i++;
                i4++;
                j = ((long) i2) | (j << 4);
            }
            if (i4 != i3) {
                dsd.f22793b = i4;
            } else {
                this.f22759a = dsd.m29105a();
                dse.m29111a(dsd);
            }
            if (obj == null) {
                break;
            }
        } while (this.f22759a != null);
        this.f22760b -= (long) i;
        return j;
    }

    /* renamed from: q */
    public drt m29007q() {
        return new drt(mo4604u());
    }

    /* renamed from: d */
    public drt mo4583d(long j) throws EOFException {
        return new drt(mo4588g(j));
    }

    /* renamed from: a */
    public void mo4574a(drq drq, long j) throws EOFException {
        if (this.f22760b < j) {
            drq.write(this, this.f22760b);
            throw new EOFException();
        } else {
            drq.write(this, j);
        }
    }

    /* renamed from: a */
    public long mo4570a(dsg dsg) throws IOException {
        long j = this.f22760b;
        if (j > 0) {
            dsg.write(this, j);
        }
        return j;
    }

    /* renamed from: r */
    public String m29008r() {
        try {
            return m28958a(this.f22760b, dsj.f22803a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public String m28982e(long j) throws EOFException {
        return m28958a(j, dsj.f22803a);
    }

    /* renamed from: a */
    public String mo4572a(Charset charset) {
        try {
            return m28958a(this.f22760b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String m28958a(long j, Charset charset) throws EOFException {
        dsj.m29130a(this.f22760b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            dsd dsd = this.f22759a;
            if (((long) dsd.f22793b) + j > ((long) dsd.f22794c)) {
                return new String(mo4588g(j), charset);
            }
            String str = new String(dsd.f22792a, dsd.f22793b, (int) j, charset);
            dsd.f22793b = (int) (((long) dsd.f22793b) + j);
            this.f22760b -= j;
            if (dsd.f22793b != dsd.f22794c) {
                return str;
            }
            this.f22759a = dsd.m29105a();
            dse.m29111a(dsd);
            return str;
        }
    }

    /* renamed from: s */
    public String mo4603s() throws EOFException {
        long a = mo4569a((byte) 10);
        if (a != -1) {
            return m28984f(a);
        }
        drq drq = new drq();
        m28952a(drq, 0, Math.min(32, this.f22760b));
        throw new EOFException("\\n not found: size=" + m28946a() + " content=" + drq.m29007q().mo4625f() + "…");
    }

    /* renamed from: f */
    String m28984f(long j) throws EOFException {
        if (j <= 0 || m28972c(j - 1) != (byte) 13) {
            String e = m28982e(j);
            mo4590h(1);
            return e;
        }
        e = m28982e(j - 1);
        mo4590h(2);
        return e;
    }

    /* renamed from: t */
    public int m29010t() throws EOFException {
        if (this.f22760b == 0) {
            throw new EOFException();
        }
        int i;
        int i2;
        int i3;
        byte c = m28972c(0);
        if ((c & 128) == 0) {
            i = 0;
            i2 = c & 127;
            i3 = 1;
        } else if ((c & 224) == JfifUtil.MARKER_SOFn) {
            i2 = c & 31;
            i3 = 2;
            i = 128;
        } else if ((c & 240) == 224) {
            i2 = c & 15;
            i3 = 3;
            i = 2048;
        } else if ((c & 248) == 240) {
            i2 = c & 7;
            i3 = 4;
            i = NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        } else {
            mo4590h(1);
            return 65533;
        }
        if (this.f22760b < ((long) i3)) {
            throw new EOFException("size < " + i3 + ": " + this.f22760b + " (to read code point prefixed 0x" + Integer.toHexString(c) + ")");
        }
        int i4 = i2;
        i2 = 1;
        while (i2 < i3) {
            c = m28972c((long) i2);
            if ((c & JfifUtil.MARKER_SOFn) == 128) {
                i2++;
                i4 = (c & 63) | (i4 << 6);
            } else {
                mo4590h((long) i2);
                return 65533;
            }
        }
        mo4590h((long) i3);
        if (i4 > 1114111) {
            return 65533;
        }
        if (i4 >= 55296 && i4 <= 57343) {
            return 65533;
        }
        if (i4 < i) {
            return 65533;
        }
        return i4;
    }

    /* renamed from: u */
    public byte[] mo4604u() {
        try {
            return mo4588g(this.f22760b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    public byte[] mo4588g(long j) throws EOFException {
        dsj.m29130a(this.f22760b, 0, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[((int) j)];
        mo4575a(bArr);
        return bArr;
    }

    /* renamed from: a */
    public void mo4575a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo4568a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    /* renamed from: a */
    public int mo4568a(byte[] bArr, int i, int i2) {
        dsj.m29130a((long) bArr.length, (long) i, (long) i2);
        dsd dsd = this.f22759a;
        if (dsd == null) {
            return -1;
        }
        int min = Math.min(i2, dsd.f22794c - dsd.f22793b);
        System.arraycopy(dsd.f22792a, dsd.f22793b, bArr, i, min);
        dsd.f22793b += min;
        this.f22760b -= (long) min;
        if (dsd.f22793b != dsd.f22794c) {
            return min;
        }
        this.f22759a = dsd.m29105a();
        dse.m29111a(dsd);
        return min;
    }

    /* renamed from: v */
    public void m29012v() {
        try {
            mo4590h(this.f22760b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public void mo4590h(long j) throws EOFException {
        while (j > 0) {
            if (this.f22759a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.f22759a.f22794c - this.f22759a.f22793b));
            this.f22760b -= (long) min;
            j -= (long) min;
            dsd dsd = this.f22759a;
            dsd.f22793b = min + dsd.f22793b;
            if (this.f22759a.f22793b == this.f22759a.f22794c) {
                dsd dsd2 = this.f22759a;
                this.f22759a = dsd2.m29105a();
                dse.m29111a(dsd2);
            }
        }
    }

    /* renamed from: a */
    public drq m28953a(drt drt) {
        if (drt == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        drt.mo4617a(this);
        return this;
    }

    /* renamed from: a */
    public drq m28954a(String str) {
        return m28955a(str, 0, str.length());
    }

    /* renamed from: a */
    public drq m28955a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else {
            while (i < i2) {
                int i3;
                char charAt = str.charAt(i);
                if (charAt < '') {
                    int i4;
                    dsd e = m28981e(1);
                    byte[] bArr = e.f22792a;
                    int i5 = e.f22794c - i;
                    int min = Math.min(i2, 8192 - i5);
                    i3 = i + 1;
                    bArr[i5 + i] = (byte) charAt;
                    while (i3 < min) {
                        char charAt2 = str.charAt(i3);
                        if (charAt2 >= '') {
                            break;
                        }
                        i4 = i3 + 1;
                        bArr[i3 + i5] = (byte) charAt2;
                        i3 = i4;
                    }
                    i4 = (i3 + i5) - e.f22794c;
                    e.f22794c += i4;
                    this.f22760b += (long) i4;
                } else if (charAt < 'ࠀ') {
                    m28966b((charAt >> 6) | JfifUtil.MARKER_SOFn);
                    m28966b((charAt & 63) | 128);
                    i3 = i + 1;
                } else if (charAt < '?' || charAt > '?') {
                    m28966b((charAt >> 12) | 224);
                    m28966b(((charAt >> 6) & 63) | 128);
                    m28966b((charAt & 63) | 128);
                    i3 = i + 1;
                } else {
                    i3 = i + 1 < i2 ? str.charAt(i + 1) : 0;
                    if (charAt > '?' || i3 < 56320 || i3 > 57343) {
                        m28966b(63);
                        i++;
                    } else {
                        i3 = ((i3 & -56321) | ((charAt & -55297) << 10)) + NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
                        m28966b((i3 >> 18) | 240);
                        m28966b(((i3 >> 12) & 63) | 128);
                        m28966b(((i3 >> 6) & 63) | 128);
                        m28966b((i3 & 63) | 128);
                        i3 = i + 2;
                    }
                }
                i = i3;
            }
            return this;
        }
    }

    /* renamed from: a */
    public drq m28951a(int i) {
        if (i < 128) {
            m28966b(i);
        } else if (i < 2048) {
            m28966b((i >> 6) | JfifUtil.MARKER_SOFn);
            m28966b((i & 63) | 128);
        } else if (i < NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) {
            if (i < 55296 || i > 57343) {
                m28966b((i >> 12) | 224);
                m28966b(((i >> 6) & 63) | 128);
                m28966b((i & 63) | 128);
            } else {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
            }
        } else if (i <= 1114111) {
            m28966b((i >> 18) | 240);
            m28966b(((i >> 12) & 63) | 128);
            m28966b(((i >> 6) & 63) | 128);
            m28966b((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: a */
    public drq m28957a(String str, Charset charset) {
        return m28956a(str, 0, str.length(), charset);
    }

    /* renamed from: a */
    public drq m28956a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(dsj.f22803a)) {
            return m28955a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return m28968b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: b */
    public drq m28967b(byte[] bArr) {
        if (bArr != null) {
            return m28968b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public drq m28968b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        dsj.m29130a((long) bArr.length, (long) i, (long) i2);
        int i3 = i + i2;
        while (i < i3) {
            dsd e = m28981e(1);
            int min = Math.min(i3 - i, 8192 - e.f22794c);
            System.arraycopy(bArr, i, e.f22792a, e.f22794c, min);
            i += min;
            e.f22794c = min + e.f22794c;
        }
        this.f22760b += (long) i2;
        return this;
    }

    /* renamed from: a */
    public long mo4571a(dsh dsh) throws IOException {
        if (dsh == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = dsh.read(this, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    /* renamed from: b */
    public drq m28966b(int i) {
        dsd e = m28981e(1);
        byte[] bArr = e.f22792a;
        int i2 = e.f22794c;
        e.f22794c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f22760b++;
        return this;
    }

    /* renamed from: c */
    public drq m28973c(int i) {
        dsd e = m28981e(2);
        byte[] bArr = e.f22792a;
        int i2 = e.f22794c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f22794c = i2;
        this.f22760b += 2;
        return this;
    }

    /* renamed from: d */
    public drq m28978d(int i) {
        dsd e = m28981e(4);
        byte[] bArr = e.f22792a;
        int i2 = e.f22794c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.f22794c = i2;
        this.f22760b += 4;
        return this;
    }

    /* renamed from: i */
    public drq m28993i(long j) {
        dsd e = m28981e(8);
        byte[] bArr = e.f22792a;
        int i = e.f22794c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 40) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 32) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 24) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 16) & 255));
        i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 8) & 255));
        i = i2 + 1;
        bArr[i2] = (byte) ((int) (j & 255));
        e.f22794c = i;
        this.f22760b += 8;
        return this;
    }

    /* renamed from: j */
    public drq m28995j(long j) {
        if (j == 0) {
            return m28966b(48);
        }
        long j2;
        Object obj;
        if (j < 0) {
            j2 = -j;
            if (j2 < 0) {
                return m28954a("-9223372036854775808");
            }
            obj = 1;
        } else {
            obj = null;
            j2 = j;
        }
        int i = j2 < 100000000 ? j2 < 10000 ? j2 < 100 ? j2 < 10 ? 1 : 2 : j2 < 1000 ? 3 : 4 : j2 < 1000000 ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8 : j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        if (obj != null) {
            i++;
        }
        dsd e = m28981e(i);
        byte[] bArr = e.f22792a;
        int i2 = e.f22794c + i;
        while (j2 != 0) {
            i2--;
            bArr[i2] = f22758c[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (obj != null) {
            bArr[i2 - 1] = Framer.STDIN_FRAME_PREFIX;
        }
        e.f22794c += i;
        this.f22760b = ((long) i) + this.f22760b;
        return this;
    }

    /* renamed from: k */
    public drq m28998k(long j) {
        if (j == 0) {
            return m28966b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        dsd e = m28981e(numberOfTrailingZeros);
        byte[] bArr = e.f22792a;
        int i = e.f22794c;
        for (int i2 = (e.f22794c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f22758c[(int) (15 & j)];
            j >>>= 4;
        }
        e.f22794c += numberOfTrailingZeros;
        this.f22760b = ((long) numberOfTrailingZeros) + this.f22760b;
        return this;
    }

    /* renamed from: e */
    dsd m28981e(int i) {
        if (i < 1 || i > Utility.DEFAULT_STREAM_BUFFER_SIZE) {
            throw new IllegalArgumentException();
        } else if (this.f22759a == null) {
            this.f22759a = dse.m29110a();
            dsd dsd = this.f22759a;
            dsd dsd2 = this.f22759a;
            r0 = this.f22759a;
            dsd2.f22798g = r0;
            dsd.f22797f = r0;
            return r0;
        } else {
            r0 = this.f22759a.f22798g;
            if (r0.f22794c + i > Utility.DEFAULT_STREAM_BUFFER_SIZE || !r0.f22796e) {
                return r0.m29107a(dse.m29110a());
            }
            return r0;
        }
    }

    public void write(drq drq, long j) {
        if (drq == null) {
            throw new IllegalArgumentException("source == null");
        } else if (drq == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            dsj.m29130a(drq.f22760b, 0, j);
            while (j > 0) {
                dsd dsd;
                if (j < ((long) (drq.f22759a.f22794c - drq.f22759a.f22793b))) {
                    dsd = this.f22759a != null ? this.f22759a.f22798g : null;
                    if (dsd != null && dsd.f22796e) {
                        if ((((long) dsd.f22794c) + j) - ((long) (dsd.f22795d ? 0 : dsd.f22793b)) <= 8192) {
                            drq.f22759a.m29108a(dsd, (int) j);
                            drq.f22760b -= j;
                            this.f22760b += j;
                            return;
                        }
                    }
                    drq.f22759a = drq.f22759a.m29106a((int) j);
                }
                dsd dsd2 = drq.f22759a;
                long j2 = (long) (dsd2.f22794c - dsd2.f22793b);
                drq.f22759a = dsd2.m29105a();
                if (this.f22759a == null) {
                    this.f22759a = dsd2;
                    dsd2 = this.f22759a;
                    dsd = this.f22759a;
                    dsd dsd3 = this.f22759a;
                    dsd.f22798g = dsd3;
                    dsd2.f22797f = dsd3;
                } else {
                    this.f22759a.f22798g.m29107a(dsd2).m29109b();
                }
                drq.f22760b -= j2;
                this.f22760b += j2;
                j -= j2;
            }
        }
    }

    public long read(drq drq, long j) {
        if (drq == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f22760b == 0) {
            return -1;
        } else {
            if (j > this.f22760b) {
                j = this.f22760b;
            }
            drq.write(this, j);
            return j;
        }
    }

    /* renamed from: a */
    public long mo4569a(byte b) {
        return m28948a(b, 0);
    }

    /* renamed from: a */
    public long m28948a(byte b, long j) {
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        dsd dsd = this.f22759a;
        if (dsd == null) {
            return -1;
        }
        dsd dsd2;
        if (this.f22760b - j >= j) {
            dsd2 = dsd;
            while (true) {
                long j3 = ((long) (dsd2.f22794c - dsd2.f22793b)) + j2;
                if (j3 >= j) {
                    break;
                }
                dsd2 = dsd2.f22797f;
                j2 = j3;
            }
        } else {
            j2 = this.f22760b;
            dsd2 = dsd;
            while (j2 > j) {
                dsd2 = dsd2.f22798g;
                j2 -= (long) (dsd2.f22794c - dsd2.f22793b);
            }
        }
        while (j2 < this.f22760b) {
            byte[] bArr = dsd2.f22792a;
            int i = dsd2.f22794c;
            for (int i2 = (int) ((((long) dsd2.f22793b) + j) - j2); i2 < i; i2++) {
                if (bArr[i2] == b) {
                    return j2 + ((long) (i2 - dsd2.f22793b));
                }
            }
            j2 += (long) (dsd2.f22794c - dsd2.f22793b);
            dsd2 = dsd2.f22797f;
            j = j2;
        }
        return -1;
    }

    /* renamed from: a */
    public boolean mo4576a(long j, drt drt) {
        return m28964a(j, drt, 0, drt.mo4627h());
    }

    /* renamed from: a */
    public boolean m28964a(long j, drt drt, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f22760b - j < ((long) i2) || drt.mo4627h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (m28972c(((long) i3) + j) != drt.mo4614a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public void flush() {
    }

    public void close() {
    }

    public dsi timeout() {
        return dsi.NONE;
    }

    public boolean equals(Object obj) {
        long j = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drq)) {
            return false;
        }
        drq drq = (drq) obj;
        if (this.f22760b != drq.f22760b) {
            return false;
        }
        if (this.f22760b == 0) {
            return true;
        }
        dsd dsd = this.f22759a;
        dsd dsd2 = drq.f22759a;
        int i = dsd.f22793b;
        int i2 = dsd2.f22793b;
        while (j < this.f22760b) {
            long min = (long) Math.min(dsd.f22794c - i, dsd2.f22794c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                byte b = dsd.f22792a[i];
                i = i2 + 1;
                if (b != dsd2.f22792a[i2]) {
                    return false;
                }
                i3++;
                i2 = i;
                i = i4;
            }
            if (i == dsd.f22794c) {
                dsd = dsd.f22797f;
                i = dsd.f22793b;
            }
            if (i2 == dsd2.f22794c) {
                dsd2 = dsd2.f22797f;
                i2 = dsd2.f22793b;
            }
            j += min;
        }
        return true;
    }

    public int hashCode() {
        dsd dsd = this.f22759a;
        if (dsd == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = dsd.f22793b;
            while (i2 < dsd.f22794c) {
                int i3 = dsd.f22792a[i2] + (i * 31);
                i2++;
                i = i3;
            }
            dsd = dsd.f22797f;
        } while (dsd != this.f22759a);
        return i;
    }

    public String toString() {
        return m29014x().toString();
    }

    /* renamed from: w */
    public drq m29013w() {
        drq drq = new drq();
        if (this.f22760b == 0) {
            return drq;
        }
        drq.f22759a = new dsd(this.f22759a);
        dsd dsd = drq.f22759a;
        dsd dsd2 = drq.f22759a;
        dsd dsd3 = drq.f22759a;
        dsd2.f22798g = dsd3;
        dsd.f22797f = dsd3;
        for (dsd = this.f22759a.f22797f; dsd != this.f22759a; dsd = dsd.f22797f) {
            drq.f22759a.f22798g.m29107a(new dsd(dsd));
        }
        drq.f22760b = this.f22760b;
        return drq;
    }

    /* renamed from: x */
    public drt m29014x() {
        if (this.f22760b <= 2147483647L) {
            return m28983f((int) this.f22760b);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f22760b);
    }

    /* renamed from: f */
    public drt m28983f(int i) {
        if (i == 0) {
            return drt.f22762b;
        }
        return new dsf(this, i);
    }
}
