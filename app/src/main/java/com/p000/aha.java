package com.p000;

import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;
import java.nio.ByteBuffer;

/* compiled from: Ac3Util */
/* renamed from: aha */
public final class aha {
    /* renamed from: a */
    private static final int[] f1453a = new int[]{1, 2, 3, 6};
    /* renamed from: b */
    private static final int[] f1454b = new int[]{48000, 44100, 32000};
    /* renamed from: c */
    private static final int[] f1455c = new int[]{24000, 22050, 16000};
    /* renamed from: d */
    private static final int[] f1456d = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
    /* renamed from: e */
    private static final int[] f1457e = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, JfifUtil.MARKER_SOFn, 224, 256, 320, BitmapCounterProvider.MAX_BITMAP_COUNT, 448, 512, 576, 640};
    /* renamed from: f */
    private static final int[] f1458f = new int[]{69, 87, 104, 121, 139, 174, JfifUtil.MARKER_RST0, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static ado m1507a(ahk ahk, String str, long j, String str2) {
        int i = f1454b[(ahk.m1570f() & JfifUtil.MARKER_SOFn) >> 6];
        int f = ahk.m1570f();
        int i2 = f1456d[(f & 56) >> 3];
        if ((f & 4) != 0) {
            i2++;
        }
        return ado.m816a(str, "audio/ac3", -1, -1, j, i2, i, null, str2);
    }

    /* renamed from: b */
    public static ado m1510b(ahk ahk, String str, long j, String str2) {
        ahk.m1566c(2);
        int i = f1454b[(ahk.m1570f() & JfifUtil.MARKER_SOFn) >> 6];
        int f = ahk.m1570f();
        int i2 = f1456d[(f & 14) >> 1];
        if ((f & 1) != 0) {
            i2++;
        }
        return ado.m816a(str, "audio/eac3", -1, -1, j, i2, i, null, str2);
    }

    /* renamed from: a */
    public static ado m1506a(ahj ahj, String str, long j, String str2) {
        int i = 1;
        ahj.m1551b(32);
        int c = ahj.m1554c(2);
        ahj.m1551b(14);
        int c2 = ahj.m1554c(3);
        if (!((c2 & 1) == 0 || c2 == 1)) {
            ahj.m1551b(2);
        }
        if ((c2 & 4) != 0) {
            ahj.m1551b(2);
        }
        if (c2 == 2) {
            ahj.m1551b(2);
        }
        boolean b = ahj.m1552b();
        String str3 = "audio/ac3";
        c2 = f1456d[c2];
        if (!b) {
            i = 0;
        }
        return ado.m816a(str, str3, -1, -1, j, c2 + i, f1454b[c], null, str2);
    }

    /* renamed from: b */
    public static ado m1509b(ahj ahj, String str, long j, String str2) {
        int i;
        ahj.m1551b(32);
        int c = ahj.m1554c(2);
        if (c == 3) {
            i = f1455c[ahj.m1554c(2)];
        } else {
            ahj.m1551b(2);
            i = f1454b[c];
        }
        c = ahj.m1554c(3);
        boolean b = ahj.m1552b();
        String str3 = "audio/eac3";
        int i2 = f1456d[c];
        if (b) {
            c = 1;
        } else {
            c = 0;
        }
        return ado.m816a(str, str3, -1, -1, j, i2 + c, i, null, str2);
    }

    /* renamed from: a */
    public static int m1505a(byte[] bArr) {
        return aha.m1503a((bArr[4] & JfifUtil.MARKER_SOFn) >> 6, bArr[4] & 63);
    }

    /* renamed from: b */
    public static int m1508b(byte[] bArr) {
        return ((((bArr[2] & 7) << 8) + (bArr[3] & 255)) + 1) * 2;
    }

    /* renamed from: a */
    public static int m1502a() {
        return 1536;
    }

    /* renamed from: c */
    public static int m1511c(byte[] bArr) {
        return (((bArr[4] & JfifUtil.MARKER_SOFn) >> 6) == 3 ? 6 : f1453a[(bArr[4] & 48) >> 4]) * 256;
    }

    /* renamed from: a */
    public static int m1504a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & JfifUtil.MARKER_SOFn) >> 6) == 3 ? 6 : f1453a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4]) * 256;
    }

    /* renamed from: a */
    private static int m1503a(int i, int i2) {
        int i3 = f1454b[i];
        if (i3 == 44100) {
            return (f1458f[i2 / 2] + (i2 % 2)) * 2;
        }
        int i4 = f1457e[i2 / 2];
        if (i3 == 32000) {
            return i4 * 6;
        }
        return i4 * 4;
    }
}
