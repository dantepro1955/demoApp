package com.p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TestUtils */
/* renamed from: cqx */
public final class cqx {
    /* renamed from: a */
    private static AtomicBoolean f19996a;

    /* renamed from: a */
    public static synchronized boolean m24525a() {
        boolean z;
        synchronized (cqx.class) {
            if (f19996a == null) {
                z = false;
                try {
                    Class.forName("android.support.test.espresso.Espresso");
                    z = true;
                } catch (ClassNotFoundException e) {
                }
                f19996a = new AtomicBoolean(z);
            }
            z = f19996a.get();
        }
        return z;
    }
}
