package com.p000;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p000.dts.C5094a;

/* compiled from: TrampolineScheduler */
/* renamed from: dwo */
public final class dwo extends dts {
    /* renamed from: b */
    public static final dwo f23336b = new dwo();

    /* compiled from: TrampolineScheduler */
    /* renamed from: dwo$a */
    static final class C5205a extends C5094a implements dtw {
        /* renamed from: a */
        final AtomicInteger f23329a = new AtomicInteger();
        /* renamed from: b */
        final PriorityBlockingQueue<C5206b> f23330b = new PriorityBlockingQueue();
        /* renamed from: c */
        private final dys f23331c = new dys();
        /* renamed from: d */
        private final AtomicInteger f23332d = new AtomicInteger();

        C5205a() {
        }

        /* renamed from: a */
        public dtw mo4644a(duk duk) {
            return m29645a(duk, mo5510b());
        }

        /* renamed from: a */
        public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
            long b = mo5510b() + timeUnit.toMillis(j);
            return m29645a(new dwn(duk, this, b), b);
        }

        /* renamed from: a */
        private dtw m29645a(duk duk, long j) {
            if (this.f23331c.isUnsubscribed()) {
                return dyw.m29892a();
            }
            final C5206b c5206b = new C5206b(duk, Long.valueOf(j), this.f23329a.incrementAndGet());
            this.f23330b.add(c5206b);
            if (this.f23332d.getAndIncrement() != 0) {
                return dyw.m29893a(new duk(this) {
                    /* renamed from: b */
                    final /* synthetic */ C5205a f23328b;

                    /* renamed from: a */
                    public void mo4643a() {
                        this.f23328b.f23330b.remove(c5206b);
                    }
                });
            }
            do {
                c5206b = (C5206b) this.f23330b.poll();
                if (c5206b != null) {
                    c5206b.f23333a.mo4643a();
                }
            } while (this.f23332d.decrementAndGet() > 0);
            return dyw.m29892a();
        }

        public void unsubscribe() {
            this.f23331c.unsubscribe();
        }

        public boolean isUnsubscribed() {
            return this.f23331c.isUnsubscribed();
        }
    }

    /* compiled from: TrampolineScheduler */
    /* renamed from: dwo$b */
    static final class C5206b implements Comparable<C5206b> {
        /* renamed from: a */
        final duk f23333a;
        /* renamed from: b */
        final Long f23334b;
        /* renamed from: c */
        final int f23335c;

        public /* synthetic */ int compareTo(Object obj) {
            return m29648a((C5206b) obj);
        }

        C5206b(duk duk, Long l, int i) {
            this.f23333a = duk;
            this.f23334b = l;
            this.f23335c = i;
        }

        /* renamed from: a */
        public int m29648a(C5206b c5206b) {
            int compareTo = this.f23334b.compareTo(c5206b.f23334b);
            if (compareTo == 0) {
                return dwo.m29649a(this.f23335c, c5206b.f23335c);
            }
            return compareTo;
        }
    }

    public C5094a createWorker() {
        return new C5205a();
    }

    private dwo() {
    }

    /* renamed from: a */
    static int m29649a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }
}
