package com.p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: alh */
public class alh {
    /* renamed from: a */
    Map<String, String> f1967a;

    /* renamed from: a */
    public Map<String, String> m2458a() {
        return new HashMap(this.f1967a);
    }

    public String toString() {
        Map hashMap = new HashMap();
        for (Entry entry : this.f1967a.entrySet()) {
            if (((String) entry.getKey()).startsWith("&")) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return alo.m2504a(hashMap);
    }
}
