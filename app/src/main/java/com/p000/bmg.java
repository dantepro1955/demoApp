package com.p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bmg */
public final class bmg extends alo<bmg> {
    /* renamed from: a */
    private Map<Integer, Double> f6964a = new HashMap(4);

    /* renamed from: a */
    public Map<Integer, Double> m9647a() {
        return Collections.unmodifiableMap(this.f6964a);
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9649a((bmg) alo);
    }

    /* renamed from: a */
    public void m9649a(bmg bmg) {
        bmg.f6964a.putAll(this.f6964a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f6964a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 6).append("metric").append(valueOf).toString(), entry.getValue());
        }
        return alo.m2502a((Object) hashMap);
    }
}
