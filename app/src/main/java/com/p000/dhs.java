package com.p000;

import java.util.HashSet;

/* compiled from: LazyHttpDownloaderPool */
/* renamed from: dhs */
public class dhs extends dhv {
    /* renamed from: b */
    private dho f21666b;
    /* renamed from: c */
    private dhu f21667c;
    /* renamed from: d */
    private HashSet<String> f21668d;
    /* renamed from: e */
    private int f21669e;
    /* renamed from: f */
    private boolean f21670f = false;

    /* compiled from: LazyHttpDownloaderPool */
    /* renamed from: dhs$a */
    static class C4912a implements Runnable {
        /* renamed from: a */
        private dho f21658a;
        /* renamed from: b */
        private dhr f21659b;
        /* renamed from: c */
        private HashSet<String> f21660c;

        C4912a(dho dho, HashSet<String> hashSet, dhu dhu, boolean z) {
            this.f21658a = dho;
            this.f21660c = hashSet;
            this.f21659b = new dhr(dhu);
            this.f21659b.m27321a(z);
        }

        public void run() {
            while (true) {
                C4913b c4913b = (C4913b) this.f21658a.m27304a();
                if (c4913b != null) {
                    if (!this.f21660c.contains(c4913b.f21661a)) {
                        try {
                            synchronized (this.f21660c) {
                                this.f21660c.add(c4913b.f21661a);
                            }
                            this.f21659b.m27320a(c4913b.f21663c, c4913b.f21661a, c4913b.f21665e, c4913b.f21662b);
                            synchronized (this.f21660c) {
                                this.f21660c.remove(c4913b.f21661a);
                            }
                        } catch (Exception e) {
                            try {
                                this.f21659b.m27316a(c4913b.f21663c, e.getMessage());
                                synchronized (this.f21660c) {
                                    this.f21660c.remove(c4913b.f21661a);
                                }
                            } catch (Throwable th) {
                                synchronized (this.f21660c) {
                                    this.f21660c.remove(c4913b.f21661a);
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

    /* compiled from: LazyHttpDownloaderPool */
    /* renamed from: dhs$b */
    static class C4913b implements dhp {
        /* renamed from: a */
        String f21661a;
        /* renamed from: b */
        String f21662b;
        /* renamed from: c */
        long f21663c;
        /* renamed from: d */
        int f21664d;
        /* renamed from: e */
        dft f21665e;

        public C4913b(long j, String str, dft dft, String str2, int i) {
            this.f21661a = str;
            this.f21663c = j;
            this.f21664d = i;
            this.f21665e = dft;
            this.f21662b = str2;
        }

        /* renamed from: a */
        public int mo4412a() {
            return this.f21664d;
        }

        /* renamed from: b */
        public String mo4413b() {
            return this.f21661a;
        }
    }

    public dhs(int i, int i2, dhu dhu) {
        super(i, i2);
        this.f21669e = i2;
        this.f21666b = new dho();
        this.f21667c = dhu;
        this.f21668d = new HashSet();
    }

    /* renamed from: a */
    public void m27326a(boolean z) {
        this.f21670f = z;
    }

    /* renamed from: a */
    public void m27324a(long j, String str, dft dft, String str2, int i) {
        this.f21666b.m27305a(new C4913b(j, str, dft, str2, i));
        if (m24867d().getQueue().size() < this.f21669e + 2) {
            m24867d().execute(new C4912a(this.f21666b, this.f21668d, this.f21667c, this.f21670f));
        }
    }

    /* renamed from: a */
    public void m27325a(String str) {
        this.f21666b.m27306b(new C4913b(-1, str, null, null, 0));
    }

    /* renamed from: b */
    public boolean m27327b(String str) {
        return this.f21668d.contains(str);
    }
}
