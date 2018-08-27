package com.p000;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import p000.amr.C0308a;
import p000.ann.C0290a.C0291a;

/* renamed from: amu */
public class amu extends C0308a {
    /* renamed from: a */
    private final Context f2087a;

    public amu(Context context) {
        this.f2087a = context;
    }

    /* renamed from: b */
    private void m2741b() {
        if (!aqo.zzf(this.f2087a, Binder.getCallingUid())) {
            throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
        }
    }

    /* renamed from: c */
    private void m2742c() {
        amw a = amw.m2747a(this.f2087a);
        GoogleSignInAccount a2 = a.m2749a();
        C0291a c0291a = GoogleSignInOptions.f14724e;
        if (a2 != null) {
            c0291a = a.m2753b();
        }
        GoogleApiClient build = new Builder(this.f2087a).addApi(alw.f2016f, c0291a).build();
        try {
            if (build.blockingConnect().m19505b()) {
                if (a2 != null) {
                    alw.f2021k.mo334d(build);
                } else {
                    build.clearDefaultAccountAndReconnect();
                }
            }
            build.disconnect();
        } catch (Throwable th) {
            build.disconnect();
        }
    }

    /* renamed from: a */
    public void mo356a() {
        m2741b();
        m2742c();
    }
}
