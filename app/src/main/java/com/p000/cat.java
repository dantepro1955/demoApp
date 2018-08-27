package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import p000.cas.C1642a;
import p000.cbd.C1656b;
import p000.cgq.C1719a;

/* compiled from: ExploreListAdapter */
/* renamed from: cat */
public class cat extends csb<cay> {
    /* renamed from: a */
    private cbd f8529a;
    /* renamed from: b */
    private cgq f8530b;
    /* renamed from: f */
    private cas f8531f;

    public cat(crw<cay> crw, cse<cay> cse, cas cas, cgq cgq, cbd cbd) {
        super(crw, cse);
        this.f8530b = cgq;
        this.f8529a = cbd;
        this.f8531f = cas;
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f8530b.m13120a(viewGroup, i);
        }
        if (i == 1) {
            return this.f8529a.m12232a(viewGroup, i);
        }
        if (i == 2) {
            return this.f8531f.m12163a(viewGroup, i);
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        if (c0605t instanceof C1656b) {
            this.f8529a.m12233a(c0605t, i);
        }
        if (c0605t instanceof C1719a) {
            this.f8530b.m13121a(c0605t, i);
        } else if (c0605t instanceof C1642a) {
            this.f8531f.m12164a(c0605t, i);
        } else {
            super.onBindViewHolder(c0605t, i);
        }
    }

    public int getItemCount() {
        return ((super.getItemCount() + 1) + 1) + 1;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public int m12165a(int i) {
        return ((super.a(i) + 1) + 1) + 1;
    }

    /* renamed from: b */
    public int m12166b(int i) {
        return ((super.b(i) - 1) - 1) - 1;
    }
}
