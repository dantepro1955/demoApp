package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.ninegag.android.app.R;

/* compiled from: PollingLanguageRenderer */
/* renamed from: cbs */
public class cbs extends cse<cbn> {
    /* renamed from: a */
    private cbq f8640a;

    /* compiled from: PollingLanguageRenderer */
    /* renamed from: cbs$a */
    public static class C1661a extends C0605t implements OnClickListener {
        /* renamed from: a */
        private String f8637a;
        /* renamed from: b */
        private CheckBox f8638b;
        /* renamed from: c */
        private cbq f8639c;

        /* compiled from: PollingLanguageRenderer */
        /* renamed from: cbs$a$a */
        static class C1660a implements OnCheckedChangeListener {
            /* renamed from: a */
            private cbq f8635a;
            /* renamed from: b */
            private String f8636b;

            public C1660a(cbq cbq, String str) {
                this.f8635a = cbq;
                this.f8636b = str;
            }

            @dhg
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (!z) {
                    this.f8635a.m12325b(this.f8636b);
                } else if (this.f8635a.m12328g()) {
                    compoundButton.setChecked(false);
                    this.f8635a.o_();
                } else {
                    this.f8635a.m12323a(this.f8636b);
                }
            }
        }

        public C1661a(View view) {
            super(view);
            this.f8638b = (CheckBox) view.findViewById(R.id.languageSelected);
            view.setOnClickListener(this);
        }

        /* renamed from: a */
        public void m12360a(String str) {
            this.f8637a = str;
        }

        /* renamed from: b */
        public void m12362b(String str) {
            m12357a(R.id.languageNativeName, str);
        }

        /* renamed from: c */
        public void m12363c(String str) {
            m12357a(R.id.languageEnglishName, str);
        }

        /* renamed from: a */
        public void m12358a() {
            this.f8638b.setOnCheckedChangeListener(null);
        }

        /* renamed from: a */
        public void m12361a(boolean z) {
            this.f8638b.setChecked(z);
        }

        /* renamed from: a */
        public void m12359a(cbq cbq) {
            this.f8639c = cbq;
            this.f8638b.setOnCheckedChangeListener(new C1660a(this.f8639c, this.f8637a));
        }

        /* renamed from: a */
        private void m12357a(int i, String str) {
            ((TextView) this.itemView.findViewById(i)).setText(str);
        }

        @dhg
        public void onClick(View view) {
            this.f8638b.setChecked(!this.f8638b.isChecked());
        }
    }

    public cbs(cbq cbq) {
        this.f8640a = cbq;
    }

    /* renamed from: a */
    public C0605t m12364a(ViewGroup viewGroup, int i) {
        return new C1661a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.polling_languages_item, viewGroup, false));
    }

    /* renamed from: a */
    public void m12365a(C0605t c0605t, int i, cbn cbn) {
        String e = cbn.m12282e();
        C1661a c1661a = (C1661a) c0605t;
        c1661a.m12362b(cbn.mo1639a());
        c1661a.m12363c(cbn.m12307b());
        c1661a.m12360a(e);
        c1661a.m12358a();
        c1661a.m12361a(this.f8640a.m12327c(e));
        c1661a.m12359a(this.f8640a);
    }
}
