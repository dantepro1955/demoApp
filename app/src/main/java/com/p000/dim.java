package com.p000;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.C3296a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: SocialGplusController */
/* renamed from: dim */
public class dim {
    /* renamed from: a */
    private static final boolean f21734a = dik.f21704a;
    /* renamed from: m */
    private static ArrayList<String> f21735m = new ArrayList();
    /* renamed from: b */
    private Activity f21736b;
    /* renamed from: c */
    private Context f21737c;
    /* renamed from: d */
    private GoogleApiClient f21738d;
    /* renamed from: e */
    private C4934a f21739e;
    /* renamed from: f */
    private boolean f21740f;
    /* renamed from: g */
    private boolean f21741g;
    /* renamed from: h */
    private boolean f21742h = false;
    /* renamed from: i */
    private Handler f21743i;
    /* renamed from: j */
    private dig f21744j;
    /* renamed from: k */
    private String f21745k = null;
    /* renamed from: l */
    private C4935b f21746l;

    /* compiled from: SocialGplusController */
    /* renamed from: dim$1 */
    class C49261 implements anu<Status> {
        /* renamed from: a */
        final /* synthetic */ dim f21717a;

        C49261(dim dim) {
            this.f21717a = dim;
        }

        /* renamed from: a */
        public void m27404a(Status status) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "requestGplusRevokeAccess() done");
            }
        }
    }

    /* compiled from: SocialGplusController */
    /* renamed from: dim$2 */
    class C49272 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dim f21718a;

        C49272(dim dim) {
            this.f21718a = dim;
        }

        public void run() {
            if (this.f21718a.f21736b != null) {
                this.f21718a.f21736b.startActivityForResult(alw.f2021k.a(this.f21718a.f21738d), 10002);
            }
        }
    }

    /* compiled from: SocialGplusController */
    /* renamed from: dim$3 */
    class C49283 implements anu<Status> {
        /* renamed from: a */
        final /* synthetic */ dim f21719a;

        C49283(dim dim) {
            this.f21719a = dim;
        }

        /* renamed from: a */
        public void m27406a(Status status) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "requestSignOutInternal() onResult, code=" + status.f());
            }
        }
    }

    /* compiled from: SocialGplusController */
    /* renamed from: dim$4 */
    class C49304 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ dim f21721a;

        /* compiled from: SocialGplusController */
        /* renamed from: dim$4$1 */
        class C49291 implements anu<ami> {
            /* renamed from: a */
            final /* synthetic */ C49304 f21720a;

            C49291(C49304 c49304) {
                this.f21720a = c49304;
            }

            /* renamed from: a */
            public void m27407a(ami ami) {
                if (dim.f21734a) {
                    Log.d("SocialGplusController", "requestUserTokenInternal() onResult, success=" + ami.c());
                }
                this.f21720a.f21721a.m27417a(ami, Boolean.valueOf(true));
            }
        }

        C49304(dim dim) {
            this.f21721a = dim;
        }

        public void run() {
            anp b = alw.f2021k.b(this.f21721a.f21738d);
            if (b.a()) {
                ami ami = (ami) b.b();
                if (dim.f21734a) {
                    Log.d("SocialGplusController", "requestUserTokenInternal() done, success=" + ami.c());
                }
                this.f21721a.m27417a(ami, Boolean.valueOf(true));
                return;
            }
            if (dim.f21734a) {
                Log.d("SocialGplusController", "requestUserTokenInternal() setResultCallback");
            }
            b.a(new C49291(this));
        }
    }

    /* compiled from: SocialGplusController */
    /* renamed from: dim$a */
    static class C4934a implements ConnectionCallbacks, OnConnectionFailedListener {
        /* renamed from: a */
        WeakReference<dim> f21731a;

        public C4934a(dim dim) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "ClientConnectionCallback create");
            }
            this.f21731a = new WeakReference(dim);
        }

        public void onConnectionFailed(ConnectionResult connectionResult) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "ClientConnectionCallbackonConnectionFailed");
            }
            dim dim = (dim) this.f21731a.get();
            if (dim != null) {
                connectionResult.c();
                dim.f21744j.m27367a("ClientConnectionCallback onConnectionFailed, isSuccess=" + connectionResult.b() + ", errorCode=" + connectionResult.c() + ", hasResolution=" + connectionResult.a());
                dim.m27446s();
            }
        }

        public void onConnected(Bundle bundle) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "onConnected");
            }
            dim dim = (dim) this.f21731a.get();
            if (dim != null) {
                dim.m27447t();
            }
        }

        public void onConnectionSuspended(int i) {
            if (dim.f21734a) {
                Log.d("SocialGplusController", "onConnectionSuspended()");
            }
            dim dim = (dim) this.f21731a.get();
            if (dim != null) {
                dim.f21744j.m27367a("onConnectionSuspended()");
            }
        }
    }

    /* compiled from: SocialGplusController */
    /* renamed from: dim$b */
    public static class C4935b {
        /* renamed from: a */
        public String f21732a;
        /* renamed from: b */
        public String[] f21733b;

        /* renamed from: a */
        public C4935b m27412a(String str) {
            this.f21732a = str;
            return this;
        }

        /* renamed from: a */
        public C4935b m27413a(String[] strArr) {
            this.f21733b = strArr;
            return this;
        }
    }

    public dim(Activity activity, dig dig, C4935b c4935b) {
        Context context = null;
        this.f21736b = activity;
        if (activity != null) {
            context = activity.getApplicationContext();
        }
        this.f21737c = context;
        this.f21744j = dig;
        this.f21740f = false;
        this.f21741g = false;
        this.f21743i = new Handler();
        this.f21746l = c4935b;
    }

    /* renamed from: a */
    public void m27449a(Bundle bundle) {
        if (f21734a) {
            Log.d("SocialGplusController", "onCreate");
        }
        m27425b(bundle);
    }

    /* renamed from: b */
    public void m27453b() {
        m27441n();
        this.f21736b = null;
        this.f21738d = null;
    }

    /* renamed from: c */
    public void m27455c() {
        if (f21734a) {
            Log.d("SocialGplusController", "onStart");
        }
        if (this.f21740f) {
            this.f21738d.connect();
        }
    }

    /* renamed from: d */
    public void m27457d() {
        if (f21734a) {
            Log.d("SocialGplusController", "onStop");
        }
        this.f21738d.disconnect();
    }

    /* renamed from: a */
    public boolean m27452a(int i, int i2, Intent intent) {
        if (f21734a) {
            Log.d("SocialGplusController", "onActivityResult " + i + " " + i2);
        }
        this.f21744j.m27367a("onActivityResult requestCode=" + i + ", resultCode=" + i2);
        if (i == 10002) {
            m27417a(alw.f2021k.a(intent), Boolean.valueOf(false));
        } else if (i == 10001) {
            if (i2 == -1) {
                this.f21740f = true;
                this.f21738d.connect();
                return true;
            }
            if (f21734a) {
                Log.d("SocialGplusController", "gplus cancelled");
            }
            this.f21740f = false;
            this.f21744j.m27367a("onActivityResult cancelled");
            dhe.m27280a().m27269c(new dio());
        }
        return false;
    }

    /* renamed from: b */
    public void m27454b(String str) {
        this.f21745k = str;
    }

    /* renamed from: e */
    public void m27458e() {
        if (f21734a) {
            Log.d("SocialGplusController", "clearLastStoreToken()");
        }
        try {
            String r = m27445r();
            if (f21734a) {
                Log.d("SocialGplusController", "clearLastStoreToken invalidate old token=" + r);
            }
            if (r != null) {
                m27456c(r);
            }
        } catch (Exception e) {
            if (f21734a) {
                Log.d("SocialGplusController", "clearLastStoreToken() Exception=" + e.getMessage());
            }
        }
    }

    /* renamed from: f */
    public void m27459f() {
        if (f21734a) {
            Log.d("SocialGplusController", "requestGplusClearDefaultAccount()");
        }
        m27430e("CLEAR_DEFAULT_ACCOUNT");
    }

    /* renamed from: i */
    private void m27436i() {
        if (f21734a) {
            Log.d("SocialGplusController", "requestClearDefaultAccountInternal");
        }
        if (m27440m()) {
            this.f21744j.m27367a("requestClearDefaultAccountInternal()");
            this.f21738d.clearDefaultAccountAndReconnect();
        }
    }

    /* renamed from: j */
    private void m27437j() {
        if (m27440m()) {
            this.f21744j.m27367a("requestRevokeAccessInternal()");
            try {
                alw.f2021k.d(this.f21738d).a(new C49261(this));
            } catch (Exception e) {
                if (f21734a) {
                    Log.d("SocialGplusController", "requestRevokeAccessInternal() ex=" + e.getMessage());
                }
            }
        }
    }

    /* renamed from: g */
    public void m27460g() {
        m27430e("CLEAN_TOKEN");
    }

    /* renamed from: k */
    private void m27438k() {
        if (m27440m()) {
            if (f21734a) {
                Log.d("SocialGplusController", "requestGplusInvalidateToken " + this.f21738d.isConnected());
            }
            this.f21744j.m27367a("requestGplusInvalidateToken, mClearGplusDefaultAccount=" + this.f21741g);
            m27458e();
            if (this.f21741g) {
                this.f21741g = false;
                m27459f();
            }
        }
    }

    /* renamed from: a */
    public void m27448a() {
        if (f21734a) {
            Log.d("SocialGplusController", "requestGplusLogin");
        }
        this.f21740f = true;
        this.f21744j.m27367a("requestGplusLogin");
        this.f21738d.connect();
        m27430e("AUTHORIZE");
    }

    /* renamed from: l */
    private void m27439l() {
        if (m27440m()) {
            this.f21744j.m27367a("requestGoogleSignInInternal()");
            this.f21743i.post(new C49272(this));
        }
    }

    /* renamed from: b */
    private void m27425b(Bundle bundle) {
        if (f21734a) {
            Log.d("SocialGplusController", "initClient");
        }
        this.f21739e = new C4934a(this);
        C3296a b = new C3296a(GoogleSignInOptions.f14724e).a().b();
        if (this.f21746l != null) {
            if (this.f21746l.f21733b != null) {
                for (int i = 0; i < this.f21746l.f21733b.length; i++) {
                    if (f21734a) {
                        Log.d("SocialGplusController", "initClient() requestScopes=" + this.f21746l.f21733b[i]);
                    }
                    b.a(new Scope(this.f21746l.f21733b[i]), new Scope[0]);
                }
            }
            if (this.f21746l.f21732a != null) {
                b.a(this.f21746l.f21732a);
                b.b(this.f21746l.f21732a);
            }
        }
        this.f21738d = new Builder(this.f21736b).addConnectionCallbacks(this.f21739e).addOnConnectionFailedListener(this.f21739e).addApi(alw.f2016f, b.d()).build();
    }

    /* renamed from: m */
    private boolean m27440m() {
        return this.f21738d != null && this.f21738d.isConnected();
    }

    /* renamed from: n */
    private void m27441n() {
        if (this.f21738d != null) {
            if (f21734a) {
                Log.d("SocialGplusController", "destroyClient");
            }
            this.f21738d.unregisterConnectionCallbacks(this.f21739e);
            this.f21738d.unregisterConnectionFailedListener(this.f21739e);
        }
    }

    /* renamed from: a */
    public void m27451a(boolean z) {
        if (f21734a) {
            Log.d("SocialGplusController", "requestLogout() clearGplusDefaultAccount=" + z);
        }
        this.f21744j.m27367a("requestLogout() clearGplusDefaultAccount=" + z);
        this.f21741g = z;
        m27430e("LOGOUT");
    }

    /* renamed from: o */
    private void m27442o() {
        if (f21734a) {
            Log.d("SocialGplusController", "requestSignOutInternal()");
        }
        this.f21744j.m27367a("requestSignOutInternal");
        if (m27440m()) {
            m27460g();
        }
        this.f21744j.m27367a("requestSignOutInternal()");
        try {
            alw.f2021k.c(this.f21738d).a(new C49283(this));
        } catch (Exception e) {
            if (f21734a) {
                Log.d("SocialGplusController", "requestSignOutInternal() ex=" + e.getMessage());
            }
        }
    }

    /* renamed from: p */
    private void m27443p() {
        if (m27440m()) {
            try {
                this.f21744j.m27367a("requestUserTokenInternal()");
                this.f21743i.post(new C49304(this));
            } catch (Exception e) {
                this.f21744j.m27367a("requestUserTokenInternal Exception=" + e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public void m27456c(final String str) {
        new AsyncTask<Void, Void, Void>(this) {
            /* renamed from: b */
            final /* synthetic */ dim f21723b;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m27409a((Void[]) objArr);
            }

            /* renamed from: a */
            protected Void m27409a(Void... voidArr) {
                try {
                    this.f21723b.f21744j.m27367a("clearToken");
                    if (dim.f21734a) {
                        Log.d("SocialGplusController", "clearToken() token=" + str);
                    }
                    alt.a(this.f21723b.f21737c, str);
                } catch (alu e) {
                    if (dim.f21734a) {
                        Log.d("SocialGplusController", "clearToken() GooglePlayServicesAvailabilityException=" + e.toString());
                    }
                    this.f21723b.f21744j.m27367a("clearToken() GooglePlayServicesAvailabilityException=" + e.toString());
                } catch (als e2) {
                    if (dim.f21734a) {
                        Log.d("SocialGplusController", "clearToken() GoogleAuthException=" + e2.toString());
                    }
                    this.f21723b.f21744j.m27367a("clearToken() GoogleAuthException=" + e2.toString());
                } catch (Exception e3) {
                    if (dim.f21734a) {
                        Log.d("SocialGplusController", "clearToken() Exception=" + e3.toString());
                    }
                    this.f21723b.f21744j.m27367a("clearToken() Exception=" + e3.toString());
                }
                return null;
            }
        }.execute(new Void[0]);
    }

    /* renamed from: a */
    protected void m27450a(String str) {
        if (f21734a) {
            Log.d("SocialGplusController", "onGetTokenDone()");
        }
    }

    /* renamed from: q */
    private long m27444q() {
        return (djw.m27632a() / 1000) + 3600;
    }

    /* renamed from: d */
    private void m27428d(String str) {
        try {
            if (f21734a) {
                Log.d("SocialGplusController", "storeToken() token=" + str);
            }
            if (this.f21737c != null) {
                Editor edit = this.f21737c.getSharedPreferences("gplus_store", 0).edit();
                edit.clear();
                edit.putString("token", str);
                edit.commit();
            }
        } catch (Exception e) {
        }
    }

    /* renamed from: r */
    private String m27445r() {
        String str = "";
        try {
            if (this.f21737c != null) {
                str = this.f21737c.getSharedPreferences("gplus_store", 0).getString("token", "");
            }
            if (f21734a) {
                Log.d("SocialGplusController", "retrieveToken() token=" + str);
            }
        } catch (Exception e) {
        }
        return str;
    }

    /* renamed from: a */
    private static String m27416a(ArrayList arrayList) {
        String str = "oauth2:";
        for (int i = 0; i < arrayList.size(); i++) {
            str = str + arrayList.get(i) + " ";
        }
        return str.trim();
    }

    /* renamed from: a */
    private void m27417a(ami ami, Boolean bool) {
        if (ami == null) {
            this.f21744j.m27368b("handleSignInResult empty result, isSilent=" + bool);
            m27446s();
            return;
        }
        Status b = ami.b();
        int f = b.f();
        String a = amj.a(f);
        if (f21734a) {
            Log.d("SocialGplusController", "handleSignInResult() isSuccess=" + ami.c() + ", code=" + f + ", codeMessage=" + a + ", hasResolution=" + b.d());
        }
        if (ami.c()) {
            m27418a(ami.a());
            return;
        }
        this.f21744j.m27368b("code=" + f + ", message=" + a + ", hasResolution=" + b.d());
        if (b.d()) {
            try {
                b.a(this.f21736b, 10001);
                return;
            } catch (Exception e) {
                if (f21734a) {
                    Log.d("SocialGplusController", "handleSignInResult() ex=" + e.getMessage());
                }
                m27446s();
                return;
            }
        }
        m27446s();
    }

    /* renamed from: s */
    private void m27446s() {
        m27422a("", "", "");
    }

    /* renamed from: a */
    public static String m27415a(Context context, String str, ArrayList<String> arrayList) {
        String a;
        Account account = new Account(str, "com.google");
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add("https://www.googleapis.com/auth/userinfo.email");
            if (f21734a) {
                Log.d("SocialGplusController", "getAccessTokenByAccountEmail() added default scopes");
            }
        }
        for (int i = 0; i < arrayList2.size(); i++) {
            if (f21734a) {
                Log.d("SocialGplusController", "getAccessTokenByAccountEmail() scope=" + ((String) arrayList2.get(i)));
            }
        }
        try {
            a = alt.a(context, account, dim.m27416a(arrayList2));
        } catch (Exception e) {
            if (f21734a) {
                Log.d("SocialGplusController", "getAccessTokenByAccountEmail() Exception=" + e.getMessage());
            }
            a = null;
        }
        if (f21734a) {
            Log.d("SocialGplusController", "getAccessTokenByAccountEmail() accessToken=" + a);
        }
        return a;
    }

    /* renamed from: a */
    private void m27418a(final GoogleSignInAccount googleSignInAccount) {
        if (googleSignInAccount == null) {
            m27446s();
            return;
        }
        if (f21734a) {
            Log.d("SocialGplusController", "id=" + googleSignInAccount.a());
            Log.d("SocialGplusController", "name=" + googleSignInAccount.d());
            Log.d("SocialGplusController", "email=" + googleSignInAccount.c());
            Log.d("SocialGplusController", "idToken=" + googleSignInAccount.b());
            Log.d("SocialGplusController", "serverAuthCode=" + googleSignInAccount.h());
        }
        final ArrayList arrayList = new ArrayList();
        for (Scope scope : googleSignInAccount.l()) {
            String scope2 = scope.toString();
            if (scope2.startsWith("http")) {
                if (f21734a) {
                    Log.d("SocialGplusController", "granted scopeString=" + scope2);
                }
                arrayList.add(scope2);
            }
        }
        new AsyncTask<Void, Void, String>(this) {
            /* renamed from: c */
            final /* synthetic */ dim f21726c;

            protected /* synthetic */ Object doInBackground(Object[] objArr) {
                return m27410a((Void[]) objArr);
            }

            protected /* synthetic */ void onPostExecute(Object obj) {
                m27411a((String) obj);
            }

            /* renamed from: a */
            protected String m27410a(Void... voidArr) {
                return dim.m27415a(this.f21726c.f21737c, googleSignInAccount.c(), arrayList);
            }

            /* renamed from: a */
            protected void m27411a(String str) {
                if (TextUtils.isEmpty(str)) {
                    this.f21726c.m27446s();
                    return;
                }
                this.f21726c.m27458e();
                this.f21726c.m27422a(googleSignInAccount.c(), googleSignInAccount.b(), str);
                this.f21726c.m27450a(str);
                this.f21726c.m27428d(str);
            }
        }.executeOnExecutor(djx.m27634a(), new Void[0]);
    }

    /* renamed from: a */
    private void m27422a(final String str, final String str2, final String str3) {
        this.f21743i.post(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ dim f21730d;

            public void run() {
                if (dim.f21734a) {
                    Log.d("SocialGplusController", "postAuthResult() GplusTokenReadyEvent accountName=" + str + ", idToken=" + str2 + ", accessToken=" + str3 + " , mEventScopeOnce=" + this.f21730d.f21745k + ", mForceResponse=" + this.f21730d.f21742h);
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                    Object dip = new dip(str, str3, this.f21730d.m27444q(), this.f21730d.f21742h);
                    dip.m27461a(str2);
                    if (this.f21730d.f21745k == null) {
                        dhe.m27280a().m27269c(dip);
                    } else {
                        dhe.m27287c(this.f21730d.f21745k, dip);
                    }
                } else if (this.f21730d.f21745k == null) {
                    dhe.m27280a().m27269c(new dio());
                } else {
                    dhe.m27287c(this.f21730d.f21745k, new dio());
                }
                this.f21730d.f21745k = null;
            }
        });
    }

    /* renamed from: e */
    private synchronized void m27430e(String str) {
        if (f21734a) {
            Log.d("SocialGplusController", "enqueueAction() actionKey=" + str);
        }
        f21735m.add(str);
        m27447t();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: t */
    private synchronized void m27447t() {
        /*
        r5 = this;
        r1 = 0;
        monitor-enter(r5);
        r0 = r5.f21738d;	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x0013;
    L_0x0006:
        r0 = f21734a;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = "SocialGplusController";
        r1 = "handlePendingActions() no client";
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x002c }
    L_0x0011:
        monitor-exit(r5);
        return;
    L_0x0013:
        r0 = r5.f21738d;	 Catch:{ all -> 0x002c }
        r0 = r0.isConnected();	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x002f;
    L_0x001b:
        r0 = f21734a;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0026;
    L_0x001f:
        r0 = "SocialGplusController";
        r1 = "handlePendingActions() not connected, connect now()";
        android.util.Log.d(r0, r1);	 Catch:{ all -> 0x002c }
    L_0x0026:
        r0 = r5.f21738d;	 Catch:{ all -> 0x002c }
        r0.connect();	 Catch:{ all -> 0x002c }
        goto L_0x0011;
    L_0x002c:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x002f:
        r0 = f21734a;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x0051;
    L_0x0033:
        r0 = "SocialGplusController";
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002c }
        r2.<init>();	 Catch:{ all -> 0x002c }
        r3 = "handlePendingActions() pending action count=";
        r2 = r2.append(r3);	 Catch:{ all -> 0x002c }
        r3 = f21735m;	 Catch:{ all -> 0x002c }
        r3 = r3.size();	 Catch:{ all -> 0x002c }
        r2 = r2.append(r3);	 Catch:{ all -> 0x002c }
        r2 = r2.toString();	 Catch:{ all -> 0x002c }
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x002c }
    L_0x0051:
        r0 = f21735m;	 Catch:{ all -> 0x002c }
        r0 = r0.size();	 Catch:{ all -> 0x002c }
        if (r0 <= 0) goto L_0x0011;
    L_0x0059:
        r0 = f21735m;	 Catch:{ all -> 0x002c }
        r2 = 0;
        r0 = r0.remove(r2);	 Catch:{ all -> 0x002c }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x002c }
        r2 = f21734a;	 Catch:{ all -> 0x002c }
        if (r2 == 0) goto L_0x007e;
    L_0x0066:
        r2 = "SocialGplusController";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002c }
        r3.<init>();	 Catch:{ all -> 0x002c }
        r4 = "handlePendingActions() actionKey=";
        r3 = r3.append(r4);	 Catch:{ all -> 0x002c }
        r3 = r3.append(r0);	 Catch:{ all -> 0x002c }
        r3 = r3.toString();	 Catch:{ all -> 0x002c }
        android.util.Log.d(r2, r3);	 Catch:{ all -> 0x002c }
    L_0x007e:
        r2 = -1;
        r3 = r0.hashCode();	 Catch:{ Exception -> 0x008f }
        switch(r3) {
            case -2043999862: goto L_0x00b7;
            case -1722949565: goto L_0x00c1;
            case -336361507: goto L_0x00cb;
            case -32761911: goto L_0x00a3;
            case 555251600: goto L_0x00ad;
            case 1681908029: goto L_0x00d5;
            default: goto L_0x0086;
        };	 Catch:{ Exception -> 0x008f }
    L_0x0086:
        r0 = r2;
    L_0x0087:
        switch(r0) {
            case 0: goto L_0x008b;
            case 1: goto L_0x00df;
            case 2: goto L_0x00e4;
            case 3: goto L_0x00e9;
            case 4: goto L_0x00ee;
            case 5: goto L_0x00f3;
            default: goto L_0x008a;
        };	 Catch:{ Exception -> 0x008f }
    L_0x008a:
        goto L_0x0051;
    L_0x008b:
        r5.m27439l();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
    L_0x008f:
        r0 = move-exception;
        r0 = f21734a;	 Catch:{ all -> 0x002c }
        if (r0 == 0) goto L_0x009b;
    L_0x0094:
        r0 = "SocialGplusController";
        r2 = "handlePendingActions Exception";
        android.util.Log.d(r0, r2);	 Catch:{ all -> 0x002c }
    L_0x009b:
        r0 = r5.f21744j;	 Catch:{ all -> 0x002c }
        r2 = "handlePendingActions exception";
        r0.m27367a(r2);	 Catch:{ all -> 0x002c }
        goto L_0x0051;
    L_0x00a3:
        r3 = "AUTHORIZE";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00ab:
        r0 = r1;
        goto L_0x0087;
    L_0x00ad:
        r3 = "GET_TOKEN";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00b5:
        r0 = 1;
        goto L_0x0087;
    L_0x00b7:
        r3 = "LOGOUT";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00bf:
        r0 = 2;
        goto L_0x0087;
    L_0x00c1:
        r3 = "CLEAN_TOKEN";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00c9:
        r0 = 3;
        goto L_0x0087;
    L_0x00cb:
        r3 = "CLEAR_DEFAULT_ACCOUNT";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00d3:
        r0 = 4;
        goto L_0x0087;
    L_0x00d5:
        r3 = "REVOKE_ACCESS";
        r0 = r0.equals(r3);	 Catch:{ Exception -> 0x008f }
        if (r0 == 0) goto L_0x0086;
    L_0x00dd:
        r0 = 5;
        goto L_0x0087;
    L_0x00df:
        r5.m27443p();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
    L_0x00e4:
        r5.m27442o();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
    L_0x00e9:
        r5.m27438k();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
    L_0x00ee:
        r5.m27436i();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
    L_0x00f3:
        r5.m27437j();	 Catch:{ Exception -> 0x008f }
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: dim.t():void");
    }
}
