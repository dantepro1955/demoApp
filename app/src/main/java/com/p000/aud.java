package com.p000;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.aug.C0828a;

/* renamed from: aud */
public class aud extends aot<aug> {
    public aud(Context context, Looper looper, C0662b c0662b, C0663c c0663c) {
        super(context, looper, 116, c0662b, c0663c, null);
    }

    /* renamed from: a */
    protected aug m5743a(IBinder iBinder) {
        return C0828a.m5756a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.gass.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m5743a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    /* renamed from: e */
    public aug mo344e() throws DeadObjectException {
        return (aug) super.m2638v();
    }
}
