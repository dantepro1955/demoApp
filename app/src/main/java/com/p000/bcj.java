package com.p000;

import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import p000.aig.C0191a;
import p000.bcc.C0995a;

@bhd
/* renamed from: bcj */
public class bcj extends aij {
    /* renamed from: a */
    private final bci f5581a;
    /* renamed from: b */
    private final List<C0191a> f5582b = new ArrayList();
    /* renamed from: c */
    private final bcd f5583c;
    /* renamed from: d */
    private final ahz f5584d = new ahz();

    public bcj(bci bci) {
        bcd bcd;
        this.f5581a = bci;
        try {
            List<Object> b = this.f5581a.mo926b();
            if (b != null) {
                for (Object a : b) {
                    bcc a2 = m7468a(a);
                    if (a2 != null) {
                        this.f5582b.add(new bcd(a2));
                    }
                }
            }
        } catch (Throwable e) {
            bky.m9007b("Failed to get image.", e);
        }
        try {
            bcc d = this.f5581a.mo943d();
            if (d != null) {
                bcd = new bcd(d);
                this.f5583c = bcd;
            }
        } catch (Throwable e2) {
            bky.m9007b("Failed to get icon.", e2);
        }
        bcd = null;
        this.f5583c = bcd;
    }

    /* renamed from: a */
    bcc m7468a(Object obj) {
        return obj instanceof IBinder ? C0995a.m7208a((IBinder) obj) : null;
    }

    /* renamed from: a */
    protected /* synthetic */ Object mo980a() {
        return m7478j();
    }

    /* renamed from: b */
    public CharSequence mo991b() {
        try {
            return this.f5581a.mo941a();
        } catch (Throwable e) {
            bky.m9007b("Failed to get headline.", e);
            return null;
        }
    }

    /* renamed from: c */
    public List<C0191a> mo992c() {
        return this.f5582b;
    }

    /* renamed from: d */
    public CharSequence mo993d() {
        try {
            return this.f5581a.mo942c();
        } catch (Throwable e) {
            bky.m9007b("Failed to get body.", e);
            return null;
        }
    }

    /* renamed from: e */
    public C0191a mo994e() {
        return this.f5583c;
    }

    /* renamed from: f */
    public CharSequence mo995f() {
        try {
            return this.f5581a.mo944e();
        } catch (Throwable e) {
            bky.m9007b("Failed to get call to action.", e);
            return null;
        }
    }

    /* renamed from: g */
    public CharSequence mo996g() {
        try {
            return this.f5581a.mo945f();
        } catch (Throwable e) {
            bky.m9007b("Failed to get attribution.", e);
            return null;
        }
    }

    /* renamed from: h */
    public ahz mo997h() {
        try {
            if (this.f5581a.mo946g() != null) {
                this.f5584d.m1643a(this.f5581a.mo946g());
            }
        } catch (Throwable e) {
            bky.m9007b("Exception occurred while getting video controller", e);
        }
        return this.f5584d;
    }

    /* renamed from: i */
    public void mo998i() {
        try {
            this.f5581a.mo949j();
        } catch (Throwable e) {
            bky.m9007b("Failed to destroy", e);
        }
    }

    /* renamed from: j */
    protected aqq m7478j() {
        try {
            return this.f5581a.mo947h();
        } catch (Throwable e) {
            bky.m9007b("Failed to retrieve native ad engine.", e);
            return null;
        }
    }
}
