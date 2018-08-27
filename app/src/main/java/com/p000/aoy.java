package com.p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import java.util.Set;
import p000.ann.C0297f;
import p000.aot.C0662b;
import p000.aot.C0663c;
import p000.aoz.C0298a;

/* renamed from: aoy */
public abstract class aoy<T extends IInterface> extends aot<T> implements C0297f, C0298a {
    /* renamed from: e */
    private final aou f2054e;
    /* renamed from: f */
    private final Set<Scope> f2055f;
    /* renamed from: g */
    private final Account f2056g;

    /* renamed from: aoy$1 */
    class C06761 implements C0662b {
        /* renamed from: a */
        final /* synthetic */ ConnectionCallbacks f3862a;

        C06761(ConnectionCallbacks connectionCallbacks) {
            this.f3862a = connectionCallbacks;
        }

        /* renamed from: a */
        public void mo597a(int i) {
            this.f3862a.onConnectionSuspended(i);
        }

        /* renamed from: a */
        public void mo598a(Bundle bundle) {
            this.f3862a.onConnected(bundle);
        }
    }

    /* renamed from: aoy$2 */
    class C06772 implements C0663c {
        /* renamed from: a */
        final /* synthetic */ OnConnectionFailedListener f3863a;

        C06772(OnConnectionFailedListener onConnectionFailedListener) {
            this.f3863a = onConnectionFailedListener;
        }

        /* renamed from: a */
        public void mo599a(ConnectionResult connectionResult) {
            this.f3863a.onConnectionFailed(connectionResult);
        }
    }

    protected aoy(Context context, Looper looper, int i, aou aou, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, apa.m4806a(context), anj.m4530a(), i, aou, (ConnectionCallbacks) aoi.m4679a((Object) connectionCallbacks), (OnConnectionFailedListener) aoi.m4679a((Object) onConnectionFailedListener));
    }

    protected aoy(Context context, Looper looper, apa apa, anj anj, int i, aou aou, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, apa, anj, i, aoy.m2654a(connectionCallbacks), aoy.m2655a(onConnectionFailedListener), aou.m4754h());
        this.f2054e = aou;
        this.f2056g = aou.m4748b();
        this.f2055f = m2656b(aou.m4751e());
    }

    /* renamed from: a */
    private static C0662b m2654a(ConnectionCallbacks connectionCallbacks) {
        return connectionCallbacks == null ? null : new C06761(connectionCallbacks);
    }

    /* renamed from: a */
    private static C0663c m2655a(OnConnectionFailedListener onConnectionFailedListener) {
        return onConnectionFailedListener == null ? null : new C06772(onConnectionFailedListener);
    }

    /* renamed from: b */
    private Set<Scope> m2656b(Set<Scope> set) {
        Set<Scope> a = m2657a((Set) set);
        for (Scope contains : a) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return a;
    }

    /* renamed from: a */
    protected Set<Scope> m2657a(Set<Scope> set) {
        return set;
    }

    /* renamed from: p */
    public final Account mo335p() {
        return this.f2056g;
    }

    /* renamed from: q */
    public zzc[] mo336q() {
        return new zzc[0];
    }

    /* renamed from: x */
    protected final Set<Scope> mo337x() {
        return this.f2055f;
    }

    /* renamed from: y */
    protected final aou mo338y() {
        return this.f2054e;
    }
}
