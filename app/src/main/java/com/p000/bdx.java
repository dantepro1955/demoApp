package com.p000;

import com.google.android.gms.internal.zzec;
import java.util.Iterator;
import java.util.LinkedList;

@bhd
/* renamed from: bdx */
class bdx {
    /* renamed from: a */
    private final LinkedList<C1082a> f5720a = new LinkedList();
    /* renamed from: b */
    private zzec f5721b;
    /* renamed from: c */
    private final String f5722c;
    /* renamed from: d */
    private final int f5723d;
    /* renamed from: e */
    private boolean f5724e;

    /* renamed from: bdx$a */
    class C1082a {
        /* renamed from: a */
        akf f5713a;
        /* renamed from: b */
        zzec f5714b;
        /* renamed from: c */
        bds f5715c;
        /* renamed from: d */
        long f5716d;
        /* renamed from: e */
        boolean f5717e;
        /* renamed from: f */
        boolean f5718f;
        /* renamed from: g */
        final /* synthetic */ bdx f5719g;

        C1082a(bdx bdx, bdr bdr) {
            this.f5719g = bdx;
            this.f5713a = bdr.m7619b(bdx.f5722c);
            this.f5715c = new bds();
            this.f5715c.m7665a(this.f5713a);
        }

        C1082a(bdx bdx, bdr bdr, zzec zzec) {
            this(bdx, bdr);
            this.f5714b = zzec;
        }

        /* renamed from: a */
        boolean m7692a() {
            if (this.f5717e) {
                return false;
            }
            this.f5718f = this.f5713a.mo242a(bdu.m7677b(this.f5714b != null ? this.f5714b : this.f5719g.f5721b));
            this.f5717e = true;
            this.f5716d = ako.m2349k().mo606a();
            return true;
        }
    }

    bdx(zzec zzec, String str, int i) {
        aoi.m4679a((Object) zzec);
        aoi.m4679a((Object) str);
        this.f5721b = zzec;
        this.f5722c = str;
        this.f5723d = i;
    }

    /* renamed from: a */
    C1082a m7695a(zzec zzec) {
        if (zzec != null) {
            this.f5721b = zzec;
        }
        return (C1082a) this.f5720a.remove();
    }

    /* renamed from: a */
    zzec m7696a() {
        return this.f5721b;
    }

    /* renamed from: a */
    void m7697a(bdr bdr, zzec zzec) {
        this.f5720a.add(new C1082a(this, bdr, zzec));
    }

    /* renamed from: a */
    boolean m7698a(bdr bdr) {
        C1082a c1082a = new C1082a(this, bdr);
        this.f5720a.add(c1082a);
        return c1082a.m7692a();
    }

    /* renamed from: b */
    int m7699b() {
        return this.f5723d;
    }

    /* renamed from: c */
    String m7700c() {
        return this.f5722c;
    }

    /* renamed from: d */
    int m7701d() {
        return this.f5720a.size();
    }

    /* renamed from: e */
    int m7702e() {
        Iterator it = this.f5720a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((C1082a) it.next()).f5717e ? i + 1 : i;
        }
        return i;
    }

    /* renamed from: f */
    int m7703f() {
        Iterator it = this.f5720a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = ((C1082a) it.next()).m7692a() ? i + 1 : i;
        }
        return i;
    }

    /* renamed from: g */
    void m7704g() {
        this.f5724e = true;
    }

    /* renamed from: h */
    boolean m7705h() {
        return this.f5724e;
    }
}
