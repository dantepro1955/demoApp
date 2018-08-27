package com.p000;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: StorageUtil */
/* renamed from: djv */
public class djv {
    /* renamed from: a */
    public static boolean m27629a() {
        long b = djv.m27630b();
        return b > 200 || b > djv.m27631c();
    }

    /* renamed from: b */
    private static long m27630b() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
    }

    /* renamed from: c */
    private static long m27631c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
    }
}
