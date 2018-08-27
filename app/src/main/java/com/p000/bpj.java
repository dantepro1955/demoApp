package com.p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzzm;
import p000.bpm.C1401a;

/* renamed from: bpj */
public class bpj extends aoy<bpm> {
    public bpj(Context context, Looper looper, aou aou, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 40, aou, connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    protected bpm m10313a(IBinder iBinder) {
        return C1401a.m10342a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* renamed from: a */
    public void m10315a(bpl bpl, zzzm zzzm) throws RemoteException {
        ((bpm) m2638v()).mo1390a(bpl, zzzm);
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m10313a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }
}
