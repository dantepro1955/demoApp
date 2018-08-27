package com.p000;

import android.support.v7.widget.RecyclerView.C0583c;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import p000.cfb.C1703b;
import p000.cfm.C1713a;

/* compiled from: UserGagPostListAdapter */
/* renamed from: cff */
public class cff extends cez {
    /* renamed from: f */
    private cfl f9023f;

    /* compiled from: UserGagPostListAdapter */
    /* renamed from: cff$1 */
    class C17041 extends C0583c {
        /* renamed from: a */
        final /* synthetic */ cff f9021a;

        C17041(cff cff) {
            this.f9021a = cff;
        }

        public void onItemRangeRemoved(int i, int i2) {
            super.onItemRangeRemoved(i, i2);
            this.f9021a.notifyItemRangeRemoved(this.f9021a.mo1704a(i), i2);
        }
    }

    public cff(cdl cdl, crw<cct> crw, cse<cct> cse, cco cco, C1703b c1703b, cfl cfl) {
        super(cdl, crw, cse, cco, c1703b);
        this.f9023f = cfl;
        this.f9023f.registerAdapterDataObserver(new C17041(this));
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.id.upload_pending_item) {
            return this.f9023f.m12973a(viewGroup, i);
        }
        if (i == R.id.blitz_empty_space && cqx.a()) {
            return new C0605t(this, new View(viewGroup.getContext())) {
                /* renamed from: a */
                final /* synthetic */ cff f9022a;
            };
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == R.id.upload_pending_item) {
            this.f9023f.m12975a((C1713a) c0605t, i);
        } else if (itemViewType != R.id.blitz_empty_space || !cqx.a()) {
            super.onBindViewHolder(c0605t, i);
        }
    }

    public int getItemCount() {
        return super.getItemCount() + this.f9023f.getItemCount();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return super.getItemViewType(i);
        }
        if (i > 0 && i < this.f9023f.getItemCount() + 1) {
            return R.id.upload_pending_item;
        }
        if (this.e && cqx.a() && i + 1 == getItemCount()) {
            return R.id.blitz_empty_space;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: a */
    public int mo1704a(int i) {
        return super.mo1704a(i) + this.f9023f.getItemCount();
    }

    /* renamed from: b */
    public int mo1705b(int i) {
        return (i - 1) - this.f9023f.getItemCount();
    }
}
