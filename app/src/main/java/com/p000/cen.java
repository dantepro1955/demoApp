package com.p000;

import com.ninegag.android.app.otto.overlay.OverlayPageSwitchEvent;

/* compiled from: OverlayUiController */
/* renamed from: cen */
public class cen extends ceg {
    /* renamed from: e */
    public void m12813e() {
        if (m12736b() != null) {
            int currentItem = m12736b().m12775i().getCurrentItem();
            if (currentItem > 0) {
                m12811a(currentItem - 1, true);
            }
        }
    }

    /* renamed from: f */
    public void m12814f() {
        if (m12736b() != null) {
            int currentItem = m12736b().m12775i().getCurrentItem();
            m12811a(currentItem + 1, true);
            if (m12736b().m12771e() != null) {
                cqk.a(currentItem, m12736b().m12771e());
            }
        }
    }

    /* renamed from: a */
    public void m12811a(int i, final boolean z) {
        if (m12736b() != null) {
            if (i >= m12736b().m12771e().size()) {
                i = m12736b().m12771e().size() - 1;
            }
            if (i >= 0) {
                m12736b().m12775i().post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ cen f8933c;

                    public void run() {
                        if (this.f8933c.m12736b() != null && this.f8933c.m12736b().m12775i() != null) {
                            int currentItem = this.f8933c.m12736b().m12775i().getCurrentItem();
                            this.f8933c.m12736b().m12775i().setCurrentItem(i, z);
                            if (((cct) this.f8933c.m12736b().m12771e().get(i)) != null) {
                                String e = this.f8933c.m12736b().m12771e().m12347l().m12282e();
                                if (i == 0 || i == currentItem) {
                                    dhe.c(cei.m12754c(e), new OverlayPageSwitchEvent(e));
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void m12812a(String str) {
        if (m12736b().m12771e() == null || m12736b().m12771e().size() == 0) {
            m12736b().m12774h().finish();
        }
        int r = m12736b().m12771e().r();
        if (r >= 0 && r < m12736b().m12771e().size()) {
            m12736b().m12771e().remove(r);
        }
        m12736b().m12772f().notifyDataSetChanged();
    }
}
