package com.p000;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.google.android.gms.common.ConnectionResult;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.ahs.C0181c;
import p000.aqn.C0699d;

/* renamed from: aqo */
public class aqo {
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 10260000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    private static boolean zzayA = false;
    static final AtomicBoolean zzayB = new AtomicBoolean();
    private static final AtomicBoolean zzayC = new AtomicBoolean();
    public static boolean zzayx = false;
    public static boolean zzayy = false;
    static boolean zzayz = false;

    protected aqo() {
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return aqm.m4517b().mo566a(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.m19503a(i);
    }

    @Deprecated
    public static String getOpenSourceSoftwareLicenseInfo(Context context) {
        InputStream openInputStream;
        try {
            openInputStream = context.getContentResolver().openInputStream(new Builder().scheme(UriUtil.QUALIFIED_RESOURCE_SCHEME).authority("com.google.android.gms").appendPath("raw").appendPath("oss_notice").build());
            String next = new Scanner(openInputStream).useDelimiter("\\A").next();
            if (openInputStream == null) {
                return next;
            }
            openInputStream.close();
            return next;
        } catch (NoSuchElementException e) {
            if (openInputStream != null) {
                openInputStream.close();
            }
            return null;
        } catch (Exception e2) {
            return null;
        } catch (Throwable th) {
            if (openInputStream != null) {
                openInputStream.close();
            }
        }
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            context.getResources().getString(C0181c.common_google_play_services_unknown_issue);
        } catch (Throwable th) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            aqo.zzaH(context);
        }
        int i = (apw.m4891b(context) || apw.m4893d(context)) ? 0 : 1;
        PackageInfo packageInfo = null;
        if (i != 0) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (NameNotFoundException e) {
                Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            aqp a = aqp.m4961a(context);
            if (i != 0) {
                if (a.m4962a(packageInfo, C0699d.f3955a) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                    return 9;
                }
                if (a.m4962a(packageInfo2, a.m4962a(packageInfo, C0699d.f3955a)) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                    return 9;
                }
            } else if (a.m4962a(packageInfo2, C0699d.f3955a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (apy.m4897a(packageInfo2.versionCode) < apy.m4897a(GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires " + GOOGLE_PLAY_SERVICES_VERSION_CODE + " but found " + packageInfo2.versionCode);
                return 2;
            }
            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
            if (applicationInfo == null) {
                try {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                } catch (Throwable e2) {
                    Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.", e2);
                    return 1;
                }
            }
            return !applicationInfo.enabled ? 3 : 0;
        } catch (NameNotFoundException e3) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 9:
                return true;
            default:
                return false;
        }
    }

    @TargetApi(21)
    static boolean zzA(Context context, String str) {
        boolean equals = str.equals("com.google.android.gms");
        if (aqd.m4920j()) {
            for (SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                if (str.equals(appPackageName.getAppPackageName())) {
                    return true;
                }
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, Utility.DEFAULT_STREAM_BUFFER_SIZE);
            if (equals) {
                return applicationInfo.enabled;
            }
            boolean z = applicationInfo.enabled && !aqo.zzaK(context);
            return z;
        } catch (NameNotFoundException e) {
            return false;
        }
    }

    @Deprecated
    public static int zzaC(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (NameNotFoundException e) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return i;
        }
    }

    @Deprecated
    public static void zzaF(Context context) {
        if (!zzayB.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException e) {
            }
        }
    }

    private static void zzaH(Context context) {
        if (!zzayC.get()) {
            int a = apl.m4853a(context);
            if (a == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            } else if (a != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
                String valueOf = String.valueOf("com.google.android.gms.version");
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 290).append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ").append(i).append(" but found ").append(a).append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"").append(valueOf).append("\" android:value=\"@integer/google_play_services_version\" />").toString());
            }
        }
    }

    public static boolean zzaI(Context context) {
        aqo.zzaL(context);
        return zzayz;
    }

    public static boolean zzaJ(Context context) {
        return aqo.zzaI(context) || !aqo.zzvd();
    }

    @TargetApi(18)
    public static boolean zzaK(Context context) {
        if (aqd.m4916f()) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
        }
        return false;
    }

    private static void zzaL(Context context) {
        if (!zzayA) {
            aqo.zzaM(context);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzaM(Context r7) {
        /*
        r6 = 1;
        r0 = p000.ato.m5611b(r7);	 Catch:{ NameNotFoundException -> 0x002e }
        r1 = "com.google.android.gms";
        r2 = 64;
        r0 = r0.m5609b(r1, r2);	 Catch:{ NameNotFoundException -> 0x002e }
        if (r0 == 0) goto L_0x002a;
    L_0x000f:
        r1 = p000.aqp.m4961a(r7);	 Catch:{ NameNotFoundException -> 0x002e }
        r2 = 1;
        r2 = new p000.aqn.C0694a[r2];	 Catch:{ NameNotFoundException -> 0x002e }
        r3 = 0;
        r4 = p000.aqn.C0699d.f3955a;	 Catch:{ NameNotFoundException -> 0x002e }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ NameNotFoundException -> 0x002e }
        r2[r3] = r4;	 Catch:{ NameNotFoundException -> 0x002e }
        r0 = r1.m4962a(r0, r2);	 Catch:{ NameNotFoundException -> 0x002e }
        if (r0 == 0) goto L_0x002a;
    L_0x0024:
        r0 = 1;
        zzayz = r0;	 Catch:{ NameNotFoundException -> 0x002e }
    L_0x0027:
        zzayA = r6;
    L_0x0029:
        return;
    L_0x002a:
        r0 = 0;
        zzayz = r0;	 Catch:{ NameNotFoundException -> 0x002e }
        goto L_0x0027;
    L_0x002e:
        r0 = move-exception;
        r1 = "GooglePlayServicesUtil";
        r2 = "Cannot find Google Play services package name.";
        android.util.Log.w(r1, r2, r0);	 Catch:{ all -> 0x0039 }
        zzayA = r6;
        goto L_0x0029;
    L_0x0039:
        r0 = move-exception;
        zzayA = r6;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aqo.zzaM(android.content.Context):void");
    }

    @Deprecated
    public static void zzaq(Context context) throws anl, ank {
        int a = aqm.m4517b().mo565a(context);
        if (a != 0) {
            Intent b = aqm.m4517b().mo571b(context, a, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + a);
            if (b == null) {
                throw new ank(a);
            }
            throw new anl(a, "Google Play Services not available", b);
        }
    }

    @TargetApi(19)
    @Deprecated
    public static boolean zzc(Context context, int i, String str) {
        return aqh.m4930a(context, i, str);
    }

    @Deprecated
    public static boolean zzd(Context context, int i) {
        return i == 18 ? true : i == 1 ? aqo.zzA(context, "com.google.android.gms") : false;
    }

    @Deprecated
    public static boolean zze(Context context, int i) {
        return i == 9 ? aqo.zzA(context, "com.android.vending") : false;
    }

    @Deprecated
    public static boolean zzf(Context context, int i) {
        return aqh.m4929a(context, i);
    }

    @Deprecated
    public static boolean zzvd() {
        return apw.m4889a();
    }
}
