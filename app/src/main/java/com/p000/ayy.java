package com.p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.azb.C0928a;

@bhd
/* renamed from: ayy */
public class ayy extends aot<azb> {
    ayy(Context context, Looper looper, C0662b c0662b, C0663c c0663c) {
        super(context, looper, 123, c0662b, c0663c, null);
    }

    /* renamed from: a */
    protected azb m6680a(IBinder iBinder) {
        return C0928a.m6696a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m6680a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    /* renamed from: e */
    public azb mo344e() throws DeadObjectException {
        return (azb) super.m2638v();
    }
}
