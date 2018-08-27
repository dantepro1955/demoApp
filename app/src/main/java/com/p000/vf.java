package com.p000;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.adview.C1789u;
import java.lang.ref.WeakReference;

/* renamed from: vf */
class vf extends Dialog implements ve {
    /* renamed from: a */
    private final Activity f25667a;
    /* renamed from: b */
    private final zl f25668b;
    /* renamed from: c */
    private final zi f25669c;
    /* renamed from: d */
    private RelativeLayout f25670d;
    /* renamed from: e */
    private AppLovinAdView f25671e;
    /* renamed from: f */
    private Runnable f25672f;
    /* renamed from: g */
    private ug f25673g = null;
    /* renamed from: h */
    private volatile boolean f25674h = false;
    /* renamed from: i */
    private volatile boolean f25675i = false;

    vf(zl zlVar, Activity activity) {
        super(activity, 16973840);
        if (zlVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else {
            this.f25668b = zlVar;
            this.f25669c = zlVar.mo5561g();
            this.f25667a = activity;
            this.f25672f = new uf();
            this.f25671e = new AppLovinAdView(zlVar, zd.f26074c, activity);
            this.f25671e.setAutoDestroy(false);
            ((ty) this.f25671e.getAdViewController()).m34218a(new WeakReference(this));
            requestWindowFeature(1);
            try {
                getWindow().setFlags(activity.getWindow().getAttributes().flags, activity.getWindow().getAttributes().flags);
            } catch (Throwable e) {
                this.f25669c.mo5609b("InterstitialAdDialog", "Set window flags failed.", e);
            }
        }
    }

    /* renamed from: a */
    private int m34297a(int i) {
        return zn.m34832a(this.f25667a, i);
    }

    /* renamed from: a */
    private void m34299a() {
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        this.f25671e.setLayoutParams(layoutParams);
        this.f25670d = new RelativeLayout(this.f25667a);
        this.f25670d.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f25670d.setBackgroundColor(-1157627904);
        this.f25670d.addView(this.f25671e);
        setContentView(this.f25670d);
    }

    /* renamed from: a */
    private void m34300a(vd vdVar) {
        int i = 9;
        View a = C1789u.a(this.f25668b, getContext(), vdVar);
        a.setOnClickListener(new ud(this));
        wu wuVar = new wu(this.f25668b);
        int a2 = m34297a(wuVar.m34687l());
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(a2, a2);
        layoutParams.addRule(10);
        layoutParams.addRule(wuVar.m34700y() ? 9 : 11);
        a.a(a2);
        int a3 = m34297a(wuVar.m34689n());
        int a4 = m34297a(wuVar.m34691p());
        layoutParams.setMargins(a4, a3, a4, a3);
        this.f25671e.addView(a, layoutParams);
        a.bringToFront();
        int a5 = m34297a(new wu(this.f25668b).m34693r());
        View view = new View(this.f25667a);
        view.setBackgroundColor(0);
        LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a2 + a5, a2 + a5);
        layoutParams2.addRule(10);
        if (!wuVar.m34699x()) {
            i = 11;
        }
        layoutParams2.addRule(i);
        layoutParams2.setMargins(0, a3 - m34297a(5), a4 - m34297a(5), 0);
        view.setOnClickListener(new ue(this, a));
        this.f25671e.addView(view, layoutParams2);
        view.bringToFront();
    }

    /* renamed from: a */
    public void m34310a(ug ugVar) {
        this.f25671e.setAdDisplayListener(new vg(this, ugVar));
        this.f25671e.setAdClickListener(new vh(this, ugVar));
        this.f25671e.setAdVideoPlaybackListener(new ub(this, ugVar));
        this.f25673g = ugVar;
        ugVar.m34263a(true);
    }

    /* renamed from: a */
    public void m34311a(yy yyVar) {
        this.f25667a.runOnUiThread(new uc(this, yyVar));
    }

    public void dismiss() {
        if (this.f25673g != null) {
            this.f25673g.m34271i();
        }
        if (this.f25671e != null) {
            this.f25671e.b();
        }
        this.f25673g = null;
        this.f25671e = null;
        super.dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m34299a();
    }
}
