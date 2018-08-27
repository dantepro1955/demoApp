package com.p000;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import java.io.File;

/* renamed from: bqy */
class bqy {
    /* renamed from: a */
    public static int m10482a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            String str = "Invalid version number: ";
            String valueOf = String.valueOf(VERSION.SDK);
            brd.m10493a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    @TargetApi(9)
    /* renamed from: a */
    static boolean m10483a(String str) {
        if (bqy.m10482a() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }
}
