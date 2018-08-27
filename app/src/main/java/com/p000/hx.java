package com.p000;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionProvider */
/* renamed from: hx */
public abstract class hx {
    /* renamed from: a */
    private final Context f23833a;
    /* renamed from: b */
    private C5375a f23834b;
    /* renamed from: c */
    private C5376b f23835c;

    /* compiled from: ActionProvider */
    /* renamed from: hx$a */
    public interface C5375a {
        /* renamed from: b */
        void m30700b(boolean z);
    }

    /* compiled from: ActionProvider */
    /* renamed from: hx$b */
    public interface C5376b {
        /* renamed from: a */
        void mo5280a(boolean z);
    }

    /* renamed from: a */
    public abstract View mo5281a();

    public hx(Context context) {
        this.f23833a = context;
    }

    /* renamed from: a */
    public View mo5289a(MenuItem menuItem) {
        return mo5281a();
    }

    /* renamed from: b */
    public boolean mo5291b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo5292c() {
        return true;
    }

    /* renamed from: d */
    public boolean mo5283d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo5284e() {
        return false;
    }

    /* renamed from: a */
    public void mo5282a(SubMenu subMenu) {
    }

    /* renamed from: a */
    public void m30707a(boolean z) {
        if (this.f23834b != null) {
            this.f23834b.m30700b(z);
        }
    }

    /* renamed from: a */
    public void m30705a(C5375a c5375a) {
        this.f23834b = c5375a;
    }

    /* renamed from: a */
    public void mo5290a(C5376b c5376b) {
        if (!(this.f23835c == null || c5376b == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f23835c = c5376b;
    }

    /* renamed from: f */
    public void m30712f() {
        this.f23835c = null;
        this.f23834b = null;
    }
}
