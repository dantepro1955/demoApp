package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awi */
public class awi extends axp {
    /* renamed from: i */
    private static volatile Long f4775i = null;
    /* renamed from: j */
    private static final Object f4776j = new Object();

    public awi(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (f4775i == null) {
            synchronized (f4776j) {
                if (f4775i == null) {
                    f4775i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.f4384K = f4775i;
        }
    }
}
