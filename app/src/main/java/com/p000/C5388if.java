package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;
import p000.ie.C5386a;

@TargetApi(11)
/* compiled from: LayoutInflaterCompatHC */
/* renamed from: if */
class C5388if {
    /* renamed from: a */
    private static Field f23865a;
    /* renamed from: b */
    private static boolean f23866b;

    /* compiled from: LayoutInflaterCompatHC */
    /* renamed from: if$a */
    static class C5387a extends C5386a implements Factory2 {
        C5387a(ih ihVar) {
            super(ihVar);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.a.onCreateView(view, str, context, attributeSet);
        }
    }

    /* renamed from: a */
    static void m30767a(LayoutInflater layoutInflater, ih ihVar) {
        Factory2 c5387a;
        if (ihVar != null) {
            c5387a = new C5387a(ihVar);
        } else {
            c5387a = null;
        }
        layoutInflater.setFactory2(c5387a);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            C5388if.m30766a(layoutInflater, (Factory2) factory);
        } else {
            C5388if.m30766a(layoutInflater, c5387a);
        }
    }

    /* renamed from: a */
    static void m30766a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f23866b) {
            try {
                f23865a = LayoutInflater.class.getDeclaredField("mFactory2");
                f23865a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f23866b = true;
        }
        if (f23865a != null) {
            try {
                f23865a.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
