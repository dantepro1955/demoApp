package com.p000;

import android.database.DataSetObserver;
import android.support.v7.widget.RecyclerView.C0605t;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.ninegag.android.app.R;
import p000.cby.C1666a;

/* compiled from: SinglePostCommentAdapter */
/* renamed from: cao */
public class cao extends BaseAdapter {
    /* renamed from: b */
    private static caf f8512b = caf.m12046a();
    /* renamed from: a */
    DataSetObserver f8513a = new C16401(this);
    /* renamed from: c */
    private final int f8514c = 0;
    /* renamed from: d */
    private ccc f8515d;
    /* renamed from: e */
    private BaseAdapter f8516e;
    /* renamed from: f */
    private com f8517f;
    /* renamed from: g */
    private boolean f8518g;
    /* renamed from: h */
    private cby f8519h;

    /* compiled from: SinglePostCommentAdapter */
    /* renamed from: cao$1 */
    class C16401 extends DataSetObserver {
        /* renamed from: a */
        final /* synthetic */ cao f8511a;

        C16401(cao cao) {
            this.f8511a = cao;
        }

        public void onChanged() {
            this.f8511a.notifyDataSetChanged();
        }
    }

    public cao(ccc ccc, com com, BaseAdapter baseAdapter, cco cco) {
        this.f8515d = ccc;
        this.f8517f = com;
        this.f8516e = baseAdapter;
        this.f8518g = true;
        this.f8519h = new cby(ccc.m12454g(), com, f8512b.m12077h().ak(), cco);
        baseAdapter.registerDataSetObserver(this.f8513a);
        m12150a(this.f8517f.f16684b);
        m12152b(f8512b.m12077h().mo1776s());
    }

    public int getCount() {
        return this.f8516e.getCount() + 1;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return 0;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f8516e.getItemViewType(i - 1) + 1;
    }

    public int getViewTypeCount() {
        return this.f8516e.getViewTypeCount() + 1;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (i != 0) {
            return this.f8516e.getView(i - 1, view, viewGroup);
        }
        C0605t a;
        if (view == null) {
            a = this.f8519h.mo1646a(viewGroup, 0);
            a.itemView.setTag(R.id.single_post_view_holder_tag, a);
        } else {
            a = (C0605t) view.getTag(R.id.single_post_view_holder_tag);
        }
        cby cby = this.f8519h;
        if (this.f8516e.getCount() == 0) {
            z = true;
        }
        cby.m12430a(z, (C1666a) a);
        cct h = this.f8515d.m12455h();
        if (!(h == null || h.R() == null)) {
            this.f8519h.mo1647a(a, i, h);
        }
        return a.itemView;
    }

    /* renamed from: a */
    public void m12151a(boolean z) {
        this.f8518g = z;
        this.f8519h.m12429a(this.f8518g);
    }

    /* renamed from: a */
    public void m12150a(deu deu) {
        try {
            ((dev) this.f8516e).a(deu);
        } catch (Exception e) {
        }
    }

    /* renamed from: b */
    public void m12152b(boolean z) {
        try {
            ((dcw) this.f8516e).a(z);
        } catch (Exception e) {
        }
    }
}
