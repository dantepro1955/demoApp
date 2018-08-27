package com.p000;

import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import p000.csa.C4551e;

/* compiled from: BlitzAdapter */
/* renamed from: csb */
public class csb<E extends crz> extends C0581a {
    /* renamed from: c */
    public static final int f20072c = C4551e.blitz_item;
    /* renamed from: d */
    public static final int f20073d = C4551e.blitz_has_next;
    /* renamed from: a */
    private crw<E> f20074a;
    /* renamed from: b */
    private cse<E> f20075b;
    /* renamed from: e */
    protected boolean f20076e = true;
    /* renamed from: f */
    private csg f20077f;

    public csb(crw<E> crw, cse<E> cse) {
        boolean z = true;
        this.f20074a = crw;
        this.f20075b = cse;
        this.f20077f = new csg();
        if (crw.m24690v()) {
            z = false;
        }
        this.f20076e = z;
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == f20072c) {
            return this.f20075b.mo4141a(viewGroup, i);
        }
        if (i == f20073d) {
            return this.f20077f.m24763a(viewGroup, i);
        }
        return null;
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == f20072c) {
            this.f20075b.mo4142a(c0605t, i, (crz) this.f20074a.get(mo4164b(i)));
        }
        if (itemViewType == f20073d) {
            this.f20077f.m24764a(c0605t, i);
            if (this.f20074a.size() == 0) {
                this.f20077f.m24765a(true);
            } else {
                this.f20077f.m24765a(true);
            }
        }
    }

    public int getItemCount() {
        return (this.f20076e ? 1 : 0) + this.f20074a.size();
    }

    public int getItemViewType(int i) {
        if (this.f20076e && i + 1 == getItemCount()) {
            return f20073d;
        }
        return f20072c;
    }

    /* renamed from: b */
    public int mo4164b(int i) {
        return i;
    }

    /* renamed from: a */
    public int m24750a(int i) {
        return i;
    }

    /* renamed from: a */
    public void m24752a(boolean z) {
        this.f20076e = z;
    }

    /* renamed from: a */
    public crw<E> m24751a() {
        return this.f20074a;
    }

    /* renamed from: b */
    public cse<E> m24754b() {
        return this.f20075b;
    }
}
