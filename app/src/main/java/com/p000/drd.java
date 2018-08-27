package com.p000;

import java.io.UnsupportedEncodingException;

/* renamed from: drd */
public class drd {
    /* renamed from: a */
    private static final rk f22660a = dnn.m28258a(drd.class);

    /* renamed from: a */
    public static int m28804a(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* renamed from: a */
    public static String m28805a(String str) {
        int i = 0;
        int length = str.length();
        char[] toCharArray = str.toCharArray();
        while (i < length && toCharArray[i] == ' ') {
            i++;
        }
        while (i < length && toCharArray[length - 1] == ' ') {
            length--;
        }
        return str.substring(i, length);
    }

    /* renamed from: a */
    public static String m28806a(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException e) {
            if (f22660a.mo4280d()) {
                f22660a.mo4279d(str + " character encoding is not available in your VM. Using the default one.");
            }
            return new String(bArr, i, i2);
        }
    }

    /* renamed from: b */
    public static int m28807b(byte[] bArr, int i) {
        return (drd.m28804a(bArr, i) & 65535) | ((drd.m28804a(bArr, i + 2) & 65535) << 16);
    }

    /* renamed from: c */
    public static long m28808c(byte[] bArr, int i) {
        return ((long) (((((bArr[i + 3] & 255) << 24) | ((bArr[i + 2] & 255) << 16)) | ((bArr[i + 1] & 255) << 8)) | (bArr[i] & 255))) & 4294967295L;
    }

    /* renamed from: d */
    public static int m28809d(byte[] bArr, int i) {
        if (f22660a.mo4274a()) {
            f22660a.mo4272a((Object) "Computing string length");
        }
        int i2 = i;
        while (bArr[i2] != (byte) 0) {
            i2++;
        }
        i2 -= i;
        if (f22660a.mo4274a()) {
            f22660a.mo4272a("String length: [" + i2 + "]");
        }
        return i2;
    }
}
