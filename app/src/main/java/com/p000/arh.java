package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: arh */
public final class arh implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    /* renamed from: a */
    private static final arh f4033a = new arh();
    /* renamed from: b */
    private final AtomicBoolean f4034b = new AtomicBoolean();
    /* renamed from: c */
    private final AtomicBoolean f4035c = new AtomicBoolean();
    /* renamed from: d */
    private final ArrayList<C0722a> f4036d = new ArrayList();
    /* renamed from: e */
    private boolean f4037e = false;

    /* renamed from: arh$a */
    public interface C0722a {
        /* renamed from: a */
        void mo701a(boolean z);
    }

    private arh() {
    }

    /* renamed from: a */
    public static arh m5108a() {
        return f4033a;
    }

    /* renamed from: a */
    public static void m5109a(Application application) {
        synchronized (f4033a) {
            if (!f4033a.f4037e) {
                application.registerActivityLifecycleCallbacks(f4033a);
                application.registerComponentCallbacks(f4033a);
                f4033a.f4037e = true;
            }
        }
    }

    /* renamed from: b */
    private void m5110b(boolean z) {
        synchronized (f4033a) {
            Iterator it = this.f4036d.iterator();
            while (it.hasNext()) {
                ((C0722a) it.next()).mo701a(z);
            }
        }
    }

    /* renamed from: a */
    public void m5111a(C0722a c0722a) {
        synchronized (f4033a) {
            this.f4036d.add(c0722a);
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public boolean m5112a(boolean z) {
        if (!this.f4035c.get()) {
            if (!aqd.m4914d()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4035c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4034b.set(true);
            }
        }
        return m5113b();
    }

    /* renamed from: b */
    public boolean m5113b() {
        return this.f4034b.get();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4034b.compareAndSet(true, false);
        this.f4035c.set(true);
        if (compareAndSet) {
            m5110b(false);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4034b.compareAndSet(true, false);
        this.f4035c.set(true);
        if (compareAndSet) {
            m5110b(false);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 20 && this.f4034b.compareAndSet(false, true)) {
            this.f4035c.set(true);
            m5110b(true);
        }
    }
}
