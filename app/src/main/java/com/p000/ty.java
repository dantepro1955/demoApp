package com.p000;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewDatabase;
import android.widget.RelativeLayout.LayoutParams;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinInterstitialActivity;
import com.applovin.adview.ClickTrackingOverlayView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ty */
public class ty implements tb {
    /* renamed from: a */
    private Activity f25573a;
    /* renamed from: b */
    private zl f25574b;
    /* renamed from: c */
    private zc f25575c;
    /* renamed from: d */
    private zi f25576d;
    /* renamed from: e */
    private zd f25577e;
    /* renamed from: f */
    private vb f25578f;
    /* renamed from: g */
    private uv f25579g;
    /* renamed from: h */
    private uy f25580h;
    /* renamed from: i */
    private yy f25581i;
    /* renamed from: j */
    private Runnable f25582j;
    /* renamed from: k */
    private Runnable f25583k;
    /* renamed from: l */
    private Runnable f25584l;
    /* renamed from: m */
    private volatile yy f25585m = null;
    /* renamed from: n */
    private ClickTrackingOverlayView f25586n = null;
    /* renamed from: o */
    private WeakReference f25587o = null;
    /* renamed from: p */
    private final AtomicReference f25588p = new AtomicReference();
    /* renamed from: q */
    private volatile boolean f25589q = false;
    /* renamed from: r */
    private volatile boolean f25590r = true;
    /* renamed from: s */
    private volatile boolean f25591s = false;
    /* renamed from: t */
    private volatile boolean f25592t = false;
    /* renamed from: u */
    private volatile zb f25593u;
    /* renamed from: v */
    private volatile za f25594v;
    /* renamed from: w */
    private volatile zg f25595w;
    /* renamed from: x */
    private volatile yz f25596x;
    /* renamed from: y */
    private volatile boolean f25597y;

    /* renamed from: a */
    private void m34200a(ViewGroup viewGroup, zl zlVar, zd zdVar, Context context) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (zlVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (zdVar == null) {
            throw new IllegalArgumentException("No ad size specified");
        } else if (context instanceof Activity) {
            this.f25574b = zlVar;
            this.f25575c = zlVar.mo5559d();
            this.f25576d = zlVar.mo5561g();
            this.f25577e = zdVar;
            this.f25573a = (Activity) context;
            this.f25581i = xy.m34852a();
            this.f25578f = new vb(this, zlVar);
            this.f25584l = new up();
            this.f25582j = new uu();
            this.f25583k = new us();
            this.f25579g = new uv(this, zlVar);
            if (ty.m34203a(context)) {
                this.f25580h = m34213k();
                viewGroup.setBackgroundColor(0);
                viewGroup.addView(this.f25580h);
                ty.m34205b(this.f25580h, zdVar);
                this.f25580h.setVisibility(8);
                m34201a(new ut());
                this.f25589q = true;
                return;
            }
            this.f25576d.mo5613e("AppLovinAdView", "Web view database is corrupt, AdView not loaded");
        } else {
            throw new IllegalArgumentException("Specified context is not an activity");
        }
    }

    /* renamed from: a */
    private void m34201a(Runnable runnable) {
        this.f25573a.runOnUiThread(runnable);
    }

    /* renamed from: a */
    private void m34202a(yy yyVar, AppLovinAdView appLovinAdView, Uri uri) {
        if (this.f25586n == null) {
            this.f25576d.mo5606a("AppLovinAdView", "Creating and rendering click overlay");
            this.f25586n = new ClickTrackingOverlayView(appLovinAdView.getContext(), this.f25574b);
            this.f25586n.setLayoutParams(new LayoutParams(-1, -1));
            appLovinAdView.addView(this.f25586n);
            appLovinAdView.bringChildToFront(this.f25586n);
            ((vl) this.f25575c).m34376b(yyVar, appLovinAdView, this, uri);
            return;
        }
        this.f25576d.mo5606a("AppLovinAdView", "Skipping click overlay rendering because it already exists");
    }

