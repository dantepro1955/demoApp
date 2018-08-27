package com.p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aoz */
public final class aoz implements Callback {
    /* renamed from: a */
    final ArrayList<ConnectionCallbacks> f3864a = new ArrayList();
    /* renamed from: b */
    private final C0298a f3865b;
    /* renamed from: c */
    private final ArrayList<ConnectionCallbacks> f3866c = new ArrayList();
    /* renamed from: d */
    private final ArrayList<OnConnectionFailedListener> f3867d = new ArrayList();
    /* renamed from: e */
    private volatile boolean f3868e = false;
    /* renamed from: f */
    private final AtomicInteger f3869f = new AtomicInteger(0);
    /* renamed from: g */
    private boolean f3870g = false;
    /* renamed from: h */
    private final Handler f3871h;
    /* renamed from: i */
    private final Object f3872i = new Object();

    /* renamed from: aoz$a */
    public interface C0298a {
        /* renamed from: g */
        boolean mo685g();

        /* renamed from: u */
        Bundle mo686u();
    }

    public aoz(Looper looper, C0298a c0298a) {
        this.f3865b = c0298a;
        this.f3871h = new Handler(looper, this);
    }

    /* renamed from: a */
    public void m4778a() {
        this.f3868e = false;
        this.f3869f.incrementAndGet();
    }

    /* renamed from: a */
    public void m4779a(int i) {
        boolean z = false;
        if (Looper.myLooper() == this.f3871h.getLooper()) {
            z = true;
        }
        aoi.m4685a(z, (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        this.f3871h.removeMessages(1);
        synchronized (this.f3872i) {
            this.f3870g = true;
            ArrayList arrayList = new ArrayList(this.f3866c);
            int i2 = this.f3869f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) it.next();
                if (!this.f3868e || this.f3869f.get() != i2) {
                    break;
                } else if (this.f3866c.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnectionSuspended(i);
                }
            }
            this.f3864a.clear();
            this.f3870g = false;
        }
    }

