package com.p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000.hw.C5371a;

/* compiled from: AccessibilityDelegateCompat */
/* renamed from: hu$c */
class hu$c extends hu$a {
    hu$c() {
    }

    /* renamed from: a */
    public Object mo4827a(final hu huVar) {
        return hw.m30697a(new C5371a(this) {
            /* renamed from: b */
            final /* synthetic */ hu$c f23830b;

            /* renamed from: a */
            public boolean mo4841a(View view, AccessibilityEvent accessibilityEvent) {
                return huVar.d(view, accessibilityEvent);
            }

            /* renamed from: b */
            public void mo4843b(View view, AccessibilityEvent accessibilityEvent) {
                huVar.a(view, accessibilityEvent);
            }

            /* renamed from: a */
            public void mo4839a(View view, Object obj) {
                huVar.a(view, new kg(obj));
            }

            /* renamed from: c */
            public void mo4844c(View view, AccessibilityEvent accessibilityEvent) {
                huVar.b(view, accessibilityEvent);
            }

            /* renamed from: a */
            public boolean mo4842a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return huVar.a(viewGroup, view, accessibilityEvent);
            }

            /* renamed from: a */
            public void mo4838a(View view, int i) {
                huVar.a(view, i);
            }

            /* renamed from: d */
            public void mo4845d(View view, AccessibilityEvent accessibilityEvent) {
                huVar.c(view, accessibilityEvent);
            }

            /* renamed from: a */
            public Object mo4837a(View view) {
                kp a = huVar.a(view);
                return a != null ? a.m32282a() : null;
            }

            /* renamed from: a */
            public boolean mo4840a(View view, int i, Bundle bundle) {
                return huVar.a(view, i, bundle);
            }
        });
    }

    /* renamed from: a */
    public kp mo4828a(Object obj, View view) {
        Object a = hw.m30698a(obj, view);
        if (a != null) {
            return new kp(a);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo4831a(Object obj, View view, int i, Bundle bundle) {
        return hw.m30699a(obj, view, i, bundle);
    }
}
