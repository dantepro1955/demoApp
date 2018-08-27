package com.p000;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: FetchCommentHandlerThread */
/* renamed from: cnv */
public class cnv extends HandlerThread {
    /* renamed from: b */
    private static caf f9891b = caf.m12046a();
    /* renamed from: a */
    Handler f9892a;

    public cnv(String str) {
        super(str);
    }

    /* renamed from: a */
    public void m14919a(final cct cct) {
        if (cct != null && f9891b.m12087q().m14402o() && !cct.m12272P() && cqw.a(cct.m12270N()) >= 10000) {
            cct.m12275a(cqw.a());
            final String e = cct.m12282e();
            if (e != null) {
                m14918a().post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ cnv f9887c;

                    public void run() {
                        if (cnv.f9891b.m12075g().m13728f(e)) {
                            cct.m12277a(true);
                            cnv.f9891b.m12075g().m13722d(e);
                            return;
                        }
                        cnv.f9891b.m12079i().m13556b(e);
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public void m14920b(final cct cct) {
        if (cct != null && f9891b.m12087q().m14402o() && cqw.a(cct.m12271O()) >= 10000) {
            cct.m12279b(cqw.a());
            final String e = cct.m12282e();
            if (e != null) {
                m14918a().post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ cnv f9890c;

                    public void run() {
                        if (cnv.f9891b.m12075g().m13730g(e)) {
                            cnv.f9891b.m12075g().m13725e(e);
                        } else {
                            cnv.f9891b.m12079i().m13567c(e);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public Handler m14918a() {
        if (this.f9892a == null) {
            this.f9892a = new Handler(getLooper());
        }
        return this.f9892a;
    }
}
