package com.p000;

import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import p000.aig.C0191a;
import p000.bcc.C0995a;

@bhd
/* renamed from: bch */
public class bch extends aii {
    /* renamed from: a */
    private final bcg f5576a;
    /* renamed from: b */
    private final List<C0191a> f5577b = new ArrayList();
    /* renamed from: c */
    private final bcd f5578c;
    /* renamed from: d */
    private final ahz f5579d = new ahz();

    public bch(bcg bcg) {
        bcd bcd;
        this.f5576a = bcg;
        try {
            List<Object> b = this.f5576a.mo926b();
            if (b != null) {
                for (Object a : b) {
                    bcc a2 = m7445a(a);
                    if (a2 != null) {
                        this.f5577b.add(new bcd(a2));
                    }
                }
            }
        } catch (Throwable e) {
            bky.m9007b("Failed to get image.", e);
        }
        try {
            bcc d = this.f5576a.mo928d();
            if (d != null) {
                bcd = new bcd(d);
                this.f5578c = bcd;
            }
        } catch (Throwable e2) {
            bky.m9007b("Failed to get icon.", e2);
        }
        bcd = null;
        this.f5578c = bcd;
    }

    /* renamed from: a */
    bcc m7445a(Object obj) {
        return obj instanceof IBinder ? C0995a.m7208a((IBinder) obj) : null;
    }

    /* renamed from: a */
    protected /* synthetic */ Object mo980a() {
        return m7457l();
    }

    /* renamed from: b */
    public CharSequence mo981b() {
        try {
            return this.f5576a.mo924a();
        } catch (Throwable e) {
            bky.m9007b("Failed to get headline.", e);
            return null;
        }
    }

    /* renamed from: c */
    public List<C0191a> mo982c() {
        return this.f5577b;
    }

    /* renamed from: d */
    public CharSequence mo983d() {
        try {
            return this.f5576a.mo927c();
        } catch (Throwable e) {
            bky.m9007b("Failed to get body.", e);
            return null;
        }
    }

    /* renamed from: e */
    public C0191a mo984e() {
        return this.f5578c;
    }

    /* renamed from: f */
    public CharSequence mo985f() {
        try {
            return this.f5576a.mo929e();
        } catch (Throwable e) {
            bky.m9007b("Failed to get call to action.", e);
            return null;
        }
    }

    /* renamed from: g */
    public Double mo986g() {
        Double d = null;
        try {
            double f = this.f5576a.mo930f();
            if (f != -1.0d) {
                d = Double.valueOf(f);
            }
        } catch (Throwable e) {
            bky.m9007b("Failed to get star rating.", e);
        }
        return d;
    }

    /* renamed from: h */
    public CharSequence mo987h() {
        try {
            return this.f5576a.mo931g();
        } catch (Throwable e) {
            bky.m9007b("Failed to get store", e);
            return null;
        }
    }

    /* renamed from: i */
    public CharSequence mo988i() {
        try {
            return this.f5576a.mo932h();
        } catch (Throwable e) {
            bky.m9007b("Failed to get price.", e);
            return null;
        }
    }

    /* renamed from: j */
    public ahz mo989j() {
        try {
            if (this.f5576a.mo933i() != null) {
                this.f5579d.m1643a(this.f5576a.mo933i());
            }
        } catch (Throwable e) {
            bky.m9007b("Exception occurred while getting video controller", e);
        }
        return this.f5579d;
    }

    /* renamed from: k */
    public void mo990k() {
        try {
            this.f5576a.mo940p();
        } catch (Throwable e) {
            bky.m9007b("Failed to destroy", e);
        }
    }

    /* renamed from: l */
    protected aqq m7457l() {
        try {
            return this.f5576a.mo934j();
        } catch (Throwable e) {
            bky.m9007b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
