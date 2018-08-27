package com.p000;

import com.ninegag.android.app.otto.updatebanner.OpenBannerEvent;
import com.under9.android.remoteconfig.api.model.ApiBroadcast;
import p000.dmw.C4997b;

/* compiled from: GagPosterEventListener */
/* renamed from: cgs */
public class cgs implements C4997b {
    /* renamed from: a */
    ApiBroadcast f9153a;

    public cgs(ApiBroadcast apiBroadcast) {
        this.f9153a = apiBroadcast;
    }

    /* renamed from: a */
    public void m13124a() {
        dhe.c(new OpenBannerEvent(this.f9153a));
        chn.m13445q("Broadcast", "OpenPoster");
        chn.m13335G("open-poster");
    }

    /* renamed from: b */
    public void m13125b() {
        chn.m13445q("Broadcast", "ClosePoster");
        chn.m13335G("close-poster");
    }
}
