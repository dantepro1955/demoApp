package com.p000;

import java.util.concurrent.TimeUnit;

/* compiled from: Scheduler */
/* renamed from: dts */
public abstract class dts {
    /* renamed from: a */
    static final long f22926a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* compiled from: Scheduler */
    /* renamed from: dts$a */
    public static abstract class C5094a implements dtw {
        /* renamed from: a */
        public abstract dtw mo4644a(duk duk);

        /* renamed from: a */
        public abstract dtw mo4645a(duk duk, long j, TimeUnit timeUnit);

        /* renamed from: b */
        public long mo5510b() {
            return System.currentTimeMillis();
        }
    }

    public abstract C5094a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends dts & dtw> S when(duo<dtp<dtp<dtm>>, dtm> duo) {
        return new dwm(duo, this);
    }
}
