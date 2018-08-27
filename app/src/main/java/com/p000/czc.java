package com.p000;

import com.facebook.internal.AnalyticsEvents;

/* renamed from: czc */
final class czc implements cyo {
    /* renamed from: a */
    private String f20744a;

    /* renamed from: czc$1 */
    class C46861 implements rd<cyo> {
        /* renamed from: a */
        private /* synthetic */ czc f20743a;

        C46861(czc czc) {
            this.f20743a = czc;
        }

        /* renamed from: a */
        public final boolean mo4243a() {
            return false;
        }

        /* renamed from: a */
        public final /* synthetic */ boolean mo4244a(Object obj) {
            this.f20743a.f20744a = ((dni) obj).mo4462e(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
            return this.f20743a.f20744a != null;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo4245b() {
            return this.f20743a;
        }
    }

    czc() {
    }

    /* renamed from: a */
    public final String mo4247a() {
        return this.f20744a;
    }

    /* renamed from: b */
    final rd<cyo> m25761b() {
        return new C46861(this);
    }
}
