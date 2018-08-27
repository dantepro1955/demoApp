package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import p000.cfb.C1703b;

/* compiled from: SectionGagPostListAdapter */
/* renamed from: cez */
public class cez extends ccj {
    /* renamed from: f */
    private C1703b f9005f;
    /* renamed from: g */
    private cfb f9006g;

    public cez(cdl cdl, crw<cct> crw, cse<cct> cse, cco cco, C1703b c1703b) {
        super(cdl, crw, cse, cco);
        ccp ccp = (ccp) cse;
        this.f9005f = c1703b;
        this.f9006g = new cfb(this.f9005f, ccp.m12419b());
    }

    public C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case R.id.gag_section_header:
                return this.f9006g.m12940a(viewGroup, i);
            default:
                return super.onCreateViewHolder(viewGroup, i);
        }
    }

    public void onBindViewHolder(C0605t c0605t, int i) {
        if (getItemViewType(i) == R.id.gag_section_header) {
            this.f9006g.m12941a(c0605t, i);
        } else {
            super.onBindViewHolder(c0605t, i);
        }
    }

    public int getItemCount() {
        return super.getItemCount() + 1;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return R.id.gag_section_header;
        }
        return super.getItemViewType(i);
    }

    /* renamed from: c */
    protected int mo1698c(int i) {
        return 1;
    }

    /* renamed from: b */
    public int mo1705b(int i) {
        return super.b(i) - 1;
    }

    /* renamed from: a */
    public int mo1704a(int i) {
        return super.a(i) + 1;
    }
}
