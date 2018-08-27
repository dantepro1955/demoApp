package com.p000;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: arf */
public class arf extends arj {
    /* renamed from: e */
    private final SparseArray<C0721a> f4028e = new SparseArray();

    /* renamed from: arf$a */
    class C0721a implements OnConnectionFailedListener {
        /* renamed from: a */
        public final int f4017a;
        /* renamed from: b */
        public final GoogleApiClient f4018b;
        /* renamed from: c */
        public final OnConnectionFailedListener f4019c;
        /* renamed from: d */
        final /* synthetic */ arf f4020d;

        public C0721a(arf arf, int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
            this.f4020d = arf;
            this.f4017a = i;
            this.f4018b = googleApiClient;
            this.f4019c = onConnectionFailedListener;
            googleApiClient.registerConnectionFailedListener(this);
        }

        /* renamed from: a */
        public void m5073a() {
            this.f4018b.unregisterConnectionFailedListener(this);
            this.f4018b.disconnect();
        }

        /* renamed from: a */
        public void m5074a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.append(str).append("GoogleApiClient #").print(this.f4017a);
            printWriter.println(":");
            this.f4018b.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 27).append("beginFailureResolution for ").append(valueOf).toString());
            this.f4020d.m5092b(connectionResult, this.f4017a);
        }
    }

    private arf(ash ash) {
        super(ash);
        this.d.mo707a("AutoManageHelper", (asg) this);
    }

    /* renamed from: a */
    public static arf m5095a(asf asf) {
        ash b = asg.m5075b(asf);
        arf arf = (arf) b.mo706a("AutoManageHelper", arf.class);
        return arf != null ? arf : new arf(b);
    }

    /* renamed from: a */
    public void mo621a() {
        super.mo621a();
        boolean z = this.a;
        String valueOf = String.valueOf(this.f4028e);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (!this.b) {
            for (int i = 0; i < this.f4028e.size(); i++) {
                ((C0721a) this.f4028e.valueAt(i)).f4018b.connect();
            }
        }
    }

    /* renamed from: a */
    public void m5097a(int i) {
        C0721a c0721a = (C0721a) this.f4028e.get(i);
        this.f4028e.remove(i);
        if (c0721a != null) {
            c0721a.m5073a();
        }
    }

    /* renamed from: a */
    public void m5098a(int i, GoogleApiClient googleApiClient, OnConnectionFailedListener onConnectionFailedListener) {
        aoi.m4680a((Object) googleApiClient, (Object) "GoogleApiClient instance cannot be null");
        aoi.m4685a(this.f4028e.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + this.a + " " + this.b);
        this.f4028e.put(i, new C0721a(this, i, googleApiClient, onConnectionFailedListener));
        if (this.a && !this.b) {
            String valueOf = String.valueOf(googleApiClient);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 11).append("connecting ").append(valueOf).toString());
            googleApiClient.connect();
        }
    }

    /* renamed from: a */
    protected void mo626a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        C0721a c0721a = (C0721a) this.f4028e.get(i);
        if (c0721a != null) {
            m5097a(i);
            OnConnectionFailedListener onConnectionFailedListener = c0721a.f4019c;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* renamed from: a */
    public void mo627a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f4028e.size(); i++) {
            ((C0721a) this.f4028e.valueAt(i)).m5074a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: b */
    public void mo624b() {
        super.mo624b();
        for (int i = 0; i < this.f4028e.size(); i++) {
            ((C0721a) this.f4028e.valueAt(i)).f4018b.disconnect();
        }
    }

    /* renamed from: c */
    protected void mo628c() {
        for (int i = 0; i < this.f4028e.size(); i++) {
            ((C0721a) this.f4028e.valueAt(i)).f4018b.connect();
        }
    }
}
