package com.p000;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;

/* compiled from: TileAdapter */
/* renamed from: dmc */
public abstract class dmc {
    /* renamed from: a */
    private int f22128a;
    /* renamed from: b */
    private int f22129b;
    /* renamed from: c */
    private int f22130c;
    /* renamed from: d */
    private int f22131d;
    /* renamed from: e */
    private int f22132e;
    /* renamed from: f */
    private int f22133f;
    /* renamed from: g */
    private int f22134g;
    /* renamed from: h */
    private int f22135h;
    /* renamed from: i */
    private WeakReference<C4515a> f22136i;

    /* compiled from: TileAdapter */
    /* renamed from: dmc$a */
    public interface C4515a {
    }

    /* renamed from: a */
    public abstract Bitmap mo4443a(int i, int i2);

    /* renamed from: a */
    public abstract Bitmap mo4444a(int i, int i2, int i3);

    /* renamed from: b */
    public abstract Bitmap mo4445b(int i, int i2);

    public dmc(int i, int i2, int i3, int i4) {
        this.f22128a = ((i2 + i4) - 1) / i4;
        this.f22129b = ((i + i3) - 1) / i3;
        this.f22130c = i;
        this.f22131d = i2;
        this.f22132e = i3;
        this.f22133f = i4;
    }

    /* renamed from: c */
    public void m27917c(int i, int i2) {
    }

    /* renamed from: a */
    public void m27913a(C4515a c4515a) {
        this.f22136i = new WeakReference(c4515a);
    }

    /* renamed from: a */
    public int mo4446a() {
        return this.f22128a;
    }

    /* renamed from: b */
    public int mo4447b() {
        return this.f22129b;
    }

    /* renamed from: d */
    public int m27918d() {
        return this.f22130c;
    }

    /* renamed from: e */
    public int m27919e() {
        return this.f22131d;
    }

    /* renamed from: f */
    public int m27920f() {
        return this.f22132e;
    }

    /* renamed from: g */
    public int m27921g() {
        return this.f22133f;
    }

    /* renamed from: a */
    public void m27912a(int i) {
        this.f22134g = i;
    }

    /* renamed from: b */
    public void m27916b(int i) {
        this.f22135h = i;
    }

    /* renamed from: h */
    public int m27922h() {
        return this.f22134g;
    }

    /* renamed from: i */
    public int m27923i() {
        return this.f22135h;
    }
}
