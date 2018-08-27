package com.p000;

import java.lang.ref.WeakReference;

/* compiled from: BaseGagPostListFragmentModuleController */
/* renamed from: ccg */
public abstract class ccg {
    /* renamed from: a */
    protected static caf f8689a = caf.m12046a();
    /* renamed from: b */
    private WeakReference<ccl> f8690b;
    /* renamed from: c */
    private String f8691c;

    public ccg(String str, ccl ccl) {
        this.f8691c = str;
        this.f8690b = new WeakReference(ccl);
    }

    /* renamed from: a */
    public ccl m12469a() {
        return (ccl) this.f8690b.get();
    }
}
