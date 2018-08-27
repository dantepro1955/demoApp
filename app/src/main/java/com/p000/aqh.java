package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

/* renamed from: aqh */
public final class aqh {
    /* renamed from: a */
    public static boolean m4929a(Context context, int i) {
        boolean z = false;
        if (!aqh.m4930a(context, i, "com.google.android.gms")) {
            return z;
        }
        try {
            return aqp.m4961a(context).m4965a(context.getPackageManager(), context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (NameNotFoundException e) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return z;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return z;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m4930a(Context context, int i, String str) {
        return ato.m5611b(context).m5608a(i, str);
    }
}
