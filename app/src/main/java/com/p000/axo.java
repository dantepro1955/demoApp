package com.p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;
import p000.avg.C0846a;

/* renamed from: axo */
public class axo extends Thread {
    /* renamed from: a */
    private static final boolean f4901a = bnt.f7178b;
    /* renamed from: b */
    private final BlockingQueue<bfx<?>> f4902b;
    /* renamed from: c */
    private final BlockingQueue<bfx<?>> f4903c;
    /* renamed from: d */
    private final avg f4904d;
    /* renamed from: e */
    private final biu f4905e;
    /* renamed from: f */
    private volatile boolean f4906f = false;

    public axo(BlockingQueue<bfx<?>> blockingQueue, BlockingQueue<bfx<?>> blockingQueue2, avg avg, biu biu) {
        this.f4902b = blockingQueue;
        this.f4903c = blockingQueue2;
        this.f4904d = avg;
        this.f4905e = biu;
    }

    /* renamed from: a */
    public void m6369a() {
        this.f4906f = true;
        interrupt();
    }

    public void run() {
        if (f4901a) {
            bnt.m10019a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f4904d.mo1381a();
        while (true) {
            try {
                final bfx bfx = (bfx) this.f4902b.take();
                bfx.m5545b("cache-queue-take");
                C0846a a = this.f4904d.mo1380a(bfx.m5548d());
                if (a == null) {
                    bfx.m5545b("cache-miss");
                    this.f4903c.put(bfx);
                } else if (a.m5984a()) {
                    bfx.m5545b("cache-hit-expired");
                    bfx.m5537a(a);
                    this.f4903c.put(bfx);
                } else {
                    bfx.m5545b("cache-hit");
                    bht a2 = bfx.mo711a(new bdv(a.f4658a, a.f4664g));
                    bfx.m5545b("cache-hit-parsed");
                    if (a.m5985b()) {
                        bfx.m5545b("cache-hit-refresh-needed");
                        bfx.m5537a(a);
                        a2.f6284d = true;
                        this.f4905e.mo891a(bfx, a2, new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ axo f4900b;

                            public void run() {
                                try {
                                    this.f4900b.f4903c.put(bfx);
                                } catch (InterruptedException e) {
                                }
                            }
                        });
                    } else {
                        this.f4905e.mo890a(bfx, a2);
                    }
                }
            } catch (InterruptedException e) {
                if (this.f4906f) {
                    return;
                }
            }
        }
    }
}
