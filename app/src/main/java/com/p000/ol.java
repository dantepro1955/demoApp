package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

@TargetApi(14)
/* compiled from: SubMenuWrapperICS */
/* renamed from: ol */
class ol extends oh implements SubMenu {
    ol(Context context, ge geVar) {
        super(context, geVar);
    }

    /* renamed from: b */
    public ge m33256b() {
        return (ge) this.b;
    }

    public SubMenu setHeaderTitle(int i) {
        m33256b().setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m33256b().setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderIcon(int i) {
        m33256b().setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        m33256b().setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        m33256b().setHeaderView(view);
        return this;
    }

    public void clearHeader() {
        m33256b().clearHeader();
    }

    public SubMenu setIcon(int i) {
        m33256b().setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        m33256b().setIcon(drawable);
        return this;
    }

    public MenuItem getItem() {
        return m33045a(m33256b().getItem());
    }
}
