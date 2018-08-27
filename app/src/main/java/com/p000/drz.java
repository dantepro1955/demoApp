package com.p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource */
/* renamed from: drz */
public final class drz implements dsh {
    /* renamed from: a */
    private final drs f22775a;
    /* renamed from: b */
    private final Inflater f22776b;
    /* renamed from: c */
    private int f22777c;
    /* renamed from: d */
    private boolean f22778d;

    public drz(dsh dsh, Inflater inflater) {
        this(dsa.m29051a(dsh), inflater);
    }

    drz(drs drs, Inflater inflater) {
        if (drs == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f22775a = drs;
            this.f22776b = inflater;
        }
    }

    public long read(drq drq, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f22778d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            boolean a;
            do {
                a = m29049a();
                try {
                    dsd e = drq.m28981e(1);
                    int inflate = this.f22776b.inflate(e.f22792a, e.f22794c, 8192 - e.f22794c);
                    if (inflate > 0) {
                        e.f22794c += inflate;
                        drq.f22760b += (long) inflate;
                        return (long) inflate;
                    } else if (this.f22776b.finished() || this.f22776b.needsDictionary()) {
                        m29048b();
                        if (e.f22793b == e.f22794c) {
                            drq.f22759a = e.m29105a();
                            dse.m29111a(e);
                        }
                        return -1;
                    }
                } catch (Throwable e2) {
                    throw new IOException(e2);
                }
            } while (!a);
            throw new EOFException("source exhausted prematurely");
        }
    }

    /* renamed from: a */
    public boolean m29049a() throws IOException {
        if (!this.f22776b.needsInput()) {
            return false;
        }
        m29048b();
        if (this.f22776b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f22775a.mo4585f()) {
            return true;
        } else {
            dsd dsd = this.f22775a.mo4577b().f22759a;
            this.f22777c = dsd.f22794c - dsd.f22793b;
            this.f22776b.setInput(dsd.f22792a, dsd.f22793b, this.f22777c);
            return false;
        }
    }

    /* renamed from: b */
    private void m29048b() throws IOException {
        if (this.f22777c != 0) {
            int remaining = this.f22777c - this.f22776b.getRemaining();
            this.f22777c -= remaining;
            this.f22775a.mo4590h((long) remaining);
        }
    }

    public dsi timeout() {
        return this.f22775a.timeout();
    }

    public void close() throws IOException {
        if (!this.f22778d) {
            this.f22776b.end();
            this.f22778d = true;
            this.f22775a.close();
        }
    }
}
