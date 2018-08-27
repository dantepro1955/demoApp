package com.p000;

/* renamed from: se */
public final class se {
    /* renamed from: a */
    private static byte[] f25460a = new byte[64];
    /* renamed from: b */
    private static String f25461b = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    static {
        for (int i = 0; i < 64; i++) {
            f25460a[i] = (byte) f25461b.charAt(i);
        }
    }

    /* renamed from: a */
    public static String m34086a(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[(((length + 2) / 3) << 2)];
        int i = length + 0;
        int i2 = 0;
        length = 0;
        int i3 = 0;
        int i4 = 0;
        while (i4 < i) {
            int i5;
            byte b = bArr[i4];
            length++;
            switch (length) {
                case 1:
                    i5 = i3 + 1;
                    bArr2[i3] = f25460a[(b >> 2) & 63];
                    break;
                case 2:
                    i5 = i3 + 1;
                    bArr2[i3] = f25460a[((i2 << 4) & 48) | ((b >> 4) & 15)];
                    break;
                case 3:
                    i5 = i3 + 1;
                    bArr2[i3] = f25460a[((i2 << 2) & 60) | ((b >> 6) & 3)];
                    length = i5 + 1;
                    bArr2[i5] = f25460a[b & 63];
                    i5 = length;
                    length = 0;
                    break;
                default:
                    i5 = i3;
                    break;
            }
            byte b2 = b;
            i4++;
            i3 = i5;
        }
        switch (length) {
            case 1:
                length = i3 + 1;
                bArr2[i3] = f25460a[(i2 << 4) & 48];
                int i6 = length + 1;
                bArr2[length] = (byte) 61;
                bArr2[i6] = (byte) 61;
                break;
            case 2:
                length = i3 + 1;
                bArr2[i3] = f25460a[(i2 << 2) & 60];
                bArr2[length] = (byte) 61;
                break;
        }
        return new String(bArr2);
    }
}
