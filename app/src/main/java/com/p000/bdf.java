package com.p000;

import java.util.Map;

@bhd
/* renamed from: bdf */
public class bdf implements bcy {
    /* renamed from: a */
    static final Map<String, Integer> f5639a = apu.m4877a("resize", Integer.valueOf(1), "playVideo", Integer.valueOf(2), "storePicture", Integer.valueOf(3), "createCalendarEvent", Integer.valueOf(4), "setOrientationProperties", Integer.valueOf(5), "closeResizedAd", Integer.valueOf(6));
    /* renamed from: b */
    private final ajy f5640b;
    /* renamed from: c */
    private final bfo f5641c;

    public bdf(ajy ajy, bfo bfo) {
        this.f5640b = ajy;
        this.f5641c = bfo;
    }

    /* renamed from: a */
    public void mo277a(blo blo, Map<String, String> map) {
        int intValue = ((Integer) f5639a.get((String) map.get("a"))).intValue();
        if (intValue == 5 || this.f5640b == null || this.f5640b.m2068b()) {
            switch (intValue) {
                case 1:
                    this.f5641c.m8171a((Map) map);
                    return;
                case 3:
                    new bfq(blo, map).m8182a();
                    return;
                case 4:
                    new bfn(blo, map).m8165a();
                    return;
                case 5:
                    new bfp(blo, map).m8178a();
                    return;
                case 6:
                    this.f5641c.m8172a(true);
                    return;
                default:
                    bky.m9010d("Unknown MRAID command called.");
                    return;
            }
        }
        this.f5640b.m2067a(null);
    }
}
