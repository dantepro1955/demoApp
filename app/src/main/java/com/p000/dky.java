package com.p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import p000.agw.C0169a;

/* compiled from: CacheableHttpDataSource */
/* renamed from: dky */
public class dky extends agt {
    /* renamed from: b */
    private bwg f21930b;
    /* renamed from: c */
    private bwi<bwe> f21931c;
    /* renamed from: d */
    private bwi<bwj> f21932d;
    /* renamed from: e */
    private Context f21933e;
    /* renamed from: f */
    private String f21934f;
    /* renamed from: g */
    private dfs f21935g;
    /* renamed from: h */
    private File f21936h;
    /* renamed from: i */
    private String f21937i;
    /* renamed from: j */
    private boolean f21938j;
    /* renamed from: k */
    private boolean f21939k;
    /* renamed from: l */
    private Throwable f21940l;
    /* renamed from: m */
    private long f21941m;

    public dky(Context context, String str, ahm<String> ahm, agy agy, int i, int i2, boolean z, dfs dfs) {
        super(str, ahm, agy, i, i2, z);
        this.f21933e = context;
        this.f21935g = dfs;
    }

    public long open(agq agq) throws C0169a {
        try {
            this.f21941m = super.open(agq);
            boolean d = this.f21935g.m27059d(this.f21933e, this.f21937i);
            this.f21938j = d;
            if (!d) {
                this.f21937i = agq.f1390a.toString();
                this.f21934f = this.f21935g.m27060e(this.f21933e, this.f21937i);
                this.f21936h = new File(this.f21934f);
                this.f21931c = m27767c().b(dkx.m27766a(this.f21937i));
            }
            return this.f21941m;
        } catch (Throwable e) {
            this.f21940l = e;
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws C0169a {
        try {
            int read = super.read(bArr, i, i2);
            if (!(this.f21939k || read == -1 || this.f21931c == null || !this.f21931c.a())) {
                ((bwe) this.f21931c.b()).write(bArr, i, read);
            }
            return read;
        } catch (Throwable e) {
            Throwable th = e;
            ((bwe) this.f21931c.b()).c();
            this.f21940l = th;
            throw th;
        }
    }

    public void close() throws C0169a {
        boolean z = false;
        super.close();
        boolean z2 = a() != 0 && b() == 0;
        if (!(a() == 0 || b() == 0)) {
            z = true;
        }
        if (!this.f21939k && this.f21937i != null && z2 && this.f21940l == null) {
            if (this.f21931c != null) {
                ((bwe) this.f21931c.b()).a();
            }
            this.f21939k = true;
            this.f21931c = null;
            this.f21940l = null;
        } else if ((z || this.f21940l != null) && this.f21931c != null) {
            ((bwe) this.f21931c.b()).c();
        }
        String a = dkx.m27766a(this.f21937i);
        if (this.f21939k && this.f21937i != null && !this.f21938j) {
            this.f21932d = m27767c().a(a);
            if (this.f21932d.a()) {
                try {
                    new File(((bwj) this.f21932d.b()).a()).renameTo(this.f21936h);
                    this.f21938j = true;
                    ((bwj) this.f21932d.b()).close();
                } catch (IOException e) {
                } catch (Throwable th) {
                    Throwable th2 = th;
                    ((bwj) this.f21932d.b()).close();
                }
            }
        }
    }

    /* renamed from: c */
    private bwg m27767c() {
        if (this.f21930b == null) {
            this.f21930b = new bwg(new File(this.f21935g.m27056b(this.f21933e)));
        }
        return this.f21930b;
    }
}
