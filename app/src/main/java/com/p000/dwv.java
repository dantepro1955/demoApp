package com.p000;

import java.util.List;
import p000.dtp.C5093b;

/* compiled from: InternalObservableUtils */
/* renamed from: dwv */
public enum dwv {
    ;
    
    /* renamed from: a */
    public static final C5211e f23352a = null;
    /* renamed from: b */
    public static final C5209c f23353b = null;
    /* renamed from: c */
    public static final C5214h f23354c = null;
    /* renamed from: d */
    static final C5213g f23355d = null;
    /* renamed from: e */
    public static final C5210d f23356e = null;
    /* renamed from: f */
    static final C5208b f23357f = null;
    /* renamed from: g */
    public static final dul<Throwable> f23358g = null;
    /* renamed from: h */
    public static final C5093b<Boolean, Object> f23359h = null;

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$a */
    static final class C5207a implements dul<Throwable> {
        C5207a() {
        }

        public /* synthetic */ void call(Object obj) {
            m29658a((Throwable) obj);
        }

        /* renamed from: a */
        public void m29658a(Throwable th) {
            throw new duh(th);
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$b */
    static final class C5208b implements duo<dto<?>, Throwable> {
        C5208b() {
        }

        /* renamed from: a */
        public Throwable m29660a(dto<?> dto) {
            return dto.m29299b();
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$c */
    static final class C5209c implements dup<Object, Object, Boolean> {
        C5209c() {
        }

        /* renamed from: a */
        public /* synthetic */ Object mo4116a(Object obj, Object obj2) {
            return m29662b(obj, obj2);
        }

        /* renamed from: b */
        public Boolean m29662b(Object obj, Object obj2) {
            boolean z = obj == obj2 || (obj != null && obj.equals(obj2));
            return Boolean.valueOf(z);
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$d */
    static final class C5210d implements dup<Integer, Object, Integer> {
        C5210d() {
        }

        /* renamed from: a */
        public Integer m29663a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$e */
    static final class C5211e implements dup<Long, Object, Long> {
        C5211e() {
        }

        /* renamed from: a */
        public Long m29665a(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$f */
    static final class C5212f implements duo<dtp<? extends dto<?>>, dtp<?>> {
        /* renamed from: a */
        final duo<? super dtp<? extends Throwable>, ? extends dtp<?>> f23351a;

        public C5212f(duo<? super dtp<? extends Throwable>, ? extends dtp<?>> duo) {
            this.f23351a = duo;
        }

        /* renamed from: a */
        public dtp<?> m29667a(dtp<? extends dto<?>> dtp) {
            return (dtp) this.f23351a.mo4103a(dtp.m29341d(dwv.f23357f));
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$g */
    static final class C5213g implements duo<Object, Void> {
        C5213g() {
        }

        /* renamed from: a */
        public /* synthetic */ Object mo4103a(Object obj) {
            return m29670b(obj);
        }

        /* renamed from: b */
        public Void m29670b(Object obj) {
            return null;
        }
    }

    /* compiled from: InternalObservableUtils */
    /* renamed from: dwv$h */
    static final class C5214h implements duo<List<? extends dtp<?>>, dtp<?>[]> {
        C5214h() {
        }

        /* renamed from: a */
        public dtp<?>[] m29672a(List<? extends dtp<?>> list) {
            return (dtp[]) list.toArray(new dtp[list.size()]);
        }
    }

    static {
        f23352a = new C5211e();
        f23353b = new C5209c();
        f23354c = new C5214h();
        f23355d = new C5213g();
        f23356e = new C5210d();
        f23357f = new C5208b();
        f23358g = new C5207a();
        f23359h = new dvk(dxb.m29735a(), true);
    }

    /* renamed from: a */
    public static duo<dtp<? extends dto<?>>, dtp<?>> m29673a(duo<? super dtp<? extends Throwable>, ? extends dtp<?>> duo) {
        return new C5212f(duo);
    }
}
