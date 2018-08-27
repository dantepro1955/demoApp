package com.p000;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@bhd
/* renamed from: bld */
public class bld {

    /* renamed from: bld$a */
    public interface C1182a<D, R> {
        /* renamed from: a */
        R mo1182a(D d);
    }

    /* renamed from: bld$1 */
    class C13161 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blb f6808a;
        /* renamed from: b */
        final /* synthetic */ C1182a f6809b;
        /* renamed from: c */
        final /* synthetic */ ble f6810c;

        C13161(blb blb, C1182a c1182a, ble ble) {
            this.f6808a = blb;
            this.f6809b = c1182a;
            this.f6810c = ble;
        }

        public void run() {
            try {
                this.f6808a.m7770b(this.f6809b.mo1182a(this.f6810c.get()));
                return;
            } catch (CancellationException e) {
            } catch (InterruptedException e2) {
            } catch (ExecutionException e3) {
            }
            this.f6808a.cancel(true);
        }
    }

    /* renamed from: bld$2 */
    class C13172 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ AtomicInteger f6811a;
        /* renamed from: b */
        final /* synthetic */ int f6812b;
        /* renamed from: c */
        final /* synthetic */ blb f6813c;
        /* renamed from: d */
        final /* synthetic */ List f6814d;

        C13172(AtomicInteger atomicInteger, int i, blb blb, List list) {
            this.f6811a = atomicInteger;
            this.f6812b = i;
            this.f6813c = blb;
            this.f6814d = list;
        }

        public void run() {
            Throwable e;
            if (this.f6811a.incrementAndGet() >= this.f6812b) {
                try {
                    this.f6813c.m7770b(bld.m9322c(this.f6814d));
                    return;
                } catch (ExecutionException e2) {
                    e = e2;
                } catch (InterruptedException e3) {
                    e = e3;
                }
            } else {
                return;
            }
            bky.m9009c("Unable to convert list of futures to a future of list", e);
        }
    }

    /* renamed from: a */
    public static <A, B> ble<B> m9318a(ble<A> ble, C1182a<A, B> c1182a) {
        ble blb = new blb();
        ble.mo1017a(new C13161(blb, c1182a, ble));
        return blb;
    }

    /* renamed from: a */
    public static <V> ble<List<V>> m9319a(List<ble<V>> list) {
        ble blb = new blb();
        int size = list.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (ble a : list) {
            a.mo1017a(new C13172(atomicInteger, size, blb, list));
        }
        return blb;
    }

    /* renamed from: a */
    public static <T> T m9320a(Future<T> future, T t, int i, TimeUnit timeUnit) {
        try {
            t = future.get((long) i, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
        }
        return t;
    }

    /* renamed from: c */
    private static <V> List<V> m9322c(List<ble<V>> list) throws ExecutionException, InterruptedException {
        List<V> arrayList = new ArrayList();
        for (ble ble : list) {
            Object obj = ble.get();
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
