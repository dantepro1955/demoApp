package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;

@TargetApi(9)
/* compiled from: LayoutInflaterCompatBase */
/* renamed from: ie */
class ie {

    /* compiled from: LayoutInflaterCompatBase */
    /* renamed from: ie$a */
    static class C5386a implements Factory {
        /* renamed from: a */
        final ih f23864a;

        C5386a(ih ihVar) {
            this.f23864a = ihVar;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f23864a.onCreateView(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f23864a + "}";
        }
    }

    /* renamed from: a */
    static void m30765a(LayoutInflater layoutInflater, ih ihVar) {
        layoutInflater.setFactory(ihVar != null ? new C5386a(ihVar) : null);
    }

    /* renamed from: a */
    static ih m30764a(LayoutInflater layoutInflater) {
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof C5386a) {
            return ((C5386a) factory).f23864a;
        }
        return null;
    }
}
