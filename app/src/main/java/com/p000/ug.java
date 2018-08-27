package com.p000;

import android.app.Activity;
import android.content.Intent;
import com.applovin.adview.AppLovinInterstitialActivity;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: ug */
public class ug implements tc {
    /* renamed from: a */
    public static volatile boolean f25613a = false;
    /* renamed from: b */
    public static volatile boolean f25614b = false;
    /* renamed from: c */
    private static final Map f25615c = Collections.synchronizedMap(new HashMap());
    /* renamed from: n */
    private static volatile boolean f25616n;
    /* renamed from: d */
    private final String f25617d;
    /* renamed from: e */
    private final vm f25618e;
    /* renamed from: f */
    private final Activity f25619f;
    /* renamed from: g */
    private volatile zb f25620g;
    /* renamed from: h */
    private volatile za f25621h;
    /* renamed from: i */
    private volatile zg f25622i;
    /* renamed from: j */
    private volatile yz f25623j;
    /* renamed from: k */
    private volatile vi f25624k;
    /* renamed from: l */
    private volatile vj f25625l;
    /* renamed from: m */
    private volatile ve f25626m;

    ug(zl zlVar, Activity activity) {
        if (zlVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        } else {
            this.f25618e = (vm) zlVar;
            this.f25617d = UUID.randomUUID().toString();
            f25613a = true;
            f25614b = false;
            this.f25619f = activity;
            f25615c.put(this.f25617d, this);
        }
    }

    /* renamed from: a */
    public static ug m34247a(String str) {
        return (ug) f25615c.get(str);
    }

    /* renamed from: a */
    private void m34248a(int i) {
        this.f25619f.runOnUiThread(new uk(this, i));
    }

    /* renamed from: b */
    private void m34253b(yy yyVar) {
        this.f25619f.runOnUiThread(new uj(this, yyVar));
    }

    /* renamed from: j */
    private void m34255j() {
        Object vfVar = new vf(this.f25618e, this.f25619f);
        vfVar.m34310a(this);
        this.f25626m = vfVar;
        vfVar.m34311a(this.f25624k);
    }

    /* renamed from: k */
    private void m34256k() {
        Intent intent = new Intent(this.f25619f, AppLovinInterstitialActivity.class);
        intent.putExtra(AppLovinInterstitialActivity.KEY_WRAPPER_ID, this.f25617d);
        AppLovinInterstitialActivity.lastKnownWrapper = this;
        this.f25619f.startActivity(intent);
        m34263a(true);
    }

    /* renamed from: a */
    public void mo5543a() {
        this.f25618e.mo5559d().mo5554a(zd.f26074c, new uh(this));
    }

    /* renamed from: a */
    public void m34258a(ve veVar) {
        this.f25626m = veVar;
    }

    /* renamed from: a */
    public void mo5544a(yy yyVar) {
        if (m34269g()) {
            this.f25618e.mo5561g().mo5613e("AppLovinInterstitialAdDialog", "Attempted to show an interstitial while one is already displayed; ignoring.");
            return;
        }
        this.f25624k = (vi) yyVar;
        this.f25625l = this.f25624k != null ? this.f25624k.m34322d() : vj.DEFAULT;
        if (!zn.m34841d(this.f25624k.m34329k()) || this.f25618e.m34409n().m34936a(this.f25624k.m34329k(), this.f25619f)) {
            boolean a = yi.m34894a(AppLovinInterstitialActivity.class, this.f25619f);
            boolean z = this.f25625l == vj.ACTIVITY_LANDSCAPE || this.f25625l == vj.ACTIVITY_PORTRAIT;
            this.f25619f.runOnUiThread(new ui(this, a, z));
        }
    }

    /* renamed from: a */
    public void mo5545a(yz yzVar) {
        this.f25623j = yzVar;
    }

    /* renamed from: a */
    public void mo5546a(za zaVar) {
        this.f25621h = zaVar;
    }

    /* renamed from: a */
    public void mo5547a(zg zgVar) {
        this.f25622i = zgVar;
    }

    /* renamed from: a */
    public void m34263a(boolean z) {
        f25616n = z;
    }

    /* renamed from: b */
    public zl m34264b() {
        return this.f25618e;
    }

    /* renamed from: c */
    public yy m34265c() {
        return this.f25624k;
    }

    /* renamed from: d */
    public zg m34266d() {
        return this.f25622i;
    }

    /* renamed from: e */
    public za m34267e() {
        return this.f25621h;
    }

    /* renamed from: f */
    public yz m34268f() {
        return this.f25623j;
    }

    /* renamed from: g */
    public boolean m34269g() {
        return f25616n;
    }

    /* renamed from: h */
    public vj m34270h() {
        return this.f25625l;
    }

    /* renamed from: i */
    public void m34271i() {
        f25613a = false;
        f25614b = true;
        f25615c.remove(this.f25617d);
    }
}
