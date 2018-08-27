package com.p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: dqf */
public final class dqf {
    public dqf() {
        dnn.m28258a(getClass());
    }

    /* renamed from: a */
    public static Class<?> m28716a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("getClassForName failed", e);
        }
    }

    /* renamed from: a */
    public static Object m28717a(Class<?> cls, String str) {
        try {
            return cls.getField(str).get(null);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("getFieldValue failed", e);
        }
    }

    /* renamed from: a */
    public static Object m28718a(Class<?> cls, String str, Object obj) {
        try {
            obj = cls.getField(str).get(null);
        } catch (Exception e) {
        }
        return obj;
    }

    /* renamed from: a */
    public static Constructor<?> m28719a(Class<?> cls, Class<?>... clsArr) {
        try {
            return cls.getConstructor(clsArr);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("getConstructor failed", e);
        }
    }

    /* renamed from: a */
    public static Method m28720a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (Throwable e) {
            e.printStackTrace();
            throw new RuntimeException("getMethod failed", e);
        }
    }

    /* renamed from: b */
    public static Method m28721b(Class<?> cls, String str, Class<?>... clsArr) {
        Method method = null;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (Exception e) {
        }
        return method;
    }
}
