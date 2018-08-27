package com.p000;

import android.app.Activity;
import android.app.Instrumentation;
import android.app.Instrumentation.ActivityMonitor;
import android.app.OnActivityPausedListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityLifecycleListenerCompat */
/* renamed from: dag */
class dag {
    /* renamed from: a */
    static void m26034a() {
        try {
            Class cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mInstrumentation");
            declaredField.setAccessible(true);
            dag.m26035a(cls, invoke, ((Instrumentation) declaredField.get(invoke)).addMonitor((String) null, null, false));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m26035a(final Class cls, final Object obj, final ActivityMonitor activityMonitor) {
        new Thread(new Runnable() {

            /* compiled from: ActivityLifecycleListenerCompat */
            /* renamed from: dag$1$1 */
            class C47361 implements OnActivityPausedListener {
                /* renamed from: a */
                final /* synthetic */ C47371 f20928a;

                C47361(C47371 c47371) {
                    this.f20928a = c47371;
                }

                public void onPaused(Activity activity) {
                    dae.m26030d(activity);
                }
            }

            public void run() {
                try {
                    C47361 c47361 = new C47361(this);
                    Method method = cls.getMethod("registerOnActivityPausedListener", new Class[]{Activity.class, OnActivityPausedListener.class});
                    while (true) {
                        Activity waitForActivity = activityMonitor.waitForActivity();
                        if (!waitForActivity.isFinishing()) {
                            dae.m26029c(waitForActivity);
                            method.invoke(obj, new Object[]{waitForActivity, c47361});
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }).start();
    }
}
