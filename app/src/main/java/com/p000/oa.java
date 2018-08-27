package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p000.il.C5396e;

@TargetApi(14)
/* compiled from: MenuItemWrapperICS */
/* renamed from: oa */
public class oa extends ns<gd> implements MenuItem {
    /* renamed from: c */
    private Method f24885c;

    /* compiled from: MenuItemWrapperICS */
    /* renamed from: oa$a */
    class C5595a extends hx {
        /* renamed from: a */
        final ActionProvider f24880a;
        /* renamed from: b */
        final /* synthetic */ oa f24881b;

        public C5595a(oa oaVar, Context context, ActionProvider actionProvider) {
            this.f24881b = oaVar;
            super(context);
            this.f24880a = actionProvider;
        }

        /* renamed from: a */
        public View mo5281a() {
            return this.f24880a.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo5283d() {
            return this.f24880a.onPerformDefaultAction();
        }

        /* renamed from: e */
        public boolean mo5284e() {
            return this.f24880a.hasSubMenu();
        }

        /* renamed from: a */
        public void mo5282a(SubMenu subMenu) {
            this.f24880a.onPrepareSubMenu(this.f24881b.m33046a(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    /* renamed from: oa$b */
    static class C5596b extends FrameLayout implements nj {
        /* renamed from: a */
        final CollapsibleActionView f24882a;

        C5596b(View view) {
            super(view.getContext());
            this.f24882a = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo5285a() {
            this.f24882a.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo5286b() {
            this.f24882a.onActionViewCollapsed();
        }

        /* renamed from: c */
        View m33197c() {
            return (View) this.f24882a;
        }
    }

    /* compiled from: MenuItemWrapperICS */
    /* renamed from: oa$c */
    class C5597c extends nt<OnActionExpandListener> implements C5396e {
        /* renamed from: a */
        final /* synthetic */ oa f24883a;

        C5597c(oa oaVar, OnActionExpandListener onActionExpandListener) {
            this.f24883a = oaVar;
            super(onActionExpandListener);
        }

        /* renamed from: a */
        public boolean mo5287a(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.f24883a.m33045a(menuItem));
        }

        /* renamed from: b */
        public boolean mo5288b(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.f24883a.m33045a(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS */
    /* renamed from: oa$d */
    class C5598d extends nt<OnMenuItemClickListener> implements OnMenuItemClickListener {
        /* renamed from: a */
        final /* synthetic */ oa f24884a;

        C5598d(oa oaVar, OnMenuItemClickListener onMenuItemClickListener) {
            this.f24884a = oaVar;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.f24884a.m33045a(menuItem));
        }
    }

    oa(Context context, gd gdVar) {
        super(context, gdVar);
    }

    public int getItemId() {
        return ((gd) this.b).getItemId();
    }

    public int getGroupId() {
        return ((gd) this.b).getGroupId();
    }

    public int getOrder() {
        return ((gd) this.b).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((gd) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((gd) this.b).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((gd) this.b).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((gd) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((gd) this.b).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((gd) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((gd) this.b).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((gd) this.b).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((gd) this.b).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((gd) this.b).getIntent();
    }

    public MenuItem setShortcut(char c, char c2) {
        ((gd) this.b).setShortcut(c, c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((gd) this.b).setNumericShortcut(c);
        return this;
    }

    public char getNumericShortcut() {
        return ((gd) this.b).getNumericShortcut();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((gd) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((gd) this.b).getAlphabeticShortcut();
    }

    public MenuItem setCheckable(boolean z) {
        ((gd) this.b).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((gd) this.b).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((gd) this.b).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((gd) this.b).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((gd) this.b).setVisible(z);
    }

    public boolean isVisible() {
        return ((gd) this.b).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((gd) this.b).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((gd) this.b).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((gd) this.b).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return m33046a(((gd) this.b).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((gd) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C5598d(this, onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenuInfo getMenuInfo() {
        return ((gd) this.b).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((gd) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((gd) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C5596b(view);
        }
        ((gd) this.b).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((gd) this.b).setActionView(i);
        View actionView = ((gd) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((gd) this.b).setActionView(new C5596b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((gd) this.b).getActionView();
        if (actionView instanceof C5596b) {
            return ((C5596b) actionView).m33197c();
        }
        return actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((gd) this.b).mo5243a(actionProvider != null ? mo5293a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        hx a = ((gd) this.b).mo5245a();
        if (a instanceof C5595a) {
            return ((C5595a) a).f24880a;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((gd) this.b).expandActionView();
    }

    public boolean collapseActionView() {
        return ((gd) this.b).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((gd) this.b).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((gd) this.b).mo5244a(onActionExpandListener != null ? new C5597c(this, onActionExpandListener) : null);
        return this;
    }

    /* renamed from: a */
    public void m33201a(boolean z) {
        try {
            if (this.f24885c == null) {
                this.f24885c = ((gd) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f24885c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    /* renamed from: a */
    C5595a mo5293a(ActionProvider actionProvider) {
        return new C5595a(this, this.a, actionProvider);
    }
}
