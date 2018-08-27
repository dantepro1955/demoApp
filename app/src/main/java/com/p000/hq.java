package com.p000;

/* compiled from: Pools */
/* renamed from: hq */
public final class hq {

    /* compiled from: Pools */
    /* renamed from: hq$a */
    public interface C3584a<T> {
        /* renamed from: a */
        T mo3319a();

        /* renamed from: a */
        boolean mo3320a(T t);
    }

    /* compiled from: Pools */
    /* renamed from: hq$b */
    public static class C3585b<T> implements C3584a<T> {
        /* renamed from: a */
        private final Object[] f16862a;
        /* renamed from: b */
        private int f16863b;

        public C3585b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f16862a = new Object[i];
        }

        /* renamed from: a */
        public T mo3319a() {
            if (this.f16863b <= 0) {
                return null;
            }
            int i = this.f16863b - 1;
            T t = this.f16862a[i];
            this.f16862a[i] = null;
            this.f16863b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo3320a(T t) {
            if (m21164b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f16863b >= this.f16862a.length) {
                return false;
            } else {
                this.f16862a[this.f16863b] = t;
                this.f16863b++;
                return true;
            }
        }

        /* renamed from: b */
        private boolean m21164b(T t) {
            for (int i = 0; i < this.f16863b; i++) {
                if (this.f16862a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Pools */
    /* renamed from: hq$c */
    public static class C3586c<T> extends C3585b<T> {
        /* renamed from: a */
        private final Object f16864a = new Object();

        public C3586c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo3319a() {
            T a;
            synchronized (this.f16864a) {
                a = super.mo3319a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo3320a(T t) {
            boolean a;
            synchronized (this.f16864a) {
                a = super.mo3320a(t);
            }
            return a;
        }
    }
}
