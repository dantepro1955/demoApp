package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ayf.C0902a;

@bhd
/* renamed from: blt */
class blt extends WebView implements OnGlobalLayoutListener, DownloadListener, blo {
    /* renamed from: A */
    private bbh f6886A;
    /* renamed from: B */
    private bbi f6887B;
    /* renamed from: C */
    private WeakReference<OnClickListener> f6888C;
    /* renamed from: D */
    private aio f6889D;
    /* renamed from: E */
    private boolean f6890E;
    /* renamed from: F */
    private bkw f6891F;
    /* renamed from: G */
    private int f6892G = -1;
    /* renamed from: H */
    private int f6893H = -1;
    /* renamed from: I */
    private int f6894I = -1;
    /* renamed from: J */
    private int f6895J = -1;
    /* renamed from: K */
    private Map<String, bdn> f6896K;
    /* renamed from: L */
    private final WindowManager f6897L;
    /* renamed from: a */
    boolean f6898a = false;
    /* renamed from: b */
    private final C1327a f6899b;
    /* renamed from: c */
    private final Object f6900c = new Object();
    /* renamed from: d */
    private final avc f6901d;
    /* renamed from: e */
    private final zzqh f6902e;
    /* renamed from: f */
    private final akm f6903f;
    /* renamed from: g */
    private final ajx f6904g;
    /* renamed from: h */
    private blp f6905h;
    /* renamed from: i */
    private aio f6906i;
    /* renamed from: j */
    private zzeg f6907j;
    /* renamed from: k */
    private boolean f6908k;
    /* renamed from: l */
    private boolean f6909l;
    /* renamed from: m */
    private boolean f6910m;
    /* renamed from: n */
    private boolean f6911n;
    /* renamed from: o */
    private Boolean f6912o;
    /* renamed from: p */
    private int f6913p;
    /* renamed from: q */
    private boolean f6914q = true;
    /* renamed from: r */
    private String f6915r = "";
    /* renamed from: s */
    private blu f6916s;
    /* renamed from: t */
    private boolean f6917t;
    /* renamed from: u */
    private boolean f6918u;
    /* renamed from: v */
    private bbv f6919v;
    /* renamed from: w */
    private int f6920w;
    /* renamed from: x */
    private int f6921x;
    /* renamed from: y */
    private bbh f6922y;
    /* renamed from: z */
    private bbh f6923z;

    /* renamed from: blt$1 */
    class C13251 implements bcy {
        /* renamed from: a */
        final /* synthetic */ blt f6881a;

        C13251(blt blt) {
            this.f6881a = blt;
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (map != null) {
                String str = (String) map.get("height");
                if (!TextUtils.isEmpty(str)) {
                    try {
                        int parseInt = Integer.parseInt(str);
                        synchronized (this.f6881a.f6900c) {
                            if (this.f6881a.f6921x != parseInt) {
                                this.f6881a.f6921x = parseInt;
                                this.f6881a.requestLayout();
                            }
                        }
                    } catch (Throwable e) {
                        bky.m9009c("Exception occurred while getting webview content height", e);
                    }
                }
            }
        }
    }

    /* renamed from: blt$2 */
    class C13262 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ blt f6882a;

        C13262(blt blt) {
            this.f6882a = blt;
        }

