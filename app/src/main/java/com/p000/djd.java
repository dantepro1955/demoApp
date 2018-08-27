package com.p000;

/* compiled from: CommonTextUtil */
/* renamed from: djd */
public class djd {
    /* renamed from: a */
    public static boolean m27566a(String str) {
        return djd.m27567a(str, true);
    }

    /* renamed from: a */
    public static boolean m27567a(String str, boolean z) {
        if (str == null) {
            return true;
        }
        if (z) {
            if (str.trim().length() != 0) {
                return false;
            }
            return true;
        } else if (str.length() != 0) {
            return false;
        } else {
            return true;
        }
    }
}
