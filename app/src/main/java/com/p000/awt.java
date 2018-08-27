package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awt */
public class awt extends axp {
    /* renamed from: i */
    private static volatile Long f4788i = null;
    /* renamed from: j */
    private static final Object f4789j = new Object();

    public awt(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (f4788i == null) {
            synchronized (f4789j) {
                if (f4788i == null) {
                    f4788i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.f4374A = f4788i;
        }
    }
}
