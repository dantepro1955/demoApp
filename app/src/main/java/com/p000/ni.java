package com.p000;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* compiled from: ActionMode */
/* renamed from: ni */
public abstract class ni {
    /* renamed from: a */
    private Object f24644a;
    /* renamed from: b */
    private boolean f24645b;

    /* compiled from: ActionMode */
    /* renamed from: ni$a */
    public interface C5551a {
        /* renamed from: a */
        void mo5223a(ni niVar);

        /* renamed from: a */
        boolean mo5224a(ni niVar, Menu menu);

        /* renamed from: a */
        boolean mo5225a(ni niVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo5226b(ni niVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo5229a();

    /* renamed from: a */
    public abstract void mo5230a(int i);

    /* renamed from: a */
    public abstract void mo5231a(View view);

    /* renamed from: a */
    public abstract void mo5232a(CharSequence charSequence);

    /* renamed from: b */
    public abstract Menu mo5234b();

    /* renamed from: b */
    public abstract void mo5235b(int i);

    /* renamed from: b */
    public abstract void mo5236b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo5237c();

    /* renamed from: d */
    public abstract void mo5238d();

    /* renamed from: f */
    public abstract CharSequence mo5239f();

    /* renamed from: g */
    public abstract CharSequence mo5240g();

    /* renamed from: i */
    public abstract View mo5242i();

    /* renamed from: a */
    public void m32861a(Object obj) {
        this.f24644a = obj;
    }

    /* renamed from: j */
    public Object m32872j() {
        return this.f24644a;
    }

    /* renamed from: a */
    public void mo5233a(boolean z) {
        this.f24645b = z;
    }

    /* renamed from: k */
    public boolean m32873k() {
        return this.f24645b;
    }

    /* renamed from: h */
    public boolean mo5241h() {
        return false;
    }
}
