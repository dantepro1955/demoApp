package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.messenger.MessengerUtils;
import com.ninegag.android.app.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: GenericShareHelperV2 */
/* renamed from: cpw */
public class cpw {
    /* renamed from: a */
    private static caf f19951a = caf.a();

    /* renamed from: a */
    public static ArrayList<dhy> m24339a(Context context, clh clh) {
        return cpw.m24340a(context, clh, clh.d());
    }

    /* renamed from: b */
    public static ArrayList<dhy> m24345b(Context context, clh clh) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        HashSet hashSet = new HashSet();
        String a = clh.a();
        String str = "";
        Intent a2 = djs.m27614a(str, cpw.m24337a(context, clh, ".s"));
        List queryIntentActivities = packageManager.queryIntentActivities(a2, 0);
        Intent b = djs.m27617b(null, a, cpw.m24337a(context, clh, ".s.email"));
        List queryIntentActivities2 = packageManager.queryIntentActivities(b, 0);
        Intent b2 = djs.m27618b(cpw.m24338a(clh, ".s.chrome"));
        List queryIntentActivities3 = packageManager.queryIntentActivities(b2, 0);
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.facebook.katana", "", ".s.fb");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, MessengerUtils.PACKAGE_NAME, "", ".s.fbm");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.whatsapp", "", ".s.wt");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.twitter.android", "", ".s.tw");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.google.android.apps.plus", "", ".s.gp");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.google.android.talk", "", ".s.gt");
        cpw.m24342a(context, packageManager, queryIntentActivities3, arrayList, "com.android.chrome", b2);
        hashSet.add("com.facebook.katana");
        hashSet.add(MessengerUtils.PACKAGE_NAME);
        hashSet.add("com.whatsapp");
        hashSet.add("com.twitter.android");
        hashSet.add("com.google.android.apps.plus");
        hashSet.add("com.google.android.talk");
        cpw.m24344a(context, packageManager, queryIntentActivities2, hashSet, arrayList, b);
        cpw.m24344a(context, packageManager, queryIntentActivities, hashSet, arrayList, a2);
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList<dhy> m24340a(Context context, clh clh, Uri uri) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        HashSet hashSet = new HashSet();
        String string = context.getString(R.string.share_gag_subject);
        String str = "";
        Intent a = djs.m27614a(str, cpw.m24337a(context, clh, ".s"));
        List queryIntentActivities = packageManager.queryIntentActivities(a, 0);
        List queryIntentActivities2 = packageManager.queryIntentActivities(djs.m27613a(uri, "", ""), 0);
        Intent b = djs.m27617b(uri, string, cpw.m24337a(context, clh, ".s.email"));
        List queryIntentActivities3 = packageManager.queryIntentActivities(b, 0);
        Intent b2 = djs.m27618b(cpw.m24338a(clh, ".s.chrome"));
        List queryIntentActivities4 = packageManager.queryIntentActivities(b2, 0);
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.facebook.katana", "", ".s.fb");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, MessengerUtils.PACKAGE_NAME, "", ".s.fbm");
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.whatsapp", "", ".s.wt");
        cpw.m24342a(context, packageManager, queryIntentActivities4, arrayList, "com.android.chrome", b2);
        cpw.m24341a(context, packageManager, queryIntentActivities, clh, arrayList, "com.twitter.android", "", ".s.tw");
        cpw.m24341a(context, packageManager, queryIntentActivities2, clh, arrayList, "com.google.android.apps.plus", "", ".s.gp");
        cpw.m24341a(context, packageManager, queryIntentActivities2, clh, arrayList, "com.google.android.talk", "", ".s.gt");
        hashSet.add("com.facebook.katana");
        hashSet.add(MessengerUtils.PACKAGE_NAME);
        hashSet.add("com.twitter.android");
        hashSet.add("com.google.android.apps.plus");
        hashSet.add("com.google.android.talk");
        hashSet.add("com.whatsapp");
        cpw.m24344a(context, packageManager, queryIntentActivities3, hashSet, arrayList, b);
        cpw.m24344a(context, packageManager, queryIntentActivities, hashSet, arrayList, a);
        return arrayList;
    }

    /* renamed from: a */
    private static void m24342a(Context context, PackageManager packageManager, List<ResolveInfo> list, ArrayList<dhy> arrayList, String str, Intent intent) {
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo != null) {
                try {
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(dhy.m27348a(packageManager, intent, resolveInfo, f19951a.y()));
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m24343a(Context context, PackageManager packageManager, List<ResolveInfo> list, ArrayList<dhy> arrayList, String str, String str2, String str3) {
        Intent a = djs.m27614a(str2, str3);
        for (ResolveInfo resolveInfo : list) {
            if (resolveInfo != null) {
                try {
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(dhy.m27348a(packageManager, a, resolveInfo, f19951a.y()));
                    }
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m24341a(Context context, PackageManager packageManager, List<ResolveInfo> list, clh clh, ArrayList<dhy> arrayList, String str, String str2, String str3) {
        cpw.m24343a(context, packageManager, list, arrayList, str, str2, cpw.m24337a(context, clh, str3));
    }

    /* renamed from: a */
    private static void m24344a(Context context, PackageManager packageManager, List<ResolveInfo> list, HashSet<String> hashSet, ArrayList<dhy> arrayList, Intent intent) {
        for (ResolveInfo resolveInfo : list) {
            if (!hashSet.contains(resolveInfo.activityInfo.packageName)) {
                arrayList.add(dhy.m27348a(packageManager, intent, resolveInfo, f19951a.y()));
                hashSet.add(resolveInfo.activityInfo.packageName);
            }
        }
    }

    /* renamed from: a */
    public static String m24338a(clh clh, String str) {
        return clh.c() + str;
    }

    /* renamed from: a */
    public static String m24337a(Context context, clh clh, String str) {
        return clh.b() + str;
    }
}
