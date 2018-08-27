package com.p000;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: RockDownloaderPool */
/* renamed from: dhv */
public class dhv {
    /* renamed from: a */
    public static final TimeUnit f20177a = TimeUnit.SECONDS;
    /* renamed from: b */
    private final LinkedBlockingQueue<Runnable> f20178b = new LinkedBlockingQueue();
    /* renamed from: c */
    private ThreadPoolExecutor f20179c;
    /* renamed from: d */
    private int f20180d;
    /* renamed from: e */
    private int f20181e;

    public dhv(int i, int i2) {
        this.f20181e = i2;
        this.f20180d = i;
        this.f20179c = new ThreadPoolExecutor(i, i2, 60, f20177a, this.f20178b);
    }

    /* renamed from: d */
    public ThreadPoolExecutor m24867d() {
        return this.f20179c;
    }

    /* renamed from: e */
    public boolean m24868e() {
        return this.f20178b.isEmpty();
    }

    /* renamed from: f */
    public void m24869f() {
        this.f20179c.shutdownNow();
        this.f20179c = new ThreadPoolExecutor(this.f20180d, this.f20181e, 60, f20177a, this.f20178b);
    }
}
