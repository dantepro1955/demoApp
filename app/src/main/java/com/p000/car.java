package com.p000;

import com.ninegag.android.app.otto.GoGagTVEvent;
import com.ninegag.android.app.otto.GoGroupEvent;
import com.ninegag.android.app.otto.OpenUrlEvent;
import java.lang.ref.WeakReference;

/* compiled from: ExploreEventListener */
/* renamed from: car */
public class car {
    /* renamed from: a */
    private final WeakReference<cau> f8522a;

    public car(cau cau) {
        this.f8522a = new WeakReference(cau);
    }

    @dhg
    public void onGoGroup(GoGroupEvent goGroupEvent) {
        new cqd(goGroupEvent.f18284b).a(goGroupEvent.f18283a.m12210c(), cqa.a(goGroupEvent.f18283a.m12211d()), goGroupEvent.f18283a.m12208a());
        diu a = diu.a(2);
        a.a("Section", goGroupEvent.f18283a.m12210c());
        chn.m13381a("TapSection", "Navigation", null, null, a);
    }

    @dhg
    public void onGoGagTV(GoGagTVEvent goGagTVEvent) {
        new cqd(goGagTVEvent.f18282a).h();
    }

    @dhg
    public void onOpenUrl(OpenUrlEvent openUrlEvent) {
        new cqd(openUrlEvent.f18292b).d(openUrlEvent.f18291a);
    }
}
