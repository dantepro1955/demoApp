package com.p000;

import android.app.Activity;
import com.ninegag.android.app.R;
import java.lang.ref.WeakReference;
import p000.dkd.C4946a;

/* compiled from: OverlaySlideDismissListener */
/* renamed from: cek */
public class cek implements C4946a {
    /* renamed from: a */
    private WeakReference<Activity> f8928a;

    public cek(Activity activity) {
        this.f8928a = new WeakReference(activity);
    }

    /* renamed from: a */
    public boolean m12803a() {
        return true;
    }

    /* renamed from: b */
    public void m12804b() {
    }

    /* renamed from: c */
    public void m12806c() {
    }

    /* renamed from: d */
    public void m12807d() {
    }

    /* renamed from: a */
    public void m12802a(int i) {
    }

    /* renamed from: b */
    public void m12805b(int i) {
        if (this.f8928a.get() != null) {
            ((Activity) this.f8928a.get()).finish();
            ((Activity) this.f8928a.get()).overridePendingTransition(R.anim.fade_in_quick, R.anim.fade_out_quick);
        }
    }

    /* renamed from: e */
    public void m12808e() {
    }
}
