package com.p000;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: DeflaterSink */
/* renamed from: dru */
public final class dru implements dsg {
    /* renamed from: a */
    private final drr f22766a;
    /* renamed from: b */
    private final Deflater f22767b;
    /* renamed from: c */
    private boolean f22768c;

    public dru(dsg dsg, Deflater deflater) {
        this(dsa.m29050a(dsg), deflater);
    }

    dru(drr drr, Deflater deflater) {
        if (drr == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater == null) {
            throw new IllegalArgumentException("inflater == null");
        } else {
            this.f22766a = drr;
            this.f22767b = deflater;
        }
    }

    public void write(drq drq, long j) throws IOException {
        dsj.m29130a(drq.f22760b, 0, j);
        while (j > 0) {
            dsd dsd = drq.f22759a;
            int min = (int) Math.min(j, (long) (dsd.f22794c - dsd.f22793b));
            this.f22767b.setInput(dsd.f22792a, dsd.f22793b, min);
            m29040a(false);
            drq.f22760b -= (long) min;
            dsd.f22793b += min;
            if (dsd.f22793b == dsd.f22794c) {
                drq.f22759a = dsd.m29105a();
                dse.m29111a(dsd);
            }
            j -= (long) min;
        }
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m29040a(boolean z) throws IOException {
        drq b = this.f22766a.mo4577b();
        while (true) {
            int deflate;
            dsd e = b.m28981e(1);
            if (z) {
                deflate = this.f22767b.deflate(e.f22792a, e.f22794c, 8192 - e.f22794c, 2);
            } else {
                deflate = this.f22767b.deflate(e.f22792a, e.f22794c, 8192 - e.f22794c);
            }
            if (deflate > 0) {
                e.f22794c += deflate;
                b.f22760b += (long) deflate;
                this.f22766a.mo4605y();
            } else if (this.f22767b.needsInput()) {
                break;
            }
        }
        if (e.f22793b == e.f22794c) {
            b.f22759a = e.m29105a();
            dse.m29111a(e);
        }
    }

    public void flush() throws IOException {
        m29040a(true);
        this.f22766a.flush();
    }

    /* renamed from: a */
    void m29041a() throws IOException {
        this.f22767b.finish();
        m29040a(false);
    }

    public void close() throws IOException {
        Throwable th;
        if (!this.f22768c) {
            Throwable th2 = null;
            try {
                m29041a();
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                this.f22767b.end();
                th = th2;
            } catch (Throwable th4) {
                th = th4;
                if (th2 != null) {
                    th = th2;
                }
            }
            try {
                this.f22766a.close();
            } catch (Throwable th22) {
                if (th == null) {
                    th = th22;
                }
            }
            this.f22768c = true;
            if (th != null) {
                dsj.m29131a(th);
            }
        }
    }

    public dsi timeout() {
        return this.f22766a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.f22766a + ")";
    }
}
