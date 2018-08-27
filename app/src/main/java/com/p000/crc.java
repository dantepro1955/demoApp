package com.p000;

/* compiled from: UploadPostChecker */
/* renamed from: crc */
public class crc {
    /* renamed from: a */
    public static boolean m24536a(String[] strArr, String str) {
        int i = 0;
        while (i < strArr.length) {
            if (strArr[i] != null && !strArr[i].isEmpty() && str.contains(strArr[i])) {
                return true;
            }
            i++;
        }
        return false;
    }
}
