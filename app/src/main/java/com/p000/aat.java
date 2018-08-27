package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.ActivityLifecycleManager.Callbacks;
import java.util.concurrent.ExecutorService;

@TargetApi(14)
/* compiled from: ActivityLifecycleCheckForUpdatesController */
/* renamed from: aat */
class aat extends aas {
    /* renamed from: a */
    private final Callbacks f139a = new C00081(this);
    /* renamed from: b */
    private final ExecutorService f140b;

    /* compiled from: ActivityLifecycleCheckForUpdatesController */
    /* renamed from: aat$1 */
    class C00081 extends Callbacks {
        /* renamed from: a */
        final /* synthetic */ aat f138a;

        /* compiled from: ActivityLifecycleCheckForUpdatesController */
        /* renamed from: aat$1$1 */
        class C00071 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C00081 f137a;

            C00071(C00081 c00081) {
                this.f137a = c00081;
            }

            public void run() {
                this.f137a.f138a.m115c();
            }
        }

        C00081(aat aat) {
            this.f138a = aat;
        }

        /* renamed from: a */
        public void m117a(Activity activity) {
            if (this.f138a.m113a()) {
                this.f138a.f140b.submit(new C00071(this));
            }
        }
    }

    public aat(ActivityLifecycleManager activityLifecycleManager, ExecutorService executorService) {
        this.f140b = executorService;
        activityLifecycleManager.a(this.f139a);
    }
}
