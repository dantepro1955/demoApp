package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import p000.auq.C0835a;

/* renamed from: aui */
public class aui extends aoy<auq> {
    /* renamed from: e */
    protected final aux<auq> f4600e = new C08291(this);
    /* renamed from: f */
    private final String f4601f;

    /* renamed from: aui$1 */
    class C08291 implements aux<auq> {
        /* renamed from: a */
        final /* synthetic */ aui f4599a;

        C08291(aui aui) {
            this.f4599a = aui;
        }

        /* renamed from: a */
        public void mo732a() {
            this.f4599a.m2636t();
        }

        /* renamed from: b */
        public auq m5760b() throws DeadObjectException {
            return (auq) this.f4599a.m2638v();
        }

        /* renamed from: c */
        public /* synthetic */ IInterface mo733c() throws DeadObjectException {
            return m5760b();
        }
    }

    public aui(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, aou aou) {
        super(context, looper, 23, aou, connectionCallbacks, onConnectionFailedListener);
        this.f4601f = str;
    }

    /* renamed from: a */
    protected auq m5763a(IBinder iBinder) {
        return C0835a.m5866a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m5763a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* renamed from: s */
    protected Bundle mo734s() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f4601f);
        return bundle;
    }
}
