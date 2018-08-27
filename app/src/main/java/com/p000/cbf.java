package com.p000;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: HintEventHandler */
/* renamed from: cbf */
public abstract class cbf {
    /* renamed from: a */
    private final String f8594a;
    /* renamed from: b */
    private boolean f8595b;
    /* renamed from: c */
    private dyt f8596c;
    /* renamed from: d */
    protected final dyo<Boolean> f8597d = dyo.a();
    /* renamed from: e */
    protected final dyo<Point> f8598e = dyo.a();
    /* renamed from: f */
    protected final List<dkh> f8599f = new ArrayList();
    /* renamed from: g */
    protected final dki f8600g;

    /* renamed from: d */
    protected abstract Collection<dkh> mo1637d();

    protected cbf(dki dki, String str) {
        this.f8600g = dki;
        this.f8594a = str;
    }

    /* renamed from: b */
    public void m12236b() {
        this.f8596c = new dyt();
        this.f8596c.a(this.f8597d.i().b(cbg.m12243a(this)));
        this.f8596c.a(this.f8598e.i().b(cbh.m12244a(this)));
        dhe.a(this.f8594a, this);
    }

    /* renamed from: a */
    static /* synthetic */ void m12235a(cbf cbf, Boolean bool) {
        if (bool.booleanValue()) {
            try {
                synchronized (cbf.f8599f) {
                    if (!cbf.f8599f.isEmpty()) {
                        cbf.m12239e();
                    }
                    cbf.f8599f.addAll(cbf.mo1637d());
                }
                return;
            } catch (Exception e) {
                return;
            }
        }
        cbf.m12239e();
    }

    /* renamed from: a */
    static /* synthetic */ void m12234a(cbf cbf, Point point) {
        synchronized (cbf.f8599f) {
            for (dkh dkh : cbf.f8599f) {
                if (dkh instanceof dkg) {
                    try {
                        ((dkg) dkh).a(point);
                    } catch (Exception e) {
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m12237c() {
        dhe.b(this.f8594a, this);
        if (this.f8596c != null && this.f8596c.a()) {
            this.f8596c.unsubscribe();
        }
        m12239e();
    }

    @dhg
    public void onVisibilityEvent(cbm cbm) {
        if (cbm.m12253a() != this.f8595b) {
            this.f8595b = cbm.m12253a();
            this.f8597d.onNext(Boolean.valueOf(this.f8595b));
        }
    }

    @dhg
    public void onLocationEvent(cbi cbi) {
        this.f8598e.onNext(cbi.m12245a());
    }

    /* renamed from: e */
    protected void m12239e() {
        synchronized (this.f8599f) {
            for (dkh a : this.f8599f) {
                try {
                    a.a();
                } catch (Exception e) {
                }
            }
            this.f8599f.clear();
        }
    }

    /* renamed from: f */
    protected Point m12240f() {
        Point point = new Point();
        this.f8600g.a().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }
}
