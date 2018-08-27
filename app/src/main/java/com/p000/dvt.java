package com.p000;

import p000.dtp.C5092a;
import p000.dts.C5094a;

/* compiled from: OperatorSubscribeOn */
/* renamed from: dvt */
public final class dvt<T> implements C5092a<T> {
    /* renamed from: a */
    final dts f23184a;
    /* renamed from: b */
    final dtp<T> f23185b;

    public /* synthetic */ void call(Object obj) {
        m29555a((dtv) obj);
    }

    public dvt(dtp<T> dtp, dts dts) {
        this.f23184a = dts;
        this.f23185b = dtp;
    }

    /* renamed from: a */
    public void m29555a(final dtv<? super T> dtv) {
        final C5094a createWorker = this.f23184a.createWorker();
        dtv.add(createWorker);
        createWorker.mo4644a(new duk(this) {
            /* renamed from: c */
            final /* synthetic */ dvt f23183c;

            /* renamed from: a */
            public void mo4643a() {
                final Thread currentThread = Thread.currentThread();
                this.f23183c.f23185b.m29331a(new dtv<T>(this, dtv) {
                    /* renamed from: b */
                    final /* synthetic */ C51661 f23180b;

                    public void onNext(T t) {
                        dtv.onNext(t);
                    }

                    public void onError(Throwable th) {
                        try {
                            dtv.onError(th);
                        } finally {
                            createWorker.unsubscribe();
                        }
                    }

                    public void onCompleted() {
                        try {
                            dtv.onCompleted();
                        } finally {
                            createWorker.unsubscribe();
                        }
                    }

                    public void setProducer(final dtr dtr) {
                        dtv.setProducer(new dtr(this) {
                            /* renamed from: b */
                            final /* synthetic */ C51651 f23178b;

                            public void request(final long j) {
                                if (currentThread == Thread.currentThread()) {
                                    dtr.request(j);
                                } else {
                                    createWorker.mo4644a(new duk(this) {
                                        /* renamed from: b */
                                        final /* synthetic */ C51641 f23176b;

                                        /* renamed from: a */
                                        public void mo4643a() {
                                            dtr.request(j);
                                        }
                                    });
                                }
                            }
                        });
                    }
                });
            }
        });
    }
}
