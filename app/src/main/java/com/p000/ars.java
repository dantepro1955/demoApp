package com.p000;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* renamed from: ars */
public class ars extends GoogleApiClient {
    /* renamed from: a */
    private final UnsupportedOperationException f4093a;

    public ars(String str) {
        this.f4093a = new UnsupportedOperationException(str);
    }

    public ConnectionResult blockingConnect() {
        throw this.f4093a;
    }

    public ConnectionResult blockingConnect(long j, TimeUnit timeUnit) {
        throw this.f4093a;
    }

    public anq<Status> clearDefaultAccountAndReconnect() {
        throw this.f4093a;
    }

    public void connect() {
        throw this.f4093a;
    }

    public void disconnect() {
        throw this.f4093a;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        throw this.f4093a;
    }

    public ConnectionResult getConnectionResult(ann<?> ann) {
        throw this.f4093a;
    }

    public boolean hasConnectedApi(ann<?> ann) {
        throw this.f4093a;
    }

    public boolean isConnected() {
        throw this.f4093a;
    }

    public boolean isConnecting() {
        throw this.f4093a;
    }

    public boolean isConnectionCallbacksRegistered(ConnectionCallbacks connectionCallbacks) {
        throw this.f4093a;
    }

    public boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.f4093a;
    }

    public void reconnect() {
        throw this.f4093a;
    }

    public void registerConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        throw this.f4093a;
    }

    public void registerConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.f4093a;
    }

    public void stopAutoManage(FragmentActivity fragmentActivity) {
        throw this.f4093a;
    }

    public void unregisterConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
        throw this.f4093a;
    }

    public void unregisterConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
        throw this.f4093a;
    }
}
