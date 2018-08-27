package com.p000;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: NalUnitUtil */
/* renamed from: ahi */
public final class ahi {
    /* renamed from: a */
    public static final byte[] f1485a = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 1};
    /* renamed from: b */
    public static final float[] f1486b = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    /* renamed from: c */
    private static final Object f1487c = new Object();
    /* renamed from: d */
    private static int[] f1488d = new int[10];

    /* renamed from: a */
    public static int m1537a(byte[] bArr, int i) {
        int i2;
        int i3 = 0;
        synchronized (f1487c) {
            int a;
            int i4 = 0;
            int i5 = 0;
            while (i5 < i) {
                a = ahi.m1538a(bArr, i5, i);
                if (a < i) {
                    if (f1488d.length <= i4) {
                        f1488d = Arrays.copyOf(f1488d, f1488d.length * 2);
                    }
                    i5 = i4 + 1;
                    f1488d[i4] = a;
                    i4 = i5;
                    i5 = a + 3;
                } else {
                    i5 = a;
                }
            }
            i2 = i - i4;
            i5 = 0;
            a = 0;
            while (i3 < i4) {
                int i6 = f1488d[i3] - a;
                System.arraycopy(bArr, a, bArr, i5, i6);
                i5 += i6;
                int i7 = i5 + 1;
                bArr[i5] = (byte) 0;
                i5 = i7 + 1;
                bArr[i7] = (byte) 0;
                a += i6 + 3;
                i3++;
            }
            System.arraycopy(bArr, a, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: a */
    public static void m1540a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (i + 1 < position) {
            int i3 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i3 == 1 && (byteBuffer.get(i + 1) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i3 == 0) {
                i2++;
            }
            if (i3 != 0) {
                i2 = 0;
            }
            i++;
        }
        byteBuffer.clear();
    }

    /* renamed from: a */
    public static byte[] m1542a(ahk ahk) {
        int g = ahk.m1571g();
        int d = ahk.m1567d();
        ahk.m1566c(g);
        return ahd.m1523a(ahk.f1493a, d, g);
    }

    /* renamed from: b */
    public static int m1543b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: c */
    public static int m1544c(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: a */
    public static int m1539a(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z = true;
        int i3 = i2 - i;
        ahb.m1516b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr != null) {
            if (zArr[0]) {
                ahi.m1541a(zArr);
                return i - 3;
            } else if (i3 > 1 && zArr[1] && bArr[i] == (byte) 1) {
                ahi.m1541a(zArr);
                return i - 2;
            } else if (i3 > 2 && zArr[2] && bArr[i] == (byte) 0 && bArr[i + 1] == (byte) 1) {
                ahi.m1541a(zArr);
                return i - 1;
            }
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            if ((bArr[i5] & 254) == 0) {
                if (bArr[i5 - 2] == (byte) 0 && bArr[i5 - 1] == (byte) 0 && bArr[i5] == (byte) 1) {
                    if (zArr != null) {
                        ahi.m1541a(zArr);
                    }
                    return i5 - 2;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        if (zArr == null) {
            return i2;
        }
        boolean z2 = i3 > 2 ? bArr[i2 + -3] == (byte) 0 && bArr[i2 - 2] == (byte) 0 && bArr[i2 - 1] == (byte) 1 : i3 == 2 ? zArr[2] && bArr[i2 - 2] == (byte) 0 && bArr[i2 - 1] == (byte) 1 : zArr[1] && bArr[i2 - 1] == (byte) 1;
        zArr[0] = z2;
        z2 = i3 > 1 ? bArr[i2 + -2] == (byte) 0 && bArr[i2 - 1] == (byte) 0 : zArr[2] && bArr[i2 - 1] == (byte) 0;
        zArr[1] = z2;
        if (bArr[i2 - 1] != (byte) 0) {
            z = false;
        }
        zArr[2] = z;
        return i2;
    }

    /* renamed from: a */
    public static void m1541a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: a */
    private static int m1538a(byte[] bArr, int i, int i2) {
        int i3 = i;
        while (i3 < i2 - 2) {
            if (bArr[i3] == (byte) 0 && bArr[i3 + 1] == (byte) 0 && bArr[i3 + 2] == (byte) 3) {
                return i3;
            }
            i3++;
        }
        return i2;
    }
}
