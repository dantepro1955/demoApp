package com.p000;

import com.facebook.stetho.dumpapp.Framer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: RealBufferedSource */
/* renamed from: dsc */
final class dsc implements drs {
    /* renamed from: a */
    public final drq f22789a = new drq();
    /* renamed from: b */
    public final dsh f22790b;
    /* renamed from: c */
    boolean f22791c;

    /* compiled from: RealBufferedSource */
    /* renamed from: dsc$1 */
    class C50681 extends InputStream {
        /* renamed from: a */
        final /* synthetic */ dsc f22788a;

        C50681(dsc dsc) {
            this.f22788a = dsc;
        }

        public int read() throws IOException {
            if (this.f22788a.f22791c) {
                throw new IOException("closed");
            } else if (this.f22788a.f22789a.f22760b == 0 && this.f22788a.f22790b.read(this.f22788a.f22789a, 8192) == -1) {
                return -1;
            } else {
                return this.f22788a.f22789a.mo4591i() & 255;
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (this.f22788a.f22791c) {
                throw new IOException("closed");
            }
            dsj.m29130a((long) bArr.length, (long) i, (long) i2);
            if (this.f22788a.f22789a.f22760b == 0 && this.f22788a.f22790b.read(this.f22788a.f22789a, 8192) == -1) {
                return -1;
            }
            return this.f22788a.f22789a.mo4568a(bArr, i, i2);
        }

        public int available() throws IOException {
            if (!this.f22788a.f22791c) {
                return (int) Math.min(this.f22788a.f22789a.f22760b, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            this.f22788a.close();
        }

        public String toString() {
            return this.f22788a + ".inputStream()";
        }
    }

    dsc(dsh dsh) {
        if (dsh == null) {
            throw new NullPointerException("source == null");
        }
        this.f22790b = dsh;
    }

    /* renamed from: b */
    public drq mo4577b() {
        return this.f22789a;
    }

    public long read(drq drq, long j) throws IOException {
        if (drq == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f22791c) {
            throw new IllegalStateException("closed");
        } else if (this.f22789a.f22760b == 0 && this.f22790b.read(this.f22789a, 8192) == -1) {
            return -1;
        } else {
            return this.f22789a.read(drq, Math.min(j, this.f22789a.f22760b));
        }
    }

    /* renamed from: f */
    public boolean mo4585f() throws IOException {
        if (!this.f22791c) {
            return this.f22789a.mo4585f() && this.f22790b.read(this.f22789a, 8192) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: a */
    public void mo4573a(long j) throws IOException {
        if (!mo4580b(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: b */
    public boolean mo4580b(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f22791c) {
            throw new IllegalStateException("closed");
        } else {
            while (this.f22789a.f22760b < j) {
                if (this.f22790b.read(this.f22789a, 8192) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: i */
    public byte mo4591i() throws IOException {
        mo4573a(1);
        return this.f22789a.mo4591i();
    }

    /* renamed from: d */
    public drt mo4583d(long j) throws IOException {
        mo4573a(j);
        return this.f22789a.mo4583d(j);
    }

    /* renamed from: u */
    public byte[] mo4604u() throws IOException {
        this.f22789a.mo4571a(this.f22790b);
        return this.f22789a.mo4604u();
    }

    /* renamed from: g */
    public byte[] mo4588g(long j) throws IOException {
        mo4573a(j);
        return this.f22789a.mo4588g(j);
    }

    /* renamed from: a */
    public void mo4575a(byte[] bArr) throws IOException {
        try {
            mo4573a((long) bArr.length);
            this.f22789a.mo4575a(bArr);
        } catch (EOFException e) {
            EOFException eOFException = e;
            int i = 0;
            while (this.f22789a.f22760b > 0) {
                int a = this.f22789a.mo4568a(bArr, i, (int) this.f22789a.f22760b);
                if (a == -1) {
                    throw new AssertionError();
                }
                i += a;
            }
            throw eOFException;
        }
    }

    /* renamed from: a */
    public int mo4568a(byte[] bArr, int i, int i2) throws IOException {
        dsj.m29130a((long) bArr.length, (long) i, (long) i2);
        if (this.f22789a.f22760b == 0 && this.f22790b.read(this.f22789a, 8192) == -1) {
            return -1;
        }
        return this.f22789a.mo4568a(bArr, i, (int) Math.min((long) i2, this.f22789a.f22760b));
    }

    /* renamed from: a */
    public void mo4574a(drq drq, long j) throws IOException {
        try {
            mo4573a(j);
            this.f22789a.mo4574a(drq, j);
        } catch (EOFException e) {
            drq.mo4571a(this.f22789a);
            throw e;
        }
    }

    /* renamed from: a */
    public long mo4570a(dsg dsg) throws IOException {
        if (dsg == null) {
            throw new IllegalArgumentException("sink == null");
        }
        long j = 0;
        while (this.f22790b.read(this.f22789a, 8192) != -1) {
            long h = this.f22789a.m28989h();
            if (h > 0) {
                j += h;
                dsg.write(this.f22789a, h);
            }
        }
        if (this.f22789a.m28946a() <= 0) {
            return j;
        }
        j += this.f22789a.m28946a();
        dsg.write(this.f22789a, this.f22789a.m28946a());
        return j;
    }

    /* renamed from: a */
    public String mo4572a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f22789a.mo4571a(this.f22790b);
        return this.f22789a.mo4572a(charset);
    }

    /* renamed from: s */
    public String mo4603s() throws IOException {
        long a = mo4569a((byte) 10);
        if (a != -1) {
            return this.f22789a.m28984f(a);
        }
        drq drq = new drq();
        this.f22789a.m28952a(drq, 0, Math.min(32, this.f22789a.m28946a()));
        throw new EOFException("\\n not found: size=" + this.f22789a.m28946a() + " content=" + drq.m29007q().mo4625f() + "…");
    }

    /* renamed from: j */
    public short mo4593j() throws IOException {
        mo4573a(2);
        return this.f22789a.mo4593j();
    }

    /* renamed from: m */
    public short mo4598m() throws IOException {
        mo4573a(2);
        return this.f22789a.mo4598m();
    }

    /* renamed from: k */
    public int mo4594k() throws IOException {
        mo4573a(4);
        return this.f22789a.mo4594k();
    }

    /* renamed from: n */
    public int mo4599n() throws IOException {
        mo4573a(4);
        return this.f22789a.mo4599n();
    }

    /* renamed from: l */
    public long mo4595l() throws IOException {
        mo4573a(8);
        return this.f22789a.mo4595l();
    }

    /* renamed from: o */
    public long mo4601o() throws IOException {
        mo4573a(1);
        int i = 0;
        while (mo4580b((long) (i + 1))) {
            byte c = this.f22789a.m28972c((long) i);
            if ((c < (byte) 48 || c > (byte) 57) && !(i == 0 && c == Framer.STDIN_FRAME_PREFIX)) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(c)}));
                }
                return this.f22789a.mo4601o();
            }
            i++;
        }
        return this.f22789a.mo4601o();
    }

    /* renamed from: p */
    public long mo4602p() throws IOException {
        mo4573a(1);
        for (int i = 0; mo4580b((long) (i + 1)); i++) {
            byte c = this.f22789a.m28972c((long) i);
            if ((c < (byte) 48 || c > (byte) 57) && ((c < (byte) 97 || c > (byte) 102) && (c < (byte) 65 || c > (byte) 70))) {
                if (i == 0) {
                    throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(c)}));
                }
                return this.f22789a.mo4602p();
            }
        }
        return this.f22789a.mo4602p();
    }

    /* renamed from: h */
    public void mo4590h(long j) throws IOException {
        if (this.f22791c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f22789a.f22760b == 0 && this.f22790b.read(this.f22789a, 8192) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f22789a.m28946a());
            this.f22789a.mo4590h(min);
            j -= min;
        }
    }

