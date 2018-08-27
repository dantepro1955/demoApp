package com.p000;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseMenuWrapper */
/* renamed from: ns */
abstract class ns<T> extends nt<T> {
    /* renamed from: a */
    final Context f24793a;
    /* renamed from: c */
    private Map<gd, MenuItem> f24794c;
    /* renamed from: d */
    private Map<ge, SubMenu> f24795d;

    ns(Context context, T t) {
        super(t);
        this.f24793a = context;
    }

    /* renamed from: a */
    final MenuItem m33045a(MenuItem menuItem) {
        if (!(menuItem instanceof gd)) {
            return menuItem;
        }
        gd gdVar = (gd) menuItem;
        if (this.f24794c == null) {
            this.f24794c = new hh();
        }
        MenuItem menuItem2 = (MenuItem) this.f24794c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        menuItem2 = og.m33225a(this.f24793a, gdVar);
        this.f24794c.put(gdVar, menuItem2);
        return menuItem2;
    }

    /* renamed from: a */
    final SubMenu m33046a(SubMenu subMenu) {
        if (!(subMenu instanceof ge)) {
            return subMenu;
        }
        ge geVar = (ge) subMenu;
        if (this.f24795d == null) {
            this.f24795d = new hh();
        }
        SubMenu subMenu2 = (SubMenu) this.f24795d.get(geVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        subMenu2 = og.m33226a(this.f24793a, geVar);
        this.f24795d.put(geVar, subMenu2);
        return subMenu2;
    }

    /* renamed from: a */
    final void m33047a() {
        if (this.f24794c != null) {
            this.f24794c.clear();
        }
        if (this.f24795d != null) {
            this.f24795d.clear();
        }
    }

    /* renamed from: a */
    final void m33048a(int i) {
        if (this.f24794c != null) {
            Iterator it = this.f24794c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    final void m33049b(int i) {
        if (this.f24794c != null) {
            Iterator it = this.f24794c.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
