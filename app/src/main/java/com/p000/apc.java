package com.p000;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.ninegag.android.library.upload.BaseUploadSourceActivity;

/* renamed from: apc */
public class apc {
    /* renamed from: a */
    private static final Uri f3896a = Uri.parse("https://plus.google.com/");
    /* renamed from: b */
    private static final Uri f3897b = f3896a.buildUpon().appendPath("circles").appendPath("find").build();

    /* renamed from: a */
    public static Intent m4830a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    /* renamed from: a */
    public static Intent m4831a(String str) {
        Uri fromParts = Uri.fromParts(BaseUploadSourceActivity.KEY_PACKAGE, str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    /* renamed from: a */
    public static Intent m4832a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(apc.m4833b(str, str2));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    /* renamed from: b */
    private static Uri m4833b(String str, String str2) {
        Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        return appendQueryParameter.build();
    }
}
