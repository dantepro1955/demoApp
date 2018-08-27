package com.p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import p000.il.C5396e;
import p000.of.C5601a;

/* compiled from: MenuItemImpl */
/* renamed from: nz */
public final class nz implements gd {
    /* renamed from: w */
    private static String f16884w;
    /* renamed from: x */
    private static String f16885x;
    /* renamed from: y */
    private static String f16886y;
    /* renamed from: z */
    private static String f16887z;
    /* renamed from: a */
    nx f16888a;
    /* renamed from: b */
    private final int f16889b;
    /* renamed from: c */
    private final int f16890c;
    /* renamed from: d */
    private final int f16891d;
    /* renamed from: e */
    private final int f16892e;
    /* renamed from: f */
    private CharSequence f16893f;
    /* renamed from: g */
    private CharSequence f16894g;
    /* renamed from: h */
    private Intent f16895h;
    /* renamed from: i */
    private char f16896i;
    /* renamed from: j */
    private char f16897j;
    /* renamed from: k */
    private Drawable f16898k;
    /* renamed from: l */
    private int f16899l = 0;
    /* renamed from: m */
    private ok f16900m;
    /* renamed from: n */
    private Runnable f16901n;
    /* renamed from: o */
    private OnMenuItemClickListener f16902o;
    /* renamed from: p */
    private int f16903p = 16;
    /* renamed from: q */
    private int f16904q = 0;
    /* renamed from: r */
    private View f16905r;
    /* renamed from: s */
    private hx f16906s;
    /* renamed from: t */
    private C5396e f16907t;
    /* renamed from: u */
    private boolean f16908u = false;
    /* renamed from: v */
    private ContextMenuInfo f16909v;

    public /* synthetic */ MenuItem setActionView(int i) {
        return m21291a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m21292a(view);
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m21300b(i);
    }

    nz(nx nxVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f16888a = nxVar;
        this.f16889b = i2;
        this.f16890c = i;
        this.f16891d = i3;
        this.f16892e = i4;
        this.f16893f = charSequence;
        this.f16904q = i5;
    }

    /* renamed from: b */
    public boolean m21302b() {
        if ((this.f16902o != null && this.f16902o.onMenuItemClick(this)) || this.f16888a.a(this.f16888a.p(), this)) {
            return true;
        }
        if (this.f16901n != null) {
            this.f16901n.run();
            return true;
        }
        if (this.f16895h != null) {
            try {
                this.f16888a.e().startActivity(this.f16895h);
                return true;
            } catch (Throwable e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        if (this.f16906s == null || !this.f16906s.d()) {
            return false;
        }
        return true;
    }

    public boolean isEnabled() {
        return (this.f16903p & 16) != 0;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f16903p |= 16;
        } else {
            this.f16903p &= -17;
        }
        this.f16888a.a(false);
        return this;
    }

    public int getGroupId() {
        return this.f16890c;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f16889b;
    }

    public int getOrder() {
        return this.f16891d;
    }

    /* renamed from: c */
    public int m21303c() {
        return this.f16892e;
    }

    public Intent getIntent() {
        return this.f16895h;
    }

    public MenuItem setIntent(Intent intent) {
        this.f16895h = intent;
        return this;
    }

    public char getAlphabeticShortcut() {
        return this.f16897j;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f16897j != c) {
            this.f16897j = Character.toLowerCase(c);
            this.f16888a.a(false);
        }
        return this;
    }

