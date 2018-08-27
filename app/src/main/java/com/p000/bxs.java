package com.p000;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: ActivityStateImpl */
/* renamed from: bxs */
class bxs implements bxr {
    /* renamed from: a */
    private final WeakReference<Application> f8094a;
    /* renamed from: b */
    private final WeakReference<Activity> f8095b;
    /* renamed from: c */
    private boolean f8096c;
    /* renamed from: d */
    private final byj f8097d;
    /* renamed from: e */
    private boolean f8098e;

    /* compiled from: ActivityStateImpl */
    /* renamed from: bxs$a */
    class C1578a implements ActivityLifecycleCallbacks {
        /* renamed from: a */
        final /* synthetic */ bxs f8093a;

        private C1578a(bxs bxs) {
            this.f8093a = bxs;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f8093a.f8097d.mo1615b()) {
                Log.d("MoatActivityState", "Activity started: " + activity.getClass() + "@" + activity.hashCode());
            }
            if (m11662a(activity)) {
                this.f8093a.f8098e = false;
            }
        }

        public void onActivityResumed(Activity activity) {
            if (this.f8093a.f8097d.mo1615b()) {
                Log.d("MoatActivityState", "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
            }
            if (m11662a(activity)) {
                this.f8093a.f8098e = false;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f8093a.f8097d.mo1615b()) {
                Log.d("MoatActivityState", "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
            }
            if (m11662a(activity)) {
                this.f8093a.f8098e = true;
            }
        }

        public void onActivityStopped(Activity activity) {
            if (this.f8093a.f8097d.mo1615b()) {
                Log.d("MoatActivityState", "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
            }
            if (m11662a(activity)) {
                this.f8093a.f8098e = true;
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            try {
                if (this.f8093a.f8097d.mo1615b()) {
                    Log.d("MoatActivityState", "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
                }
                if (m11662a(activity)) {
                    this.f8093a.f8098e = false;
                    ((Application) this.f8093a.f8094a.get()).unregisterActivityLifecycleCallbacks(this);
                }
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }

        /* renamed from: a */
        private boolean m11662a(Activity activity) {
            Activity activity2 = (Activity) this.f8093a.f8095b.get();
            return activity2 != null && activity2.equals(activity);
        }
    }

    bxs(Activity activity, byj byj) {
        bys.m11828a(activity);
        if (byj.mo1615b()) {
            Log.d("MoatActivityState", "Listening to Activity: " + (activity != null ? activity.getClass() + "@" + activity.hashCode() : "null"));
        }
        this.f8094a = new WeakReference(activity.getApplication());
        this.f8095b = new WeakReference(activity);
        this.f8097d = byj;
        this.f8096c = false;
    }

    /* renamed from: c */
    public Activity mo1595c() {
        return (Activity) this.f8095b.get();
    }

    /* renamed from: b */
    public void mo1594b() throws byu {
        if (!this.f8096c) {
            ((Application) this.f8094a.get()).registerActivityLifecycleCallbacks(new C1578a());
        }
    }

    /* renamed from: a */
    public boolean mo1593a() {
        return this.f8098e;
    }
}
