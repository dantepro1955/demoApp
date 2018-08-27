package com.p000;

import android.app.Activity;
import android.os.AsyncTask;
import com.mopub.nativeads.AdMobStaticNativeAd;
import com.ninegag.android.app.ui.BaseActivity;
import java.lang.ref.WeakReference;

/* compiled from: AdsManagerLoader */
/* renamed from: cfn */
public class cfn extends AsyncTask<Void, Void, dmm> {
    /* renamed from: a */
    private WeakReference<cce> f9063a;
    /* renamed from: b */
    private WeakReference<BaseActivity> f9064b;
    /* renamed from: c */
    private String f9065c;
    /* renamed from: d */
    private String f9066d;
    /* renamed from: e */
    private String f9067e;
    /* renamed from: f */
    private caf f9068f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m12987a((Void[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m12988a((dmm) obj);
    }

    public cfn(BaseActivity baseActivity, caf caf, cce cce, String str, String str2, String str3) {
        this.f9064b = new WeakReference(baseActivity);
        this.f9063a = new WeakReference(cce);
        this.f9068f = caf;
        this.f9065c = str;
        this.f9067e = str3;
        this.f9066d = str2;
    }

    /* renamed from: a */
    protected dmm m12987a(Void... voidArr) {
        dmm a = this.f9068f.m12086p().e().a(crf.b(), dmn.a(this.f9065c, this.f9066d), "inline_ad");
        cle a2 = this.f9068f.m12075g().f9370c.m13814a(this.f9067e);
        try {
            String str;
            if (this.f9065c == null && this.f9066d == null) {
                str = "";
            } else if (this.f9065c == null) {
                str = this.f9066d;
            } else if (this.f9066d == null) {
                str = this.f9065c;
            } else {
                str = this.f9065c + "_" + this.f9066d;
            }
            return crf.a(a, a2 == null ? null : new bum().m11091a(a2.m14250h()), str);
        } catch (Exception e) {
            return a;
        }
    }

    /* renamed from: a */
    protected void m12988a(dmm dmm) {
        cce cce = (cce) this.f9063a.get();
        BaseActivity baseActivity = (BaseActivity) this.f9064b.get();
        if (cce != null && dmm.b()) {
            cdl cdl = new cdl((Activity) this.f9064b.get(), dmm.a(), AdMobStaticNativeAd.buildContentUrl(this.f9065c, this.f9066d));
            if (baseActivity.isFinishing()) {
                cdl.m12670d();
                return;
            }
            baseActivity.addLifecycleHook(cdl);
            cce.mo1661a(cdl);
            cce.mo1662a(dmm);
            cce.notifyDataSetChanged();
        }
    }
}
