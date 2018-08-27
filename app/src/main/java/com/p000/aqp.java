package com.p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import p000.aqn.C0694a;
import p000.aqn.C0695b;
import p000.aqn.C0699d;

/* renamed from: aqp */
public class aqp {
    /* renamed from: a */
    private static aqp f3958a;
    /* renamed from: b */
    private final Context f3959b;
    /* renamed from: c */
    private final atn f3960c = ato.m5611b(this.f3959b);

    private aqp(Context context) {
        this.f3959b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static aqp m4961a(Context context) {
        aoi.m4679a((Object) context);
        synchronized (aqp.class) {
            if (f3958a == null) {
                aqn.m4960a(context);
                f3958a = new aqp(context);
            }
        }
        return f3958a;
    }

    /* renamed from: a */
    C0694a m4962a(PackageInfo packageInfo, C0694a... c0694aArr) {
        int i = 0;
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C0695b c0695b = new C0695b(packageInfo.signatures[0].toByteArray());
        while (i < c0694aArr.length) {
            if (c0694aArr[i].equals(c0695b)) {
                return c0694aArr[i];
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public boolean m4963a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m4964a(packageInfo, false)) {
            return true;
        }
        if (!m4964a(packageInfo, true)) {
            return false;
        }
        if (aqo.zzaJ(this.f3959b)) {
            return true;
        }
        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        return false;
    }

    /* renamed from: a */
    public boolean m4964a(PackageInfo packageInfo, boolean z) {
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            C0694a a;
            if (z) {
                a = m4962a(packageInfo, C0699d.f3955a);
            } else {
                a = m4962a(packageInfo, C0699d.f3955a[0]);
            }
            if (a != null) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* renamed from: a */
    public boolean m4965a(PackageManager packageManager, PackageInfo packageInfo) {
        return m4963a(packageInfo);
    }
}
