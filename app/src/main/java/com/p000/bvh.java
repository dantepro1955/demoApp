package com.p000;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Primitives */
/* renamed from: bvh */
public final class bvh {
    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f7781a;
    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f7782b;

    static {
        Map hashMap = new HashMap(16);
        Map hashMap2 = new HashMap(16);
        bvh.m11186a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        bvh.m11186a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        bvh.m11186a(hashMap, hashMap2, Character.TYPE, Character.class);
        bvh.m11186a(hashMap, hashMap2, Double.TYPE, Double.class);
        bvh.m11186a(hashMap, hashMap2, Float.TYPE, Float.class);
        bvh.m11186a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        bvh.m11186a(hashMap, hashMap2, Long.TYPE, Long.class);
        bvh.m11186a(hashMap, hashMap2, Short.TYPE, Short.class);
        bvh.m11186a(hashMap, hashMap2, Void.TYPE, Void.class);
        f7781a = Collections.unmodifiableMap(hashMap);
        f7782b = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m11186a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m11187a(Type type) {
        return f7781a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m11185a(Class<T> cls) {
        Class<T> cls2 = (Class) f7781a.get(buz.m11115a((Object) cls));
        return cls2 == null ? cls : cls2;
    }
}
