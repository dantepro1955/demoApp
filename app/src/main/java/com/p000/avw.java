package com.p000;

import java.util.HashMap;

/* renamed from: avw */
public class avw extends atu<Integer, Long> {
    /* renamed from: a */
    public Long f4705a;
    /* renamed from: b */
    public Long f4706b;

    public avw(String str) {
        mo724a(str);
    }

    /* renamed from: a */
    protected HashMap<Integer, Long> mo723a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f4705a);
        hashMap.put(Integer.valueOf(1), this.f4706b);
        return hashMap;
    }

    /* renamed from: a */
    protected void mo724a(String str) {
        HashMap b = atu.m5687b(str);
        if (b != null) {
            this.f4705a = (Long) b.get(Integer.valueOf(0));
            this.f4706b = (Long) b.get(Integer.valueOf(1));
        }
    }
}
