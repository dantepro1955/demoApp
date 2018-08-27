package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperFactory */
/* renamed from: og */
public final class og {
    /* renamed from: a */
    public static Menu m33224a(Context context, gc gcVar) {
        if (VERSION.SDK_INT >= 14) {
            return new oh(context, gcVar);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static MenuItem m33225a(Context context, gd gdVar) {
        if (VERSION.SDK_INT >= 16) {
            return new ob(context, gdVar);
        }
        if (VERSION.SDK_INT >= 14) {
            return new oa(context, gdVar);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static SubMenu m33226a(Context context, ge geVar) {
        if (VERSION.SDK_INT >= 14) {
            return new ol(context, geVar);
        }
        throw new UnsupportedOperationException();
    }
}
