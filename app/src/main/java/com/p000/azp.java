package com.p000;

@bhd
/* renamed from: azp */
public class azp {
    /* renamed from: a */
    private static final Object f5183a = new Object();
    /* renamed from: b */
    private static azp f5184b;
    /* renamed from: c */
    private final bkx f5185c = new bkx();
    /* renamed from: d */
    private final azo f5186d = new azo(new azi(), new azh(), new bal(), new bcp(), new bis(), new bgi(), new bfv());

    static {
        azp.m6790a(new azp());
    }

    protected azp() {
    }

    /* renamed from: a */
    public static bkx m6789a() {
        return azp.m6792c().f5185c;
    }

    /* renamed from: a */
    protected static void m6790a(azp azp) {
        synchronized (f5183a) {
            f5184b = azp;
        }
    }

    /* renamed from: b */
    public static azo m6791b() {
        return azp.m6792c().f5186d;
    }

    /* renamed from: c */
    private static azp m6792c() {
        azp azp;
        synchronized (f5183a) {
            azp = f5184b;
        }
        return azp;
    }
}
