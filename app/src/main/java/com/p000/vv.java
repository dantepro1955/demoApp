package com.p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vv */
public class vv extends wl {
    public vv(vm vmVar) {
        super(vmVar);
    }

    /* renamed from: a */
    private wr m34492a(ze zeVar, zd zdVar) {
        return zdVar.equals(zd.f26072a) ? wp.f25893W : zdVar.equals(zd.f26075d) ? wp.f25894X : zdVar.equals(zd.f26074c) ? wp.f25895Y : zdVar.equals(zd.f26073b) ? wp.f25896Z : wp.f25893W;
    }

    /* renamed from: a */
    Map mo5567a() {
        Map hashMap = new HashMap(5);
        for (zd zdVar : zd.m34948d()) {
            hashMap.put(new wt(zdVar, ze.f26079a), new wm(((Integer) this.a.m34391a(m34492a(ze.f26079a, zdVar))).intValue()));
        }
        hashMap.put(new wt(zd.f26074c, ze.f26080b), new wm(((Integer) this.a.m34391a(wp.aa)).intValue()));
        return hashMap;
    }

    /* renamed from: a */
    wo mo5568a(wt wtVar) {
        wo xgVar = new xg(wtVar.m34662a(), wtVar.m34663b(), this, this.a);
        xgVar.m34779a(true);
        return xgVar;
    }

    /* renamed from: a */
    wt mo5569a(vt vtVar) {
        return new wt((yy) vtVar);
    }

    /* renamed from: a */
    public void mo5548a(int i) {
    }

    /* renamed from: a */
    void mo5570a(Object obj, vt vtVar) {
        ((zb) obj).mo5549a((yy) vtVar);
    }

    /* renamed from: a */
    void mo5571a(Object obj, wt wtVar, int i) {
        if (obj instanceof yr) {
            ((yr) obj).mo5572a(wtVar, i);
        }
        if (obj instanceof zb) {
            ((zb) obj).mo5548a(i);
        }
    }

    /* renamed from: a */
    public void mo5572a(wt wtVar, int i) {
        m34484b(wtVar, i);
    }

    /* renamed from: a */
    public void mo5549a(yy yyVar) {
        m34486c((vt) yyVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ vt mo5574b(wt wtVar) {
        return super.mo5574b(wtVar);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo5575b(wt wtVar, Object obj) {
        super.mo5575b(wtVar, obj);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo5576c(wt wtVar) {
        return super.mo5576c(wtVar);
    }

    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo5577d(wt wtVar) {
        super.mo5577d(wtVar);
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ boolean mo5578e(wt wtVar) {
        return super.mo5578e(wtVar);
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo5579f(wt wtVar) {
        super.mo5579f(wtVar);
    }

    public void onNativeAdsFailedToLoad(int i) {
    }

    public void onNativeAdsLoaded(List list) {
    }
}
