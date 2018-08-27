package com.p000;

import java.io.IOException;

/* compiled from: TreeTypeAdapter */
/* renamed from: bvv */
public final class bvv<T> extends bus<T> {
    /* renamed from: a */
    private final bup<T> f7874a;
    /* renamed from: b */
    private final bug<T> f7875b;
    /* renamed from: c */
    private final bub f7876c;
    /* renamed from: d */
    private final bvz<T> f7877d;
    /* renamed from: e */
    private final but f7878e;
    /* renamed from: f */
    private final C1543a f7879f = new C1543a();
    /* renamed from: g */
    private bus<T> f7880g;

    /* compiled from: TreeTypeAdapter */
    /* renamed from: bvv$a */
    final class C1543a implements buf, buo {
        /* renamed from: a */
        final /* synthetic */ bvv f7868a;

        private C1543a(bvv bvv) {
            this.f7868a = bvv;
        }
    }

    /* compiled from: TreeTypeAdapter */
    /* renamed from: bvv$b */
    static final class C1544b implements but {
        /* renamed from: a */
        private final bvz<?> f7869a;
        /* renamed from: b */
        private final boolean f7870b;
        /* renamed from: c */
        private final Class<?> f7871c;
        /* renamed from: d */
        private final bup<?> f7872d;
        /* renamed from: e */
        private final bug<?> f7873e;

        C1544b(Object obj, bvz<?> bvz, boolean z, Class<?> cls) {
            this.f7872d = obj instanceof bup ? (bup) obj : null;
            if (obj instanceof bug) {
                obj = (bug) obj;
            } else {
                obj = null;
            }
            this.f7873e = obj;
            boolean z2 = (this.f7872d == null && this.f7873e == null) ? false : true;
            buz.m11116a(z2);
            this.f7869a = bvz;
            this.f7870b = z;
            this.f7871c = cls;
        }

        /* renamed from: a */
        public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
            boolean isAssignableFrom = this.f7869a != null ? this.f7869a.equals(bvz) || (this.f7870b && this.f7869a.m11005b() == bvz.m11004a()) : this.f7871c.isAssignableFrom(bvz.m11004a());
            return isAssignableFrom ? new bvv(this.f7872d, this.f7873e, bub, bvz, this) : null;
        }
    }

    public bvv(bup<T> bup, bug<T> bug, bub bub, bvz<T> bvz, but but) {
        this.f7874a = bup;
        this.f7875b = bug;
        this.f7876c = bub;
        this.f7877d = bvz;
        this.f7878e = but;
    }

    /* renamed from: b */
    public T mo1537b(bwa bwa) throws IOException {
        if (this.f7875b == null) {
            return m11350b().mo1537b(bwa);
        }
        buh a = bvi.m11188a(bwa);
        if (a.m11071k()) {
            return null;
        }
        return this.f7875b.mo1534b(a, this.f7877d.m11005b(), this.f7879f);
    }

    /* renamed from: a */
    public void mo1536a(bwc bwc, T t) throws IOException {
        if (this.f7874a == null) {
            m11350b().mo1536a(bwc, t);
        } else if (t == null) {
            bwc.mo1578f();
        } else {
            bvi.m11190a(this.f7874a.mo1533a(t, this.f7877d.m11005b(), this.f7879f), bwc);
        }
    }

    /* renamed from: b */
    private bus<T> m11350b() {
        bus<T> bus = this.f7880g;
        if (bus != null) {
            return bus;
        }
        bus = this.f7876c.m11040a(this.f7878e, this.f7877d);
        this.f7880g = bus;
        return bus;
    }

    /* renamed from: a */
    public static but m11349a(bvz<?> bvz, Object obj) {
        return new C1544b(obj, bvz, false, null);
    }

    /* renamed from: b */
    public static but m11351b(bvz<?> bvz, Object obj) {
        return new C1544b(obj, bvz, bvz.m11005b() == bvz.m11004a(), null);
    }
}
