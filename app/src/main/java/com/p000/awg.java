package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awg */
public class awg extends axp {
    public awg(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4404e = Long.valueOf(-1);
        this.e.f4405f = Long.valueOf(-1);
        int[] iArr = (int[]) this.f.invoke(null, new Object[]{this.b.m6093a()});
        synchronized (this.e) {
            this.e.f4404e = Long.valueOf((long) iArr[0]);
            this.e.f4405f = Long.valueOf((long) iArr[1]);
        }
    }
}
