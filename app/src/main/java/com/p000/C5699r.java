package com.p000;

import android.content.Context;
import android.view.SubMenu;

/* compiled from: NavigationMenu */
/* renamed from: r */
public class C5699r extends nx {
    public C5699r(Context context) {
        super(context);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        nz nzVar = (nz) mo5449a(i, i2, i3, charSequence);
        SubMenu c5771t = new C5771t(m33170e(), this, nzVar);
        nzVar.a(c5771t);
        return c5771t;
    }
}
