package com.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: vz */
class vz implements yx {
    /* renamed from: a */
    private final vm f25805a;
    /* renamed from: b */
    private final Object f25806b = new Object();

    vz(vm vmVar) {
        this.f25805a = vmVar;
    }

    /* renamed from: a */
    private List m34553a(yu yuVar) {
        List arrayList = new ArrayList(1);
        arrayList.add((vo) yuVar);
        return arrayList;
    }

    /* renamed from: a */
    private void m34560a(yv yvVar, int i) {
        if (yvVar != null) {
            try {
                yvVar.onNativeAdsFailedToLoad(i);
            } catch (Throwable e) {
                this.f25805a.mo5561g().mo5611c("WidgetServiceImpl", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* renamed from: a */
    private void m34561a(yv yvVar, List list) {
        if (yvVar != null) {
            try {
                yvVar.onNativeAdsLoaded(list);
            } catch (Throwable e) {
                this.f25805a.mo5561g().mo5611c("WidgetServiceImpl", "Encountered exception whilst notifying user callback", e);
            }
        }
    }

    /* renamed from: a */
    private void m34562a(yw ywVar, yu yuVar, int i, boolean z) {
        if (ywVar == null) {
            return;
        }
        if (z) {
            try {
                ywVar.mo5583b(yuVar, i);
                return;
            } catch (Throwable e) {
                this.f25805a.mo5561g().mo5611c("WidgetServiceImpl", "Encountered exception whilst notifying user callback", e);
                return;
            }
        }
        ywVar.mo5581a(yuVar, i);
    }

    /* renamed from: a */
    private void m34563a(yw ywVar, yu yuVar, boolean z) {
        if (ywVar == null) {
            return;
        }
        if (z) {
            try {
                ywVar.mo5582b(yuVar);
                return;
            } catch (Throwable e) {
                this.f25805a.mo5561g().mo5611c("WidgetServiceImpl", "Encountered exception whilst notifying user callback", e);
                return;
            }
        }
        ywVar.mo5580a(yuVar);
    }

    /* renamed from: b */
    private void m34564b(List list, yv yvVar) {
        this.f25805a.m34407l().m34803a(new wz(this.f25805a, list, new wf(this, yvVar)), xl.MAIN);
    }

    /* renamed from: b */
    private void m34565b(yu yuVar, yw ywVar) {
        if (yuVar.o()) {
            ywVar.mo5582b(yuVar);
            return;
        }
        this.f25805a.m34407l().m34803a(new xb(this.f25805a, m34553a(yuVar), new wc(this, ywVar)), xl.MAIN);
    }

    /* renamed from: c */
    private void m34566c(List list, yv yvVar) {
        this.f25805a.m34407l().m34803a(new xb(this.f25805a, list, new wg(this, yvVar)), xl.MAIN);
    }

    /* renamed from: a */
    public void mo5584a(int i, yv yvVar) {
        yu yuVar = null;
        synchronized (this.f25806b) {
            if (i == 1) {
                if (this.f25805a.m34411p().mo5578e(vo.f25750c)) {
                    yuVar = (yu) this.f25805a.m34411p().mo5574b(vo.f25750c);
                }
            }
        }
        if (yuVar != null) {
            m34561a(yvVar, Arrays.asList(new yu[]{yuVar}));
            return;
        }
        this.f25805a.m34407l().m34803a(new xi(this.f25805a, i, new wa(this, yvVar)), xl.MAIN);
    }

    /* renamed from: a */
    public void m34568a(List list, yv yvVar) {
        int intValue = ((Integer) this.f25805a.m34391a(wp.aL)).intValue();
        if (intValue > 0) {
            list = list;
            int size = list.size();
            if (size != 0) {
                intValue = Math.min(intValue, size);
                List subList = list.subList(0, intValue);
                m34564b(subList, new wd(this, subList, yvVar, list.subList(intValue, size)));
            } else if (yvVar != null) {
                yvVar.onNativeAdsFailedToLoad(-700);
            }
        } else if (yvVar != null) {
            yvVar.onNativeAdsLoaded(list);
        }
    }

    /* renamed from: a */
    public void mo5585a(yu yuVar, yw ywVar) {
        if (yuVar.n()) {
            ywVar.mo5580a(yuVar);
            m34565b(yuVar, ywVar);
            return;
        }
        this.f25805a.m34407l().m34803a(new wz(this.f25805a, m34553a(yuVar), new wb(this, ywVar)), xl.MAIN);
    }
}
