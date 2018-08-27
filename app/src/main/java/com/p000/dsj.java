package com.p000;

import com.facebook.stetho.common.Utf8Charset;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.nio.charset.Charset;

/* compiled from: Util */
/* renamed from: dsj */
final class dsj {
    /* renamed from: a */
    public static final Charset f22803a = Charset.forName(Utf8Charset.NAME);

    /* renamed from: a */
    public static void m29130a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)}));
        }
    }

    /* renamed from: a */
    public static short m29129a(short s) {
        int i = 65535 & s;
        return (short) (((i & 255) << 8) | ((65280 & i) >>> 8));
    }

    /* renamed from: a */
    public static int m29128a(int i) {
        return ((((CtaButton.BACKGROUND_COLOR & i) >>> 24) | ((16711680 & i) >>> 8)) | ((65280 & i) << 8)) | ((i & 255) << 24);
    }

    /* renamed from: a */
    public static void m29131a(Throwable th) {
        dsj.m29133b(th);
    }

    /* renamed from: b */
    private static <T extends Throwable> void m29133b(Throwable th) throws Throwable {
        throw th;
    }

    /* renamed from: a */
    public static boolean m29132a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
