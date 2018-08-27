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
/* renamed from: zq */
class zq implements gd {
    /* renamed from: a */
    private final int f26086a;
    /* renamed from: b */
    private final int f26087b;
    /* renamed from: c */
    private final int f26088c;
    /* renamed from: d */
    private final int f26089d;
    /* renamed from: e */
    private CharSequence f26090e;
    /* renamed from: f */
    private CharSequence f26091f;
    /* renamed from: g */
    private Intent f26092g;
    /* renamed from: h */
    private char f26093h;
    /* renamed from: i */
    private char f26094i;
    /* renamed from: j */
    private Drawable f26095j;
    /* renamed from: k */
    private int f26096k = 0;
    /* renamed from: l */
    private Context f26097l;
    /* renamed from: m */
    private OnMenuItemClickListener f26098m;
    /* renamed from: n */
    private int f26099n = 16;

    public /* synthetic */ MenuItem setActionView(int i) {
        return m34963a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m34964a(view);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m34969b(i);
    }

    public zq(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f26097l = context;
        this.f26086a = i2;
        this.f26087b = i;
        this.f26088c = i3;
        this.f26089d = i4;
        this.f26090e = charSequence;
    }

    public char getAlphabeticShortcut() {
        return this.f26094i;
    }

    public int getGroupId() {
        return this.f26087b;
    }

    public Drawable getIcon() {
        return this.f26095j;
    }

    public Intent getIntent() {
        return this.f26092g;
    }

    public int getItemId() {
        return this.f26086a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f26093h;
    }

    public int getOrder() {
        return this.f26089d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f26090e;
    }

    public CharSequence getTitleCondensed() {
        return this.f26091f != null ? this.f26091f : this.f26090e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f26099n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f26099n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f26099n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f26099n & 8) == 0;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f26094i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f26099n = (z ? 1 : 0) | (this.f26099n & -2);
        return this;
    }

    /* renamed from: a */
    public zq m34968a(boolean z) {
        this.f26099n = (z ? 4 : 0) | (this.f26099n & -5);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f26099n = (z ? 2 : 0) | (this.f26099n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f26099n = (z ? 16 : 0) | (this.f26099n & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f26095j = drawable;
        this.f26096k = 0;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f26096k = i;
        if (i > 0) {
            this.f26095j = ew.a(this.f26097l, i);
        }
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f26092g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f26093h = c;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f26098m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f26093h = c;
        this.f26094i = c2;
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f26090e = charSequence;
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f26090e = this.f26097l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f26091f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f26099n = (z ? 0 : 8) | (this.f26099n & 8);
        return this;
    }

    /* renamed from: b */
    public boolean m34970b() {
        if (this.f26098m != null && this.f26098m.onMenuItemClick(this)) {
            return true;
        }
        if (this.f26092g == null) {
            return false;
        }
        this.f26097l.startActivity(this.f26092g);
        return true;
    }

    public void setShowAsAction(int i) {
    }

    /* renamed from: a */
    public gd m34964a(View view) {
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
    public gd m34963a(int i) {
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
    public gd m34969b(int i) {
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
