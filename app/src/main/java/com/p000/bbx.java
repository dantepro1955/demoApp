package com.p000;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: bbx */
public class bbx extends Thread {
    /* renamed from: a */
    private final BlockingQueue<bfx<?>> f5530a;
    /* renamed from: b */
    private final bax f5531b;
    /* renamed from: c */
    private final avg f5532c;
    /* renamed from: d */
    private final biu f5533d;
    /* renamed from: e */
    private volatile boolean f5534e = false;

    public bbx(BlockingQueue<bfx<?>> blockingQueue, bax bax, avg avg, biu biu) {
        this.f5530a = blockingQueue;
        this.f5531b = bax;
        this.f5532c = avg;
        this.f5533d = biu;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m7354a(bfx<?> bfx) {
        int i = VERSION.SDK_INT;
        TrafficStats.setThreadStatsTag(bfx.m5543b());
    }

    /* renamed from: a */
    private void m7355a(bfx<?> bfx, bmt bmt) {
        this.f5533d.mo892a((bfx) bfx, bfx.m5541a(bmt));
    }

    /* renamed from: a */
    public void m7356a() {
        this.f5534e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                bfx bfx = (bfx) this.f5530a.take();
                try {
                    bfx.m5545b("network-queue-take");
                    m7354a(bfx);
                    bdv a = this.f5531b.mo1364a(bfx);
                    bfx.m5545b("network-http-complete");
                    if (a.f5710d && bfx.m5561q()) {
                        bfx.m5547c("not-modified");
                    } else {
                        bht a2 = bfx.mo711a(a);
                        bfx.m5545b("network-parse-complete");
                        if (bfx.m5556l() && a2.f6282b != null) {
                            this.f5532c.mo1382a(bfx.m5548d(), a2.f6282b);
                            bfx.m5545b("network-cache-written");
                        }
                        bfx.m5560p();
                        this.f5533d.mo890a(bfx, a2);
                    }
                } catch (bmt e) {
                    e.m5063a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    m7355a(bfx, e);
                } catch (Throwable e2) {
                    bnt.m10020a(e2, "Unhandled exception %s", e2.toString());
                    bmt bmt = new bmt(e2);
                    bmt.m5063a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f5533d.mo892a(bfx, bmt);
                }
            } catch (InterruptedException e3) {
                if (this.f5534e) {
                    return;
                }
            }
        }
    }
}
