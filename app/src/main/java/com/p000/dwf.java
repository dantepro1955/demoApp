package com.p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: GenericScheduledExecutorService */
/* renamed from: dwf */
public final class dwf implements dwl {
    /* renamed from: a */
    public static final dwf f23286a = new dwf();
    /* renamed from: b */
    private static final ScheduledExecutorService[] f23287b = new ScheduledExecutorService[0];
    /* renamed from: c */
    private static final ScheduledExecutorService f23288c = Executors.newScheduledThreadPool(0);
    /* renamed from: e */
    private static int f23289e;
    /* renamed from: d */
    private final AtomicReference<ScheduledExecutorService[]> f23290d = new AtomicReference(f23287b);

    static {
        f23288c.shutdown();
    }

    private dwf() {
        mo4662a();
    }

    /* renamed from: a */
    public void mo4662a() {
        int i = 8;
        int i2 = 0;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors <= 8) {
            i = availableProcessors;
        }
        Object obj = new ScheduledExecutorService[i];
        for (availableProcessors = 0; availableProcessors < i; availableProcessors++) {
            obj[availableProcessors] = dwg.m29624b();
        }
        if (this.f23290d.compareAndSet(f23287b, obj)) {
            availableProcessors = obj.length;
            while (i2 < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = obj[i2];
                if (!dwj.m29593b(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    dwj.m29592a((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i2++;
            }
            return;
        }
        for (ScheduledExecutorService shutdownNow : obj) {
            shutdownNow.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo4663b() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        do {
            scheduledExecutorServiceArr = (ScheduledExecutorService[]) this.f23290d.get();
            if (scheduledExecutorServiceArr == f23287b) {
                return;
            }
        } while (!this.f23290d.compareAndSet(scheduledExecutorServiceArr, f23287b));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            dwj.m29591a(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    /* renamed from: c */
    public static ScheduledExecutorService m29620c() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = (ScheduledExecutorService[]) f23286a.f23290d.get();
        if (scheduledExecutorServiceArr == f23287b) {
            return f23288c;
        }
        int i = f23289e + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        f23289e = i;
        return scheduledExecutorServiceArr[i];
    }
}
