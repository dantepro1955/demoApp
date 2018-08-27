package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awn */
public class awn extends axp {
    /* renamed from: i */
    private long f4782i = -1;

    public awn(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4411l = Long.valueOf(-1);
        if (this.f4782i == -1) {
            this.f4782i = (long) ((Integer) this.f.invoke(null, new Object[]{this.b.m6093a()})).intValue();
        }
        synchronized (this.e) {
            this.e.f4411l = Long.valueOf(this.f4782i);
        }
    }
}
