package com.p000;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;

/* renamed from: atn */
public class atn {
    /* renamed from: a */
    protected final Context f4337a;

    public atn(Context context) {
        this.f4337a = context;
    }

    /* renamed from: a */
    public int m5604a(String str) {
        return this.f4337a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public int m5605a(String str, String str2) {
        return this.f4337a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: a */
    public ApplicationInfo m5606a(String str, int i) throws NameNotFoundException {
        return this.f4337a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: a */
    public boolean m5607a() {
        return Binder.getCallingUid() == Process.myUid() ? atm.m5603a(this.f4337a) : false;
    }

    @TargetApi(19)
    /* renamed from: a */
    public boolean m5608a(int i, String str) {
        if (aqd.m4917g()) {
            try {
                ((AppOpsManager) this.f4337a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException e) {
                return false;
            }
        }
        String[] packagesForUid = this.f4337a.getPackageManager().getPackagesForUid(i);
        if (str == null || packagesForUid == null) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public PackageInfo m5609b(String str, int i) throws NameNotFoundException {
        return this.f4337a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: b */
    public CharSequence m5610b(String str) throws NameNotFoundException {
        return this.f4337a.getPackageManager().getApplicationLabel(this.f4337a.getPackageManager().getApplicationInfo(str, 0));
    }
}
