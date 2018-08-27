package com.p000;

import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awr */
public class awr extends axp {
    /* renamed from: i */
    private final StackTraceElement[] f4787i;

    public awr(avx avx, String str, String str2, C0800a c0800a, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(avx, str, str2, c0800a, i, i2);
        this.f4787i = stackTraceElementArr;
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (this.f4787i != null) {
            avv avv = new avv((String) this.f.invoke(null, new Object[]{this.f4787i}));
            synchronized (this.e) {
                this.e.f4385L = avv.f4702a;
                if (avv.f4703b.booleanValue()) {
                    this.e.f4395V = Integer.valueOf(avv.f4704c.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
