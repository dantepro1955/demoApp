package com.p000;

@bhd
/* renamed from: ahz */
public final class ahz {
    /* renamed from: a */
    private final Object f1540a = new Object();
    /* renamed from: b */
    private baf f1541b;
    /* renamed from: c */
    private C0186a f1542c;

    /* renamed from: ahz$a */
    public static abstract class C0186a {
        /* renamed from: a */
        public void m1640a() {
        }
    }

    /* renamed from: a */
    public baf m1641a() {
        baf baf;
        synchronized (this.f1540a) {
            baf = this.f1541b;
        }
        return baf;
    }

    /* renamed from: a */
    public void m1642a(C0186a c0186a) {
        aoi.m4680a((Object) c0186a, (Object) "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f1540a) {
            this.f1542c = c0186a;
            if (this.f1541b == null) {
                return;
            }
            try {
                this.f1541b.mo894a(new baq(c0186a));
            } catch (Throwable e) {
                bky.m9007b("Unable to call setVideoLifecycleCallbacks on video controller.", e);
            }
        }
    }

    /* renamed from: a */
    public void m1643a(baf baf) {
        synchronized (this.f1540a) {
            this.f1541b = baf;
            if (this.f1542c != null) {
                m1642a(this.f1542c);
            }
        }
    }
}
