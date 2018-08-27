package com.p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p000.dts.C5094a;

/* compiled from: LooperScheduler */
/* renamed from: dub */
class dub extends dts {
    /* renamed from: b */
    private final Handler f22961b;

    /* compiled from: LooperScheduler */
    /* renamed from: dub$a */
    static class C5104a extends C5094a {
        /* renamed from: a */
        private final Handler f22955a;
        /* renamed from: b */
        private final dtz f22956b = dty.m29360a().m29361b();
        /* renamed from: c */
        private volatile boolean f22957c;

        C5104a(Handler handler) {
            this.f22955a = handler;
        }

        public void unsubscribe() {
            this.f22957c = true;
            this.f22955a.removeCallbacksAndMessages(this);
        }

        public boolean isUnsubscribed() {
            return this.f22957c;
        }

        /* renamed from: a */
        public dtw mo4645a(duk duk, long j, TimeUnit timeUnit) {
            if (this.f22957c) {
                return dyw.m29892a();
            }
            dtw c5105b = new C5105b(this.f22956b.m29363a(duk), this.f22955a);
            Message obtain = Message.obtain(this.f22955a, c5105b);
            obtain.obj = this;
            this.f22955a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f22957c) {
                return c5105b;
            }
            this.f22955a.removeCallbacks(c5105b);
            return dyw.m29892a();
        }

        /* renamed from: a */
        public dtw mo4644a(duk duk) {
            return mo4645a(duk, 0, TimeUnit.MILLISECONDS);
        }
    }

    /* compiled from: LooperScheduler */
    /* renamed from: dub$b */
    static final class C5105b implements dtw, Runnable {
        /* renamed from: a */
        private final duk f22958a;
        /* renamed from: b */
        private final Handler f22959b;
        /* renamed from: c */
        private volatile boolean f22960c;

        C5105b(duk duk, Handler handler) {
            this.f22958a = duk;
            this.f22959b = handler;
        }

        public void run() {
            try {
                this.f22958a.mo4643a();
            } catch (Throwable th) {
                Throwable th2;
                Throwable th3 = th2;
                if (th3 instanceof duh) {
                    th2 = new IllegalStateException("Exception thrown on Scheduler.Worker thread. Add `onError` handling.", th3);
                } else {
                    th2 = new IllegalStateException("Fatal Exception thrown on Scheduler.Worker thread.", th3);
                }
                dyj.a().b().a(th2);
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }

        public void unsubscribe() {
            this.f22960c = true;
            this.f22959b.removeCallbacks(this);
        }

        public boolean isUnsubscribed() {
            return this.f22960c;
        }
    }

    dub(Looper looper) {
        this.f22961b = new Handler(looper);
    }

    public C5094a createWorker() {
        return new C5104a(this.f22961b);
    }
}
