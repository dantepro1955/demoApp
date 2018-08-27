package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.AudienceNetworkActivity;
import com.under9.android.lib.network.model.Constants;

/* renamed from: uy */
class uy extends WebView {
    /* renamed from: a */
    private final zi f25652a;
    /* renamed from: b */
    private yy f25653b = null;
    /* renamed from: c */
    private boolean f25654c = false;

    uy(vb vbVar, zl zlVar, Context context) {
        super(context);
        this.f25652a = zlVar.mo5561g();
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        setWebViewClient(vbVar);
        setWebChromeClient(new ux(zlVar));
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        setScrollBarStyle(33554432);
        setOnTouchListener(new uz(this));
        setOnLongClickListener(new va(this));
    }

    /* renamed from: a */
    yy m34287a() {
        return this.f25653b;
    }

    /* renamed from: a */
    public void m34288a(yy yyVar) {
        if (this.f25654c) {
            this.f25652a.mo5613e("AdWebView", "Ad can not be loaded in a destroyed web view");
            return;
        }
        this.f25653b = yyVar;
        try {
            loadDataWithBaseURL(Constants.SEP, ((vi) yyVar).m34328j(), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null, "");
            this.f25652a.mo5606a("AdWebView", "AppLovinAd rendered");
        } catch (Exception e) {
        }
    }

    public void destroy() {
        this.f25654c = true;
        try {
            super.destroy();
            this.f25652a.mo5606a("AdWebView", "Web view destroyed");
        } catch (Throwable th) {
            if (this.f25652a != null) {
                this.f25652a.mo5609b("AdWebView", "destroy() threw exception", th);
            }
        }
    }

    protected void onFocusChanged(boolean z, int i, Rect rect) {
        try {
            super.onFocusChanged(z, i, rect);
        } catch (Throwable e) {
            this.f25652a.mo5609b("AdWebView", "onFocusChanged() threw exception", e);
        }
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (Throwable e) {
            this.f25652a.mo5609b("AdWebView", "onWindowFocusChanged() threw exception", e);
        }
    }

    protected void onWindowVisibilityChanged(int i) {
        try {
            super.onWindowVisibilityChanged(i);
        } catch (Throwable e) {
            this.f25652a.mo5609b("AdWebView", "onWindowVisibilityChanged() threw exception", e);
        }
    }

    public boolean requestFocus(int i, Rect rect) {
        try {
            return super.requestFocus(i, rect);
        } catch (Throwable e) {
            this.f25652a.mo5609b("AdWebView", "requestFocus() threw exception", e);
            return false;
        }
    }
}
