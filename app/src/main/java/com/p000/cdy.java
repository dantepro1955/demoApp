package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import p000.cbd.C1655a;

/* compiled from: HotGagPostListAdapter */
/* renamed from: cdy */
public class cdy extends ccj {
    /* renamed from: f */
    private int f8858f = -1;
    /* renamed from: g */
    private cbd f8859g;

    public cdy(cdl cdl, crw<cct> crw, cse<cct> cse, cbc cbc, C1655a c1655a, cco cco) {
        super(cdl, crw, cse, cco);
        this.f8859g = new cbd(cbc, c1655a, ((ccp) cse).m12419b());
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case R.id.gag_item_featured:
                return this.f8859g.m12232a(viewGroup, i);
            default:
                return super.onCreateViewHolder(viewGroup, i);
        }
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        if (getItemViewType(i) == R.id.gag_item_featured) {
            this.f8859g.m12233a(c0605t, i);
        } else {
            super.onBindViewHolder(c0605t, i);
        }
    }

    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return R.id.gag_item_featured;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: b */
    public int m12717b(int i) {
        return super.b(i) - 1;
    }

    /* renamed from: a */
    public int m12716a(int i) {
        return super.a(i) + 1;
    }
}
