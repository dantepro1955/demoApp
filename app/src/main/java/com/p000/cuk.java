package com.p000;

import com.ninegag.android.library.upload.model.MediaMeta;

/* compiled from: BaseMediaValidator */
/* renamed from: cuk */
public abstract class cuk implements cup {
    /* renamed from: a */
    private C4159a f20256a;
    /* renamed from: b */
    private cul f20257b;

    /* compiled from: BaseMediaValidator */
    /* renamed from: cuk$a */
    public interface C4159a {
        /* renamed from: a */
        void mo3851a();

        /* renamed from: a */
        void mo3852a(int i, int i2, cul cul);

        /* renamed from: a */
        void mo3853a(long j, cul cul);

        /* renamed from: b */
        void mo3854b(int i, int i2, cul cul);

        /* renamed from: c */
        void mo3855c(int i, int i2, cul cul);

        /* renamed from: d */
        void mo3856d(int i, int i2, cul cul);
    }

    public cuk(cul cul, C4159a c4159a) {
        this.f20257b = cul;
        this.f20256a = c4159a;
    }

    /* renamed from: a */
    public C4159a m25019a() {
        return this.f20256a;
    }

    /* renamed from: b */
    public cul m25021b() {
        return this.f20257b;
    }

    /* renamed from: a */
    public boolean m25020a(MediaMeta mediaMeta) {
        if (mediaMeta.f18782e > this.f20257b.mo4105a()) {
            this.f20256a.mo3853a(this.f20257b.mo4105a(), this.f20257b);
            return false;
        } else if (mediaMeta.f18782e > 0) {
            return true;
        } else {
            this.f20256a.mo3851a();
            return false;
        }
    }
}
