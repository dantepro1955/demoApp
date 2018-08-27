package com.p000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vx */
public class vx extends wl {
    public vx(vm vmVar) {
        super(vmVar);
    }

    /* renamed from: a */
    Map mo5567a() {
        Map hashMap = new HashMap(1);
        hashMap.put(vo.f25750c, new wm(((Integer) this.a.m34391a(wp.aE)).intValue()));
        return hashMap;
    }

    /* renamed from: a */
    wo mo5568a(wt wtVar) {
        wo xiVar = new xi(this.a, 1, this);
        xiVar.m34779a(true);
        return xiVar;
    }

    /* renamed from: a */
    wt mo5569a(vt vtVar) {
        return vo.f25750c;
    }

    /* renamed from: a */
    public void mo5548a(int i) {
    }

    /* renamed from: a */
    void mo5570a(Object obj, vt vtVar) {
        yv yvVar = (yv) obj;
        yvVar.onNativeAdsLoaded(Arrays.asList(new yu[]{(yu) vtVar}));
    }

    /* renamed from: a */
    void mo5571a(Object obj, wt wtVar, int i) {
        ((yv) obj).onNativeAdsFailedToLoad(i);
    }

    /* renamed from: a */
    public void mo5572a(wt wtVar, int i) {
    }

    /* renamed from: a */
    public void mo5549a(yy yyVar) {
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
        m34484b(vo.f25750c, i);
    }

    public void onNativeAdsLoaded(List list) {
        yu yuVar = (yu) list.get(0);
        if (((Boolean) this.a.m34391a(wp.bk)).booleanValue()) {
            this.a.mo5563r().mo5585a(yuVar, new vy(this));
        } else {
            m34486c((vt) yuVar);
        }
    }
}
