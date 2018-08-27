package com.p000;

/* compiled from: SegmentPool */
/* renamed from: dse */
final class dse {
    /* renamed from: a */
    static dsd f22799a;
    /* renamed from: b */
    static long f22800b;

    private dse() {
    }

    /* renamed from: a */
    static dsd m29110a() {
        synchronized (dse.class) {
            if (f22799a != null) {
                dsd dsd = f22799a;
                f22799a = dsd.f22797f;
                dsd.f22797f = null;
                f22800b -= 8192;
                return dsd;
            }
            return new dsd();
        }
    }

    /* renamed from: a */
    static void m29111a(dsd dsd) {
        if (dsd.f22797f != null || dsd.f22798g != null) {
            throw new IllegalArgumentException();
        } else if (!dsd.f22795d) {
            synchronized (dse.class) {
                if (f22800b + 8192 > 65536) {
                    return;
                }
                f22800b += 8192;
                dsd.f22797f = f22799a;
                dsd.f22794c = 0;
                dsd.f22793b = 0;
                f22799a = dsd;
            }
        }
    }
}
