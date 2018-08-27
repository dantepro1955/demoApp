package com.p000;

import android.view.View;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* compiled from: ViewCompat */
/* renamed from: jd$e */
class jd$e extends jd$c {
    /* renamed from: b */
    static Field f24275b;
    /* renamed from: c */
    static boolean f24276c = false;

    jd$e() {
    }

    /* renamed from: a */
    public boolean mo4975a(View view, int i) {
        return jh.m31709a(view, i);
    }

    /* renamed from: b */
    public boolean mo4981b(View view, int i) {
        return jh.m31711b(view, i);
    }

    /* renamed from: a */
    public void mo4971a(View view, kg kgVar) {
        jh.m31710b(view, kgVar.m32140a());
    }

    /* renamed from: a */
    public void mo4966a(View view, hu huVar) {
        Object obj;
        if (huVar == null) {
            obj = null;
        } else {
            obj = huVar.a();
        }
        jh.m31707a(view, obj);
    }

    /* renamed from: a */
    public boolean mo4974a(View view) {
        boolean z = true;
        if (f24276c) {
            return false;
        }
        if (f24275b == null) {
            try {
                f24275b = View.class.getDeclaredField("mAccessibilityDelegate");
                f24275b.setAccessible(true);
            } catch (Throwable th) {
                f24276c = true;
                return false;
            }
        }
        try {
            if (f24275b.get(view) == null) {
                z = false;
            }
            return z;
        } catch (Throwable th2) {
            f24276c = true;
            return false;
        }
    }

    /* renamed from: v */
    public ju mo5012v(View view) {
        if (this.a == null) {
            this.a = new WeakHashMap();
        }
        ju juVar = (ju) this.a.get(view);
        if (juVar != null) {
            return juVar;
        }
        juVar = new ju(view);
        this.a.put(view, juVar);
        return juVar;
    }

    /* renamed from: a */
    public void mo4972a(View view, boolean z) {
        jh.m31708a(view, z);
    }
}
