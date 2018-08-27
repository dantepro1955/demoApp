package com.p000;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;

/* renamed from: awc */
public class awc extends axp {
    public awc(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        super(avx, str, str2, c0800a, i, i2);
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        this.e.f4389P = Integer.valueOf(2);
        try {
            this.e.f4389P = Integer.valueOf(((Boolean) this.f.invoke(null, new Object[]{this.b.m6096b()})).booleanValue() ? 1 : 0);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
