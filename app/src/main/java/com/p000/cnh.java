package com.p000;

import android.content.Context;

/* compiled from: TaskRunnable */
/* renamed from: cnh */
public class cnh implements Runnable {
    /* renamed from: b */
    cnf f9255b;
    /* renamed from: c */
    Context f9256c;

    public cnh(Context context, cnf cnf) {
        this.f9255b = cnf;
        this.f9256c = context;
    }

    /* renamed from: a */
    public String m13473a() {
        return this.f9255b.mo1806m();
    }

    public void run() {
        this.f9255b.mo1796a(this.f9256c);
    }
}
