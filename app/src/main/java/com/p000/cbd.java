package com.p000;

import android.content.Context;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.C0605t;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.app.otto.featured.GoFeaturedListEvent;
import com.ninegag.android.tv.ui.CustomRatioLinearLayout;
import java.lang.ref.WeakReference;

/* compiled from: FeaturedRowRenderer */
/* renamed from: cbd */
public class cbd {
    /* renamed from: a */
    private cbc f8591a;
    /* renamed from: b */
    private C1655a f8592b;
    /* renamed from: c */
    private com f8593c;

    /* compiled from: FeaturedRowRenderer */
    /* renamed from: cbd$1 */
    class C16541 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ cbd f8586a;

        C16541(cbd cbd) {
            this.f8586a = cbd;
        }

        public void onClick(View view) {
            caf.m12046a().m12054a(new GoFeaturedListEvent(null));
        }
    }

    /* compiled from: FeaturedRowRenderer */
    /* renamed from: cbd$a */
    public static class C1655a implements OnTouchListener {
        /* renamed from: a */
        private WeakReference<SwipeRefreshLayout> f8587a;

        /* renamed from: a */
        public void m12230a(SwipeRefreshLayout swipeRefreshLayout) {
            this.f8587a = new WeakReference(swipeRefreshLayout);
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f8587a.get();
            if (swipeRefreshLayout != null) {
                if (action == 3 || action == 1) {
                    swipeRefreshLayout.setEnabled(true);
                } else {
                    swipeRefreshLayout.setEnabled(false);
                }
            }
            return false;
        }
    }

    /* compiled from: FeaturedRowRenderer */
    /* renamed from: cbd$b */
    public static class C1656b extends ccd {
        /* renamed from: a */
        public RecyclerView f8588a;
        /* renamed from: b */
        public TextView f8589b;
        /* renamed from: c */
        public View f8590c;

        public C1656b(View view, cnt cnt) {
            super(view, cnt);
            this.f8588a = (RecyclerView) view.findViewById(R.id.featuredList);
            this.f8589b = (TextView) view.findViewById(R.id.featuredListTitle);
            this.f8590c = view.findViewById(R.id.header);
        }

        /* renamed from: a */
        protected void mo1630a() {
            this.f8589b.setTextColor(m12158a(this.e.mo1821b()));
        }
    }

    public cbd(cbc cbc, C1655a c1655a, com com) {
        this.f8591a = cbc;
        this.f8592b = c1655a;
        this.f8593c = com;
    }

    /* renamed from: a */
    public C0605t m12232a(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.gag_featured_post_list_item, viewGroup, false);
        ((CustomRatioLinearLayout) inflate).setDimension(16, 11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.featured_post_separation);
        C0605t c1656b = new C1656b(inflate, this.f8593c.f16683a);
        inflate.setTag(c1656b);
        c1656b.mo1630a();
        LayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(0);
        c1656b.f8588a.setLayoutManager(linearLayoutManager);
        c1656b.f8588a.setOnTouchListener(this.f8592b);
        c1656b.f8588a.setAdapter(this.f8591a);
        c1656b.f8588a.addItemDecoration(new coi(dimensionPixelSize, 0));
        c1656b.f8590c.setOnClickListener(new C16541(this));
        return c1656b;
    }

    /* renamed from: a */
    public void m12233a(C0605t c0605t, int i) {
        C1656b c1656b = (C1656b) c0605t;
    }
}
