package com.p000;

import java.util.List;

/* compiled from: Query */
/* renamed from: dop */
public class dop<T> extends dol<T> {
    /* renamed from: h */
    private final C5027a<T> f22441h;

    /* compiled from: Query */
    /* renamed from: dop$a */
    static final class C5027a<T2> extends dok<T2, dop<T2>> {
        /* renamed from: e */
        private final int f22439e;
        /* renamed from: f */
        private final int f22440f;

        /* renamed from: b */
        protected /* synthetic */ doj mo4503b() {
            return m28460d();
        }

        C5027a(dnt<T2, ?> dnt, String str, String[] strArr, int i, int i2) {
            super(dnt, str, strArr);
            this.f22439e = i;
            this.f22440f = i2;
        }

        /* renamed from: d */
        protected dop<T2> m28460d() {
            return new dop(this, this.b, this.a, (String[]) this.c.clone(), this.f22439e, this.f22440f);
        }
    }

    /* renamed from: a */
    public /* synthetic */ doj mo4502a(int i, Object obj) {
        return m28466c(i, obj);
    }

    /* renamed from: b */
    public /* synthetic */ dol mo4504b(int i, Object obj) {
        return m28466c(i, obj);
    }

    /* renamed from: a */
    public static <T2> dop<T2> m28461a(dnt<T2, ?> dnt, String str, Object[] objArr) {
        return dop.m28462a(dnt, str, objArr, -1, -1);
    }

    /* renamed from: a */
    static <T2> dop<T2> m28462a(dnt<T2, ?> dnt, String str, Object[] objArr, int i, int i2) {
        return (dop) new C5027a(dnt, str, doj.m28438a(objArr), i, i2).m28441a();
    }

    private dop(C5027a<T> c5027a, dnt<T, ?> dnt, String str, String[] strArr, int i, int i2) {
        super(dnt, str, strArr, i, i2);
        this.f22441h = c5027a;
    }

    /* renamed from: b */
    public dop<T> m28465b() {
        return (dop) this.f22441h.m28442a(this);
    }

    /* renamed from: c */
    public List<T> m28467c() {
        m28440a();
        return this.b.m28326a(this.a.getDatabase().rawQuery(this.c, this.d));
    }

    /* renamed from: c */
    public dop<T> m28466c(int i, Object obj) {
        return (dop) super.mo4504b(i, obj);
    }
}
