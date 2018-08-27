package com.p000;

import android.content.Context;

/* renamed from: wo */
abstract class wo implements Runnable {
    /* renamed from: a */
    final String f25867a;
    /* renamed from: b */
    protected final vm f25868b;
    /* renamed from: c */
    final zi f25869c;
    /* renamed from: d */
    final Context f25870d;

    wo(String str, vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f25868b = vmVar;
        if (str == null) {
            str = getClass().getSimpleName();
        }
        this.f25867a = str;
        this.f25869c = vmVar.mo5561g();
        this.f25870d = vmVar.m34404i();
    }

    /* renamed from: a */
    String m34642a() {
        return this.f25867a;
    }

    /* renamed from: b */
    void mo5598b() {
    }
}
