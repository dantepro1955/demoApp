package com.p000;

/* renamed from: dpi */
public class dpi {
    /* renamed from: a */
    private static final rk f22524a = dnn.m28258a(dpi.class);

    /* renamed from: a */
    public static dph m28628a(byte[] bArr) {
        short s = (short) (((bArr[1] & 255) << 8) + (bArr[0] & 255));
        Object obj = new byte[(bArr.length - 2)];
        System.arraycopy(bArr, 2, obj, 0, obj.length);
        switch (s) {
            case (short) 29185:
                return new dpo(obj);
            case (short) 29186:
                return new dpm(obj);
            case (short) 29189:
                return new dpp(obj);
            default:
                f22524a.mo4281e("PDXMessageFactory.createMessage() Unknown command: " + s + ". ");
                return null;
        }
    }
}
