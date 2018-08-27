package com.p000;

import android.content.Context;

/* compiled from: PointerIconCompat */
/* renamed from: ix */
public final class ix {
    /* renamed from: a */
    static final C5434c f24271a;
    /* renamed from: b */
    private Object f24272b;

    /* compiled from: PointerIconCompat */
    /* renamed from: ix$c */
    interface C5434c {
        /* renamed from: a */
        Object mo4939a(Context context, int i);
    }

    /* compiled from: PointerIconCompat */
    /* renamed from: ix$b */
    static class C5435b implements C5434c {
        C5435b() {
        }

        /* renamed from: a */
        public Object mo4939a(Context context, int i) {
            return null;
        }
    }

    /* compiled from: PointerIconCompat */
    /* renamed from: ix$a */
    static class C5436a extends C5435b {
        C5436a() {
        }

        /* renamed from: a */
        public Object mo4939a(Context context, int i) {
            return iy.m31417a(context, i);
        }
    }

    private ix(Object obj) {
        this.f24272b = obj;
    }

    /* renamed from: a */
    public Object m31416a() {
        return this.f24272b;
    }

    static {
        if (gr.m30483a()) {
            f24271a = new C5436a();
        } else {
            f24271a = new C5435b();
        }
    }

    /* renamed from: a */
    public static ix m31415a(Context context, int i) {
        return new ix(f24271a.mo4939a(context, i));
    }
}
