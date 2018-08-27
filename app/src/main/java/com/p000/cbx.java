package com.p000;

import android.support.v4.app.Fragment;
import java.lang.ref.WeakReference;

/* compiled from: BaseGagPostEventListener */
/* renamed from: cbx */
public abstract class cbx {
    /* renamed from: c */
    protected static final caf f8497c = caf.m12046a();
    /* renamed from: a */
    protected String f8498a;
    /* renamed from: b */
    protected WeakReference<Fragment> f8499b;

    /* renamed from: a */
    protected Fragment m12121a() {
        return (Fragment) this.f8499b.get();
    }

    /* renamed from: b */
    protected Fragment m12122b() {
        return (Fragment) this.f8499b.get();
    }

    public cbx(String str, Fragment fragment) {
        this.f8498a = str;
        this.f8499b = new WeakReference(fragment);
    }
}
