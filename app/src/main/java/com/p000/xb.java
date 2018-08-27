package com.p000;

import java.util.List;

/* renamed from: xb */
public class xb extends xa {
    public xb(vm vmVar, List list, yv yvVar) {
        super("TaskCacheNativeAdVideos", vmVar, list, yvVar);
    }

    public xb(vm vmVar, List list, yw ywVar) {
        super("TaskCacheNativeAdVideos", vmVar, list, ywVar);
    }

    /* renamed from: b */
    private boolean m34746b(vo voVar) {
        this.c.mo5610c("TaskCacheNativeAdVideos", "Unable to cache video resource " + voVar.m34435c());
        m34748a(voVar, -202);
        return false;
    }

    /* renamed from: a */
    protected void mo5592a(vo voVar) {
        if (this.f != null) {
            this.f.mo5582b(voVar);
        }
    }

    /* renamed from: a */
    protected void m34748a(vo voVar, int i) {
        if (this.f != null) {
            this.f.mo5583b(voVar, i);
        }
    }

    /* renamed from: a */
    protected boolean mo5593a(vo voVar, yt ytVar) {
        if (!zn.m34841d(voVar.m34435c())) {
            this.b.mo5561g().mo5606a("TaskCacheNativeAdVideos", "No video attached to ad, nothing to cache...");
        }
        this.b.mo5561g().mo5606a("TaskCacheNativeAdVideos", "Beginning slot video caching for ad " + voVar.m34446m());
        String a = m34732a(voVar.m34435c(), ytVar);
        if (a == null) {
            return m34746b(voVar);
        }
        voVar.m34436c(a);
        return true;
    }

    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
