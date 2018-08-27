package com.p000;

import java.util.HashMap;

/* renamed from: awa */
public class awa extends atu<Integer, Long> {
    /* renamed from: a */
    public Long f4744a;

    public awa(String str) {
        mo724a(str);
    }

    /* renamed from: a */
    protected HashMap<Integer, Long> mo723a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f4744a);
        return hashMap;
    }

    /* renamed from: a */
    protected void mo724a(String str) {
        HashMap b = atu.m5687b(str);
        if (b != null) {
            this.f4744a = (Long) b.get(Integer.valueOf(0));
        }
    }
}
