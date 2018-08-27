package com.p000;

import java.io.ByteArrayOutputStream;

/* renamed from: dnc */
public class dnc {
    /* renamed from: a */
    private short f22294a;

    public dnc(short s) {
        this.f22294a = s;
    }

    /* renamed from: a */
    public static int m28178a(int i) {
        return i <= 127 ? 1 : i <= 255 ? 2 : i <= 65535 ? 3 : 5;
    }

    /* renamed from: a */
    public static int m28179a(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        return i2 == 129 ? bArr[i + 1] & 255 : i2 == 130 ? ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255) : i2 == 132 ? ((((bArr[i + 1] & 255) << 24) + ((bArr[i + 2] & 255) << 16)) + ((bArr[i + 3] & 255) << 8)) + (bArr[i + 4] & 255) : i2;
    }

    /* renamed from: a */
    public final byte[] m28180a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.f22294a & 255);
        if (bArr.length > 65535) {
            byteArrayOutputStream.write(132);
            byteArrayOutputStream.write(bArr.length >>> 24);
            byteArrayOutputStream.write((bArr.length >> 16) & 255);
            byteArrayOutputStream.write((bArr.length >> 8) & 255);
            byteArrayOutputStream.write(bArr.length & 255);
        } else if (bArr.length > 255) {
            byteArrayOutputStream.write(130);
            byteArrayOutputStream.write((bArr.length >> 8) & 255);
            byteArrayOutputStream.write(bArr.length & 255);
        } else if (bArr.length > 127) {
            byteArrayOutputStream.write(129);
            byteArrayOutputStream.write(bArr.length);
        } else if (bArr.length >= 0) {
            byteArrayOutputStream.write(bArr.length);
        }
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: c */
    public final short m28181c() {
        return this.f22294a;
    }
}
