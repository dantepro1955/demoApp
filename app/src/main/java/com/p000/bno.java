package com.p000;

import android.os.Build.VERSION;
import java.io.File;

/* renamed from: bno */
public class bno {
    /* renamed from: a */
    public static int m9973a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException e) {
            bnw.m10035a("Invalid version number", VERSION.SDK);
            return 0;
        }
    }

    /* renamed from: a */
    public static boolean m9974a(String str) {
        if (bno.m9973a() < 9) {
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
