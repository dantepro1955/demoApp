package com.p000;

import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: BlitzSubAdapter */
/* renamed from: csy */
public abstract class csy<VH extends C4559a> extends C0581a<VH> {

    /* compiled from: BlitzSubAdapter */
    /* renamed from: csy$a */
    public static class C4559a extends C0605t {
        /* renamed from: a */
        private WeakReference<? extends C0581a> f20130a;

        public C4559a(View view) {
            super(view);
        }

        /* renamed from: a */
        public void m24817a(C0581a c0581a) {
            this.f20130a = new WeakReference(c0581a);
        }
    }

    public /* synthetic */ void onBindViewHolder(C0605t c0605t, int i) {
        mo4143a((C4559a) c0605t, i);
    }

    /* renamed from: a */
    public void mo4143a(VH vh, int i) {
        vh.m24817a(this);
    }
}
