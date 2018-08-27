package com.p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbau;
import com.google.android.gms.internal.zzbaw;
import p000.aot.C0669i;
import p000.avp.C0854a;

/* renamed from: avr */
public class avr extends aoy<avp> implements avj {
    /* renamed from: e */
    private final boolean f4685e;
    /* renamed from: f */
    private final aou f4686f;
    /* renamed from: g */
    private final Bundle f4687g;
    /* renamed from: h */
    private Integer f4688h;

    public avr(Context context, Looper looper, boolean z, aou aou, Bundle bundle, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, aou, connectionCallbacks, onConnectionFailedListener);
        this.f4685e = z;
        this.f4686f = aou;
        this.f4687g = bundle;
        this.f4688h = aou.m4756j();
    }

    public avr(Context context, Looper looper, boolean z, aou aou, avk avk, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        this(context, looper, z, aou, avr.m6044a(aou), connectionCallbacks, onConnectionFailedListener);
    }

    /* renamed from: a */
    public static Bundle m6044a(aou aou) {
        avk i = aou.m4755i();
        Integer j = aou.m4756j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", aou.m4748b());
        if (j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", j.intValue());
        }
        if (i != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", i.m5999a());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", i.m6000b());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", i.m6001c());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", i.m6002d());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", i.m6003e());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", i.m6004f());
            if (i.m6005g() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", i.m6005g().longValue());
            }
            if (i.m6006h() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", i.m6006h().longValue());
            }
        }
        return bundle;
    }

    /* renamed from: z */
    private zzad m6045z() {
        Account c = this.f4686f.m4749c();
        GoogleSignInAccount googleSignInAccount = null;
        if ("<<default account>>".equals(c.name)) {
            googleSignInAccount = amw.m2747a(m2631o()).m2749a();
        }
        return new zzad(c, this.f4688h.intValue(), googleSignInAccount);
    }

    /* renamed from: a */
    protected avp m6046a(IBinder iBinder) {
        return C0854a.m6040a(iBinder);
    }

    /* renamed from: a */
    protected String mo339a() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: a */
    public void mo797a(ape ape, boolean z) {
        try {
            ((avp) m2638v()).mo788a(ape, this.f4688h.intValue(), z);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    /* renamed from: a */
    public void mo798a(avo avo) {
        aoi.m4680a((Object) avo, (Object) "Expecting a valid ISignInCallbacks");
        try {
            ((avp) m2638v()).mo794a(new zzbau(m6045z()), avo);
        } catch (Throwable e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                avo.mo683a(new zzbaw(8));
            } catch (RemoteException e2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: b */
    protected /* synthetic */ IInterface mo340b(IBinder iBinder) {
        return m6046a(iBinder);
    }

    /* renamed from: b */
    protected String mo341b() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* renamed from: e */
    public void mo344e() {
        try {
            ((avp) m2638v()).mo786a(this.f4688h.intValue());
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    /* renamed from: i */
    public boolean mo799i() {
        return this.f4685e;
    }

    /* renamed from: l */
    public void mo800l() {
        m2613a(new C0669i(this));
    }

    /* renamed from: s */
    protected Bundle mo734s() {
        if (!m2631o().getPackageName().equals(this.f4686f.m4753g())) {
            this.f4687g.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f4686f.m4753g());
        }
        return this.f4687g;
    }
}
