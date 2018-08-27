package com.p000;

/* renamed from: sf */
public class sf {
    /* renamed from: a */
    private static final rk f25462a = dnn.m28258a(sf.class);

    /* renamed from: a */
    public static short m34087a(byte[] bArr, int i) {
        short s = (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
        if (f25462a.mo4274a()) {
            f25462a.mo4272a("Converted [" + bArr[i] + ", " + bArr[i + 1] + "] to short " + s);
        }
        return s;
    }

    /* renamed from: a */
    public static void m34088a(int i, byte[] bArr, int i2) {
        short s = (short) (i >> 16);
        sf.m34089a((short) i, bArr, i2);
        sf.m34089a(s, bArr, i2 + 2);
        if (f25462a.mo4274a()) {
            f25462a.mo4272a("Converted int " + i + " to [" + bArr[i2] + ", " + bArr[i2 + 1] + ", " + bArr[i2 + 2] + ", " + bArr[i2 + 3] + "]");
        }
    }

    /* renamed from: a */
    public static void m34089a(short s, byte[] bArr, int i) {
        byte b = (byte) (s >> 8);
        bArr[i] = (byte) s;
        bArr[i + 1] = b;
        if (f25462a.mo4274a()) {
            f25462a.mo4272a("Converted short " + s + " to [" + bArr[i] + ", " + bArr[i + 1] + "]");
        }
    }

    /* renamed from: b */
    public static int m34090b(byte[] bArr, int i) {
        int a = (sf.m34087a(bArr, i) & 65535) | ((sf.m34087a(bArr, i + 2) & 65535) << 16);
        if (f25462a.mo4274a()) {
            f25462a.mo4272a("Converted [" + bArr[i] + ", " + bArr[i + 1] + ", " + bArr[i + 2] + ", " + bArr[i + 3] + "] to int " + a);
        }
        return a;
    }
}
