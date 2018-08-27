package com.p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000.hv.C5369a;

/* compiled from: AccessibilityDelegateCompat */
/* renamed from: hu$a */
class hu$a extends hu$d {
    hu$a() {
    }

    /* renamed from: a */
    public Object mo4826a() {
        return hv.m30688a();
    }

    /* renamed from: a */
    public Object mo4827a(final hu huVar) {
        return hv.m30689a(new C5369a(this) {
            /* renamed from: b */
            final /* synthetic */ hu$a f23828b;

            /* renamed from: a */
            public boolean mo4821a(View view, AccessibilityEvent accessibilityEvent) {
                return huVar.d(view, accessibilityEvent);
            }

            /* renamed from: b */
            public void mo4823b(View view, AccessibilityEvent accessibilityEvent) {
                huVar.a(view, accessibilityEvent);
            }

            /* renamed from: a */
            public void mo4820a(View view, Object obj) {
                huVar.a(view, new kg(obj));
            }

            /* renamed from: c */
            public void mo4824c(View view, AccessibilityEvent accessibilityEvent) {
                huVar.b(view, accessibilityEvent);
            }

            /* renamed from: a */
            public boolean mo4822a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return huVar.a(viewGroup, view, accessibilityEvent);
            }

            /* renamed from: a */
            public void mo4819a(View view, int i) {
                huVar.a(view, i);
            }

            /* renamed from: d */
            public void mo4825d(View view, AccessibilityEvent accessibilityEvent) {
                huVar.c(view, accessibilityEvent);
            }
        });
    }

    /* renamed from: a */
    public boolean mo4832a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return hv.m30692a(obj, view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo4834b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        hv.m30694b(obj, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo4830a(Object obj, View view, kg kgVar) {
        hv.m30691a(obj, view, kgVar.m32140a());
    }

    /* renamed from: c */
    public void mo4835c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        hv.m30695c(obj, view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo4833a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return hv.m30693a(obj, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo4829a(Object obj, View view, int i) {
        hv.m30690a(obj, view, i);
    }

    /* renamed from: d */
    public void mo4836d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        hv.m30696d(obj, view, accessibilityEvent);
    }
}
