package com.p000;

import com.facebook.ads.AudienceNetworkActivity;
import com.under9.android.lib.network.model.Constants;

/* renamed from: ut */
class ut implements Runnable {
    /* renamed from: a */
    final /* synthetic */ ty f25646a;

    private ut(ty tyVar) {
        this.f25646a = tyVar;
    }

    public void run() {
        try {
            this.f25646a.f25580h.loadDataWithBaseURL(Constants.SEP, "<html></html>", AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
        } catch (Exception e) {
        }
    }
}
