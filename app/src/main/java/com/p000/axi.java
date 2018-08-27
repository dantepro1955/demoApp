package com.p000;

import java.io.IOException;

/* renamed from: axi */
public final class axi {
    /* renamed from: a */
    static final int f4836a = axi.m6310a(1, 3);
    /* renamed from: b */
    static final int f4837b = axi.m6310a(1, 4);
    /* renamed from: c */
    static final int f4838c = axi.m6310a(2, 0);
    /* renamed from: d */
    static final int f4839d = axi.m6310a(3, 2);
    /* renamed from: e */
    public static final int[] f4840e = new int[0];
    /* renamed from: f */
    public static final long[] f4841f = new long[0];
    /* renamed from: g */
    public static final float[] f4842g = new float[0];
    /* renamed from: h */
    public static final double[] f4843h = new double[0];
    /* renamed from: i */
    public static final boolean[] f4844i = new boolean[0];
    /* renamed from: j */
    public static final String[] f4845j = new String[0];
    /* renamed from: k */
    public static final byte[][] f4846k = new byte[0][];
    /* renamed from: l */
    public static final byte[] f4847l = new byte[0];

    /* renamed from: a */
    static int m6309a(int i) {
        return i & 7;
    }

    /* renamed from: a */
    public static int m6310a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: a */
    public static final int m6311a(awx awx, int i) throws IOException {
        int i2 = 1;
        int p = awx.m6200p();
        awx.m6182b(i);
        while (awx.m6177a() == i) {
            awx.m6182b(i);
            i2++;
        }
        awx.m6188e(p);
        return i2;
    }

    /* renamed from: b */
    public static int m6312b(int i) {
        return i >>> 3;
    }
}
