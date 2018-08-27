package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.stetho.server.http.HttpStatus;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MoatWebView */
/* renamed from: byf */
class byf {
    /* renamed from: a */
    protected final bxr f8177a;
    /* renamed from: b */
    protected final byj f8178b;
    /* renamed from: c */
    protected bym f8179c;
    /* renamed from: d */
    private final String f8180d;
    /* renamed from: e */
    private final String f8181e = String.format("_moatTracker%d", new Object[]{Integer.valueOf((int) (Math.random() * 1.0E8d))});
    /* renamed from: f */
    private WeakReference<Context> f8182f;
    /* renamed from: g */
    private WeakReference<View> f8183g;
    /* renamed from: h */
    private WebView f8184h;
    /* renamed from: i */
    private boolean f8185i = false;
    /* renamed from: j */
    private boolean f8186j;
    /* renamed from: k */
    private final LinkedList<String> f8187k = new LinkedList();

    /* compiled from: MoatWebView */
    /* renamed from: byf$1 */
    class C15921 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ byf f8176a;

        C15921(byf byf) {
            this.f8176a = byf;
        }

        public void onPageFinished(WebView webView, String str) {
            if (!this.f8176a.f8185i) {
                try {
                    this.f8176a.f8185i = true;
                    this.f8176a.f8179c = new byn((View) this.f8176a.f8183g.get(), this.f8176a.f8184h, true, this.f8176a.f8177a, this.f8176a.f8178b);
                    this.f8176a.f8179c.mo1625c();
                    this.f8176a.m11739a();
                } catch (Exception e) {
                    byt.m11829a(e);
                }
            }
        }
    }

    byf(String str, byj byj, bxr bxr) {
        this.f8180d = str;
        this.f8178b = byj;
        this.f8177a = bxr;
        this.f8182f = new WeakReference(bxr.mo1595c());
    }

    /* renamed from: a */
    public void m11740a(View view, Map<String, String> map, Integer num, Integer num2, Integer num3) throws byu {
        this.f8183g = new WeakReference(view);
        this.f8184h = new WebView((Context) this.f8182f.get());
        WebSettings settings = this.f8184h.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSaveFormData(false);
        if (VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(1);
        }
        this.f8184h.setWebViewClient(new C15921(this));
        JSONObject jSONObject = new JSONObject(map);
        this.f8184h.loadData(String.format("<html><head></head><body><div id=\"%s\" style=\"width: %dpx; height: %dpx;\"></div><script>(function initMoatTracking(apiname, pcode, ids, duration) {var events = [];window[pcode + '_moatElToTrack'] = document.getElementById('%s');var moatapi = {'dropTime':%d,'adData': {'ids': ids, 'duration': duration, 'url': 'n/a'},'dispatchEvent': function(ev) {if (this.sendEvent) {if (events) { events.push(ev); ev = events; events = false; }this.sendEvent(ev);} else {events.push(ev);}},'dispatchMany': function(evs){for (var i=0, l=evs.length; i<l; i++) {this.dispatchEvent(evs[i]);}}};Object.defineProperty(window, apiname, {'value': moatapi});var s = document.createElement('script');s.src = 'https://z.moatads.com/' + pcode + '/moatvideo.js?' + apiname + '#' + apiname;document.body.appendChild(s);})('%s', '%s', %s, %s);</script></body></html>", new Object[]{"mianahwvc", num, num2, "mianahwvc", Long.valueOf(System.currentTimeMillis()), this.f8181e, this.f8180d, jSONObject.toString(), num3}), AudienceNetworkActivity.WEBVIEW_MIME_TYPE, null);
    }

    /* renamed from: a */
    public void m11742a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        if (!this.f8185i || this.f8184h == null) {
            this.f8187k.add(jSONObject2);
            return;
        }
        this.f8184h.loadUrl(String.format("javascript:%s.dispatchEvent(%s);", new Object[]{this.f8181e, jSONObject2}));
    }

    /* renamed from: a */
    void m11739a() throws byu {
        int i;
        int i2;
        if (this.f8187k.size() >= HttpStatus.HTTP_OK) {
            LinkedList linkedList = new LinkedList();
            for (i = 0; i < 10; i++) {
                linkedList.addFirst((String) this.f8187k.removeFirst());
            }
            i = Math.min(Math.min(this.f8187k.size() / HttpStatus.HTTP_OK, 10) + HttpStatus.HTTP_OK, this.f8187k.size());
            for (i2 = 0; i2 < i; i2++) {
                this.f8187k.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                this.f8187k.addFirst((String) it.next());
            }
        }
        i2 = 0;
        while (!this.f8187k.isEmpty() && i2 < HttpStatus.HTTP_OK) {
            i2++;
            String str = "javascript:%s.dispatchMany([%s])";
            StringBuilder stringBuilder = new StringBuilder();
            i = 1;
            while (!this.f8187k.isEmpty() && i2 < HttpStatus.HTTP_OK) {
                int i3 = i2 + 1;
                String str2 = (String) this.f8187k.getFirst();
                if (stringBuilder.length() + str2.length() > AdError.SERVER_ERROR_CODE) {
                    i2 = i3;
                    break;
                }
                this.f8187k.removeFirst();
                if (i != 0) {
                    i = 0;
                } else {
                    stringBuilder.append(",");
                }
                stringBuilder.append(str2);
                i2 = i3;
            }
            m11741a(String.format(str, new Object[]{this.f8181e, stringBuilder.toString()}));
        }
        this.f8187k.clear();
    }

    /* renamed from: a */
    void m11741a(String str) {
        this.f8184h.loadUrl(str);
    }

    /* renamed from: b */
    public void m11743b() {
        if (!this.f8186j) {
            if (this.f8179c != null) {
                this.f8179c.mo1626d();
                this.f8179c = null;
            }
            if (this.f8184h != null) {
                this.f8184h.loadUrl("about:blank");
                this.f8184h.destroy();
                this.f8184h = null;
            }
            this.f8186j = true;
        }
    }
}
