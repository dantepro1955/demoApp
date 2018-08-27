package com.p000;

import com.facebook.internal.AnalyticsEvents;

/* renamed from: czb */
final class czb implements cym {
    /* renamed from: a */
    private C4685a[] f20741a = null;
    /* renamed from: b */
    private boolean f20742b = false;

    /* renamed from: czb$1 */
    class C46841 implements rd<cym> {
        /* renamed from: a */
        private /* synthetic */ czb f20734a;

        C46841(czb czb) {
            this.f20734a = czb;
        }

        /* renamed from: a */
        private boolean m25745a(dni dni) {
            try {
                if (dni.mo4460c("voc_pregeneration_status") == 1) {
                    this.f20734a.f20742b = true;
                } else {
                    this.f20734a.f20742b = false;
                }
                dnj g = dni.mo4464g("result_list");
                if (g != null) {
                    int a = g.mo4465a();
                    this.f20734a.f20741a = new C4685a[a];
                    for (int i = 0; i < a; i++) {
                        this.f20734a.f20741a[i] = new C4685a();
                        this.f20734a.f20741a[i].m25749a(g.mo4469b(i));
                    }
                    return true;
                }
            } catch (Throwable th) {
                czl.m25829a(this, "Error parsing result", th);
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo4243a() {
            return false;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo4245b() {
            return this.f20734a;
        }
    }

    /* renamed from: czb$a */
    static final class C4685a {
        /* renamed from: a */
        private String f20735a;
        /* renamed from: b */
        private String f20736b;
        /* renamed from: c */
        private String f20737c;
        /* renamed from: d */
        private String f20738d;
        /* renamed from: e */
        private int f20739e;
        /* renamed from: f */
        private int f20740f;

        C4685a() {
        }

        /* renamed from: a */
        final boolean m25749a(dni dni) {
            if (dni.mo4457a("id")) {
                this.f20735a = dni.mo4462e("id");
            }
            if (dni.mo4457a("type")) {
                this.f20736b = dni.mo4462e("type");
            }
            if (dni.mo4457a(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS)) {
                this.f20737c = dni.mo4462e(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS);
            }
            if (dni.mo4457a("checksum")) {
                this.f20738d = dni.mo4462e("checksum");
            }
            if (dni.mo4457a("force_upload")) {
                this.f20740f = dni.mo4460c("force_upload");
            }
            if (dni.mo4457a("final_count")) {
                this.f20739e = dni.mo4460c("final_count");
            }
            return true;
        }
    }

    czb() {
    }

    /* renamed from: a */
    public final boolean mo4246a() {
        return this.f20742b;
    }

    /* renamed from: b */
    final rd<cym> m25754b() {
        return new C46841(this);
    }
}
