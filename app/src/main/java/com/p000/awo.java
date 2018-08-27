package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awo */
public class awo extends axp {
    /* renamed from: i */
    private static volatile String f4783i = null;
    /* renamed from: j */
    private static final Object f4784j = new Object();

    public awo(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4400a = "E";
        if (f4783i == null) {
            synchronized (f4784j) {
                if (f4783i == null) {
                    f4783i = (String) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.f4400a = f4783i;
        }
    }
}
