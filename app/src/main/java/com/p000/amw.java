package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* renamed from: amw */
public class amw {
    /* renamed from: a */
    private static final Lock f2088a = new ReentrantLock();
    /* renamed from: b */
    private static amw f2089b;
    /* renamed from: c */
    private final Lock f2090c = new ReentrantLock();
    /* renamed from: d */
    private final SharedPreferences f2091d;

    amw(Context context) {
        this.f2091d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static amw m2747a(Context context) {
        aoi.m4679a((Object) context);
        f2088a.lock();
        try {
            if (f2089b == null) {
                f2089b = new amw(context.getApplicationContext());
            }
            amw amw = f2089b;
            return amw;
        } finally {
            f2088a.unlock();
        }
    }

    /* renamed from: b */
    private String m2748b(String str, String str2) {
        String valueOf = String.valueOf(":");
        return new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString();
    }

    /* renamed from: a */
    public GoogleSignInAccount m2749a() {
        return m2750a(m2756c("defaultGoogleSignInAccount"));
    }

    /* renamed from: a */
    GoogleSignInAccount m2750a(String str) {
        GoogleSignInAccount googleSignInAccount = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m2756c(m2748b("googleSignInAccount", str));
            if (c != null) {
                try {
                    googleSignInAccount = GoogleSignInAccount.m19445a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInAccount;
    }

    /* renamed from: a */
    void m2751a(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        aoi.m4679a((Object) googleSignInAccount);
        aoi.m4679a((Object) googleSignInOptions);
        String k = googleSignInAccount.m19459k();
        m2752a(m2748b("googleSignInAccount", k), googleSignInAccount.m19462n());
        m2752a(m2748b("googleSignInOptions", k), googleSignInOptions.m19493i());
    }

    /* renamed from: a */
    protected void m2752a(String str, String str2) {
        this.f2090c.lock();
        try {
            this.f2091d.edit().putString(str, str2).apply();
        } finally {
            this.f2090c.unlock();
        }
    }

    /* renamed from: b */
    public GoogleSignInOptions m2753b() {
        return m2754b(m2756c("defaultGoogleSignInAccount"));
    }

    /* renamed from: b */
    GoogleSignInOptions m2754b(String str) {
        GoogleSignInOptions googleSignInOptions = null;
        if (!TextUtils.isEmpty(str)) {
            String c = m2756c(m2748b("googleSignInOptions", str));
            if (c != null) {
                try {
                    googleSignInOptions = GoogleSignInOptions.m19473a(c);
                } catch (JSONException e) {
                }
            }
        }
        return googleSignInOptions;
    }

    /* renamed from: b */
    public void m2755b(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        aoi.m4679a((Object) googleSignInAccount);
        aoi.m4679a((Object) googleSignInOptions);
        m2752a("defaultGoogleSignInAccount", googleSignInAccount.m19459k());
        m2751a(googleSignInAccount, googleSignInOptions);
    }

    /* renamed from: c */
    protected String m2756c(String str) {
        this.f2090c.lock();
        try {
            String string = this.f2091d.getString(str, null);
            return string;
        } finally {
            this.f2090c.unlock();
        }
    }

    /* renamed from: c */
    public void m2757c() {
        String c = m2756c("defaultGoogleSignInAccount");
        m2759e("defaultGoogleSignInAccount");
        m2758d(c);
    }

    /* renamed from: d */
    void m2758d(String str) {
        if (!TextUtils.isEmpty(str)) {
            m2759e(m2748b("googleSignInAccount", str));
            m2759e(m2748b("googleSignInOptions", str));
        }
    }

    /* renamed from: e */
    protected void m2759e(String str) {
        this.f2090c.lock();
        try {
            this.f2091d.edit().remove(str).apply();
        } finally {
            this.f2090c.unlock();
        }
    }
}
