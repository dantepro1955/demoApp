package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.iid.InstanceIDListenerService;
import java.io.File;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: arc */
public class arc {
    /* renamed from: a */
    SharedPreferences f4011a;
    /* renamed from: b */
    Context f4012b;

    public arc(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    public arc(Context context, String str) {
        this.f4012b = context;
        this.f4011a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf("-no-backup");
        m5048g(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
    }

    /* renamed from: c */
    private String m5047c(String str, String str2, String str3) {
        String valueOf = String.valueOf("|T|");
        return new StringBuilder((((String.valueOf(str).length() + 1) + String.valueOf(valueOf).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append(str).append(valueOf).append(str2).append("|").append(str3).toString();
    }

    /* renamed from: g */
    private void m5048g(String str) {
        File file = new File(aqg.m4927a(this.f4012b), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !m5055a()) {
                    Log.i("InstanceID/Store", "App restored, clearing state");
                    InstanceIDListenerService.m19608a(this.f4012b, this);
                }
            } catch (IOException e) {
                if (Log.isLoggable("InstanceID/Store", 3)) {
                    String str2 = "InstanceID/Store";
                    String str3 = "Error creating file in no backup dir: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                }
            }
        }
    }

    /* renamed from: a */
    synchronized String m5049a(String str) {
        return this.f4011a.getString(str, null);
    }

    /* renamed from: a */
    synchronized String m5050a(String str, String str2) {
        SharedPreferences sharedPreferences;
        String valueOf;
        sharedPreferences = this.f4011a;
        valueOf = String.valueOf("|S|");
        return sharedPreferences.getString(new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), null);
    }

    /* renamed from: a */
    public synchronized String m5051a(String str, String str2, String str3) {
        return this.f4011a.getString(m5047c(str, str2, str3), null);
    }

    /* renamed from: a */
    synchronized KeyPair m5052a(String str, long j) {
        KeyPair a;
        a = aqz.m5017a();
        Editor edit = this.f4011a.edit();
        m5053a(edit, str, "|P|", aqy.m5006a(a.getPublic().getEncoded()));
        m5053a(edit, str, "|K|", aqy.m5006a(a.getPrivate().getEncoded()));
        m5053a(edit, str, "cre", Long.toString(j));
        edit.commit();
        return a;
    }

    /* renamed from: a */
    synchronized void m5053a(Editor editor, String str, String str2, String str3) {
        String valueOf = String.valueOf("|S|");
        editor.putString(new StringBuilder((String.valueOf(str).length() + String.valueOf(valueOf).length()) + String.valueOf(str2).length()).append(str).append(valueOf).append(str2).toString(), str3);
    }

    /* renamed from: a */
    public synchronized void m5054a(String str, String str2, String str3, String str4, String str5) {
        String c = m5047c(str, str2, str3);
        Editor edit = this.f4011a.edit();
        edit.putString(c, str4);
        edit.putString("appVersion", str5);
        edit.putString("lastToken", Long.toString(System.currentTimeMillis() / 1000));
        edit.commit();
    }

    /* renamed from: a */
    public boolean m5055a() {
        return this.f4011a.getAll().isEmpty();
    }

    /* renamed from: b */
    public synchronized void m5056b() {
        this.f4011a.edit().clear().commit();
    }

    /* renamed from: b */
    public synchronized void m5057b(String str) {
        Editor edit = this.f4011a.edit();
        for (String str2 : this.f4011a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    /* renamed from: b */
    public synchronized void m5058b(String str, String str2, String str3) {
        String c = m5047c(str, str2, str3);
        Editor edit = this.f4011a.edit();
        edit.remove(c);
        edit.commit();
    }

    /* renamed from: c */
    public KeyPair m5059c(String str) {
        return m5062f(str);
    }

    /* renamed from: d */
    void m5060d(String str) {
        m5057b(String.valueOf(str).concat("|"));
    }

    /* renamed from: e */
    public void m5061e(String str) {
        m5057b(String.valueOf(str).concat("|T|"));
    }

    /* renamed from: f */
    KeyPair m5062f(String str) {
        Object e;
        String a = m5050a(str, "|P|");
        String a2 = m5050a(str, "|K|");
        if (a == null || a2 == null) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(a, 8);
            byte[] decode2 = Base64.decode(a2, 8);
            KeyFactory instance = KeyFactory.getInstance("RSA");
            return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
        } catch (InvalidKeySpecException e2) {
            e = e2;
            a = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(a).length() + 19).append("Invalid key stored ").append(a).toString());
            InstanceIDListenerService.m19608a(this.f4012b, this);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            a = String.valueOf(e);
            Log.w("InstanceID/Store", new StringBuilder(String.valueOf(a).length() + 19).append("Invalid key stored ").append(a).toString());
            InstanceIDListenerService.m19608a(this.f4012b, this);
            return null;
        }
    }
}
