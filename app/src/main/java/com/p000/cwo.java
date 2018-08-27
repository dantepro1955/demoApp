package com.p000;

import android.view.animation.Interpolator;

/* compiled from: Keyframe */
/* renamed from: cwo */
public abstract class cwo implements Cloneable {
    /* renamed from: a */
    float f20380a;
    /* renamed from: b */
    Class f20381b;
    /* renamed from: c */
    boolean f20382c = false;
    /* renamed from: d */
    private Interpolator f20383d = null;

    /* compiled from: Keyframe */
    /* renamed from: cwo$a */
    static class C4625a extends cwo {
        /* renamed from: d */
        float f20384d;

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            return m25245g();
        }

        /* renamed from: e */
        public /* synthetic */ cwo mo4188e() {
            return m25245g();
        }

        C4625a(float f, float f2) {
            this.a = f;
            this.f20384d = f2;
            this.b = Float.TYPE;
            this.c = true;
        }

        C4625a(float f) {
            this.a = f;
            this.b = Float.TYPE;
        }

        /* renamed from: f */
        public float m25244f() {
            return this.f20384d;
        }

        /* renamed from: b */
        public Object mo4186b() {
            return Float.valueOf(this.f20384d);
        }

        /* renamed from: a */
        public void mo4185a(Object obj) {
            if (obj != null && obj.getClass() == Float.class) {
                this.f20384d = ((Float) obj).floatValue();
                this.c = true;
            }
        }

        /* renamed from: g */
        public C4625a m25245g() {
            C4625a c4625a = new C4625a(m25238c(), this.f20384d);
            c4625a.m25234a(m25239d());
            return c4625a;
        }
    }

    /* renamed from: a */
    public abstract void mo4185a(Object obj);

    /* renamed from: b */
    public abstract Object mo4186b();

    /* renamed from: e */
    public abstract cwo mo4188e();

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return mo4188e();
    }

    /* renamed from: a */
    public static cwo m25233a(float f, float f2) {
        return new C4625a(f, f2);
    }

    /* renamed from: a */
    public static cwo m25232a(float f) {
        return new C4625a(f);
    }

    /* renamed from: a */
    public boolean m25236a() {
        return this.f20382c;
    }

    /* renamed from: c */
    public float m25238c() {
        return this.f20380a;
    }

    /* renamed from: d */
    public Interpolator m25239d() {
        return this.f20383d;
    }

    /* renamed from: a */
    public void m25234a(Interpolator interpolator) {
        this.f20383d = interpolator;
    }
}
