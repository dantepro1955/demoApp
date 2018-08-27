package com.p000;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;

/* compiled from: PackageUtil */
/* renamed from: djr */
public class djr {
    /* renamed from: a */
    public static final Drawable m27611a(PackageManager packageManager, String str, String str2) {
        if (str == null) {
            return null;
        }
        if (str2 != null) {
            return packageManager.getActivityIcon(new ComponentName(str, str2));
        }
        try {
            return packageManager.getApplicationIcon(str);
        } catch (Exception e) {
            return null;
        }
    }
}
