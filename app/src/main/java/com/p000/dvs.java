package com.p000;

import java.util.NoSuchElementException;
import p000.dtp.C5093b;

/* compiled from: OperatorSingle */
/* renamed from: dvs */
public final class dvs<T> implements C5093b<T, T> {
    /* renamed from: a */
    private final boolean f23173a;
    /* renamed from: b */
    private final T f23174b;

    /* compiled from: OperatorSingle */
    /* renamed from: dvs$a */
    static final class C5161a {
        /* renamed from: a */
        static final dvs<?> f23166a = new dvs();
    }

    /* compiled from: OperatorSingle */
    /* renamed from: dvs$b */
    static final class C5162b<T> extends dtv<T> {
        /* renamed from: a */
        private final dtv<? super T> f23167a;
        /* renamed from: b */
        private final boolean f23168b;
        /* renamed from: c */
        private final T f23169c;
        /* renamed from: d */
        private T f23170d;
        /* renamed from: e */
        private boolean f23171e;
        /* renamed from: f */
        private boolean f23172f;

        C5162b(dtv<? super T> dtv, boolean z, T t) {
            this.f23167a = dtv;
            this.f23168b = z;
            this.f23169c = t;
            request(2);
        }

        public void onNext(T t) {
            if (!this.f23172f) {
                if (this.f23171e) {
                    this.f23172f = true;
                    this.f23167a.onError(new IllegalArgumentException("Sequence contains too many elements"));
                    unsubscribe();
                    return;
                }
                this.f23170d = t;
                this.f23171e = true;
            }
        }

        public void onCompleted() {
            if (!this.f23172f) {
                if (this.f23171e) {
                    this.f23167a.setProducer(new dwb(this.f23167a, this.f23170d));
                } else if (this.f23168b) {
                    this.f23167a.setProducer(new dwb(this.f23167a, this.f23169c));
                } else {
                    this.f23167a.onError(new NoSuchElementException("Sequence contains no elements"));
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f23172f) {
                dyg.m29850a(th);
            } else {
                this.f23167a.onError(th);
            }
        }
    }

    /* renamed from: a */
    public static <T> dvs<T> m29550a() {
        return C5161a.f23166a;
    }

    dvs() {
        this(false, null);
    }

    private dvs(boolean z, T t) {
        this.f23173a = z;
        this.f23174b = t;
    }

    /* renamed from: a */
    public dtv<? super T> m29551a(dtv<? super T> dtv) {
        Object c5162b = new C5162b(dtv, this.f23173a, this.f23174b);
        dtv.add(c5162b);
        return c5162b;
    }
}
