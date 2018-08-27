package com.p000;

import com.ninegag.android.app.otto.updatebanner.CloseBannerEvent;
import com.ninegag.android.app.otto.updatebanner.OpenBannerEvent;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import p000.dmu.C4993a;

/* compiled from: GagBannerEventListener */
/* renamed from: cgr */
public class cgr implements C4993a {
    /* renamed from: a */
    ApiBroadcast f9152a;

    public cgr(ApiBroadcast apiBroadcast) {
        this.f9152a = apiBroadcast;
    }

    /* renamed from: a */
    public void m13122a() {
        dhe.c(new CloseBannerEvent());
        chn.m13445q("Broadcast", "CloseBanner");
        chn.m13335G("close-banner");
    }

    /* renamed from: b */
    public void m13123b() {
        dhe.c(new OpenBannerEvent(this.f9152a));
        chn.m13445q("Broadcast", "OpenBanner");
        chn.m13335G("open-banner");
    }
}
