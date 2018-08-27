package com.p000;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.applovin.adview.AppLovinAdView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: vl */
public class vl implements zc {
    /* renamed from: a */
    public static String f25714a = "/adservice/no_op";
    /* renamed from: b */
    public static String f25715b = "/adservice/track_click_now";
    /* renamed from: c */
    private final vm f25716c;
    /* renamed from: d */
    private final zi f25717d;
    /* renamed from: e */
    private Handler f25718e;
    /* renamed from: f */
    private final Map f25719f;

    vl(vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f25716c = vmVar;
        this.f25717d = vmVar.mo5561g();
        this.f25718e = new Handler(Looper.getMainLooper());
        this.f25719f = new HashMap(2);
        for (ze put : ze.m34953b()) {
            this.f25719f.put(put, new HashMap());
        }
        ((Map) this.f25719f.get(ze.f26079a)).put(zd.f26072a, new yd(zd.f26072a));
        ((Map) this.f25719f.get(ze.f26079a)).put(zd.f26075d, new yd(zd.f26075d));
        ((Map) this.f25719f.get(ze.f26079a)).put(zd.f26074c, new yd(zd.f26074c));
        ((Map) this.f25719f.get(ze.f26079a)).put(zd.f26073b, new yd(zd.f26073b));
        ((Map) this.f25719f.get(ze.f26080b)).put(zd.f26074c, new yd(zd.f26074c));
    }

    /* renamed from: a */
    private void m34354a(Uri uri, vi viVar, AppLovinAdView appLovinAdView, ty tyVar) {
        tyVar.m34235h();
        m34371a((yy) viVar);
        zn.m34834a(appLovinAdView.getContext(), uri, this.f25716c);
        tyVar.m34237j();
    }

    /* renamed from: a */
    private boolean m34357a() {
        return ((PowerManager) this.f25716c.m34404i().getSystemService("power")).isScreenOn();
    }

    /* renamed from: a */
    private boolean m34359a(zd zdVar) {
        return zdVar == zd.f26072a ? ((Boolean) this.f25716c.m34391a(wp.f25916t)).booleanValue() : zdVar == zd.f26075d ? ((Boolean) this.f25716c.m34391a(wp.f25918v)).booleanValue() : zdVar == zd.f26073b ? ((Boolean) this.f25716c.m34391a(wp.f25920x)).booleanValue() : false;
    }

    /* renamed from: a */
    private boolean m34360a(zd zdVar, ze zeVar) {
        return !((Boolean) this.f25716c.m34391a(wp.f25871A)).booleanValue() ? false : !m34365b(zdVar, zeVar) ? false : zeVar.equals(ze.f26080b) ? ((Boolean) this.f25716c.m34391a(wp.aq)).booleanValue() : zdVar.equals(zd.f26074c) ? ((Boolean) this.f25716c.m34391a(wp.ar)).booleanValue() : false;
    }

    /* renamed from: b */
    private long m34362b(zd zdVar) {
        return zdVar == zd.f26072a ? ((Long) this.f25716c.m34391a(wp.f25917u)).longValue() : zdVar == zd.f26075d ? ((Long) this.f25716c.m34391a(wp.f25919w)).longValue() : zdVar == zd.f26073b ? ((Long) this.f25716c.m34391a(wp.f25921y)).longValue() : 0;
    }

    /* renamed from: b */
    private void m34364b(zd zdVar, ze zeVar, zb zbVar) {
        wt wtVar = new wt(zdVar, zeVar);
        yy yyVar = (yy) this.f25716c.m34410o().mo5574b(wtVar);
        if (yyVar != null) {
            this.f25717d.mo5606a("AppLovinAdService", "Using pre-loaded ad: " + yyVar + " for size " + zdVar + " and type " + zeVar);
            zbVar.mo5549a(yyVar);
        } else {
            this.f25716c.m34407l().m34803a(new xg(zdVar, zeVar, zbVar, this.f25716c), xl.MAIN);
        }
        this.f25716c.m34410o().mo5579f(wtVar);
    }

    /* renamed from: b */
    private boolean m34365b(zd zdVar, ze zeVar) {
        try {
            return zeVar.equals(ze.f26080b) ? ((Boolean) this.f25716c.m34391a(wp.f25875E)).booleanValue() : ((String) this.f25716c.m34391a(wp.f25874D)).toUpperCase(Locale.ENGLISH).contains(zdVar.m34951c());
        } catch (Throwable e) {
            this.f25716c.mo5561g().mo5609b("AppLovinAdService", "Unable to safely test preload merge capability", e);
            return false;
        }
    }

    /* renamed from: c */
    private void m34368c(zd zdVar) {
        long b = m34362b(zdVar);
        if (b > 0) {
            this.f25716c.m34407l().m34804a(new ye(this, zdVar), xl.MAIN, (b + 2) * 1000);
        }
    }

