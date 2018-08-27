package com.p000;

import com.facebook.appevents.AppEventsConstants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: EncodeUtil */
/* renamed from: djj */
public class djj {
    /* renamed from: a */
    public static String m27575a(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                stringBuilder.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public static byte[] m27576a(String str) {
        char[] toCharArray = str.toCharArray();
        int length = toCharArray.length;
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(toCharArray[i], 16) << 4) + Character.digit(toCharArray[i + 1], 16));
        }
        return bArr;
    }

    /* renamed from: b */
    public static String m27578b(String str) {
        return new String(djj.m27576a(str));
    }

    /* renamed from: c */
    public static byte[] m27579c(String str) {
        return djj.m27577a("MD5", str);
    }

    /* renamed from: d */
    public static byte[] m27580d(String str) {
        return djj.m27577a("SHA-1", str);
    }

    /* renamed from: a */
    private static byte[] m27577a(String str, String str2) {
        byte[] bArr = null;
        if (str2 != null) {
            try {
                bArr = MessageDigest.getInstance(str).digest(str2.getBytes());
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bArr;
    }
}
