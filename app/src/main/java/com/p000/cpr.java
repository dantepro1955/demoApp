package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import java.security.MessageDigest;

/* compiled from: EncryptionHelper */
/* renamed from: cpr */
public class cpr {
    /* renamed from: a */
    private static String m24328a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            int i = (b >>> 4) & 15;
            int i2 = 0;
            while (true) {
                char c = (i < 0 || i > 9) ? (char) ((i - 10) + 97) : (char) (i + 48);
                stringBuilder.append(c);
                int i3 = b & 15;
                i = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i;
                i = i3;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static String m24327a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(str.getBytes(Utf8Charset.NAME), 0, str.length());
            return cpr.m24328a(instance.digest());
        } catch (Exception e) {
            return "";
        }
    }
}
