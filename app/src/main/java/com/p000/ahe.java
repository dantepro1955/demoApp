package com.p000;

import com.facebook.common.util.ByteConstants;
import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;
import java.nio.ByteBuffer;

/* compiled from: DtsUtil */
/* renamed from: ahe */
public final class ahe {
    /* renamed from: a */
    private static final int[] f1465a = new int[]{1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    /* renamed from: b */
    private static final int[] f1466b = new int[]{-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    /* renamed from: c */
    private static final int[] f1467c = new int[]{64, 112, 128, JfifUtil.MARKER_SOFn, 224, 256, BitmapCounterProvider.MAX_BITMAP_COUNT, 448, 512, 640, 768, 896, ByteConstants.KB, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    /* renamed from: d */
    private static final ahj f1468d = new ahj();

    /* renamed from: a */
    public static ado m1526a(byte[] bArr, String str, long j, String str2) {
        ahj ahj = f1468d;
        ahj.m1549a(bArr);
        ahj.m1551b(60);
        int i = f1465a[ahj.m1554c(6)];
        int i2 = f1466b[ahj.m1554c(4)];
        int c = ahj.m1554c(5);
        c = c >= f1467c.length ? -1 : (f1467c[c] * 1000) / 2;
        ahj.m1551b(10);
        return ado.m816a(str, "audio/vnd.dts", c, -1, j, i + (ahj.m1554c(2) > 0 ? 1 : 0), i2, null, str2);
    }

    /* renamed from: a */
    public static int m1525a(byte[] bArr) {
        return ((((bArr[4] & 1) << 6) | ((bArr[5] & 252) >> 2)) + 1) * 32;
    }

    /* renamed from: a */
    public static int m1524a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
    }

    /* renamed from: b */
    public static int m1527b(byte[] bArr) {
        return ((((bArr[5] & 2) << 12) | ((bArr[6] & 255) << 4)) | ((bArr[7] & 240) >> 4)) + 1;
    }
}
