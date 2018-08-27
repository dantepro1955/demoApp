package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.facebook.internal.ServerProtocol;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.bxw.C1582a;
import p000.byj.C1600b;

/* compiled from: JavaScriptBridgeImpl */
/* renamed from: bxx */
class bxx implements bxw {
    /* renamed from: a */
    private final ScheduledExecutorService f8132a;
    /* renamed from: b */
    private ScheduledFuture<?> f8133b;
    /* renamed from: c */
    private ScheduledFuture<?> f8134c;
    /* renamed from: d */
    private final byj f8135d;
    /* renamed from: e */
    private int f8136e = 0;
    /* renamed from: f */
    private boolean f8137f = false;
    /* renamed from: g */
    private boolean f8138g = false;
    /* renamed from: h */
    private WebView f8139h;
    /* renamed from: i */
    private C1582a f8140i;

    /* compiled from: JavaScriptBridgeImpl */
    /* renamed from: bxx$1 */
    class C15831 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bxx f8126a;

        C15831(bxx bxx) {
            this.f8126a = bxx;
        }

        public void run() {
            try {
                this.f8126a.m11706e();
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
    }

    /* compiled from: JavaScriptBridgeImpl */
    /* renamed from: bxx$2 */
    class C15842 implements ValueCallback<String> {
        /* renamed from: a */
        final /* synthetic */ bxx f8127a;

        C15842(bxx bxx) {
            this.f8127a = bxx;
        }

        public /* synthetic */ void onReceiveValue(Object obj) {
            m11696a((String) obj);
        }

        /* renamed from: a */
        public void m11696a(String str) {
            if (str == null || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("false")) {
                if (this.f8127a.f8135d.mo1615b()) {
                    Log.d("MoatJavaScriptBridge", "Received value is:" + (str == null ? "null" : "(String)" + str));
                }
                if (this.f8127a.f8136e == -1 || this.f8127a.f8136e == 50) {
                    this.f8127a.m11709g();
                }
                this.f8127a.f8136e = this.f8127a.f8136e + 1;
            } else if (str.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE)) {
                this.f8127a.f8136e = -1;
                this.f8127a.m11706e();
            } else if (this.f8127a.f8135d.mo1615b()) {
                Log.d("MoatJavaScriptBridge", "Received unusual value from Javascript:" + str);
            }
        }
    }

    /* compiled from: JavaScriptBridgeImpl */
    /* renamed from: bxx$3 */
    class C15863 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bxx f8129a;

        /* compiled from: JavaScriptBridgeImpl */
        /* renamed from: bxx$3$1 */
        class C15851 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C15863 f8128a;

            C15851(C15863 c15863) {
                this.f8128a = c15863;
            }

