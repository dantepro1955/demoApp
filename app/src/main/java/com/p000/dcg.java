package com.p000;

import com.roughike.bottombar.BottomBar;

/* compiled from: ShySettings */
/* renamed from: dcg */
public class dcg {
    /* renamed from: a */
    private BottomBar f21140a;
    /* renamed from: b */
    private Boolean f21141b;

    public dcg(BottomBar bottomBar) {
        this.f21140a = bottomBar;
    }

    /* renamed from: a */
    public void m26366a() {
        m26365b();
    }

    /* renamed from: a */
    private void m26364a(boolean z) {
        boolean z2 = true;
        if (!this.f21140a.m23357a()) {
            return;
        }
        if (this.f21140a.m23359b()) {
            dca a = dca.m26335a(this.f21140a);
            if (a != null) {
                if (z) {
                    z2 = false;
                }
                a.m26346a(this.f21140a, z2);
                return;
            }
            return;
        }
        this.f21141b = Boolean.valueOf(true);
    }

    /* renamed from: b */
    private void m26365b() {
        if (this.f21141b != null) {
            m26364a(this.f21141b.booleanValue());
            this.f21141b = null;
        }
    }
}
