package com.p000;

import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PendingRunnableManager */
/* renamed from: cti */
public class cti {
    /* renamed from: a */
    public static Object f20185a = new Object();
    /* renamed from: b */
    public static long f20186b = 1000;
    /* renamed from: c */
    private CopyOnWriteArrayList<cth> f20187c = new CopyOnWriteArrayList();

    /* renamed from: a */
    public synchronized void m24877a(cth cth) {
        synchronized (this.f20187c) {
            this.f20187c.add(cth);
        }
    }

    /* renamed from: a */
    public synchronized void m24876a(Intent intent) {
        long longExtra = intent.getLongExtra("callback_key", -1);
        synchronized (this.f20187c) {
            Iterator it = this.f20187c.iterator();
            while (it.hasNext()) {
                cth cth = (cth) it.next();
                if (cth.m22517c() == longExtra && !cth.m22516b()) {
                    cth.m22514a(intent);
                    cth.run();
                    cth.m22515a(true);
                }
            }
        }
        m24875b();
    }

    /* renamed from: b */
    private void m24875b() {
        synchronized (this.f20187c) {
            for (int size = this.f20187c.size() - 1; size >= 0; size--) {
                if (((cth) this.f20187c.get(size)).m22516b()) {
                    this.f20187c.remove(size);
                }
            }
        }
    }

    /* renamed from: a */
    public static long m24874a() {
        synchronized (f20185a) {
            f20186b++;
        }
        return f20186b;
    }
}
