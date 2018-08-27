package com.p000;

import java.lang.reflect.Array;

/* compiled from: GrowingArrayUtils */
/* renamed from: nb */
final class nb {
    /* renamed from: a */
    static final /* synthetic */ boolean f24691a = (!nb.class.desiredAssertionStatus());

    /* renamed from: a */
    public static <T> T[] m32945a(T[] tArr, int i, T t) {
        if (f24691a || i <= tArr.length) {
            T[] tArr2;
            if (i + 1 > tArr.length) {
                tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), nb.m32943a(i));
                System.arraycopy(tArr, 0, tArr2, 0, i);
            } else {
                tArr2 = tArr;
            }
            tArr2[i] = t;
            return tArr2;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int[] m32944a(int[] iArr, int i, int i2) {
        if (f24691a || i <= iArr.length) {
            if (i + 1 > iArr.length) {
                Object obj = new int[nb.m32943a(i)];
                System.arraycopy(iArr, 0, obj, 0, i);
                iArr = obj;
            }
            iArr[i] = i2;
            return iArr;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int m32943a(int i) {
        return i <= 4 ? 8 : i * 2;
    }

    private nb() {
    }
}
