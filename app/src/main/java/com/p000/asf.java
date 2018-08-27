package com.p000;

import android.app.Activity;
import android.support.v4.app.FragmentActivity;

/* renamed from: asf */
public class asf {
    /* renamed from: a */
    private final Object f4240a;

    public asf(Activity activity) {
        aoi.m4680a((Object) activity, (Object) "Activity must not be null");
        this.f4240a = activity;
    }

    /* renamed from: a */
    public boolean m5465a() {
        return this.f4240a instanceof FragmentActivity;
    }

    /* renamed from: b */
    public Activity m5466b() {
        return (Activity) this.f4240a;
    }

    /* renamed from: c */
    public FragmentActivity m5467c() {
        return (FragmentActivity) this.f4240a;
    }
}
