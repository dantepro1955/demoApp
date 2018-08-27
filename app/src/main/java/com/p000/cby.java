package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ninegag.android.app.R;
import p000.ccp.C1665b;

/* compiled from: CommentSinglePostWrapperRenderer */
/* renamed from: cby */
public class cby extends ccp {
    /* renamed from: d */
    private boolean f8673d;
    /* renamed from: e */
    private boolean f8674e;

    /* compiled from: CommentSinglePostWrapperRenderer */
    /* renamed from: cby$a */
    public static class C1666a extends C1665b {
        /* renamed from: a */
        public View f8661a;
        /* renamed from: b */
        public View f8662b;

        public C1666a(View view, com com) {
            super(view, com.f16683a);
            this.f8662b = view.findViewById(R.id.commentHeaderDivider);
            this.f8661a = view.findViewById(R.id.emptyView);
        }

        /* renamed from: a */
        protected void mo1630a() {
            super.mo1630a();
        }
    }

    public cby(String str, com com, boolean z, cco cco) {
        super(str, com, z, cco);
        m12425c(false);
    }

    /* renamed from: a */
    public C0605t mo1646a(ViewGroup viewGroup, int i) {
        View inflate = View.inflate(viewGroup.getContext(), R.layout.comment_post_wrapper, null);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        cro cro = (cro) crj.b(cro.class);
        LayoutInflater from = LayoutInflater.from(inflate.getContext());
        int i2 = (cro == null || cro.c().intValue() == cro.a().intValue()) ? R.layout.post_item_v3_universal_image_view : R.layout.post_item_v3_universal_image_view_native;
        View inflate2 = from.inflate(i2, viewGroup, false);
        View inflate3 = View.inflate(inflate.getContext(), R.layout.comment_post_addon, null);
        viewGroup2.addView(inflate2);
        viewGroup2.addView(inflate3);
        C0605t c1666a = new C1666a(inflate, this.b);
        c1666a.mo1630a();
        inflate.setTag(c1666a);
        mo1676a((C1665b) c1666a);
        inflate2.setVisibility(djy.a(this.f8673d));
        return c1666a;
    }

    /* renamed from: a */
    public void mo1647a(C0605t c0605t, int i, cct cct) {
        super.mo1647a(c0605t, i, cct);
        C1666a c1666a = (C1666a) c0605t;
        if (this.f8673d) {
            c1666a.c.d();
        }
    }

    /* renamed from: a */
    public void m12430a(boolean z, C1666a c1666a) {
        this.f8674e = z;
        c1666a.f8661a.setVisibility(djy.a(this.f8674e));
    }

    /* renamed from: a */
    public void m12429a(boolean z) {
        this.f8673d = z;
    }
}
