package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.internal.AnalyticsEvents;

/* renamed from: xj */
class xj implements Runnable {
    /* renamed from: a */
    private final vm f25970a;
    /* renamed from: b */
    private final zi f25971b;
    /* renamed from: c */
    private final Context f25972c;

    xj(vm vmVar) {
        this.f25970a = vmVar;
        this.f25972c = vmVar.m34404i();
        this.f25971b = vmVar.mo5561g();
    }

    /* renamed from: c */
    private void m34796c() {
        String str = (String) this.f25970a.m34391a(wp.f25874D);
        if (str.length() > 0) {
            for (String a : str.split(",")) {
                zd a2 = zd.m34946a(a);
                if (a2 != null) {
                    this.f25970a.m34410o().mo5577d(new wt(a2, ze.f26079a));
                }
            }
        }
        if (((Boolean) this.f25970a.m34391a(wp.f25875E)).booleanValue()) {
            this.f25970a.m34410o().mo5577d(new wt(zd.f26074c, ze.f26080b));
        }
        if (((Boolean) this.f25970a.m34391a(wp.az)).booleanValue()) {
            this.f25970a.m34411p().mo5577d(vo.f25750c);
        }
    }

    /* renamed from: a */
    boolean m34797a() {
        if (ym.m34920a("android.permission.INTERNET", this.f25972c)) {
            return true;
        }
        this.f25971b.mo5613e("TaskInitializeSdk", "Unable to enable AppLovin SDK: no android.permission.INTERNET");
        return false;
    }

    /* renamed from: b */
    void m34798b() {
        this.f25970a.m34407l().m34804a(new wx(this.f25970a), xl.MAIN, 500);
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f25971b.mo5606a("TaskInitializeSdk", "Initializing AppLovin SDK 6.1.5...");
        try {
            if (m34797a()) {
                wv m = this.f25970a.m34408m();
                m.m34708c();
                m.m34709c("ad_imp_session");
                vq.m34458b(this.f25970a);
                this.f25970a.m34409n().m34943e(this.f25972c);
                this.f25970a.m34409n().m34942d(this.f25972c);
                m34796c();
                m34798b();
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f25972c);
                if (!zn.m34841d(defaultSharedPreferences.getString("com.applovin.sdk.impl.isFirstRun", null))) {
                    defaultSharedPreferences.edit().putString("com.applovin.sdk.impl.isFirstRun", Boolean.toString(true)).commit();
                }
                this.f25970a.m34415t().m34626a();
                this.f25970a.m34414s().mo5565a("landing");
                this.f25970a.m34396b(true);
            } else {
                this.f25970a.m34396b(false);
            }
            this.f25971b.mo5606a("TaskInitializeSdk", "AppLovin SDK 6.1.5 initialization " + (this.f25970a.m34397b() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed") + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        } catch (Throwable th) {
            Throwable th2 = th;
            this.f25971b.mo5606a("TaskInitializeSdk", "AppLovin SDK 6.1.5 initialization " + (this.f25970a.m34397b() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed") + " in " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
        }
    }
}
