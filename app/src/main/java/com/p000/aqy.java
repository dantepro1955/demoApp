package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqy */
public class aqy {
    /* renamed from: a */
    static Map<String, aqy> f3981a = new HashMap();
    /* renamed from: f */
    static String f3982f;
    /* renamed from: g */
    private static arc f3983g;
    /* renamed from: h */
    private static arb f3984h;
    /* renamed from: b */
    Context f3985b;
    /* renamed from: c */
    KeyPair f3986c;
    /* renamed from: d */
    String f3987d = "";
    /* renamed from: e */
    long f3988e;

    protected aqy(Context context, String str, Bundle bundle) {
        this.f3985b = context.getApplicationContext();
        this.f3987d = str;
    }

    /* renamed from: a */
    static int m5003a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return i;
        }
    }

    /* renamed from: a */
    public static synchronized aqy m5004a(Context context, Bundle bundle) {
        aqy aqy;
        synchronized (aqy.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (f3983g == null) {
                f3983g = new arc(applicationContext);
                f3984h = new arb(applicationContext);
            }
            f3982f = Integer.toString(aqy.m5003a(applicationContext));
            aqy = (aqy) f3981a.get(str);
            if (aqy == null) {
                aqy = new aqy(applicationContext, str, bundle);
                f3981a.put(str, aqy);
            }
        }
        return aqy;
    }

    /* renamed from: a */
    static String m5005a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            Log.w("InstanceID", "Unexpected error, device missing required alghorithms");
            return null;
        }
    }

    /* renamed from: a */
    static String m5006a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: b */
    static String m5007b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            Log.w("InstanceID", new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf).toString());
            return null;
        }
    }

    /* renamed from: c */
    public static aqy m5008c(Context context) {
        return aqy.m5004a(context, null);
    }

    /* renamed from: a */
    KeyPair m5009a() {
        if (this.f3986c == null) {
            this.f3986c = f3983g.m5059c(this.f3987d);
        }
        if (this.f3986c == null) {
            this.f3988e = System.currentTimeMillis();
            this.f3986c = f3983g.m5052a(this.f3987d, this.f3988e);
        }
        return this.f3986c;
    }

    /* renamed from: a */
    public void m5010a(String str, String str2, Bundle bundle) throws IOException {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(GoogleCloudMessaging.ERROR_MAIN_THREAD);
        }
        f3983g.m5058b(this.f3987d, str, str2);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("sender", str);
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("subscription", str);
        bundle.putString("delete", "1");
        bundle.putString("X-delete", "1");
        bundle.putString("subtype", "".equals(this.f3987d) ? str : this.f3987d);
        String str3 = "X-subtype";
        if (!"".equals(this.f3987d)) {
            str = this.f3987d;
        }
        bundle.putString(str3, str);
        f3984h.m5043b(f3984h.m5037a(bundle, m5009a()));
    }

    /* renamed from: b */
    public String m5011b(String str, String str2, Bundle bundle) throws IOException {
        Object obj = null;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException(GoogleCloudMessaging.ERROR_MAIN_THREAD);
        }
        Object obj2 = 1;
        String a = m5016e() ? null : f3983g.m5051a(this.f3987d, str, str2);
        if (a == null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            if (bundle.getString("ttl") != null) {
                obj2 = null;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                obj = obj2;
            }
            a = m5013c(str, str2, bundle);
            if (!(a == null || r1 == null)) {
                f3983g.m5054a(this.f3987d, str, str2, a, f3982f);
            }
        }
        return a;
    }

    /* renamed from: b */
    public void m5012b() throws IOException {
        m5010a("*", "*", null);
        m5014c();
    }

    /* renamed from: c */
    public String m5013c(String str, String str2, Bundle bundle) throws IOException {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f3987d) ? str : this.f3987d;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        return f3984h.m5043b(f3984h.m5037a(bundle, m5009a()));
    }

    /* renamed from: c */
    public void m5014c() {
        this.f3988e = 0;
        f3983g.m5060d(this.f3987d);
        this.f3986c = null;
    }

    /* renamed from: d */
    public arc m5015d() {
        return f3983g;
    }

    /* renamed from: e */
    boolean m5016e() {
        String a = f3983g.m5049a("appVersion");
        if (a == null || !a.equals(f3982f)) {
            return true;
        }
        a = f3983g.m5049a("lastToken");
        if (a == null) {
            return true;
        }
        return (System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a)).longValue() > 604800;
    }
}
