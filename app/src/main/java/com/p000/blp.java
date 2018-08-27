package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.internal.zzdp;
import com.google.android.gms.internal.zzds;
import com.inmobi.commons.analytics.iat.impl.AdTrackerConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

@bhd
/* renamed from: blp */
public class blp extends WebViewClient {
    /* renamed from: c */
    private static final String[] f6832c = new String[]{"UNKNOWN", "HOST_LOOKUP", "UNSUPPORTED_AUTH_SCHEME", "AUTHENTICATION", "PROXY_AUTHENTICATION", "CONNECT", "IO", "TIMEOUT", "REDIRECT_LOOP", "UNSUPPORTED_SCHEME", "FAILED_SSL_HANDSHAKE", "BAD_URL", "FILE", "FILE_NOT_FOUND", "TOO_MANY_REQUESTS"};
    /* renamed from: d */
    private static final String[] f6833d = new String[]{"NOT_YET_VALID", "EXPIRED", "ID_MISMATCH", "UNTRUSTED", "DATE_INVALID", "INVALID"};
    /* renamed from: A */
    private boolean f6834A;
    /* renamed from: B */
    private boolean f6835B;
    /* renamed from: C */
    private boolean f6836C;
    /* renamed from: D */
    private int f6837D;
    /* renamed from: a */
    protected blo f6838a;
    /* renamed from: b */
    protected bjk f6839b;
    /* renamed from: e */
    private final HashMap<String, List<bcy>> f6840e;
    /* renamed from: f */
    private final Object f6841f;
    /* renamed from: g */
    private azd f6842g;
    /* renamed from: h */
    private air f6843h;
    /* renamed from: i */
    private C0197a f6844i;
    /* renamed from: j */
    private C1188b f6845j;
    /* renamed from: k */
    private bct f6846k;
    /* renamed from: l */
    private C0235c f6847l;
    /* renamed from: m */
    private boolean f6848m;
    /* renamed from: n */
    private bda f6849n;
    /* renamed from: o */
    private bdc f6850o;
    /* renamed from: p */
    private boolean f6851p;
    /* renamed from: q */
    private boolean f6852q;
    /* renamed from: r */
    private OnGlobalLayoutListener f6853r;
    /* renamed from: s */
    private OnScrollChangedListener f6854s;
    /* renamed from: t */
    private boolean f6855t;
    /* renamed from: u */
    private aix f6856u;
    /* renamed from: v */
    private final bfs f6857v;
    /* renamed from: w */
    private ajy f6858w;
    /* renamed from: x */
    private bfo f6859x;
    /* renamed from: y */
    private bfu f6860y;
    /* renamed from: z */
    private C0233e f6861z;

    /* renamed from: blp$a */
    public interface C0197a {
        /* renamed from: a */
        void mo193a(blo blo, boolean z);
    }

    /* renamed from: blp$e */
    public interface C0233e {
        /* renamed from: a */
        void mo284a();
    }

    /* renamed from: blp$c */
    public interface C0235c {
        /* renamed from: a */
        void mo285a();
    }

    /* renamed from: blp$b */
    public interface C1188b {
        /* renamed from: a */
        void mo1185a(blo blo);
    }

    /* renamed from: blp$1 */
    class C13201 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blp f6828a;

        C13201(blp blp) {
            this.f6828a = blp;
        }

