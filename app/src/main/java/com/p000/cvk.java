package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.ninegag.android.tv.otto.TVGoEmbedUrlEvent;
import com.under9.android.lib.widget.uiv.FrescoTilingView;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import com.under9.android.lib.widget.uiv.UniversalImageView.C4060c;
import p000.dlm.C4972a;

/* compiled from: PostRenderer */
/* renamed from: cvk */
public class cvk extends cse<cvl> {
    /* renamed from: a */
    private String f20298a;
    /* renamed from: b */
    private C4603a f20299b;
    /* renamed from: c */
    private C4604b f20300c;
    /* renamed from: d */
    private com f20301d;
    /* renamed from: e */
    private caf f20302e = caf.a();

    /* compiled from: PostRenderer */
    /* renamed from: cvk$a */
    static class C4603a implements OnClickListener {
        /* renamed from: a */
        private String f20293a;

        public C4603a(String str) {
            this.f20293a = str;
        }

        public void onClick(View view) {
            cvl cvl = (cvl) view.getTag();
            dhe.m27287c(this.f20293a, new TVGoEmbedUrlEvent(view.getContext(), cvl));
            chn.c("VideoList", "TapVideoPost", cvl.m25075i());
        }
    }

    /* compiled from: PostRenderer */
    /* renamed from: cvk$b */
    static class C4604b implements C4060c {
        /* renamed from: a */
        private String f20294a;

        public C4604b(String str) {
            this.f20294a = str;
        }

        /* renamed from: a */
        public void mo3751a(View view, dlm dlm, UniversalImageView universalImageView) {
            cvl cvl = (cvl) universalImageView.getTag();
            dhe.m27287c(this.f20294a, new TVGoEmbedUrlEvent(universalImageView.getContext(), cvl));
            chn.c("VideoList", "TapVideoPost", cvl.m25075i());
        }
    }

    /* compiled from: PostRenderer */
    /* renamed from: cvk$c */
    public static class C4605c extends C0605t {
        /* renamed from: a */
        public TextView f20295a;
        /* renamed from: b */
        public UniversalImageView f20296b;
        /* renamed from: c */
        public View f20297c;

        public C4605c(View view) {
            super(view);
            this.f20295a = (TextView) view.findViewById(R.id.title);
            this.f20296b = (UniversalImageView) view.findViewById(R.id.thumbnail);
            this.f20297c = view.findViewById(R.id.container);
        }
    }

    public cvk(String str, com com) {
        this.f20298a = str;
        this.f20301d = com;
        this.f20299b = new C4603a(this.f20298a);
        this.f20300c = new C4604b(this.f20298a);
    }

    /* renamed from: a */
    public C0605t mo4141a(ViewGroup viewGroup, int i) {
        C0605t c4605c = new C4605c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tv_post_list_item, viewGroup, false));
        c4605c.f20297c.setOnClickListener(this.f20299b);
        return c4605c;
    }

    /* renamed from: a */
    public void m25065a(C0605t c0605t, int i, cvl cvl) {
        C4605c c4605c = (C4605c) c0605t;
        c4605c.f20297c.setTag(cvl);
        c4605c.f20296b.setTag(cvl);
        c4605c.f20295a.setText(cvl.m25066a());
        c4605c.f20296b.setAdapter(new C4972a().m27862a(this.f20300c).m27866a(cvl.m25068b(), 360, 187).m27864a(this.f20302e.t()).m27872b());
        m25062a(c4605c);
    }

    /* renamed from: a */
    private void m25062a(C4605c c4605c) {
        if (this.f20301d != null) {
            cnt cnt = this.f20301d.f16683a;
            int color = caf.a().f8449a.getResources().getColor(cnt.e());
            int color2 = caf.a().f8449a.getResources().getColor(cnt.z());
            c4605c.f20295a.setTextColor(color);
            ((FrescoTilingView) c4605c.f20296b.findViewById(R.id.image)).setBackgroundColor(color2);
        }
    }
}
