package com.p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import p000.il.C5396e;

/* compiled from: ActionMenuItem */
/* renamed from: nq */
public class nq implements gd {
    /* renamed from: a */
    private final int f24768a;
    /* renamed from: b */
    private final int f24769b;
    /* renamed from: c */
    private final int f24770c;
    /* renamed from: d */
    private final int f24771d;
    /* renamed from: e */
    private CharSequence f24772e;
    /* renamed from: f */
    private CharSequence f24773f;
    /* renamed from: g */
    private Intent f24774g;
    /* renamed from: h */
    private char f24775h;
    /* renamed from: i */
    private char f24776i;
    /* renamed from: j */
    private Drawable f24777j;
    /* renamed from: k */
    private int f24778k = 0;
    /* renamed from: l */
    private Context f24779l;
    /* renamed from: m */
    private OnMenuItemClickListener f24780m;
    /* renamed from: n */
    private int f24781n = 16;

    public /* synthetic */ MenuItem setActionView(int i) {
        return m33010a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m33011a(view);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m33015b(i);
    }

    public nq(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f24779l = context;
        this.f24768a = i2;
        this.f24769b = i;
        this.f24770c = i3;
        this.f24771d = i4;
        this.f24772e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f24776i;
    }

    public int getGroupId() {
        return this.f24769b;
    }

    public Drawable getIcon() {
        return this.f24777j;
    }

    public Intent getIntent() {
        return this.f24774g;
    }

    public int getItemId() {
        return this.f24768a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f24775h;
    }

    public int getOrder() {
        return this.f24771d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f24772e;
    }

    public CharSequence getTitleCondensed() {
        return this.f24773f != null ? this.f24773f : this.f24772e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f24781n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f24781n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f24781n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f24781n & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f24776i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f24781n = (z ? 1 : 0) | (this.f24781n & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f24781n = (z ? 2 : 0) | (this.f24781n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f24781n = (z ? 16 : 0) | (this.f24781n & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f24777j = drawable;
        this.f24778k = 0;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f24778k = i;
        this.f24777j = ew.a(this.f24779l, i);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f24774g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f24775h = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f24780m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f24775h = c;
        this.f24776i = c2;
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f24772e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f24772e = this.f24779l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f24773f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f24781n = (z ? 0 : 8) | (this.f24781n & 8);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    /* renamed from: a */
    public gd m33011a(View view) {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public gd m33010a(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public hx mo5245a() {
        return null;
    }

    /* renamed from: a */
    public gd mo5243a(hx hxVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public gd m33015b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        return false;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public gd mo5244a(C5396e c5396e) {
        return this;
    }
}
