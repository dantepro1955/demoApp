package com.p000;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

@TargetApi(14)
/* compiled from: MenuWrapperICS */
/* renamed from: oh */
class oh extends ns<gc> implements Menu {
    oh(Context context, gc gcVar) {
        super(context, gcVar);
    }

    public MenuItem add(CharSequence charSequence) {
        return m33045a(((gc) this.b).add(charSequence));
    }

    public MenuItem add(int i) {
        return m33045a(((gc) this.b).add(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m33045a(((gc) this.b).add(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return m33045a(((gc) this.b).add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return m33046a(((gc) this.b).addSubMenu(charSequence));
    }

    public SubMenu addSubMenu(int i) {
        return m33046a(((gc) this.b).addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m33046a(((gc) this.b).addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m33046a(((gc) this.b).addSubMenu(i, i2, i3, i4));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((gc) this.b).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m33045a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public void removeItem(int i) {
        m33049b(i);
        ((gc) this.b).removeItem(i);
    }

    public void removeGroup(int i) {
        m33048a(i);
        ((gc) this.b).removeGroup(i);
    }

    public void clear() {
        m33047a();
        ((gc) this.b).clear();
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((gc) this.b).setGroupCheckable(i, z, z2);
    }

    public void setGroupVisible(int i, boolean z) {
        ((gc) this.b).setGroupVisible(i, z);
    }

    public void setGroupEnabled(int i, boolean z) {
        ((gc) this.b).setGroupEnabled(i, z);
    }

    public boolean hasVisibleItems() {
        return ((gc) this.b).hasVisibleItems();
    }

    public MenuItem findItem(int i) {
        return m33045a(((gc) this.b).findItem(i));
    }

    public int size() {
        return ((gc) this.b).size();
    }

    public MenuItem getItem(int i) {
        return m33045a(((gc) this.b).getItem(i));
    }

    public void close() {
        ((gc) this.b).close();
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((gc) this.b).performShortcut(i, keyEvent, i2);
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((gc) this.b).isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return ((gc) this.b).performIdentifierAction(i, i2);
    }

    public void setQwertyMode(boolean z) {
        ((gc) this.b).setQwertyMode(z);
    }
}
