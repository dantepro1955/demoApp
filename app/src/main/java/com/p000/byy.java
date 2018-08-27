package com.p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler.Builder;
import com.mopub.common.UrlHandler.MoPubSchemeListener;
import com.mopub.common.UrlHandler.ResultActions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.exceptions.IntentNotResolvableException;
import com.mopub.mobileads.BaseHtmlWebView;
import com.mopub.mobileads.HtmlWebViewListener;
import com.mopub.mobileads.MoPubErrorCode;
import java.util.EnumSet;

/* compiled from: HtmlWebViewClient */
/* renamed from: byy */
public class byy extends WebViewClient {
    /* renamed from: a */
    private final EnumSet<UrlAction> f8247a = EnumSet.of(UrlAction.HANDLE_MOPUB_SCHEME, new UrlAction[]{UrlAction.IGNORE_ABOUT_SCHEME, UrlAction.HANDLE_PHONE_SCHEME, UrlAction.OPEN_APP_MARKET, UrlAction.OPEN_NATIVE_BROWSER, UrlAction.OPEN_IN_APP_BROWSER, UrlAction.HANDLE_SHARE_TWEET, UrlAction.FOLLOW_DEEP_LINK_WITH_FALLBACK, UrlAction.FOLLOW_DEEP_LINK});
    /* renamed from: b */
    private final Context f8248b;
    /* renamed from: c */
    private final String f8249c;
    /* renamed from: d */
    private HtmlWebViewListener f8250d;
    /* renamed from: e */
    private BaseHtmlWebView f8251e;
    /* renamed from: f */
    private final String f8252f;
    /* renamed from: g */
    private final String f8253g;

    /* compiled from: HtmlWebViewClient */
    /* renamed from: byy$1 */
    class C16111 implements MoPubSchemeListener {
        /* renamed from: a */
        final /* synthetic */ byy f8245a;

        C16111(byy byy) {
            this.f8245a = byy;
        }

        public void onFinishLoad() {
            this.f8245a.f8250d.onLoaded(this.f8245a.f8251e);
        }

        public void onClose() {
            this.f8245a.f8250d.onCollapsed();
        }

        public void onFailLoad() {
            this.f8245a.f8250d.onFailed(MoPubErrorCode.UNSPECIFIED);
        }
    }

    /* compiled from: HtmlWebViewClient */
    /* renamed from: byy$2 */
    class C16122 implements ResultActions {
        /* renamed from: a */
        final /* synthetic */ byy f8246a;

        C16122(byy byy) {
            this.f8246a = byy;
        }

        public void urlHandlingSucceeded(String str, UrlAction urlAction) {
            if (this.f8246a.f8251e.wasClicked()) {
                this.f8246a.f8250d.onClicked();
                this.f8246a.f8251e.onResetUserClick();
            }
        }

        public void urlHandlingFailed(String str, UrlAction urlAction) {
        }
    }

    public byy(HtmlWebViewListener htmlWebViewListener, BaseHtmlWebView baseHtmlWebView, String str, String str2, String str3) {
        this.f8250d = htmlWebViewListener;
        this.f8251e = baseHtmlWebView;
        this.f8252f = str;
        this.f8253g = str2;
        this.f8249c = str3;
        this.f8248b = baseHtmlWebView.getContext();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        new Builder().withDspCreativeId(this.f8249c).withSupportedUrlActions(this.f8247a).withResultActions(new C16122(this)).withMoPubSchemeListener(new C16111(this)).build().handleUrl(this.f8248b, str, this.f8251e.wasClicked());
        return true;
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f8253g != null && str.startsWith(this.f8253g)) {
            webView.stopLoading();
            if (this.f8251e.wasClicked()) {
                try {
                    Intents.showMoPubBrowserForUrl(this.f8248b, Uri.parse(str), this.f8249c);
                    return;
                } catch (IntentNotResolvableException e) {
                    MoPubLog.d(e.getMessage());
                    return;
                }
            }
            MoPubLog.d("Attempted to redirect without user interaction");
        }
    }
}
