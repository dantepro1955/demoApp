package com.p000;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ModernAsyncTask */
/* renamed from: fh */
abstract class fh<Params, Progress, Result> {
    /* renamed from: a */
    private static final ThreadFactory f23656a = new C53121();
    /* renamed from: b */
    private static final BlockingQueue<Runnable> f23657b = new LinkedBlockingQueue(10);
    /* renamed from: c */
    public static final Executor f23658c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f23657b, f23656a);
    /* renamed from: d */
    private static C5318b f23659d;
    /* renamed from: e */
    private static volatile Executor f23660e = f23658c;
    /* renamed from: f */
    private final C5313d<Params, Result> f23661f = new C53142(this);
    /* renamed from: g */
    private final FutureTask<Result> f23662g = new FutureTask<Result>(this, this.f23661f) {
        /* renamed from: a */
        final /* synthetic */ fh f23702a;

        protected void done() {
            try {
                this.f23702a.m30097c(get());
            } catch (Throwable e) {
                Log.w("AsyncTask", e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException e3) {
                this.f23702a.m30097c(null);
            } catch (Throwable e4) {
                RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", e4);
            }
        }
    };
    /* renamed from: h */
    private volatile C5319c f23663h = C5319c.PENDING;
    /* renamed from: i */
    private final AtomicBoolean f23664i = new AtomicBoolean();
    /* renamed from: j */
    private final AtomicBoolean f23665j = new AtomicBoolean();

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$1 */
    static class C53121 implements ThreadFactory {
        /* renamed from: a */
        private final AtomicInteger f23699a = new AtomicInteger(1);

        C53121() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f23699a.getAndIncrement());
        }
    }

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$d */
    static abstract class C5313d<Params, Result> implements Callable<Result> {
        /* renamed from: b */
        Params[] f23700b;

        C5313d() {
        }
    }

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$2 */
    class C53142 extends C5313d<Params, Result> {
        /* renamed from: a */
        final /* synthetic */ fh f23701a;

        C53142(fh fhVar) {
            this.f23701a = fhVar;
        }

        public Result call() throws Exception {
            this.f23701a.f23665j.set(true);
            Object obj = null;
            try {
                Process.setThreadPriority(10);
                obj = this.f23701a.mo4704a(this.b);
                Binder.flushPendingCommands();
                this.f23701a.m30099d(obj);
                return obj;
            } catch (Throwable th) {
                this.f23701a.m30099d(obj);
            }
        }
    }

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$a */
    static class C5317a<Data> {
        /* renamed from: a */
        final fh f23704a;
        /* renamed from: b */
        final Data[] f23705b;

        C5317a(fh fhVar, Data... dataArr) {
            this.f23704a = fhVar;
            this.f23705b = dataArr;
        }
    }

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$b */
    static class C5318b extends Handler {
        public C5318b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C5317a c5317a = (C5317a) message.obj;
            switch (message.what) {
                case 1:
                    c5317a.f23704a.m30100e(c5317a.f23705b[0]);
                    return;
                case 2:
                    c5317a.f23704a.m30096b(c5317a.f23705b);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ModernAsyncTask */
    /* renamed from: fh$c */
    public enum C5319c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: a */
    protected abstract Result mo4704a(Params... paramsArr);

    /* renamed from: d */
    private static Handler m30088d() {
        Handler handler;
        synchronized (fh.class) {
            if (f23659d == null) {
                f23659d = new C5318b();
            }
            handler = f23659d;
        }
        return handler;
    }

    /* renamed from: c */
    void m30097c(Result result) {
        if (!this.f23665j.get()) {
            m30099d(result);
        }
    }

    /* renamed from: d */
    Result m30099d(Result result) {
        fh.m30088d().obtainMessage(1, new C5317a(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: a */
    protected void m30091a() {
    }

    /* renamed from: a */
    protected void mo4705a(Result result) {
    }

    /* renamed from: b */
    protected void m30096b(Progress... progressArr) {
    }

    /* renamed from: b */
    protected void mo4706b(Result result) {
        m30094b();
    }

    /* renamed from: b */
    protected void m30094b() {
    }

    /* renamed from: c */
    public final boolean m30098c() {
        return this.f23664i.get();
    }

    /* renamed from: a */
    public final boolean m30093a(boolean z) {
        this.f23664i.set(true);
        return this.f23662g.cancel(z);
    }

    /* renamed from: a */
    public final fh<Params, Progress, Result> m30089a(Executor executor, Params... paramsArr) {
        if (this.f23663h != C5319c.PENDING) {
            switch (this.f23663h) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f23663h = C5319c.RUNNING;
        m30091a();
        this.f23661f.f23700b = paramsArr;
        executor.execute(this.f23662g);
        return this;
    }

    /* renamed from: e */
    void m30100e(Result result) {
        if (m30098c()) {
            mo4706b((Object) result);
        } else {
            mo4705a((Object) result);
        }
        this.f23663h = C5319c.FINISHED;
    }
}
