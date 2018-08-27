package com.p000;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import p000.mx.C5574g;
import p000.of.C5601a;

/* compiled from: MenuAdapter */
/* renamed from: nw */
public class nw extends BaseAdapter {
    /* renamed from: a */
    static final int f24843a = C5574g.abc_popup_menu_item_layout;
    /* renamed from: b */
    nx f24844b;
    /* renamed from: c */
    private int f24845c = -1;
    /* renamed from: d */
    private boolean f24846d;
    /* renamed from: e */
    private final boolean f24847e;
    /* renamed from: f */
    private final LayoutInflater f24848f;

    public /* synthetic */ Object getItem(int i) {
        return m33122a(i);
    }

    public nw(nx nxVar, LayoutInflater layoutInflater, boolean z) {
        this.f24847e = z;
        this.f24848f = layoutInflater;
        this.f24844b = nxVar;
        m33124b();
    }

    /* renamed from: a */
    public void m33123a(boolean z) {
        this.f24846d = z;
    }

    public int getCount() {
        ArrayList l = this.f24847e ? this.f24844b.m33178l() : this.f24844b.m33175i();
        if (this.f24845c < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    /* renamed from: a */
    public nx m33121a() {
        return this.f24844b;
    }

    /* renamed from: a */
    public nz m33122a(int i) {
        ArrayList l = this.f24847e ? this.f24844b.m33178l() : this.f24844b.m33175i();
        if (this.f24845c >= 0 && i >= this.f24845c) {
            i++;
        }
        return (nz) l.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.f24848f.inflate(f24843a, viewGroup, false);
        } else {
            inflate = view;
        }
        C5601a c5601a = (C5601a) inflate;
        if (this.f24846d) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        c5601a.m33221a(m33122a(i), 0);
        return inflate;
    }

    /* renamed from: b */
    void m33124b() {
        nz r = this.f24844b.m33184r();
        if (r != null) {
            ArrayList l = this.f24844b.m33178l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                if (((nz) l.get(i)) == r) {
                    this.f24845c = i;
                    return;
                }
            }
        }
        this.f24845c = -1;
    }

    public void notifyDataSetChanged() {
        m33124b();
        super.notifyDataSetChanged();
    }
}
