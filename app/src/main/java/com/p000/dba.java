package com.p000;

import java.io.File;

/* compiled from: RootToolsInternalMethods */
/* renamed from: dba */
class dba {
    /* renamed from: a */
    static boolean m26182a() {
        for (String str : new String[]{"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"}) {
            if (new File(str + "su").exists()) {
                return true;
            }
        }
        return false;
    }
}
