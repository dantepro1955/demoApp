package com.p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: wl */
abstract class wl implements yr, yv {
    /* renamed from: a */
    protected final vm f25779a;
    /* renamed from: b */
    protected final zi f25780b;
    /* renamed from: c */
    protected final Object f25781c = new Object();
    /* renamed from: d */
    protected final Map f25782d = mo5567a();
    /* renamed from: e */
    protected final Map f25783e = new HashMap();
    /* renamed from: f */
    protected final Set f25784f = new HashSet();

    wl(vm vmVar) {
        this.f25779a = vmVar;
        this.f25780b = vmVar.mo5561g();
    }

    /* renamed from: h */
    private wm m34475h(wt wtVar) {
        return (wm) this.f25782d.get(wtVar);
    }

    /* renamed from: a */
    abstract Map mo5567a();

    /* renamed from: a */
    abstract wo mo5568a(wt wtVar);

    /* renamed from: a */
    abstract wt mo5569a(vt vtVar);

    /* renamed from: a */
    abstract void mo5570a(Object obj, vt vtVar);

    /* renamed from: a */
    abstract void mo5571a(Object obj, wt wtVar, int i);

    /* renamed from: a */
    public boolean mo5573a(wt wtVar, Object obj) {
        boolean z;
        synchronized (this.f25781c) {
            if (m34491g(wtVar)) {
                z = false;
            } else {
                mo5575b(wtVar, obj);
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    public vt mo5574b(wt wtVar) {
        vt e;
        synchronized (this.f25781c) {
            e = m34475h(wtVar).m34638e();
        }
        return e;
    }

    /* renamed from: b */
    void m34483b(vt vtVar) {
        mo5579f(mo5569a(vtVar));
    }

    /* renamed from: b */
    protected void m34484b(wt wtVar, int i) {
        this.f25780b.mo5606a("PreloadManager", "Failed to pre-load an ad of spec " + wtVar + ", error code " + i);
        synchronized (this.f25781c) {
            Object remove = this.f25783e.remove(wtVar);
            this.f25784f.add(wtVar);
        }
        if (remove != null) {
            try {
                mo5571a(remove, wtVar, i);
            } catch (Throwable th) {
                this.f25779a.mo5561g().mo5611c("PreloadManager", "Encountered exception while invoking user callback", th);
            }
        }
    }

    /* renamed from: b */
    public void mo5575b(wt wtVar, Object obj) {
        synchronized (this.f25781c) {
            if (this.f25783e.containsKey(wtVar)) {
                this.f25780b.mo5610c("PreloadManager", "Possibly missing prior registered preload callback.");
            }
            this.f25783e.put(wtVar, obj);
        }
    }

    /* renamed from: c */
    protected void m34486c(vt vtVar) {
        synchronized (this.f25781c) {
            wt a = mo5569a(vtVar);
            Object obj = this.f25783e.get(a);
            this.f25783e.remove(a);
            this.f25784f.add(a);
            if (obj == null) {
                m34475h(a).m34634a(vtVar);
                this.f25780b.mo5606a("PreloadManager", "Ad enqueued: " + vtVar);
            } else {
                this.f25780b.mo5606a("PreloadManager", "Additional callback found, skipping enqueue.");
            }
        }
        if (obj != null) {
            this.f25780b.mo5606a("PreloadManager", "Called additional callback regarding " + vtVar);
            try {
                mo5570a(obj, vtVar);
            } catch (Throwable th) {
                this.f25779a.mo5561g().mo5611c("PreloadManager", "Encountered throwable while notifying user callback", th);
            }
            m34483b(vtVar);
        }
        this.f25780b.mo5606a("PreloadManager", "Pulled ad from network and saved to preload cache: " + vtVar);
    }

    /* renamed from: c */
    public boolean mo5576c(wt wtVar) {
        boolean c;
        synchronized (this.f25781c) {
            c = m34475h(wtVar).m34636c();
        }
        return c;
    }

    /* renamed from: d */
    public void mo5577d(wt wtVar) {
        int i = 0;
        if (wtVar != null) {
            int b;
            synchronized (this.f25781c) {
                wm h = m34475h(wtVar);
                b = h != null ? h.m34635b() - h.m34633a() : 0;
            }
            if (b > 0) {
                while (i < b) {
                    mo5579f(wtVar);
                    i++;
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo5578e(wt wtVar) {
        boolean z;
        synchronized (this.f25781c) {
            z = !m34475h(wtVar).m34637d();
        }
        return z;
    }

    /* renamed from: f */
    public void mo5579f(wt wtVar) {
        if (((Boolean) this.f25779a.m34391a(wp.f25871A)).booleanValue() && !mo5576c(wtVar)) {
            this.f25780b.mo5606a("PreloadManager", "Preloading ad for spec " + wtVar + "...");
            this.f25779a.m34407l().m34804a(mo5568a(wtVar), xl.MAIN, 500);
        }
    }

    /* renamed from: g */
    boolean m34491g(wt wtVar) {
        boolean contains;
        synchronized (this.f25781c) {
            contains = this.f25784f.contains(wtVar);
        }
        return contains;
    }
}
