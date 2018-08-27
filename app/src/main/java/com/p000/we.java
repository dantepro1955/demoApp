package com.p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: we */
class we implements yv {
    /* renamed from: a */
    final /* synthetic */ wd f25841a;

    we(wd wdVar) {
        this.f25841a = wdVar;
    }

    public void onNativeAdsFailedToLoad(int i) {
        if (this.f25841a.f25838b != null) {
            this.f25841a.f25838b.onNativeAdsFailedToLoad(i);
        }
    }

    public void onNativeAdsLoaded(List list) {
        if (this.f25841a.f25838b != null) {
            List arrayList = new ArrayList();
            arrayList.addAll(this.f25841a.f25837a);
            arrayList.addAll(this.f25841a.f25839c);
            this.f25841a.f25838b.onNativeAdsLoaded(arrayList);
        }
    }
}
