package com.p000;

import java.util.HashMap;

/* renamed from: avv */
public class avv extends atu<Integer, Object> {
    /* renamed from: a */
    public Long f4702a;
    /* renamed from: b */
    public Boolean f4703b;
    /* renamed from: c */
    public Boolean f4704c;

    public avv(String str) {
        mo724a(str);
    }

    /* renamed from: a */
    protected HashMap<Integer, Object> mo723a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f4702a);
        hashMap.put(Integer.valueOf(1), this.f4703b);
        hashMap.put(Integer.valueOf(2), this.f4704c);
        return hashMap;
    }

    /* renamed from: a */
    protected void mo724a(String str) {
        HashMap b = atu.m5687b(str);
        if (b != null) {
            this.f4702a = (Long) b.get(Integer.valueOf(0));
            this.f4703b = (Boolean) b.get(Integer.valueOf(1));
            this.f4704c = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
