package com.p000;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityDelegateCompat */
/* renamed from: hu */
public class hu {
    /* renamed from: a */
    private static final hu$b f2158a;
    /* renamed from: c */
    private static final Object f2159c = f2158a.a();
    /* renamed from: b */
    final Object f2160b = f2158a.a(this);

    static {
        if (VERSION.SDK_INT >= 16) {
            f2158a = new hu$c();
        } else if (VERSION.SDK_INT >= 14) {
            f2158a = new hu$a();
        } else {
            f2158a = new hu$d();
        }
    }

    /* renamed from: a */
    Object m2860a() {
        return this.f2160b;
    }

    /* renamed from: a */
    public void m2862a(View view, int i) {
        f2158a.a(f2159c, view, i);
    }

    /* renamed from: c */
    public void m2868c(View view, AccessibilityEvent accessibilityEvent) {
        f2158a.d(f2159c, view, accessibilityEvent);
    }

    /* renamed from: d */
    public boolean mo471d(View view, AccessibilityEvent accessibilityEvent) {
        return f2158a.a(f2159c, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo429b(View view, AccessibilityEvent accessibilityEvent) {
        f2158a.c(f2159c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo403a(View view, AccessibilityEvent accessibilityEvent) {
        f2158a.b(f2159c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo362a(View view, kg kgVar) {
        f2158a.a(f2159c, view, kgVar);
    }

    /* renamed from: a */
    public boolean mo470a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f2158a.a(f2159c, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public kp m2861a(View view) {
        return f2158a.a(f2159c, view);
    }

    /* renamed from: a */
    public boolean mo469a(View view, int i, Bundle bundle) {
        return f2158a.a(f2159c, view, i, bundle);
    }
}
