package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import p000.mx.C5574g;
import p000.oe.C5548a;
import p000.of.C5601a;

/* compiled from: ListMenuPresenter */
/* renamed from: nv */
public class nv implements OnItemClickListener, oe {
    /* renamed from: a */
    Context f24833a;
    /* renamed from: b */
    LayoutInflater f24834b;
    /* renamed from: c */
    nx f24835c;
    /* renamed from: d */
    ExpandedMenuView f24836d;
    /* renamed from: e */
    int f24837e;
    /* renamed from: f */
    int f24838f;
    /* renamed from: g */
    int f24839g;
    /* renamed from: h */
    C5592a f24840h;
    /* renamed from: i */
    private C5548a f24841i;
    /* renamed from: j */
    private int f24842j;

    /* compiled from: ListMenuPresenter */
    /* renamed from: nv$a */
    class C5592a extends BaseAdapter {
        /* renamed from: a */
        final /* synthetic */ nv f24831a;
        /* renamed from: b */
        private int f24832b = -1;

        public /* synthetic */ Object getItem(int i) {
            return m33104a(i);
        }

        public C5592a(nv nvVar) {
            this.f24831a = nvVar;
            m33105a();
        }

        public int getCount() {
            int size = this.f24831a.f24835c.m33178l().size() - this.f24831a.f24837e;
            return this.f24832b < 0 ? size : size - 1;
        }

        /* renamed from: a */
        public nz m33104a(int i) {
            ArrayList l = this.f24831a.f24835c.m33178l();
            int i2 = this.f24831a.f24837e + i;
            if (this.f24832b >= 0 && i2 >= this.f24832b) {
                i2++;
            }
            return (nz) l.get(i2);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate;
            if (view == null) {
                inflate = this.f24831a.f24834b.inflate(this.f24831a.f24839g, viewGroup, false);
            } else {
                inflate = view;
            }
            ((C5601a) inflate).m33221a(m33104a(i), 0);
            return inflate;
        }

        /* renamed from: a */
        void m33105a() {
            nz r = this.f24831a.f24835c.m33184r();
            if (r != null) {
                ArrayList l = this.f24831a.f24835c.m33178l();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    if (((nz) l.get(i)) == r) {
                        this.f24832b = i;
                        return;
                    }
                }
            }
            this.f24832b = -1;
        }

        public void notifyDataSetChanged() {
            m33105a();
            super.notifyDataSetChanged();
        }
    }

    public nv(Context context, int i) {
        this(i, 0);
        this.f24833a = context;
        this.f24834b = LayoutInflater.from(this.f24833a);
    }

    public nv(int i, int i2) {
        this.f24839g = i;
        this.f24838f = i2;
    }

    /* renamed from: a */
    public void mo5254a(Context context, nx nxVar) {
        if (this.f24838f != 0) {
            this.f24833a = new ContextThemeWrapper(context, this.f24838f);
            this.f24834b = LayoutInflater.from(this.f24833a);
        } else if (this.f24833a != null) {
            this.f24833a = context;
            if (this.f24834b == null) {
                this.f24834b = LayoutInflater.from(this.f24833a);
            }
        }
        this.f24835c = nxVar;
        if (this.f24840h != null) {
            this.f24840h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public of m33106a(ViewGroup viewGroup) {
        if (this.f24836d == null) {
            this.f24836d = (ExpandedMenuView) this.f24834b.inflate(C5574g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f24840h == null) {
                this.f24840h = new C5592a(this);
            }
            this.f24836d.setAdapter(this.f24840h);
            this.f24836d.setOnItemClickListener(this);
        }
        return this.f24836d;
    }

    /* renamed from: d */
    public ListAdapter m33120d() {
        if (this.f24840h == null) {
            this.f24840h = new C5592a(this);
        }
        return this.f24840h;
    }

    /* renamed from: a */
    public void mo5257a(boolean z) {
        if (this.f24840h != null) {
            this.f24840h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo5256a(C5548a c5548a) {
        this.f24841i = c5548a;
    }

    /* renamed from: a */
    public boolean mo5260a(ok okVar) {
        if (!okVar.hasVisibleItems()) {
            return false;
        }
        new ny(okVar).m33186a(null);
        if (this.f24841i != null) {
            this.f24841i.mo5222a(okVar);
        }
        return true;
    }

    /* renamed from: a */
    public void mo5255a(nx nxVar, boolean z) {
        if (this.f24841i != null) {
            this.f24841i.mo5221a(nxVar, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f24835c.m33153a(this.f24840h.m33104a(i), (oe) this, 0);
    }

    /* renamed from: a */
    public boolean mo5258a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo5259a(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: b */
    public boolean mo5262b(nx nxVar, nz nzVar) {
        return false;
    }

    /* renamed from: a */
    public void m33108a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.f24836d != null) {
            this.f24836d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    /* renamed from: b */
    public void m33117b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f24836d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: b */
    public int mo5261b() {
        return this.f24842j;
    }

    /* renamed from: c */
    public Parcelable mo5272c() {
        if (this.f24836d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m33108a(bundle);
        return bundle;
    }

    /* renamed from: a */
    public void mo5266a(Parcelable parcelable) {
        m33117b((Bundle) parcelable);
    }
}
