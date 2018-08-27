package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.alw.C0294a;
import p000.bou.C1380a;

/* renamed from: boq */
public final class boq extends aoy<bou> {
    /* renamed from: e */
    private final C0294a f7269e;

    public boq(Context context, Looper looper, aou aou, C0294a c0294a, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, aou, connectionCallbacks, onConnectionFailedListener);
        this.f7269e = c0294a;
    }

    /* renamed from: a */
    protected bou m10175a(IBinder iBinder) {
        return C1380a.m10203a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m10175a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* renamed from: s */
    protected Bundle mo734s() {
        return this.f7269e == null ? new Bundle() : this.f7269e.m2542a();
    }
}
