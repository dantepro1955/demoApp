package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.atg.C0793a;

/* renamed from: ate */
public class ate extends aoy<atg> {
    public ate(Context context, Looper looper, aou aou, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 39, aou, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    protected atg m5586a(IBinder iBinder) {
        return C0793a.m5593a(iBinder);
    }

    /* renamed from: a */
    public String mo339a() {
        return "com.google.android.gms.common.service.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m5586a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }
}
