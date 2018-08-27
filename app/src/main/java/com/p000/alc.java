package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.analytics.Tracker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: alc */
public final class alc extends alj {
    /* renamed from: b */
    private static List<Runnable> f1954b = new ArrayList();
    /* renamed from: c */
    private boolean f1955c;
    /* renamed from: d */
    private Set<C0273a> f1956d = new HashSet();
    /* renamed from: e */
    private boolean f1957e;
    /* renamed from: f */
    private boolean f1958f;
    /* renamed from: g */
    private volatile boolean f1959g;

    /* renamed from: alc$a */
    public interface C0273a {
        /* renamed from: a */
        void mo3126a(Activity activity);

        /* renamed from: b */
        void mo3127b(Activity activity);
    }

    @TargetApi(14)
    /* renamed from: alc$b */
    class C0274b implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        final /* synthetic */ alc f1948a;

        C0274b(alc alc) {
            this.f1948a = alc;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            this.f1948a.m2425a(activity);
        }

        public void onActivityStopped(Activity activity) {
            this.f1948a.m2430b(activity);
        }
    }

    public alc(bmw bmw) {
        super(bmw);
    }

    /* renamed from: a */
    public static alc m2417a(Context context) {
        return bmw.m9764a(context).m9776k();
    }

    /* renamed from: d */
    public static void m2418d() {
        synchronized (alc.class) {
            if (f1954b != null) {
                for (Runnable run : f1954b) {
                    run.run();
                }
                f1954b = null;
            }
        }
    }

    /* renamed from: o */
    private bmr m2419o() {
        return m2415j().m9774i();
    }

    /* renamed from: p */
    private bog m2420p() {
        return m2415j().m9777l();
    }

    /* renamed from: a */
    public Tracker m2421a(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(m2415j(), str, null);
            tracker.initialize();
        }
        return tracker;
    }

    /* renamed from: a */
    public void m2422a() {
        m2428b();
        this.f1955c = true;
    }

    /* renamed from: a */
    public void m2423a(int i) {
        m2419o().m9753a(i);
    }

    /* renamed from: a */
    public void m2424a(C0273a c0273a) {
        this.f1956d.add(c0273a);
        Context b = m2415j().m9767b();
        if (b instanceof Application) {
            m2426a((Application) b);
        }
    }

    /* renamed from: a */
    void m2425a(Activity activity) {
        for (C0273a a : this.f1956d) {
            a.mo3126a(activity);
        }
    }

    @TargetApi(14)
    /* renamed from: a */
    public void m2426a(Application application) {
        int i = VERSION.SDK_INT;
        if (!this.f1957e) {
            application.registerActivityLifecycleCallbacks(new C0274b(this));
            this.f1957e = true;
        }
    }

    /* renamed from: a */
    public void m2427a(boolean z) {
        this.f1958f = z;
    }

    /* renamed from: b */
    void m2428b() {
        bog p = m2420p();
        p.m10148c();
        if (p.m10151f()) {
            m2427a(p.m10152g());
        }
        p.m10148c();
    }

    /* renamed from: b */
    public void m2429b(C0273a c0273a) {
        this.f1956d.remove(c0273a);
    }

    /* renamed from: b */
    void m2430b(Activity activity) {
        for (C0273a b : this.f1956d) {
            b.mo3127b(activity);
        }
    }

    /* renamed from: c */
    public boolean m2431c() {
        return this.f1955c;
    }

    /* renamed from: e */
    public boolean m2432e() {
        return this.f1958f;
    }

    /* renamed from: f */
    public boolean m2433f() {
        return this.f1959g;
    }

    /* renamed from: g */
    public String m2434g() {
        aoi.m4691c("getClientId can not be called from the main thread");
        return m2415j().m9781p().m9919a();
    }

    /* renamed from: h */
    public void m2435h() {
        m2419o().m9758b();
    }

    /* renamed from: i */
    void m2436i() {
        m2419o().m9759c();
    }
}
