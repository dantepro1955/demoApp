package com.p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat */
/* renamed from: dj */
public final class dj {
    /* renamed from: a */
    public static IBinder m27553a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return dl.m27768a(bundle, str);
        }
        return dk.m27649a(bundle, str);
    }
}
