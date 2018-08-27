package com.p000;

import java.util.HashMap;

/* compiled from: Otto */
/* renamed from: dhe */
public class dhe {
    /* renamed from: a */
    private static final HashMap<String, dgz> f21627a = new HashMap();

    /* renamed from: a */
    public static dgz m27280a() {
        return dhe.m27281a("__global__");
    }

    /* renamed from: a */
    public static dgz m27281a(String str) {
        if (str == null) {
            return dhe.m27280a();
        }
        if (f21627a.containsKey(str)) {
            return (dgz) f21627a.get(str);
        }
        dgz dgz = new dgz(dhh.f21628a);
        f21627a.put(str, dgz);
        return dgz;
    }

    /* renamed from: a */
    public static void m27282a(Object obj) {
        dhe.m27280a().m27263a(obj);
    }

    /* renamed from: a */
    public static void m27283a(String str, Object obj) {
        dhe.m27281a(str).m27263a(obj);
    }

    /* renamed from: b */
    public static void m27284b(Object obj) {
        try {
            dhe.m27280a().m27266b(obj);
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public static void m27285b(String str, Object obj) {
        try {
            dhe.m27281a(str).m27266b(obj);
        } catch (Exception e) {
        }
    }

    /* renamed from: c */
    public static void m27286c(Object obj) {
        dhe.m27280a().m27269c(obj);
    }

    /* renamed from: c */
    public static void m27287c(String str, Object obj) {
        dhe.m27281a(str).m27269c(obj);
    }
}
