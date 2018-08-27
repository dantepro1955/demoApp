package com.p000;

import p000.bnh.C1355a;

/* renamed from: bnq */
public class bnq extends bnh<bnr> {

    /* renamed from: bnq$a */
    static class C1358a implements C1355a<bnr> {
        /* renamed from: a */
        private final bmw f7157a;
        /* renamed from: b */
        private final bnr f7158b = new bnr();

        public C1358a(bmw bmw) {
            this.f7157a = bmw;
        }

        /* renamed from: a */
        public /* synthetic */ bng mo1356a() {
            return m9990b();
        }

        /* renamed from: a */
        public void mo1357a(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.f7158b.f7162d = i;
            } else {
                this.f7157a.m9771f().zzd("Int xml configuration name not recognized", str);
            }
        }

        /* renamed from: a */
        public void mo1358a(String str, String str2) {
        }

        /* renamed from: a */
        public void mo1359a(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.f7158b.f7163e = z ? 1 : 0;
                return;
            }
            this.f7157a.m9771f().zzd("Bool xml configuration name not recognized", str);
        }

        /* renamed from: b */
        public bnr m9990b() {
            return this.f7158b;
        }

        /* renamed from: b */
        public void mo1360b(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.f7158b.f7159a = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.f7158b.f7160b = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.f7158b.f7161c = str2;
            } else {
                this.f7157a.m9771f().zzd("String xml configuration name not recognized", str);
            }
        }
    }

    public bnq(bmw bmw) {
        super(bmw, new C1358a(bmw));
    }
}