    public char getNumericShortcut() {
        return this.f16896i;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f16896i != c) {
            this.f16896i = c;
            this.f16888a.a(false);
        }
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f16896i = c;
        this.f16897j = Character.toLowerCase(c2);
        this.f16888a.a(false);
        return this;
    }

    /* renamed from: d */
    public char m21305d() {
        return this.f16888a.b() ? this.f16897j : this.f16896i;
    }

    /* renamed from: e */
    public String m21307e() {
        char d = m21305d();
        if (d == '\u0000') {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder(f16884w);
        switch (d) {
            case '\b':
                stringBuilder.append(f16886y);
                break;
            case '\n':
                stringBuilder.append(f16885x);
                break;
            case ' ':
                stringBuilder.append(f16887z);
                break;
            default:
                stringBuilder.append(d);
                break;
        }
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public boolean m21309f() {
        return this.f16888a.c() && m21305d() != '\u0000';
    }

    public SubMenu getSubMenu() {
        return this.f16900m;
    }

    public boolean hasSubMenu() {
        return this.f16900m != null;
    }

    /* renamed from: a */
    public void m21298a(ok okVar) {
        this.f16900m = okVar;
        okVar.setHeaderTitle(getTitle());
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f16893f;
    }

    /* renamed from: a */
    public CharSequence m21296a(C5601a c5601a) {
        if (c5601a == null || !c5601a.a()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f16893f = charSequence;
        this.f16888a.a(false);
        if (this.f16900m != null) {
            this.f16900m.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle(this.f16888a.e().getString(i));
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f16894g != null ? this.f16894g : this.f16893f;
        if (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f16894g = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f16893f;
        }
        this.f16888a.a(false);
        return this;
    }

    public Drawable getIcon() {
        if (this.f16898k != null) {
            return this.f16898k;
        }
        if (this.f16899l == 0) {
            return null;
        }
        Drawable b = na.b(this.f16888a.e(), this.f16899l);
        this.f16899l = 0;
        this.f16898k = b;
        return b;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f16899l = 0;
        this.f16898k = drawable;
        this.f16888a.a(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f16898k = null;
        this.f16899l = i;
        this.f16888a.a(false);
        return this;
    }

    public boolean isCheckable() {
        return (this.f16903p & 1) == 1;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f16903p;
        this.f16903p = (z ? 1 : 0) | (this.f16903p & -2);
        if (i != this.f16903p) {
            this.f16888a.a(false);
        }
        return this;
    }

    /* renamed from: a */
    public void m21299a(boolean z) {
        this.f16903p = (z ? 4 : 0) | (this.f16903p & -5);
    }

    /* renamed from: g */
    public boolean m21310g() {
        return (this.f16903p & 4) != 0;
    }

    public boolean isChecked() {
        return (this.f16903p & 2) == 2;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f16903p & 4) != 0) {
            this.f16888a.a(this);
        } else {
            m21301b(z);
        }
        return this;
    }

    /* renamed from: b */
    void m21301b(boolean z) {
        int i;
        int i2 = this.f16903p;
        int i3 = this.f16903p & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f16903p = i | i3;
        if (i2 != this.f16903p) {
            this.f16888a.a(false);
        }
    }

    public boolean isVisible() {
        if (this.f16906s == null || !this.f16906s.b()) {
            if ((this.f16903p & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.f16903p & 8) == 0 && this.f16906s.c()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    boolean m21304c(boolean z) {
        int i = this.f16903p;
        this.f16903p = (z ? 0 : 8) | (this.f16903p & -9);
        if (i != this.f16903p) {
            return true;
        }
        return false;
    }

    public MenuItem setVisible(boolean z) {
        if (m21304c(z)) {
            this.f16888a.a(this);
        }
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f16902o = onMenuItemClickListener;
        return this;
    }

    public String toString() {
        return this.f16893f != null ? this.f16893f.toString() : null;
    }

    /* renamed from: a */
    void m21297a(ContextMenuInfo contextMenuInfo) {
        this.f16909v = contextMenuInfo;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f16909v;
    }

    /* renamed from: h */
    public void m21311h() {
        this.f16888a.b(this);
    }

    /* renamed from: i */
    public boolean m21312i() {
        return this.f16888a.q();
    }

    /* renamed from: j */
    public boolean m21313j() {
        return (this.f16903p & 32) == 32;
    }

    /* renamed from: k */
    public boolean m21314k() {
        return (this.f16904q & 1) == 1;
    }

    /* renamed from: l */
    public boolean m21315l() {
        return (this.f16904q & 2) == 2;
    }

    /* renamed from: d */
    public void m21306d(boolean z) {
        if (z) {
            this.f16903p |= 32;
        } else {
            this.f16903p &= -33;
        }
    }

    /* renamed from: m */
    public boolean m21316m() {
        return (this.f16904q & 4) == 4;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f16904q = i;
                this.f16888a.b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* renamed from: a */
    public gd m21292a(View view) {
        this.f16905r = view;
        this.f16906s = null;
        if (view != null && view.getId() == -1 && this.f16889b > 0) {
            view.setId(this.f16889b);
        }
        this.f16888a.b(this);
        return this;
    }

    /* renamed from: a */
    public gd m21291a(int i) {
        Context e = this.f16888a.e();
        m21292a(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    public View getActionView() {
        if (this.f16905r != null) {
            return this.f16905r;
        }
        if (this.f16906s == null) {
            return null;
        }
        this.f16905r = this.f16906s.a(this);
        return this.f16905r;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* renamed from: a */
    public hx m21295a() {
        return this.f16906s;
    }

    /* renamed from: a */
    public gd m21293a(hx hxVar) {
        if (this.f16906s != null) {
            this.f16906s.f();
        }
        this.f16905r = null;
        this.f16906s = hxVar;
        this.f16888a.a(true);
        if (this.f16906s != null) {
            this.f16906s.a(new nz$1(this));
        }
        return this;
    }

    /* renamed from: b */
    public gd m21300b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean expandActionView() {
        if (!m21317n()) {
            return false;
        }
        if (this.f16907t == null || this.f16907t.a(this)) {
            return this.f16888a.c(this);
        }
        return false;
    }

    public boolean collapseActionView() {
        if ((this.f16904q & 8) == 0) {
            return false;
        }
        if (this.f16905r == null) {
            return true;
        }
        if (this.f16907t == null || this.f16907t.b(this)) {
            return this.f16888a.d(this);
        }
        return false;
    }

    /* renamed from: a */
    public gd m21294a(C5396e c5396e) {
        this.f16907t = c5396e;
        return this;
    }

    /* renamed from: n */
    public boolean m21317n() {
        if ((this.f16904q & 8) == 0) {
            return false;
        }
        if (this.f16905r == null && this.f16906s != null) {
            this.f16905r = this.f16906s.a(this);
        }
        if (this.f16905r != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m21308e(boolean z) {
        this.f16908u = z;
        this.f16888a.a(false);
    }

    public boolean isActionViewExpanded() {
        return this.f16908u;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
}
