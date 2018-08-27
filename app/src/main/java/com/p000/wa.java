package com.p000;

import java.util.List;

/* renamed from: wa */
class wa implements yv {
    /* renamed from: a */
    final /* synthetic */ yv f25831a;
    /* renamed from: b */
    final /* synthetic */ vz f25832b;

    wa(vz vzVar, yv yvVar) {
        this.f25832b = vzVar;
        this.f25831a = yvVar;
    }

    public void onNativeAdsFailedToLoad(int i) {
        this.f25832b.m34560a(this.f25831a, i);
    }

    public void onNativeAdsLoaded(List list) {
        this.f25832b.m34568a(list, this.f25831a);
    }
}
