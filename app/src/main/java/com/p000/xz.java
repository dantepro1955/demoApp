package com.p000;

import android.net.Uri;
import com.applovin.adview.AppLovinAdView;

/* renamed from: xz */
class xz implements zj {
    /* renamed from: a */
    final /* synthetic */ ty f26009a;
    /* renamed from: b */
    final /* synthetic */ Uri f26010b;
    /* renamed from: c */
    final /* synthetic */ vi f26011c;
    /* renamed from: d */
    final /* synthetic */ AppLovinAdView f26012d;
    /* renamed from: e */
    final /* synthetic */ vl f26013e;

    xz(vl vlVar, ty tyVar, Uri uri, vi viVar, AppLovinAdView appLovinAdView) {
        this.f26013e = vlVar;
        this.f26009a = tyVar;
        this.f26010b = uri;
        this.f26011c = viVar;
        this.f26012d = appLovinAdView;
    }

    public void onPostbackFailure(String str, int i) {
        this.f26013e.f25718e.post(new yb(this));
    }

    public void onPostbackSuccess(String str) {
        this.f26013e.f25718e.post(new ya(this));
    }
}
