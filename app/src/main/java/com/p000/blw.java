package com.p000;

import android.annotation.TargetApi;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

@TargetApi(11)
@bhd
/* renamed from: blw */
public class blw extends WebChromeClient {
    /* renamed from: a */
    private final blo f6948a;

    /* renamed from: blw$1 */
    class C13301 implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ JsResult f6940a;

        C13301(JsResult jsResult) {
            this.f6940a = jsResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6940a.cancel();
        }
    }

    /* renamed from: blw$2 */
    class C13312 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ JsResult f6941a;

        C13312(JsResult jsResult) {
            this.f6941a = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6941a.cancel();
        }
    }

    /* renamed from: blw$3 */
    class C13323 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ JsResult f6942a;

        C13323(JsResult jsResult) {
            this.f6942a = jsResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6942a.confirm();
        }
    }

    /* renamed from: blw$4 */
    class C13334 implements OnCancelListener {
        /* renamed from: a */
        final /* synthetic */ JsPromptResult f6943a;

        C13334(JsPromptResult jsPromptResult) {
            this.f6943a = jsPromptResult;
        }

        public void onCancel(DialogInterface dialogInterface) {
            this.f6943a.cancel();
        }
    }

    /* renamed from: blw$5 */
    class C13345 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ JsPromptResult f6944a;

        C13345(JsPromptResult jsPromptResult) {
            this.f6944a = jsPromptResult;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6944a.cancel();
        }
    }

    /* renamed from: blw$6 */
    class C13356 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ JsPromptResult f6945a;
        /* renamed from: b */
        final /* synthetic */ EditText f6946b;

        C13356(JsPromptResult jsPromptResult, EditText editText) {
            this.f6945a = jsPromptResult;
            this.f6946b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f6945a.confirm(this.f6946b.getText().toString());
        }
    }

    /* renamed from: blw$7 */
    static /* synthetic */ class C13367 {
        /* renamed from: a */
        static final /* synthetic */ int[] f6947a = new int[MessageLevel.values().length];

        static {
            try {
                f6947a[MessageLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6947a[MessageLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6947a[MessageLevel.LOG.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6947a[MessageLevel.TIP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f6947a[MessageLevel.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }

    public blw(blo blo) {
        this.f6948a = blo;
    }

    /* renamed from: a */
    private final Context m9600a(WebView webView) {
        if (!(webView instanceof blo)) {
            return webView.getContext();
        }
        blo blo = (blo) webView;
        Context f = blo.mo1316f();
        return f == null ? blo.getContext() : f;
    }

    /* renamed from: a */
    private static void m9601a(Builder builder, String str, JsResult jsResult) {
        builder.setMessage(str).setPositiveButton(17039370, new C13323(jsResult)).setNegativeButton(17039360, new C13312(jsResult)).setOnCancelListener(new C13301(jsResult)).create().show();
    }

    /* renamed from: a */
    private static void m9602a(Context context, Builder builder, String str, String str2, JsPromptResult jsPromptResult) {
        View linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View textView = new TextView(context);
        textView.setText(str);
        View editText = new EditText(context);
        editText.setText(str2);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        builder.setView(linearLayout).setPositiveButton(17039370, new C13356(jsPromptResult, editText)).setNegativeButton(17039360, new C13345(jsPromptResult)).setOnCancelListener(new C13334(jsPromptResult)).create().show();
    }

    /* renamed from: a */
    private final boolean m9603a() {
        return ako.m2343e().m9112a(this.f6948a.getContext(), this.f6948a.getContext().getPackageName(), "android.permission.ACCESS_FINE_LOCATION") || ako.m2343e().m9112a(this.f6948a.getContext(), this.f6948a.getContext().getPackageName(), "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* renamed from: a */
    protected final void m9604a(View view, int i, CustomViewCallback customViewCallback) {
        aio i2 = this.f6948a.mo1319i();
        if (i2 == null) {
            bky.m9011e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        i2.m1752a(view, customViewCallback);
        i2.m1749a(i);
    }

    /* renamed from: a */
    protected boolean m9605a(Context context, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            Builder builder = new Builder(context);
            builder.setTitle(str);
            if (z) {
                blw.m9602a(context, builder, str2, str3, jsPromptResult);
            } else {
                blw.m9601a(builder, str2, jsResult);
            }
        } catch (Throwable e) {
            bky.m9009c("Fail to display Dialog.", e);
        }
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (webView instanceof blo) {
            aio i = ((blo) webView).mo1319i();
            if (i == null) {
                bky.m9011e("Tried to close an AdWebView not associated with an overlay.");
                return;
            } else {
                i.m1748a();
                return;
            }
        }
        bky.m9011e("Tried to close a WebView that wasn't an AdWebView.");
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String valueOf = String.valueOf(consoleMessage.message());
        String valueOf2 = String.valueOf(consoleMessage.sourceId());
        valueOf = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length()).append("JS: ").append(valueOf).append(" (").append(valueOf2).append(":").append(consoleMessage.lineNumber()).append(")").toString();
        if (valueOf.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (C13367.f6947a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                bky.m9008c(valueOf);
                break;
            case 2:
                bky.m9011e(valueOf);
                break;
            case 3:
            case 4:
                bky.m9010d(valueOf);
                break;
            case 5:
                bky.m9006b(valueOf);
                break;
            default:
                bky.m9010d(valueOf);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(this.f6948a.mo1322l());
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(Math.min(131072, j4) + j, 1048576);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            callback.invoke(str, m9603a(), true);
        }
    }

    public final void onHideCustomView() {
        aio i = this.f6948a.mo1319i();
        if (i == null) {
            bky.m9011e("Could not get ad overlay when hiding custom view.");
        } else {
            i.m1757b();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m9605a(m9600a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m9605a(m9600a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m9605a(m9600a(webView), str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m9605a(m9600a(webView), str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = 131072 + j;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        m9604a(view, -1, customViewCallback);
    }
}
