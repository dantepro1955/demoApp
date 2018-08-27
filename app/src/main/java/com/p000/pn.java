package com.p000;

import android.support.v7.widget.RecyclerView.C0597m;
import android.support.v7.widget.RecyclerView.C0602q;
import android.view.View;

/* compiled from: LayoutState */
/* renamed from: pn */
public class pn {
    /* renamed from: a */
    public boolean f25107a = true;
    /* renamed from: b */
    public int f25108b;
    /* renamed from: c */
    public int f25109c;
    /* renamed from: d */
    public int f25110d;
    /* renamed from: e */
    public int f25111e;
    /* renamed from: f */
    public int f25112f = 0;
    /* renamed from: g */
    public int f25113g = 0;
    /* renamed from: h */
    public boolean f25114h;
    /* renamed from: i */
    public boolean f25115i;

    /* renamed from: a */
    public boolean m33641a(C0602q c0602q) {
        return this.f25109c >= 0 && this.f25109c < c0602q.e();
    }

    /* renamed from: a */
    public View m33640a(C0597m c0597m) {
        View c = c0597m.c(this.f25109c);
        this.f25109c += this.f25110d;
        return c;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f25108b + ", mCurrentPosition=" + this.f25109c + ", mItemDirection=" + this.f25110d + ", mLayoutDirection=" + this.f25111e + ", mStartLine=" + this.f25112f + ", mEndLine=" + this.f25113g + '}';
    }
}
