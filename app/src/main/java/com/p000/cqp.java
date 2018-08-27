package com.p000;

import java.util.concurrent.TimeUnit;

/* compiled from: RetryWithDelayIf */
/* renamed from: cqp */
public class cqp implements duo<dtp<? extends Throwable>, dtp<?>> {
    /* renamed from: a */
    private final int f19991a;
    /* renamed from: b */
    private duo<Throwable, Boolean> f19992b;

    /* compiled from: RetryWithDelayIf */
    /* renamed from: cqp$a */
    static class C4530a<T, S> {
        /* renamed from: a */
        T f19989a;
        /* renamed from: b */
        S f19990b;

        public C4530a(T t, S s) {
            this.f19989a = t;
            this.f19990b = s;
        }

        /* renamed from: a */
        public T m24501a() {
            return this.f19989a;
        }

        /* renamed from: b */
        public S m24502b() {
            return this.f19990b;
        }
    }

    public cqp(int i, duo<Throwable, Boolean> duo) {
        this.f19991a = i;
        this.f19992b = duo;
    }

    /* renamed from: a */
    public dtp<?> m24505a(dtp<? extends Throwable> dtp) {
        return dtp.m29325a(dtp.m29307a(1, this.f19991a), cqq.m24508a()).m29340c(cqr.m24510a(this));
    }

    /* renamed from: a */
    static /* synthetic */ dtp m24504a(cqp cqp, C4530a c4530a) {
        if (!((Boolean) cqp.f19992b.mo4103a(c4530a.m24501a())).booleanValue() || ((Integer) c4530a.m24502b()).intValue() > cqp.f19991a) {
            return dtp.m29317a((Throwable) c4530a.m24501a());
        }
        return dtp.m29308a((long) Math.pow(2.0d, (double) ((Integer) c4530a.m24502b()).intValue()), TimeUnit.SECONDS);
    }
}
