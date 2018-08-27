package com.p000;

import android.os.Looper;
import io.fabric.sdk.android.Fabric;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: CrashlyticsBackgroundWorker */
/* renamed from: abi */
class abi {
    /* renamed from: a */
    private final ExecutorService f191a;

    public abi(ExecutorService executorService) {
        this.f191a = executorService;
    }

    /* renamed from: a */
    <T> T m221a(Callable<T> callable) {
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.f191a.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.f191a.submit(callable).get();
        } catch (RejectedExecutionException e) {
            Fabric.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Throwable e2) {
            Fabric.h().e("CrashlyticsCore", "Failed to execute task.", e2);
            return null;
        }
    }

    /* renamed from: a */
    Future<?> m222a(final Runnable runnable) {
        try {
            return this.f191a.submit(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ abi f188b;

                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable e) {
                        Fabric.h().e("CrashlyticsCore", "Failed to execute task.", e);
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            Fabric.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* renamed from: b */
    <T> Future<T> m223b(final Callable<T> callable) {
        try {
            return this.f191a.submit(new Callable<T>(this) {
                /* renamed from: b */
                final /* synthetic */ abi f190b;

                public T call() throws Exception {
                    try {
                        return callable.call();
                    } catch (Throwable e) {
                        Fabric.h().e("CrashlyticsCore", "Failed to execute task.", e);
                        return null;
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            Fabric.h().a("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
