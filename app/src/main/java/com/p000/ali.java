package com.p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ali */
public class ali {
    /* renamed from: a */
    Map<String, String> f1968a = new HashMap();

    /* renamed from: a */
    public Map<String, String> m2459a(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f1968a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return alo.m2504a(this.f1968a);
    }
}
