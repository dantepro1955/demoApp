package com.p000;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build.VERSION;

/* compiled from: EdgeEffectCompat */
/* renamed from: lj */
public final class lj {
    /* renamed from: b */
    private static final lj$c f16879b;
    /* renamed from: a */
    private Object f16880a;

    static {
        if (VERSION.SDK_INT >= 21) {
            f16879b = new lj$d();
        } else if (VERSION.SDK_INT >= 14) {
            f16879b = new lj$b();
        } else {
            f16879b = new lj$a();
        }
    }

    public lj(Context context) {
        this.f16880a = f16879b.a(context);
    }

    /* renamed from: a */
    public void m21281a(int i, int i2) {
        f16879b.a(this.f16880a, i, i2);
    }

    /* renamed from: a */
    public boolean m21282a() {
        return f16879b.a(this.f16880a);
    }

    /* renamed from: b */
    public void m21287b() {
        f16879b.b(this.f16880a);
    }

    @Deprecated
    /* renamed from: a */
    public boolean m21283a(float f) {
        return f16879b.a(this.f16880a, f);
    }

    /* renamed from: a */
    public boolean m21284a(float f, float f2) {
        return f16879b.a(this.f16880a, f, f2);
    }

    /* renamed from: c */
    public boolean m21288c() {
        return f16879b.c(this.f16880a);
    }

    /* renamed from: a */
    public boolean m21285a(int i) {
        return f16879b.a(this.f16880a, i);
    }

    /* renamed from: a */
    public boolean m21286a(Canvas canvas) {
        return f16879b.a(this.f16880a, canvas);
    }
}
