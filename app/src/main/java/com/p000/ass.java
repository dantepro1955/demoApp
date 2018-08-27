package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbaw;
import java.util.HashSet;
import java.util.Set;
import p000.ann.C0286b;

/* renamed from: ass */
public class ass extends avm implements ConnectionCallbacks, OnConnectionFailedListener {
    /* renamed from: a */
    private static C0286b<? extends avj, avk> f4265a = avi.f4668c;
    /* renamed from: b */
    private final Context f4266b;
    /* renamed from: c */
    private final Handler f4267c;
    /* renamed from: d */
    private final C0286b<? extends avj, avk> f4268d;
    /* renamed from: e */
    private final boolean f4269e;
    /* renamed from: f */
    private Set<Scope> f4270f;
    /* renamed from: g */
    private aou f4271g;
    /* renamed from: h */
    private avj f4272h;
    /* renamed from: i */
    private C0765a f4273i;

    /* renamed from: ass$a */
    public interface C0765a {
        /* renamed from: a */
        void mo702a(ape ape, Set<Scope> set);

        /* renamed from: b */
        void mo703b(ConnectionResult connectionResult);
    }

    public ass(Context context, Handler handler) {
        this.f4266b = context;
        this.f4267c = handler;
        this.f4268d = f4265a;
        this.f4269e = true;
    }

    public ass(Context context, Handler handler, aou aou, C0286b<? extends avj, avk> c0286b) {
        this.f4266b = context;
        this.f4267c = handler;
        this.f4271g = aou;
        this.f4270f = aou.m4750d();
        this.f4268d = c0286b;
        this.f4269e = false;
    }

    /* renamed from: b */
    private void m5500b(zzbaw zzbaw) {
        ConnectionResult a = zzbaw.m19657a();
        if (a.m19505b()) {
            zzaf b = zzbaw.m19658b();
            ConnectionResult b2 = b.m19526b();
            if (b2.m19505b()) {
                this.f4273i.mo702a(b.m19525a(), this.f4270f);
            } else {
                String valueOf = String.valueOf(b2);
                Log.wtf("SignInCoordinator", new StringBuilder(String.valueOf(valueOf).length() + 48).append("Sign-in succeeded with resolve account failure: ").append(valueOf).toString(), new Exception());
                this.f4273i.mo703b(b2);
                this.f4272h.mo779f();
                return;
            }
        }
        this.f4273i.mo703b(a);
        this.f4272h.mo779f();
    }

    /* renamed from: a */
    public avj m5501a() {
        return this.f4272h;
    }

    /* renamed from: a */
    public void m5502a(C0765a c0765a) {
        if (this.f4272h != null) {
            this.f4272h.mo779f();
        }
        if (this.f4269e) {
            GoogleSignInOptions b = amw.m2747a(this.f4266b).m2753b();
            this.f4270f = b == null ? new HashSet() : new HashSet(b.m19485a());
            this.f4271g = new aou(null, this.f4270f, null, 0, null, null, null, avk.f4674a);
        }
        this.f4272h = (avj) this.f4268d.mo323a(this.f4266b, this.f4267c.getLooper(), this.f4271g, this.f4271g.m4755i(), this, this);
        this.f4273i = c0765a;
        this.f4272h.mo800l();
    }

    /* renamed from: a */
    public void mo683a(final zzbaw zzbaw) {
        this.f4267c.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ ass f4264b;

            public void run() {
                this.f4264b.m5500b(zzbaw);
            }
        });
    }

    /* renamed from: b */
    public void m5504b() {
        this.f4272h.mo779f();
    }

    public void onConnected(Bundle bundle) {
        this.f4272h.mo798a(this);
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.f4273i.mo703b(connectionResult);
    }

    public void onConnectionSuspended(int i) {
        this.f4272h.mo779f();
    }
}
