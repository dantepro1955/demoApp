package com.p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.common.util.ByteConstants;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.overlay.zzp.C3284a;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.util.Collections;
import java.util.Map;
import p000.bfw.C0205a;
import p000.blp.C0197a;

@bhd
/* renamed from: aio */
public class aio extends C0205a implements ajc {
    /* renamed from: a */
    static final int f1595a = Color.argb(0, 0, 0, 0);
    /* renamed from: b */
    AdOverlayInfoParcel f1596b;
    /* renamed from: c */
    blo f1597c;
    /* renamed from: d */
    C0202c f1598d;
    /* renamed from: e */
    zzp f1599e;
    /* renamed from: f */
    boolean f1600f = false;
    /* renamed from: g */
    FrameLayout f1601g;
    /* renamed from: h */
    CustomViewCallback f1602h;
    /* renamed from: i */
    boolean f1603i = false;
    /* renamed from: j */
    boolean f1604j = false;
    /* renamed from: k */
    C0201b f1605k;
    /* renamed from: l */
    boolean f1606l = false;
    /* renamed from: m */
    int f1607m = 0;
    /* renamed from: n */
    aiu f1608n;
    /* renamed from: o */
    private final Activity f1609o;
    /* renamed from: p */
    private final Object f1610p = new Object();
    /* renamed from: q */
    private Runnable f1611q;
    /* renamed from: r */
    private boolean f1612r;
    /* renamed from: s */
    private boolean f1613s;
    /* renamed from: t */
    private boolean f1614t = false;
    /* renamed from: u */
    private boolean f1615u = false;
    /* renamed from: v */
    private boolean f1616v = true;

    /* renamed from: aio$1 */
    class C01981 implements C0197a {
        C01981(aio aio) {
        }

        /* renamed from: a */
        public void mo193a(blo blo, boolean z) {
            blo.mo1312d();
        }
    }

    /* renamed from: aio$2 */
    class C01992 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ aio f1582a;

        C01992(aio aio) {
            this.f1582a = aio;
        }

