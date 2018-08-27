package com.p000;

import com.ninegag.android.app.otto.ThemeSwitchedEvent;

/* compiled from: UiState */
/* renamed from: com */
public class com {
    /* renamed from: h */
    private static caf f16682h = caf.m12046a();
    /* renamed from: a */
    public cnt f16683a;
    /* renamed from: b */
    public deu f16684b;
    /* renamed from: c */
    public dgj f16685c;
    /* renamed from: d */
    public int f16686d = 1;
    /* renamed from: e */
    public con f16687e = new con();
    /* renamed from: f */
    public cok f16688f = new cok();
    /* renamed from: g */
    public boolean f16689g = false;

    public com() {
        m20826a();
    }

    /* renamed from: a */
    public void m20826a() {
        m20827a(f16682h.m12077h().ah(), false);
    }

    /* renamed from: b */
    public void m20828b() {
        m20827a(f16682h.m12077h().ah(), true);
    }

    /* renamed from: a */
    public void m20827a(boolean z, boolean z2) {
        if (z) {
            this.f16683a = new cns();
            this.f16684b = new des();
            this.f16685c = new dgh();
        } else {
            this.f16683a = new cnt();
            this.f16684b = new det();
            this.f16685c = new dgi();
        }
        if (z2) {
            dhe.a().c(new ThemeSwitchedEvent(z));
        }
    }
}
