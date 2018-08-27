package com.p000;

import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: DeviceHelper */
/* renamed from: djg */
public class djg {
    /* renamed from: a */
    public static boolean m27571a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front")) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
