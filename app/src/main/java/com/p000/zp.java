package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ActionMenu */
/* renamed from: zp */
class zp implements gc {
    /* renamed from: a */
    private static final int[] f26082a = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: b */
    private Context f26083b;
    /* renamed from: c */
    private boolean f26084c;
    /* renamed from: d */
    private ArrayList<zq> f26085d = new ArrayList();

    public zp(Context context) {
        this.f26083b = context;
    }

    /* renamed from: a */
    private static int m34955a(ArrayList<zq> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((zq) arrayList.get(size)).getOrder() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: b */
    private static int m34957b(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f26082a.length) {
            return (f26082a[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public Context m34959a() {
        return this.f26083b;
    }

    public MenuItem add(CharSequence charSequence) {
        return add(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return add(0, 0, 0, i);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return add(i, i2, i3, this.f26083b.getResources().getString(i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        MenuItem zqVar = new zq(m34959a(), i, i2, 0, i3, charSequence);
        this.f26085d.add(zp.m34955a(this.f26085d, zp.m34957b(i3)), zqVar);
        return zqVar;
    }

    /* renamed from: a */
    MenuItem m34960a(zq zqVar) {
        this.f26085d.add(zp.m34955a(this.f26085d, zp.m34957b(zqVar.getOrder())), zqVar);
        return zqVar;
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f26083b.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            Intent intent2;
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return null;
    }

    public SubMenu addSubMenu(int i) {
        return null;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return null;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return null;
    }

    public void clear() {
        this.f26085d.clear();
    }

    public void close() {
    }

    /* renamed from: c */
    private int m34958c(int i) {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((zq) arrayList.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public MenuItem findItem(int i) {
        int c = m34958c(i);
        if (c < 0) {
            return null;
        }
        return (MenuItem) this.f26085d.get(c);
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f26085d.get(i);
    }

    public boolean hasVisibleItems() {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((zq) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private zq m34956a(int i, KeyEvent keyEvent) {
        boolean z = this.f26084c;
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            zq zqVar = (zq) arrayList.get(i2);
            if (z) {
                alphabeticShortcut = zqVar.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = zqVar.getNumericShortcut();
            }
            if (i == alphabeticShortcut) {
                return zqVar;
            }
        }
        return null;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m34956a(i, keyEvent) != null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        int c = m34958c(i);
        if (c < 0) {
            return false;
        }
        return ((zq) this.f26085d.get(c)).m34970b();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        zq a = m34956a(i, keyEvent);
        if (a == null) {
            return false;
        }
        return a.m34970b();
    }

    public void removeGroup(int i) {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            if (((zq) arrayList.get(i2)).getGroupId() == i) {
                arrayList.remove(i2);
                size--;
            } else {
                i2++;
            }
        }
    }

    public void removeItem(int i) {
        int c = m34958c(i);
        if (c >= 0) {
            this.f26085d.remove(c);
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zq zqVar = (zq) arrayList.get(i2);
            if (zqVar.getGroupId() == i) {
                zqVar.setCheckable(z);
                zqVar.m34968a(z2);
            }
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zq zqVar = (zq) arrayList.get(i2);
            if (zqVar.getGroupId() == i) {
                zqVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f26085d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zq zqVar = (zq) arrayList.get(i2);
            if (zqVar.getGroupId() == i) {
                zqVar.setVisible(z);
            }
        }
    }

    public void setQwertyMode(boolean z) {
        this.f26084c = z;
    }

    public int size() {
        return this.f26085d.size();
    }

    /* renamed from: a */
    zp m34961a(int i) {
        zp zpVar = new zp(m34959a());
        zpVar.f26085d = new ArrayList(this.f26085d.subList(0, i));
        return zpVar;
    }

    /* renamed from: b */
    void m34962b() {
        Iterator it = this.f26085d.iterator();
        while (it.hasNext()) {
            if (!((zq) it.next()).isVisible()) {
                it.remove();
            }
        }
    }
}
