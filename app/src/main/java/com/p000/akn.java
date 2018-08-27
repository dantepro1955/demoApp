package com.p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.azx.C0217a;

@bhd
/* renamed from: akn */
public class akn extends C0217a {
    /* renamed from: a */
    private final zzqh f1879a;
    /* renamed from: b */
    private final zzeg f1880b;
    /* renamed from: c */
    private final Future<axr> f1881c = m2299d();
    /* renamed from: d */
    private final Context f1882d;
    /* renamed from: e */
    private final C0270b f1883e;
    /* renamed from: f */
    private WebView f1884f = new WebView(this.f1882d);
    /* renamed from: g */
    private azt f1885g;
    /* renamed from: h */
    private axr f1886h;
    /* renamed from: i */
    private AsyncTask<Void, Void, String> f1887i;

    /* renamed from: akn$1 */
    class C02661 extends WebViewClient {
        /* renamed from: a */
        final /* synthetic */ akn f1871a;

        C02661(akn akn) {
            this.f1871a = akn;
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (this.f1871a.f1885g != null) {
                try {
                    this.f1871a.f1885g.mo860a(0);
                } catch (Throwable e) {
                    bky.m9009c("Could not call AdListener.onAdFailedToLoad().", e);
                }
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith(this.f1871a.m2322b())) {
                return false;
            }
            if (str.startsWith((String) bbb.cI.m7064c())) {
                if (this.f1871a.f1885g != null) {
                    try {
                        this.f1871a.f1885g.mo860a(3);
                    } catch (Throwable e) {
                        bky.m9009c("Could not call AdListener.onAdFailedToLoad().", e);
                    }
                }
                this.f1871a.m2306a(0);
                return true;
            } else if (str.startsWith((String) bbb.cJ.m7064c())) {
                if (this.f1871a.f1885g != null) {
                    try {
                        this.f1871a.f1885g.mo860a(0);
                    } catch (Throwable e2) {
                        bky.m9009c("Could not call AdListener.onAdFailedToLoad().", e2);
                    }
                }
                this.f1871a.m2306a(0);
                return true;
            } else if (str.startsWith((String) bbb.cK.m7064c())) {
                if (this.f1871a.f1885g != null) {
                    try {
                        this.f1871a.f1885g.mo862c();
                    } catch (Throwable e22) {
                        bky.m9009c("Could not call AdListener.onAdLoaded().", e22);
                    }
                }
                this.f1871a.m2306a(this.f1871a.m2321b(str));
                return true;
            } else if (str.startsWith("gmsg://")) {
                return true;
            } else {
                if (this.f1871a.f1885g != null) {
                    try {
                        this.f1871a.f1885g.mo861b();
                    } catch (Throwable e222) {
                        bky.m9009c("Could not call AdListener.onAdLeftApplication().", e222);
                    }
                }
                this.f1871a.m2300d(this.f1871a.m2296c(str));
                return true;
            }
        }
    }

    /* renamed from: akn$2 */
    class C02672 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ akn f1872a;

