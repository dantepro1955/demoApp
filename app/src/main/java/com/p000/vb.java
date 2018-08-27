package com.p000;

import android.content.Context;
import android.net.Uri;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import java.util.List;

/* renamed from: vb */
class vb extends WebViewClient {
    /* renamed from: a */
    private final zi f25662a;
    /* renamed from: b */
    private final ty f25663b;

    public vb(ty tyVar, zl zlVar) {
        this.f25662a = zlVar.mo5561g();
        this.f25663b = tyVar;
    }

    /* renamed from: a */
    private void m34291a(uy uyVar, Uri uri) {
        yy a = uyVar.m34287a();
        ViewParent parent = uyVar.getParent();
        if (!(parent instanceof AppLovinAdView) || a == null) {
            this.f25662a.mo5612d("AdWebViewClient", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        } else {
            this.f25663b.m34220a(a, (AppLovinAdView) parent, this.f25663b, uri);
        }
    }

    /* renamed from: a */
    void m34292a(WebView webView, String str) {
        this.f25662a.mo5606a("AdWebViewClient", "Processing click on ad URL \"" + str + "\"");
        if (str != null && (webView instanceof uy)) {
            Uri parse = Uri.parse(str);
            uy uyVar = (uy) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            if (!"applovin".equals(scheme) || !"com.applovin.sdk".equals(host)) {
                m34291a(uyVar, parse);
            } else if ("/adservice/next_ad".equals(path)) {
                m34293a(uyVar);
            } else if ("/adservice/close_ad".equals(path)) {
                m34294b(uyVar);
            } else if (!vl.f25714a.equals(path)) {
                if (vl.f25715b.equals(path)) {
                    m34291a(uyVar, Uri.parse(vl.f25715b));
                } else if (path == null || !path.startsWith("/launch/")) {
                    this.f25662a.mo5610c("AdWebViewClient", "Unknown URL: " + str);
                    this.f25662a.mo5610c("AdWebViewClient", "Path: " + path);
                } else {
                    List pathSegments = parse.getPathSegments();
                    if (pathSegments != null && pathSegments.size() > 1) {
                        String str2 = (String) pathSegments.get(pathSegments.size() - 1);
                        try {
                            Context context = webView.getContext();
                            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str2));
                            m34291a(uyVar, null);
                        } catch (Throwable e) {
                            this.f25662a.mo5609b("AdWebViewClient", "Threw Exception Trying to Launch App for Package: " + str2, e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    void m34293a(uy uyVar) {
        ViewParent parent = uyVar.getParent();
        if (parent instanceof AppLovinAdView) {
            ((AppLovinAdView) parent).a();
        }
    }

    /* renamed from: b */
    void m34294b(uy uyVar) {
        this.f25663b.m34234g();
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.f25663b.m34217a(webView);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        m34292a(webView, str);
        return true;
    }
}
