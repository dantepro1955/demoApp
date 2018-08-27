package com.p000;

import java.util.List;

/* renamed from: wz */
public class wz extends xa {
    public wz(vm vmVar, List list, yv yvVar) {
        super("TaskCacheNativeAdImages", vmVar, list, yvVar);
    }

    public wz(vm vmVar, List list, yw ywVar) {
        super("TaskCacheNativeAdImages", vmVar, list, ywVar);
    }

    /* renamed from: b */
    private boolean m34735b(vo voVar) {
        m34737a(voVar, -201);
        return false;
    }

    /* renamed from: a */
    protected void mo5592a(vo voVar) {
        if (this.f != null) {
            this.f.mo5580a(voVar);
        }
    }

    /* renamed from: a */
    protected void m34737a(vo voVar, int i) {
        if (this.f != null) {
            this.f.mo5581a(voVar, i);
        }
    }

    /* renamed from: a */
    protected boolean mo5593a(vo voVar, yt ytVar) {
        this.b.mo5561g().mo5606a("TaskCacheNativeAdImages", "Beginning slot image caching for ad " + voVar.m34446m());
        String a = m34732a(voVar.m34431a(), ytVar);
        if (a == null) {
            return m34735b(voVar);
        }
        voVar.m34432a(a);
        a = m34732a(voVar.m34433b(), ytVar);
        if (a == null) {
            return m34735b(voVar);
        }
        voVar.m34434b(a);
        return true;
    }

    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
