package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awu */
public class awu extends axp {
    public awu(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4388O = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.f.invoke(null, new Object[]{this.b.m6096b()})).booleanValue();
        synchronized (this.e) {
            if (booleanValue) {
                this.e.f4388O = Integer.valueOf(1);
            } else {
                this.e.f4388O = Integer.valueOf(0);
            }
        }
    }
}
