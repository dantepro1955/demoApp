package com.p000;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: ayg */
class ayg implements ActivityLifecycleCallbacks {
    /* renamed from: a */
    private final Application f5022a;
    /* renamed from: b */
    private final WeakReference<ActivityLifecycleCallbacks> f5023b;
    /* renamed from: c */
    private boolean f5024c = false;

    /* renamed from: ayg$a */
    public interface C0904a {
        /* renamed from: a */
        void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks);
    }

    public ayg(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f5023b = new WeakReference(activityLifecycleCallbacks);
        this.f5022a = application;
    }

    /* renamed from: a */
    protected void m6575a(C0904a c0904a) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.f5023b.get();
            if (activityLifecycleCallbacks != null) {
                c0904a.mo853a(activityLifecycleCallbacks);
            } else if (!this.f5024c) {
                this.f5022a.unregisterActivityLifecycleCallbacks(this);
                this.f5024c = true;
            }
        } catch (Throwable e) {
            bky.m9007b("Error while dispatching lifecycle callback.", e);
        }
    }

    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            }
        });
    }

    public void onActivityDestroyed(final Activity activity) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            }
        });
    }

    public void onActivityPaused(final Activity activity) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            }
        });
    }

    public void onActivityResumed(final Activity activity) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            }
        });
    }

    public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            }
        });
    }

    public void onActivityStarted(final Activity activity) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            }
        });
    }

    public void onActivityStopped(final Activity activity) {
        m6575a(new C0904a(this) {
            /* renamed from: a */
            public void mo853a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            }
        });
    }
}
