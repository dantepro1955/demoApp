package com.p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import io.fabric.sdk.android.services.common.IdManager;

/* compiled from: AppData */
/* renamed from: abc */
class abc {
    /* renamed from: a */
    public final String f159a;
    /* renamed from: b */
    public final String f160b;
    /* renamed from: c */
    public final String f161c;
    /* renamed from: d */
    public final String f162d;
    /* renamed from: e */
    public final String f163e;
    /* renamed from: f */
    public final String f164f;

    /* renamed from: a */
    public static abc m152a(Context context, IdManager idManager, String str, String str2) throws NameNotFoundException {
        String packageName = context.getPackageName();
        String j = idManager.j();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        return new abc(str, str2, j, packageName, Integer.toString(packageInfo.versionCode), packageInfo.versionName == null ? "0.0" : packageInfo.versionName);
    }

    abc(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f159a = str;
        this.f160b = str2;
        this.f161c = str3;
        this.f162d = str4;
        this.f163e = str5;
        this.f164f = str6;
    }
}
