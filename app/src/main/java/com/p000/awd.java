package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awd */
public class awd extends axp {
    /* renamed from: i */
    private static volatile String f4753i = null;
    /* renamed from: j */
    private static final Object f4754j = new Object();

    public awd(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4423x = "E";
        if (f4753i == null) {
            synchronized (f4754j) {
                if (f4753i == null) {
                    f4753i = (String) this.f.invoke(null, new Object[]{this.b.m6093a()});
                }
            }
        }
        synchronized (this.e) {
            this.e.f4423x = atv.m5690a(f4753i.getBytes(), true);
        }
    }
}
