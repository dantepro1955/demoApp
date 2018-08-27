package com.p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory */
/* renamed from: dwy */
public final class dwy extends AtomicLong implements ThreadFactory {
    /* renamed from: a */
    public static final ThreadFactory f23367a = new C52161();
    private static final long serialVersionUID = -8841098858898482335L;
    /* renamed from: b */
    final String f23368b;

    /* compiled from: RxThreadFactory */
    /* renamed from: dwy$1 */
    static class C52161 implements ThreadFactory {
        C52161() {
        }

        public Thread newThread(Runnable runnable) {
            throw new AssertionError("No threads allowed.");
        }
    }

    public dwy(String str) {
        this.f23368b = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f23368b + incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
