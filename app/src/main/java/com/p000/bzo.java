package com.p000;

import android.content.Context;
import android.graphics.Rect;
import com.mopub.common.util.Dips;

/* compiled from: MraidScreenMetrics */
/* renamed from: bzo */
public class bzo {
    /* renamed from: a */
    private final Context f8301a;
    /* renamed from: b */
    private final Rect f8302b = new Rect();
    /* renamed from: c */
    private final Rect f8303c = new Rect();
    /* renamed from: d */
    private final Rect f8304d = new Rect();
    /* renamed from: e */
    private final Rect f8305e = new Rect();
    /* renamed from: f */
    private final Rect f8306f = new Rect();
    /* renamed from: g */
    private final Rect f8307g = new Rect();
    /* renamed from: h */
    private final Rect f8308h = new Rect();
    /* renamed from: i */
    private final Rect f8309i = new Rect();
    /* renamed from: j */
    private final float f8310j;

    public bzo(Context context, float f) {
        this.f8301a = context.getApplicationContext();
        this.f8310j = f;
    }

    /* renamed from: a */
    private void m11907a(Rect rect, Rect rect2) {
        rect2.set(Dips.pixelsToIntDips((float) rect.left, this.f8301a), Dips.pixelsToIntDips((float) rect.top, this.f8301a), Dips.pixelsToIntDips((float) rect.right, this.f8301a), Dips.pixelsToIntDips((float) rect.bottom, this.f8301a));
    }

    public float getDensity() {
        return this.f8310j;
    }

    /* renamed from: a */
    public void m11909a(int i, int i2) {
        this.f8302b.set(0, 0, i, i2);
        m11907a(this.f8302b, this.f8303c);
    }

    /* renamed from: a */
    public Rect m11908a() {
        return this.f8303c;
    }

    /* renamed from: a */
    public void m11910a(int i, int i2, int i3, int i4) {
        this.f8304d.set(i, i2, i + i3, i2 + i4);
        m11907a(this.f8304d, this.f8305e);
    }

    /* renamed from: b */
    public Rect m11911b() {
        return this.f8304d;
    }

    /* renamed from: c */
    public Rect m11913c() {
        return this.f8305e;
    }

    /* renamed from: b */
    public void m11912b(int i, int i2, int i3, int i4) {
        this.f8306f.set(i, i2, i + i3, i2 + i4);
        m11907a(this.f8306f, this.f8307g);
    }

    /* renamed from: d */
    public Rect m11915d() {
        return this.f8307g;
    }

    /* renamed from: c */
    public void m11914c(int i, int i2, int i3, int i4) {
        this.f8308h.set(i, i2, i + i3, i2 + i4);
        m11907a(this.f8308h, this.f8309i);
    }

    /* renamed from: e */
    public Rect m11916e() {
        return this.f8308h;
    }

    /* renamed from: f */
    public Rect m11917f() {
        return this.f8309i;
    }
}
