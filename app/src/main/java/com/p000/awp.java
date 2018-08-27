package com.p000;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p000.atr.C0800a;

/* renamed from: awp */
public class awp extends axp {
    /* renamed from: i */
    private List<Long> f4785i = null;

    public awp(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4424y = Long.valueOf(-1);
        this.e.f4425z = Long.valueOf(-1);
        if (this.f4785i == null) {
            this.f4785i = (List) this.f.invoke(null, new Object[]{this.b.m6093a()});
        }
        if (this.f4785i != null && this.f4785i.size() == 2) {
            synchronized (this.e) {
                this.e.f4424y = Long.valueOf(((Long) this.f4785i.get(0)).longValue());
                this.e.f4425z = Long.valueOf(((Long) this.f4785i.get(1)).longValue());
            }
        }
    }
}
