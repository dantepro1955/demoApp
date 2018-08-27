package com.p000;

import android.content.Context;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.facebook.imagepipeline.common.Priority;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.featured.FeaturedPostClickEvent;
import com.ninegag.android.tv.ui.CustomRatioLinearLayout;
import com.under9.android.lib.widget.uiv.FrescoTilingView;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import p000.cnw.C1651a;
import p000.dlm.C4972a;

/* compiled from: FeaturedListAdapter */
/* renamed from: cbc */
public class cbc extends C0581a<cbb> {
    /* renamed from: a */
    private crv f8581a;
    /* renamed from: b */
    private caf f8582b = caf.m12046a();
    /* renamed from: c */
    private com f8583c;
    /* renamed from: d */
    private C4060c f8584d = new C16501(this);
    /* renamed from: e */
    private OnClickListener f8585e = new C16532(this);

    /* compiled from: FeaturedListAdapter */
    /* renamed from: cbc$1 */
    class C16501 implements C4060c {
        /* renamed from: a */
        final /* synthetic */ cbc f8578a;

        C16501(cbc cbc) {
            this.f8578a = cbc;
        }

        /* renamed from: a */
        public void m12219a(View view, dlm dlm, UniversalImageView universalImageView) {
            if (this.f8578a.f8585e != null) {
                this.f8578a.f8585e.onClick(universalImageView);
            }
        }
    }

    /* compiled from: FeaturedListAdapter */
    /* renamed from: cbc$2 */
    class C16532 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cbc f8580a;

        /* compiled from: FeaturedListAdapter */
        /* renamed from: cbc$2$1 */
        class C16521 extends C1651a<cru, Void> {
            /* renamed from: a */
            final /* synthetic */ C16532 f8579a;

            C16521(C16532 c16532) {
                this.f8579a = c16532;
            }

            /* renamed from: a */
            protected Void m12224a(cru... cruArr) {
                this.f8579a.f8580a.f8582b.m12075g().m13699a(cruArr[0].a());
                return null;
            }
        }

        C16532(cbc cbc) {
            this.f8580a = cbc;
        }

        public void onClick(View view) {
            chn.m13324B();
            this.f8580a.f8582b.m12054a(new FeaturedPostClickEvent(((cru) view.getTag()).a()));
            new C16521(this).m12222b(r0);
        }
    }

    public /* synthetic */ void onBindViewHolder(C0605t c0605t, int i) {
        m12229a((cbb) c0605t, i);
    }

    public /* synthetic */ C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m12228a(viewGroup, i);
    }

    public cbc(crv crv, com com) {
        this.f8581a = crv;
        this.f8583c = com;
    }

    /* renamed from: a */
    public cbb m12228a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.featured_item, viewGroup, false);
        ((CustomRatioLinearLayout) inflate).setDimension(16, 9);
        cbb cbb = new cbb(inflate, this.f8583c.f16683a);
        cbb.f8577d.setOnClickListener(this.f8585e);
        return cbb;
    }

    /* renamed from: a */
    public void m12229a(cbb cbb, int i) {
        cru cru = (cru) this.f8581a.get(i);
        cbb.f8577d.setTag(cru);
        cbb.f8574a.setText(cru.b());
        CharSequence a = cru.a(cbb.itemView.getContext());
        if (a != null) {
            cbb.f8575b.setVisibility(0);
            cbb.f8575b.setText(a);
        } else {
            cbb.f8575b.setVisibility(8);
            cbb.f8575b.setText(null);
        }
        dlm b = new C4972a().a(3.0f).a(Priority.LOW).a(cru.c(), 640, 360).a(this.f8584d).a(this.f8582b.m12090t()).b();
        cbb.f8576c.setTag(cru);
        cbb.f8576c.setAdapter(b);
        m12226a(cbb.f8577d.getContext(), cbb);
    }

    public int getItemCount() {
        return this.f8581a.size();
    }

    /* renamed from: a */
    private void m12226a(Context context, cbb cbb) {
        ((FrescoTilingView) cbb.f8576c.findViewById(R.id.image)).setBackgroundColor(context.getResources().getColor(this.f8583c.f16683a.mo1827h()));
    }
}
