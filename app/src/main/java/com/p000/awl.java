package com.p000;

import java.util.concurrent.Callable;
import p000.atr.C0800a;

/* renamed from: awl */
public class awl implements Callable {
    /* renamed from: a */
    private final avx f4778a;
    /* renamed from: b */
    private final C0800a f4779b;

    public awl(avx avx, C0800a c0800a) {
        this.f4778a = avx;
        this.f4779b = c0800a;
    }

    /* renamed from: a */
    public Void m6161a() throws Exception {
        if (this.f4778a.m6107m() != null) {
            this.f4778a.m6107m().get();
        }
        axf l = this.f4778a.m6106l();
        if (l != null) {
            try {
                synchronized (this.f4779b) {
                    axf.m5613a(this.f4779b, axf.m5615a(l));
                }
            } catch (axe e) {
            }
        }
        return null;
    }

    public /* synthetic */ Object call() throws Exception {
        return m6161a();
    }
}
