package com.p000;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat */
/* renamed from: ke */
public final class ke {
    /* renamed from: a */
    private static final C5469e f24306a;

    /* compiled from: AccessibilityEventCompat */
    /* renamed from: ke$e */
    interface C5469e {
        /* renamed from: a */
        int mo5050a(AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        void mo5051a(AccessibilityEvent accessibilityEvent, int i);
    }

    /* compiled from: AccessibilityEventCompat */
    /* renamed from: ke$d */
    static class C5470d implements C5469e {
        C5470d() {
        }

        /* renamed from: a */
        public void mo5051a(AccessibilityEvent accessibilityEvent, int i) {
        }

        /* renamed from: a */
        public int mo5050a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }
    }

    /* compiled from: AccessibilityEventCompat */
    /* renamed from: ke$a */
    static class C5471a extends C5470d {
        C5471a() {
        }
    }

    /* compiled from: AccessibilityEventCompat */
    /* renamed from: ke$b */
    static class C5472b extends C5471a {
        C5472b() {
        }
    }

    /* compiled from: AccessibilityEventCompat */
    /* renamed from: ke$c */
    static class C5473c extends C5472b {
        C5473c() {
        }

        /* renamed from: a */
        public void mo5051a(AccessibilityEvent accessibilityEvent, int i) {
            kf.m31925a(accessibilityEvent, i);
        }

        /* renamed from: a */
        public int mo5050a(AccessibilityEvent accessibilityEvent) {
            return kf.m31924a(accessibilityEvent);
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f24306a = new C5473c();
        } else if (VERSION.SDK_INT >= 16) {
            f24306a = new C5472b();
        } else if (VERSION.SDK_INT >= 14) {
            f24306a = new C5471a();
        } else {
            f24306a = new C5470d();
        }
    }

    /* renamed from: a */
    public static ks m31921a(AccessibilityEvent accessibilityEvent) {
        return new ks(accessibilityEvent);
    }

    /* renamed from: a */
    public static void m31922a(AccessibilityEvent accessibilityEvent, int i) {
        f24306a.mo5051a(accessibilityEvent, i);
    }

    /* renamed from: b */
    public static int m31923b(AccessibilityEvent accessibilityEvent) {
        return f24306a.mo5050a(accessibilityEvent);
    }
}
