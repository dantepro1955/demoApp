package com.p000;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import com.ninegag.android.tv.ui.CustomRatioLinearLayout;

/* compiled from: PromoBannerRenderer */
/* renamed from: cgq */
public class cgq {
    /* renamed from: a */
    private com f9150a;
    /* renamed from: b */
    private cgp f9151b;

    /* compiled from: PromoBannerRenderer */
    /* renamed from: cgq$a */
    public static class C1719a extends C0605t {
        /* renamed from: a */
        ViewPager f9149a;

        public C1719a(View view) {
            super(view);
            this.f9149a = (ViewPager) view.findViewById(R.id.view_pager);
        }
    }

    public cgq(cgp cgp, com com) {
        this.f9151b = cgp;
        this.f9150a = com;
    }

    /* renamed from: a */
    public C0605t m13120a(ViewGroup viewGroup, int i) {
        CustomRatioLinearLayout customRatioLinearLayout = (CustomRatioLinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.explore_promo_row, viewGroup, false);
        ((ViewPager) customRatioLinearLayout.findViewById(R.id.view_pager)).setAdapter(this.f9151b);
        return new C1719a(customRatioLinearLayout);
    }

    /* renamed from: a */
    public void m13121a(C0605t c0605t, int i) {
        C1719a c1719a = (C1719a) c0605t;
        CustomRatioLinearLayout customRatioLinearLayout = (CustomRatioLinearLayout) c1719a.itemView;
        if (this.f9151b.f9147a.size() == 0) {
            customRatioLinearLayout.setDimension(1000, 1);
            c1719a.itemView.setVisibility(8);
            return;
        }
        customRatioLinearLayout.setDimension(5, 1);
        c1719a.itemView.setVisibility(0);
    }
}
