package com.p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: alg */
public class alg {
    /* renamed from: a */
    Map<String, String> f1966a = new HashMap();

    /* renamed from: a */
    public Map<String, String> m2457a(String str) {
        Map<String, String> hashMap = new HashMap();
        for (Entry entry : this.f1966a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf((String) entry.getKey());
            hashMap.put(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), (String) entry.getValue());
        }
        return hashMap;
    }

    public String toString() {
        return alo.m2504a(this.f1966a);
    }
}
