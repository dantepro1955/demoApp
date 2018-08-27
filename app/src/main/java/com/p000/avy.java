package com.p000;

import java.util.HashMap;

/* renamed from: avy */
public class avy extends atu<Integer, Long> {
    /* renamed from: a */
    public Long f4732a;
    /* renamed from: b */
    public Long f4733b;
    /* renamed from: c */
    public Long f4734c;
    /* renamed from: d */
    public Long f4735d;
    /* renamed from: e */
    public Long f4736e;
    /* renamed from: f */
    public Long f4737f;
    /* renamed from: g */
    public Long f4738g;
    /* renamed from: h */
    public Long f4739h;
    /* renamed from: i */
    public Long f4740i;
    /* renamed from: j */
    public Long f4741j;
    /* renamed from: k */
    public Long f4742k;

    public avy(String str) {
        mo724a(str);
    }

    /* renamed from: a */
    protected HashMap<Integer, Long> mo723a() {
        HashMap<Integer, Long> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f4732a);
        hashMap.put(Integer.valueOf(1), this.f4733b);
        hashMap.put(Integer.valueOf(2), this.f4734c);
        hashMap.put(Integer.valueOf(3), this.f4735d);
        hashMap.put(Integer.valueOf(4), this.f4736e);
        hashMap.put(Integer.valueOf(5), this.f4737f);
        hashMap.put(Integer.valueOf(6), this.f4738g);
        hashMap.put(Integer.valueOf(7), this.f4739h);
        hashMap.put(Integer.valueOf(8), this.f4740i);
        hashMap.put(Integer.valueOf(9), this.f4741j);
        hashMap.put(Integer.valueOf(10), this.f4742k);
        return hashMap;
    }

    /* renamed from: a */
    protected void mo724a(String str) {
        HashMap b = atu.m5687b(str);
        if (b != null) {
            this.f4732a = (Long) b.get(Integer.valueOf(0));
            this.f4733b = (Long) b.get(Integer.valueOf(1));
            this.f4734c = (Long) b.get(Integer.valueOf(2));
            this.f4735d = (Long) b.get(Integer.valueOf(3));
            this.f4736e = (Long) b.get(Integer.valueOf(4));
            this.f4737f = (Long) b.get(Integer.valueOf(5));
            this.f4738g = (Long) b.get(Integer.valueOf(6));
            this.f4739h = (Long) b.get(Integer.valueOf(7));
            this.f4740i = (Long) b.get(Integer.valueOf(8));
            this.f4741j = (Long) b.get(Integer.valueOf(9));
            this.f4742k = (Long) b.get(Integer.valueOf(10));
        }
    }
}
