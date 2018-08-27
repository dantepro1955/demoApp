package com.p000;

import java.util.Map.Entry;
import java.util.Set;

/* compiled from: JsonObject */
/* renamed from: buk */
public final class buk extends buh {
    /* renamed from: a */
    private final bvf<String, buh> f7703a = new bvf();

    /* renamed from: a */
    public void m11086a(String str, buh buh) {
        if (buh == null) {
            buh = buj.f7702a;
        }
        this.f7703a.put(str, buh);
    }

    /* renamed from: a */
    public Set<Entry<String, buh>> m11085a() {
        return this.f7703a.entrySet();
    }

    /* renamed from: a */
    public boolean m11087a(String str) {
        return this.f7703a.containsKey(str);
    }

    /* renamed from: b */
    public buh m11088b(String str) {
        return (buh) this.f7703a.get(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof buk) && ((buk) obj).f7703a.equals(this.f7703a));
    }

    public int hashCode() {
        return this.f7703a.hashCode();
    }
}
