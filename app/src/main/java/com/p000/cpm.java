package com.p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import com.ninegag.android.app.GagApplication;
import java.util.regex.Pattern;

/* compiled from: AppAuthUtil */
/* renamed from: cpm */
public class cpm {
    /* renamed from: a */
    private static caf f19941a = caf.a();

    /* renamed from: a */
    public static void m24306a(dft dft) {
        if (dft != null) {
            String V = f19941a.h().V();
            long currentTimeMillis = System.currentTimeMillis();
            String n = f19941a.h().n();
            String str = GagApplication.f16513a;
            String a = f19941a.h().a(currentTimeMillis);
            String str2 = f19941a.d().f8404a;
            String K = f19941a.q().K();
            if (V != null) {
                dft.m27087a("9GAG-9GAG_TOKEN", V);
            }
            dft.m27087a("9GAG-TIMESTAMP", Long.toString(currentTimeMillis));
            dft.m27087a("9GAG-APP_ID", str);
            dft.m27087a("9GAG-DEVICE_UUID", n);
            dft.m27087a("9GAG-REQUEST-SIGNATURE", a);
            dft.m27087a("9GAG-DEVICE_TYPE", str2);
            dft.m27087a("9GAG-BUCKET_NAME", K);
            dft.m27108d(f19941a.d().f8410g);
            dft.m27087a("X-Package-ID", str);
            dft.m27086a("X-Package-Version", Integer.valueOf(GagApplication.f16515c));
            dft.m27087a("X-Device-UUID", n);
        }
    }

    /* renamed from: a */
    public static String m24305a(Context context) {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (pattern.matcher(account.name).matches()) {
                return account.name;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m24307a() {
        return (System.currentTimeMillis() / 1000) + 30 > cip.a().U();
    }

    /* renamed from: b */
    public static boolean m24308b() {
        cip a = cip.a();
        long U = a.U();
        long M = a.M();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (M <= 0) {
            M = 3600;
        }
        return currentTimeMillis < U && (M / 3) + currentTimeMillis > U;
    }
}
