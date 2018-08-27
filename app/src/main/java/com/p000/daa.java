package com.p000;

import android.util.Log;

/* renamed from: daa */
public final class daa extends rk {
    /* renamed from: a */
    private String f20880a;

    public daa(Class cls) {
        this.f20880a = cls.getSimpleName();
    }

    /* renamed from: a */
    public final void mo4272a(Object obj) {
        Log.v("NMSP_", "[" + this.f20880a + "] " + obj.toString());
    }

    /* renamed from: a */
    public final void mo4273a(Object obj, Throwable th) {
        th.printStackTrace();
        Log.e("NMSP", "[" + this.f20880a + "] " + obj.toString(), th);
    }

    /* renamed from: a */
    public final boolean mo4274a() {
        return Log.isLoggable("NMSP_", 2);
    }

    /* renamed from: b */
    public final void mo4275b(Object obj) {
        Log.d("NMSP_", "[" + this.f20880a + "] " + obj.toString());
    }

    /* renamed from: b */
    public final boolean mo4276b() {
        return Log.isLoggable("NMSP_", 3);
    }

    /* renamed from: c */
    public final void mo4277c(Object obj) {
        Log.i("NMSP", "[" + this.f20880a + "] " + obj.toString());
    }

    /* renamed from: c */
    public final boolean mo4278c() {
        return Log.isLoggable("NMSP", 4);
    }

    /* renamed from: d */
    public final void mo4279d(Object obj) {
        Log.w("NMSP", "[" + this.f20880a + "] " + obj.toString());
    }

    /* renamed from: d */
    public final boolean mo4280d() {
        return Log.isLoggable("NMSP", 5);
    }

    /* renamed from: e */
    public final void mo4281e(Object obj) {
        Log.e("NMSP", "[" + this.f20880a + "] " + obj.toString());
    }

    /* renamed from: e */
    public final boolean mo4282e() {
        return Log.isLoggable("NMSP", 6);
    }

    /* renamed from: f */
    public final void mo4283f() {
    }

    /* renamed from: g */
    public final void mo4284g() {
    }
}
