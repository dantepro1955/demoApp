package com.p000;

import android.view.MenuItem;
import android.view.View;
import p000.il.C5396e;

/* compiled from: SupportMenuItem */
/* renamed from: gd */
public interface gd extends MenuItem {
    /* renamed from: a */
    gd mo5243a(hx hxVar);

    /* renamed from: a */
    gd mo5244a(C5396e c5396e);

    /* renamed from: a */
    hx mo5245a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
