package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ninegag.android.app.R;

/* compiled from: ExploreHeaderRenderer */
/* renamed from: cas */
public class cas {
    /* renamed from: a */
    private com f8528a;

    /* compiled from: ExploreHeaderRenderer */
    /* renamed from: cas$a */
    public static class C1642a extends ccd {
        /* renamed from: a */
        public TextView f8524a;
        /* renamed from: b */
        public View f8525b;
        /* renamed from: c */
        public View f8526c;
        /* renamed from: d */
        public LinearLayout f8527d;

        public C1642a(View view, cnt cnt) {
            super(view, cnt);
            this.f8524a = (TextView) view.findViewById(R.id.txtHeader);
            this.f8527d = (LinearLayout) view.findViewById(R.id.sectionHeaderBG);
            this.f8525b = view.findViewById(R.id.dividerTop);
            this.f8526c = view.findViewById(R.id.dividerBottom);
        }

        /* renamed from: a */
        protected void mo1630a() {
            this.f8524a.setBackgroundColor(m12158a(this.e.mo1815B()));
            this.f8524a.setTextColor(m12158a(this.e.mo1814A()));
            this.f8525b.setBackgroundColor(m12158a(this.e.mo1823d()));
            this.f8526c.setBackgroundColor(m12158a(this.e.mo1823d()));
        }
    }

    public cas(com com) {
        this.f8528a = com;
    }

    /* renamed from: a */
    public C0605t m12163a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_explore_section_header, viewGroup, false);
        C0605t c1642a = new C1642a(inflate, this.f8528a.f16683a);
        inflate.setTag(c1642a);
        return c1642a;
    }

    /* renamed from: a */
    public void m12164a(C0605t c0605t, int i) {
        C1642a c1642a = (C1642a) c0605t;
        c1642a.mo1630a();
        if (i == caw.f8551a) {
            c1642a.f8524a.setText(R.string.header_recent);
        } else {
            c1642a.f8524a.setText(R.string.header_all);
        }
    }
}
