package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: aws */
public class aws extends axp {
    public aws(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.e) {
            avw avw = new avw((String) this.f.invoke(null, new Object[0]));
            this.e.f4390Q = avw.f4705a;
            this.e.f4391R = avw.f4706b;
        }
    }
}
