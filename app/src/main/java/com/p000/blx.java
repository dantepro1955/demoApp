package com.p000;

import android.annotation.TargetApi;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(11)
@bhd
/* renamed from: blx */
public class blx extends blz {
    public blx(blo blo, boolean z) {
        super(blo, z);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return m9607a(webView, str, null);
    }
}
