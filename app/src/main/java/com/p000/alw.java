package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.List;
import p000.ann.C0286b;
import p000.ann.C0290a.C0293d;
import p000.ann.C0290a.C0644b;
import p000.ann.C0297f;
import p000.ann.C0646g;

/* renamed from: alw */
public final class alw {
    /* renamed from: a */
    public static final C0646g<boq> f2011a = new C0646g();
    /* renamed from: b */
    public static final C0646g<bok> f2012b = new C0646g();
    /* renamed from: c */
    public static final C0646g<amn> f2013c = new C0646g();
    /* renamed from: d */
    public static final ann<anb> f2014d = ana.f2098b;
    /* renamed from: e */
    public static final ann<C0294a> f2015e = new ann("Auth.CREDENTIALS_API", f2022l, f2011a);
    /* renamed from: f */
    public static final ann<GoogleSignInOptions> f2016f = new ann("Auth.GOOGLE_SIGN_IN_API", f2024n, f2013c);
    /* renamed from: g */
    public static final ann<C0644b> f2017g = new ann("Auth.ACCOUNT_STATUS_API", f2023m, f2012b);
    /* renamed from: h */
    public static final amd f2018h = new boz();
    /* renamed from: i */
    public static final alx f2019i = new bop();
    /* renamed from: j */
    public static final boi f2020j = new boj();
    /* renamed from: k */
    public static final amh f2021k = new amm();
    /* renamed from: l */
    private static final C0286b<boq, C0294a> f2022l = new C02871();
    /* renamed from: m */
    private static final C0286b<bok, C0644b> f2023m = new C02882();
    /* renamed from: n */
    private static final C0286b<amn, GoogleSignInOptions> f2024n = new C02893();

    /* renamed from: alw$1 */
    class C02871 extends C0286b<boq, C0294a> {
        C02871() {
        }

        /* renamed from: a */
        public boq m2535a(Context context, Looper looper, aou aou, C0294a c0294a, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new boq(context, looper, aou, c0294a, connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: alw$2 */
    class C02882 extends C0286b<bok, C0644b> {
        C02882() {
        }

        /* renamed from: a */
        public /* synthetic */ C0297f mo323a(Context context, Looper looper, aou aou, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return m2537a(context, looper, aou, (C0644b) obj, connectionCallbacks, onConnectionFailedListener);
        }

        /* renamed from: a */
        public bok m2537a(Context context, Looper looper, aou aou, C0644b c0644b, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new bok(context, looper, aou, connectionCallbacks, onConnectionFailedListener);
        }
    }

    /* renamed from: alw$3 */
    class C02893 extends C0286b<amn, GoogleSignInOptions> {
        C02893() {
        }

        /* renamed from: a */
        public amn m2538a(Context context, Looper looper, aou aou, GoogleSignInOptions googleSignInOptions, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
            return new amn(context, looper, aou, googleSignInOptions, connectionCallbacks, onConnectionFailedListener);
        }

        /* renamed from: a */
        public List<Scope> m2540a(GoogleSignInOptions googleSignInOptions) {
            return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.m19485a();
        }

        /* renamed from: a */
        public /* synthetic */ List mo324a(Object obj) {
            return m2540a((GoogleSignInOptions) obj);
        }
    }

    /* renamed from: alw$a */
    public static final class C0294a implements C0293d {
        /* renamed from: a */
        private final String f2009a;
        /* renamed from: b */
        private final PasswordSpecification f2010b;

        /* renamed from: a */
        public Bundle m2542a() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", this.f2009a);
            bundle.putParcelable("password_specification", this.f2010b);
            return bundle;
        }
    }
}
