package com.p000;

import java.util.HashMap;

/* compiled from: HashMapUtil */
/* renamed from: djn */
public class djn {
    /* renamed from: a */
    public static void m27596a(HashMap<String, String> hashMap, HashMap<String, String> hashMap2) {
        for (String str : hashMap2.keySet()) {
            if (hashMap2.get(str) != null) {
                hashMap.put(str, hashMap2.get(str));
            }
        }
    }
}
