package com.p000;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarTab;

/* compiled from: BatchTabPropertyApplier */
/* renamed from: dby */
public class dby {
    /* renamed from: a */
    private final BottomBar f21119a;

    /* compiled from: BatchTabPropertyApplier */
    /* renamed from: dby$a */
    public interface C4184a {
        /* renamed from: a */
        void mo3876a(BottomBarTab bottomBarTab);
    }

    public dby(BottomBar bottomBar) {
        this.f21119a = bottomBar;
    }

    /* renamed from: a */
    public void m26304a(C4184a c4184a) {
        int tabCount = this.f21119a.getTabCount();
        if (tabCount > 0) {
            for (int i = 0; i < tabCount; i++) {
                c4184a.mo3876a(this.f21119a.m23358b(i));
            }
        }
    }
}
