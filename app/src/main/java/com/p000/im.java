package com.p000;

import android.annotation.TargetApi;
import android.view.MenuItem;
import android.view.View;

@TargetApi(11)
/* compiled from: MenuItemCompatHoneycomb */
/* renamed from: im */
class im {
    /* renamed from: a */
    public static void m30815a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: a */
    public static MenuItem m30813a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: b */
    public static MenuItem m30816b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }

    /* renamed from: a */
    public static View m30814a(MenuItem menuItem) {
        return menuItem.getActionView();
    }
}
