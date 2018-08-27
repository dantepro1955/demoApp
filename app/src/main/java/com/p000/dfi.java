package com.p000;

import android.support.v4.app.FragmentActivity;
import com.under9.android.feedback.otto.FeedbackRateCancelEvent;
import com.under9.android.feedback.otto.FeedbackRatedEvent;
import com.under9.android.feedback.otto.FeedbackTypeSelectedEvent;

/* compiled from: AbstractFeedbackEventController */
/* renamed from: dfi */
public abstract class dfi extends dfx {
    /* renamed from: b */
    FragmentActivity f9428b;

    /* renamed from: a */
    public abstract void mo1777a(String str);

    public void s_() {
        super.s_();
        dhe.a(this);
    }

    public void t_() {
        super.t_();
        dhe.b(this);
    }

    /* renamed from: a */
    public void m14067a(FragmentActivity fragmentActivity) {
        this.f9428b = fragmentActivity;
    }

    @dhg
    public void onFeedbackTypeSelected(FeedbackTypeSelectedEvent feedbackTypeSelectedEvent) {
        if ("3".equals(feedbackTypeSelectedEvent.f19365a)) {
            m14066f().e().b(this.f9428b.getSupportFragmentManager());
        } else {
            mo1777a(feedbackTypeSelectedEvent.f19365a);
        }
    }

    @dhg
    public void onFeedbackRated(FeedbackRatedEvent feedbackRatedEvent) {
        if (feedbackRatedEvent.f19364a) {
            m14066f().e().a(this.f9428b, "3");
            m14066f().e().c(this.f9428b.getSupportFragmentManager());
            return;
        }
        mo1777a("3");
    }

    @dhg
    public void onFeedbackRateCancelEvent(FeedbackRateCancelEvent feedbackRateCancelEvent) {
        m14066f().e().d(this.f9428b.getSupportFragmentManager());
    }

    /* renamed from: f */
    private dfd m14066f() {
        return dfd.a();
    }
}
