package com.p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.bho.C1210a;

@bhd
/* renamed from: bhi */
public class bhi extends aot<bho> {
    /* renamed from: e */
    final int f6257e;

    public bhi(Context context, Looper looper, C0662b c0662b, C0663c c0663c, int i) {
        super(context, looper, 8, c0662b, c0663c, null);
        this.f6257e = i;
    }

    /* renamed from: a */
    protected bho m8485a(IBinder iBinder) {
        return C1210a.m8509a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.ads.service.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m8485a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    /* renamed from: e */
    public bho mo344e() throws DeadObjectException {
        return (bho) super.m2638v();
    }
}
