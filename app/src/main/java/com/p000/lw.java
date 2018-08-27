package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: ScrollerCompat */
/* renamed from: lw */
public final class lw {
    /* renamed from: a */
    OverScroller f24455a;
    /* renamed from: b */
    private final boolean f24456b;

    /* renamed from: a */
    public static lw m32509a(Context context) {
        return lw.m32510a(context, null);
    }

    /* renamed from: a */
    public static lw m32510a(Context context, Interpolator interpolator) {
        return new lw(VERSION.SDK_INT >= 14, context, interpolator);
    }

    lw(boolean z, Context context, Interpolator interpolator) {
        this.f24456b = z;
        this.f24455a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    /* renamed from: a */
    public boolean m32515a() {
        return this.f24455a.isFinished();
    }

    /* renamed from: b */
    public int m32517b() {
        return this.f24455a.getCurrX();
    }

    /* renamed from: c */
    public int m32518c() {
        return this.f24455a.getCurrY();
    }

    /* renamed from: d */
    public int m32519d() {
        return this.f24455a.getFinalX();
    }

    /* renamed from: e */
    public int m32520e() {
        return this.f24455a.getFinalY();
    }

    /* renamed from: f */
    public float m32521f() {
        return this.f24456b ? lx.m32524a(this.f24455a) : 0.0f;
    }

    /* renamed from: g */
    public boolean m32522g() {
        return this.f24455a.computeScrollOffset();
    }

    /* renamed from: a */
    public void m32511a(int i, int i2, int i3, int i4) {
        this.f24455a.startScroll(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void m32512a(int i, int i2, int i3, int i4, int i5) {
        this.f24455a.startScroll(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void m32513a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f24455a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public void m32514a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f24455a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: a */
    public boolean m32516a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f24455a.springBack(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: h */
    public void m32523h() {
        this.f24455a.abortAnimation();
    }
}
