package com.p000;

import java.util.HashMap;

/* renamed from: atw */
public class atw extends atu<Integer, Object> {
    /* renamed from: a */
    public String f4511a;
    /* renamed from: b */
    public long f4512b;
    /* renamed from: c */
    public String f4513c;
    /* renamed from: d */
    public String f4514d;
    /* renamed from: e */
    public String f4515e;

    public atw() {
        this.f4511a = "E";
        this.f4512b = -1;
        this.f4513c = "E";
        this.f4514d = "E";
        this.f4515e = "E";
    }

    public atw(String str) {
        this();
        mo724a(str);
    }

    /* renamed from: a */
    protected HashMap<Integer, Object> mo723a() {
        HashMap<Integer, Object> hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f4511a);
        hashMap.put(Integer.valueOf(4), this.f4515e);
        hashMap.put(Integer.valueOf(3), this.f4514d);
        hashMap.put(Integer.valueOf(2), this.f4513c);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f4512b));
        return hashMap;
    }

    /* renamed from: a */
    protected void mo724a(String str) {
        HashMap b = atu.m5687b(str);
        if (b != null) {
            this.f4511a = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f4512b = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f4513c = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f4514d = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f4515e = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
