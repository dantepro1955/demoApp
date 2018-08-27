package com.p000;

import com.ninegag.android.app.otto.overlay.OverlayPageSwitchEvent;

/* compiled from: OverlayUiControllerV2 */
/* renamed from: cew */
public class cew extends ceq {
    /* renamed from: b */
    private final boolean f9002b;

    public cew(boolean z) {
        this.f9002b = z;
    }

    /* renamed from: e */
    public void m12916e() {
        if (!this.f9002b && m12835b() != null) {
            int currentItem = m12835b().m12879i().getCurrentItem();
            if (currentItem > 0) {
                m12914a(currentItem - 1, true);
            }
        }
    }

    /* renamed from: f */
    public void m12917f() {
        if (!this.f9002b && m12835b() != null) {
            int currentItem = m12835b().m12879i().getCurrentItem();
            m12914a(currentItem + 1, true);
            if (m12835b().m12875e() != null) {
                cqk.a(currentItem, m12835b().m12875e().m12818d());
            }
        }
    }

    /* renamed from: a */
    public void m12914a(int i, final boolean z) {
        if (!this.f9002b && m12835b() != null) {
            if (i >= m12835b().m12875e().getCount()) {
                i = m12835b().m12875e().getCount() - 1;
            }
            if (i >= 0) {
                m12835b().m12879i().post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ cew f9001c;

                    public void run() {
                        if (this.f9001c.m12835b() != null && this.f9001c.m12835b().m12879i() != null) {
                            int currentItem = this.f9001c.m12835b().m12879i().getCurrentItem();
                            this.f9001c.m12835b().m12879i().setCurrentItem(i, z);
                            if (this.f9001c.m12835b().m12875e().mo1693e(i) != null) {
                                cct c = this.f9001c.m12835b().m12875e().mo1692c();
                                if (c != null) {
                                    String e = c.m12282e();
                                    if (i == 0 || i == currentItem) {
                                        dhe.c(ces.m12858c(e), new OverlayPageSwitchEvent(e));
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public void m12915a(String str) {
        if (m12835b().m12875e() == null || m12835b().m12875e().getCount() == 0) {
            m12835b().m12878h().finish();
        }
        int b = m12835b().m12875e().mo1691b();
        if (b >= 0 && b < m12835b().m12875e().getCount()) {
            m12835b().m12875e().mo1694f(b);
        }
        m12835b().m12875e().notifyDataSetChanged();
    }
}
