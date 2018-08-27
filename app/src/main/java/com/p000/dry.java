package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource */
/* renamed from: dry */
public final class dry implements dsh {
    /* renamed from: a */
    private int f22770a = 0;
    /* renamed from: b */
    private final drs f22771b;
    /* renamed from: c */
    private final Inflater f22772c;
    /* renamed from: d */
    private final drz f22773d;
    /* renamed from: e */
    private final CRC32 f22774e = new CRC32();

    public dry(dsh dsh) {
        if (dsh == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.f22772c = new Inflater(true);
        this.f22771b = dsa.m29051a(dsh);
        this.f22773d = new drz(this.f22771b, this.f22772c);
    }

    public long read(drq drq, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f22770a == 0) {
                m29044a();
                this.f22770a = 1;
            }
            if (this.f22770a == 1) {
                long j2 = drq.f22760b;
                long read = this.f22773d.read(drq, j);
                if (read != -1) {
                    m29045a(drq, j2, read);
                    return read;
                }
                this.f22770a = 2;
            }
            if (this.f22770a == 2) {
                m29047b();
                this.f22770a = 3;
                if (!this.f22771b.mo4585f()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    private void m29044a() throws IOException {
        Object obj;
        long a;
        this.f22771b.mo4573a(10);
        byte c = this.f22771b.mo4577b().m28972c(3);
        if (((c >> 1) & 1) == 1) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            m29045a(this.f22771b.mo4577b(), 0, 10);
        }
        m29046a("ID1ID2", 8075, this.f22771b.mo4593j());
        this.f22771b.mo4590h(8);
        if (((c >> 2) & 1) == 1) {
            this.f22771b.mo4573a(2);
            if (obj != null) {
                m29045a(this.f22771b.mo4577b(), 0, 2);
            }
            short m = this.f22771b.mo4577b().mo4598m();
            this.f22771b.mo4573a((long) m);
            if (obj != null) {
                m29045a(this.f22771b.mo4577b(), 0, (long) m);
            }
            this.f22771b.mo4590h((long) m);
        }
        if (((c >> 3) & 1) == 1) {
            a = this.f22771b.mo4569a((byte) 0);
            if (a == -1) {
                throw new EOFException();
            }
            if (obj != null) {
                m29045a(this.f22771b.mo4577b(), 0, 1 + a);
            }
            this.f22771b.mo4590h(1 + a);
        }
        if (((c >> 4) & 1) == 1) {
            a = this.f22771b.mo4569a((byte) 0);
            if (a == -1) {
                throw new EOFException();
            }
            if (obj != null) {
                m29045a(this.f22771b.mo4577b(), 0, 1 + a);
            }
            this.f22771b.mo4590h(1 + a);
        }
        if (obj != null) {
            m29046a("FHCRC", this.f22771b.mo4598m(), (short) ((int) this.f22774e.getValue()));
            this.f22774e.reset();
        }
    }

    /* renamed from: b */
    private void m29047b() throws IOException {
        m29046a("CRC", this.f22771b.mo4599n(), (int) this.f22774e.getValue());
        m29046a("ISIZE", this.f22771b.mo4599n(), (int) this.f22772c.getBytesWritten());
    }

    public dsi timeout() {
        return this.f22771b.timeout();
    }

    public void close() throws IOException {
        this.f22773d.close();
    }

    /* renamed from: a */
    private void m29045a(drq drq, long j, long j2) {
        dsd dsd = drq.f22759a;
        while (j >= ((long) (dsd.f22794c - dsd.f22793b))) {
            j -= (long) (dsd.f22794c - dsd.f22793b);
            dsd = dsd.f22797f;
        }
        while (j2 > 0) {
            int i = (int) (((long) dsd.f22793b) + j);
            int min = (int) Math.min((long) (dsd.f22794c - i), j2);
            this.f22774e.update(dsd.f22792a, i, min);
            j2 -= (long) min;
            dsd = dsd.f22797f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m29046a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
