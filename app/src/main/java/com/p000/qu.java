package com.p000;

/* renamed from: qu */
public final class qu extends Thread {
    /* renamed from: a */
    private static qx f25255a = null;
    /* renamed from: b */
    private static final Object f25256b = new Object();
    /* renamed from: c */
    private static int f25257c;

    /* renamed from: a */
    public static void m33921a() {
        synchronized (f25256b) {
            if (f25255a == null) {
                f25255a = new qx(f25256b);
            }
            f25257c++;
        }
    }

    /* renamed from: a */
    public static void m33922a(Runnable runnable) {
        qu.m33923a(runnable, 0);
    }

    /* renamed from: a */
    public static void m33923a(final Runnable runnable, int i) {
        synchronized (f25256b) {
            if (f25255a == null) {
                czl.m25831c(null, "Job added while JobRunner not active");
            } else {
                f25255a.m33938a(new Runnable() {
                    public final void run() {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            czl.m25829a(qu.f25255a, "Error running job", th);
                        }
                    }
                }, i);
            }
        }
    }

    /* renamed from: b */
    public static void m33924b() {
        synchronized (f25256b) {
            if (f25255a != null) {
                f25257c--;
                if (f25257c < 0) {
                    czl.m25830b(f25255a, "JobRunner shutdown more often than initialized");
                    f25257c = 0;
                }
                if (f25257c <= 0) {
                    final qx qxVar = f25255a;
                    qu.m33923a(new Runnable() {
                        public final void run() {
                            qx qxVar = qxVar;
                            qx.m33937a();
                        }
                    }, 0);
                    f25255a = null;
                }
            } else {
                czl.m25831c(null, "JobRunner shutdown when not active");
            }
        }
    }
}
