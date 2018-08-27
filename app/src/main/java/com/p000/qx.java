package com.p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: qx */
public final class qx extends Thread {
    /* renamed from: a */
    private Handler f25262a = null;
    /* renamed from: b */
    private final ArrayList<C5698a> f25263b = new ArrayList();
    /* renamed from: c */
    private final Object f25264c;

    /* renamed from: qx$a */
    static class C5698a {
        /* renamed from: a */
        public final Runnable f25260a;
        /* renamed from: b */
        public final int f25261b;

        public C5698a(Runnable runnable, int i) {
            this.f25260a = runnable;
            this.f25261b = i;
        }
    }

    public qx(Object obj) {
        this.f25264c = obj;
        start();
    }

    /* renamed from: a */
    public static void m33937a() {
        Looper.myLooper().quit();
    }

    /* renamed from: a */
    public final void m33938a(Runnable runnable, int i) {
        if (this.f25262a == null) {
            this.f25263b.add(new C5698a(runnable, i));
        } else if (i > 0) {
            this.f25262a.postDelayed(runnable, (long) i);
        } else {
            this.f25262a.post(runnable);
        }
    }

    public final void run() {
        Looper.prepare();
        synchronized (this.f25264c) {
            this.f25262a = new Handler();
            int size = this.f25263b.size();
            for (int i = 0; i < size; i++) {
                C5698a c5698a = (C5698a) this.f25263b.get(i);
                if (c5698a.f25261b > 0) {
                    this.f25262a.postDelayed(c5698a.f25260a, (long) c5698a.f25261b);
                } else {
                    this.f25262a.post(c5698a.f25260a);
                }
            }
            this.f25263b.clear();
        }
        Looper.loop();
    }
}
