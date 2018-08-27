package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: btt */
public final class btt {
    /* renamed from: a */
    private static final Uri f7629a = Uri.parse("http://play.google.com/store/apps/details");
    /* renamed from: b */
    private static final String[] f7630b = new String[]{"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms", null};

    /* renamed from: a */
    public static String m10953a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : f7630b) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(str), 0);
            if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.packageName != null) {
                return resolveService.serviceInfo.packageName;
            }
        }
        return packageManager.hasSystemFeature("android.software.leanback") ? "com.google.android.youtube.tv" : packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube";
    }

    /* renamed from: a */
    public static boolean m10954a(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || 12 > resourcesForApplication.getInteger(identifier) / 100;
        } catch (NameNotFoundException e) {
            return true;
        }
    }

    /* renamed from: b */
    public static Context m10955b(Context context) {
        try {
            return context.createPackageContext(btt.m10953a(context), 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    /* renamed from: c */
    public static int m10956c(Context context) {
        Context b = btt.m10955b(context);
        int i = 0;
        if (b != null) {
            i = b.getResources().getIdentifier("clientTheme", "style", btt.m10953a(context));
        }
        return i == 0 ? VERSION.SDK_INT >= 14 ? 16974120 : VERSION.SDK_INT >= 11 ? 16973931 : 16973829 : i;
    }

    /* renamed from: d */
    public static String m10957d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Throwable e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }
}
