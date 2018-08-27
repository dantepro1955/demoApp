package com.p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: bmf */
public final class bmf extends alo<bmf> {
    /* renamed from: a */
    private Map<Integer, String> f6963a = new HashMap(4);

    /* renamed from: a */
    public Map<Integer, String> m9644a() {
        return Collections.unmodifiableMap(this.f6963a);
    }

    /* renamed from: a */
    public /* synthetic */ void mo1348a(alo alo) {
        m9646a((bmf) alo);
    }

    /* renamed from: a */
    public void m9646a(bmf bmf) {
        bmf.f6963a.putAll(this.f6963a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f6963a.entrySet()) {
            String valueOf = String.valueOf(entry.getKey());
            hashMap.put(new StringBuilder(String.valueOf(valueOf).length() + 9).append("dimension").append(valueOf).toString(), entry.getValue());
        }
        return alo.m2502a((Object) hashMap);
    }
}
