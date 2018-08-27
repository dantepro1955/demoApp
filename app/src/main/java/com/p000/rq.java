package com.p000;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: BoltsExecutors */
/* renamed from: rq */
final class rq {
    /* renamed from: a */
    private static final rq f25351a = new rq();
    /* renamed from: b */
    private final ExecutorService f25352b;
    /* renamed from: c */
    private final ScheduledExecutorService f25353c;
    /* renamed from: d */
    private final Executor f25354d;

    /* compiled from: BoltsExecutors */
    /* renamed from: rq$a */
    static class C5726a implements Executor {
        /* renamed from: a */
        private ThreadLocal<Integer> f25350a;

        private C5726a() {
            this.f25350a = new ThreadLocal();
        }

        /* renamed from: a */
        private int m33979a() {
            Integer num = (Integer) this.f25350a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() + 1;
            this.f25350a.set(Integer.valueOf(intValue));
            return intValue;
        }

        /* renamed from: b */
        private int m33980b() {
            Integer num = (Integer) this.f25350a.get();
            if (num == null) {
                num = Integer.valueOf(0);
            }
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                this.f25350a.remove();
            } else {
                this.f25350a.set(Integer.valueOf(intValue));
            }
            return intValue;
        }

        public void execute(Runnable runnable) {
            if (m33979a() <= 15) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    m33980b();
                }
            } else {
                rq.m33981a().execute(runnable);
            }
            m33980b();
        }
    }

    /* renamed from: c */
    private static boolean m33983c() {
        String property = System.getProperty("java.runtime.name");
        if (property == null) {
            return false;
        }
        return property.toLowerCase(Locale.US).contains("android");
    }

    private rq() {
        this.f25352b = !rq.m33983c() ? Executors.newCachedThreadPool() : rn.m33974a();
        this.f25353c = Executors.newSingleThreadScheduledExecutor();
        this.f25354d = new C5726a();
    }

    /* renamed from: a */
    public static ExecutorService m33981a() {
        return f25351a.f25352b;
    }

    /* renamed from: b */
    static Executor m33982b() {
        return f25351a.f25354d;
    }
}
