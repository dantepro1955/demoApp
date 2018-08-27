package com.p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BottomNavigationMenu */
/* renamed from: q */
public final class C5683q extends nx {
    public C5683q(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }

    /* renamed from: a */
    protected MenuItem mo5449a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m33173g();
        MenuItem a = super.mo5449a(i, i2, i3, charSequence);
        if (a instanceof nz) {
            ((nz) a).a(true);
        }
        m33174h();
        return a;
    }
}
