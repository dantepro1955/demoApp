package com.p000;

import java.util.List;

/* renamed from: wf */
class wf implements yv {
    /* renamed from: a */
    final /* synthetic */ yv f25842a;
    /* renamed from: b */
    final /* synthetic */ vz f25843b;

    wf(vz vzVar, yv yvVar) {
        this.f25843b = vzVar;
        this.f25842a = yvVar;
    }

    public void onNativeAdsFailedToLoad(int i) {
        if (this.f25842a != null) {
            this.f25842a.onNativeAdsFailedToLoad(i);
        }
    }

    public void onNativeAdsLoaded(List list) {
        if (this.f25842a != null) {
            this.f25842a.onNativeAdsLoaded(list);
        }
    }
}
