package com.p000;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
@bhd
/* renamed from: bma */
public class bma extends blz {
    public bma(blo blo, boolean z) {
        super(blo, z);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return (webResourceRequest == null || webResourceRequest.getUrl() == null) ? null : m9607a(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
