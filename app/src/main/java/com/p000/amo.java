package com.p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import java.util.HashSet;
import p000.ari.C0301a;

/* renamed from: amo */
public final class amo {
    /* renamed from: a */
    private static ath f2082a = new ath("GoogleSignInCommon", new String[0]);

    /* renamed from: amo$a */
    static abstract class C0302a<R extends ant> extends C0301a<R, amn> {
        public C0302a(GoogleApiClient googleApiClient) {
            super(alw.f2016f, googleApiClient);
        }

        /* renamed from: a */
        public /* synthetic */ void mo349a(Object obj) {
            super.m2680a((ant) obj);
        }
    }

    /* renamed from: amo$1 */
    class C03031 extends C0302a<ami> {
        /* renamed from: a */
        final /* synthetic */ amw f2078a;
        /* renamed from: b */
        final /* synthetic */ GoogleSignInOptions f2079b;

        /* renamed from: amo$1$1 */
        class C02991 extends amk {
            /* renamed from: a */
            final /* synthetic */ C03031 f2058a;

            C02991(C03031 c03031) {
                this.f2058a = c03031;
            }

            /* renamed from: a */
            public void mo326a(GoogleSignInAccount googleSignInAccount, Status status) throws RemoteException {
                if (googleSignInAccount != null) {
                    this.f2058a.f2078a.m2755b(googleSignInAccount, this.f2058a.f2079b);
                }
                this.f2058a.m2680a(new ami(googleSignInAccount, status));
            }
        }

        C03031(GoogleApiClient googleApiClient, amw amw, GoogleSignInOptions googleSignInOptions) {
            this.f2078a = amw;
            this.f2079b = googleSignInOptions;
            super(googleApiClient);
        }

        /* renamed from: a */
        protected ami m2701a(Status status) {
            return new ami(null, status);
        }

        /* renamed from: a */
        protected void m2702a(amn amn) throws RemoteException {
            ((amt) amn.m2638v()).mo353a(new C02991(this), this.f2079b);
        }

        /* renamed from: b */
        protected /* synthetic */ ant mo352b(Status status) {
            return m2701a(status);
        }
    }

    /* renamed from: amo$2 */
    class C03052 extends C0302a<Status> {

        /* renamed from: amo$2$1 */
        class C03041 extends amk {
            /* renamed from: a */
            final /* synthetic */ C03052 f2080a;

            C03041(C03052 c03052) {
                this.f2080a = c03052;
            }

            /* renamed from: a */
            public void mo327a(Status status) throws RemoteException {
                this.f2080a.m2680a((ant) status);
            }
        }

        C03052(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: a */
        protected Status m2706a(Status status) {
            return status;
        }

        /* renamed from: a */
        protected void m2707a(amn amn) throws RemoteException {
            ((amt) amn.m2638v()).mo354b(new C03041(this), amn.mo344e());
        }

        /* renamed from: b */
        protected /* synthetic */ ant mo352b(Status status) {
            return m2706a(status);
        }
    }

    /* renamed from: amo$3 */
    class C03073 extends C0302a<Status> {

        /* renamed from: amo$3$1 */
        class C03061 extends amk {
            /* renamed from: a */
            final /* synthetic */ C03073 f2081a;

            C03061(C03073 c03073) {
                this.f2081a = c03073;
            }

            /* renamed from: b */
            public void mo328b(Status status) throws RemoteException {
                this.f2081a.m2680a((ant) status);
            }
        }

        C03073(GoogleApiClient googleApiClient) {
            super(googleApiClient);
        }

        /* renamed from: a */
        protected Status m2711a(Status status) {
            return status;
        }

        /* renamed from: a */
        protected void m2712a(amn amn) throws RemoteException {
            ((amt) amn.m2638v()).mo355c(new C03061(this), amn.mo344e());
        }

        /* renamed from: b */
        protected /* synthetic */ ant mo352b(Status status) {
            return m2711a(status);
        }
    }

    /* renamed from: a */
    static ami m2715a(amw amw, GoogleSignInOptions googleSignInOptions) {
        f2082a.m5596a("GoogleSignInCommon", "getEligibleSavedSignInResult()");
        aoi.m4679a((Object) googleSignInOptions);
        GoogleSignInOptions b = amw.m2753b();
        if (b == null || !amo.m2722a(b.m19486b(), googleSignInOptions.m19486b()) || googleSignInOptions.m19488d()) {
            return null;
        }
        if ((googleSignInOptions.m19487c() && (!b.m19487c() || !googleSignInOptions.m19490f().equals(b.m19490f()))) || !new HashSet(b.m19485a()).containsAll(new HashSet(googleSignInOptions.m19485a()))) {
            return null;
        }
        GoogleSignInAccount a = amw.m2749a();
        return (a == null || a.m19458j()) ? null : new ami(a, Status.f14761a);
    }

    /* renamed from: a */
    public static ami m2716a(Intent intent) {
        if (intent == null || (!intent.hasExtra("googleSignInStatus") && !intent.hasExtra("googleSignInAccount"))) {
            return null;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        if (googleSignInAccount != null) {
            status = Status.f14761a;
        }
        return new ami(googleSignInAccount, status);
    }

    /* renamed from: a */
    public static Intent m2717a(Context context, GoogleSignInOptions googleSignInOptions) {
        f2082a.m5596a("GoogleSignInCommon", "getSignInIntent()");
        Parcelable signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setClass(context, SignInHubActivity.class);
        intent.putExtra("config", signInConfiguration);
        return intent;
    }

    /* renamed from: a */
    private static anp<ami> m2718a(GoogleApiClient googleApiClient, amw amw, GoogleSignInOptions googleSignInOptions) {
        f2082a.m5596a("GoogleSignInCommon", "trySilentSignIn()");
        return new asl(googleApiClient.zza(new C03031(googleApiClient, amw, googleSignInOptions)));
    }

    /* renamed from: a */
    public static anp<ami> m2719a(GoogleApiClient googleApiClient, Context context, GoogleSignInOptions googleSignInOptions) {
        amw a = amw.m2747a(context);
        ant a2 = amo.m2715a(a, googleSignInOptions);
        if (a2 == null) {
            return amo.m2718a(googleApiClient, a, googleSignInOptions);
        }
        f2082a.m5596a("GoogleSignInCommon", "Eligible saved sign in result found");
        return anr.m4566a(a2, googleApiClient);
    }

    /* renamed from: a */
    public static anq<Status> m2720a(GoogleApiClient googleApiClient, Context context) {
        f2082a.m5596a("GoogleSignInCommon", "Signing out");
        amo.m2721a(context);
        return googleApiClient.zzb(new C03052(googleApiClient));
    }

    /* renamed from: a */
    private static void m2721a(Context context) {
        amw.m2747a(context).m2757c();
        for (GoogleApiClient zzvn : GoogleApiClient.zzvm()) {
            zzvn.zzvn();
        }
        asa.m5433b();
    }

    /* renamed from: a */
    private static boolean m2722a(Account account, Account account2) {
        return account == null ? account2 == null : account.equals(account2);
    }

    /* renamed from: b */
    public static anq<Status> m2723b(GoogleApiClient googleApiClient, Context context) {
        f2082a.m5596a("GoogleSignInCommon", "Revoking access");
        amo.m2721a(context);
        return googleApiClient.zzb(new C03073(googleApiClient));
    }
}
