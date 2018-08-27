package com.p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.mx.C5569b;

/* compiled from: MenuBuilder */
/* renamed from: nx */
public class nx implements gc {
    /* renamed from: d */
    private static final int[] f24849d = new int[]{1, 4, 5, 3, 2, 0};
    /* renamed from: a */
    CharSequence f24850a;
    /* renamed from: b */
    Drawable f24851b;
    /* renamed from: c */
    View f24852c;
    /* renamed from: e */
    private final Context f24853e;
    /* renamed from: f */
    private final Resources f24854f;
    /* renamed from: g */
    private boolean f24855g;
    /* renamed from: h */
    private boolean f24856h;
    /* renamed from: i */
    private C5537a f24857i;
    /* renamed from: j */
    private ArrayList<nz> f24858j;
    /* renamed from: k */
    private ArrayList<nz> f24859k;
    /* renamed from: l */
    private boolean f24860l;
    /* renamed from: m */
    private ArrayList<nz> f24861m;
    /* renamed from: n */
    private ArrayList<nz> f24862n;
    /* renamed from: o */
    private boolean f24863o;
    /* renamed from: p */
    private int f24864p = 0;
    /* renamed from: q */
    private ContextMenuInfo f24865q;
    /* renamed from: r */
    private boolean f24866r = false;
    /* renamed from: s */
    private boolean f24867s = false;
    /* renamed from: t */
    private boolean f24868t = false;
    /* renamed from: u */
    private boolean f24869u = false;
    /* renamed from: v */
    private boolean f24870v = false;
    /* renamed from: w */
    private ArrayList<nz> f24871w = new ArrayList();
    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<oe>> f24872x = new CopyOnWriteArrayList();
    /* renamed from: y */
    private nz f24873y;
    /* renamed from: z */
    private boolean f24874z;

    /* compiled from: MenuBuilder */
    /* renamed from: nx$a */
    public interface C5537a {
        /* renamed from: a */
        void mo5200a(nx nxVar);

        /* renamed from: a */
        boolean mo5203a(nx nxVar, MenuItem menuItem);
    }

    /* compiled from: MenuBuilder */
    /* renamed from: nx$b */
    public interface C5593b {
        /* renamed from: a */
        boolean m33125a(nz nzVar);
    }

    public nx(Context context) {
        this.f24853e = context;
        this.f24854f = context.getResources();
        this.f24858j = new ArrayList();
        this.f24859k = new ArrayList();
        this.f24860l = true;
        this.f24861m = new ArrayList();
        this.f24862n = new ArrayList();
        this.f24863o = true;
        m33133e(true);
    }

    /* renamed from: a */
    public nx m33139a(int i) {
        this.f24864p = i;
        return this;
    }

    /* renamed from: a */
    public void m33149a(oe oeVar) {
        m33150a(oeVar, this.f24853e);
    }

    /* renamed from: a */
    public void m33150a(oe oeVar, Context context) {
        this.f24872x.add(new WeakReference(oeVar));
        oeVar.mo5254a(context, this);
        this.f24863o = true;
    }

