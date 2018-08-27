package com.p000;

import java.io.IOException;

/* compiled from: RealBufferedSink */
/* renamed from: dsb */
final class dsb implements drr {
    /* renamed from: a */
    public final drq f22785a = new drq();
    /* renamed from: b */
    public final dsg f22786b;
    /* renamed from: c */
    boolean f22787c;

    dsb(dsg dsg) {
        if (dsg == null) {
            throw new NullPointerException("sink == null");
        }
        this.f22786b = dsg;
    }

    /* renamed from: b */
    public drq mo4577b() {
        return this.f22785a;
    }

    public void write(drq drq, long j) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.write(drq, j);
        mo4605y();
    }

    /* renamed from: b */
    public drr mo4578b(drt drt) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28953a(drt);
        return mo4605y();
    }

    /* renamed from: b */
    public drr mo4579b(String str) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28954a(str);
        return mo4605y();
    }

    /* renamed from: c */
    public drr mo4581c(byte[] bArr) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28967b(bArr);
        return mo4605y();
    }

    /* renamed from: c */
    public drr mo4582c(byte[] bArr, int i, int i2) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28968b(bArr, i, i2);
        return mo4605y();
    }

    /* renamed from: a */
    public long mo4571a(dsh dsh) throws IOException {
        if (dsh == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = dsh.read(this.f22785a, 8192);
            if (read == -1) {
                return j;
            }
            j += read;
            mo4605y();
        }
    }

    /* renamed from: i */
    public drr mo4592i(int i) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28966b(i);
        return mo4605y();
    }

    /* renamed from: h */
    public drr mo4589h(int i) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28973c(i);
        return mo4605y();
    }

    /* renamed from: g */
    public drr mo4586g(int i) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28978d(i);
        return mo4605y();
    }

    /* renamed from: n */
    public drr mo4600n(long j) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28993i(j);
        return mo4605y();
    }

    /* renamed from: m */
    public drr mo4597m(long j) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28995j(j);
        return mo4605y();
    }

    /* renamed from: l */
    public drr mo4596l(long j) throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        this.f22785a.m28998k(j);
        return mo4605y();
    }

    /* renamed from: y */
    public drr mo4605y() throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        long h = this.f22785a.m28989h();
        if (h > 0) {
            this.f22786b.write(this.f22785a, h);
        }
        return this;
    }

    /* renamed from: e */
    public drr mo4584e() throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        long a = this.f22785a.m28946a();
        if (a > 0) {
            this.f22786b.write(this.f22785a, a);
        }
        return this;
    }

    public void flush() throws IOException {
        if (this.f22787c) {
            throw new IllegalStateException("closed");
        }
        if (this.f22785a.f22760b > 0) {
            this.f22786b.write(this.f22785a, this.f22785a.f22760b);
        }
        this.f22786b.flush();
    }

    public void close() throws IOException {
        if (!this.f22787c) {
            Throwable th = null;
            try {
                if (this.f22785a.f22760b > 0) {
                    this.f22786b.write(this.f22785a, this.f22785a.f22760b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f22786b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f22787c = true;
            if (th != null) {
                dsj.m29131a(th);
            }
        }
    }

    public dsi timeout() {
        return this.f22786b.timeout();
    }

    public String toString() {
        return "buffer(" + this.f22786b + ")";
    }
}
