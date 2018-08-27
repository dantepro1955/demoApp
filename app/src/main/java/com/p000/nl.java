package com.p000;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import p000.ni.C5551a;
import p000.nx.C5537a;

/* compiled from: StandaloneActionMode */
/* renamed from: nl */
public class nl extends ni implements C5537a {
    /* renamed from: a */
    private Context f24711a;
    /* renamed from: b */
    private ActionBarContextView f24712b;
    /* renamed from: c */
    private C5551a f24713c;
    /* renamed from: d */
    private WeakReference<View> f24714d;
    /* renamed from: e */
    private boolean f24715e;
    /* renamed from: f */
    private boolean f24716f;
    /* renamed from: g */
    private nx f24717g;

    public nl(Context context, ActionBarContextView actionBarContextView, C5551a c5551a, boolean z) {
        this.f24711a = context;
        this.f24712b = actionBarContextView;
        this.f24713c = c5551a;
        this.f24717g = new nx(actionBarContextView.getContext()).m33139a(1);
        this.f24717g.mo5295a((C5537a) this);
        this.f24716f = z;
    }

    /* renamed from: b */
    public void mo5236b(CharSequence charSequence) {
        this.f24712b.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo5232a(CharSequence charSequence) {
        this.f24712b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo5230a(int i) {
        mo5236b(this.f24711a.getString(i));
    }

    /* renamed from: b */
    public void mo5235b(int i) {
        mo5232a(this.f24711a.getString(i));
    }

    /* renamed from: a */
    public void mo5233a(boolean z) {
        super.mo5233a(z);
        this.f24712b.setTitleOptional(z);
    }

    /* renamed from: h */
    public boolean mo5241h() {
        return this.f24712b.d();
    }

    /* renamed from: a */
    public void mo5231a(View view) {
        this.f24712b.setCustomView(view);
        this.f24714d = view != null ? new WeakReference(view) : null;
    }

    /* renamed from: d */
    public void mo5238d() {
        this.f24713c.mo5226b(this, this.f24717g);
    }

    /* renamed from: c */
    public void mo5237c() {
        if (!this.f24715e) {
            this.f24715e = true;
            this.f24712b.sendAccessibilityEvent(32);
            this.f24713c.mo5223a(this);
        }
    }

    /* renamed from: b */
    public Menu mo5234b() {
        return this.f24717g;
    }

    /* renamed from: f */
    public CharSequence mo5239f() {
        return this.f24712b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo5240g() {
        return this.f24712b.getSubtitle();
    }

    /* renamed from: i */
    public View mo5242i() {
        return this.f24714d != null ? (View) this.f24714d.get() : null;
    }

    /* renamed from: a */
    public MenuInflater mo5229a() {
        return new nn(this.f24712b.getContext());
    }

    /* renamed from: a */
    public boolean mo5203a(nx nxVar, MenuItem menuItem) {
        return this.f24713c.mo5225a((ni) this, menuItem);
    }

    /* renamed from: a */
    public void mo5200a(nx nxVar) {
        mo5238d();
        this.f24712b.a();
    }
}
