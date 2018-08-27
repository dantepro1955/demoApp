package com.p000;

import android.support.v7.widget.RecyclerView.C0581a;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p000.cfm.C1713a;
import p000.coq.C4520a;

/* compiled from: UploadItemListAdapter */
/* renamed from: cfl */
public class cfl extends C0581a<C1713a> {
    /* renamed from: a */
    private cfm f9037a;
    /* renamed from: b */
    private List<C4520a> f9038b = new ArrayList();
    /* renamed from: c */
    private boolean f9039c = false;

    public /* synthetic */ void onBindViewHolder(C0605t c0605t, int i) {
        m12975a((C1713a) c0605t, i);
    }

    public /* synthetic */ C0605t onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m12973a(viewGroup, i);
    }

    public cfl(String str, com com, boolean z) {
        if (z) {
            m12971b();
        }
        this.f9037a = new cfm(str, this.f9038b, com);
    }

    /* renamed from: a */
    public C1713a m12973a(ViewGroup viewGroup, int i) {
        return this.f9037a.m12985a(viewGroup, i);
    }

    /* renamed from: a */
    public void m12975a(C1713a c1713a, int i) {
        this.f9037a.m12986a(c1713a, m12972a(i));
    }

    public int getItemCount() {
        return this.f9038b.size();
    }

    /* renamed from: a */
    public int m12972a(int i) {
        return i - 1;
    }

    /* renamed from: b */
    private void m12971b() {
        ArrayList b = ctz.a().b();
        for (int i = 0; i < b.size(); i++) {
            C4520a c4520a = new C4520a();
            cus cus = (cus) b.get(i);
            String b2 = ctz.a().b(((cus) b.get(i)).f20259b);
            if (b2 != null) {
                c4520a.f19893a = cus.f20259b;
                c4520a.f19895c = cus.f20261d;
                c4520a.f19894b = b2;
                c4520a.f19898f = cus.f20262e;
                if (cus.f20263f < 0 || cus.f20264g < 0) {
                    c4520a.f19897e = -1;
                }
                this.f9038b.add(c4520a);
            }
        }
    }

    /* renamed from: a */
    public List<C4520a> m12974a() {
        return this.f9038b;
    }

    /* renamed from: b */
    public void m12976b(int i) {
        this.f9038b.remove(i);
        notifyItemRemoved(i);
    }
}
