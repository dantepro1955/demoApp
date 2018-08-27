package com.p000;

import java.util.concurrent.Executor;

/* renamed from: bsl */
class bsl<TResult> implements bsm<TResult> {
    /* renamed from: a */
    private final Executor f7528a;
    /* renamed from: b */
    private final Object f7529b = new Object();
    /* renamed from: c */
    private bsi<TResult> f7530c;

    public bsl(Executor executor, bsi<TResult> bsi) {
        this.f7528a = executor;
        this.f7530c = bsi;
    }

    /* renamed from: a */
    public void mo1430a(final bsj<TResult> bsj) {
        synchronized (this.f7529b) {
            if (this.f7530c == null) {
                return;
            }
            this.f7528a.execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ bsl f7527b;

                public void run() {
                    synchronized (this.f7527b.f7529b) {
                        if (this.f7527b.f7530c != null) {
                            this.f7527b.f7530c.mo650a(bsj);
                        }
                    }
                }
            });
        }
    }
}
