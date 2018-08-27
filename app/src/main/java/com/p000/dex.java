package com.p000;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

/* compiled from: AppAuthUtil */
/* renamed from: dex */
public class dex {
    /* renamed from: a */
    public static void m26897a(dft dft, Context context) {
        if (dft != null) {
            try {
                String packageName = context.getPackageName();
                String g = dct.m26395a().m26408d().m26391g();
                int i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                dft.m27087a("X-Package-ID", packageName);
                dft.m27086a("X-Package-Version", Integer.valueOf(i));
                dft.m27087a("X-Device-UUID", g);
            } catch (NameNotFoundException e) {
            }
        }
    }
}
