package com.p000;

import android.app.Activity;
import android.os.Bundle;
import io.fabric.sdk.android.ActivityLifecycleManager.Callbacks;
import p000.aao.C0006b;

/* compiled from: AnswersLifecycleCallbacks */
/* renamed from: zz */
class zz extends Callbacks {
    /* renamed from: a */
    private final aam f26201a;
    /* renamed from: b */
    private final aac f26202b;

    public zz(aam aam, aac aac) {
        this.f26201a = aam;
        this.f26202b = aac;
    }

    /* renamed from: a */
    public void mo4879a(Activity activity, Bundle bundle) {
    }

    /* renamed from: a */
    public void mo4878a(Activity activity) {
        this.f26201a.a(activity, C0006b.START);
    }

    /* renamed from: b */
    public void mo4880b(Activity activity) {
        this.f26201a.a(activity, C0006b.RESUME);
        this.f26202b.a();
    }

    /* renamed from: c */
    public void mo5620c(Activity activity) {
        this.f26201a.a(activity, C0006b.PAUSE);
        this.f26202b.b();
    }

    /* renamed from: d */
    public void mo5621d(Activity activity) {
        this.f26201a.a(activity, C0006b.STOP);
    }

    /* renamed from: b */
    public void mo5619b(Activity activity, Bundle bundle) {
    }

    /* renamed from: e */
    public void mo5622e(Activity activity) {
    }
}
