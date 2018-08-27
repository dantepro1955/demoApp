package com.p000;

/* compiled from: AbstractQueryWithLimit */
/* renamed from: dol */
abstract class dol<T> extends doj<T> {
    /* renamed from: f */
    protected final int f22429f;
    /* renamed from: g */
    protected final int f22430g;

    /* renamed from: a */
    public /* synthetic */ doj mo4502a(int i, Object obj) {
        return mo4504b(i, obj);
    }

    protected dol(dnt<T, ?> dnt, String str, String[] strArr, int i, int i2) {
        super(dnt, str, strArr);
        this.f22429f = i;
        this.f22430g = i2;
    }

    /* renamed from: b */
    public dol<T> mo4504b(int i, Object obj) {
        if (i < 0 || (i != this.f22429f && i != this.f22430g)) {
            return (dol) super.mo4502a(i, obj);
        }
        throw new IllegalArgumentException("Illegal parameter index: " + i);
    }
}
