package com.p000;

import android.os.Handler;

/* renamed from: a */
public abstract class C0000a {
    /* renamed from: a */
    protected final Object f0a = new Object();
    /* renamed from: b */
    private final Handler f1b;

    public C0000a(Object obj) {
        this.f1b = (Handler) obj;
    }

    /* renamed from: a */
    protected final void m0a(Runnable runnable) {
        if (this.f1b == null) {
            try {
                runnable.run();
                return;
            } catch (Throwable th) {
                czl.a(this, "Exception in application callback", th);
                return;
            }
        }
        try {
            if (!this.f1b.post(runnable)) {
                czl.c(this, "Unable to post callback to handler");
            }
        } catch (Throwable th2) {
            czl.a(this, "Exception posting callback to handler", th2);
        }
    }
}