        public void run() {
            super.destroy();
        }
    }

    @bhd
    /* renamed from: blt$a */
    public static class C1327a extends MutableContextWrapper {
        /* renamed from: a */
        private Activity f6883a;
        /* renamed from: b */
        private Context f6884b;
        /* renamed from: c */
        private Context f6885c;

        public C1327a(Context context) {
            super(context);
            setBaseContext(context);
        }

        /* renamed from: a */
        public Activity m9500a() {
            return this.f6883a;
        }

        /* renamed from: b */
        public Context m9501b() {
            return this.f6885c;
        }

        public Object getSystemService(String str) {
            return this.f6885c.getSystemService(str);
        }

        public void setBaseContext(Context context) {
            this.f6884b = context.getApplicationContext();
            this.f6883a = context instanceof Activity ? (Activity) context : null;
            this.f6885c = context;
            super.setBaseContext(this.f6884b);
        }

        public void startActivity(Intent intent) {
            if (this.f6883a != null) {
                this.f6883a.startActivity(intent);
                return;
            }
            intent.setFlags(268435456);
            this.f6884b.startActivity(intent);
        }
    }

    protected blt(C1327a c1327a, zzeg zzeg, boolean z, boolean z2, avc avc, zzqh zzqh, bbj bbj, akm akm, ajx ajx) {
        super(c1327a);
        this.f6899b = c1327a;
        this.f6907j = zzeg;
        this.f6910m = z;
        this.f6913p = -1;
        this.f6901d = avc;
        this.f6902e = zzqh;
        this.f6903f = akm;
        this.f6904g = ajx;
        this.f6897L = (WindowManager) getContext().getSystemService("window");
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        ako.m2343e().m9100a((Context) c1327a, zzqh.f15121a, settings);
        ako.m2345g().mo1266a(getContext(), settings);
        setDownloadListener(this);
        m9505O();
        if (aqd.m4915e()) {
            addJavascriptInterface(new blv(this), "googleAdsJsInterface");
        }
        aqd.m4911a();
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        this.f6891F = new bkw(this.f6899b.m9500a(), this, this, null);
        m9514a(bbj);
        ako.m2345g().mo1277b((Context) c1327a);
    }

    /* renamed from: L */
    private void m9502L() {
        synchronized (this.f6900c) {
            this.f6912o = ako.m2347i().m8957l();
            if (this.f6912o == null) {
                try {
                    evaluateJavascript("(function(){})()", null);
                    m9538a(Boolean.valueOf(true));
                } catch (IllegalStateException e) {
                    m9538a(Boolean.valueOf(false));
                }
            }
        }
    }

    /* renamed from: M */
    private void m9503M() {
        bbf.m7148a(this.f6887B.m7158a(), this.f6923z, "aeh2");
    }

    /* renamed from: N */
    private void m9504N() {
        bbf.m7148a(this.f6887B.m7158a(), this.f6923z, "aebb2");
    }

    /* renamed from: O */
    private void m9505O() {
        synchronized (this.f6900c) {
            if (this.f6910m || this.f6907j.f14934d) {
                int i = VERSION.SDK_INT;
                bky.m9006b("Enabling hardware acceleration on an overlay.");
                m9507Q();
            } else if (VERSION.SDK_INT < 18) {
                bky.m9006b("Disabling hardware acceleration on an AdView.");
                m9506P();
            } else {
                bky.m9006b("Enabling hardware acceleration on an AdView.");
                m9507Q();
            }
        }
    }

    /* renamed from: P */
    private void m9506P() {
        synchronized (this.f6900c) {
            if (!this.f6911n) {
                ako.m2345g().mo1270c((View) this);
            }
            this.f6911n = true;
        }
    }

    /* renamed from: Q */
    private void m9507Q() {
        synchronized (this.f6900c) {
            if (this.f6911n) {
                ako.m2345g().mo1268b((View) this);
            }
            this.f6911n = false;
        }
    }

    /* renamed from: R */
    private void m9508R() {
        synchronized (this.f6900c) {
            if (!this.f6890E) {
                this.f6890E = true;
                ako.m2347i().m8970y();
            }
        }
    }

    /* renamed from: S */
    private void m9509S() {
        synchronized (this.f6900c) {
            this.f6896K = null;
        }
    }

    /* renamed from: T */
    private void m9510T() {
        if (this.f6887B != null) {
            bbj a = this.f6887B.m7158a();
            if (a != null && ako.m2347i().m8951f() != null) {
                ako.m2347i().m8951f().m7143a(a);
            }
        }
    }

    /* renamed from: a */
    static blt m9512a(Context context, zzeg zzeg, boolean z, boolean z2, avc avc, zzqh zzqh, bbj bbj, akm akm, ajx ajx) {
        return new blt(new C1327a(context), zzeg, z, z2, avc, zzqh, bbj, akm, ajx);
    }

    /* renamed from: a */
    private void m9514a(bbj bbj) {
        m9510T();
        this.f6887B = new bbi(new bbj(true, "make_wv", this.f6907j.f14931a));
        this.f6887B.m7158a().m7163a(bbj);
        this.f6923z = bbf.m7145a(this.f6887B.m7158a());
        this.f6887B.m7159a("native:view_create", this.f6923z);
        this.f6886A = null;
        this.f6922y = null;
    }

    /* renamed from: e */
    private void m9517e(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("isVisible", z ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO);
        mo1303a("onAdVisibilityChanged", hashMap);
    }

    /* renamed from: A */
    public boolean mo1288A() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6920w > 0;
        }
        return z;
    }

    /* renamed from: B */
    public void mo1289B() {
        this.f6891F.m9276a();
    }

    /* renamed from: C */
    public void mo1290C() {
        if (this.f6886A == null) {
            this.f6886A = bbf.m7145a(this.f6887B.m7158a());
            this.f6887B.m7159a("native:view_load", this.f6886A);
        }
    }

    /* renamed from: D */
    public OnClickListener mo1291D() {
        return (OnClickListener) this.f6888C.get();
    }

    /* renamed from: E */
    public bbv mo1292E() {
        bbv bbv;
        synchronized (this.f6900c) {
            bbv = this.f6919v;
        }
        return bbv;
    }

    /* renamed from: F */
    public void mo1293F() {
        setBackgroundColor(0);
    }

    /* renamed from: G */
    public boolean m9524G() {
        if (!mo1322l().m9425b() && !mo1322l().m9426c()) {
            return false;
        }
        int i;
        int i2;
        DisplayMetrics a = ako.m2343e().m9082a(this.f6897L);
        int b = azp.m6789a().m9296b(a, a.widthPixels);
        int b2 = azp.m6789a().m9296b(a, a.heightPixels);
        Activity f = mo1316f();
        if (f == null || f.getWindow() == null) {
            i = b2;
            i2 = b;
        } else {
            int[] a2 = ako.m2343e().m9116a(f);
            i2 = azp.m6789a().m9296b(a, a2[0]);
            i = azp.m6789a().m9296b(a, a2[1]);
        }
        if (this.f6893H == b && this.f6892G == b2 && this.f6894I == i2 && this.f6895J == i) {
            return false;
        }
        boolean z = (this.f6893H == b && this.f6892G == b2) ? false : true;
        this.f6893H = b;
        this.f6892G = b2;
        this.f6894I = i2;
        this.f6895J = i;
        new bft(this).m8156a(b, b2, i2, i, a.density, this.f6897L.getDefaultDisplay().getRotation());
        return z;
    }

    /* renamed from: H */
    public void mo262H() {
        synchronized (this.f6900c) {
            this.f6898a = true;
            if (this.f6903f != null) {
                this.f6903f.mo262H();
            }
        }
    }

    /* renamed from: I */
    public void mo263I() {
        synchronized (this.f6900c) {
            this.f6898a = false;
            if (this.f6903f != null) {
                this.f6903f.mo263I();
            }
        }
    }

    /* renamed from: J */
    Boolean m9527J() {
        Boolean bool;
        synchronized (this.f6900c) {
            bool = this.f6912o;
        }
        return bool;
    }

    /* renamed from: K */
    bcy m9528K() {
        return new C13251(this);
    }

    /* renamed from: a */
    public WebView mo1294a() {
        return this;
    }

    /* renamed from: a */
    public void mo1295a(int i) {
        if (i == 0) {
            m9504N();
        }
        m9503M();
        if (this.f6887B.m7158a() != null) {
            this.f6887B.m7158a().m7165a("close_type", String.valueOf(i));
        }
        Map hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.f6902e.f15121a);
        mo1303a("onhide", hashMap);
    }

    /* renamed from: a */
    public void mo1296a(aio aio) {
        synchronized (this.f6900c) {
            this.f6906i = aio;
        }
    }

    /* renamed from: a */
    public void mo1297a(Context context) {
        this.f6899b.setBaseContext(context);
        this.f6891F.m9277a(this.f6899b.m9500a());
    }

    /* renamed from: a */
    public void mo1298a(Context context, zzeg zzeg, bbj bbj) {
        synchronized (this.f6900c) {
            this.f6891F.m9278b();
            mo1297a(context);
            this.f6906i = null;
            this.f6907j = zzeg;
            this.f6910m = false;
            this.f6908k = false;
            this.f6915r = "";
            this.f6913p = -1;
            ako.m2345g().m9166b((blo) this);
            loadUrl("about:blank");
            this.f6905h.m9436m();
            setOnTouchListener(null);
            setOnClickListener(null);
            this.f6914q = true;
            this.f6898a = false;
            this.f6916s = null;
            m9514a(bbj);
            this.f6917t = false;
            this.f6920w = 0;
            ako.m2334B().m7596a((blo) this);
            m9509S();
        }
    }

    /* renamed from: a */
    public void mo1249a(C0902a c0902a) {
        synchronized (this.f6900c) {
            this.f6917t = c0902a.f4997m;
        }
        m9517e(c0902a.f4997m);
    }

    /* renamed from: a */
    public void mo1299a(bbv bbv) {
        synchronized (this.f6900c) {
            this.f6919v = bbv;
        }
    }

    /* renamed from: a */
    public void mo1300a(blu blu) {
        synchronized (this.f6900c) {
            if (this.f6916s != null) {
                bky.m9008c("Attempt to create multiple AdWebViewVideoControllers.");
                return;
            }
            this.f6916s = blu;
        }
    }

    /* renamed from: a */
    public void mo1301a(zzeg zzeg) {
        synchronized (this.f6900c) {
            this.f6907j = zzeg;
            requestLayout();
        }
    }

    /* renamed from: a */
    void m9538a(Boolean bool) {
        synchronized (this.f6900c) {
            this.f6912o = bool;
        }
        ako.m2347i().m8932a(bool);
    }

    /* renamed from: a */
    public void mo1302a(String str) {
        synchronized (this.f6900c) {
            try {
                super.loadUrl(str);
            } catch (Throwable th) {
                ako.m2347i().m8934a(th, "AdWebViewImpl.loadUrlUnsafe");
                bky.m9009c("Could not call loadUrl. ", th);
            }
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    protected void m9540a(String str, ValueCallback<String> valueCallback) {
        synchronized (this.f6900c) {
            if (mo1333r()) {
                bky.m9011e("The webview is destroyed. Ignoring action.");
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                }
            } else {
                evaluateJavascript(str, valueCallback);
            }
        }
    }

    /* renamed from: a */
    public void mo1023a(String str, bcy bcy) {
        if (this.f6905h != null) {
            this.f6905h.m9419a(str, bcy);
        }
    }

    /* renamed from: a */
    public void mo1024a(String str, String str2) {
        m9557d(new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length()).append(str).append("(").append(str2).append(");").toString());
    }

    /* renamed from: a */
    public void mo1303a(String str, Map<String, ?> map) {
        try {
            mo1029b(str, ako.m2343e().m9095a((Map) map));
        } catch (JSONException e) {
            bky.m9011e("Could not convert parameters to JSON.");
        }
    }

    /* renamed from: a */
    public void mo1025a(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        mo1024a(str, jSONObject.toString());
    }

    /* renamed from: a */
    public void mo1304a(boolean z) {
        synchronized (this.f6900c) {
            this.f6910m = z;
            m9505O();
        }
    }

    /* renamed from: b */
    public View mo1305b() {
        return this;
    }

    /* renamed from: b */
    public void mo1306b(int i) {
        synchronized (this.f6900c) {
            this.f6913p = i;
            if (this.f6906i != null) {
                this.f6906i.m1749a(this.f6913p);
            }
        }
    }

    /* renamed from: b */
    public void mo1307b(aio aio) {
        synchronized (this.f6900c) {
            this.f6889D = aio;
        }
    }

    /* renamed from: b */
    public void mo1308b(String str) {
        synchronized (this.f6900c) {
            if (str == null) {
                str = "";
            }
            this.f6915r = str;
        }
    }

    /* renamed from: b */
    public void mo1028b(String str, bcy bcy) {
        if (this.f6905h != null) {
            this.f6905h.m9424b(str, bcy);
        }
    }

    /* renamed from: b */
    public void mo1029b(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(window.AFMA_ReceiveMessage || function() {})('");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(",");
        stringBuilder.append(jSONObject2);
        stringBuilder.append(");");
        String str2 = "Dispatching AFMA event: ";
        jSONObject2 = String.valueOf(stringBuilder.toString());
        bky.m9006b(jSONObject2.length() != 0 ? str2.concat(jSONObject2) : new String(str2));
        m9557d(stringBuilder.toString());
    }

    /* renamed from: b */
    public void mo1309b(boolean z) {
        synchronized (this.f6900c) {
            if (this.f6906i != null) {
                this.f6906i.m1756a(this.f6905h.m9425b(), z);
            } else {
                this.f6908k = z;
            }
        }
    }

    /* renamed from: c */
    public void mo1310c() {
        m9503M();
        Map hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.f6902e.f15121a);
        mo1303a("onhide", hashMap);
    }

    /* renamed from: c */
    protected void m9554c(String str) {
        synchronized (this.f6900c) {
            if (mo1333r()) {
                bky.m9011e("The webview is destroyed. Ignoring action.");
            } else {
                loadUrl(str);
            }
        }
    }

    /* renamed from: c */
    public void mo1311c(boolean z) {
        synchronized (this.f6900c) {
            this.f6914q = z;
        }
    }

    /* renamed from: d */
    public void mo1312d() {
        if (this.f6922y == null) {
            bbf.m7148a(this.f6887B.m7158a(), this.f6923z, "aes2");
            this.f6922y = bbf.m7145a(this.f6887B.m7158a());
            this.f6887B.m7159a("native:view_show", this.f6922y);
        }
        Map hashMap = new HashMap(1);
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, this.f6902e.f15121a);
        mo1303a("onshow", hashMap);
    }

    /* renamed from: d */
    protected void m9557d(String str) {
        if (aqd.m4917g()) {
            if (m9527J() == null) {
                m9502L();
            }
            if (m9527J().booleanValue()) {
                m9540a(str, null);
                return;
            }
            String str2 = "javascript:";
            String valueOf = String.valueOf(str);
            m9554c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            return;
        }
        str2 = "javascript:";
        valueOf = String.valueOf(str);
        m9554c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: d */
    public void mo1313d(boolean z) {
        synchronized (this.f6900c) {
            this.f6920w = (z ? 1 : -1) + this.f6920w;
            if (this.f6920w <= 0 && this.f6906i != null) {
                this.f6906i.m1777s();
            }
        }
    }

    public void destroy() {
        synchronized (this.f6900c) {
            m9510T();
            this.f6891F.m9278b();
            if (this.f6906i != null) {
                this.f6906i.m1748a();
                this.f6906i.mo210k();
                this.f6906i = null;
            }
            this.f6905h.m9436m();
            if (this.f6909l) {
                return;
            }
            ako.m2334B().m7596a((blo) this);
            m9509S();
            this.f6909l = true;
            bkc.m9012a("Initiating WebView self destruct sequence in 3...");
            this.f6905h.m9430g();
        }
    }

    /* renamed from: e */
    public void mo1315e() {
        Map hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(ako.m2343e().m9141h()));
        hashMap.put("app_volume", String.valueOf(ako.m2343e().m9138g()));
        hashMap.put("device_volume", String.valueOf(ako.m2343e().m9144j(getContext())));
        mo1303a("volume", hashMap);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @TargetApi(19)
    public void evaluateJavascript(String r3, ValueCallback<String> r4) {
        /*
        r2 = this;
        r1 = r2.f6900c;
        monitor-enter(r1);
        r0 = r2.mo1333r();	 Catch:{ all -> 0x001b }
        if (r0 == 0) goto L_0x0016;
    L_0x0009:
        r0 = "The webview is destroyed. Ignoring action.";
        p000.bky.m9011e(r0);	 Catch:{ all -> 0x001b }
        if (r4 == 0) goto L_0x0014;
    L_0x0010:
        r0 = 0;
        r4.onReceiveValue(r0);	 Catch:{ all -> 0x001b }
    L_0x0014:
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
    L_0x0015:
        return;
    L_0x0016:
        super.evaluateJavascript(r3, r4);	 Catch:{ all -> 0x001b }
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        goto L_0x0015;
    L_0x001b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x001b }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: blt.evaluateJavascript(java.lang.String, android.webkit.ValueCallback):void");
    }

    /* renamed from: f */
    public Activity mo1316f() {
        return this.f6899b.m9500a();
    }

    protected void finalize() throws Throwable {
        try {
            synchronized (this.f6900c) {
                if (!this.f6909l) {
                    this.f6905h.m9436m();
                    ako.m2334B().m7596a((blo) this);
                    m9509S();
                    m9508R();
                }
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public Context mo1317g() {
        return this.f6899b.m9501b();
    }

    /* renamed from: h */
    public ajx mo1318h() {
        return this.f6904g;
    }

    /* renamed from: i */
    public aio mo1319i() {
        aio aio;
        synchronized (this.f6900c) {
            aio = this.f6906i;
        }
        return aio;
    }

    /* renamed from: j */
    public aio mo1320j() {
        aio aio;
        synchronized (this.f6900c) {
            aio = this.f6889D;
        }
        return aio;
    }

    /* renamed from: k */
    public zzeg mo1321k() {
        zzeg zzeg;
        synchronized (this.f6900c) {
            zzeg = this.f6907j;
        }
        return zzeg;
    }

    /* renamed from: l */
    public blp mo1322l() {
        return this.f6905h;
    }

    public void loadData(String str, String str2, String str3) {
        synchronized (this.f6900c) {
            if (mo1333r()) {
                bky.m9011e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadData(str, str2, str3);
            }
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        synchronized (this.f6900c) {
            if (mo1333r()) {
                bky.m9011e("The webview is destroyed. Ignoring action.");
            } else {
                super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            }
        }
    }

    public void loadUrl(String str) {
        synchronized (this.f6900c) {
            if (mo1333r()) {
                bky.m9011e("The webview is destroyed. Ignoring action.");
            } else {
                try {
                    super.loadUrl(str);
                } catch (Throwable th) {
                    ako.m2347i().m8934a(th, "AdWebViewImpl.loadUrl");
                    bky.m9009c("Could not call loadUrl. ", th);
                }
            }
        }
    }

    /* renamed from: m */
    public boolean mo1326m() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6908k;
        }
        return z;
    }

    /* renamed from: n */
    public avc mo1327n() {
        return this.f6901d;
    }

    /* renamed from: o */
    public zzqh mo1328o() {
        return this.f6902e;
    }

    protected void onAttachedToWindow() {
        boolean z = true;
        synchronized (this.f6900c) {
            super.onAttachedToWindow();
            if (!mo1333r()) {
                this.f6891F.m9279c();
            }
            boolean z2 = this.f6917t;
            if (mo1322l() == null || !mo1322l().m9426c()) {
                z = z2;
            } else if (!this.f6918u) {
                OnGlobalLayoutListener d = mo1322l().m9427d();
                if (d != null) {
                    ako.m2335C().m9330a(mo1305b(), d);
                }
                OnScrollChangedListener e = mo1322l().m9428e();
                if (e != null) {
                    ako.m2335C().m9331a(mo1305b(), e);
                }
                this.f6918u = true;
            }
            m9517e(z);
        }
    }

    protected void onDetachedFromWindow() {
        synchronized (this.f6900c) {
            if (!mo1333r()) {
                this.f6891F.m9280d();
            }
            super.onDetachedFromWindow();
            if (this.f6918u && mo1322l() != null && mo1322l().m9426c() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                OnGlobalLayoutListener d = mo1322l().m9427d();
                if (d != null) {
                    ako.m2345g().mo1274a(getViewTreeObserver(), d);
                }
                OnScrollChangedListener e = mo1322l().m9428e();
                if (e != null) {
                    getViewTreeObserver().removeOnScrollChangedListener(e);
                }
                this.f6918u = false;
            }
        }
        m9517e(false);
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            ako.m2343e().m9098a(getContext(), intent);
        } catch (ActivityNotFoundException e) {
            bky.m9006b(new StringBuilder((String.valueOf(str).length() + 51) + String.valueOf(str4).length()).append("Couldn't find an Activity to view url/mimetype: ").append(str).append(" / ").append(str4).toString());
        }
    }

    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        if (!mo1333r()) {
            if (VERSION.SDK_INT != 21 || !canvas.isHardwareAccelerated() || isAttachedToWindow()) {
                super.onDraw(canvas);
                if (mo1322l() != null && mo1322l().m9437n() != null) {
                    mo1322l().m9437n().mo284a();
                }
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (((Boolean) bbb.aE.m7064c()).booleanValue()) {
            float axisValue = motionEvent.getAxisValue(9);
            float axisValue2 = motionEvent.getAxisValue(10);
            if ((motionEvent.getActionMasked() == 8 ? 1 : 0) != 0 && ((axisValue > 0.0f && !canScrollVertically(-1)) || ((axisValue < 0.0f && !canScrollVertically(1)) || ((axisValue2 > 0.0f && !canScrollHorizontally(-1)) || (axisValue2 < 0.0f && !canScrollHorizontally(1)))))) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public void onGlobalLayout() {
        boolean G = m9524G();
        aio i = mo1319i();
        if (i != null && G) {
            i.m1774p();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.SuppressLint({"DrawAllocation"})
    protected void onMeasure(int r10, int r11) {
        /*
        r9 = this;
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 8;
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = r9.f6900c;
        monitor-enter(r4);
        r1 = r9.mo1333r();	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
    L_0x0018:
        return;
    L_0x0019:
        r1 = r9.isInEditMode();	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x001f:
        r1 = r9.f6910m;	 Catch:{ all -> 0x002e }
        if (r1 != 0) goto L_0x0029;
    L_0x0023:
        r1 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r1 = r1.f14938h;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0031;
    L_0x0029:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        throw r0;
    L_0x0031:
        r1 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r1 = r1.f14939i;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x0082;
    L_0x0037:
        r0 = p000.bbb.cs;	 Catch:{ all -> 0x002e }
        r0 = r0.m7064c();	 Catch:{ all -> 0x002e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x002e }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x004b;
    L_0x0045:
        r0 = p000.aqd.m4915e();	 Catch:{ all -> 0x002e }
        if (r0 != 0) goto L_0x0050;
    L_0x004b:
        super.onMeasure(r10, r11);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0050:
        r0 = "/contentHeight";
        r1 = r9.m9528K();	 Catch:{ all -> 0x002e }
        r9.mo1023a(r0, r1);	 Catch:{ all -> 0x002e }
        r0 = "(function() {  var height = -1;  if (document.body) { height = document.body.offsetHeight;}  else if (document.documentElement) {      height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  window.googleAdsJsInterface.notify(url);  })();";
        r9.m9557d(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.f6899b;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r2 = r9.f6921x;	 Catch:{ all -> 0x002e }
        switch(r2) {
            case -1: goto L_0x007d;
            default: goto L_0x0073;
        };	 Catch:{ all -> 0x002e }
    L_0x0073:
        r2 = r9.f6921x;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r0 = r0 * r2;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
    L_0x0078:
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x007d:
        r0 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        goto L_0x0078;
    L_0x0082:
        r1 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r1 = r1.f14934d;	 Catch:{ all -> 0x002e }
        if (r1 == 0) goto L_0x00a0;
    L_0x0088:
        r0 = new android.util.DisplayMetrics;	 Catch:{ all -> 0x002e }
        r0.<init>();	 Catch:{ all -> 0x002e }
        r1 = r9.f6897L;	 Catch:{ all -> 0x002e }
        r1 = r1.getDefaultDisplay();	 Catch:{ all -> 0x002e }
        r1.getMetrics(r0);	 Catch:{ all -> 0x002e }
        r1 = r0.widthPixels;	 Catch:{ all -> 0x002e }
        r0 = r0.heightPixels;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r1, r0);	 Catch:{ all -> 0x002e }
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x00a0:
        r2 = android.view.View.MeasureSpec.getMode(r10);	 Catch:{ all -> 0x002e }
        r3 = android.view.View.MeasureSpec.getSize(r10);	 Catch:{ all -> 0x002e }
        r5 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x002e }
        r1 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x002e }
        if (r2 == r6) goto L_0x00b4;
    L_0x00b2:
        if (r2 != r8) goto L_0x014b;
    L_0x00b4:
        r2 = r3;
    L_0x00b5:
        if (r5 == r6) goto L_0x00b9;
    L_0x00b7:
        if (r5 != r8) goto L_0x00ba;
    L_0x00b9:
        r0 = r1;
    L_0x00ba:
        r5 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r5 = r5.f14936f;	 Catch:{ all -> 0x002e }
        if (r5 > r2) goto L_0x00c6;
    L_0x00c0:
        r2 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r2 = r2.f14933c;	 Catch:{ all -> 0x002e }
        if (r2 <= r0) goto L_0x0135;
    L_0x00c6:
        r0 = r9.f6899b;	 Catch:{ all -> 0x002e }
        r0 = r0.getResources();	 Catch:{ all -> 0x002e }
        r0 = r0.getDisplayMetrics();	 Catch:{ all -> 0x002e }
        r0 = r0.density;	 Catch:{ all -> 0x002e }
        r2 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r2 = r2.f14936f;	 Catch:{ all -> 0x002e }
        r2 = (float) r2;	 Catch:{ all -> 0x002e }
        r2 = r2 / r0;
        r2 = (int) r2;	 Catch:{ all -> 0x002e }
        r5 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r5 = r5.f14933c;	 Catch:{ all -> 0x002e }
        r5 = (float) r5;	 Catch:{ all -> 0x002e }
        r5 = r5 / r0;
        r5 = (int) r5;	 Catch:{ all -> 0x002e }
        r3 = (float) r3;	 Catch:{ all -> 0x002e }
        r3 = r3 / r0;
        r3 = (int) r3;	 Catch:{ all -> 0x002e }
        r1 = (float) r1;	 Catch:{ all -> 0x002e }
        r0 = r1 / r0;
        r0 = (int) r0;	 Catch:{ all -> 0x002e }
        r1 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002e }
        r6.<init>(r1);	 Catch:{ all -> 0x002e }
        r1 = "Not enough space to show ad. Needs ";
        r1 = r6.append(r1);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r5);	 Catch:{ all -> 0x002e }
        r2 = " dp, but only has ";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r1 = r1.append(r3);	 Catch:{ all -> 0x002e }
        r2 = "x";
        r1 = r1.append(r2);	 Catch:{ all -> 0x002e }
        r0 = r1.append(r0);	 Catch:{ all -> 0x002e }
        r1 = " dp.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x002e }
        r0 = r0.toString();	 Catch:{ all -> 0x002e }
        p000.bky.m9011e(r0);	 Catch:{ all -> 0x002e }
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x012d;
    L_0x0129:
        r0 = 4;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x012d:
        r0 = 0;
        r1 = 0;
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
    L_0x0132:
        monitor-exit(r4);	 Catch:{ all -> 0x002e }
        goto L_0x0018;
    L_0x0135:
        r0 = r9.getVisibility();	 Catch:{ all -> 0x002e }
        if (r0 == r7) goto L_0x013f;
    L_0x013b:
        r0 = 0;
        r9.setVisibility(r0);	 Catch:{ all -> 0x002e }
    L_0x013f:
        r0 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r0 = r0.f14936f;	 Catch:{ all -> 0x002e }
        r1 = r9.f6907j;	 Catch:{ all -> 0x002e }
        r1 = r1.f14933c;	 Catch:{ all -> 0x002e }
        r9.setMeasuredDimension(r0, r1);	 Catch:{ all -> 0x002e }
        goto L_0x0132;
    L_0x014b:
        r2 = r0;
        goto L_0x00b5;
        */
        throw new UnsupportedOperationException("Method not decompiled: blt.onMeasure(int, int):void");
    }

    public void onPause() {
        if (!mo1333r()) {
            try {
                aqd.m4911a();
                super.onPause();
            } catch (Throwable e) {
                bky.m9007b("Could not pause webview.", e);
            }
        }
    }

    public void onResume() {
        if (!mo1333r()) {
            try {
                aqd.m4911a();
                super.onResume();
            } catch (Throwable e) {
                bky.m9007b("Could not resume webview.", e);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo1322l().m9426c()) {
            synchronized (this.f6900c) {
                if (this.f6919v != null) {
                    this.f6919v.mo951a(motionEvent);
                }
            }
        } else if (this.f6901d != null) {
            this.f6901d.m5930a(motionEvent);
        }
        return mo1333r() ? false : super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public boolean mo1331p() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6910m;
        }
        return z;
    }

    /* renamed from: q */
    public int mo1332q() {
        int i;
        synchronized (this.f6900c) {
            i = this.f6913p;
        }
        return i;
    }

    /* renamed from: r */
    public boolean mo1333r() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6909l;
        }
        return z;
    }

    /* renamed from: s */
    public void mo1334s() {
        synchronized (this.f6900c) {
            bkc.m9012a("Destroying WebView!");
            m9508R();
            bkg.f6710a.post(new C13262(this));
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f6888C = new WeakReference(onClickListener);
        super.setOnClickListener(onClickListener);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof blp) {
            this.f6905h = (blp) webViewClient;
        }
    }

    public void stopLoading() {
        if (!mo1333r()) {
            try {
                super.stopLoading();
            } catch (Throwable e) {
                bky.m9007b("Could not stop loading webview.", e);
            }
        }
    }

    /* renamed from: t */
    public boolean mo1340t() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6914q;
        }
        return z;
    }

    /* renamed from: u */
    public boolean mo1341u() {
        boolean z;
        synchronized (this.f6900c) {
            z = this.f6898a;
        }
        return z;
    }

    /* renamed from: v */
    public String mo1342v() {
        String str;
        synchronized (this.f6900c) {
            str = this.f6915r;
        }
        return str;
    }

    /* renamed from: w */
    public bln mo1343w() {
        return null;
    }

    /* renamed from: x */
    public bbh mo1344x() {
        return this.f6923z;
    }

    /* renamed from: y */
    public bbi mo1345y() {
        return this.f6887B;
    }

    /* renamed from: z */
    public blu mo1346z() {
        blu blu;
        synchronized (this.f6900c) {
            blu = this.f6916s;
        }
        return blu;
    }
}
