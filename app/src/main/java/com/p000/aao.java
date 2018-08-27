package com.p000;

import android.app.Activity;
import java.util.Collections;
import java.util.Map;

/* compiled from: SessionEvent */
/* renamed from: aao */
final class aao {
    /* renamed from: a */
    public final aap f100a;
    /* renamed from: b */
    public final long f101b;
    /* renamed from: c */
    public final C0006b f102c;
    /* renamed from: d */
    public final Map<String, String> f103d;
    /* renamed from: e */
    public final String f104e;
    /* renamed from: f */
    public final Map<String, Object> f105f;
    /* renamed from: g */
    public final String f106g;
    /* renamed from: h */
    public final Map<String, Object> f107h;
    /* renamed from: i */
    private String f108i;

    /* compiled from: SessionEvent */
    /* renamed from: aao$a */
    static class C0005a {
        /* renamed from: a */
        final C0006b f84a;
        /* renamed from: b */
        final long f85b = System.currentTimeMillis();
        /* renamed from: c */
        Map<String, String> f86c = null;
        /* renamed from: d */
        String f87d = null;
        /* renamed from: e */
        Map<String, Object> f88e = null;
        /* renamed from: f */
        String f89f = null;
        /* renamed from: g */
        Map<String, Object> f90g = null;

        public C0005a(C0006b c0006b) {
            this.f84a = c0006b;
        }

        /* renamed from: a */
        public C0005a m98a(Map<String, String> map) {
            this.f86c = map;
            return this;
        }

        /* renamed from: b */
        public C0005a m100b(Map<String, Object> map) {
            this.f88e = map;
            return this;
        }

        /* renamed from: a */
        public aao m99a(aap aap) {
            return new aao(aap, this.f85b, this.f84a, this.f86c, this.f87d, this.f88e, this.f89f, this.f90g);
        }
    }

    /* compiled from: SessionEvent */
    /* renamed from: aao$b */
    enum C0006b {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    /* renamed from: a */
    public static C0005a m102a(C0006b c0006b, Activity activity) {
        return new C0005a(c0006b).m98a(Collections.singletonMap("activity", activity.getClass().getName()));
    }

    /* renamed from: a */
    public static C0005a m101a(long j) {
        return new C0005a(C0006b.INSTALL).m98a(Collections.singletonMap("installedAt", String.valueOf(j)));
    }

    /* renamed from: a */
    public static C0005a m103a(String str) {
        return new C0005a(C0006b.CRASH).m98a(Collections.singletonMap("sessionId", str));
    }

    /* renamed from: a */
    public static C0005a m104a(String str, String str2) {
        return aao.m103a(str).m100b(Collections.singletonMap("exceptionName", str2));
    }

    private aao(aap aap, long j, C0006b c0006b, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.f100a = aap;
        this.f101b = j;
        this.f102c = c0006b;
        this.f103d = map;
        this.f104e = str;
        this.f105f = map2;
        this.f106g = str2;
        this.f107h = map3;
    }

    public String toString() {
        if (this.f108i == null) {
            this.f108i = "[" + getClass().getSimpleName() + ": " + "timestamp=" + this.f101b + ", type=" + this.f102c + ", details=" + this.f103d + ", customType=" + this.f104e + ", customAttributes=" + this.f105f + ", predefinedType=" + this.f106g + ", predefinedAttributes=" + this.f107h + ", metadata=[" + this.f100a + "]]";
        }
        return this.f108i;
    }
}