    /* renamed from: a */
    private static boolean m34203a(Context context) {
        try {
            if (VERSION.SDK_INT >= 11) {
                return true;
            }
            WebViewDatabase instance = WebViewDatabase.getInstance(context);
            Method declaredMethod = WebViewDatabase.class.getDeclaredMethod("getCacheTotalSize", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(instance, new Object[0]);
            return true;
        } catch (Throwable e) {
            Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", e);
            return true;
        } catch (Throwable e2) {
            Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", e2);
            return true;
        } catch (Throwable e22) {
            Log.e("AppLovinAdView", "Error invoking getCacheTotalSize()", e22);
            return true;
        } catch (Throwable e3) {
            Log.e("AppLovinAdView", "getCacheTotalSize() reported exception", e3);
            return false;
        } catch (Throwable e32) {
            Log.e("AppLovinAdView", "Unexpected error while checking DB state", e32);
            return false;
        }
    }

    /* renamed from: b */
    private static void m34205b(View view, zd zdVar) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        int applyDimension = zdVar.m34951c().equals(zd.f26074c.m34951c()) ? -1 : zdVar.m34949a() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, (float) zdVar.m34949a(), displayMetrics);
        int applyDimension2 = zdVar.m34951c().equals(zd.f26074c.m34951c()) ? -1 : zdVar.m34950b() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, (float) zdVar.m34950b(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof LayoutParams) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    private uy m34213k() {
        uy uyVar = new uy(this.f25578f, this.f25574b, this.f25573a);
        uyVar.setBackgroundColor(0);
        uyVar.setWillNotCacheDrawing(false);
        if (new wu(this.f25574b).m34669F() && VERSION.SDK_INT >= 19) {
            uyVar.setLayerType(2, null);
        }
        return uyVar;
    }

    /* renamed from: a */
    public void mo5529a() {
        if (this.f25574b == null || this.f25579g == null || this.f25573a == null || !this.f25589q) {
            Log.i("AppLovinSdk", "Unable to load next ad: AppLovinAdView is not initialized.");
        } else {
            this.f25575c.mo5554a(this.f25577e, this.f25579g);
        }
    }

    /* renamed from: a */
    public void mo5530a(int i) {
        if (!this.f25589q || !this.f25590r) {
            return;
        }
        if (i == 8 || i == 4) {
            m34232e();
        } else if (i == 0) {
            m34233f();
        }
    }

