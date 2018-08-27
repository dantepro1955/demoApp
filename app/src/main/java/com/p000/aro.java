package com.p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import p000.ann.C0286b;
import p000.ann.C0290a;
import p000.ann.C0297f;
import p000.asa.C0763a;

/* renamed from: aro */
public final class aro<O extends C0290a> extends aoa<O> {
    /* renamed from: b */
    private final C0297f f4062b;
    /* renamed from: c */
    private final arl f4063c;
    /* renamed from: d */
    private final aou f4064d;
    /* renamed from: e */
    private final C0286b<? extends avj, avk> f4065e;

    public aro(Context context, ann<O> ann, Looper looper, C0297f c0297f, arl arl, aou aou, C0286b<? extends avj, avk> c0286b) {
        super(context, ann, looper);
        this.f4062b = c0297f;
        this.f4063c = arl;
        this.f4064d = aou;
        this.f4065e = c0286b;
        this.a.m5451a((aoa) this);
    }

    /* renamed from: a */
    public C0297f mo648a(Looper looper, C0763a<O> c0763a) {
        this.f4063c.m5121a(c0763a);
        return this.f4062b;
    }

    /* renamed from: a */
    public ass mo649a(Context context, Handler handler) {
        return new ass(context, handler, this.f4064d, this.f4065e);
    }

    /* renamed from: g */
    public C0297f m5184g() {
        return this.f4062b;
    }
}
