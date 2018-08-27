package com.p000;

import com.ninegag.android.app.ui.HomeActivity;
import com.under9.android.feedback.otto.FeedbackCancelOpenPlayStoreEvent;
import com.under9.android.feedback.otto.FeedbackRatedEvent;

/* compiled from: RatingPromptController */
/* renamed from: chz */
public class chz {
    /* renamed from: a */
    private caf f9314a = caf.m12046a();
    /* renamed from: b */
    private HomeActivity f9315b;

    /* renamed from: a */
    public void m13637a(HomeActivity homeActivity) {
        this.f9315b = homeActivity;
        this.f9314a.m12066c((Object) this);
    }

    /* renamed from: a */
    public void m13636a() {
        this.f9315b = null;
        this.f9314a.m12074f((Object) this);
    }

    /* renamed from: b */
    public boolean m13638b() {
        if (this.f9314a.m12075g().m13727f()) {
            return false;
        }
        int aV = cip.m13967a().aV();
        if (aV == 1 || aV == 2) {
            return false;
        }
        cip h = this.f9314a.m12077h();
        long aU = h.aU();
        int aZ = h.aZ();
        if (aU >= cqw.a() || aZ <= 5 || !this.f9315b.canShowDialog()) {
            return false;
        }
        h.m13889g(cqw.a() + cqw.d(14));
        this.f9314a.m12084n().e().b(this.f9315b.getSupportFragmentManager());
        this.f9314a.m12075g().m13710a(true);
        return true;
    }

    @dhg
    public void onFeedbackRated(FeedbackRatedEvent feedbackRatedEvent) {
        this.f9314a.m12077h().m13918m(1);
    }

    @dhg
    public void onFeedbackCancelOpenPlayStoreEvent(FeedbackCancelOpenPlayStoreEvent feedbackCancelOpenPlayStoreEvent) {
        this.f9314a.m12077h().m13918m(3);
    }
}
