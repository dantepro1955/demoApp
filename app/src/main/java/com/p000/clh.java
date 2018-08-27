package com.p000;

import android.content.Context;
import android.net.Uri;

/* compiled from: BaseSharingWrapper */
/* renamed from: clh */
public abstract class clh<T> {
    /* renamed from: a */
    static caf f9658a = caf.m12046a();
    /* renamed from: b */
    String f9659b;
    /* renamed from: c */
    Uri f9660c;
    /* renamed from: d */
    Context f9661d;
    /* renamed from: e */
    T f9662e;

    /* renamed from: a */
    public abstract String mo1780a();

    /* renamed from: b */
    public abstract String mo1781b();

    /* renamed from: c */
    public abstract String mo1782c();

    /* renamed from: d */
    public abstract Uri mo1783d();

    public clh(Context context, T t) {
        this.f9661d = context;
        this.f9662e = t;
    }
}
