package com.p000;

import com.ninegag.android.app.model.api.ApiService;
import java.util.List;

/* compiled from: NetworkGagPostRepository */
/* renamed from: cit */
public class cit extends cis {
    /* renamed from: c */
    private caf f9402c;
    /* renamed from: d */
    private boolean f9403d;

    public cit(ApiService apiService, caf caf, boolean z) {
        super(apiService);
        this.f9402c = caf;
        this.f9403d = z;
    }

    /* renamed from: b */
    private dtp<List<clf>> m14026b(cgc cgc) {
        dtp postsByTag;
        if (String.valueOf(16).equals(cgc.l)) {
            postsByTag = this.b.getPostsByTag(cgc.f9127j, cgc.c(), cgc.f9123f);
        } else {
            postsByTag = this.b.getPostsBySearch(cgc.f9127j, cgc.c(), cgc.f9123f, cgc.f9125h, cgc.m);
        }
        return postsByTag.a(cgl.m13109a()).d(ciu.m14036a()).a(ciy.m14042a(cgc)).c(ciz.m14043a(this, cgc)).a(cja.m14045a(this, cgc));
    }

    /* renamed from: c */
    static /* synthetic */ void m14033c(cit cit, cgc cgc, List list) {
        String c = cit.f9402c.m12075g().f9370c.m13826c(cgc.m13073b());
        cgc.a((long) list.size());
        cgc.a(c);
        cgc.f9124g = cit.f9402c.m12075g().f9370c.m13828e(cgc.m13073b());
    }

    /* renamed from: c */
    private dtp<List<clf>> m14030c(cgc cgc) {
        if (cgc.c().equals("")) {
            return this.b.getPostList(cgc.f9119b, cgc.f9118a, cgc.f9123f, cgc.f9125h).a(cgl.m13109a()).d(cjb.m14046a()).a(cjc.m14048a(cgc)).c(cjd.m14049a(this, cgc)).a(cje.m14051a(this, cgc));
        }
        return this.b.getOlderThanPostList(cgc.f9119b, cgc.f9118a, cgc.f9123f, cgc.f9125h, cgc.c()).a(cgl.m13109a()).d(cjf.m14052a()).a(civ.m14038a(cgc)).c(ciw.m14039a(this, cgc)).a(cix.m14041a(this, cgc));
    }

    /* renamed from: b */
    static /* synthetic */ void m14029b(cit cit, cgc cgc, List list) {
        cgc.a((long) list.size());
        cgc.a(cit.f9402c.m12075g().f9370c.m13826c(cgc.m13073b()));
        cgc.f9124g = cit.f9402c.m12075g().f9370c.m13828e(cgc.m13073b());
    }

    /* renamed from: a */
    static /* synthetic */ void m14025a(cit cit, cgc cgc, List list) {
        cgc.a((long) list.size());
        cgc.a(cit.f9402c.m12075g().f9370c.m13826c(cgc.m13073b()));
        cgc.f9124g = cit.f9402c.m12075g().f9370c.m13828e(cgc.m13073b());
    }

    /* renamed from: a */
    public dtp<List<clf>> m14035a(cgc cgc) {
        switch (Integer.valueOf(cgc.l).intValue()) {
            case 12:
            case 16:
                return m14026b(cgc);
            default:
                return m14030c(cgc);
        }
    }

    /* renamed from: d */
    private dtp<List<clf>> m14034d(cgc cgc) {
        return dtp.a(this.f9402c.m12075g().f9370c.m13817a(cgc.m13073b(), (int) cgc.d(), this.f9403d));
    }
}
