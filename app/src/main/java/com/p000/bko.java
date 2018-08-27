package com.p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

@bhd
/* renamed from: bko */
public class bko {
    /* renamed from: a */
    private HandlerThread f6774a = null;
    /* renamed from: b */
    private Handler f6775b = null;
    /* renamed from: c */
    private int f6776c = 0;
    /* renamed from: d */
    private final Object f6777d = new Object();

    /* renamed from: bko$1 */
    class C13121 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bko f6773a;

        C13121(bko bko) {
            this.f6773a = bko;
        }

        public void run() {
            synchronized (this.f6773a.f6777d) {
                bkc.m9012a("Suspending the looper thread");
                while (this.f6773a.f6776c == 0) {
                    try {
                        this.f6773a.f6777d.wait();
                        bkc.m9012a("Looper thread resumed");
                    } catch (InterruptedException e) {
                        bkc.m9012a("Looper thread interrupted.");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Looper m9258a() {
        Looper looper;
        synchronized (this.f6777d) {
            if (this.f6776c != 0) {
                aoi.m4680a(this.f6774a, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f6774a == null) {
                bkc.m9012a("Starting the looper thread.");
                this.f6774a = new HandlerThread("LooperProvider");
                this.f6774a.start();
                this.f6775b = new Handler(this.f6774a.getLooper());
                bkc.m9012a("Looper thread started.");
            } else {
                bkc.m9012a("Resuming the looper thread");
                this.f6777d.notifyAll();
            }
            this.f6776c++;
            looper = this.f6774a.getLooper();
        }
        return looper;
    }

    /* renamed from: b */
    public void m9259b() {
        synchronized (this.f6777d) {
            aoi.m4689b(this.f6776c > 0, "Invalid state: release() called more times than expected.");
            int i = this.f6776c - 1;
            this.f6776c = i;
            if (i == 0) {
                this.f6775b.post(new C13121(this));
            }
        }
    }
}