        C02672(akn akn) {
            this.f1872a = akn;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f1872a.f1886h != null) {
                try {
                    this.f1872a.f1886h.m6384a(motionEvent);
                } catch (Throwable e) {
                    bky.m9009c("Unable to process ad data", e);
                }
            }
            return false;
        }
    }

    /* renamed from: akn$3 */
    class C02683 implements Callable<axr> {
        /* renamed from: a */
        final /* synthetic */ akn f1873a;

        C02683(akn akn) {
            this.f1873a = akn;
        }

        /* renamed from: a */
        public axr m2282a() throws Exception {
            return new axr(this.f1873a.f1879a.f15121a, this.f1873a.f1882d, false);
        }

        public /* synthetic */ Object call() throws Exception {
            return m2282a();
        }
    }

    /* renamed from: akn$a */
    class C0269a extends AsyncTask<Void, Void, String> {
        /* renamed from: a */
        final /* synthetic */ akn f1874a;

        private C0269a(akn akn) {
            this.f1874a = akn;
        }

        /* renamed from: a */
        protected String m2283a(Void... voidArr) {
            Throwable e;
            try {
                this.f1874a.f1886h = (axr) this.f1874a.f1881c.get(((Long) bbb.cN.m7064c()).longValue(), TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                e = e2;
                bky.m9009c("Failed to load ad data", e);
            } catch (ExecutionException e3) {
                e = e3;
                bky.m9009c("Failed to load ad data", e);
            } catch (TimeoutException e4) {
                bky.m9011e("Timed out waiting for ad data");
            }
            return this.f1874a.m2305a();
        }

        /* renamed from: a */
        protected void m2284a(String str) {
            if (this.f1874a.f1884f != null && str != null) {
                this.f1874a.f1884f.loadUrl(str);
            }
        }

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m2283a((Void[]) objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m2284a((String) obj);
        }
    }

    /* renamed from: akn$b */
    static class C0270b {
        /* renamed from: a */
        private final String f1875a;
        /* renamed from: b */
        private final Map<String, String> f1876b = new TreeMap();
        /* renamed from: c */
        private String f1877c;
        /* renamed from: d */
        private String f1878d;

        public C0270b(String str) {
            this.f1875a = str;
        }

        /* renamed from: a */
        public String m2285a() {
            return this.f1878d;
        }

        /* renamed from: a */
        public void m2286a(zzec zzec, zzqh zzqh) {
            this.f1877c = zzec.f14922j.f14957n;
            Bundle bundle = zzec.f14925m != null ? zzec.f14925m.getBundle(AdMobAdapter.class.getName()) : null;
            if (bundle != null) {
                String str = (String) bbb.cM.m7064c();
                for (String str2 : bundle.keySet()) {
                    if (str.equals(str2)) {
                        this.f1878d = bundle.getString(str2);
                    } else if (str2.startsWith("csa_")) {
                        this.f1876b.put(str2.substring("csa_".length()), bundle.getString(str2));
                    }
                }
                this.f1876b.put("SDKVersion", zzqh.f15121a);
            }
        }

        /* renamed from: b */
        public String m2287b() {
            return this.f1877c;
        }

        /* renamed from: c */
        public String m2288c() {
            return this.f1875a;
        }

        /* renamed from: d */
        public Map<String, String> m2289d() {
            return this.f1876b;
        }
    }

    public akn(Context context, zzeg zzeg, String str, zzqh zzqh) {
        this.f1882d = context;
        this.f1879a = zzqh;
        this.f1880b = zzeg;
        this.f1883e = new C0270b(str);
        m2297c();
    }

    /* renamed from: c */
    private String m2296c(String str) {
        if (this.f1886h == null) {
            return str;
        }
        Uri parse = Uri.parse(str);
        try {
            parse = this.f1886h.m6385b(parse, this.f1882d);
        } catch (Throwable e) {
            bky.m9009c("Unable to process ad data", e);
        } catch (Throwable e2) {
            bky.m9009c("Unable to parse ad click url", e2);
        }
        return parse.toString();
    }

    /* renamed from: c */
    private void m2297c() {
        m2306a(0);
        this.f1884f.setVerticalScrollBarEnabled(false);
        this.f1884f.getSettings().setJavaScriptEnabled(true);
        this.f1884f.setWebViewClient(new C02661(this));
        this.f1884f.setOnTouchListener(new C02672(this));
    }

    /* renamed from: d */
    private Future<axr> m2299d() {
        return bkf.m9060a(new C02683(this));
    }

    /* renamed from: d */
    private void m2300d(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        this.f1882d.startActivity(intent);
    }

    /* renamed from: F */
    public String mo260F() throws RemoteException {
        return null;
    }

    /* renamed from: G */
    public void mo261G() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    String m2305a() {
        String valueOf;
        Uri a;
        Throwable e;
        String valueOf2;
        Builder builder = new Builder();
        builder.scheme("https://").appendEncodedPath((String) bbb.cL.m7064c());
        builder.appendQueryParameter("query", this.f1883e.m2287b());
        builder.appendQueryParameter("pubId", this.f1883e.m2288c());
        Map d = this.f1883e.m2289d();
        for (String valueOf3 : d.keySet()) {
            builder.appendQueryParameter(valueOf3, (String) d.get(valueOf3));
        }
        Uri build = builder.build();
        if (this.f1886h != null) {
            try {
                a = this.f1886h.m6383a(build, this.f1882d);
            } catch (axs e2) {
                e = e2;
                bky.m9009c("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(m2322b());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            } catch (RemoteException e3) {
                e = e3;
                bky.m9009c("Unable to process ad data", e);
                a = build;
                valueOf2 = String.valueOf(m2322b());
                valueOf3 = String.valueOf(a.getEncodedQuery());
                return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
            }
            valueOf2 = String.valueOf(m2322b());
            valueOf3 = String.valueOf(a.getEncodedQuery());
            return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
        }
        a = build;
        valueOf2 = String.valueOf(m2322b());
        valueOf3 = String.valueOf(a.getEncodedQuery());
        return new StringBuilder((String.valueOf(valueOf2).length() + 1) + String.valueOf(valueOf3).length()).append(valueOf2).append("#").append(valueOf3).toString();
    }

    /* renamed from: a */
    void m2306a(int i) {
        if (this.f1884f != null) {
            this.f1884f.setLayoutParams(new LayoutParams(-1, i));
        }
    }

    /* renamed from: a */
    public void mo226a(azs azs) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo227a(azt azt) throws RemoteException {
        this.f1885g = azt;
    }

    /* renamed from: a */
    public void mo228a(azz azz) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo229a(bab bab) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo230a(bbn bbn) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo231a(bgc bgc) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo232a(bgg bgg, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo233a(biq biq) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo235a(zzeg zzeg) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* renamed from: a */
    public void mo236a(zzfc zzfc) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo237a(zzft zzft) {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo238a(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: a */
    public void mo241a(boolean z) throws RemoteException {
    }

    /* renamed from: a */
    public boolean mo242a(zzec zzec) throws RemoteException {
        aoi.m4680a(this.f1884f, (Object) "This Search Ad has already been torn down");
        this.f1883e.m2286a(zzec, this.f1879a);
        this.f1887i = new C0269a().execute(new Void[0]);
        return true;
    }

    /* renamed from: b */
    int m2321b(String str) {
        int i = 0;
        Object queryParameter = Uri.parse(str).getQueryParameter("height");
        if (!TextUtils.isEmpty(queryParameter)) {
            try {
                i = azp.m6789a().m9283a(this.f1882d, Integer.parseInt(queryParameter));
            } catch (NumberFormatException e) {
            }
        }
        return i;
    }

    /* renamed from: b */
    String m2322b() {
        String str;
        CharSequence a = this.f1883e.m2285a();
        if (TextUtils.isEmpty(a)) {
            str = "www.google.com";
        } else {
            CharSequence charSequence = a;
        }
        String valueOf = String.valueOf("https://");
        String str2 = (String) bbb.cL.m7064c();
        return new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str).length()) + String.valueOf(str2).length()).append(valueOf).append(str).append(str2).toString();
    }

    /* renamed from: h */
    public void mo245h() throws RemoteException {
        aoi.m4687b("destroy must be called on the main UI thread.");
        this.f1887i.cancel(true);
        this.f1881c.cancel(true);
        this.f1884f.destroy();
        this.f1884f = null;
    }

    /* renamed from: i */
    public aqq mo246i() throws RemoteException {
        aoi.m4687b("getAdFrame must be called on the main UI thread.");
        return aqr.m4967a(this.f1884f);
    }

    /* renamed from: j */
    public zzeg mo247j() throws RemoteException {
        return this.f1880b;
    }

    /* renamed from: k */
    public boolean mo248k() throws RemoteException {
        return false;
    }

    /* renamed from: l */
    public void mo249l() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    /* renamed from: m */
    public void mo250m() throws RemoteException {
        aoi.m4687b("pause must be called on the main UI thread.");
    }

    /* renamed from: n */
    public void mo251n() throws RemoteException {
        aoi.m4687b("resume must be called on the main UI thread.");
    }

    /* renamed from: o */
    public void mo252o() throws RemoteException {
    }

    /* renamed from: p */
    public boolean mo254p() throws RemoteException {
        return false;
    }

    /* renamed from: q */
    public baf mo255q() {
        return null;
    }
}
