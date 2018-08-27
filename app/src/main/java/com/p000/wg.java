package com.p000;

import java.util.List;

/* renamed from: wg */
class wg implements yv {
    /* renamed from: a */
    final /* synthetic */ yv f25844a;
    /* renamed from: b */
    final /* synthetic */ vz f25845b;

    wg(vz vzVar, yv yvVar) {
        this.f25845b = vzVar;
        this.f25844a = yvVar;
    }

    public void onNativeAdsFailedToLoad(int i) {
        this.f25845b.m34560a(this.f25844a, i);
    }

    public void onNativeAdsLoaded(List list) {
        this.f25845b.m34561a(this.f25844a, list);
    }
}
