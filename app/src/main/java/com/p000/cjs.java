package com.p000;

import android.content.Context;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.analytics.Tracker;

/* compiled from: GATrackerWrapper */
/* renamed from: cjs */
public final class cjs {
    /* renamed from: a */
    Tracker f9434a;
    /* renamed from: b */
    private String f9435b;

    /* renamed from: a */
    public void m14102a(Context context) {
        alc a = alc.m2417a(context);
        a.m2427a(false);
        a.m2423a(20);
        this.f9435b = caf.m12046a().m12087q().mo1787d();
        if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(this.f9435b)) {
            this.f9434a = null;
        } else {
            this.f9434a = a.m2421a(this.f9435b);
            this.f9434a.enableExceptionReporting(true);
        }
        m14100b();
    }

    /* renamed from: b */
    private void m14100b() {
        if (this.f9434a != null) {
            if (caf.m12046a().m12094x().m12104c()) {
                String str = caf.m12046a().m12075g().m13729g().f9566c;
                if (str != null) {
                    this.f9434a.set("&uid", str);
                    return;
                } else {
                    this.f9434a.set("&uid", null);
                    return;
                }
            }
            this.f9434a.set("&uid", null);
        }
    }

    /* renamed from: a */
    public Tracker m14101a() {
        return this.f9434a;
    }
}