    /* renamed from: b */
    public void m33158b(oe oeVar) {
        Iterator it = this.f24872x.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oe oeVar2 = (oe) weakReference.get();
            if (oeVar2 == null || oeVar2 == oeVar) {
                this.f24872x.remove(weakReference);
            }
        }
    }

    /* renamed from: d */
    private void m33131d(boolean z) {
        if (!this.f24872x.isEmpty()) {
            m33173g();
            Iterator it = this.f24872x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                } else {
                    oeVar.mo5257a(z);
                }
            }
            m33174h();
        }
    }

    /* renamed from: a */
    private boolean m33130a(ok okVar, oe oeVar) {
        boolean z = false;
        if (this.f24872x.isEmpty()) {
            return false;
        }
        if (oeVar != null) {
            z = oeVar.mo5260a(okVar);
        }
        Iterator it = this.f24872x.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            oe oeVar2 = (oe) weakReference.get();
            if (oeVar2 == null) {
                this.f24872x.remove(weakReference);
                z = z2;
            } else if (z2) {
                z = z2;
            } else {
                z = oeVar2.mo5260a(okVar);
            }
            z2 = z;
        }
        return z2;
    }

    /* renamed from: e */
    private void m33132e(Bundle bundle) {
        if (!this.f24872x.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f24872x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                } else {
                    int b = oeVar.mo5261b();
                    if (b > 0) {
                        Parcelable c = oeVar.mo5272c();
                        if (c != null) {
                            sparseArray.put(b, c);
                        }
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: f */
    private void m33135f(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f24872x.isEmpty()) {
            Iterator it = this.f24872x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                } else {
                    int b = oeVar.mo5261b();
                    if (b > 0) {
                        Parcelable parcelable = (Parcelable) sparseParcelableArray.get(b);
                        if (parcelable != null) {
                            oeVar.mo5266a(parcelable);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m33144a(Bundle bundle) {
        m33132e(bundle);
    }

    /* renamed from: b */
    public void m33156b(Bundle bundle) {
        m33135f(bundle);
    }

    /* renamed from: c */
    public void m33162c(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a = il.m30807a(item);
            if (!(a == null || a.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                a.saveHierarchyState(sparseArray);
                if (il.m30812d(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((ok) item.getSubMenu()).m33162c(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo5294a(), sparseArray);
        }
    }

    /* renamed from: d */
    public void m33168d(Bundle bundle) {
        if (bundle != null) {
            MenuItem item;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo5294a());
            int size = size();
            for (int i = 0; i < size; i++) {
                item = getItem(i);
                View a = il.m30807a(item);
                if (!(a == null || a.getId() == -1)) {
                    a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((ok) item.getSubMenu()).m33168d(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                item = findItem(i2);
                if (item != null) {
                    il.m30810b(item);
                }
            }
        }
    }

    /* renamed from: a */
    protected String mo5294a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo5295a(C5537a c5537a) {
        this.f24857i = c5537a;
    }

    /* renamed from: a */
    protected MenuItem mo5449a(int i, int i2, int i3, CharSequence charSequence) {
        int f = nx.m33134f(i3);
        MenuItem a = m33127a(i, i2, i3, f, charSequence, this.f24864p);
        if (this.f24865q != null) {
            a.a(this.f24865q);
        }
        this.f24858j.add(nx.m33126a(this.f24858j, f), a);
        mo5525a(true);
        return a;
    }

    /* renamed from: a */
    private nz m33127a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new nz(this, i, i2, i3, i4, charSequence, i5);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo5449a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i) {
        return mo5449a(0, 0, 0, this.f24854f.getString(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo5449a(i, i2, i3, charSequence);
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo5449a(i, i2, i3, this.f24854f.getString(i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f24854f.getString(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        nz nzVar = (nz) mo5449a(i, i2, i3, charSequence);
        SubMenu okVar = new ok(this.f24853e, this, nzVar);
        nzVar.a(okVar);
        return okVar;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f24854f.getString(i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f24853e.getPackageManager();
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

    public void removeItem(int i) {
        m33129a(m33155b(i), true);
    }

    public void removeGroup(int i) {
        int c = m33161c(i);
        if (c >= 0) {
            int size = this.f24858j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((nz) this.f24858j.get(c)).getGroupId() != i) {
                    mo5525a(true);
                } else {
                    m33129a(c, false);
                    i2 = i3;
                }
            }
            mo5525a(true);
        }
    }

    /* renamed from: a */
    private void m33129a(int i, boolean z) {
        if (i >= 0 && i < this.f24858j.size()) {
            this.f24858j.remove(i);
            if (z) {
                mo5525a(true);
            }
        }
    }

    public void clear() {
        if (this.f24873y != null) {
            mo5300d(this.f24873y);
        }
        this.f24858j.clear();
        mo5525a(true);
    }

    /* renamed from: a */
    void m33145a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f24858j.size();
        m33173g();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem2 = (nz) this.f24858j.get(i);
            if (menuItem2.getGroupId() == groupId && menuItem2.g() && menuItem2.isCheckable()) {
                menuItem2.b(menuItem2 == menuItem);
            }
        }
        m33174h();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f24858j.size();
        for (int i2 = 0; i2 < size; i2++) {
            nz nzVar = (nz) this.f24858j.get(i2);
            if (nzVar.getGroupId() == i) {
                nzVar.a(z2);
                nzVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f24858j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            boolean z3;
            nz nzVar = (nz) this.f24858j.get(i2);
            if (nzVar.getGroupId() == i && nzVar.c(z)) {
                z3 = true;
            } else {
                z3 = z2;
            }
            i2++;
            z2 = z3;
        }
        if (z2) {
            mo5525a(true);
        }
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f24858j.size();
        for (int i2 = 0; i2 < size; i2++) {
            nz nzVar = (nz) this.f24858j.get(i2);
            if (nzVar.getGroupId() == i) {
                nzVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f24874z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((nz) this.f24858j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            nz nzVar = (nz) this.f24858j.get(i2);
            if (nzVar.getItemId() == i) {
                return nzVar;
            }
            if (nzVar.hasSubMenu()) {
                MenuItem findItem = nzVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public int m33155b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((nz) this.f24858j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int m33161c(int i) {
        return m33136a(i, 0);
    }

    /* renamed from: a */
    public int m33136a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (((nz) this.f24858j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    public int size() {
        return this.f24858j.size();
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f24858j.get(i);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m33143a(i, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.f24855g = z;
        mo5525a(false);
    }

    /* renamed from: f */
    private static int m33134f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0 && i2 < f24849d.length) {
            return (f24849d[i2] << 16) | (65535 & i);
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: b */
    boolean mo5297b() {
        return this.f24855g;
    }

    /* renamed from: e */
    private void m33133e(boolean z) {
        boolean z2 = true;
        if (!(z && this.f24854f.getConfiguration().keyboard != 1 && this.f24854f.getBoolean(C5569b.abc_config_showMenuShortcutsWhenKeyboardPresent))) {
            z2 = false;
        }
        this.f24856h = z2;
    }

    /* renamed from: c */
    public boolean mo5298c() {
        return this.f24856h;
    }

    /* renamed from: d */
    Resources m33166d() {
        return this.f24854f;
    }

    /* renamed from: e */
    public Context m33170e() {
        return this.f24853e;
    }

    /* renamed from: a */
    boolean mo5296a(nx nxVar, MenuItem menuItem) {
        return this.f24857i != null && this.f24857i.mo5203a(nxVar, menuItem);
    }

    /* renamed from: f */
    public void m33172f() {
        if (this.f24857i != null) {
            this.f24857i.mo5200a(this);
        }
    }

    /* renamed from: a */
    private static int m33126a(ArrayList<nz> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((nz) arrayList.get(size)).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItem a = m33143a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = m33152a(a, i2);
        }
        if ((i2 & 2) != 0) {
            m33159b(true);
        }
        return z;
    }

    /* renamed from: a */
    void m33146a(List<nz> list, int i, KeyEvent keyEvent) {
        boolean b = mo5297b();
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f24858j.size();
            for (int i2 = 0; i2 < size; i2++) {
                nz nzVar = (nz) this.f24858j.get(i2);
                if (nzVar.hasSubMenu()) {
                    ((nx) nzVar.getSubMenu()).m33146a((List) list, i, keyEvent);
                }
                char alphabeticShortcut = b ? nzVar.getAlphabeticShortcut() : nzVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != '\u0000' && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b && alphabeticShortcut == '\b' && i == 67)) && nzVar.isEnabled())) {
                    list.add(nzVar);
                }
            }
        }
    }

    /* renamed from: a */
    nz m33143a(int i, KeyEvent keyEvent) {
        List list = this.f24871w;
        list.clear();
        m33146a(list, i, keyEvent);
        if (list.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = list.size();
        if (size == 1) {
            return (nz) list.get(0);
        }
        boolean b = mo5297b();
        for (int i2 = 0; i2 < size; i2++) {
            char alphabeticShortcut;
            nz nzVar = (nz) list.get(i2);
            if (b) {
                alphabeticShortcut = nzVar.getAlphabeticShortcut();
            } else {
                alphabeticShortcut = nzVar.getNumericShortcut();
            }
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return nzVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return nzVar;
            }
            if (b && alphabeticShortcut == '\b' && i == 67) {
                return nzVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return m33152a(findItem(i), i2);
    }

    /* renamed from: a */
    public boolean m33152a(MenuItem menuItem, int i) {
        return m33153a(menuItem, null, i);
    }

    /* renamed from: a */
    public boolean m33153a(MenuItem menuItem, oe oeVar, int i) {
        nz nzVar = (nz) menuItem;
        if (nzVar == null || !nzVar.isEnabled()) {
            return false;
        }
        boolean z;
        boolean b = nzVar.b();
        hx a = nzVar.a();
        if (a == null || !a.mo5284e()) {
            z = false;
        } else {
            z = true;
        }
        boolean expandActionView;
        if (nzVar.n()) {
            expandActionView = nzVar.expandActionView() | b;
            if (!expandActionView) {
                return expandActionView;
            }
            m33159b(true);
            return expandActionView;
        } else if (nzVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m33159b(false);
            }
            if (!nzVar.hasSubMenu()) {
                nzVar.a(new ok(m33170e(), this, nzVar));
            }
            ok okVar = (ok) nzVar.getSubMenu();
            if (z) {
                a.mo5282a((SubMenu) okVar);
            }
            expandActionView = m33130a(okVar, oeVar) | b;
            if (expandActionView) {
                return expandActionView;
            }
            m33159b(true);
            return expandActionView;
        } else {
            if ((i & 1) == 0) {
                m33159b(true);
            }
            return b;
        }
    }

    /* renamed from: b */
    public final void m33159b(boolean z) {
        if (!this.f24870v) {
            this.f24870v = true;
            Iterator it = this.f24872x.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                } else {
                    oeVar.mo5255a(this, z);
                }
            }
            this.f24870v = false;
        }
    }

    public void close() {
        m33159b(true);
    }

    /* renamed from: a */
    public void mo5525a(boolean z) {
        if (this.f24866r) {
            this.f24867s = true;
            if (z) {
                this.f24868t = true;
                return;
            }
            return;
        }
        if (z) {
            this.f24860l = true;
            this.f24863o = true;
        }
        m33131d(z);
    }

    /* renamed from: g */
    public void m33173g() {
        if (!this.f24866r) {
            this.f24866r = true;
            this.f24867s = false;
            this.f24868t = false;
        }
    }

    /* renamed from: h */
    public void m33174h() {
        this.f24866r = false;
        if (this.f24867s) {
            this.f24867s = false;
            mo5525a(this.f24868t);
        }
    }

    /* renamed from: a */
    void m33148a(nz nzVar) {
        this.f24860l = true;
        mo5525a(true);
    }

    /* renamed from: b */
    void m33157b(nz nzVar) {
        this.f24863o = true;
        mo5525a(true);
    }

    /* renamed from: i */
    public ArrayList<nz> m33175i() {
        if (!this.f24860l) {
            return this.f24859k;
        }
        this.f24859k.clear();
        int size = this.f24858j.size();
        for (int i = 0; i < size; i++) {
            nz nzVar = (nz) this.f24858j.get(i);
            if (nzVar.isVisible()) {
                this.f24859k.add(nzVar);
            }
        }
        this.f24860l = false;
        this.f24863o = true;
        return this.f24859k;
    }

    /* renamed from: j */
    public void m33176j() {
        ArrayList i = m33175i();
        if (this.f24863o) {
            Iterator it = this.f24872x.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3;
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                    i3 = i2;
                } else {
                    i3 = oeVar.mo5258a() | i2;
                }
                i2 = i3;
            }
            if (i2 != 0) {
                this.f24861m.clear();
                this.f24862n.clear();
                i2 = i.size();
                for (int i4 = 0; i4 < i2; i4++) {
                    nz nzVar = (nz) i.get(i4);
                    if (nzVar.j()) {
                        this.f24861m.add(nzVar);
                    } else {
                        this.f24862n.add(nzVar);
                    }
                }
            } else {
                this.f24861m.clear();
                this.f24862n.clear();
                this.f24862n.addAll(m33175i());
            }
            this.f24863o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<nz> m33177k() {
        m33176j();
        return this.f24861m;
    }

    /* renamed from: l */
    public ArrayList<nz> m33178l() {
        m33176j();
        return this.f24862n;
    }

    public void clearHeader() {
        this.f24851b = null;
        this.f24850a = null;
        this.f24852c = null;
        mo5525a(false);
    }

    /* renamed from: a */
    private void m33128a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d = m33166d();
        if (view != null) {
            this.f24852c = view;
            this.f24850a = null;
            this.f24851b = null;
        } else {
            if (i > 0) {
                this.f24850a = d.getText(i);
            } else if (charSequence != null) {
                this.f24850a = charSequence;
            }
            if (i2 > 0) {
                this.f24851b = ew.a(m33170e(), i2);
            } else if (drawable != null) {
                this.f24851b = drawable;
            }
            this.f24852c = null;
        }
        mo5525a(false);
    }

    /* renamed from: a */
    protected nx m33142a(CharSequence charSequence) {
        m33128a(0, charSequence, 0, null, null);
        return this;
    }

    /* renamed from: d */
    protected nx m33167d(int i) {
        m33128a(i, null, 0, null, null);
        return this;
    }

    /* renamed from: a */
    protected nx m33140a(Drawable drawable) {
        m33128a(0, null, 0, drawable, null);
        return this;
    }

    /* renamed from: e */
    protected nx m33171e(int i) {
        m33128a(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    protected nx m33141a(View view) {
        m33128a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: m */
    public CharSequence m33179m() {
        return this.f24850a;
    }

    /* renamed from: n */
    public Drawable m33180n() {
        return this.f24851b;
    }

    /* renamed from: o */
    public View m33181o() {
        return this.f24852c;
    }

    /* renamed from: p */
    public nx mo5301p() {
        return this;
    }

    /* renamed from: q */
    boolean m33183q() {
        return this.f24869u;
    }

    /* renamed from: c */
    public boolean mo5299c(nz nzVar) {
        boolean z = false;
        if (!this.f24872x.isEmpty()) {
            m33173g();
            Iterator it = this.f24872x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                    z = z2;
                } else {
                    z = oeVar.mo5259a(this, nzVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m33174h();
            if (z) {
                this.f24873y = nzVar;
            }
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo5300d(nz nzVar) {
        boolean z = false;
        if (!this.f24872x.isEmpty() && this.f24873y == nzVar) {
            m33173g();
            Iterator it = this.f24872x.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                oe oeVar = (oe) weakReference.get();
                if (oeVar == null) {
                    this.f24872x.remove(weakReference);
                    z = z2;
                } else {
                    z = oeVar.mo5262b(this, nzVar);
                    if (z) {
                        break;
                    }
                }
                z2 = z;
            }
            z = z2;
            m33174h();
            if (z) {
                this.f24873y = null;
            }
        }
        return z;
    }

    /* renamed from: r */
    public nz m33184r() {
        return this.f24873y;
    }

    /* renamed from: c */
    public void m33163c(boolean z) {
        this.f24874z = z;
    }
}
