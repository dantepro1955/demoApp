package com.p000;

import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* renamed from: ux */
class ux extends WebChromeClient {
    /* renamed from: a */
    private final zi f25651a;

    public ux(zl zlVar) {
        this.f25651a = zlVar.mo5561g();
    }

    public void onConsoleMessage(String str, int i, String str2) {
        this.f25651a.mo5610c("AdWebView", "console.log[" + i + "] :" + str);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        this.f25651a.mo5606a("AdWebView", consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message());
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        this.f25651a.mo5610c("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        this.f25651a.mo5610c("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.f25651a.mo5610c("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }
}
