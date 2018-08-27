package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import p000.dtp.C5092a;

/* compiled from: ViewClickOnSubscribe */
/* renamed from: bwm */
final class bwm implements C5092a<Void> {
    /* renamed from: a */
    final View f8011a;

    /* compiled from: ViewClickOnSubscribe */
    /* renamed from: bwm$2 */
    class C15622 extends dtx {
        /* renamed from: a */
        final /* synthetic */ bwm f8010a;

        C15622(bwm bwm) {
            this.f8010a = bwm;
        }

        /* renamed from: a */
        protected void m11545a() {
            this.f8010a.f8011a.setOnClickListener(null);
        }
    }

    public /* synthetic */ void call(Object obj) {
        m11546a((dtv) obj);
    }

    bwm(View view) {
        this.f8011a = view;
    }

    /* renamed from: a */
    public void m11546a(final dtv<? super Void> dtv) {
        dtx.b();
        OnClickListener c15611 = new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ bwm f8009b;

            public void onClick(View view) {
                if (!dtv.isUnsubscribed()) {
                    dtv.onNext(null);
                }
            }
        };
        dtv.add(new C15622(this));
        this.f8011a.setOnClickListener(c15611);
    }
}
