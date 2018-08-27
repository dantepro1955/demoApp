package com.p000;

import android.os.Environment;
import android.os.StatFs;

/* compiled from: SpaceUtil */
/* renamed from: dju */
public class dju {
    /* renamed from: a */
    public static long m27627a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
        } catch (Exception e) {
            return -1;
        }
    }

    /* renamed from: b */
    public static long m27628b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return (((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1048576;
        } catch (Exception e) {
            return -1;
        }
    }
}
