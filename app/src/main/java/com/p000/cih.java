package com.p000;

import android.support.v4.app.Fragment;
import com.ninegag.android.app.otto.tab.TabStateChangedEvent;
import com.ninegag.android.app.otto.tab.TapOnCurrentTabEvent;

/* compiled from: TabEventController */
/* renamed from: cih */
public class cih {
    /* renamed from: a */
    private Fragment f9331a;
    /* renamed from: b */
    private C1743a f9332b;
    /* renamed from: c */
    private boolean f9333c;

    /* compiled from: TabEventController */
    /* renamed from: cih$a */
    public interface C1743a {
        /* renamed from: a */
        void m13661a();

        /* renamed from: b */
        void m13662b();

        /* renamed from: c */
        void m13663c();
    }

    public cih(Fragment fragment, C1743a c1743a) {
        this.f9331a = fragment;
        this.f9332b = c1743a;
    }

    /* renamed from: a */
    public boolean m13664a() {
        return this.f9333c;
    }

    /* renamed from: b */
    public void m13665b() {
        onTabStateChanged(new TabStateChangedEvent(2, null));
    }

    @dhg
    public void onTabStateChanged(TabStateChangedEvent tabStateChangedEvent) {
        if (tabStateChangedEvent.f18355a == 2) {
            boolean z = this.f9333c;
            this.f9333c = tabStateChangedEvent.f18356b == this.f9331a;
            if (z || !this.f9333c) {
                if (z && !this.f9333c && this.f9332b != null) {
                    this.f9332b.m13662b();
                }
            } else if (this.f9332b != null) {
                this.f9332b.m13661a();
            }
        }
    }

    @dhg
    public void onTapOnCurrentTab(TapOnCurrentTabEvent tapOnCurrentTabEvent) {
        if (m13664a() && this.f9332b != null) {
            this.f9332b.m13663c();
        }
    }
}
