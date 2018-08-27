package com.p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.Crash.FatalException;
import io.fabric.sdk.android.services.settings.Settings;
import io.fabric.sdk.android.services.settings.SettingsData;
import java.io.File;

/* compiled from: Answers */
/* renamed from: zw */
public class zw extends Kit<Boolean> {
    /* renamed from: a */
    aam f26181a;

    /* renamed from: f */
    protected /* synthetic */ Object mo4896f() {
        return m35044d();
    }

    /* renamed from: a */
    public void m35042a(FatalException fatalException) {
        if (this.f26181a != null) {
            this.f26181a.a(fatalException.m31063a(), fatalException.m31064b());
        }
    }

    @SuppressLint({"NewApi"})
    protected boolean f_() {
        try {
            long j;
            Context r = m30949r();
            PackageManager packageManager = r.getPackageManager();
            String packageName = r.getPackageName();
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String num = Integer.toString(packageInfo.versionCode);
            String str = packageInfo.versionName == null ? "0.0" : packageInfo.versionName;
            if (VERSION.SDK_INT >= 9) {
                j = packageInfo.firstInstallTime;
            } else {
                j = new File(packageManager.getApplicationInfo(packageName, 0).sourceDir).lastModified();
            }
            this.f26181a = aam.a(this, r, m30948q(), num, str, j);
            this.f26181a.b();
            return true;
        } catch (Throwable e) {
            Fabric.m30879h().mo4877e("Answers", "Error retrieving app properties", e);
            return false;
        }
    }

    /* renamed from: d */
    protected Boolean m35044d() {
        try {
            SettingsData b = Settings.m31393a().m31396b();
            if (b == null) {
                Fabric.m30879h().mo4876e("Answers", "Failed to retrieve settings");
                return Boolean.valueOf(false);
            } else if (b.f24247d.f24216d) {
                Fabric.m30879h().mo4869a("Answers", "Analytics collection enabled");
                this.f26181a.a(b.f24248e, m35045e());
                return Boolean.valueOf(true);
            } else {
                Fabric.m30879h().mo4869a("Answers", "Analytics collection disabled");
                this.f26181a.c();
                return Boolean.valueOf(false);
            }
        } catch (Throwable e) {
            Fabric.m30879h().mo4877e("Answers", "Error dealing with settings", e);
            return Boolean.valueOf(false);
        }
    }

    /* renamed from: b */
    public String mo4895b() {
        return "com.crashlytics.sdk.android:answers";
    }

    /* renamed from: a */
    public String mo4894a() {
        return "1.3.13.dev";
    }

    /* renamed from: e */
    String m35045e() {
        return CommonUtils.m31046b(m30949r(), "com.crashlytics.ApiEndpoint");
    }
}
