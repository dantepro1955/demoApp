package com.p000;

import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imageutils.JfifUtil;

/* compiled from: MpegAudioHeader */
/* renamed from: ahh */
public final class ahh {
    /* renamed from: h */
    private static final String[] f1471h = new String[]{"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* renamed from: i */
    private static final int[] f1472i = new int[]{44100, 48000, 32000};
    /* renamed from: j */
    private static final int[] f1473j = new int[]{32, 64, 96, 128, 160, JfifUtil.MARKER_SOFn, 224, 256, 288, 320, 352, BitmapCounterProvider.MAX_BITMAP_COUNT, 416, 448};
    /* renamed from: k */
    private static final int[] f1474k = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, JfifUtil.MARKER_SOFn, 224, 256};
    /* renamed from: l */
    private static final int[] f1475l = new int[]{32, 48, 56, 64, 80, 96, 112, 128, 160, JfifUtil.MARKER_SOFn, 224, 256, 320, BitmapCounterProvider.MAX_BITMAP_COUNT};
    /* renamed from: m */
    private static final int[] f1476m = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, JfifUtil.MARKER_SOFn, 224, 256, 320};
    /* renamed from: n */
    private static final int[] f1477n = new int[]{8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};
    /* renamed from: a */
    public int f1478a;
    /* renamed from: b */
    public String f1479b;
    /* renamed from: c */
    public int f1480c;
    /* renamed from: d */
    public int f1481d;
    /* renamed from: e */
    public int f1482e;
    /* renamed from: f */
    public int f1483f;
    /* renamed from: g */
    public int f1484g;

    /* renamed from: a */
    public static int m1534a(int i) {
        if ((i & -2097152) != -2097152) {
            return -1;
        }
        int i2 = (i >>> 19) & 3;
        if (i2 == 1) {
            return -1;
        }
        int i3 = (i >>> 17) & 3;
        if (i3 == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        if (i4 == 0 || i4 == 15) {
            return -1;
        }
        int i5 = (i >>> 10) & 3;
        if (i5 == 3) {
            return -1;
        }
        int i6 = f1472i[i5];
        if (i2 == 2) {
            i5 = i6 / 2;
        } else if (i2 == 0) {
            i5 = i6 / 4;
        } else {
            i5 = i6;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f1473j[i4 - 1] : f1474k[i4 - 1]) * 12000) / i5) + i7) * 4;
        }
        if (i2 == 3) {
            i4 = i3 == 2 ? f1475l[i4 - 1] : f1476m[i4 - 1];
        } else {
            i4 = f1477n[i4 - 1];
        }
        if (i2 == 3) {
            return ((144000 * i4) / i5) + i7;
        }
        return (((i3 == 1 ? 72000 : 144000) * i4) / i5) + i7;
    }

    /* renamed from: a */
    public static boolean m1536a(int i, ahh ahh) {
        int i2 = 2;
        if ((i & -2097152) != -2097152) {
            return false;
        }
        int i3 = (i >>> 19) & 3;
        if (i3 == 1) {
            return false;
        }
        int i4 = (i >>> 17) & 3;
        if (i4 == 0) {
            return false;
        }
        int i5 = (i >>> 12) & 15;
        if (i5 == 0 || i5 == 15) {
            return false;
        }
        int i6 = (i >>> 10) & 3;
        if (i6 == 3) {
            return false;
        }
        int i7;
        int i8;
        int i9 = f1472i[i6];
        if (i3 == 2) {
            i9 /= 2;
        } else if (i3 == 0) {
            i9 /= 4;
        }
        i6 = (i >>> 9) & 1;
        if (i4 == 3) {
            i7 = i3 == 3 ? f1473j[i5 - 1] : f1474k[i5 - 1];
            i6 = (((i7 * 12000) / i9) + i6) * 4;
            i8 = BitmapCounterProvider.MAX_BITMAP_COUNT;
        } else if (i3 == 3) {
            i7 = i4 == 2 ? f1475l[i5 - 1] : f1476m[i5 - 1];
            i8 = 1152;
            i6 += (144000 * i7) / i9;
        } else {
            i5 = f1477n[i5 - 1];
            i8 = i4 == 1 ? 576 : 1152;
            i6 += ((i4 == 1 ? 72000 : 144000) * i5) / i9;
            i7 = i5;
        }
        String str = f1471h[3 - i4];
        if (((i >> 6) & 3) == 3) {
            i2 = 1;
        }
        ahh.m1535a(i3, str, i6, i9, i2, i7 * 1000, i8);
        return true;
    }

    /* renamed from: a */
    private void m1535a(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.f1478a = i;
        this.f1479b = str;
        this.f1480c = i2;
        this.f1481d = i3;
        this.f1482e = i4;
        this.f1483f = i5;
        this.f1484g = i6;
    }
}
