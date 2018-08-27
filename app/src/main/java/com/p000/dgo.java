package com.p000;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.under9.android.lib.network.model.ApiDomainObject;
import p000.dgm.C4893a;
import p000.dgm.C4894b;

/* compiled from: DomainAdapter */
/* renamed from: dgo */
public class dgo extends C0581a<C4895a> {
    /* renamed from: a */
    private hh<String, ApiDomainObject> f21570a;
    /* renamed from: b */
    private SparseBooleanArray f21571b;
    /* renamed from: c */
    private SparseBooleanArray f21572c;
    /* renamed from: d */
    private C4895a f21573d;

    /* compiled from: DomainAdapter */
    /* renamed from: dgo$a */
    public static class C4895a extends C0605t {
        /* renamed from: a */
        private TextView f21566a;
        /* renamed from: b */
        private TextView f21567b;
        /* renamed from: c */
        private TextView f21568c;
        /* renamed from: d */
        private TextView f21569d;

        public C4895a(View view) {
            super(view);
            this.f21566a = (TextView) view.findViewById(C4893a.original_domain);
            this.f21567b = (TextView) view.findViewById(C4893a.mapped_domain);
            this.f21568c = (TextView) view.findViewById(C4893a.label_original_domain_status);
            this.f21569d = (TextView) view.findViewById(C4893a.label_mapped_domain_status);
        }
    }

    public /* synthetic */ void onBindViewHolder(C0605t c0605t, int i) {
        m27217a((C4895a) c0605t, i);
    }

    public /* synthetic */ C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m27215a(viewGroup, i);
    }

    public dgo(hh<String, ApiDomainObject> hhVar) {
        this.f21570a = hhVar;
    }

    /* renamed from: a */
    public void m27216a(SparseBooleanArray sparseBooleanArray) {
        this.f21571b = sparseBooleanArray;
    }

    /* renamed from: b */
    public void m27218b(SparseBooleanArray sparseBooleanArray) {
        this.f21572c = sparseBooleanArray;
    }

    /* renamed from: a */
    public C4895a m27215a(ViewGroup viewGroup, int i) {
        this.f21573d = new C4895a(LayoutInflater.from(viewGroup.getContext()).inflate(C4894b.activity_domain_item, viewGroup, false));
        return this.f21573d;
    }

    /* renamed from: a */
    public void m27217a(C4895a c4895a, int i) {
        String str = (String) this.f21570a.m30556b(i);
        CharSequence charSequence = ((ApiDomainObject) this.f21570a.get(str)).fallback;
        c4895a.f21566a.setText(str);
        c4895a.f21567b.setText(charSequence);
        if (((String) dgk.m27206d().get(str)).equals(str)) {
            c4895a.f21567b.setTypeface(Typeface.DEFAULT);
            c4895a.f21566a.setTypeface(Typeface.DEFAULT_BOLD);
        } else {
            c4895a.f21567b.setTypeface(Typeface.DEFAULT_BOLD);
            c4895a.f21566a.setTypeface(Typeface.DEFAULT);
        }
        boolean z = this.f21571b.get(i, false);
        boolean z2 = this.f21572c.get(i, false);
        if (z) {
            c4895a.f21568c.setText("OK");
            c4895a.f21568c.setTextColor(-16711936);
        } else {
            c4895a.f21568c.setText("FAILED");
            c4895a.f21568c.setTextColor(-65536);
        }
        if (z2) {
            c4895a.f21569d.setText("OK");
            c4895a.f21569d.setTextColor(-16711936);
            return;
        }
        c4895a.f21569d.setText("FAILED");
        c4895a.f21569d.setTextColor(-65536);
    }

    public int getItemCount() {
        return this.f21570a.size();
    }
}
