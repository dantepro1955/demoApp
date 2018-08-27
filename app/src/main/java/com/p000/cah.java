package com.p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.ninegag.android.app.browser.DefaultInAppBrowserActivity;

/* renamed from: cah */
public final /* synthetic */ class cah implements OnClickListener {
    /* renamed from: a */
    private final DefaultInAppBrowserActivity f8483a;
    /* renamed from: b */
    private final View f8484b;

    private cah(DefaultInAppBrowserActivity defaultInAppBrowserActivity, View view) {
        this.f8483a = defaultInAppBrowserActivity;
        this.f8484b = view;
    }

    /* renamed from: a */
    public static OnClickListener m12108a(DefaultInAppBrowserActivity defaultInAppBrowserActivity, View view) {
        return new cah(defaultInAppBrowserActivity, view);
    }

    public void onClick(View view) {
        DefaultInAppBrowserActivity.lambda$onCreate$0(this.f8483a, this.f8484b, view);
    }
}