            public void run() {
                try {
                    this.f8128a.f8129a.m11700b();
                } catch (Exception e) {
                    byt.m11829a(e);
                }
            }
        }

        C15863(bxx bxx) {
            this.f8129a = bxx;
        }

        public void run() {
            try {
                new Handler(Looper.getMainLooper()).post(new C15851(this));
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
    }

    /* compiled from: JavaScriptBridgeImpl */
    /* renamed from: bxx$4 */
    class C15884 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bxx f8131a;

        /* compiled from: JavaScriptBridgeImpl */
        /* renamed from: bxx$4$1 */
        class C15871 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C15884 f8130a;

            C15871(C15884 c15884) {
                this.f8130a = c15884;
            }

            public void run() {
                try {
                    this.f8130a.f8131a.m11702c();
                } catch (Exception e) {
                    byt.m11829a(e);
                }
            }
        }

        C15884(bxx bxx) {
            this.f8131a = bxx;
        }

        public void run() {
            try {
                new Handler(Looper.getMainLooper()).post(new C15871(this));
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
    }

    bxx(Context context, byj byj) {
        this.f8135d = byj;
        this.f8132a = Executors.newScheduledThreadPool(1);
    }

    /* renamed from: a */
    public boolean mo1599a(WebView webView, C1582a c1582a) throws byu {
        boolean b = this.f8135d.mo1615b();
        if (webView.getSettings().getJavaScriptEnabled()) {
            this.f8139h = webView;
            this.f8140i = c1582a;
            m11703d();
            m11707f();
            this.f8132a.schedule(new C15831(this), 10, TimeUnit.SECONDS);
            return true;
        }
        if (b) {
            Log.e("MoatJavaScriptBridge", "JavaScript is not enabled in the given WebView. Can't track.");
        }
        return false;
    }

    /* renamed from: a */
    public void mo1598a() {
        if (this.f8135d.mo1613a() != C1600b.OFF) {
            m11706e();
            m11709g();
        }
    }

    /* renamed from: b */
    private void m11700b() {
        try {
            if (this.f8135d.mo1613a() != C1600b.OFF) {
                if (this.f8135d.mo1615b() && !this.f8138g) {
                    Log.d("MoatJavaScriptBridge", "Ready for communication (setting environment variables).");
                    this.f8138g = true;
                }
                this.f8139h.loadUrl(String.format("javascript:(function(b,f){function g(){function b(a,e){for(k in a)if(a.hasOwnProperty(k)){var c=a[k].fn;if('function'===typeof c)try{e?c(e):c()}catch(d){}}}function d(a,b,c){'function'===typeof a&&(c[b]={ts:+new Date,fn:a})}bjmk={};uqaj={};yhgt={};ryup=dptk=!1;this.a=function(a){this.namespace=a.namespace;this.version=a.version;this.appName=a.appName;this.deviceOS=a.deviceOS;this.isNative=a.isNative;this.versionHash=a.versionHash};this.bpsy=function(a){dptk||ryup||d(a,+new Date,bjmk)};this.qmrv=function(a){ryup||d(a,+new Date,uqaj)};this.lgpr=function(a,b){d(a,b,yhgt)};this.xrnk=function(a){yhgt.hasOwnProperty(a)&&delete yhgt[a]};this.vgft=function(){return dptk};this.lkpu=function(){return ryup};this.mqjh=function(){dptk||ryup||(dptk=!0,b(bjmk))};this.egpw=function(){ryup||(ryup=!0,b(uqaj))};this.sglu=function(a){b(yhgt,a);return 0<Object.keys(yhgt).length}}'undefined'===typeof b.MoatMAK&&(b.MoatMAK=new g,b.MoatMAK.a(f),b.__zMoatInit__=!0)})(window,%s);", new Object[]{this.f8140i.mo1624b()}));
            }
        } catch (Throwable e) {
            if (this.f8135d.mo1615b()) {
                Log.e("MoatJavaScriptBridge", "Failed to initialize communication (did not set environment variables).", e);
            }
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    private void m11702c() throws byu {
        try {
            if (this.f8135d.mo1613a() != C1600b.OFF) {
                if (this.f8139h == null || (this.f8137f && this.f8139h.getUrl() == null)) {
                    if (this.f8135d.mo1615b()) {
                        Log.d("MoatJavaScriptBridge", "WebView became null" + (this.f8139h == null ? "" : "based on null url") + ", stopping tracking loop");
                    }
                    m11709g();
                    return;
                }
                if (this.f8139h.getUrl() != null) {
                    this.f8137f = true;
                }
                String format = String.format("MoatMAK.sglu(%s)", new Object[]{this.f8140i.mo1623a()});
                if (VERSION.SDK_INT >= 19) {
                    this.f8139h.evaluateJavascript(format, new C15842(this));
                } else {
                    this.f8139h.loadUrl("javascript:" + format);
                }
            }
        } catch (Exception e) {
            byt.m11829a(e);
            m11706e();
            m11709g();
        }
    }

    /* renamed from: d */
    private void m11703d() {
        if (this.f8135d.mo1615b()) {
            Log.d("MoatJavaScriptBridge", "Starting metadata reporting loop");
        }
        this.f8134c = this.f8132a.scheduleWithFixedDelay(new C15863(this), 0, 50, TimeUnit.MILLISECONDS);
    }

    /* renamed from: e */
    private void m11706e() {
        if (this.f8134c != null) {
            if (!this.f8134c.isCancelled() && this.f8135d.mo1615b()) {
                Log.d("MoatJavaScriptBridge", "Stopping metadata reporting loop");
            }
            this.f8134c.cancel(true);
        }
    }

    /* renamed from: f */
    private void m11707f() {
        if (this.f8135d.mo1615b()) {
            Log.d("MoatJavaScriptBridge", "Starting view update loop");
        }
        this.f8133b = this.f8132a.scheduleWithFixedDelay(new C15884(this), 0, (long) this.f8135d.mo1616c(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    private void m11709g() {
        if (this.f8133b != null) {
            if (this.f8133b.isCancelled() && this.f8135d.mo1615b()) {
                Log.d("MoatJavaScriptBridge", "Stopping view update loop");
            }
            this.f8133b.cancel(true);
        }
    }
}
