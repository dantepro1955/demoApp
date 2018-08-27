package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.overlay.zzj;

@bhd
/* renamed from: ait */
public abstract class ait {
    /* renamed from: a */
    public abstract zzj mo212a(Context context, blo blo, int i, boolean z, bbj bbj);

    /* renamed from: a */
    protected boolean m1797a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        aqd.m4912b();
        return applicationInfo == null || applicationInfo.targetSdkVersion >= 11;
    }

    /* renamed from: a */
    protected boolean m1798a(blo blo) {
        return blo.mo1321k().f14934d;
    }
}