    /* renamed from: a */
    public long mo4569a(byte b) throws IOException {
        return m29080a(b, 0);
    }

    /* renamed from: a */
    public long m29080a(byte b, long j) throws IOException {
        if (this.f22791c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long a = this.f22789a.m28948a(b, j);
            if (a != -1) {
                return a;
            }
            a = this.f22789a.f22760b;
            if (this.f22790b.read(this.f22789a, 8192) == -1) {
                return -1;
            }
            j = Math.max(j, a);
        }
    }

    /* renamed from: a */
    public boolean mo4576a(long j, drt drt) throws IOException {
        return m29087a(j, drt, 0, drt.mo4627h());
    }

    /* renamed from: a */
    public boolean m29087a(long j, drt drt, int i, int i2) throws IOException {
        if (this.f22791c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || drt.mo4627h() - i < i2) {
            return false;
        } else {
            int i3 = 0;
            while (i3 < i2) {
                long j2 = ((long) i3) + j;
                if (!mo4580b(1 + j2) || this.f22789a.m28972c(j2) != drt.mo4614a(i + i3)) {
                    return false;
                }
                i3++;
            }
            return true;
        }
    }

    /* renamed from: g */
    public InputStream mo4587g() {
        return new C50681(this);
    }

    public void close() throws IOException {
        if (!this.f22791c) {
            this.f22791c = true;
            this.f22790b.close();
            this.f22789a.m29012v();
        }
    }

    public dsi timeout() {
        return this.f22790b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f22790b + ")";
    }
}