    /* renamed from: a */
    public void m4780a(Bundle bundle) {
        boolean z = true;
        aoi.m4685a(Looper.myLooper() == this.f3871h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (this.f3872i) {
            aoi.m4684a(!this.f3870g);
            this.f3871h.removeMessages(1);
            this.f3870g = true;
            if (this.f3864a.size() != 0) {
                z = false;
            }
            aoi.m4684a(z);
            ArrayList arrayList = new ArrayList(this.f3866c);
            int i = this.f3869f.get();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) it.next();
                if (!this.f3868e || !this.f3865b.mo685g() || this.f3869f.get() != i) {
                    break;
                } else if (!this.f3864a.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(bundle);
                }
            }
            this.f3864a.clear();
            this.f3870g = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m4781a(com.google.android.gms.common.ConnectionResult r6) {
        /*
        r5 = this;
        r1 = 1;
        r0 = android.os.Looper.myLooper();
        r2 = r5.f3871h;
        r2 = r2.getLooper();
        if (r0 != r2) goto L_0x0046;
    L_0x000d:
        r0 = r1;
    L_0x000e:
        r2 = "onConnectionFailure must only be called on the Handler thread";
        p000.aoi.m4685a(r0, r2);
        r0 = r5.f3871h;
        r0.removeMessages(r1);
        r1 = r5.f3872i;
        monitor-enter(r1);
        r0 = new java.util.ArrayList;	 Catch:{ all -> 0x0054 }
        r2 = r5.f3867d;	 Catch:{ all -> 0x0054 }
        r0.<init>(r2);	 Catch:{ all -> 0x0054 }
        r2 = r5.f3869f;	 Catch:{ all -> 0x0054 }
        r2 = r2.get();	 Catch:{ all -> 0x0054 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0054 }
    L_0x002c:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0054 }
        if (r0 == 0) goto L_0x0057;
    L_0x0032:
        r0 = r3.next();	 Catch:{ all -> 0x0054 }
        r0 = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) r0;	 Catch:{ all -> 0x0054 }
        r4 = r5.f3868e;	 Catch:{ all -> 0x0054 }
        if (r4 == 0) goto L_0x0044;
    L_0x003c:
        r4 = r5.f3869f;	 Catch:{ all -> 0x0054 }
        r4 = r4.get();	 Catch:{ all -> 0x0054 }
        if (r4 == r2) goto L_0x0048;
    L_0x0044:
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
    L_0x0045:
        return;
    L_0x0046:
        r0 = 0;
        goto L_0x000e;
    L_0x0048:
        r4 = r5.f3867d;	 Catch:{ all -> 0x0054 }
        r4 = r4.contains(r0);	 Catch:{ all -> 0x0054 }
        if (r4 == 0) goto L_0x002c;
    L_0x0050:
        r0.onConnectionFailed(r6);	 Catch:{ all -> 0x0054 }
        goto L_0x002c;
    L_0x0054:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        throw r0;
    L_0x0057:
        monitor-exit(r1);	 Catch:{ all -> 0x0054 }
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: aoz.a(com.google.android.gms.common.ConnectionResult):void");
    }

    /* renamed from: a */
    public void m4782a(ConnectionCallbacks connectionCallbacks) {
        aoi.m4679a((Object) connectionCallbacks);
        synchronized (this.f3872i) {
            if (this.f3866c.contains(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.f3866c.add(connectionCallbacks);
            }
        }
        if (this.f3865b.mo685g()) {
            this.f3871h.sendMessage(this.f3871h.obtainMessage(1, connectionCallbacks));
        }
    }

    /* renamed from: a */
    public void m4783a(OnConnectionFailedListener onConnectionFailedListener) {
        aoi.m4679a((Object) onConnectionFailedListener);
        synchronized (this.f3872i) {
            if (this.f3867d.contains(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 67).append("registerConnectionFailedListener(): listener ").append(valueOf).append(" is already registered").toString());
            } else {
                this.f3867d.add(onConnectionFailedListener);
            }
        }
    }

    /* renamed from: b */
    public void m4784b() {
        this.f3868e = true;
    }

    /* renamed from: b */
    public boolean m4785b(ConnectionCallbacks connectionCallbacks) {
        boolean contains;
        aoi.m4679a((Object) connectionCallbacks);
        synchronized (this.f3872i) {
            contains = this.f3866c.contains(connectionCallbacks);
        }
        return contains;
    }

    /* renamed from: b */
    public boolean m4786b(OnConnectionFailedListener onConnectionFailedListener) {
        boolean contains;
        aoi.m4679a((Object) onConnectionFailedListener);
        synchronized (this.f3872i) {
            contains = this.f3867d.contains(onConnectionFailedListener);
        }
        return contains;
    }

    /* renamed from: c */
    public void m4787c(ConnectionCallbacks connectionCallbacks) {
        aoi.m4679a((Object) connectionCallbacks);
        synchronized (this.f3872i) {
            if (!this.f3866c.remove(connectionCallbacks)) {
                String valueOf = String.valueOf(connectionCallbacks);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 52).append("unregisterConnectionCallbacks(): listener ").append(valueOf).append(" not found").toString());
            } else if (this.f3870g) {
                this.f3864a.add(connectionCallbacks);
            }
        }
    }

    /* renamed from: c */
    public void m4788c(OnConnectionFailedListener onConnectionFailedListener) {
        aoi.m4679a((Object) onConnectionFailedListener);
        synchronized (this.f3872i) {
            if (!this.f3867d.remove(onConnectionFailedListener)) {
                String valueOf = String.valueOf(onConnectionFailedListener);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found").toString());
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            ConnectionCallbacks connectionCallbacks = (ConnectionCallbacks) message.obj;
            synchronized (this.f3872i) {
                if (this.f3868e && this.f3865b.mo685g() && this.f3866c.contains(connectionCallbacks)) {
                    connectionCallbacks.onConnected(this.f3865b.mo686u());
                }
            }
            return true;
        }
        Log.wtf("GmsClientEvents", "Don't know how to handle message: " + message.what, new Exception());
        return false;
    }
}
