package com.p000;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: bnm */
public class bnm extends bmu {
    /* renamed from: a */
    private boolean f7109a;
    /* renamed from: b */
    private boolean f7110b;
    /* renamed from: c */
    private AlarmManager f7111c = ((AlarmManager) getContext().getSystemService("alarm"));

    protected bnm(bmw bmw) {
        super(bmw);
    }

    /* renamed from: e */
    private PendingIntent m9968e() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    /* renamed from: a */
    public boolean m9969a() {
        return this.f7109a;
    }

    /* renamed from: b */
    public boolean m9970b() {
        return this.f7110b;
    }

    /* renamed from: c */
    public void m9971c() {
        zzob();
        aoi.m4685a(m9969a(), (Object) "Receiver not registered");
        long i = zznT().m9944i();
        if (i > 0) {
            m9972d();
            long b = zznR().mo607b() + i;
            this.f7110b = true;
            this.f7111c.setInexactRepeating(2, b, 0, m9968e());
        }
    }

    /* renamed from: d */
    public void m9972d() {
        zzob();
        this.f7110b = false;
        this.f7111c.cancel(m9968e());
    }

    protected void zzmS() {
        try {
            this.f7111c.cancel(m9968e());
            if (zznT().m9944i() > 0) {
                ActivityInfo receiverInfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2);
                if (receiverInfo != null && receiverInfo.enabled) {
                    zzbP("Receiver registered. Using alarm for local dispatch.");
                    this.f7109a = true;
                }
            }
        } catch (NameNotFoundException e) {
        }
    }
}