        public void run() {
            this.f1582a.m1773o();
        }
    }

    @bhd
    /* renamed from: aio$a */
    static final class C0200a extends Exception {
        public C0200a(String str) {
            super(str);
        }
    }

    @bhd
    /* renamed from: aio$b */
    static class C0201b extends RelativeLayout {
        /* renamed from: a */
        bkj f1583a;
        /* renamed from: b */
        boolean f1584b;

        public C0201b(Context context, String str, String str2) {
            super(context);
            this.f1583a = new bkj(context, str);
            this.f1583a.m9216b(str2);
        }

        /* renamed from: a */
        void m1721a() {
            this.f1584b = true;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.f1584b) {
                this.f1583a.m9214a(motionEvent);
            }
            return false;
        }
    }

    @bhd
    /* renamed from: aio$c */
    public static class C0202c {
        /* renamed from: a */
        public final int f1585a;
        /* renamed from: b */
        public final LayoutParams f1586b;
        /* renamed from: c */
        public final ViewGroup f1587c;
        /* renamed from: d */
        public final Context f1588d;

        public C0202c(blo blo) throws C0200a {
            this.f1586b = blo.getLayoutParams();
            ViewParent parent = blo.getParent();
            this.f1588d = blo.mo1317g();
            if (parent == null || !(parent instanceof ViewGroup)) {
                throw new C0200a("Could not get the parent of the WebView for an overlay.");
            }
            this.f1587c = (ViewGroup) parent;
            this.f1585a = this.f1587c.indexOfChild(blo.mo1305b());
            this.f1587c.removeView(blo.mo1305b());
            blo.mo1304a(true);
        }
    }

    @bhd
    /* renamed from: aio$d */
    class C0204d extends bkb {
        /* renamed from: a */
        final /* synthetic */ aio f1594a;

        private C0204d(aio aio) {
            this.f1594a = aio;
        }

        /* renamed from: a */
        public void mo196a() {
            Bitmap a = ako.m2364z().m9261a(Integer.valueOf(this.f1594a.f1596b.f14457p.f14530f));
            if (a != null) {
                final Drawable a2 = ako.m2345g().mo1275a(this.f1594a.f1609o, a, this.f1594a.f1596b.f14457p.f14528d, this.f1594a.f1596b.f14457p.f14529e);
                bkg.f6710a.post(new Runnable(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0204d f1590b;

                    public void run() {
                        this.f1590b.f1594a.f1609o.getWindow().setBackgroundDrawable(a2);
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo197b() {
        }
    }

    public aio(Activity activity) {
        this.f1609o = activity;
        this.f1608n = new aja();
    }

    /* renamed from: a */
    public void m1748a() {
        this.f1607m = 2;
        this.f1609o.finish();
    }

    /* renamed from: a */
    public void m1749a(int i) {
        this.f1609o.setRequestedOrientation(i);
    }

    /* renamed from: a */
    public void mo198a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo199a(Bundle bundle) {
        boolean z = false;
        this.f1609o.requestWindowFeature(1);
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        }
        this.f1603i = z;
        try {
            this.f1596b = AdOverlayInfoParcel.m19287a(this.f1609o.getIntent());
            if (this.f1596b == null) {
                throw new C0200a("Could not get info for ad overlay.");
            }
            if (this.f1596b.f14454m.f15123c > 7500000) {
                this.f1607m = 3;
            }
            if (this.f1609o.getIntent() != null) {
                this.f1616v = this.f1609o.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.f1596b.f14457p != null) {
                this.f1604j = this.f1596b.f14457p.f14525a;
            } else {
                this.f1604j = false;
            }
            if (((Boolean) bbb.bU.m7064c()).booleanValue() && this.f1604j && this.f1596b.f14457p.f14530f != -1) {
                new C0204d().mo195d();
            }
            if (bundle == null) {
                if (this.f1596b.f14444c != null && this.f1616v) {
                    this.f1596b.f14444c.mo273d();
                }
                if (!(this.f1596b.f14452k == 1 || this.f1596b.f14443b == null)) {
                    this.f1596b.f14443b.onAdClicked();
                }
            }
            this.f1605k = new C0201b(this.f1609o, this.f1596b.f14456o, this.f1596b.f14454m.f15121a);
            this.f1605k.setId(1000);
            switch (this.f1596b.f14452k) {
                case 1:
                    m1760b(false);
                    return;
                case 2:
                    this.f1598d = new C0202c(this.f1596b.f14445d);
                    m1760b(false);
                    return;
                case 3:
                    m1760b(true);
                    return;
                case 4:
                    if (this.f1603i) {
                        this.f1607m = 3;
                        this.f1609o.finish();
                        return;
                    } else if (!ako.m2340b().m1703a(this.f1609o, this.f1596b.f14442a, this.f1596b.f14450i)) {
                        this.f1607m = 3;
                        this.f1609o.finish();
                        return;
                    } else {
                        return;
                    }
                default:
                    throw new C0200a("Could not determine ad overlay type.");
            }
        } catch (C0200a e) {
            bky.m9011e(e.getMessage());
            this.f1607m = 3;
            this.f1609o.finish();
        }
    }

    /* renamed from: a */
    public void m1752a(View view, CustomViewCallback customViewCallback) {
        this.f1601g = new FrameLayout(this.f1609o);
        this.f1601g.setBackgroundColor(CtaButton.BACKGROUND_COLOR);
        this.f1601g.addView(view, -1, -1);
        this.f1609o.setContentView(this.f1601g);
        mo211l();
        this.f1602h = customViewCallback;
        this.f1600f = true;
    }

    /* renamed from: a */
    public void mo200a(aqq aqq) {
        if (((Boolean) bbb.dn.m7064c()).booleanValue() && aqd.m4922l()) {
            if (ako.m2343e().m9110a(this.f1609o, (Configuration) aqr.m4968a(aqq))) {
                this.f1609o.getWindow().addFlags(ByteConstants.KB);
                this.f1609o.getWindow().clearFlags(2048);
                return;
            }
            this.f1609o.getWindow().addFlags(2048);
            this.f1609o.getWindow().clearFlags(ByteConstants.KB);
        }
    }

    /* renamed from: a */
    public void m1754a(blo blo, Map<String, String> map) {
    }

    /* renamed from: a */
    public void m1755a(boolean z) {
        int intValue = ((Integer) bbb.dp.m7064c()).intValue();
        C3284a c3284a = new C3284a();
        c3284a.f14518e = 50;
        c3284a.f14514a = z ? intValue : 0;
        c3284a.f14515b = z ? 0 : intValue;
        c3284a.f14516c = 0;
        c3284a.f14517d = intValue;
        this.f1599e = new zzp(this.f1609o, c3284a, this);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f1599e.m19355a(z, this.f1596b.f14448g);
        this.f1605k.addView(this.f1599e, layoutParams);
    }

    /* renamed from: a */
    public void m1756a(boolean z, boolean z2) {
        if (this.f1599e != null) {
            this.f1599e.m19355a(z, z2);
        }
    }

    /* renamed from: b */
    public void m1757b() {
        if (this.f1596b != null && this.f1600f) {
            m1749a(this.f1596b.f14451j);
        }
        if (this.f1601g != null) {
            this.f1609o.setContentView(this.f1605k);
            mo211l();
            this.f1601g.removeAllViews();
            this.f1601g = null;
        }
        if (this.f1602h != null) {
            this.f1602h.onCustomViewHidden();
            this.f1602h = null;
        }
        this.f1600f = false;
    }

    /* renamed from: b */
    protected void m1758b(int i) {
        this.f1597c.mo1295a(i);
    }

    /* renamed from: b */
    public void mo201b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f1603i);
    }

    /* renamed from: b */
    protected void m1760b(boolean z) throws C0200a {
        if (!this.f1613s) {
            this.f1609o.requestWindowFeature(1);
        }
        Window window = this.f1609o.getWindow();
        if (window == null) {
            throw new C0200a("Invalid activity, no window available.");
        }
        boolean a = (aqd.m4922l() && ((Boolean) bbb.dn.m7064c()).booleanValue()) ? ako.m2343e().m9110a(this.f1609o, this.f1609o.getResources().getConfiguration()) : true;
        Object obj = (this.f1596b.f14457p == null || !this.f1596b.f14457p.f14526b) ? null : 1;
        if (!(this.f1604j && obj == null) && a) {
            window.setFlags(ByteConstants.KB, ByteConstants.KB);
        }
        blp l = this.f1596b.f14445d.mo1322l();
        boolean b = l != null ? l.m9425b() : false;
        this.f1606l = false;
        if (b) {
            if (this.f1596b.f14451j == ako.m2345g().mo1261a()) {
                this.f1606l = this.f1609o.getResources().getConfiguration().orientation == 1;
            } else if (this.f1596b.f14451j == ako.m2345g().mo1263b()) {
                this.f1606l = this.f1609o.getResources().getConfiguration().orientation == 2;
            }
        }
        bky.m9006b("Delay onShow to next orientation change: " + this.f1606l);
        m1749a(this.f1596b.f14451j);
        if (ako.m2345g().mo1267a(window)) {
            bky.m9006b("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.f1604j) {
            this.f1605k.setBackgroundColor(f1595a);
        } else {
            this.f1605k.setBackgroundColor(CtaButton.BACKGROUND_COLOR);
        }
        this.f1609o.setContentView(this.f1605k);
        mo211l();
        if (z) {
            this.f1597c = ako.m2344f().m9442a(this.f1609o, this.f1596b.f14445d.mo1321k(), true, b, null, this.f1596b.f14454m, null, null, this.f1596b.f14445d.mo1318h());
            this.f1597c.mo1322l().m9411a(null, null, this.f1596b.f14446e, this.f1596b.f14450i, true, this.f1596b.f14455n, null, this.f1596b.f14445d.mo1322l().m9406a(), null, null);
            this.f1597c.mo1322l().m9413a(new C01981(this));
            if (this.f1596b.f14453l != null) {
                this.f1597c.loadUrl(this.f1596b.f14453l);
            } else if (this.f1596b.f14449h != null) {
                this.f1597c.loadDataWithBaseURL(this.f1596b.f14447f, this.f1596b.f14449h, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME, null);
            } else {
                throw new C0200a("No URL or HTML to display in ad overlay.");
            }
            if (this.f1596b.f14445d != null) {
                this.f1596b.f14445d.mo1307b(this);
            }
        } else {
            this.f1597c = this.f1596b.f14445d;
            this.f1597c.mo1297a(this.f1609o);
        }
        this.f1597c.mo1296a(this);
        ViewParent parent = this.f1597c.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.f1597c.mo1305b());
        }
        if (this.f1604j) {
            this.f1597c.mo1293F();
        }
        this.f1605k.addView(this.f1597c.mo1305b(), -1, -1);
        if (!(z || this.f1606l)) {
            m1775q();
        }
        m1755a(b);
        if (this.f1597c.mo1326m()) {
            m1756a(b, true);
        }
        ajx h = this.f1597c.mo1318h();
        aiv aiv = h != null ? h.f1754c : null;
        if (aiv != null) {
            this.f1608n = aiv.mo213a(this.f1609o, this.f1597c, this.f1605k);
        } else {
            bky.m9011e("Appstreaming controller is null.");
        }
    }

    /* renamed from: c */
    public void mo202c() {
        this.f1607m = 1;
        this.f1609o.finish();
    }

    /* renamed from: d */
    public void mo203d() {
        this.f1607m = 0;
    }

    /* renamed from: e */
    public boolean mo204e() {
        boolean z = true;
        this.f1607m = 0;
        if (this.f1597c != null) {
            if (!this.f1597c.mo1340t()) {
                z = false;
            }
            if (!z) {
                this.f1597c.mo1303a("onbackblocked", Collections.emptyMap());
            }
        }
        return z;
    }

    /* renamed from: f */
    public void mo205f() {
    }

    /* renamed from: g */
    public void mo206g() {
        if (!((Boolean) bbb.f5398do.m7064c()).booleanValue()) {
            return;
        }
        if (this.f1597c == null || this.f1597c.mo1333r()) {
            bky.m9011e("The webview does not exist. Ignoring action.");
        } else {
            ako.m2345g().m9166b(this.f1597c);
        }
    }

    /* renamed from: h */
    public void mo207h() {
        if (this.f1596b != null && this.f1596b.f14452k == 4) {
            if (this.f1603i) {
                this.f1607m = 3;
                this.f1609o.finish();
            } else {
                this.f1603i = true;
            }
        }
        if (this.f1596b.f14444c != null) {
            this.f1596b.f14444c.mo272c();
        }
        if (!((Boolean) bbb.f5398do.m7064c()).booleanValue()) {
            if (this.f1597c == null || this.f1597c.mo1333r()) {
                bky.m9011e("The webview does not exist. Ignoring action.");
            } else {
                ako.m2345g().m9166b(this.f1597c);
            }
        }
    }

    /* renamed from: i */
    public void mo208i() {
        m1757b();
        if (this.f1596b.f14444c != null) {
            this.f1596b.f14444c.mo270b();
        }
        if (!(((Boolean) bbb.f5398do.m7064c()).booleanValue() || this.f1597c == null || (this.f1609o.isFinishing() && this.f1598d != null))) {
            ako.m2345g().m9162a(this.f1597c);
        }
        m1772n();
    }

    /* renamed from: j */
    public void mo209j() {
        if (((Boolean) bbb.f5398do.m7064c()).booleanValue() && this.f1597c != null && (!this.f1609o.isFinishing() || this.f1598d == null)) {
            ako.m2345g().m9162a(this.f1597c);
        }
        m1772n();
    }

    /* renamed from: k */
    public void mo210k() {
        if (this.f1597c != null) {
            this.f1605k.removeView(this.f1597c.mo1305b());
        }
        m1772n();
    }

    /* renamed from: l */
    public void mo211l() {
        this.f1613s = true;
    }

    /* renamed from: m */
    public void m1771m() {
        this.f1605k.removeView(this.f1599e);
        m1755a(true);
    }

    /* renamed from: n */
    protected void m1772n() {
        if (this.f1609o.isFinishing() && !this.f1614t) {
            this.f1614t = true;
            if (this.f1597c != null) {
                m1758b(this.f1607m);
                synchronized (this.f1610p) {
                    if (!this.f1612r && this.f1597c.mo1288A()) {
                        this.f1611q = new C01992(this);
                        bkg.f6710a.postDelayed(this.f1611q, ((Long) bbb.aS.m7064c()).longValue());
                        return;
                    }
                }
            }
            m1773o();
        }
    }

    /* renamed from: o */
    void m1773o() {
        if (!this.f1615u) {
            this.f1615u = true;
            if (this.f1597c != null) {
                this.f1605k.removeView(this.f1597c.mo1305b());
                if (this.f1598d != null) {
                    this.f1597c.mo1297a(this.f1598d.f1588d);
                    this.f1597c.mo1304a(false);
                    this.f1598d.f1587c.addView(this.f1597c.mo1305b(), this.f1598d.f1585a, this.f1598d.f1586b);
                    this.f1598d = null;
                } else if (this.f1609o.getApplicationContext() != null) {
                    this.f1597c.mo1297a(this.f1609o.getApplicationContext());
                }
                this.f1597c = null;
            }
            if (this.f1596b != null && this.f1596b.f14444c != null) {
                this.f1596b.f14444c.mo264a();
            }
        }
    }

    /* renamed from: p */
    public void m1774p() {
        if (this.f1606l) {
            this.f1606l = false;
            m1775q();
        }
    }

    /* renamed from: q */
    protected void m1775q() {
        this.f1597c.mo1312d();
    }

    /* renamed from: r */
    public void m1776r() {
        this.f1605k.m1721a();
    }

    /* renamed from: s */
    public void m1777s() {
        synchronized (this.f1610p) {
            this.f1612r = true;
            if (this.f1611q != null) {
                bkg.f6710a.removeCallbacks(this.f1611q);
                bkg.f6710a.post(this.f1611q);
            }
        }
    }
}
