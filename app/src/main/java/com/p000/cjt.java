package com.p000;

import android.content.Context;

/* compiled from: PiwikTrackerWrapper */
/* renamed from: cjt */
public class cjt {
    /* renamed from: a */
    dte f9436a;
    /* renamed from: b */
    private String f9437b;
    /* renamed from: c */
    private String f9438c;
    /* renamed from: d */
    private dgk f9439d;

    public cjt(dgk dgk) {
        this.f9439d = dgk;
    }

    /* renamed from: a */
    public synchronized void m14104a(Context context) {
        if (this.f9436a == null) {
            String str = "http://rlog.9gag.com/piwik.php";
            if (this.f9439d != null) {
                str = this.f9439d.a(str);
            }
            dit.a(context, str, 1);
            this.f9436a = dit.a();
            dit.a(caf.m12046a().m12068d().f8410g);
            dit.a(false);
            dit.b(djo.a().toString());
            dit.a(30000);
            dit.a(10000);
            dit.g("Overview");
            dit.g("Overlay");
            dit.g("ViewComment");
            dit.g("WriteComment");
            dit.g("Section");
            this.f9437b = caf.m12046a().m12077h().mo1774n();
            if (this.f9437b.startsWith("v")) {
                this.f9438c = this.f9437b.substring(17).replaceAll("-", "").substring(0, 16);
            } else {
                this.f9438c = this.f9437b.replaceAll("-", "").substring(0, 16);
            }
        }
        m14103a();
    }

    /* renamed from: a */
    private void m14103a() {
        if (this.f9436a != null) {
            if (caf.m12046a().m12094x().m12104c()) {
                String str = caf.m12046a().m12075g().m13729g().f9566c;
                if (str != null) {
                    dit.c(str);
                } else {
                    dit.c(null);
                }
            } else {
                dit.c(null);
            }
            dit.d(this.f9438c);
            dit.e(this.f9437b);
        }
    }
}
