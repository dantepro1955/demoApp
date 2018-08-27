package com.p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: apu */
public final class apu {
    /* renamed from: a */
    public static <K, V> Map<K, V> m4877a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map hhVar = new hh(6);
        hhVar.put(k, v);
        hhVar.put(k2, v2);
        hhVar.put(k3, v3);
        hhVar.put(k4, v4);
        hhVar.put(k5, v5);
        hhVar.put(k6, v6);
        return Collections.unmodifiableMap(hhVar);
    }

    /* renamed from: a */
    public static <T> Set<T> m4878a() {
        return Collections.emptySet();
    }

    /* renamed from: a */
    public static <T> Set<T> m4879a(T t) {
        return Collections.singleton(t);
    }

    /* renamed from: a */
    public static <T> Set<T> m4880a(T t, T t2) {
        Set apr = new apr(2);
        apr.add(t);
        apr.add(t2);
        return Collections.unmodifiableSet(apr);
    }

    /* renamed from: a */
    public static <T> Set<T> m4881a(T t, T t2, T t3) {
        Set apr = new apr(3);
        apr.add(t);
        apr.add(t2);
        apr.add(t3);
        return Collections.unmodifiableSet(apr);
    }

    /* renamed from: a */
    public static <T> Set<T> m4882a(T t, T t2, T t3, T t4) {
        Set apr = new apr(4);
        apr.add(t);
        apr.add(t2);
        apr.add(t3);
        apr.add(t4);
        return Collections.unmodifiableSet(apr);
    }

    /* renamed from: a */
    public static <T> Set<T> m4883a(T... tArr) {
        switch (tArr.length) {
            case 0:
                return apu.m4878a();
            case 1:
                return apu.m4879a(tArr[0]);
            case 2:
                return apu.m4880a(tArr[0], tArr[1]);
            case 3:
                return apu.m4881a(tArr[0], tArr[1], tArr[2]);
            case 4:
                return apu.m4882a(tArr[0], tArr[1], tArr[2], tArr[3]);
            default:
                return Collections.unmodifiableSet(tArr.length <= 32 ? new apr(Arrays.asList(tArr)) : new HashSet(Arrays.asList(tArr)));
        }
    }

    /* renamed from: b */
    public static <K, V> Map<K, V> m4884b(K k, V v) {
        return Collections.singletonMap(k, v);
    }
}
