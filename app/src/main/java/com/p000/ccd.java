package com.p000;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;

/* compiled from: AbstractThemeableRecyclerViewHolder */
/* renamed from: ccd */
public abstract class ccd extends C0605t {
    /* renamed from: e */
    public cnt f8523e;

    /* renamed from: a */
    protected abstract void mo1630a();

    public ccd(View view, cnt cnt) {
        super(view);
        this.f8523e = cnt;
    }

    /* renamed from: a */
    public void m12160a(cnt cnt) {
        this.f8523e = cnt;
        mo1630a();
    }

    /* renamed from: a */
    protected int m12158a(int i) {
        return this.itemView.getContext().getResources().getColor(i);
    }

    /* renamed from: b */
    protected Drawable m12161b(int i) {
        return ew.m21136a(this.itemView.getContext(), i);
    }
}