    /* renamed from: a */
    public void mo5531a(ViewGroup viewGroup, Context context, zd zdVar, zl zlVar, AttributeSet attributeSet) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("No parent view specified");
        } else if (context == null) {
            Log.e("AppLovinSdk", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
        } else {
            if (zdVar == null) {
                zdVar = uw.m34285a(attributeSet);
                if (zdVar == null) {
                    zdVar = zd.f26072a;
                }
            }
            if (zlVar == null) {
                zlVar = zl.m34380c(context);
            }
            if (zlVar != null && !zlVar.mo5558c()) {
                m34200a(viewGroup, zlVar, zdVar, context);
                if (uw.m34286b(attributeSet)) {
                    mo5529a();
                }
            }
        }
    }

    /* renamed from: a */
    public void m34217a(WebView webView) {
        if (this.f25585m != null) {
            webView.setVisibility(0);
            try {
                if (this.f25594v != null) {
                    this.f25594v.mo5527b(this.f25585m);
                }
            } catch (Throwable th) {
                this.f25576d.mo5611c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    /* renamed from: a */
    public void m34218a(WeakReference weakReference) {
        this.f25587o = weakReference;
    }

    /* renamed from: a */
    public void mo5532a(yy yyVar) {
        if (yyVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (!this.f25589q) {
            Log.i("AppLovinSdk", "Unable to render ad: AppLovinAdView is not initialized.");
        } else if (yyVar != this.f25585m) {
            this.f25576d.mo5606a("AppLovinAdView", "Rendering ad # " + yyVar.mo5551a() + " (" + yyVar.mo5552b() + ")");
            m34201a(new ur(this, this.f25585m));
            this.f25588p.set(null);
            this.f25585m = yyVar;
            if (yyVar.mo5552b() == this.f25577e) {
                m34201a(this.f25582j);
            } else if (yyVar.mo5552b() == zd.f26074c) {
                m34201a(this.f25584l);
                m34201a(this.f25583k);
            }
            new ww(this.f25574b).m34711a();
        } else {
            this.f25576d.mo5610c("AppLovinAdView", "Ad # " + yyVar.mo5551a() + " is already showing, ignoring");
        }
    }

    /* renamed from: a */
    void m34220a(yy yyVar, AppLovinAdView appLovinAdView, ty tyVar, Uri uri) {
        vl vlVar = (vl) this.f25575c;
        if (!new wu(this.f25574b).m34671H() || uri == null) {
            vlVar.m34372a(yyVar, appLovinAdView, this, uri);
        } else {
            m34202a(yyVar, appLovinAdView, uri);
        }
        m34201a(new uq(this, yyVar));
    }

    /* renamed from: a */
    public void mo5533a(yz yzVar) {
        this.f25596x = yzVar;
    }

    /* renamed from: a */
    public void mo5534a(za zaVar) {
        this.f25594v = zaVar;
    }

    /* renamed from: a */
    public void mo5535a(zb zbVar) {
        this.f25593u = zbVar;
    }

    /* renamed from: a */
    public void mo5536a(zg zgVar) {
        this.f25595w = zgVar;
    }

    /* renamed from: a */
    public void mo5537a(boolean z) {
        this.f25590r = z;
    }

    /* renamed from: b */
    public void mo5538b() {
        if (this.f25575c != null) {
            this.f25575c.mo5555a(this.f25579g, mo5539c());
        }
        if (this.f25580h != null) {
            try {
                this.f25580h.removeAllViews();
                this.f25580h.destroy();
            } catch (Throwable th) {
                this.f25576d.mo5607a("AppLovinAdView", "Unable to destroy ad view", th);
            }
        }
        this.f25591s = true;
    }

    /* renamed from: b */
    void m34227b(int i) {
        if (!this.f25591s) {
            this.f25575c.mo5556b(this.f25579g, this.f25577e);
            m34201a(this.f25584l);
        }
        m34201a(new ul(this, i));
    }

    /* renamed from: b */
    void m34228b(yy yyVar) {
        if (yyVar != null) {
            this.f25592t = true;
            if (this.f25591s) {
                this.f25588p.set(yyVar);
                this.f25576d.mo5606a("AppLovinAdView", "Ad view has paused when an ad was recieved, ad saved for later");
            } else {
                this.f25575c.mo5556b(this.f25579g, this.f25577e);
                mo5532a(yyVar);
            }
            m34201a(new ua(this, yyVar));
            return;
        }
        this.f25576d.mo5612d("AppLovinAdView", "No provided when to the view controller");
        m34227b(-1);
    }

    /* renamed from: b */
    public void m34229b(boolean z) {
        this.f25597y = z;
    }

    /* renamed from: c */
    public zd mo5539c() {
        return this.f25577e;
    }

    /* renamed from: d */
    public void mo5540d() {
        if (this.f25589q) {
            m34201a(new ur(this, this.f25585m));
            if (this.f25590r) {
                mo5538b();
            }
        }
    }

    /* renamed from: e */
    public void m34232e() {
        if (this.f25589q) {
            this.f25575c.mo5555a(this.f25579g, mo5539c());
            yy yyVar = this.f25585m;
            mo5532a(this.f25581i);
            if (yyVar != null) {
                this.f25588p.set(yyVar);
            }
            this.f25591s = true;
        }
    }

    /* renamed from: f */
    public void m34233f() {
        if (this.f25589q) {
            if (this.f25592t) {
                this.f25575c.mo5556b(this.f25579g, this.f25577e);
            }
            yy yyVar = (yy) this.f25588p.getAndSet(null);
            if (yyVar != null) {
                mo5532a(yyVar);
            }
            this.f25591s = false;
        }
    }

    /* renamed from: g */
    void m34234g() {
        m34201a(this.f25584l);
        m34201a(new ur(this, this.f25585m));
        this.f25585m = null;
    }

    /* renamed from: h */
    public void m34235h() {
        if (this.f25586n != null) {
            ViewParent parent = this.f25586n.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f25586n);
                this.f25586n = null;
                return;
            }
            return;
        }
        this.f25576d.mo5606a("AppLovinAdView", "Asked to remove an overlay when none existed. Skipping...");
    }

    /* renamed from: i */
    public boolean m34236i() {
        return this.f25597y;
    }

    /* renamed from: j */
    public void m34237j() {
        if (!new wu(this.f25574b).m34675L()) {
            return;
        }
        if (this.f25573a != null && (this.f25573a instanceof AppLovinInterstitialActivity)) {
            ((AppLovinInterstitialActivity) this.f25573a).dismiss();
        } else if (this.f25587o != null) {
            vf vfVar = (vf) this.f25587o.get();
            if (vfVar != null) {
                vfVar.dismiss();
            }
        }
    }
}
