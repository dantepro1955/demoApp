package com.p000;

import android.os.Bundle;
import p000.csn.C4557a;

/* compiled from: BaseListViewStateListener */
/* renamed from: cfo */
abstract class cfo<T> implements C4557a<T> {
    /* renamed from: a */
    protected final String f9069a = getClass().getSimpleName();
    /* renamed from: b */
    protected csz f9070b;
    /* renamed from: c */
    protected cst<T> f9071c;
    /* renamed from: d */
    protected csn<T> f9072d;
    /* renamed from: e */
    protected Bundle f9073e;

    cfo(cst<T> cst, csn<T> csn, Bundle bundle) {
        this.f9071c = cst;
        this.f9072d = csn;
        this.f9073e = bundle;
    }

    /* renamed from: a */
    void mo1719a(csz csz) {
        this.f9070b = csz;
    }

    /* renamed from: a */
    void mo1718a() {
        this.f9070b = null;
    }
}
