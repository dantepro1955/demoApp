package com.p000;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: AndroidExecutors */
/* renamed from: rn */
final class rn {
    /* renamed from: a */
    static final int f25338a = (f25341e + 1);
    /* renamed from: b */
    static final int f25339b = ((f25341e * 2) + 1);
    /* renamed from: c */
    private static final rn f25340c = new rn();
    /* renamed from: e */
    private static final int f25341e = Runtime.getRuntime().availableProcessors();
    /* renamed from: d */
    private final Executor f25342d = new C5723a();

    /* compiled from: AndroidExecutors */
    /* renamed from: rn$a */
    static class C5723a implements Executor {
        private C5723a() {
        }

        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private rn() {
    }

    /* renamed from: a */
    public static ExecutorService m33974a() {
        ExecutorService threadPoolExecutor = new ThreadPoolExecutor(f25338a, f25339b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        rn.m33975a(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m33975a(ThreadPoolExecutor threadPoolExecutor, boolean z) {
        if (VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(z);
        }
    }

    /* renamed from: b */
    public static Executor m33976b() {
        return f25340c.f25342d;
    }
}
