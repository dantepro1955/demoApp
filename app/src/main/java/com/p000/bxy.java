package com.p000;

import android.support.v7.widget.LinearLayoutManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MoatAdEvent */
/* renamed from: bxy */
public class bxy {
    /* renamed from: a */
    public static final Integer f8141a = Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
    /* renamed from: b */
    public static final Double f8142b = Double.valueOf(Double.NaN);
    /* renamed from: c */
    public Integer f8143c;
    /* renamed from: d */
    public Double f8144d;
    /* renamed from: e */
    public bxz f8145e;
    /* renamed from: f */
    private Long f8146f = Long.valueOf(System.currentTimeMillis());

    public bxy(bxz bxz, Integer num, Double d) {
        this.f8145e = bxz;
        this.f8144d = d;
        this.f8143c = num;
    }

    /* renamed from: a */
    public Map<String, Object> m11713a() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("adVolume", this.f8144d);
        hashMap.put("playhead", this.f8143c);
        hashMap.put("aTimeStamp", this.f8146f);
        hashMap.put("type", this.f8145e.toString());
        return hashMap;
    }
}
