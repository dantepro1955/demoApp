package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: axl */
public class axl {
    /* renamed from: a */
    private static String f4897a;

    /* renamed from: a */
    public static String m6366a(Context context) {
        if (f4897a != null) {
            return f4897a;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        Object obj = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveActivity2 : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveActivity2.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveActivity2.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f4897a = null;
        } else if (arrayList.size() == 1) {
            f4897a = (String) arrayList.get(0);
        } else if (!TextUtils.isEmpty(obj) && !axl.m6367a(context, intent) && arrayList.contains(obj)) {
            f4897a = obj;
        } else if (arrayList.contains("com.android.chrome")) {
            f4897a = "com.android.chrome";
        } else if (arrayList.contains("com.chrome.beta")) {
            f4897a = "com.chrome.beta";
        } else if (arrayList.contains("com.chrome.dev")) {
            f4897a = "com.chrome.dev";
        } else if (arrayList.contains("com.google.android.apps.chrome")) {
            f4897a = "com.google.android.apps.chrome";
        }
        return f4897a;
    }

    /* renamed from: a */
    private static boolean m6367a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities == null || queryIntentActivities.size() == 0) {
                return false;
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
    }
}
