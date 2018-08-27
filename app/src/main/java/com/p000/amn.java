package com.p000;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3296a;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import p000.amt.C0311a;

/* renamed from: amn */
public class amn extends aoy<amt> {
    /* renamed from: e */
    private final GoogleSignInOptions f2057e;

    public amn(Context context, Looper looper, aou aou, GoogleSignInOptions googleSignInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 91, aou, connectionCallbacks, onConnectionFailedListener);
        if (googleSignInOptions == null) {
            googleSignInOptions = new C3296a().m19472d();
        }
        if (!aou.m4751e().isEmpty()) {
            C3296a c3296a = new C3296a(googleSignInOptions);
            for (Scope a : aou.m4751e()) {
                c3296a.m19466a(a, new Scope[0]);
            }
            googleSignInOptions = c3296a.m19472d();
        }
        this.f2057e = googleSignInOptions;
    }

    /* renamed from: a */
    protected amt m2662a(IBinder iBinder) {
        return C0311a.m2740a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m2662a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* renamed from: c */
    public boolean mo342c() {
        return true;
    }

    /* renamed from: d */
    public Intent mo343d() {
        return amo.m2717a(m2631o(), this.f2057e);
    }

    /* renamed from: e */
    public GoogleSignInOptions mo344e() {
        return this.f2057e;
    }
}
