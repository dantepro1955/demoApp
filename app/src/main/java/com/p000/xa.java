package com.p000;

import java.util.List;

/* renamed from: xa */
abstract class xa extends wo {
    /* renamed from: e */
    protected yv f25943e;
    /* renamed from: f */
    protected yw f25944f;
    /* renamed from: g */
    private List f25945g;
    /* renamed from: h */
    private int f25946h = 0;

    xa(String str, vm vmVar, List list, yv yvVar) {
        super(str, vmVar);
        this.f25943e = yvVar;
        this.f25945g = list;
    }

    xa(String str, vm vmVar, List list, yw ywVar) {
        super(str, vmVar);
        if (list == null) {
            throw new IllegalArgumentException("Slots cannot be null");
        }
        this.f25945g = list;
        this.f25944f = ywVar;
    }

    /* renamed from: a */
    private void m34730a(int i) {
        if (this.f25943e != null) {
            this.f25943e.onNativeAdsFailedToLoad(i);
        }
    }

    /* renamed from: a */
    private void m34731a(List list) {
        if (this.f25943e != null) {
            this.f25943e.onNativeAdsLoaded(list);
        }
    }

    /* renamed from: a */
    protected String m34732a(String str, yt ytVar) {
        try {
            String a = ytVar.m34929a(this.d, str, true);
            if (a != null) {
                return a;
            }
            this.c.mo5610c(m34642a(), "Unable to cache icon resource " + str);
            return null;
        } catch (Throwable e) {
            this.c.mo5607a(m34642a(), "Unable to cache icon resource " + str, e);
            return null;
        }
    }

    /* renamed from: a */
    protected abstract void mo5592a(vo voVar);

    /* renamed from: a */
    protected abstract boolean mo5593a(vo voVar, yt ytVar);

    public void run() {
        for (vo voVar : this.f25945g) {
            yt n = this.b.m34409n();
            this.b.mo5561g().mo5606a(m34642a(), "Beginning resource caching phase...");
            if (mo5593a(voVar, n)) {
                this.f25946h++;
                mo5592a(voVar);
            } else {
                this.b.mo5561g().mo5612d(m34642a(), "Unable to cache resources");
            }
        }
        try {
            if (this.f25946h == this.f25945g.size()) {
                m34731a(this.f25945g);
            } else if (((Boolean) this.b.m34391a(wp.aA)).booleanValue()) {
                this.b.mo5561g().mo5612d(m34642a(), "Mismatch between successful populations and requested size");
                m34730a(-6);
            } else {
                m34731a(this.f25945g);
            }
        } catch (Throwable th) {
            this.b.mo5561g().mo5611c(m34642a(), "Encountered exception while notifying publisher code", th);
        }
    }
}