    /* renamed from: a */
    public void m34371a(yy yyVar) {
        if (yyVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        vi viVar = (vi) yyVar;
        yd ydVar = (yd) ((Map) this.f25719f.get(viVar.mo5553c())).get(viVar.mo5552b());
        synchronized (ydVar.f26031b) {
            ydVar.f26032c = null;
            ydVar.f26033d = 0;
        }
    }

    /* renamed from: a */
    public void m34372a(yy yyVar, AppLovinAdView appLovinAdView, ty tyVar, Uri uri) {
        vi viVar = (vi) yyVar;
        String o = viVar.m34333o();
        if (zn.m34841d(o)) {
            this.f25716c.m34415t().m34627a(o, null);
        }
        m34354a(uri, viVar, appLovinAdView, tyVar);
    }

    /* renamed from: a */
    public void mo5554a(zd zdVar, zb zbVar) {
        m34374a(zdVar, ze.f26079a, zbVar);
    }

    /* renamed from: a */
    public void m34374a(zd zdVar, ze zeVar, zb zbVar) {
        Object obj = 1;
        if (zdVar == null) {
            throw new IllegalArgumentException("No ad size specified");
        } else if (zbVar == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (zeVar == null) {
            throw new IllegalArgumentException("No ad type specificed");
        } else {
            yy yyVar;
            this.f25716c.mo5561g().mo5606a("AppLovinAdService", "Loading next ad of size " + zdVar.m34951c() + " and type " + zeVar.m34954a());
            if (zdVar.equals(zd.f26072a) || zdVar.equals(zd.f26075d) || zdVar.equals(zd.f26073b)) {
                this.f25716c.mo5561g().mo5613e("AppLovinAdService", "Banners, MRecs and Leaderboards are deprecated and will be removed in a future SDK version!");
            }
            yd ydVar = (yd) ((Map) this.f25719f.get(zeVar)).get(zdVar);
            synchronized (ydVar.f26031b) {
                if (System.currentTimeMillis() <= ydVar.f26033d) {
                    obj = null;
                }
                if (ydVar.f26032c == null || r2 != null) {
                    this.f25717d.mo5606a("AppLovinAdService", "Loading next ad...");
                    ydVar.f26036g.add(zbVar);
                    if (!ydVar.f26034e) {
                        ydVar.f26034e = true;
                        obj = new yc(this, (yd) ((Map) this.f25719f.get(zeVar)).get(zdVar), null);
                        if (!m34360a(zdVar, zeVar)) {
                            this.f25717d.mo5606a("AppLovinAdService", "Task merge not necessary.");
                            m34364b(zdVar, zeVar, obj);
                        } else if (this.f25716c.m34410o().mo5573a(new wt(zdVar, zeVar), obj)) {
                            this.f25717d.mo5606a("AppLovinAdService", "Attaching load listener to initial preload task...");
                            yyVar = null;
                        } else {
                            this.f25717d.mo5606a("AppLovinAdService", "Skipped attach of initial preload callback.");
                            m34364b(zdVar, zeVar, obj);
                            yyVar = null;
                        }
                    }
                    yyVar = null;
                } else {
                    yyVar = ydVar.f26032c;
                }
            }
            if (yyVar != null) {
                zbVar.mo5549a(yyVar);
            }
        }
    }

    /* renamed from: a */
    public void mo5555a(zf zfVar, zd zdVar) {
        if (zfVar != null) {
            yd ydVar = (yd) ((Map) this.f25719f.get(ze.f26079a)).get(zdVar);
            synchronized (ydVar.f26031b) {
                ydVar.f26035f.remove(zfVar);
            }
            this.f25717d.mo5606a("AppLovinAdService", "Removed update listener: " + zfVar);
        }
    }

    /* renamed from: b */
    public void m34376b(yy yyVar, AppLovinAdView appLovinAdView, ty tyVar, Uri uri) {
        if (yyVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        vi viVar = (vi) yyVar;
        this.f25717d.mo5606a("AppLovinAdService", "Tracking foreground click on an ad...");
        int intValue = ((Integer) this.f25716c.m34391a(wp.bc)).intValue();
        int intValue2 = ((Integer) this.f25716c.m34391a(wp.bd)).intValue();
        int intValue3 = ((Integer) this.f25716c.m34391a(wp.be)).intValue();
        this.f25716c.m34412q().m34451a(((vi) yyVar).m34333o(), null, intValue, intValue2, intValue3, new xz(this, tyVar, uri, viVar, appLovinAdView));
    }

    /* renamed from: b */
    public void mo5556b(zf zfVar, zd zdVar) {
        if (zfVar == null) {
            throw new IllegalArgumentException("No ad listener specified");
        }
        Object obj;
        yd ydVar = (yd) ((Map) this.f25719f.get(ze.f26079a)).get(zdVar);
        synchronized (ydVar.f26031b) {
            if (ydVar.f26035f.contains(zfVar)) {
                obj = null;
            } else {
                ydVar.f26035f.add(zfVar);
                obj = 1;
                this.f25717d.mo5606a("AppLovinAdService", "Added update listener: " + zfVar);
            }
        }
        if (obj != null) {
            this.f25716c.m34407l().m34803a(new ye(this, zdVar), xl.MAIN);
        }
    }
}
