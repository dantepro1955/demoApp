package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

@bhd
/* renamed from: ayl */
public class ayl {
    /* renamed from: a */
    private final Object f5054a = new Object();
    /* renamed from: b */
    private C0913a f5055b = null;
    /* renamed from: c */
    private boolean f5056c = false;

    @TargetApi(14)
    /* renamed from: ayl$a */
    static class C0913a implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        private Activity f5045a;
        /* renamed from: b */
        private Context f5046b;
        /* renamed from: c */
        private final Object f5047c = new Object();
        /* renamed from: d */
        private boolean f5048d = true;
        /* renamed from: e */
        private boolean f5049e = false;
        /* renamed from: f */
        private List<C0914b> f5050f = new ArrayList();
        /* renamed from: g */
        private Runnable f5051g;
        /* renamed from: h */
        private boolean f5052h = false;
        /* renamed from: i */
        private long f5053i;

        /* renamed from: ayl$a$1 */
        class C09121 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C0913a f5044a;

            C09121(C0913a c0913a) {
                this.f5044a = c0913a;
            }

            public void run() {
                synchronized (this.f5044a.f5047c) {
                    if (this.f5044a.f5048d && this.f5044a.f5049e) {
                        this.f5044a.f5048d = false;
                        bky.m9006b("App went background");
                        for (C0914b a : this.f5044a.f5050f) {
                            try {
                                a.mo855a(false);
                            } catch (Throwable e) {
                                bky.m9007b("OnForegroundStateChangedListener threw exception.", e);
                            }
                        }
                    } else {
                        bky.m9006b("App is still foreground");
                    }
                }
            }
        }

        C0913a() {
        }

        /* renamed from: a */
        private void m6597a(Activity activity) {
            synchronized (this.f5047c) {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.f5045a = activity;
                }
            }
        }

        /* renamed from: a */
        public Activity m6602a() {
            return this.f5045a;
        }

        /* renamed from: a */
        public void m6603a(Application application, Context context) {
            if (!this.f5052h) {
                application.registerActivityLifecycleCallbacks(this);
                if (context instanceof Activity) {
                    m6597a((Activity) context);
                }
                this.f5046b = context;
                this.f5053i = ((Long) bbb.aK.m7064c()).longValue();
                this.f5052h = true;
            }
        }

        /* renamed from: a */
        public void m6604a(C0914b c0914b) {
            this.f5050f.add(c0914b);
        }

        /* renamed from: b */
        public Context m6605b() {
            return this.f5046b;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityDestroyed(Activity r3) {
            /*
            r2 = this;
            r1 = r2.f5047c;
            monitor-enter(r1);
            r0 = r2.f5045a;	 Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0009;
        L_0x0007:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
        L_0x0008:
            return;
        L_0x0009:
            r0 = r2.f5045a;	 Catch:{ all -> 0x0016 }
            r0 = r0.equals(r3);	 Catch:{ all -> 0x0016 }
            if (r0 == 0) goto L_0x0014;
        L_0x0011:
            r0 = 0;
            r2.f5045a = r0;	 Catch:{ all -> 0x0016 }
        L_0x0014:
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            goto L_0x0008;
        L_0x0016:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0016 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: ayl.a.onActivityDestroyed(android.app.Activity):void");
        }

        public void onActivityPaused(Activity activity) {
            m6597a(activity);
            this.f5049e = true;
            if (this.f5051g != null) {
                bkg.f6710a.removeCallbacks(this.f5051g);
            }
            Handler handler = bkg.f6710a;
            Runnable c09121 = new C09121(this);
            this.f5051g = c09121;
            handler.postDelayed(c09121, this.f5053i);
        }

        public void onActivityResumed(Activity activity) {
            boolean z = false;
            m6597a(activity);
            this.f5049e = false;
            if (!this.f5048d) {
                z = true;
            }
            this.f5048d = true;
            if (this.f5051g != null) {
                bkg.f6710a.removeCallbacks(this.f5051g);
            }
            synchronized (this.f5047c) {
                if (z) {
                    for (C0914b a : this.f5050f) {
                        try {
                            a.mo855a(true);
                        } catch (Throwable e) {
                            bky.m9007b("OnForegroundStateChangedListener threw exception.", e);
                        }
                    }
                } else {
                    bky.m9006b("App is still foreground.");
                }
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            m6597a(activity);
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: ayl$b */
    public interface C0914b {
        /* renamed from: a */
        void mo855a(boolean z);
    }

    /* renamed from: a */
    public Activity m6607a() {
        Activity a;
        synchronized (this.f5054a) {
            aqd.m4912b();
            if (this.f5055b != null) {
                a = this.f5055b.m6602a();
            } else {
                a = null;
            }
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public void m6608a(Context r5) {
        /*
        r4 = this;
        r2 = r4.f5054a;
        monitor-enter(r2);
        r0 = r4.f5056c;	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0047;
    L_0x0007:
        p000.aqd.m4912b();	 Catch:{ all -> 0x0031 }
        r0 = p000.bbb.aJ;	 Catch:{ all -> 0x0031 }
        r0 = r0.m7064c();	 Catch:{ all -> 0x0031 }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x0031 }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x001a;
    L_0x0018:
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
    L_0x0019:
        return;
    L_0x001a:
        r1 = 0;
        r0 = r5.getApplicationContext();	 Catch:{ all -> 0x0031 }
        if (r0 != 0) goto L_0x0022;
    L_0x0021:
        r0 = r5;
    L_0x0022:
        r3 = r0 instanceof android.app.Application;	 Catch:{ all -> 0x0031 }
        if (r3 == 0) goto L_0x0049;
    L_0x0026:
        r0 = (android.app.Application) r0;	 Catch:{ all -> 0x0031 }
    L_0x0028:
        if (r0 != 0) goto L_0x0034;
    L_0x002a:
        r0 = "Can not cast Context to Application";
        p000.bky.m9011e(r0);	 Catch:{ all -> 0x0031 }
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        goto L_0x0019;
    L_0x0031:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        throw r0;
    L_0x0034:
        r1 = r4.f5055b;	 Catch:{ all -> 0x0031 }
        if (r1 != 0) goto L_0x003f;
    L_0x0038:
        r1 = new ayl$a;	 Catch:{ all -> 0x0031 }
        r1.<init>();	 Catch:{ all -> 0x0031 }
        r4.f5055b = r1;	 Catch:{ all -> 0x0031 }
    L_0x003f:
        r1 = r4.f5055b;	 Catch:{ all -> 0x0031 }
        r1.m6603a(r0, r5);	 Catch:{ all -> 0x0031 }
        r0 = 1;
        r4.f5056c = r0;	 Catch:{ all -> 0x0031 }
    L_0x0047:
        monitor-exit(r2);	 Catch:{ all -> 0x0031 }
        goto L_0x0019;
    L_0x0049:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayl.a(android.content.Context):void");
    }

    /* renamed from: a */
    public void m6609a(C0914b c0914b) {
        synchronized (this.f5054a) {
            aqd.m4912b();
            if (((Boolean) bbb.aJ.m7064c()).booleanValue()) {
                if (this.f5055b == null) {
                    this.f5055b = new C0913a();
                }
                this.f5055b.m6604a(c0914b);
                return;
            }
        }
    }

    /* renamed from: b */
    public Context m6610b() {
        Context b;
        synchronized (this.f5054a) {
            aqd.m4912b();
            if (this.f5055b != null) {
                b = this.f5055b.m6605b();
            } else {
                b = null;
            }
        }
        return b;
    }
}
