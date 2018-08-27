package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.boy.C1384a;

/* renamed from: bow */
public final class bow extends aoy<boy> {
    /* renamed from: e */
    private final Bundle f7272e;

    public bow(Context context, Looper looper, aou aou, anb anb, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 16, aou, connectionCallbacks, onConnectionFailedListener);
        this.f7272e = anb == null ? new Bundle() : anb.m2808a();
    }

    /* renamed from: a */
    protected boy m10207a(IBinder iBinder) {
        return C1384a.m10224a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.auth.service.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m10207a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* renamed from: i */
    public boolean mo799i() {
        aou y = mo338y();
        return (TextUtils.isEmpty(y.m4745a()) || y.m4746a(ana.f2098b).isEmpty()) ? false : true;
    }

    /* renamed from: s */
    protected Bundle mo734s() {
        return this.f7272e;
    }
}
