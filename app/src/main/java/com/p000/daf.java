package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

@TargetApi(14)
/* compiled from: ActivityLifecycleListener */
/* renamed from: daf */
class daf implements ActivityLifecycleCallbacks {
    daf() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        dae.m26023a(activity);
    }

    public void onActivityStarted(Activity activity) {
        dae.m26026b(activity);
    }

    public void onActivityResumed(Activity activity) {
        dae.m26029c(activity);
    }

    public void onActivityPaused(Activity activity) {
        dae.m26030d(activity);
    }

    public void onActivityStopped(Activity activity) {
        dae.m26031e(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        dae.m26032f(activity);
    }
}
