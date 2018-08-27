package com.p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: alq */
public final class alq {
    /* renamed from: a */
    private static volatile alq f1993a;
    /* renamed from: b */
    private final Context f1994b;
    /* renamed from: c */
    private final List<Object> f1995c = new CopyOnWriteArrayList();
    /* renamed from: d */
    private final alm f1996d = new alm();
    /* renamed from: e */
    private final C0282a f1997e = new C0282a(this);
    /* renamed from: f */
    private volatile bmd f1998f;
    /* renamed from: g */
    private UncaughtExceptionHandler f1999g;

    /* renamed from: alq$a */
    class C0282a extends ThreadPoolExecutor {
        /* renamed from: a */
        final /* synthetic */ alq f1991a;

        public C0282a(alq alq) {
            this.f1991a = alq;
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new C0283b());
            allowCoreThreadTimeOut(true);
        }

        protected <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new FutureTask<T>(this, runnable, t) {
                /* renamed from: a */
                final /* synthetic */ C0282a f1990a;

                protected void setException(Throwable th) {
                    UncaughtExceptionHandler b = this.f1990a.f1991a.f1999g;
                    if (b != null) {
                        b.uncaughtException(Thread.currentThread(), th);
                    } else if (Log.isLoggable("GAv4", 6)) {
                        String valueOf = String.valueOf(th);
                        Log.e("GAv4", new StringBuilder(String.valueOf(valueOf).length() + 37).append("MeasurementExecutor: job failed with ").append(valueOf).toString());
                    }
                    super.setException(th);
                }
            };
        }
    }

    /* renamed from: alq$b */
    static class C0283b implements ThreadFactory {
        /* renamed from: a */
        private static final AtomicInteger f1992a = new AtomicInteger();

        private C0283b() {
        }

        public Thread newThread(Runnable runnable) {
            return new C0284c(runnable, "measurement-" + f1992a.incrementAndGet());
        }
    }

    /* renamed from: alq$c */
    static class C0284c extends Thread {
        C0284c(Runnable runnable, String str) {
            super(runnable, str);
        }

        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    alq(Context context) {
        Object applicationContext = context.getApplicationContext();
        aoi.m4679a(applicationContext);
        this.f1994b = applicationContext;
    }

    /* renamed from: a */
    public static alq m2506a(Context context) {
        aoi.m4679a((Object) context);
        if (f1993a == null) {
            synchronized (alq.class) {
                if (f1993a == null) {
                    f1993a = new alq(context);
                }
            }
        }
        return f1993a;
    }

    /* renamed from: b */
    private void m2510b(aln aln) {
        aoi.m4691c("deliver should be called from worker thread");
        aoi.m4689b(aln.m2496f(), "Measurement must be submitted");
        List<alr> c = aln.m2493c();
        if (!c.isEmpty()) {
            Set hashSet = new HashSet();
            for (alr alr : c) {
                Uri a = alr.mo321a();
                if (!hashSet.contains(a)) {
                    hashSet.add(a);
                    alr.mo322a(aln);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m2511d() {
        if (!(Thread.currentThread() instanceof C0284c)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: a */
    public bmd m2512a() {
        if (this.f1998f == null) {
            synchronized (this) {
                if (this.f1998f == null) {
                    bmd bmd = new bmd();
                    PackageManager packageManager = this.f1994b.getPackageManager();
                    String packageName = this.f1994b.getPackageName();
                    bmd.m9619c(packageName);
                    bmd.m9621d(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f1994b.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str = packageInfo.versionName;
                        }
                    } catch (NameNotFoundException e) {
                        String str2 = "GAv4";
                        String str3 = "Error retrieving package info: appName set to ";
                        String valueOf = String.valueOf(packageName);
                        Log.e(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                    }
                    bmd.m9615a(packageName);
                    bmd.m9617b(str);
                    this.f1998f = bmd;
                }
            }
        }
        return this.f1998f;
    }

    /* renamed from: a */
    public <V> Future<V> m2513a(Callable<V> callable) {
        aoi.m4679a((Object) callable);
        if (!(Thread.currentThread() instanceof C0284c)) {
            return this.f1997e.submit(callable);
        }
        Future futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    /* renamed from: a */
    void m2514a(aln aln) {
        if (aln.m2500j()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (aln.m2496f()) {
            throw new IllegalStateException("Measurement can only be submitted once");
        } else {
            final aln a = aln.m2487a();
            a.m2497g();
            this.f1997e.execute(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ alq f1989b;

                public void run() {
                    a.m2498h().mo317a(a);
                    Iterator it = this.f1989b.f1995c.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    this.f1989b.m2510b(a);
                }
            });
        }
    }

    /* renamed from: a */
    public void m2515a(Runnable runnable) {
        aoi.m4679a((Object) runnable);
        this.f1997e.submit(runnable);
    }

    /* renamed from: a */
    public void m2516a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1999g = uncaughtExceptionHandler;
    }

    /* renamed from: b */
    public bmi m2517b() {
        DisplayMetrics displayMetrics = this.f1994b.getResources().getDisplayMetrics();
        bmi bmi = new bmi();
        bmi.m9659a(bof.m10131a(Locale.getDefault()));
        bmi.m9661b(displayMetrics.widthPixels);
        bmi.m9663c(displayMetrics.heightPixels);
        return bmi;
    }

    /* renamed from: c */
    public Context m2518c() {
        return this.f1994b;
    }
}
