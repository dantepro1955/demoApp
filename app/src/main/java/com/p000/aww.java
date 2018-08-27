package com.p000;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import p000.atr.C0800a;
import p000.atr.C0800a.C0799b;

/* renamed from: aww */
public class aww extends axp {
    /* renamed from: i */
    private final View f4793i;

    public aww(avx avx, String str, String str2, C0800a c0800a, int i, int i2, View view) {
        super(avx, str, str2, c0800a, i, i2);
        this.f4793i = view;
    }

    /* renamed from: a */
    protected void mo801a() throws IllegalAccessException, InvocationTargetException {
        if (this.f4793i != null) {
            awa awa = new awa((String) this.f.invoke(null, new Object[]{this.f4793i}));
            synchronized (this.e) {
                this.e.f4398Y = new C0799b();
                this.e.f4398Y.f4373c = awa.f4744a;
            }
        }
    }
}
