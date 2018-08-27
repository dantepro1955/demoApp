package com.p000;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: Loader */
/* renamed from: agx */
public final class agx {
    /* renamed from: a */
    private final ExecutorService f1450a;
    /* renamed from: b */
    private C0172b f1451b;
    /* renamed from: c */
    private boolean f1452c;

    /* compiled from: Loader */
    /* renamed from: agx$c */
    public interface C0123c {
        /* renamed from: a */
        void mo128a();

        /* renamed from: b */
        boolean mo129b();

        /* renamed from: c */
        void mo130c() throws IOException, InterruptedException;
    }

    /* compiled from: Loader */
    /* renamed from: agx$a */
    public interface C0128a {
        /* renamed from: a */
        void mo137a(C0123c c0123c);

        /* renamed from: a */
        void mo138a(C0123c c0123c, IOException iOException);

        /* renamed from: b */
        void mo143b(C0123c c0123c);
    }

    @SuppressLint({"HandlerLeak"})
    /* compiled from: Loader */
    /* renamed from: agx$b */
    final class C0172b extends Handler implements Runnable {
        /* renamed from: a */
        final /* synthetic */ agx f1446a;
        /* renamed from: b */
        private final C0123c f1447b;
        /* renamed from: c */
        private final C0128a f1448c;
        /* renamed from: d */
        private volatile Thread f1449d;

        public C0172b(agx agx, Looper looper, C0123c c0123c, C0128a c0128a) {
            this.f1446a = agx;
            super(looper);
            this.f1447b = c0123c;
            this.f1448c = c0128a;
        }

        /* renamed from: a */
        public void m1492a() {
            this.f1447b.mo128a();
            if (this.f1449d != null) {
                this.f1449d.interrupt();
            }
        }

        public void run() {
            try {
                this.f1449d = Thread.currentThread();
                if (!this.f1447b.mo129b()) {
                    ahq.m1589a(this.f1447b.getClass().getSimpleName() + ".load()");
                    this.f1447b.mo130c();
                    ahq.m1588a();
                }
                sendEmptyMessage(0);
            } catch (IOException e) {
                obtainMessage(1, e).sendToTarget();
            } catch (InterruptedException e2) {
                ahb.m1516b(this.f1447b.mo129b());
                sendEmptyMessage(0);
            } catch (Throwable e3) {
                Log.e("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(1, new C0173d(e3)).sendToTarget();
            } catch (Throwable e32) {
                Log.e("LoadTask", "Unexpected error loading stream", e32);
                obtainMessage(2, e32).sendToTarget();
                throw e32;
            }
        }

        public void handleMessage(Message message) {
            if (message.what == 2) {
                throw ((Error) message.obj);
            }
            m1491b();
            if (this.f1447b.mo129b()) {
                this.f1448c.mo143b(this.f1447b);
                return;
            }
            switch (message.what) {
                case 0:
                    this.f1448c.mo137a(this.f1447b);
                    return;
                case 1:
                    this.f1448c.mo138a(this.f1447b, (IOException) message.obj);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: b */
        private void m1491b() {
            this.f1446a.f1452c = false;
            this.f1446a.f1451b = null;
        }
    }

    /* compiled from: Loader */
    /* renamed from: agx$d */
    public static final class C0173d extends IOException {
        public C0173d(Exception exception) {
            super("Unexpected " + exception.getClass().getSimpleName() + ": " + exception.getMessage(), exception);
        }
    }

    public agx(String str) {
        this.f1450a = ahr.m1597a(str);
    }

    /* renamed from: a */
    public void m1495a(C0123c c0123c, C0128a c0128a) {
        Looper myLooper = Looper.myLooper();
        ahb.m1516b(myLooper != null);
        m1496a(myLooper, c0123c, c0128a);
    }

    /* renamed from: a */
    public void m1496a(Looper looper, C0123c c0123c, C0128a c0128a) {
        ahb.m1516b(!this.f1452c);
        this.f1452c = true;
        this.f1451b = new C0172b(this, looper, c0123c, c0128a);
        this.f1450a.submit(this.f1451b);
    }

    /* renamed from: a */
    public boolean m1497a() {
        return this.f1452c;
    }

    /* renamed from: b */
    public void m1498b() {
        ahb.m1516b(this.f1452c);
        this.f1451b.m1492a();
    }

    /* renamed from: c */
    public void m1499c() {
        if (this.f1452c) {
            m1498b();
        }
        this.f1450a.shutdown();
    }
}
