package com.p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p000.nx.C5537a;

/* compiled from: SubMenuBuilder */
/* renamed from: ok */
public class ok extends nx implements SubMenu {
    /* renamed from: d */
    private nx f24921d;
    /* renamed from: e */
    private nz f24922e;

    public ok(Context context, nx nxVar, nz nzVar) {
        super(context);
        this.f24921d = nxVar;
        this.f24922e = nzVar;
    }

    public void setQwertyMode(boolean z) {
        this.f24921d.setQwertyMode(z);
    }

    /* renamed from: b */
    public boolean mo5297b() {
        return this.f24921d.mo5297b();
    }

    /* renamed from: c */
    public boolean mo5298c() {
        return this.f24921d.mo5298c();
    }

    /* renamed from: s */
    public Menu m33255s() {
        return this.f24921d;
    }

    public MenuItem getItem() {
        return this.f24922e;
    }

    /* renamed from: a */
    public void mo5295a(C5537a c5537a) {
        this.f24921d.mo5295a(c5537a);
    }

    /* renamed from: p */
    public nx mo5301p() {
        return this.f24921d.mo5301p();
    }

    /* renamed from: a */
    boolean mo5296a(nx nxVar, MenuItem menuItem) {
        return super.mo5296a(nxVar, menuItem) || this.f24921d.mo5296a(nxVar, menuItem);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f24922e.setIcon(drawable);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f24922e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m33140a(drawable);
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m33171e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m33142a(charSequence);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m33167d(i);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m33141a(view);
    }

    /* renamed from: c */
    public boolean mo5299c(nz nzVar) {
        return this.f24921d.mo5299c(nzVar);
    }

    /* renamed from: d */
    public boolean mo5300d(nz nzVar) {
        return this.f24921d.mo5300d(nzVar);
    }

    /* renamed from: a */
    public String mo5294a() {
        int itemId = this.f24922e != null ? this.f24922e.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo5294a() + ":" + itemId;
    }
}
