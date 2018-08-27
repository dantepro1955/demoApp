package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.AppStartCompleteEvent;
import p000.ccp.C1665b;

/* compiled from: GagPostListAdapterV2 */
/* renamed from: cfr */
public class cfr extends cst<cct> implements cce {
    /* renamed from: j */
    private static boolean f9078j;
    /* renamed from: a */
    protected boolean f9079a = true;
    /* renamed from: d */
    private ccp f9080d;
    /* renamed from: e */
    private ccp f9081e;
    /* renamed from: f */
    private csf f9082f;
    /* renamed from: g */
    private int f9083g;
    /* renamed from: h */
    private dmm f9084h;
    /* renamed from: i */
    private boolean f9085i;

    /* renamed from: a */
    public ccp m12997a() {
        return this.f9080d;
    }

    public cfr(csn<cct> csn, String str, com com, int i, boolean z, boolean z2, cco cco) {
        boolean z3 = true;
        super(csn);
        boolean z4 = crf.a() && this.f9084h != null && this.f9084h.b();
        this.f9085i = z4;
        this.f9083g = i;
        this.f9080d = new cdn(str, com, z, cco);
        this.f9081e = new cds(str, com, z, z2, cco);
        this.f9082f = new cci(com);
        if (csn.c()) {
            z3 = false;
        }
        this.f9079a = z3;
    }

    /* renamed from: a */
    public void mo1662a(dmm dmm) {
        this.f9084h = dmm;
        boolean z = crf.a() && this.f9084h != null && this.f9084h.b();
        this.f9085i = z;
    }

    /* renamed from: a */
    public void mo1661a(cdl cdl) {
        ((cdn) this.f9080d).m12681a(cdl);
        ((cdn) this.f9081e).m12681a(cdl);
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.id.blitz_empty_space) {
            return this.f9082f.a(viewGroup, i, this.f9083g);
        }
        if (i == R.id.gag_item_nsfw || i == R.id.gag_item_nsfw_with_ad) {
            return this.f9081e.mo1646a(viewGroup, i);
        }
        return this.f9080d.mo1646a(viewGroup, i);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        int i2 = i - 1;
        int itemViewType = getItemViewType(i);
        if (i >= 0 && i < getItemCount()) {
            C1665b c1665b = null;
            if (c0605t instanceof C1665b) {
                c1665b = (C1665b) c0605t;
                if (c1665b.f8660t != null) {
                    c1665b.f8660t.setVisibility(8);
                }
            }
            if (itemViewType == R.id.gag_item_nsfw) {
                this.f9081e.mo1647a(c0605t, i2, (cct) b(i2));
            } else if (itemViewType == R.id.gag_item_ad) {
                if (!(c1665b == null || c1665b.f8660t == null)) {
                    c1665b.f8660t.setVisibility(0);
                }
                this.f9080d.mo1647a(c0605t, i2, (cct) b(i2));
                this.f9080d.mo1660b(c0605t, i2, (cct) b(i2));
            } else if (itemViewType == R.id.gag_item_nsfw_with_ad) {
                if (!(c1665b == null || c1665b.f8660t == null)) {
                    c1665b.f8660t.setVisibility(0);
                }
                this.f9081e.mo1647a(c0605t, i2, (cct) b(i2));
                this.f9081e.mo1660b(c0605t, i2, (cct) b(i2));
            } else if (itemViewType == R.id.blitz_empty_space) {
                this.f9082f.a(c0605t, 0);
            } else {
                this.f9080d.mo1647a(c0605t, i2, (cct) b(i2));
            }
        }
        if (!f9078j) {
            f9078j = true;
            dhe.c(new AppStartCompleteEvent());
        }
    }

    public int getItemCount() {
        return (this.f9079a ? 1 : 0) + super.getItemCount();
    }

    /* renamed from: a */
    private boolean m12995a(cct cct) {
        if (cct != null && cct.m12265I() && caf.m12046a().m12075g().m13732h()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private int m12996c(int i) {
        if (this.f9079a && i + 1 == getItemCount()) {
            return csb.f20073d;
        }
        return csb.f20072c;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return R.id.blitz_empty_space;
        }
        int c = m12996c(i);
        int i2 = i - 1;
        if (i2 >= 0 && i2 < getItemCount()) {
            cct cct = (cct) b(i2);
            if (this.f9085i && this.f9084h != null && this.f9084h.a(i2)) {
                if (m12995a(cct)) {
                    return R.id.gag_item_nsfw_with_ad;
                }
                return R.id.gag_item_ad;
            } else if (c == csb.f20072c && i2 >= 0 && i2 < getItemCount() && m12995a(cct)) {
                return R.id.gag_item_nsfw;
            }
        }
        return c;
    }

    /* renamed from: b */
    public void m13000b() {
        super.notifyDataSetChanged();
    }
}
