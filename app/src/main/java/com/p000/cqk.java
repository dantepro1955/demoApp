package com.p000;

import com.ninegag.android.library.rlogger.RLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PreloadHelper */
/* renamed from: cqk */
public class cqk {

    /* compiled from: PreloadHelper */
    /* renamed from: cqk$a */
    public static class C4529a implements Runnable {
        /* renamed from: a */
        private static ArrayList<C4529a> f19984a = new ArrayList();
        /* renamed from: b */
        private WeakReference<cct> f19985b;

        /* renamed from: a */
        public static C4529a m24487a(cct cct) {
            C4529a c4529a;
            synchronized (f19984a) {
                if (f19984a.size() == 0) {
                    c4529a = new C4529a();
                } else {
                    c4529a = (C4529a) f19984a.remove(0);
                }
            }
            c4529a.m24489b(cct);
            return c4529a;
        }

        /* renamed from: b */
        private void m24489b(cct cct) {
            this.f19985b = new WeakReference(cct);
        }

        /* renamed from: a */
        private void m24488a() {
            this.f19985b.clear();
            synchronized (f19984a) {
                f19984a.add(this);
            }
        }

        public void run() {
            cct cct = (cct) this.f19985b.get();
            if (cct != null) {
                if (cct.p()) {
                    cqk.m24492a(cct);
                }
                cqk.m24493b(cct);
                if (cct.j()) {
                    cqk.m24494c(cct);
                }
                cqk.m24495d(cct);
                m24488a();
            }
        }
    }

    /* renamed from: a */
    public static void m24492a(cct cct) {
        if (cct != null) {
            try {
                if (cct.p()) {
                    dlq.m27901a(cct.y());
                } else {
                    cqk.m24493b(cct);
                }
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: b */
    public static void m24493b(cct cct) {
        if (cct != null) {
            if (!cct.q()) {
                dlq.m27901a(cct.v());
            } else if (cct.G() != null) {
                for (ckg ckg : cct.G()) {
                    dlq.m27901a(ckg.f9530a);
                }
            } else {
                dlq.m27901a(cct.v());
            }
        }
    }

    /* renamed from: c */
    public static void m24494c(cct cct) {
        if ((chp.f() || caf.a().h().an()) && cct != null) {
            caf a = caf.a();
            String B = cct.B();
            dln.m27888a(a.f8449a).m27895a(a.t().mo4407a(B), a.f().b(a.f8449a, cct.e(), cct.f(), a.d().f8408e), RLogger.getInstance());
        }
    }

    /* renamed from: a */
    public static void m24490a(int i, ccs ccs) {
        if (ccs != null && i < ccs.size()) {
            int i2 = i + 4;
            while (i < i2 && i < ccs.size()) {
                cct cct = (cct) ccs.get(i);
                if (cct.j()) {
                    cqk.m24494c(cct);
                } else {
                    cqk.m24492a(cct);
                    cqk.m24493b(cct);
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public static void m24491a(int i, cge cge) {
        if (cge != null && i < cge.size()) {
            int i2 = i + 4;
            while (i < i2 && i < cge.size()) {
                cct cct = (cct) cge.get(i);
                if (!(cct instanceof cdk)) {
                    if (cct.j()) {
                        cqk.m24494c(cct);
                    } else {
                        cqk.m24492a(cct);
                        cqk.m24493b(cct);
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: d */
    public static void m24495d(cct cct) {
        ckj d = cij.a().d(cct.e());
        if (d != null) {
            cdh cdh = (cdh) djm.m27592a(d.f9538c, cdh.class);
            if (cdh != null) {
                cge.a(cct.e(), cdh);
            }
        }
    }
}
