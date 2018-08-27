package com.p000;

import android.util.Log;
import android.util.Pair;

/* compiled from: CodecSpecificDataUtil */
/* renamed from: ahd */
public final class ahd {
    /* renamed from: a */
    private static final byte[] f1462a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: b */
    private static final int[] f1463b = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    /* renamed from: c */
    private static final int[] f1464c = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: CodecSpecificDataUtil */
    /* renamed from: ahd$a */
    public static final class C0174a {
        /* renamed from: a */
        public final int f1459a;
        /* renamed from: b */
        public final int f1460b;
        /* renamed from: c */
        public final float f1461c;

        public C0174a(int i, int i2, float f) {
            this.f1459a = i;
            this.f1460b = i2;
            this.f1461c = f;
        }
    }

    /* renamed from: a */
    public static Pair<Integer, Integer> m1520a(byte[] bArr) {
        int c;
        boolean z;
        boolean z2 = true;
        ahj ahj = new ahj(bArr);
        int c2 = ahj.m1554c(5);
        int c3 = ahj.m1554c(4);
        if (c3 == 15) {
            c = ahj.m1554c(24);
        } else {
            if (c3 < 13) {
                z = true;
            } else {
                z = false;
            }
            ahb.m1514a(z);
            c = f1463b[c3];
        }
        c3 = ahj.m1554c(4);
        if (c2 == 5 || c2 == 29) {
            c2 = ahj.m1554c(4);
            if (c2 == 15) {
                c = ahj.m1554c(24);
            } else {
                if (c2 < 13) {
                    z = true;
                } else {
                    z = false;
                }
                ahb.m1514a(z);
                c = f1463b[c2];
            }
            if (ahj.m1554c(5) == 22) {
                c3 = c;
                c = ahj.m1554c(4);
                c = f1464c[c];
                if (c == -1) {
                    z2 = false;
                }
                ahb.m1514a(z2);
                return Pair.create(Integer.valueOf(c3), Integer.valueOf(c));
            }
        }
        int i = c3;
        c3 = c;
        c = i;
        c = f1464c[c];
        if (c == -1) {
            z2 = false;
        }
        ahb.m1514a(z2);
        return Pair.create(Integer.valueOf(c3), Integer.valueOf(c));
    }

    /* renamed from: a */
    public static byte[] m1522a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: a */
    public static byte[] m1523a(byte[] bArr, int i, int i2) {
        Object obj = new byte[(f1462a.length + i2)];
        System.arraycopy(f1462a, 0, obj, 0, f1462a.length);
        System.arraycopy(bArr, i, obj, f1462a.length, i2);
        return obj;
    }

    /* renamed from: a */
    public static C0174a m1519a(ahj ahj) {
        int d;
        int i;
        int i2;
        int i3 = 1;
        int c = ahj.m1554c(8);
        ahj.m1551b(16);
        ahj.m1555d();
        if (c == 100 || c == 110 || c == 122 || c == 244 || c == 44 || c == 83 || c == 86 || c == 118 || c == 128 || c == 138) {
            d = ahj.m1555d();
            if (d == 3) {
                ahj.m1551b(1);
            }
            ahj.m1555d();
            ahj.m1555d();
            ahj.m1551b(1);
            if (ahj.m1552b()) {
                c = d != 3 ? 8 : 12;
                i = 0;
                while (i < c) {
                    if (ahj.m1552b()) {
                        ahd.m1521a(ahj, i < 6 ? 16 : 64);
                    }
                    i++;
                }
            }
            c = d;
        } else {
            c = 1;
        }
        ahj.m1555d();
        long d2 = (long) ahj.m1555d();
        if (d2 == 0) {
            ahj.m1555d();
        } else if (d2 == 1) {
            ahj.m1551b(1);
            ahj.m1556e();
            ahj.m1556e();
            d2 = (long) ahj.m1555d();
            for (i2 = 0; ((long) i2) < d2; i2++) {
                ahj.m1555d();
            }
        }
        ahj.m1555d();
        ahj.m1551b(1);
        d = ahj.m1555d() + 1;
        i = ahj.m1555d() + 1;
        boolean b = ahj.m1552b();
        if (b) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        i2 = (2 - i2) * i;
        if (!b) {
            ahj.m1551b(1);
        }
        ahj.m1551b(1);
        i = d * 16;
        d = i2 * 16;
        if (ahj.m1552b()) {
            int d3 = ahj.m1555d();
            int d4 = ahj.m1555d();
            int d5 = ahj.m1555d();
            int d6 = ahj.m1555d();
            if (c == 0) {
                c = 2 - (b ? 1 : 0);
            } else {
                i2 = c == 3 ? 1 : 2;
                if (c == 1) {
                    c = 2;
                } else {
                    c = 1;
                }
                if (!b) {
                    i3 = 0;
                }
                c *= 2 - i3;
                i3 = i2;
            }
            i2 = i - ((d3 + d4) * i3);
            c = d - (c * (d5 + d6));
        } else {
            c = d;
            i2 = i;
        }
        float f = 1.0f;
        if (ahj.m1552b() && ahj.m1552b()) {
            int c2 = ahj.m1554c(8);
            if (c2 == 255) {
                float f2;
                c2 = ahj.m1554c(16);
                int c3 = ahj.m1554c(16);
                if (c2 == 0 || c3 == 0) {
                    f2 = 1.0f;
                } else {
                    f2 = ((float) c2) / ((float) c3);
                }
                f = f2;
            } else if (c2 < ahi.f1486b.length) {
                f = ahi.f1486b[c2];
            } else {
                Log.w("CodecSpecificDataUtil", "Unexpected aspect_ratio_idc value: " + c2);
            }
        }
        return new C0174a(i2, c, f);
    }

    /* renamed from: a */
    private static void m1521a(ahj ahj, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((ahj.m1556e() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }
}
