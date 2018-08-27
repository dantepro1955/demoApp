package com.p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mopub.common.MoPubBrowser;
import com.mopub.common.UrlAction;
import com.mopub.common.UrlHandler.Builder;
import com.mopub.common.UrlHandler.ResultActions;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Drawables;
import java.util.EnumSet;

/* compiled from: BrowserWebViewClient */
/* renamed from: byw */
public class byw extends WebViewClient {
    /* renamed from: a */
    private static final EnumSet<UrlAction> f8237a = EnumSet.of(UrlAction.HANDLE_PHONE_SCHEME, new UrlAction[]{UrlAction.OPEN_APP_MARKET, UrlAction.OPEN_IN_APP_BROWSER, UrlAction.HANDLE_SHARE_TWEET, UrlAction.FOLLOW_DEEP_LINK_WITH_FALLBACK, UrlAction.FOLLOW_DEEP_LINK});
    /* renamed from: b */
    private MoPubBrowser f8238b;

    /* compiled from: BrowserWebViewClient */
    /* renamed from: byw$1 */
    class C16091 implements ResultActions {
        /* renamed from: a */
        final /* synthetic */ byw f8236a;

        C16091(byw byw) {
            this.f8236a = byw;
        }

        public void urlHandlingSucceeded(String str, UrlAction urlAction) {
            if (urlAction.equals(UrlAction.OPEN_IN_APP_BROWSER)) {
                this.f8236a.f8238b.getWebView().loadUrl(str);
            } else {
                this.f8236a.f8238b.finish();
            }
        }

        public void urlHandlingFailed(String str, UrlAction urlAction) {
        }
    }

    public byw(MoPubBrowser moPubBrowser) {
        this.f8238b = moPubBrowser;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        MoPubLog.d("MoPubBrowser error: " + str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new Builder().withSupportedUrlActions(f8237a).withoutMoPubBrowser().withResultActions(new C16091(this)).build().handleResolvedUrl(this.f8238b.getApplicationContext(), str, true, null);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f8238b.getForwardButton().setImageDrawable(Drawables.UNRIGHT_ARROW.createDrawable(this.f8238b));
    }

    public void onPageFinished(WebView webView, String str) {
        Drawable createDrawable;
        super.onPageFinished(webView, str);
        if (webView.canGoBack()) {
            createDrawable = Drawables.LEFT_ARROW.createDrawable(this.f8238b);
        } else {
            createDrawable = Drawables.UNLEFT_ARROW.createDrawable(this.f8238b);
        }
        this.f8238b.getBackButton().setImageDrawable(createDrawable);
        if (webView.canGoForward()) {
            createDrawable = Drawables.RIGHT_ARROW.createDrawable(this.f8238b);
        } else {
            createDrawable = Drawables.UNRIGHT_ARROW.createDrawable(this.f8238b);
        }
        this.f8238b.getForwardButton().setImageDrawable(createDrawable);
    }
}
