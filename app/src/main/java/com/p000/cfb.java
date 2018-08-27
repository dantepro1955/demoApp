package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ninegag.android.app.R;
import com.under9.android.lib.widget.uiv.UniversalImageView;
import p000.dlm.C4972a;

/* compiled from: SectionHeaderRenderer */
/* renamed from: cfb */
public class cfb {
    /* renamed from: a */
    private C1703b f9017a;
    /* renamed from: b */
    private com f9018b;

    /* compiled from: SectionHeaderRenderer */
    /* renamed from: cfb$a */
    public static class C1702a extends ccd {
        /* renamed from: a */
        View f9008a;
        /* renamed from: b */
        View f9009b;
        /* renamed from: c */
        TextView f9010c;
        /* renamed from: d */
        TextView f9011d;
        /* renamed from: f */
        UniversalImageView f9012f;
        /* renamed from: g */
        View f9013g;

        public C1702a(View view, cnt cnt) {
            super(view, cnt);
            this.f9008a = view.findViewById(R.id.postItemContainer);
            this.f9009b = view.findViewById(R.id.postSectionItemWrapper);
            this.f9010c = (TextView) view.findViewById(R.id.about);
            this.f9011d = (TextView) view.findViewById(R.id.name);
            this.f9012f = (UniversalImageView) view.findViewById(R.id.avatar);
            this.f9013g = view.findViewById(R.id.divider);
            mo1630a();
        }

        /* renamed from: a */
        protected void mo1630a() {
            this.f9011d.setTextColor(m12158a(this.e.mo1831l()));
            this.f9010c.setTextColor(m12158a(this.e.mo1832m()));
            this.f9013g.setBackgroundResource(this.e.mo1826g());
            this.f9012f.findViewById(R.id.image).setBackgroundColor(m12158a(this.e.mo1820a()));
        }
    }

    /* compiled from: SectionHeaderRenderer */
    /* renamed from: cfb$b */
    public static class C1703b {
        /* renamed from: a */
        private String f9014a;
        /* renamed from: b */
        private String f9015b;
        /* renamed from: c */
        private String f9016c;

        public C1703b(String str, String str2, String str3) {
            if (str == null) {
                str = "";
            }
            this.f9014a = Html.fromHtml(str).toString();
            this.f9015b = str2;
            this.f9016c = str3;
        }

        /* renamed from: a */
        public String m12934a() {
            return this.f9014a;
        }

        /* renamed from: a */
        public void m12935a(String str) {
            this.f9014a = str;
        }

        /* renamed from: b */
        public String m12936b() {
            return this.f9015b;
        }

        /* renamed from: b */
        public void m12937b(String str) {
            this.f9015b = str;
        }

        /* renamed from: c */
        public String m12938c() {
            return this.f9016c;
        }

        /* renamed from: c */
        public void m12939c(String str) {
            this.f9016c = str;
        }
    }

    public cfb(C1703b c1703b, com com) {
        this.f9017a = c1703b;
        this.f9018b = com;
    }

    /* renamed from: a */
    public C0605t m12940a(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.post_item_section, viewGroup, false);
        C0605t c1702a = new C1702a(inflate, this.f9018b.f16683a);
        inflate.setTag(c1702a);
        return c1702a;
    }

    /* renamed from: a */
    public void m12941a(C0605t c0605t, int i) {
        C1702a c1702a = (C1702a) c0605t;
        if (this.f9017a != null) {
            c1702a.f9011d.setText(this.f9017a.m12934a());
            c1702a.f9010c.setText(this.f9017a.m12936b());
            if (this.f9017a.m12938c() != null) {
                c1702a.f9012f.setAdapter(new C4972a().a(this.f9017a.m12938c(), 128, 128).a(3.0f).a(caf.m12046a().m12090t()).b());
            }
        }
    }
}