        public void run() {
            if (this.f6828a.f6839b != null) {
                bjk bjk = this.f6828a.f6839b;
                blo blo = this.f6828a.f6838a;
            }
        }
    }

    /* renamed from: blp$2 */
    class C13212 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blp f6829a;

        C13212(blp blp) {
            this.f6829a = blp;
        }

        public void run() {
            this.f6829a.f6838a.mo1289B();
            aio i = this.f6829a.f6838a.mo1319i();
            if (i != null) {
                i.m1771m();
            }
            if (this.f6829a.f6847l != null) {
                this.f6829a.f6847l.mo285a();
                this.f6829a.f6847l = null;
            }
        }
    }

    /* renamed from: blp$d */
    static class C1322d implements air {
        /* renamed from: a */
        private blo f6830a;
        /* renamed from: b */
        private air f6831b;

        public C1322d(blo blo, air air) {
            this.f6830a = blo;
            this.f6831b = air;
        }

        /* renamed from: a */
        public void mo264a() {
            this.f6831b.mo264a();
            this.f6830a.mo1310c();
        }

        /* renamed from: b */
        public void mo270b() {
        }

        /* renamed from: c */
        public void mo272c() {
        }

        /* renamed from: d */
        public void mo273d() {
            this.f6831b.mo273d();
            this.f6830a.mo1312d();
        }
    }

    public blp(blo blo, boolean z) {
        this(blo, z, new bfs(blo, blo.mo1317g(), new bas(blo.getContext())), null);
    }

    blp(blo blo, boolean z, bfs bfs, bfo bfo) {
        this.f6840e = new HashMap();
        this.f6841f = new Object();
        this.f6848m = false;
        this.f6838a = blo;
        this.f6851p = z;
        this.f6857v = bfs;
        this.f6859x = bfo;
    }

    /* renamed from: a */
    private String m9402a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() != null ? parse.getHost() : "";
    }

    /* renamed from: a */
    private void m9403a(Context context, String str, String str2, String str3) {
        if (((Boolean) bbb.bs.m7064c()).booleanValue()) {
            Bundle bundle = new Bundle();
            bundle.putString(AdTrackerConstants.ERROR, str);
            bundle.putString("code", str2);
            bundle.putString("host", m9402a(str3));
            ako.m2343e().m9101a(context, this.f6838a.mo1328o().f15121a, "gmob-apps", bundle, true);
        }
    }

    /* renamed from: b */
    private static boolean m9404b(Uri uri) {
        String scheme = uri.getScheme();
        return "http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme);
    }

    /* renamed from: p */
    private void m9405p() {
        if (this.f6845j != null) {
            this.f6845j.mo1185a(this.f6838a);
            this.f6845j = null;
        }
    }

    /* renamed from: a */
    public ajy m9406a() {
        return this.f6858w;
    }

    /* renamed from: a */
    public void m9407a(int i, int i2) {
        if (this.f6859x != null) {
            this.f6859x.m8176c(i, i2);
        }
    }

    /* renamed from: a */
    public void m9408a(int i, int i2, boolean z) {
        this.f6857v.m8199a(i, i2);
        if (this.f6859x != null) {
            this.f6859x.m8170a(i, i2, z);
        }
    }

    /* renamed from: a */
    public void m9409a(Uri uri) {
        String path = uri.getPath();
        List<bcy> list = (List) this.f6840e.get(path);
        if (list != null) {
            Map a = ako.m2343e().m9092a(uri);
            if (bky.m9005a(2)) {
                String str = "Received GMSG: ";
                path = String.valueOf(path);
                bkc.m9012a(path.length() != 0 ? str.concat(path) : new String(str));
                for (String path2 : a.keySet()) {
                    str = (String) a.get(path2);
                    bkc.m9012a(new StringBuilder((String.valueOf(path2).length() + 4) + String.valueOf(str).length()).append("  ").append(path2).append(": ").append(str).toString());
                }
            }
            for (bcy a2 : list) {
                a2.mo277a(this.f6838a, a);
            }
            return;
        }
        String valueOf = String.valueOf(uri);
        bkc.m9012a(new StringBuilder(String.valueOf(valueOf).length() + 32).append("No GMSG handler found for GMSG: ").append(valueOf).toString());
    }

    /* renamed from: a */
    public final void m9410a(OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        synchronized (this.f6841f) {
            this.f6852q = true;
            this.f6838a.mo1289B();
            this.f6853r = onGlobalLayoutListener;
            this.f6854s = onScrollChangedListener;
        }
    }

    /* renamed from: a */
    public void m9411a(azd azd, air air, bct bct, aix aix, boolean z, bda bda, bdc bdc, ajy ajy, bfu bfu, bjk bjk) {
        if (ajy == null) {
            ajy = new ajy(this.f6838a.getContext());
        }
        this.f6859x = new bfo(this.f6838a, bfu);
        this.f6839b = bjk;
        m9419a("/appEvent", new bcs(bct));
        m9419a("/backButton", bcx.f5604l);
        m9419a("/refresh", bcx.f5605m);
        m9419a("/canOpenURLs", bcx.f5594b);
        m9419a("/canOpenIntents", bcx.f5595c);
        m9419a("/click", bcx.f5596d);
        m9419a("/close", bcx.f5597e);
        m9419a("/customClose", bcx.f5599g);
        m9419a("/instrument", bcx.f5610r);
        m9419a("/delayPageLoaded", bcx.f5612t);
        m9419a("/delayPageClosed", bcx.f5613u);
        m9419a("/getLocationInfo", bcx.f5614v);
        m9419a("/httpTrack", bcx.f5600h);
        m9419a("/log", bcx.f5601i);
        m9419a("/mraid", new bdf(ajy, this.f6859x));
        m9419a("/mraidLoaded", this.f6857v);
        m9419a("/open", new bdg(bda, ajy, this.f6859x));
        m9419a("/precache", bcx.f5609q);
        m9419a("/touch", bcx.f5603k);
        m9419a("/video", bcx.f5606n);
        m9419a("/videoMeta", bcx.f5607o);
        m9419a("/appStreaming", bcx.f5598f);
        if (ako.m2336D().m8879a()) {
            m9419a("/logScionEvent", bcx.f5608p);
        }
        if (bdc != null) {
            m9419a("/setInterstitialProperties", new bdb(bdc));
        }
        this.f6842g = azd;
        this.f6843h = air;
        this.f6846k = bct;
        this.f6849n = bda;
        this.f6856u = aix;
        this.f6858w = ajy;
        this.f6860y = bfu;
        this.f6850o = bdc;
        m9420a(z);
    }

    /* renamed from: a */
    public void m9412a(blo blo) {
        this.f6838a = blo;
    }

    /* renamed from: a */
    public void m9413a(C0197a c0197a) {
        this.f6844i = c0197a;
    }

    /* renamed from: a */
    public void m9414a(C1188b c1188b) {
        this.f6845j = c1188b;
    }

    /* renamed from: a */
    public void m9415a(C0235c c0235c) {
        this.f6847l = c0235c;
    }

    /* renamed from: a */
    public void m9416a(C0233e c0233e) {
        this.f6861z = c0233e;
    }

    /* renamed from: a */
    public void m9417a(AdOverlayInfoParcel adOverlayInfoParcel) {
        boolean z = false;
        boolean b = this.f6859x != null ? this.f6859x.m8175b() : false;
        aip c = ako.m2341c();
        Context context = this.f6838a.getContext();
        if (!b) {
            z = true;
        }
        c.m1779a(context, adOverlayInfoParcel, z);
        if (this.f6839b != null && adOverlayInfoParcel.f14453l == null && adOverlayInfoParcel.f14442a != null) {
            String str = adOverlayInfoParcel.f14442a.f14459b;
        }
    }

    /* renamed from: a */
    public final void m9418a(zzc zzc) {
        air air = null;
        boolean p = this.f6838a.mo1331p();
        azd azd = (!p || this.f6838a.mo1321k().f14934d) ? this.f6842g : null;
        if (!p) {
            air = this.f6843h;
        }
        m9417a(new AdOverlayInfoParcel(zzc, azd, air, this.f6856u, this.f6838a.mo1328o()));
    }

    /* renamed from: a */
    public void m9419a(String str, bcy bcy) {
        synchronized (this.f6841f) {
            List list = (List) this.f6840e.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList();
                this.f6840e.put(str, list);
            }
            list.add(bcy);
        }
    }

    /* renamed from: a */
    public void m9420a(boolean z) {
        this.f6848m = z;
    }

    /* renamed from: a */
    public final void m9421a(boolean z, int i) {
        azd azd = (!this.f6838a.mo1331p() || this.f6838a.mo1321k().f14934d) ? this.f6842g : null;
        m9417a(new AdOverlayInfoParcel(azd, this.f6843h, this.f6856u, this.f6838a, z, i, this.f6838a.mo1328o()));
    }

    /* renamed from: a */
    public final void m9422a(boolean z, int i, String str) {
        air air = null;
        boolean p = this.f6838a.mo1331p();
        azd azd = (!p || this.f6838a.mo1321k().f14934d) ? this.f6842g : null;
        if (!p) {
            air = new C1322d(this.f6838a, this.f6843h);
        }
        m9417a(new AdOverlayInfoParcel(azd, air, this.f6846k, this.f6856u, this.f6838a, z, i, str, this.f6838a.mo1328o(), this.f6849n));
    }

    /* renamed from: a */
    public final void m9423a(boolean z, int i, String str, String str2) {
        boolean p = this.f6838a.mo1331p();
        azd azd = (!p || this.f6838a.mo1321k().f14934d) ? this.f6842g : null;
        m9417a(new AdOverlayInfoParcel(azd, p ? null : new C1322d(this.f6838a, this.f6843h), this.f6846k, this.f6856u, this.f6838a, z, i, str, str2, this.f6838a.mo1328o(), this.f6849n));
    }

    /* renamed from: b */
    public void m9424b(String str, bcy bcy) {
        synchronized (this.f6841f) {
            List list = (List) this.f6840e.get(str);
            if (list == null) {
                return;
            }
            list.remove(bcy);
        }
    }

    /* renamed from: b */
    public boolean m9425b() {
        boolean z;
        synchronized (this.f6841f) {
            z = this.f6851p;
        }
        return z;
    }

    /* renamed from: c */
    public boolean m9426c() {
        boolean z;
        synchronized (this.f6841f) {
            z = this.f6852q;
        }
        return z;
    }

    /* renamed from: d */
    public OnGlobalLayoutListener m9427d() {
        OnGlobalLayoutListener onGlobalLayoutListener;
        synchronized (this.f6841f) {
            onGlobalLayoutListener = this.f6853r;
        }
        return onGlobalLayoutListener;
    }

    /* renamed from: e */
    public OnScrollChangedListener m9428e() {
        OnScrollChangedListener onScrollChangedListener;
        synchronized (this.f6841f) {
            onScrollChangedListener = this.f6854s;
        }
        return onScrollChangedListener;
    }

    /* renamed from: f */
    public boolean m9429f() {
        boolean z;
        synchronized (this.f6841f) {
            z = this.f6855t;
        }
        return z;
    }

    /* renamed from: g */
    public void m9430g() {
        synchronized (this.f6841f) {
            bkc.m9012a("Loading blank page in WebView, 2...");
            this.f6834A = true;
            this.f6838a.mo1302a("about:blank");
        }
    }

    /* renamed from: h */
    public void m9431h() {
        if (this.f6839b != null) {
            bkg.f6710a.post(new C13201(this));
        }
    }

    /* renamed from: i */
    public void m9432i() {
        synchronized (this.f6841f) {
            this.f6855t = true;
        }
        this.f6837D++;
        m9435l();
    }

    /* renamed from: j */
    public void m9433j() {
        this.f6837D--;
        m9435l();
    }

    /* renamed from: k */
    public void m9434k() {
        this.f6836C = true;
        m9435l();
    }

    /* renamed from: l */
    public final void m9435l() {
        if (this.f6844i != null && ((this.f6835B && this.f6837D <= 0) || this.f6836C)) {
            this.f6844i.mo193a(this.f6838a, !this.f6836C);
            this.f6844i = null;
        }
        this.f6838a.mo1290C();
    }

    /* renamed from: m */
    public final void m9436m() {
        if (this.f6839b != null) {
            this.f6839b = null;
        }
        synchronized (this.f6841f) {
            this.f6840e.clear();
            this.f6842g = null;
            this.f6843h = null;
            this.f6844i = null;
            this.f6845j = null;
            this.f6846k = null;
            this.f6848m = false;
            this.f6851p = false;
            this.f6852q = false;
            this.f6855t = false;
            this.f6849n = null;
            this.f6856u = null;
            this.f6847l = null;
            if (this.f6859x != null) {
                this.f6859x.m8172a(true);
                this.f6859x = null;
            }
        }
    }

    /* renamed from: n */
    public C0233e m9437n() {
        return this.f6861z;
    }

    /* renamed from: o */
    public final void m9438o() {
        synchronized (this.f6841f) {
            this.f6848m = false;
            this.f6851p = true;
            ako.m2343e().m9106a(new C13212(this));
        }
    }

    public final void onLoadResource(WebView webView, String str) {
        String str2 = "Loading resource: ";
        String valueOf = String.valueOf(str);
        bkc.m9012a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m9409a(parse);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f6841f) {
            if (this.f6834A) {
                bkc.m9012a("Blank page loaded, 1...");
                this.f6838a.mo1334s();
                return;
            }
            this.f6835B = true;
            m9405p();
            m9435l();
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String valueOf = (i >= 0 || (-i) - 1 >= f6832c.length) ? String.valueOf(i) : f6832c[(-i) - 1];
        m9403a(this.f6838a.getContext(), "http_err", valueOf, str2);
        super.onReceivedError(webView, i, str, str2);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslError != null) {
            int primaryError = sslError.getPrimaryError();
            String valueOf = (primaryError < 0 || primaryError >= f6833d.length) ? String.valueOf(primaryError) : f6833d[primaryError];
            m9403a(this.f6838a.getContext(), "ssl_err", valueOf, ako.m2345g().mo1271a(sslError));
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            zzds a = zzds.m19663a(str);
            if (a == null) {
                return null;
            }
            zzdp a2 = ako.m2348j().m6673a(a);
            return (a2 == null || !a2.m19659a()) ? null : new WebResourceResponse("", "", a2.m19660b());
        } catch (Throwable th) {
            ako.m2347i().m8934a(th, "AdWebViewClient.shouldInterceptRequest");
            return null;
        }
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 222:
                return true;
            default:
                return false;
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = "AdWebView shouldOverrideUrlLoading: ";
        String valueOf = String.valueOf(str);
        bkc.m9012a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            m9409a(parse);
        } else if (this.f6848m && webView == this.f6838a.mo1294a() && blp.m9404b(parse)) {
            if (this.f6842g != null && ((Boolean) bbb.aq.m7064c()).booleanValue()) {
                this.f6842g.onAdClicked();
                this.f6842g = null;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } else if (this.f6838a.mo1294a().willNotDraw()) {
            str2 = "AdWebView unable to handle URL: ";
            valueOf = String.valueOf(str);
            bky.m9011e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else {
            Uri uri;
            try {
                avc n = this.f6838a.mo1327n();
                if (n != null && n.m5936c(parse)) {
                    parse = n.m5928a(parse, this.f6838a.getContext(), this.f6838a.mo1305b());
                }
                uri = parse;
            } catch (avd e) {
                String str3 = "Unable to append parameter to URL: ";
                str2 = String.valueOf(str);
                bky.m9011e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                uri = parse;
            }
            if (this.f6858w == null || this.f6858w.m2068b()) {
                m9418a(new zzc("android.intent.action.VIEW", uri.toString(), null, null, null, null, null));
            } else {
                this.f6858w.m2067a(str);
            }
        }
        return true;
    }
}
