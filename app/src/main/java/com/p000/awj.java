package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awj */
public class awj extends axp {
    /* renamed from: i */
    private long f4777i;

    public awj(avx avx, String str, String str2, C0800a c0800a, long j, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
        this.f4777i = j;
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f.invoke(null, new Object[0])).longValue();
        synchronized (this.e) {
            this.e.ae = Long.valueOf(longValue);
            if (this.f4777i != 0) {
                this.e.f4416q = Long.valueOf(longValue - this.f4777i);
                this.e.f4421v = Long.valueOf(this.f4777i);
            }
        }
    }
}
