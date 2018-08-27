package com.p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@bhd
/* renamed from: blb */
public class blb<T> implements ble<T> {
    /* renamed from: a */
    private final Object f5750a = new Object();
    /* renamed from: b */
    private T f5751b;
    /* renamed from: c */
    private Throwable f5752c;
    /* renamed from: d */
    private boolean f5753d;
    /* renamed from: e */
    private boolean f5754e;
    /* renamed from: f */
    private final blf f5755f = new blf();

    /* renamed from: a */
    private boolean m7767a() {
        return this.f5752c != null || this.f5753d;
    }

    /* renamed from: a */
    public void mo1017a(Runnable runnable) {
        this.f5755f.m9326a(runnable);
    }

    /* renamed from: a */
    public void m7769a(Throwable th) {
        synchronized (this.f5750a) {
            if (this.f5754e) {
            } else if (m7767a()) {
                ako.m2347i().m8934a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideException");
            } else {
                this.f5752c = th;
                this.f5750a.notifyAll();
                this.f5755f.m9325a();
            }
        }
    }

    /* renamed from: b */
    public void m7770b(T t) {
        synchronized (this.f5750a) {
            if (this.f5754e) {
            } else if (m7767a()) {
                ako.m2347i().m8934a(new IllegalStateException("Provided CallbackFuture with multiple values."), "CallbackFuture.provideValue");
            } else {
                this.f5753d = true;
                this.f5751b = t;
                this.f5750a.notifyAll();
                this.f5755f.m9325a();
            }
        }
    }

    /* renamed from: b */
    public void mo1018b(Runnable runnable) {
        this.f5755f.m9327b(runnable);
    }

    public boolean cancel(boolean z) {
        if (!z) {
            return false;
        }
        synchronized (this.f5750a) {
            if (m7767a()) {
                return false;
            }
            this.f5754e = true;
            this.f5753d = true;
            this.f5750a.notifyAll();
            this.f5755f.m9325a();
            return true;
        }
    }

    public T get() throws CancellationException, ExecutionException, InterruptedException {
        T t;
        synchronized (this.f5750a) {
            if (!m7767a()) {
                try {
                    this.f5750a.wait();
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f5752c != null) {
                throw new ExecutionException(this.f5752c);
            } else if (this.f5754e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.f5751b;
            }
        }
        return t;
    }

    public T get(long j, TimeUnit timeUnit) throws CancellationException, ExecutionException, InterruptedException, TimeoutException {
        T t;
        synchronized (this.f5750a) {
            if (!m7767a()) {
                try {
                    long toMillis = timeUnit.toMillis(j);
                    if (toMillis != 0) {
                        this.f5750a.wait(toMillis);
                    }
                } catch (InterruptedException e) {
                    throw e;
                }
            }
            if (this.f5752c != null) {
                throw new ExecutionException(this.f5752c);
            } else if (!this.f5753d) {
                throw new TimeoutException("CallbackFuture timed out.");
            } else if (this.f5754e) {
                throw new CancellationException("CallbackFuture was cancelled.");
            } else {
                t = this.f5751b;
            }
        }
        return t;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.f5750a) {
            z = this.f5754e;
        }
        return z;
    }

    public boolean isDone() {
        boolean a;
        synchronized (this.f5750a) {
            a = m7767a();
        }
        return a;
    }
}
