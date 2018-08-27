package com.p000;

/* compiled from: ContainerHelpers */
/* renamed from: hj */
class hj {
    /* renamed from: a */
    static final int[] f23796a = new int[0];
    /* renamed from: b */
    static final long[] f23797b = new long[0];
    /* renamed from: c */
    static final Object[] f23798c = new Object[0];

    /* renamed from: a */
    public static int m30579a(int i) {
        return hj.m30584c(i * 4) / 4;
    }

    /* renamed from: b */
    public static int m30583b(int i) {
        return hj.m30584c(i * 8) / 8;
    }

    /* renamed from: c */
    public static int m30584c(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m30582a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    static int m30580a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    static int m30581a(long[] jArr, int i, long j) {
        int i2 = 0;
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i2 = i4 + 1;
            } else if (j2 <= j) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return i2 ^ -1;
    }
}
