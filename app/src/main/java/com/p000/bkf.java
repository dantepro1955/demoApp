package com.p000;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@bhd
/* renamed from: bkf */
public final class bkf {
    /* renamed from: a */
    private static final ThreadPoolExecutor f6700a = new ThreadPoolExecutor(10, 10, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), bkf.m9062a("Default"));
    /* renamed from: b */
    private static final ThreadPoolExecutor f6701b = new ThreadPoolExecutor(5, 5, 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), bkf.m9062a("Loader"));

    /* renamed from: bkf$1 */
    class C12741 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ Runnable f6692a;

        C12741(Runnable runnable) {
            this.f6692a = runnable;
        }

        /* renamed from: a */
        public Void m9056a() {
            this.f6692a.run();
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return m9056a();
        }
    }

    /* renamed from: bkf$2 */
    class C12752 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ Runnable f6693a;

        C12752(Runnable runnable) {
            this.f6693a = runnable;
        }

        /* renamed from: a */
        public Void m9057a() {
            this.f6693a.run();
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return m9057a();
        }
    }

    /* renamed from: bkf$3 */
    class C12763 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blb f6694a;
        /* renamed from: b */
        final /* synthetic */ Callable f6695b;

        C12763(blb blb, Callable callable) {
            this.f6694a = blb;
            this.f6695b = callable;
        }

        public void run() {
            try {
                Process.setThreadPriority(10);
                this.f6694a.m7770b(this.f6695b.call());
            } catch (Throwable e) {
                ako.m2347i().m8934a(e, "AdThreadPool.submit");
                this.f6694a.m7769a(e);
            }
        }
    }

    /* renamed from: bkf$4 */
    class C12774 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blb f6696a;
        /* renamed from: b */
        final /* synthetic */ Future f6697b;

        C12774(blb blb, Future future) {
            this.f6696a = blb;
            this.f6697b = future;
        }

        public void run() {
            if (this.f6696a.isCancelled()) {
                this.f6697b.cancel(true);
            }
        }
    }

    /* renamed from: bkf$5 */
    class C12785 implements ThreadFactory {
        /* renamed from: a */
        final /* synthetic */ String f6698a;
        /* renamed from: b */
        private final AtomicInteger f6699b = new AtomicInteger(1);

        C12785(String str) {
            this.f6698a = str;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f6698a;
            return new Thread(runnable, new StringBuilder(String.valueOf(str).length() + 23).append("AdWorker(").append(str).append(") #").append(this.f6699b.getAndIncrement()).toString());
        }
    }

    static {
        f6700a.allowCoreThreadTimeOut(true);
        f6701b.allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public static ble<Void> m9058a(int i, Runnable runnable) {
        return i == 1 ? bkf.m9061a(f6701b, new C12741(runnable)) : bkf.m9061a(f6700a, new C12752(runnable));
    }

    /* renamed from: a */
    public static ble<Void> m9059a(Runnable runnable) {
        return bkf.m9058a(0, runnable);
    }

    /* renamed from: a */
    public static <T> ble<T> m9060a(Callable<T> callable) {
        return bkf.m9061a(f6700a, (Callable) callable);
    }

    /* renamed from: a */
    public static <T> ble<T> m9061a(ExecutorService executorService, Callable<T> callable) {
        Object blb = new blb();
        try {
            blb.mo1018b(new C12774(blb, executorService.submit(new C12763(blb, callable))));
        } catch (Throwable e) {
            bky.m9009c("Thread execution is rejected.", e);
            blb.cancel(true);
        }
        return blb;
    }

    /* renamed from: a */
    private static ThreadFactory m9062a(String str) {
        return new C12785(str);
    }
}
