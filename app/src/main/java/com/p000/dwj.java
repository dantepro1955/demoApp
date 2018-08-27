package com.p000;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.dts.C5094a;

/* compiled from: NewThreadWorker */
/* renamed from: dwj */
public class dwj extends C5094a implements dtw {
    /* renamed from: b */
    public static final int f23243b = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    /* renamed from: d */
    private static final boolean f23244d;
    /* renamed from: e */
    private static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f23245e = new ConcurrentHashMap();
    /* renamed from: f */
    private static final AtomicReference<ScheduledExecutorService> f23246f = new AtomicReference();
    /* renamed from: g */
    private static volatile Object f23247g;
    /* renamed from: h */
    private static final Object f23248h = new Object();
    /* renamed from: a */
    volatile boolean f23249a;
    /* renamed from: c */
    private final ScheduledExecutorService f23250c;

    /* compiled from: NewThreadWorker */
    /* renamed from: dwj$1 */
    static class C51921 implements Runnable {
        C51921() {
        }

        public void run() {
            dwj.m29595c();
        }
    }

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int b = dww.m29676b();
        z = !z && (b == 0 || b >= 21);
        f23244d = z;
    }

    /* renamed from: a */
    public static void m29592a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (((ScheduledExecutorService) f23246f.get()) == null) {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new dwy("RxSchedulerPurge-"));
            if (f23246f.compareAndSet(null, newScheduledThreadPool)) {
                newScheduledThreadPool.scheduleAtFixedRate(new C51921(), (long) f23243b, (long) f23243b, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f23245e.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    /* renamed from: a */
    public static void m29591a(ScheduledExecutorService scheduledExecutorService) {
        f23245e.remove(scheduledExecutorService);
    }

    /* renamed from: c */
    static void m29595c() {
        try {
            Iterator it = f23245e.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    it.remove();
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        } catch (Throwable th) {
            dud.m29409b(th);
            dyg.m29850a(th);
        }
    }

    /* renamed from: b */
    public static boolean m29593b(ScheduledExecutorService scheduledExecutorService) {
        if (f23244d) {
            Method c;
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f23247g;
                if (obj == f23248h) {
                    return false;
                }
                if (obj == null) {
                    c = dwj.m29594c(scheduledExecutorService);
                    if (c != null) {
                        obj = c;
                    } else {
                        obj = f23248h;
                    }
                    f23247g = obj;
                } else {
                    c = (Method) obj;
                }
            } else {
                c = dwj.m29594c(scheduledExecutorService);
            }
            if (c != null) {
                try {
                    c.invoke(scheduledExecutorService, new Object[]{Boolean.valueOf(true)});
                    return true;
                } catch (Throwable e) {
                    dyg.m29850a(e);
                } catch (Throwable e2) {
                    dyg.m29850a(e2);
                } catch (Throwable e22) {
                    dyg.m29850a(e22);
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    static Method m29594c(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public dwj(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!dwj.m29593b(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            dwj.m29592a((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f23250c = newScheduledThreadPool;
    }

    /* renamed from: a */
    public dtw mo4644a(duk duk) {
        return mo4645a(duk, 0, null);
    }

    /* renamed from: a */
    public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
        if (this.f23249a) {
            return dyw.m29892a();
        }
        return m29600b(duk, j, timeUnit);
    }

    /* renamed from: b */
    public dwk m29600b(duk duk, long j, TimeUnit timeUnit) {
        Future submit;
        Runnable dwk = new dwk(dyg.m29848a(duk));
        if (j <= 0) {
            submit = this.f23250c.submit(dwk);
        } else {
            submit = this.f23250c.schedule(dwk, j, timeUnit);
        }
        dwk.m29631a(submit);
        return dwk;
    }

    /* renamed from: a */
    public dwk m29599a(duk duk, long j, TimeUnit timeUnit, dyt dyt) {
        Future submit;
        dtw dwk = new dwk(dyg.m29848a(duk), dyt);
        dyt.m29887a(dwk);
        if (j <= 0) {
            submit = this.f23250c.submit(dwk);
        } else {
            submit = this.f23250c.schedule(dwk, j, timeUnit);
        }
        dwk.m29631a(submit);
        return dwk;
    }

    /* renamed from: a */
    public dwk m29598a(duk duk, long j, TimeUnit timeUnit, dxa dxa) {
        Future submit;
        dtw dwk = new dwk(dyg.m29848a(duk), dxa);
        dxa.m29730a(dwk);
        if (j <= 0) {
            submit = this.f23250c.submit(dwk);
        } else {
            submit = this.f23250c.schedule(dwk, j, timeUnit);
        }
        dwk.m29631a(submit);
        return dwk;
    }

    public void unsubscribe() {
        this.f23249a = true;
        this.f23250c.shutdownNow();
        dwj.m29591a(this.f23250c);
    }

    public boolean isUnsubscribed() {
        return this.f23249a;
    }
}
