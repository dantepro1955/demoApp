package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.facebook.messenger.MessengerUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: GenericShareHelper */
/* renamed from: cpv */
public class cpv {
    /* renamed from: a */
    private static caf f19950a = caf.a();

    /* renamed from: a */
    public static ArrayList<dhy> m24334a(Context context, String str, String str2, String str3) {
        ArrayList<dhy> arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        HashSet hashSet = new HashSet();
        Intent a = djs.m27614a("", str);
        List queryIntentActivities = packageManager.queryIntentActivities(a, 0);
        Intent b = djs.m27617b(null, str3, str);
        List queryIntentActivities2 = packageManager.queryIntentActivities(b, 0);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, "com.facebook.katana", "", str2);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, MessengerUtils.PACKAGE_NAME, "", str);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, "com.whatsapp", "", str);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, "com.twitter.android", "", str);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, "com.google.android.apps.plus", "", str);
        cpv.m24335a(context, packageManager, queryIntentActivities, arrayList, "com.google.android.talk", "", str);
        hashSet.add("com.facebook.katana");
        hashSet.add(MessengerUtils.PACKAGE_NAME);
        hashSet.add("com.whatsapp");
        hashSet.add("com.twitter.android");
        hashSet.add("com.google.android.apps.plus");
        hashSet.add("com.google.android.talk");
        cpv.m24336a(context, packageManager, queryIntentActivities2, hashSet, arrayList, b);
        cpv.m24336a(context, packageManager, queryIntentActivities, hashSet, arrayList, a);
        return arrayList;
    }

    /* renamed from: a */
    private static void m24336a(Context context, PackageManager packageManager, List<ResolveInfo> list, HashSet<String> hashSet, ArrayList<dhy> arrayList, Intent intent) {
        for (ResolveInfo resolveInfo : list) {
            if (!hashSet.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(dhy.m27348a(packageManager, intent, resolveInfo, f19950a.y()));
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
        }
    }

    /* renamed from: a */
    private static void m24335a(Context context, PackageManager packageManager, List<ResolveInfo> list, ArrayList<dhy> arrayList, String str, String str2, String str3) {
        Intent a = djs.m27614a(str2, str3);
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo != null) {
                try {
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(dhy.m27348a(packageManager, a, resolveInfo, f19950a.y()));
                    }
                } catch (Exception e) {
                }
            }
        }
    }
}
