package com.p000;

import android.content.Context;
import android.os.Process;

/* compiled from: PermissionChecker */
/* renamed from: fi */
public final class fi {
    /* renamed from: a */
    public static int m30162a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = dd.m26490a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return dd.m26489a(context, a, str2) != 0 ? -2 : 0;
    }

    /* renamed from: a */
    public static int m30161a(Context context, String str) {
        return fi.m30162a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
