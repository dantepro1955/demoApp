package com.p000;

import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: FloatingHintEventHandler */
/* renamed from: cbe */
public abstract class cbe extends cbf implements dkj {
    /* renamed from: a */
    protected int f8601a;
    /* renamed from: b */
    protected boolean f8602b;
    /* renamed from: c */
    protected Point f8603c;

    protected cbe(dki dki, String str) {
        super(dki, str);
    }

    @dhg
    public void onVisibilityEvent(cbm cbm) {
        if (!cbm.m12253a() || this.f8603c == null) {
            this.f8603c = null;
            super.onVisibilityEvent(new cbm(false));
        } else {
            super.onVisibilityEvent(cbm);
        }
        this.f8602b = cbm.m12253a();
    }

    @dhg
    public void onLocationEvent(cbi cbi) {
        Point f = m12240f();
        if (cbi.m12245a().x <= 0 || cbi.m12245a().y <= 0 || cbi.m12245a().x >= f.x || cbi.m12245a().y >= f.y) {
            this.f8603c = null;
            super.onVisibilityEvent(new cbm(false));
            return;
        }
        this.f8603c = cbi.m12245a();
        if (this.f8602b) {
            super.onVisibilityEvent(new cbm(true));
        }
        if (this.f8601a == 0) {
            this.f8601a = m12241g();
        }
        this.e.onNext(new Point(cbi.m12245a().x, cbi.m12245a().y - this.f8601a));
    }

    /* renamed from: a */
    public void mo1638a() {
        m12239e();
    }

    /* renamed from: g */
    private int m12241g() {
        Rect rect = new Rect();
        try {
            this.g.a().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        } catch (Exception e) {
        }
        return rect.top;
    }
}
