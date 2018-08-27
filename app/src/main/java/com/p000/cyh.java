package com.p000;

import android.opengl.GLES10;

/* compiled from: ImageSizeUtils */
/* renamed from: cyh */
public final class cyh {
    /* renamed from: a */
    private static cxm f20669a;

    static {
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int max = Math.max(iArr[0], 2048);
        f20669a = new cxm(max, max);
    }

    /* renamed from: a */
    public static cxm m25641a(cxz cxz, cxm cxm) {
        int a = cxz.mo4223a();
        if (a <= 0) {
            a = cxm.m25538a();
        }
        int b = cxz.mo4226b();
        if (b <= 0) {
            b = cxm.m25539b();
        }
        return new cxm(a, b);
    }
}
