package com.p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import p000.ann.C0296c;
import p000.ari.C0301a;
import p000.ary.C0738a;

/* renamed from: art */
public class art implements arx {
    /* renamed from: a */
    private final ary f4097a;
    /* renamed from: b */
    private boolean f4098b = false;

    public art(ary ary) {
        this.f4097a = ary;
    }

    /* renamed from: c */
    private <A extends C0296c> void m5252c(C0301a<? extends ant, A> c0301a) throws DeadObjectException {
        this.f4097a.f4180g.f4156i.m5529a((ark) c0301a);
        C0296c a = this.f4097a.f4180g.m5347a(c0301a.mo348a());
        if (a.m2647g() || !this.f4097a.f4175b.containsKey(c0301a.mo348a())) {
            if (a instanceof aon) {
                a = ((aon) a).mo344e();
            }
            c0301a.m2698b(a);
            return;
        }
        c0301a.m2699c(new Status(17));
    }

    /* renamed from: a */
    public <A extends C0296c, R extends ant, T extends C0301a<R, A>> T mo671a(T t) {
        return mo676b(t);
    }

    /* renamed from: a */
    public void mo672a() {
    }

    /* renamed from: a */
    public void mo673a(int i) {
        this.f4097a.m5364a(null);
        this.f4097a.f4181h.mo632a(i, this.f4098b);
    }

    /* renamed from: a */
    public void mo674a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo675a(ConnectionResult connectionResult, ann<?> ann, boolean z) {
    }

    /* renamed from: b */
    public <A extends C0296c, T extends C0301a<? extends ant, A>> T mo676b(T t) {
        try {
            m5252c(t);
        } catch (DeadObjectException e) {
            this.f4097a.m5363a(new C0738a(this, this) {
                /* renamed from: a */
                final /* synthetic */ art f4095a;

                /* renamed from: a */
                public void mo670a() {
                    this.f4095a.mo673a(1);
                }
            });
        }
        return t;
    }

    /* renamed from: b */
    public boolean mo677b() {
        if (this.f4098b) {
            return false;
        }
        if (this.f4097a.f4180g.m5354d()) {
            this.f4098b = true;
            for (asv a : this.f4097a.f4180g.f4155h) {
                a.m5519a();
            }
            return false;
        }
        this.f4097a.m5364a(null);
        return true;
    }

    /* renamed from: c */
    public void mo678c() {
        if (this.f4098b) {
            this.f4098b = false;
            this.f4097a.m5363a(new C0738a(this, this) {
                /* renamed from: a */
                final /* synthetic */ art f4096a;

                /* renamed from: a */
                public void mo670a() {
                    this.f4096a.f4097a.f4181h.mo633a(null);
                }
            });
        }
    }

    /* renamed from: d */
    void m5261d() {
        if (this.f4098b) {
            this.f4098b = false;
            this.f4097a.f4180g.f4156i.m5528a();
            mo677b();
        }
    }
}
