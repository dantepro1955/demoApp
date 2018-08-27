package com.p000;

import java.util.List;

/* renamed from: wd */
class wd implements yv {
    /* renamed from: a */
    final /* synthetic */ List f25837a;
    /* renamed from: b */
    final /* synthetic */ yv f25838b;
    /* renamed from: c */
    final /* synthetic */ List f25839c;
    /* renamed from: d */
    final /* synthetic */ vz f25840d;

    wd(vz vzVar, List list, yv yvVar, List list2) {
        this.f25840d = vzVar;
        this.f25837a = list;
        this.f25838b = yvVar;
        this.f25839c = list2;
    }

    public void onNativeAdsFailedToLoad(int i) {
        if (this.f25838b != null) {
            this.f25838b.onNativeAdsFailedToLoad(i);
        }
    }

    public void onNativeAdsLoaded(List list) {
        this.f25840d.m34566c(this.f25837a, new we(this));
    }
}
