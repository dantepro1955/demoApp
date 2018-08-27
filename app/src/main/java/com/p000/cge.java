package com.p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: GagPostListWrapper */
/* renamed from: cge */
public class cge extends ccu<cct, clf> {
    /* renamed from: h */
    private static final hn<String, cdh> f9128h = new hn(10);
    /* renamed from: l */
    private static hh<String, cge> f9129l = new hh();
    /* renamed from: m */
    private static hh<String, Integer> f9130m = new hh();
    /* renamed from: g */
    private int f9131g;
    /* renamed from: i */
    private boolean f9132i = this.f9134k.m12075g().m13732h();
    /* renamed from: j */
    private boolean f9133j = true;
    /* renamed from: k */
    private caf f9134k;

    public /* synthetic */ boolean add(Object obj) {
        return m13090a((cct) obj);
    }

    /* renamed from: i */
    public void m13097i() {
        f9129l.put(this.e.f20094k, (cge) clone());
    }

    /* renamed from: j */
    public void m13098j() {
        if (f9129l.containsKey(this.e.f20094k)) {
            clear();
            addAll((Collection) f9129l.get(this.e.f20094k));
        }
    }

    /* renamed from: k */
    void m13099k() {
        f9129l.remove(this.e.f20094k);
    }

    public cge(cgc cgc, cit cit, caf caf) {
        super(cgc, cit);
        this.f9134k = caf;
    }

    /* renamed from: b */
    public void m13091b(int i) {
        f9130m.put(this.e.f20094k, Integer.valueOf(i));
    }

    /* renamed from: l */
    public int m13100l() {
        if (f9130m.containsKey(this.e.f20094k)) {
            return ((Integer) f9130m.get(this.e.f20094k)).intValue();
        }
        return -1;
    }

    /* renamed from: a */
    public boolean m13090a(cct cct) {
        Object obj;
        Iterator it = iterator();
        while (it.hasNext()) {
            if (((cld) ((cct) it.next()).R()).m12623c().equals(((cld) cct.R()).m12623c())) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == null) {
            super.add(cct);
        }
        return obj == null;
    }

    public boolean addAll(Collection<? extends cct> collection) {
        boolean z = true;
        for (cct a : collection) {
            z = m13090a(a) & z;
        }
        return z;
    }

    /* renamed from: f */
    protected dtp<List<clf>> mo1722f() {
        return dtp.a(cgf.m13102a(this)).a(cgg.m13103a(this)).c(cgh.m13104a(this));
    }

    /* renamed from: b */
    static /* synthetic */ void m13088b(cge cge, cle cle) {
        if (cge.e.e()) {
            cge.e.a(0);
            cge.e.a("");
            return;
        }
        cge.e.a((long) cge.size());
        cge.e.a(caf.m12046a().m12075g().f9370c.m13826c(cge.e.f20094k));
    }

    /* renamed from: a */
    static /* synthetic */ void m13085a(cge cge, List list) {
        if (cge.f9133j && list.size() != 0) {
            cge.f9133j = false;
        }
        cle a = cge.f9134k.m12075g().f9370c.m13814a(cge.e.f20094k);
        if (a != null) {
            cge.a = a.m14248f().booleanValue();
        }
    }

    /* renamed from: g */
    protected dtp<List<clf>> mo1723g() {
        cgc cgc = (cgc) this.e;
        switch (this.f9131g) {
            case 10:
            case 11:
                return dtp.a(new ArrayList());
            default:
                if (this.f9133j) {
                    return dtp.a(cgi.m13106a(this, cgc));
                }
                return dtp.a(cgj.m13107a(this, cgc));
        }
    }

    /* renamed from: h */
    protected dtp<List<clf>> mo1724h() {
        cgc cgc = (cgc) this.e;
        switch (this.f9131g) {
            case 0:
            case 1:
            case 2:
            case 9:
            case 10:
            case 11:
                return this.b.m14035a(cgc);
            default:
                return null;
        }
    }

    /* renamed from: a */
    protected List<cct> mo1720a(List<clf> list) {
        List arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(cct.m12254a(((clf) list.get(i)).m14269i()));
        }
        return arrayList;
    }

    /* renamed from: b */
    protected void mo1721b(List<clf> list) {
        this.e.a(((clf) list.get(list.size() - 1)).m14251a().longValue());
    }

    /* renamed from: c */
    void m13093c(int i) {
        this.f9131g = i;
    }

    /* renamed from: m */
    public cct m13101m() {
        int l = m13100l();
        if (l < 0 || l >= size()) {
            return null;
        }
        return (cct) get(m13100l());
    }

    /* renamed from: a */
    public static cdh m13081a(String str, Runnable runnable) {
        if (f9128h.get(str) != null) {
            return (cdh) f9128h.get(str);
        }
        djx.a().submit(runnable);
        return null;
    }

    /* renamed from: a */
    public static void m13086a(String str, cdh cdh) {
        f9128h.put(str, cdh);
    }
}
