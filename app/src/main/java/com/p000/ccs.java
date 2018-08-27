package com.p000;

import android.os.Bundle;
import com.ninegag.android.app.otto.response.GagPostListResponseEvent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GagPostListWrapper */
/* renamed from: ccs */
public class ccs extends crw<cct> {
    /* renamed from: f */
    private static final hh<String, Integer> f8627f = new hh();
    /* renamed from: a */
    protected caf f8628a = caf.m12046a();
    /* renamed from: b */
    private cco f8629b;
    /* renamed from: c */
    private boolean f8630c;
    /* renamed from: d */
    private long f8631d = 0;
    /* renamed from: e */
    private int f8632e = 0;
    /* renamed from: g */
    private long f8633g = 0;

    public ccs(cco cco) {
        this.f8629b = cco;
        this.f8630c = cij.m13687a().m13732h();
    }

    /* renamed from: i */
    public void m12344i() {
        super.i();
        synchronized (f8627f) {
            f8627f.put(mo1655e(), Integer.valueOf(this.f8632e));
        }
    }

    /* renamed from: j */
    public void m12345j() {
        super.j();
        synchronized (f8627f) {
            if (f8627f.containsKey(mo1655e())) {
                this.f8632e = ((Integer) f8627f.get(mo1655e())).intValue();
            }
        }
    }

    /* renamed from: a */
    public void m12334a(Bundle bundle) {
        super.a(bundle);
        bundle.putBoolean(mo1655e() + ":safe-mode", this.f8630c);
    }

    /* renamed from: b */
    public void m12337b(Bundle bundle) {
        if (bundle != null && cij.m13687a().m13732h() == bundle.getBoolean(mo1655e() + ":safe-mode")) {
            super.b(bundle);
        }
    }

    /* renamed from: c */
    protected List<clf> m12339c(int i) {
        return this.f8628a.m12075g().f9370c.m13817a(this.f8629b.f8729a, i, false);
    }

    /* renamed from: b */
    protected List<cct> mo1641b(int i) {
        List<clf> c = m12339c(i);
        List arrayList = new ArrayList();
        for (clf clf : c) {
            cct cct = new cct(clf.m14269i());
            if (!(clf.m14267g() == null || clf.m14267g().isEmpty())) {
                cct.m12276a(clf.m14267g());
            }
            arrayList.add(cct);
        }
        return arrayList;
    }

    /* renamed from: a */
    protected List<cct> mo1654a() {
        this.f8632e = 0;
        return mo1641b(0);
    }

    /* renamed from: a */
    protected List<cct> mo1640a(int i) {
        return mo1641b(this.f8632e + i);
    }

    /* renamed from: b */
    protected boolean mo1642b() {
        return this.f8628a.m12075g().f9370c.m13827d(this.f8629b.m12563b());
    }

    /* renamed from: k */
    protected long m12346k() {
        if (this.f8631d == 0) {
            this.f8631d = this.f8628a.m12075g().f9370c.m13830g(this.f8629b.m12563b()) - ((long) this.f8632e);
        }
        return this.f8631d;
    }

    /* renamed from: c */
    protected void mo1643c() {
        if (this.f8629b.f8734f != null) {
            crq crq = (crq) crj.b(crq.class);
            if (crq == null || crq.c().equals(crq.a())) {
                this.f8628a.m12079i().m13550a(this.f8629b.f8734f, "relevant", this.f8629b.m12563b(), this.f8629b.f8730b);
            } else {
                this.f8628a.m12079i().m13550a(this.f8629b.f8734f, "popular", this.f8629b.m12563b(), this.f8629b.f8730b);
            }
        } else if (this.f8629b.f8733e != null) {
            this.f8628a.m12079i().m13565c(this.f8629b.f8731c, this.f8629b.f8733e, this.f8629b.m12563b(), this.f8629b.f8730b);
        } else {
            this.f8628a.m12079i().m13534a(this.f8629b.f8731c, this.f8629b.f8732d, this.f8629b.m12563b(), this.f8629b.f8730b);
        }
    }

    /* renamed from: d */
    protected void mo1644d() {
        if (this.f8629b.f8734f != null) {
            crq crq = (crq) crj.b(crq.class);
            if (crq == null || crq.c().equals(crq.a())) {
                this.f8628a.m12079i().m13562b(this.f8629b.f8734f, "relevant", this.f8629b.m12563b(), this.f8629b.f8730b);
            } else {
                this.f8628a.m12079i().m13562b(this.f8629b.f8734f, "popular", this.f8629b.m12563b(), this.f8629b.f8730b);
            }
        } else if (this.f8629b.f8733e != null) {
            this.f8628a.m12079i().m13577e(this.f8629b.f8731c, this.f8629b.f8733e, this.f8629b.m12563b(), this.f8629b.f8730b);
        } else {
            this.f8628a.m12079i().m13554b(this.f8629b.f8731c, this.f8629b.f8732d, this.f8629b.m12563b(), this.f8629b.f8730b);
        }
    }

    /* renamed from: e */
    protected String mo1655e() {
        return this.f8629b.m12563b();
    }

    /* renamed from: l */
    public cct m12347l() {
        try {
            return (cct) get(r());
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public void m12335a(cct cct) {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (get(i) == cct) {
                d(i);
                return;
            }
        }
    }

    @dhg
    public void onGagPostListResponse(GagPostListResponseEvent gagPostListResponseEvent) {
        if (gagPostListResponseEvent.f18341e) {
            if (gagPostListResponseEvent.f18344h == 0) {
                C();
            } else if (gagPostListResponseEvent.f18344h == 1) {
                D();
            }
            if (q() != null && size() > 0) {
                q().a_(gagPostListResponseEvent.f18342f);
            }
        } else if (q() != null) {
            q().d(gagPostListResponseEvent.f18342f);
            if (4 != gagPostListResponseEvent.f18345i) {
                return;
            }
            if (gagPostListResponseEvent.f18344h == 0) {
                C();
            } else {
                D();
            }
        }
    }

    /* renamed from: f */
    public boolean mo1645f() {
        int i = this.f8629b.f8731c;
        String str = this.f8629b.f8732d;
        if (i == 10 || i == 6 || i == 7 || i == 11 || i == 13 || i == 12) {
            return true;
        }
        String b = this.f8628a.m12077h().m13988b(i, str);
        if (b == null || b.isEmpty()) {
            return true;
        }
        cqh cqh = new cqh();
        long ba = this.f8628a.m12077h().ba();
        long a = cqh.a(i, str);
        long b2 = cqh.b(i, str);
        long currentTimeMillis = System.currentTimeMillis();
        if (a + ba > currentTimeMillis) {
            return false;
        }
        return b2 + ba < currentTimeMillis ? true : true;
    }

    /* renamed from: m */
    protected cco m12348m() {
        return this.f8629b;
    }

    /* renamed from: n */
    public int m12349n() {
        return size() + this.f8632e;
    }

    /* renamed from: o */
    public int m12350o() {
        return this.f8632e;
    }

    /* renamed from: p */
    public static void m12331p() {
        crw.F();
        synchronized (f8627f) {
            f8627f.clear();
        }
    }
}
