package com.p000;

import p000.rw.C5735b;

/* compiled from: UnobservedErrorNotifier */
/* renamed from: ry */
class ry {
    /* renamed from: a */
    private rw<?> f25425a;

    public ry(rw<?> rwVar) {
        this.f25425a = rwVar;
    }

    protected void finalize() throws Throwable {
        try {
            rw rwVar = this.f25425a;
            if (rwVar != null) {
                C5735b a = rw.m34001a();
                if (a != null) {
                    a.m34000a(rwVar, new rz(rwVar.m34026g()));
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    /* renamed from: a */
    public void m34039a() {
        this.f25425a = null;
    }
}
