package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awm */
public class awm extends axp {
    /* renamed from: i */
    private static volatile Long f4780i = null;
    /* renamed from: j */
    private static final Object f4781j = new Object();

    public awm(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (f4780i == null) {
            synchronized (f4781j) {
                if (f4780i == null) {
                    f4780i = (Long) this.f.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.e) {
            this.e.f4420u = f4780i;
        }
    }
}
