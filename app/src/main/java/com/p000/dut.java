package com.p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import p000.dtp.C5092a;

/* compiled from: BufferUntilSubscriber */
/* renamed from: dut */
public final class dut<T> extends dyq<T, T> {
    /* renamed from: c */
    static final dtq f22973c = new C51101();
    /* renamed from: b */
    final C5113b<T> f22974b;
    /* renamed from: d */
    private boolean f22975d;

    /* compiled from: BufferUntilSubscriber */
    /* renamed from: dut$1 */
    static class C51101 implements dtq {
        C51101() {
        }

        public void onCompleted() {
        }

        public void onError(Throwable th) {
        }

        public void onNext(Object obj) {
        }
    }

    /* compiled from: BufferUntilSubscriber */
    /* renamed from: dut$a */
    static final class C5112a<T> implements C5092a<T> {
        /* renamed from: a */
        final C5113b<T> f22969a;

        /* compiled from: BufferUntilSubscriber */
        /* renamed from: dut$a$1 */
        class C51111 implements duk {
            /* renamed from: a */
            final /* synthetic */ C5112a f22968a;

            C51111(C5112a c5112a) {
                this.f22968a = c5112a;
            }

            /* renamed from: a */
            public void mo4643a() {
                this.f22968a.f22969a.set(dut.f22973c);
            }
        }

        public /* synthetic */ void call(Object obj) {
            m29428a((dtv) obj);
        }

        public C5112a(C5113b<T> c5113b) {
            this.f22969a = c5113b;
        }

        /* renamed from: a */
        public void m29428a(dtv<? super T> dtv) {
            Object obj = 1;
            if (this.f22969a.m29429a(null, dtv)) {
                dtv.add(dyw.m29893a(new C51111(this)));
                synchronized (this.f22969a.f22970a) {
                    if (this.f22969a.f22971b) {
                        obj = null;
                    } else {
                        this.f22969a.f22971b = true;
                    }
                }
                if (obj != null) {
                    while (true) {
                        Object poll = this.f22969a.f22972c.poll();
                        if (poll != null) {
                            duw.m29443a((dtq) this.f22969a.get(), poll);
                        } else {
                            synchronized (this.f22969a.f22970a) {
                                if (this.f22969a.f22972c.isEmpty()) {
                                    this.f22969a.f22971b = false;
                                    return;
                                }
                            }
                        }
                    }
                }
                return;
            }
            dtv.onError(new IllegalStateException("Only one subscriber allowed!"));
        }
    }

    /* compiled from: BufferUntilSubscriber */
    /* renamed from: dut$b */
    static final class C5113b<T> extends AtomicReference<dtq<? super T>> {
        private static final long serialVersionUID = 8026705089538090368L;
        /* renamed from: a */
        final Object f22970a = new Object();
        /* renamed from: b */
        boolean f22971b;
        /* renamed from: c */
        final ConcurrentLinkedQueue<Object> f22972c = new ConcurrentLinkedQueue();

        C5113b() {
        }

        /* renamed from: a */
        boolean m29429a(dtq<? super T> dtq, dtq<? super T> dtq2) {
            return compareAndSet(dtq, dtq2);
        }
    }

    /* renamed from: a */
    public static <T> dut<T> m29431a() {
        return new dut(new C5113b());
    }

    private dut(C5113b<T> c5113b) {
        super(new C5112a(c5113b));
        this.f22974b = c5113b;
    }

    /* renamed from: b */
    private void m29432b(Object obj) {
        synchronized (this.f22974b.f22970a) {
            this.f22974b.f22972c.add(obj);
            if (!(this.f22974b.get() == null || this.f22974b.f22971b)) {
                this.f22975d = true;
                this.f22974b.f22971b = true;
            }
        }
        if (this.f22975d) {
            while (true) {
                Object poll = this.f22974b.f22972c.poll();
                if (poll != null) {
                    duw.m29443a((dtq) this.f22974b.get(), poll);
                } else {
                    return;
                }
            }
        }
    }

    public void onCompleted() {
        if (this.f22975d) {
            ((dtq) this.f22974b.get()).onCompleted();
        } else {
            m29432b(duw.m29440a());
        }
    }

    public void onError(Throwable th) {
        if (this.f22975d) {
            ((dtq) this.f22974b.get()).onError(th);
        } else {
            m29432b(duw.m29442a(th));
        }
    }

    public void onNext(T t) {
        if (this.f22975d) {
            ((dtq) this.f22974b.get()).onNext(t);
        } else {
            m29432b(duw.m29441a((Object) t));
        }
    }
}
