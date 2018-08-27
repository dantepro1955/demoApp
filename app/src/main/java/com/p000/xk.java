package com.p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: xk */
class xk {
    /* renamed from: a */
    private final vm f25973a;
    /* renamed from: b */
    private final zi f25974b;
    /* renamed from: c */
    private final ScheduledExecutorService f25975c = m34802a("main");
    /* renamed from: d */
    private final ScheduledExecutorService f25976d = m34802a("back");
    /* renamed from: e */
    private final ScheduledExecutorService f25977e = m34802a("postbacks");

    xk(vm vmVar) {
        this.f25973a = vmVar;
        this.f25974b = vmVar.mo5561g();
    }

    /* renamed from: a */
    private static void m34800a(Runnable runnable, long j, ScheduledExecutorService scheduledExecutorService) {
        if (j > 0) {
            scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.submit(runnable);
        }
    }

    /* renamed from: a */
    ScheduledExecutorService m34802a(String str) {
        return Executors.newScheduledThreadPool(1, new xm(this, str));
    }

    /* renamed from: a */
    void m34803a(wo woVar, xl xlVar) {
        m34804a(woVar, xlVar, 0);
    }

    /* renamed from: a */
    void m34804a(wo woVar, xl xlVar, long j) {
        if (woVar == null) {
            throw new IllegalArgumentException("No task specified");
        } else if (j < 0) {
            throw new IllegalArgumentException("Invalid delay specified: " + j);
        } else {
            this.f25974b.mo5606a(woVar.f25867a, "Scheduling " + woVar.f25867a + " on " + xlVar + " queue in " + j + "ms.");
            Runnable xoVar = new xo(this, woVar, xlVar);
            if (xlVar == xl.MAIN) {
                xk.m34800a(xoVar, j, this.f25975c);
            } else if (xlVar == xl.BACKGROUND) {
                xk.m34800a(xoVar, j, this.f25976d);
            } else if (xlVar == xl.POSTBACKS) {
                xk.m34800a(xoVar, j, this.f25977e);
            }
        }
    }

    /* renamed from: a */
    void m34805a(xj xjVar, long j) {
        if (xjVar == null) {
            throw new IllegalArgumentException("No task specified");
        }
        xk.m34800a((Runnable) xjVar, j, this.f25975c);
    }
}
