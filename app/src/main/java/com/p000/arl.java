package com.p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

/* renamed from: arl */
public class arl implements ConnectionCallbacks, OnConnectionFailedListener {
    /* renamed from: a */
    public final ann<?> f4042a;
    /* renamed from: b */
    private final boolean f4043b;
    /* renamed from: c */
    private arm f4044c;

    public arl(ann<?> ann, boolean z) {
        this.f4042a = ann;
        this.f4043b = z;
    }

    /* renamed from: a */
    private void m5120a() {
        aoi.m4680a(this.f4044c, (Object) "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
    }

    /* renamed from: a */
    public void m5121a(arm arm) {
        this.f4044c = arm;
    }

    public void onConnected(Bundle bundle) {
        m5120a();
        this.f4044c.onConnected(bundle);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        m5120a();
        this.f4044c.mo700a(connectionResult, this.f4042a, this.f4043b);
    }

    public void onConnectionSuspended(int i) {
        m5120a();
        this.f4044c.onConnectionSuspended(i);
    }
}
