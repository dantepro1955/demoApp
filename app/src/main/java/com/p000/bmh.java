package com.p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bmh */
public final class bmh extends alo<bmh> {
    /* renamed from: a */
    private final Map<String, Object> f6965a = new HashMap();

    /* renamed from: a */
    private String m9650a(String str) {
        aoi.m4681a(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        aoi.m4682a(str, (Object) "Name can not be empty or \"&\"");
        return str;
    }

    /* renamed from: a */
    public Map<String, Object> m9651a() {
        return Collections.unmodifiableMap(this.f6965a);
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9653a((bmh) alo);
    }

    /* renamed from: a */
    public void m9653a(bmh bmh) {
        aoi.m4679a((Object) bmh);
        bmh.f6965a.putAll(this.f6965a);
    }

    /* renamed from: a */
    public void m9654a(String str, String str2) {
        this.f6965a.put(m9650a(str), str2);
    }

    public String toString() {
        return alo.m2502a((Object) this.f6965a);
    }
}
