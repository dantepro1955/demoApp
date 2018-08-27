package com.p000;

/* compiled from: UtilityFunctions */
/* renamed from: dxb */
public final class dxb {

    /* compiled from: UtilityFunctions */
    /* renamed from: dxb$a */
    enum C5228a implements duo<Object, Boolean> {
        INSTANCE;

        /* renamed from: b */
        public Boolean m29733b(Object obj) {
            return Boolean.valueOf(true);
        }
    }

    /* compiled from: UtilityFunctions */
    /* renamed from: dxb$b */
    enum C5229b implements duo<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public Object mo4103a(Object obj) {
            return obj;
        }
    }

    /* renamed from: a */
    public static <T> duo<? super T, Boolean> m29735a() {
        return C5228a.INSTANCE;
    }

    /* renamed from: b */
    public static <T> duo<T, T> m29736b() {
        return C5229b.INSTANCE;
    }
}
