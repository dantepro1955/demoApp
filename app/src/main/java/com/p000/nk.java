package com.p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources.Theme;
import android.view.LayoutInflater;
import p000.mx.C5576i;

/* compiled from: ContextThemeWrapper */
/* renamed from: nk */
public class nk extends ContextWrapper {
    /* renamed from: a */
    private int f24708a;
    /* renamed from: b */
    private Theme f24709b;
    /* renamed from: c */
    private LayoutInflater f24710c;

    public nk(Context context, int i) {
        super(context);
        this.f24708a = i;
    }

    public nk(Context context, Theme theme) {
        super(context);
        this.f24709b = theme;
    }

    public void setTheme(int i) {
        if (this.f24708a != i) {
            this.f24708a = i;
            m32962b();
        }
    }

    /* renamed from: a */
    public int m32963a() {
        return this.f24708a;
    }

    public Theme getTheme() {
        if (this.f24709b != null) {
            return this.f24709b;
        }
        if (this.f24708a == 0) {
            this.f24708a = C5576i.Theme_AppCompat_Light;
        }
        m32962b();
        return this.f24709b;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f24710c == null) {
            this.f24710c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f24710c;
    }

    /* renamed from: a */
    protected void m32964a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    /* renamed from: b */
    private void m32962b() {
        boolean z = this.f24709b == null;
        if (z) {
            this.f24709b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f24709b.setTo(theme);
            }
        }
        m32964a(this.f24709b, this.f24708a, z);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }
}
