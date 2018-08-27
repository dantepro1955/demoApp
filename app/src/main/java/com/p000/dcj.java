package com.p000;

import android.os.Parcelable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.view.View;

/* compiled from: VerticalScrollingBehavior */
/* renamed from: dcj */
abstract class dcj<V extends View> extends Behavior<V> {
    /* renamed from: a */
    private int f21127a = 0;
    /* renamed from: b */
    private int f21128b = 0;
    /* renamed from: c */
    private int f21129c = 0;
    /* renamed from: d */
    private int f21130d = 0;

    /* renamed from: a */
    abstract void mo4317a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* renamed from: a */
    abstract void mo4318a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3);

    /* renamed from: a */
    abstract boolean mo4319a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, int i);

    dcj() {
    }

    /* renamed from: a */
    public boolean m26331a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return (i & 2) != 0;
    }

    /* renamed from: b */
    public void m26333b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        super.b(coordinatorLayout, v, view, view2, i);
    }

    /* renamed from: a */
    public void m26324a(CoordinatorLayout coordinatorLayout, V v, View view) {
        super.a(coordinatorLayout, v, view);
    }

    /* renamed from: a */
    public void m26325a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        super.a(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i4 > 0 && this.f21127a < 0) {
            this.f21127a = 0;
            this.f21129c = 1;
        } else if (i4 < 0 && this.f21127a > 0) {
            this.f21127a = 0;
            this.f21129c = -1;
        }
        this.f21127a += i4;
        mo4317a(coordinatorLayout, (View) v, this.f21129c, i2, this.f21127a);
    }

    /* renamed from: a */
    public void m26326a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        super.a(coordinatorLayout, v, view, i, i2, iArr);
        if (i2 > 0 && this.f21128b < 0) {
            this.f21128b = 0;
            this.f21130d = 1;
        } else if (i2 < 0 && this.f21128b > 0) {
            this.f21128b = 0;
            this.f21130d = -1;
        }
        this.f21128b += i2;
        mo4318a(coordinatorLayout, (View) v, view, i, i2, iArr, this.f21130d);
    }

    /* renamed from: a */
    public boolean m26330a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        super.a(coordinatorLayout, v, view, f, f2, z);
        this.f21130d = f2 > 0.0f ? 1 : -1;
        return mo4319a(coordinatorLayout, (View) v, view, f, f2, this.f21130d);
    }

    /* renamed from: a */
    public boolean m26328a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return super.a(coordinatorLayout, v, view, f, f2);
    }

    /* renamed from: a */
    public kb m26322a(CoordinatorLayout coordinatorLayout, V v, kb kbVar) {
        return super.a(coordinatorLayout, v, kbVar);
    }

    /* renamed from: b */
    public Parcelable m26332b(CoordinatorLayout coordinatorLayout, V v) {
        return super.b(coordinatorLayout, v);
    }
}
