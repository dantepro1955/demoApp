package com.p000;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

/* renamed from: aut */
public class aut extends aui {
    /* renamed from: f */
    private final aus f4629f;

    public aut(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, aou aou) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, aou);
        this.f4629f = new aus(context, this.e);
    }

    /* renamed from: e */
    public Location mo344e() {
        return this.f4629f.m5887a();
    }

    /* renamed from: f */
    public void mo779f() {
        synchronized (this.f4629f) {
            if (m2624g()) {
                try {
                    this.f4629f.m5889b();
                    this.f4629f.m5890c();
                } catch (Throwable e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.mo779f();
        }
    }
}
