package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import p000.ccp.C1665b;

/* compiled from: GagPostListAdapter */
/* renamed from: ccj */
public class ccj extends csb<cct> implements cce {
    /* renamed from: a */
    protected caf f8693a = caf.m12046a();
    /* renamed from: b */
    protected cco f8694b;
    /* renamed from: f */
    private ccp f8695f;
    /* renamed from: g */
    private dmm f8696g;

    public ccj(cdl cdl, crw<cct> crw, cse<cct> cse, cco cco) {
        super(crw, cse);
        ccp ccp = (ccp) cse;
        this.f8694b = cco;
        this.f8695f = new cds(cco.f8730b, ccp.m12419b(), this.f8693a.m12077h().ak(), this.f8693a.m12075g().m13732h(), this.f8694b);
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        int itemViewType = getItemViewType(i);
        int b = b(i);
        if (b < 0 || b >= a().size()) {
            super.onBindViewHolder(c0605t, i);
            return;
        }
        cct cct = (cct) a().get(b);
        C1665b c1665b = null;
        if (c0605t instanceof C1665b) {
            c1665b = (C1665b) c0605t;
            if (c1665b.f8660t != null) {
                c1665b.f8660t.setVisibility(8);
            }
        }
        if (itemViewType == R.id.gag_item_nsfw) {
            this.f8695f.mo1647a(c0605t, i, cct);
        } else if (itemViewType == R.id.gag_item_ad) {
            if (!(c1665b == null || c1665b.f8660t == null)) {
                c1665b.f8660t.setVisibility(0);
            }
            ccp ccp = (ccp) b();
            ccp.mo1647a(c0605t, i, cct);
            ccp.mo1660b(c0605t, i - mo1698c(i), cct);
        } else if (itemViewType == R.id.gag_item_nsfw_with_ad) {
            if (!(c1665b == null || c1665b.f8660t == null)) {
                c1665b.f8660t.setVisibility(0);
            }
            this.f8695f.mo1647a(c0605t, i, cct);
            this.f8695f.mo1660b(c0605t, i - mo1698c(i), cct);
        } else {
            super.onBindViewHolder(c0605t, i);
        }
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == R.id.gag_item_nsfw) {
            return this.f8695f.mo1646a(viewGroup, i);
        }
        if (i == R.id.gag_item_ad) {
            return b().a(viewGroup, i);
        }
        if (i == R.id.gag_item_nsfw_with_ad) {
            return this.f8695f.mo1646a(viewGroup, i);
        }
        return super.onCreateViewHolder(viewGroup, i);
    }

    public int getItemViewType(int i) {
        int itemViewType = super.getItemViewType(i);
        int b = b(i);
        if (b >= 0 && b < a().size()) {
            cct cct = (cct) a().get(b);
            if (crf.a() && this.f8696g != null && this.f8696g.b() && this.f8696g.a(i - mo1698c(i))) {
                if (m12472a(cct)) {
                    return R.id.gag_item_nsfw_with_ad;
                }
                return R.id.gag_item_ad;
            } else if (itemViewType == c && a() != null && b >= 0 && b < a().size() && m12472a(cct)) {
                return R.id.gag_item_nsfw;
            }
        }
        return itemViewType;
    }

    /* renamed from: c */
    protected int mo1698c(int i) {
        return 0;
    }

    /* renamed from: a */
    public void m12475a(String str) {
        if (crf.a()) {
            dmn e = this.f8693a.m12086p().e();
            cle a = caf.m12046a().m12075g().f9370c.m13814a(this.f8694b.f8729a);
            this.f8696g = e.a(crf.b(), str, "inline_ad");
            try {
                this.f8696g = crf.a(this.f8696g, a == null ? null : new bum().m11091a(a.m14250h()), str);
            } catch (Exception e2) {
            }
        }
    }

    /* renamed from: a */
    private boolean m12472a(cct cct) {
        if (cct != null && cct.m12265I() && caf.m12046a().m12075g().m13732h()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo1662a(dmm dmm) {
        this.f8696g = dmm;
    }

    /* renamed from: a */
    public void mo1661a(cdl cdl) {
        ((cds) this.f8695f).m12681a(cdl);
    }
}
