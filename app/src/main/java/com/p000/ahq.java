package com.p000;

import android.annotation.TargetApi;
import android.os.Trace;

/* compiled from: TraceUtil */
/* renamed from: ahq */
public final class ahq {
    /* renamed from: a */
    public static void m1589a(String str) {
        if (ahr.f1511a >= 18) {
            ahq.m1591b(str);
        }
    }

    /* renamed from: a */
    public static void m1588a() {
        if (ahr.f1511a >= 18) {
            ahq.m1590b();
        }
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m1591b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    /* renamed from: b */
    private static void m1590b() {
        Trace.endSection();
    }
}
