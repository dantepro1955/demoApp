package com.p000;

import android.os.Looper;
import java.util.Hashtable;
import p000.rl.C4177b;

/* renamed from: dab */
public class dab implements rl {
    /* renamed from: a */
    private static final rk f20888a = dnn.m28258a(dab.class);
    /* renamed from: b */
    private final czw f20889b = new czw();
    /* renamed from: c */
    private final Thread f20890c = new Thread(new C47251(this));
    /* renamed from: d */
    private final Hashtable<sb, C4729b> f20891d = new Hashtable();

    /* renamed from: dab$1 */
    class C47251 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ dab f20881a;

        C47251(dab dab) {
            this.f20881a = dab;
        }

        public final void run() {
            Looper.prepare();
            this.f20881a.f20889b.m25912a();
            Looper.loop();
        }
    }

    /* renamed from: dab$2 */
    class C47262 implements Runnable {
        /* renamed from: a */
        private /* synthetic */ C4728a f20882a;

        C47262(C4728a c4728a) {
            this.f20882a = c4728a;
        }

        public final void run() {
            if (dab.f20888a.mo4274a()) {
                dab.f20888a.mo4272a((Object) "Executing Message");
            }
            this.f20882a.f20884b.mo3863a(this.f20882a.f20885c, this.f20882a.f20883a);
            if (dab.f20888a.mo4274a()) {
                dab.f20888a.mo4272a((Object) "Done Executing Message");
            }
        }
    }

    /* renamed from: dab$3 */
    class C47273 implements Runnable {
        C47273() {
        }

        public final void run() {
            Looper.myLooper().quit();
        }
    }

    /* renamed from: dab$a */
    public static class C4728a {
        /* renamed from: a */
        public Thread f20883a;
        /* renamed from: b */
        public C4177b f20884b;
        /* renamed from: c */
        public Object f20885c;

        public C4728a(Object obj, C4177b c4177b) {
            this.f20885c = obj;
            this.f20884b = c4177b;
        }
    }

    /* renamed from: dab$b */
    public class C4729b implements Runnable {
        /* renamed from: a */
        private sb f20886a;
        /* renamed from: b */
        private /* synthetic */ dab f20887b;

        public C4729b(dab dab, sb sbVar) {
            this.f20887b = dab;
            this.f20886a = sbVar;
            dab.f20891d.put(sbVar, this);
        }

        public final void run() {
            C4729b c4729b = (C4729b) this.f20887b.f20891d.remove(this.f20886a);
            if (dab.f20888a.mo4276b()) {
                dab.f20888a.mo4275b("TIMER run() _pendingTimerTasks.size():" + this.f20887b.f20891d.size() + ", this:" + this + ", r:" + c4729b);
            }
            if (c4729b != null) {
                c4729b.f20886a.run();
            }
        }
    }

    public dab() {
        this.f20890c.start();
    }

    /* renamed from: a */
    public final void mo4285a(Object obj, C4177b c4177b, Object obj2) {
        C4728a c4728a = new C4728a(obj, c4177b);
        c4728a.f20883a = (Thread) obj2;
        this.f20889b.post(new C47262(c4728a));
    }

    /* renamed from: a */
    public final void mo4286a(sb sbVar, long j) {
        Runnable c4729b = new C4729b(this, sbVar);
        if (f20888a.mo4276b()) {
            f20888a.mo4275b("TIMER _handler.postDelayed(" + c4729b + ")");
        }
        this.f20889b.postDelayed(c4729b, j);
    }

    /* renamed from: a */
    public final boolean mo4287a(sb sbVar) {
        C4729b c4729b = (C4729b) this.f20891d.remove(sbVar);
        if (f20888a.mo4276b()) {
            f20888a.mo4275b("TIMER cancelTask() _pendingTimerTasks.size():" + this.f20891d.size());
        }
        if (c4729b != null) {
            if (f20888a.mo4276b()) {
                f20888a.mo4275b("TIMER _handler.removeCallbacks(" + c4729b + ")");
            }
            this.f20889b.removeCallbacks(c4729b);
        }
        return c4729b != null;
    }

    /* renamed from: a */
    public final Object[] mo4288a() {
        return new Object[]{Thread.currentThread()};
    }

    /* renamed from: b */
    public final Object mo4289b() {
        return Thread.currentThread();
    }

    /* renamed from: c */
    public final void mo4290c() {
        this.f20889b.post(new C47273());
    }
}
