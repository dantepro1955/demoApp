package com.p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;

/* renamed from: aqm */
public class aqm {
    /* renamed from: a */
    private static final aqm f3773a = new aqm();
    /* renamed from: b */
    public static final int f3774b = aqo.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    aqm() {
    }

    /* renamed from: b */
    public static aqm m4517b() {
        return f3773a;
    }

    /* renamed from: b */
    static String m4518b(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("gcore_");
        stringBuilder.append(f3774b);
        stringBuilder.append("-");
        if (!TextUtils.isEmpty(str)) {
            stringBuilder.append(str);
        }
        stringBuilder.append("-");
        if (context != null) {
            stringBuilder.append(context.getPackageName());
        }
        stringBuilder.append("-");
        if (context != null) {
            try {
                stringBuilder.append(ato.m5611b(context).m5609b(context.getPackageName(), 0).versionCode);
            } catch (NameNotFoundException e) {
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public int mo565a(Context context) {
        int isGooglePlayServicesAvailable = aqo.isGooglePlayServicesAvailable(context);
        return aqo.zzd(context, isGooglePlayServicesAvailable) ? 18 : isGooglePlayServicesAvailable;
    }

    /* renamed from: a */
    public PendingIntent mo566a(Context context, int i, int i2) {
        return mo567a(context, i, i2, null);
    }

    /* renamed from: a */
    public PendingIntent mo567a(Context context, int i, int i2, String str) {
        Intent b = mo571b(context, i, str);
        return b == null ? null : PendingIntent.getActivity(context, i2, b, 268435456);
    }

    /* renamed from: a */
    public boolean mo568a(int i) {
        return aqo.isUserRecoverableError(i);
    }

    /* renamed from: a */
    public boolean m4523a(Context context, String str) {
        return aqo.zzA(context, str);
    }

    /* renamed from: b */
    public int mo569b(Context context) {
        return aqo.zzaC(context);
    }

    @Deprecated
    /* renamed from: b */
    public Intent mo570b(int i) {
        return mo571b(null, i, null);
    }

    /* renamed from: b */
    public Intent mo571b(Context context, int i, String str) {
        switch (i) {
            case 1:
            case 2:
                return (context == null || !apw.m4891b(context)) ? apc.m4832a("com.google.android.gms", aqm.m4518b(context, str)) : apc.m4830a();
            case 3:
                return apc.m4831a("com.google.android.gms");
            default:
                return null;
        }
    }

    /* renamed from: b */
    public boolean mo572b(Context context, int i) {
        return aqo.zzd(context, i);
    }

    /* renamed from: c */
    public String mo573c(int i) {
        return aqo.getErrorString(i);
    }

    /* renamed from: d */
    public void m4529d(Context context) {
        aqo.zzaF(context);
    }
}
