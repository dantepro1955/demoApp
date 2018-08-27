package com.p000;

import java.util.concurrent.TimeUnit;
import p000.dtp.C5092a;

/* compiled from: OnSubscribeTimerOnce */
/* renamed from: dvj */
public final class dvj implements C5092a<Long> {
    /* renamed from: a */
    final long f23079a;
    /* renamed from: b */
    final TimeUnit f23080b;
    /* renamed from: c */
    final dts f23081c;

    public /* synthetic */ void call(Object obj) {
        m29489a((dtv) obj);
    }

    public dvj(long j, TimeUnit timeUnit, dts dts) {
        this.f23079a = j;
        this.f23080b = timeUnit;
        this.f23081c = dts;
    }

    /* renamed from: a */
    public void m29489a(final dtv<? super Long> dtv) {
        Object createWorker = this.f23081c.createWorker();
        dtv.add(createWorker);
        createWorker.mo4645a(new duk(this) {
            /* renamed from: b */
            final /* synthetic */ dvj f23078b;

            /* renamed from: a */
            public void mo4643a() {
                try {
                    dtv.onNext(Long.valueOf(0));
                    dtv.onCompleted();
                } catch (Throwable th) {
                    dud.m29404a(th, dtv);
                }
            }
        }, this.f23079a, this.f23080b);
    }
}
