package com.p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: AnnotatedHandlerFinder */
/* renamed from: dgy */
final class dgy {
    /* renamed from: a */
    private static final Map<Class<?>, Map<Class<?>, Method>> f21602a = new HashMap();
    /* renamed from: b */
    private static final Map<Class<?>, Map<Class<?>, Set<Method>>> f21603b = new HashMap();

    /* renamed from: a */
    private static void m27254a(Class<?> cls) {
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        for (Method method : cls.getMethods()) {
            Class[] parameterTypes;
            if (method.isAnnotationPresent(dhg.class)) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation but requires " + parameterTypes.length + " arguments.  Methods must require a single argument.");
                }
                Class cls2 = parameterTypes[0];
                if (cls2.isInterface()) {
                    throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " which is an interface.  Subscription must be on a concrete class type.");
                } else if ((method.getModifiers() & 1) == 0) {
                    throw new IllegalArgumentException("Method " + method + " has @Subscribe annotation on " + cls2 + " but is not 'public'.");
                } else {
                    Set set = (Set) hashMap.get(cls2);
                    if (set == null) {
                        set = new HashSet();
                        hashMap.put(cls2, set);
                    }
                    set.add(method);
                }
            } else if (method.isAnnotationPresent(dhf.class)) {
                parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 0) {
                    throw new IllegalArgumentException("Method " + method + "has @Produce annotation but requires " + parameterTypes.length + " arguments.  Methods must require zero arguments.");
                } else if (method.getReturnType() == Void.class) {
                    throw new IllegalArgumentException("Method " + method + " has a return type of void.  Must declare a non-void type.");
                } else {
                    Class returnType = method.getReturnType();
                    if (returnType.isInterface()) {
                        throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " which is an interface.  Producers must return a concrete class type.");
                    } else if (returnType.equals(Void.TYPE)) {
                        throw new IllegalArgumentException("Method " + method + " has @Produce annotation but has no return type.");
                    } else if ((method.getModifiers() & 1) == 0) {
                        throw new IllegalArgumentException("Method " + method + " has @Produce annotation on " + returnType + " but is not 'public'.");
                    } else if (hashMap2.containsKey(returnType)) {
                        throw new IllegalArgumentException("Producer for type " + returnType + " has already been registered.");
                    } else {
                        hashMap2.put(returnType, method);
                    }
                }
            } else {
                continue;
            }
        }
        f21602a.put(cls, hashMap2);
        f21603b.put(cls, hashMap);
    }

    /* renamed from: a */
    static Map<Class<?>, dhc> m27253a(Object obj) {
        Class cls = obj.getClass();
        Map<Class<?>, dhc> hashMap = new HashMap();
        if (!f21602a.containsKey(cls)) {
            dgy.m27254a(cls);
        }
        Map map = (Map) f21602a.get(cls);
        if (!map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                hashMap.put(entry.getKey(), new dhc(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    static Map<Class<?>, Set<dhb>> m27255b(Object obj) {
        Class cls = obj.getClass();
        Map<Class<?>, Set<dhb>> hashMap = new HashMap();
        if (!f21603b.containsKey(cls)) {
            dgy.m27254a(cls);
        }
        Map map = (Map) f21603b.get(cls);
        if (!map.isEmpty()) {
            for (Entry entry : map.entrySet()) {
                Set hashSet = new HashSet();
                for (Method dhb : (Set) entry.getValue()) {
                    hashSet.add(new dhb(obj, dhb));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }
}
