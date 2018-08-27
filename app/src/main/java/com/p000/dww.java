package com.p000;

import java.security.AccessController;
import java.security.PrivilegedAction;

/* compiled from: PlatformDependent */
/* renamed from: dww */
public final class dww {
    /* renamed from: a */
    private static final int f23361a = dww.m29678d();
    /* renamed from: b */
    private static final boolean f23362b = (f23361a != 0);

    /* compiled from: PlatformDependent */
    /* renamed from: dww$1 */
    static class C52151 implements PrivilegedAction<ClassLoader> {
        C52151() {
        }

        public /* synthetic */ Object run() {
            return m29674a();
        }

        /* renamed from: a */
        public ClassLoader m29674a() {
            return ClassLoader.getSystemClassLoader();
        }
    }

    /* renamed from: a */
    public static boolean m29675a() {
        return f23362b;
    }

    /* renamed from: b */
    public static int m29676b() {
        return f23361a;
    }

    /* renamed from: d */
    private static int m29678d() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION", true, dww.m29677c()).getField("SDK_INT").get(null)).intValue();
        } catch (Exception e) {
            return 0;
        }
    }

    /* renamed from: c */
    static ClassLoader m29677c() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader) AccessController.doPrivileged(new C52151());
    }
}
