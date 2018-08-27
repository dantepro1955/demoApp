package com.p000;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.TokenData;
import java.io.IOException;
import p000.axq.C0874a;

/* renamed from: ang */
public class ang {
    /* renamed from: a */
    private static final String[] f2000a = new String[]{"com.google", "com.google.work", "cn.google"};
    /* renamed from: b */
    private static final ComponentName f2001b = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
    @SuppressLint({"InlinedApi"})
    /* renamed from: c */
    public static final String f2002c = "callerUid";
    @SuppressLint({"InlinedApi"})
    /* renamed from: d */
    public static final String f2003d = "androidPackageName";
    /* renamed from: e */
    private static final ath f2004e = anf.m4507a("GoogleAuthUtil");

    /* renamed from: ang$a */
    interface C0640a<T> {
        /* renamed from: b */
        T mo564b(IBinder iBinder) throws RemoteException, IOException, als;
    }

    /* renamed from: ang$1 */
    class C06411 implements C0640a<TokenData> {
        /* renamed from: a */
        final /* synthetic */ Account f3764a;
        /* renamed from: b */
        final /* synthetic */ String f3765b;
        /* renamed from: c */
        final /* synthetic */ Bundle f3766c;

        C06411(Account account, String str, Bundle bundle) {
            this.f3764a = account;
            this.f3765b = str;
            this.f3766c = bundle;
        }

        /* renamed from: a */
        public TokenData m4509a(IBinder iBinder) throws RemoteException, IOException, als {
            Bundle bundle = (Bundle) ang.m2526b(C0874a.m6382a(iBinder).mo822a(this.f3764a, this.f3765b, this.f3766c));
            TokenData a = TokenData.m19398a(bundle, "tokenDetails");
            if (a != null) {
                return a;
            }
            String string = bundle.getString("Error");
            Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
            bpa a2 = bpa.m10225a(string);
            if (bpa.m10226a(a2)) {
                Object[] objArr = new Object[1];
                String valueOf = String.valueOf(a2);
                objArr[0] = new StringBuilder(String.valueOf(valueOf).length() + 31).append("isUserRecoverableError status: ").append(valueOf).toString();
                ang.f2004e.m5599c("GoogleAuthUtil", objArr);
                throw new alv(string, intent);
            } else if (bpa.m10227b(a2)) {
                throw new IOException(string);
            } else {
                throw new als(string);
            }
        }

        /* renamed from: b */
        public /* synthetic */ Object mo564b(IBinder iBinder) throws RemoteException, IOException, als {
            return m4509a(iBinder);
        }
    }

    /* renamed from: ang$2 */
    class C06422 implements C0640a<Void> {
        /* renamed from: a */
        final /* synthetic */ String f3767a;
        /* renamed from: b */
        final /* synthetic */ Bundle f3768b;

        C06422(String str, Bundle bundle) {
            this.f3767a = str;
            this.f3768b = bundle;
        }

        /* renamed from: a */
        public Void m4511a(IBinder iBinder) throws RemoteException, IOException, als {
            Bundle bundle = (Bundle) ang.m2526b(C0874a.m6382a(iBinder).mo824a(this.f3767a, this.f3768b));
            String string = bundle.getString("Error");
            if (bundle.getBoolean("booleanResult")) {
                return null;
            }
            throw new als(string);
        }

        /* renamed from: b */
        public /* synthetic */ Object mo564b(IBinder iBinder) throws RemoteException, IOException, als {
            return m4511a(iBinder);
        }
    }

    static {
        int i = VERSION.SDK_INT;
        i = VERSION.SDK_INT;
    }

    /* renamed from: a */
    private static <T> T m2520a(Context context, ComponentName componentName, C0640a<T> c0640a) throws IOException, als {
        Throwable e;
        ServiceConnection aqj = new aqj();
        apa a = apa.m4806a(context);
        if (a.m4807a(componentName, aqj, "GoogleAuthUtil")) {
            try {
                T b = c0640a.mo564b(aqj.m4943a());
                a.m4810b(componentName, aqj, "GoogleAuthUtil");
                return b;
            } catch (RemoteException e2) {
                e = e2;
                try {
                    f2004e.m5598b("GoogleAuthUtil", "Error on service connection.", e);
                    throw new IOException("Error on service connection.", e);
                } catch (Throwable th) {
                    a.m4810b(componentName, aqj, "GoogleAuthUtil");
                }
            } catch (InterruptedException e3) {
                e = e3;
                f2004e.m5598b("GoogleAuthUtil", "Error on service connection.", e);
                throw new IOException("Error on service connection.", e);
            }
        }
        throw new IOException("Could not bind to service.");
    }

    /* renamed from: a */
    public static String m2522a(Context context, Account account, String str, Bundle bundle) throws IOException, alv, als {
        ang.m2523a(account);
        return ang.m2525b(context, account, str, bundle).m19399a();
    }

    /* renamed from: a */
    private static void m2523a(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        } else if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        } else {
            String[] strArr = f2000a;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                if (!strArr[i].equals(account.type)) {
                    i++;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException("Account type not supported");
        }
    }

    /* renamed from: a */
    private static void m2524a(Context context) throws als {
        try {
            aqo.zzaq(context.getApplicationContext());
        } catch (anl e) {
            throw new alu(e.m4554a(), e.getMessage(), e.m4553b());
        } catch (ank e2) {
            throw new als(e2.getMessage());
        }
    }

    /* renamed from: b */
    public static TokenData m2525b(Context context, Account account, String str, Bundle bundle) throws IOException, alv, als {
        aoi.m4691c("Calling this from your main thread can lead to deadlock");
        aoi.m4682a(str, (Object) "Scope cannot be empty or null.");
        ang.m2523a(account);
        ang.m2524a(context);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(f2003d))) {
            bundle2.putString(f2003d, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return (TokenData) ang.m2520a(context, f2001b, new C06411(account, str, bundle2));
    }

    /* renamed from: b */
    private static <T> T m2526b(T t) throws IOException {
        if (t != null) {
            return t;
        }
        f2004e.m5599c("GoogleAuthUtil", "Binder call returned null.");
        throw new IOException("Service unavailable.");
    }

    /* renamed from: b */
    public static String m2527b(Context context, Account account, String str) throws IOException, alv, als {
        return ang.m2522a(context, account, str, new Bundle());
    }

    /* renamed from: b */
    public static void m2528b(Context context, String str) throws alu, als, IOException {
        aoi.m4691c("Calling this from your main thread can lead to deadlock");
        ang.m2524a(context);
        Bundle bundle = new Bundle();
        String str2 = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str2);
        if (!bundle.containsKey(f2003d)) {
            bundle.putString(f2003d, str2);
        }
        ang.m2520a(context, f2001b, new C06422(str, bundle));
    }
}
