package com.p000;

import com.ninegag.android.app.ui.BaseNavActivity;
import com.under9.android.feedback.otto.FeedbackOpenPlayStoreEvent;

/* compiled from: FeedbackEventController */
/* renamed from: cjn */
public class cjn extends dfi {
    /* renamed from: a */
    BaseNavActivity f9429a;

    /* renamed from: a */
    public void m14069a(BaseNavActivity baseNavActivity) {
        this.f9429a = baseNavActivity;
    }

    /* renamed from: a */
    public void mo1777a(String str) {
        this.f9429a.getNavHelper().h(str);
    }

    @dhg
    public void onFeedbackOpenPlayStore(FeedbackOpenPlayStoreEvent feedbackOpenPlayStoreEvent) {
        this.f9429a.getNavHelper().k();
    }
}
