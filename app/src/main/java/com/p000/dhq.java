package com.p000;

import java.util.HashSet;

/* compiled from: SimplePQRunnable */
/* renamed from: dhq */
public abstract class dhq implements Runnable {
    /* renamed from: a */
    private dho f21646a;
    /* renamed from: b */
    private HashSet<String> f21647b;

    /* renamed from: a */
    public abstract void m27309a(dhp dhp);

    /* renamed from: a */
    public abstract void m27310a(dhp dhp, Exception exception);

    public dhq(dho dho, HashSet<String> hashSet) {
        this.f21646a = dho;
        this.f21647b = hashSet;
    }

    public void run() {
        while (true) {
            dhp a = this.f21646a.m27304a();
            if (a != null) {
                if (!this.f21647b.contains(a.mo4413b())) {
                    try {
                        synchronized (this.f21647b) {
                            this.f21647b.add(a.mo4413b());
                        }
                        m27309a(a);
                        synchronized (this.f21647b) {
                            this.f21647b.remove(a.mo4413b());
                        }
                    } catch (Exception e) {
                        try {
                            m27310a(a, e);
                            synchronized (this.f21647b) {
                                this.f21647b.remove(a.mo4413b());
                            }
                        } catch (Throwable th) {
                            synchronized (this.f21647b) {
                                this.f21647b.remove(a.mo4413b());
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
    }
}
