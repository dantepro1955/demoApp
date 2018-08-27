package com.p000;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* compiled from: UnsafeAccess */
/* renamed from: dxy */
public final class dxy {
    /* renamed from: a */
    public static final Unsafe f23451a;
    /* renamed from: b */
    private static final boolean f23452b;

    static {
        Unsafe unsafe;
        boolean z = true;
        if (System.getProperty("rx.unsafe-disable") == null) {
            z = false;
        }
        f23452b = z;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable th) {
            unsafe = null;
        }
        f23451a = unsafe;
    }

    /* renamed from: a */
    public static boolean m29783a() {
        return (f23451a == null || f23452b) ? false : true;
    }

    /* renamed from: a */
    public static long m29782a(Class<?> cls, String str) {
        try {
            return f23451a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (Throwable e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
