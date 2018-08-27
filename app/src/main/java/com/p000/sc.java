package com.p000;

/* renamed from: sc */
public class sc {
    /* renamed from: a */
    private static final rk f25454a = dnn.m28258a(sc.class);

    /* renamed from: a */
    public static byte[] m34083a(byte b, byte b2, short s, byte[] bArr) {
        if (f25454a.mo4276b()) {
            f25454a.mo4275b("Building XMode buffer: protocol=" + b + " version=" + b2 + " cmd=" + s + " payload len:" + bArr.length);
            f25454a.m25946a(bArr);
        }
        int length = bArr.length;
        Object obj = new byte[(length + 8)];
        System.arraycopy(new sd(b, b2, s, length).m34085a(), 0, obj, 0, 8);
        System.arraycopy(bArr, 0, obj, 8, length);
        return obj;
    }

    /* renamed from: a */
    public static byte[] m34084a(byte[] bArr, byte[] bArr2) {
        if (f25454a.mo4276b()) {
            f25454a.mo4275b((Object) "Appending session ID");
            f25454a.m25946a(bArr2);
            f25454a.m25946a(bArr);
        }
        Object obj = new byte[(bArr.length + 16)];
        System.arraycopy(bArr2, 0, obj, 0, 16);
        System.arraycopy(bArr, 0, obj, 16, bArr.length);
        return obj;
    }
}
