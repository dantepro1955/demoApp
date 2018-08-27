package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import com.facebook.internal.NativeProtocol;
import com.facebook.messenger.MessengerUtils;
import com.under9.android.lib.network.model.Constants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShareUtil */
/* renamed from: djs */
public class djs {
    /* renamed from: a */
    public static String m27615a(String str) {
        if (str == null || !str.contains(":")) {
            String str2 = str;
        } else {
            Object obj = str.split(":")[0];
        }
        if (obj != null && obj.contains(Constants.SEP)) {
            obj = obj.split(Constants.SEP)[0];
        }
        if ("com.facebook.katana".equals(obj)) {
            return "facebook";
        }
        if (MessengerUtils.PACKAGE_NAME.equals(obj)) {
            return "fbm";
        }
        if ("com.twitter.android".equals(obj)) {
            return "twitter";
        }
        if ("com.pinterest".equals(obj)) {
            return "pinterest";
        }
        if ("com.google.android.apps.plus".equals(obj)) {
            return "gplus";
        }
        if ("com.tumblr".equals(obj)) {
            return "tumblr";
        }
        if ("com.whatsapp".equals(obj)) {
            return "whatsapp";
        }
        if ("jp.naver.line.android".equals(obj)) {
            return "line";
        }
        return "com.android.chrome".equals(obj) ? "chrome" : null;
    }

    /* renamed from: b */
    public static Intent m27618b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setComponent(ComponentName.unflattenFromString("com.android.chrome/com.android.chrome.Main"));
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* renamed from: a */
    public static Intent m27613a(Uri uri, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("image/*");
        return intent;
    }

    /* renamed from: a */
    public static Intent m27614a(String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.setType("text/plain");
        return intent;
    }

    /* renamed from: b */
    public static Intent m27617b(Uri uri, String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
        }
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        return intent;
    }

    /* renamed from: a */
    public static Intent m27612a(PackageManager packageManager, Intent intent, String str, String str2) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        List arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str3 = resolveInfo.activityInfo.packageName;
            if (!(str3 == null || str3.startsWith(str2))) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str3);
                intent2.setClassName(str3, resolveInfo.activityInfo.name);
                arrayList.add(intent2);
            }
        }
        Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), str);
        createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
        return createChooser;
    }

    /* renamed from: a */
    public static boolean m27616a(Context context, Intent intent) {
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            return true;
        }
        return false;
    }
}
