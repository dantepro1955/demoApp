package com.p000;

/* compiled from: Pow2 */
/* renamed from: dxi */
public final class dxi {
    /* renamed from: a */
    public static int m29770a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* renamed from: b */
    public static boolean m29771b(int i) {
        return ((i + -1) & i) == 0;
    }
}
