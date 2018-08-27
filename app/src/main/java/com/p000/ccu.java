package com.p000;

import java.util.List;
import p000.csn.C4557a;
import rx.schedulers.Schedulers;

/* compiled from: GenericListWrapper */
/* renamed from: ccu */
public abstract class ccu<WrapperModel, BaseListItemModel> extends csn<WrapperModel> {
    /* renamed from: a */
    protected boolean f8751a;
    /* renamed from: b */
    protected cit f8752b;
    /* renamed from: c */
    protected dyt f8753c;
    /* renamed from: d */
    protected final bwr<Integer> f8754d = bwr.m11554a();

    /* renamed from: a */
    protected abstract List<WrapperModel> mo1720a(List<BaseListItemModel> list);

    /* renamed from: b */
    protected abstract void mo1721b(List<BaseListItemModel> list);

    /* renamed from: f */
    protected abstract dtp<List<BaseListItemModel>> mo1722f();

    /* renamed from: g */
    protected abstract dtp<List<BaseListItemModel>> mo1723g();

    /* renamed from: h */
    protected abstract dtp<List<BaseListItemModel>> mo1724h();

    public ccu(csp csp, cit cit) {
        super(csp);
        this.f8752b = cit;
        this.f8753c = new dyt();
    }

    /* renamed from: a */
    public void m12579a() {
        this.f8754d.call(Integer.valueOf(0));
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                ((C4557a) this.f.get(size)).b();
            }
            this.f8751a = true;
            this.f8753c.a(mo1723g().b(Schedulers.io()).a(ccv.m12591a(this)).d(ccz.m12596a(this)).a(dua.a()).b(cda.m12598a(this)));
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m12577d(ccu ccu, List list) {
        if (list.size() > 0) {
            ccu.mo1721b(list);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m12575c(ccu ccu, List list) {
        ccu.clear();
        ccu.addAll(list);
        if (ccu.size() > 0) {
            if (ccu.m12585c()) {
                ccu.f8754d.call(Integer.valueOf(2));
            } else {
                ccu.f8754d.call(Integer.valueOf(4));
            }
        }
        if (ccu.f != null) {
            for (int size = ccu.f.size() - 1; size >= 0; size--) {
                ((C4557a) ccu.f.get(size)).a(list, ccu.m12585c());
            }
        }
    }

    /* renamed from: a */
    public void m12582a(csp csp) {
        super.a(csp);
        this.f8754d.call(Integer.valueOf(6));
        if (this.f != null) {
            for (C4557a c : this.f) {
                c.c();
            }
            this.e.a(true);
            this.f8753c.a(mo1722f().b(Schedulers.io()).g().d(cdb.m12599a(this)).a(dua.a()).a(cdc.m12601a(this), cdd.m12602a()));
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m12573b(ccu ccu, List list) {
        ccu.clear();
        ccu.addAll(list);
        if (ccu.size() == 0) {
            ccu.f8754d.call(Integer.valueOf(1));
        } else if (ccu.m12585c()) {
            ccu.f8754d.call(Integer.valueOf(2));
        } else {
            ccu.f8754d.call(Integer.valueOf(4));
        }
        if (ccu.f != null) {
            for (int size = ccu.f.size() - 1; size >= 0; size--) {
                ((C4557a) ccu.f.get(size)).b(list, ccu.m12585c());
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m12576c(Throwable th) {
    }

    /* renamed from: a */
    public void m12581a(cep cep) {
        if (!isEmpty()) {
            this.f8754d.call(Integer.valueOf(7));
            this.e.a(false);
            this.f8753c.a(mo1722f().b(Schedulers.io()).g().d(cde.m12603a(this)).a(dua.a()).a(cdf.m12605a(this, cep), cdg.m12606a()));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12570a(ccu ccu, cep cep, List list) {
        ccu.addAll(list);
        cep.notifyDataSetChanged();
        if (ccu.size() == 0) {
            ccu.f8754d.call(Integer.valueOf(1));
        } else if (ccu.m12585c()) {
            ccu.f8754d.call(Integer.valueOf(2));
        } else {
            ccu.f8754d.call(Integer.valueOf(4));
        }
        if (ccu.f != null) {
            for (int size = ccu.f.size() - 1; size >= 0; size--) {
                ((C4557a) ccu.f.get(size)).c(list, ccu.m12585c());
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m12574b(Throwable th) {
    }

    /* renamed from: b */
    public void m12583b() {
        if (!isEmpty()) {
            this.f8754d.call(Integer.valueOf(7));
            this.e.a(false);
            this.f8753c.a(mo1722f().b(Schedulers.io()).g().d(ccw.m12592a(this)).a(dua.a()).a(ccx.m12594a(this), ccy.m12595a()));
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12571a(ccu ccu, List list) {
        ccu.addAll(list);
        if (ccu.size() == 0) {
            ccu.f8754d.call(Integer.valueOf(1));
        } else if (ccu.m12585c()) {
            ccu.f8754d.call(Integer.valueOf(2));
        } else {
            ccu.f8754d.call(Integer.valueOf(4));
        }
        if (ccu.f != null) {
            for (int size = ccu.f.size() - 1; size >= 0; size--) {
                ((C4557a) ccu.f.get(size)).c(list, ccu.m12585c());
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m12572a(Throwable th) {
    }

    /* renamed from: c */
    public boolean m12585c() {
        return this.f8751a;
    }

    /* renamed from: d */
    public dtp<Integer> m12586d() {
        return this.f8754d.e();
    }

    /* renamed from: a */
    public void m12580a(int i) {
        if (size() == 0) {
            this.f8754d.call(Integer.valueOf(1));
        }
    }

    /* renamed from: e */
    public void m12587e() {
        if (this.f8753c != null && this.f8753c.a()) {
            this.f8753c.unsubscribe();
        }
    }
}
