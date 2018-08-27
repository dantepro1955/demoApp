package com.p000;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: StorageUtil */
/* renamed from: cqv */
public class cqv {
    /* renamed from: a */
    public static boolean m24517a() {
        long b = cqv.m24518b();
        return b > 200 || b > cqv.m24519c();
    }

    /* renamed from: b */
    private static long m24518b() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
    }

    /* renamed from: c */
    private static long m24519c() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
    }
}
