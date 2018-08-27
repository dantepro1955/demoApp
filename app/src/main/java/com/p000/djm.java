package com.p000;

/* compiled from: GsonUtil */
/* renamed from: djm */
public class djm {
    /* renamed from: a */
    private static bub f21806a;
    /* renamed from: b */
    private static bub f21807b;

    /* renamed from: a */
    public static void m27595a(bub bub) {
        f21806a = bub;
    }

    /* renamed from: a */
    public static <T> T m27592a(String str, Class<T> cls) {
        djm.m27594a();
        try {
            return f21806a.a(str, cls);
        } catch (buq e) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m27593a(Object obj) {
        djm.m27594a();
        return f21806a.a(obj);
    }

    /* renamed from: a */
    public static void m27594a() {
        if (f21807b == null) {
            f21807b = new buc().a();
        }
        if (f21806a == null) {
            f21806a = f21807b;
        }
    }
}
