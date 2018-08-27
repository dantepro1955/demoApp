package com.p000;

import p000.rh.C5006j;

/* renamed from: dpu */
public interface dpu {

    /* renamed from: dpu$a */
    public static class C5034a {
        /* renamed from: a */
        private String f22558a;

        private C5034a(String str) {
            this.f22558a = str;
        }

        public final String toString() {
            return this.f22558a;
        }
    }

    static {
        C5034a c5034a = new C5034a("ABORT_END");
        c5034a = new C5034a("ABORT_BACK");
        c5034a = new C5034a("ABORT_NEW");
        c5034a = new C5034a("STOPPED_TOO_SOON");
        c5034a = new C5034a("PREEMPTED");
    }

    /* renamed from: a */
    void mo4544a() throws dno, dnp;

    /* renamed from: a */
    void mo4545a(C5006j c5006j) throws dno, dnp;
}
