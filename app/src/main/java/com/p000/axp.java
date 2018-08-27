package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import p000.atr.C0800a;

/* renamed from: axp */
public abstract class axp implements Callable {
    /* renamed from: a */
    protected final String f4745a = getClass().getSimpleName();
    /* renamed from: b */
    protected final avx f4746b;
    /* renamed from: c */
    protected final String f4747c;
    /* renamed from: d */
    protected final String f4748d;
    /* renamed from: e */
    protected final C0800a f4749e;
    /* renamed from: f */
    protected Method f4750f;
    /* renamed from: g */
    protected final int f4751g;
    /* renamed from: h */
    protected final int f4752h;

    public axp(avx avx, String str, String str2, C0800a c0800a, int i, int i2) {
        this.f4746b = avx;
        this.f4747c = str;
        this.f4748d = str2;
        this.f4749e = c0800a;
        this.f4751g = i;
        this.f4752h = i2;
    }

    /* renamed from: a */
    protected abstract void mo801a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void m6123b() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.f4750f = this.f4746b.m6094a(this.f4747c, this.f4748d);
            if (this.f4750f != null) {
                mo801a();
                atz j = this.f4746b.m6104j();
                if (!(j == null || this.f4751g == LinearLayoutManager.INVALID_OFFSET)) {
                    j.m5729a(this.f4752h, this.f4751g, (System.nanoTime() - nanoTime) / 1000);
                }
            }
        } catch (IllegalAccessException e) {
        } catch (InvocationTargetException e2) {
        }
        return null;
    }

    public /* synthetic */ Object call() throws Exception {
        return m6123b();
    }
}
