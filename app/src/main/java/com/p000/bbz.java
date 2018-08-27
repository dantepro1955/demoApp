package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.common.util.UriUtil;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzgt;
import com.google.android.gms.internal.zzqh;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bby.C0997a;
import p000.bby.C0998b;
import p000.bcc.C0995a;
import p000.bgu.C1002a;
import p000.blp.C0197a;

@bhd
/* renamed from: bbz */
public class bbz implements bby {
    /* renamed from: a */
    boolean f5512a;
    /* renamed from: b */
    private final Object f5513b = new Object();
    /* renamed from: c */
    private final akk f5514c;
    /* renamed from: d */
    private final Context f5515d;
    /* renamed from: e */
    private final JSONObject f5516e;
    /* renamed from: f */
    private final bgu f5517f;
    /* renamed from: g */
    private final C0997a f5518g;
    /* renamed from: h */
    private final avc f5519h;
    /* renamed from: i */
    private final zzqh f5520i;
    /* renamed from: j */
    private String f5521j;
    /* renamed from: k */
    private bjm f5522k;
    /* renamed from: l */
    private WeakReference<View> f5523l = null;

    /* renamed from: bbz$a */
    static class C1011a {
        /* renamed from: a */
        private final WeakReference<blo> f5548a;
        /* renamed from: b */
        private String f5549b;

        /* renamed from: bbz$a$5 */
        class C10105 extends C1002a {
            /* renamed from: a */
            final /* synthetic */ C1011a f5547a;

            C10105(C1011a c1011a) {
                this.f5547a = c1011a;
            }

            /* renamed from: a */
            public void mo975a(bef bef) {
                blo blo = (blo) this.f5547a.f5548a.get();
                if (blo != null) {
                    bef.mo1023a("/loadHtml", this.f5547a.m7368a(bef));
                    bef.mo1023a("/showOverlay", this.f5547a.m7372b(bef));
                    bef.mo1023a("/hideOverlay", this.f5547a.m7375c(bef));
                    blo.mo1322l().m9419a("/sendMessageToSdk", this.f5547a.m7377d(bef));
                }
            }
        }

        public C1011a(blo blo) {
            this.f5548a = new WeakReference(blo);
        }

        /* renamed from: a */
        private bcy m7368a(final bef bef) {
            return new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ C1011a f5540b;

                /* renamed from: a */
                public void mo277a(blo blo, final Map<String, String> map) {
                    blo blo2 = (blo) this.f5540b.f5548a.get();
                    if (blo2 == null) {
                        bef.mo1028b("/loadHtml", (bcy) this);
                        return;
                    }
                    blo2.mo1322l().m9413a(new C0197a(this) {
                        /* renamed from: b */
                        final /* synthetic */ C10061 f5538b;

                        /* renamed from: a */
                        public void mo193a(blo blo, boolean z) {
                            this.f5538b.f5540b.f5549b = (String) map.get("id");
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("messageType", "htmlLoaded");
                                jSONObject.put("id", this.f5538b.f5540b.f5549b);
                                bef.mo1029b("sendMessageToNativeJs", jSONObject);
                            } catch (Throwable e) {
                                bky.m9007b("Unable to dispatch sendMessageToNativeJs event", e);
                            }
                        }
                    });
                    String str = (String) map.get("overlayHtml");
                    String str2 = (String) map.get("baseUrl");
                    if (TextUtils.isEmpty(str2)) {
                        blo2.loadData(str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME);
                    } else {
                        blo2.loadDataWithBaseURL(str2, str, AudienceNetworkActivity.WEBVIEW_MIME_TYPE, Utf8Charset.NAME, null);
                    }
                }
            };
        }

        /* renamed from: b */
        private bcy m7372b(final bef bef) {
            return new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ C1011a f5542b;

                /* renamed from: a */
                public void mo277a(blo blo, Map<String, String> map) {
                    blo blo2 = (blo) this.f5542b.f5548a.get();
                    if (blo2 == null) {
                        bef.mo1028b("/showOverlay", (bcy) this);
                    } else {
                        blo2.mo1305b().setVisibility(0);
                    }
                }
            };
        }

        /* renamed from: c */
        private bcy m7375c(final bef bef) {
            return new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ C1011a f5544b;

                /* renamed from: a */
                public void mo277a(blo blo, Map<String, String> map) {
                    blo blo2 = (blo) this.f5544b.f5548a.get();
                    if (blo2 == null) {
                        bef.mo1028b("/hideOverlay", (bcy) this);
                    } else {
                        blo2.mo1305b().setVisibility(8);
                    }
                }
            };
        }

        /* renamed from: d */
        private bcy m7377d(final bef bef) {
            return new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ C1011a f5546b;

                /* renamed from: a */
                public void mo277a(blo blo, Map<String, String> map) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        for (String str : map.keySet()) {
                            jSONObject.put(str, map.get(str));
                        }
                        jSONObject.put("id", this.f5546b.f5549b);
                        bef.mo1029b("sendMessageToNativeJs", jSONObject);
                    } catch (Throwable e) {
                        bky.m9007b("Unable to dispatch sendMessageToNativeJs event", e);
                    }
                }
            };
        }

        /* renamed from: a */
        public C1002a m7378a() {
            return new C10105(this);
        }
    }

    public bbz(Context context, akk akk, bgu bgu, avc avc, JSONObject jSONObject, C0997a c0997a, zzqh zzqh, String str) {
        this.f5515d = context;
        this.f5514c = akk;
        this.f5517f = bgu;
        this.f5519h = avc;
        this.f5516e = jSONObject;
        this.f5518g = c0997a;
        this.f5520i = zzqh;
        this.f5521j = str;
    }

    /* renamed from: a */
    private JSONObject m7315a(Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", m7320a(rect.left));
        jSONObject.put("y", m7320a(rect.top));
        jSONObject.put("width", m7320a(rect.right - rect.left));
        jSONObject.put("height", m7320a(rect.bottom - rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m7316a(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        try {
            int[] b = m7333b(view);
            for (Entry entry : map.entrySet()) {
                View view2 = (View) ((WeakReference) entry.getValue()).get();
                if (view2 != null) {
                    int[] b2 = m7333b(view2);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("width", m7320a(m7334c(view2)));
                    jSONObject2.put("height", m7320a(m7336d(view2)));
                    jSONObject2.put("x", m7320a(b2[0] - b[0]));
                    jSONObject2.put("y", m7320a(b2[1] - b[1]));
                    jSONObject.put((String) entry.getKey(), jSONObject2);
                }
            }
        } catch (JSONException e) {
            bky.m9011e("Unable to get all view rectangles");
        }
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m7317b(Map<String, WeakReference<View>> map, View view) {
        JSONObject jSONObject = new JSONObject();
        if (map == null || view == null) {
            return jSONObject;
        }
        int[] b = m7333b(view);
        for (Entry entry : map.entrySet()) {
            View view2 = (View) ((WeakReference) entry.getValue()).get();
            if (view2 != null) {
                int[] b2 = m7333b(view2);
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                try {
                    Object a;
                    jSONObject3.put("width", m7320a(m7334c(view2)));
                    jSONObject3.put("height", m7320a(m7336d(view2)));
                    jSONObject3.put("x", m7320a(b2[0] - b[0]));
                    jSONObject3.put("y", m7320a(b2[1] - b[1]));
                    jSONObject3.put("relative_to", "ad_view");
                    jSONObject2.put("frame", jSONObject3);
                    Rect rect = new Rect();
                    if (view2.getLocalVisibleRect(rect)) {
                        a = m7315a(rect);
                    } else {
                        a = new JSONObject();
                        a.put("x", m7320a(b2[0] - b[0]));
                        a.put("y", m7320a(b2[1] - b[1]));
                        a.put("width", 0);
                        a.put("height", 0);
                        a.put("relative_to", "ad_view");
                    }
                    jSONObject2.put("visible_bounds", a);
                    if (view2 instanceof TextView) {
                        TextView textView = (TextView) view2;
                        jSONObject2.put("text_color", textView.getCurrentTextColor());
                        jSONObject2.put("font_size", (double) textView.getTextSize());
                        jSONObject2.put("text", textView.getText());
                    }
                    jSONObject.put((String) entry.getKey(), jSONObject2);
                } catch (JSONException e) {
                    bky.m9011e("Unable to get asset views information");
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    private JSONObject m7318e(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                jSONObject.put("width", m7320a(m7334c(view)));
                jSONObject.put("height", m7320a(m7336d(view)));
            } catch (Exception e) {
                bky.m9011e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject;
    }

    /* renamed from: f */
    private JSONObject m7319f(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                Object a;
                int[] b = m7333b(view);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", m7320a(m7334c(view)));
                jSONObject2.put("height", m7320a(m7336d(view)));
                jSONObject2.put("x", m7320a(b[0]));
                jSONObject2.put("y", m7320a(b[1]));
                jSONObject2.put("relative_to", "window");
                jSONObject.put("frame", jSONObject2);
                Rect rect = new Rect();
                if (view.getGlobalVisibleRect(rect)) {
                    a = m7315a(rect);
                } else {
                    a = new JSONObject();
                    a.put("x", m7320a(b[0]));
                    a.put("y", m7320a(b[1]));
                    a.put("width", 0);
                    a.put("height", 0);
                    a.put("relative_to", "window");
                }
                jSONObject.put("visible_bounds", a);
            } catch (Exception e) {
                bky.m9011e("Unable to get native ad view bounding box");
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    int m7320a(int i) {
        return azp.m6789a().m9295b(this.f5515d, i);
    }

    /* renamed from: a */
    public View mo961a(OnClickListener onClickListener, boolean z) {
        bbq m = this.f5518g.mo937m();
        if (m == null) {
            return null;
        }
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (!z) {
            switch (m.m7203g()) {
                case 0:
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                    break;
                case 2:
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                    break;
                case 3:
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    break;
                default:
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    break;
            }
        }
        View zzgt = new zzgt(this.f5515d, m, layoutParams);
        zzgt.setOnClickListener(onClickListener);
        zzgt.setContentDescription((CharSequence) bbb.co.m7064c());
        return zzgt;
    }

    /* renamed from: a */
    bcc m7322a(Object obj) {
        return obj instanceof IBinder ? C0995a.m7208a((IBinder) obj) : null;
    }

    /* renamed from: a */
    public void mo962a(MotionEvent motionEvent) {
        this.f5519h.m5930a(motionEvent);
    }

    /* renamed from: a */
    public void mo963a(View view) {
        this.f5523l = new WeakReference(view);
    }

    /* renamed from: a */
    public void mo964a(View view, bbv bbv) {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View o = this.f5518g.mo939o();
        if (o != null) {
            ViewParent parent = o.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(o);
            }
            ((FrameLayout) view).addView(o, layoutParams);
            this.f5514c.m2254a(bbv);
        } else if (this.f5518g instanceof C0998b) {
            C0998b c0998b = (C0998b) this.f5518g;
            if (c0998b.mo926b() != null && c0998b.mo926b().size() > 0) {
                bcc a = m7322a(c0998b.mo926b().get(0));
                if (a != null) {
                    try {
                        aqq a2 = a.mo921a();
                        if (a2 != null) {
                            Drawable drawable = (Drawable) aqr.m4968a(a2);
                            o = m7342i();
                            o.setImageDrawable(drawable);
                            o.setScaleType(ScaleType.CENTER_INSIDE);
                            ((FrameLayout) view).addView(o, layoutParams);
                        }
                    } catch (RemoteException e) {
                        bky.m9011e("Could not get drawable from image");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo965a(View view, String str, JSONObject jSONObject, Map<String, WeakReference<View>> map, View view2) {
        aoi.m4687b("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(UriUtil.LOCAL_ASSET_SCHEME, str);
            jSONObject2.put("template", this.f5518g.mo935k());
            final JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(AdDatabaseHelper.TABLE_AD, this.f5516e);
            jSONObject3.put("click", jSONObject2);
            jSONObject3.put("has_custom_click_handler", this.f5514c.m2268c(this.f5518g.mo936l()) != null);
            if (((Boolean) bbb.cq.m7064c()).booleanValue()) {
                if (((Boolean) bbb.cr.m7064c()).booleanValue()) {
                    jSONObject3.put("asset_view_signal", m7317b((Map) map, view2));
                    jSONObject3.put("ad_view_signal", m7319f(view2));
                } else {
                    jSONObject3.put("view_rectangles", m7316a((Map) map, view2));
                    jSONObject3.put("native_view_rectangle", m7318e(view2));
                }
            }
            if (jSONObject != null) {
                jSONObject3.put("click_point", jSONObject);
            }
            try {
                JSONObject optJSONObject = this.f5516e.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                jSONObject2.put("click_signals", this.f5519h.m5929a().mo291a(this.f5515d, optJSONObject.optString("click_string"), view));
            } catch (Throwable e) {
                bky.m9007b("Exception obtaining click signals", e);
            }
            jSONObject3.put("ads_id", this.f5521j);
            this.f5517f.m8352a(new C1002a(this) {
                /* renamed from: a */
                public void mo975a(bef bef) {
                    bef.mo1025a("google.afma.nativeAds.handleClickGmsg", jSONObject3);
                }
            });
        } catch (Throwable e2) {
            bky.m9007b("Unable to create click JSON.", e2);
        }
    }

    /* renamed from: a */
    public void mo966a(View view, Map<String, WeakReference<View>> map) {
        aoi.m4687b("recordImpression must be called on the main UI thread.");
        m7330a(true);
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(AdDatabaseHelper.TABLE_AD, this.f5516e);
            jSONObject.put("ads_id", this.f5521j);
            if (((Boolean) bbb.cq.m7064c()).booleanValue()) {
                if (((Boolean) bbb.cr.m7064c()).booleanValue()) {
                    jSONObject.put("asset_view_signal", m7317b((Map) map, view));
                    jSONObject.put("ad_view_signal", m7319f(view));
                } else {
                    jSONObject.put("view_rectangles", m7316a((Map) map, view));
                    jSONObject.put("native_view_rectangle", m7318e(view));
                }
            }
            this.f5517f.m8352a(new C1002a(this) {
                /* renamed from: a */
                public void mo975a(bef bef) {
                    bef.mo1025a("google.afma.nativeAds.handleImpressionPing", jSONObject);
                }
            });
        } catch (Throwable e) {
            bky.m9007b("Unable to create impression JSON.", e);
        }
        this.f5514c.m2255a((bby) this);
        this.f5514c.m2003w();
    }

    /* renamed from: a */
    public void mo973a(View view, Map<String, WeakReference<View>> map, OnTouchListener onTouchListener, OnClickListener onClickListener) {
        if (((Boolean) bbb.cl.m7064c()).booleanValue()) {
            view.setOnTouchListener(onTouchListener);
            view.setClickable(true);
            view.setOnClickListener(onClickListener);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(onTouchListener);
                        view2.setClickable(true);
                        view2.setOnClickListener(onClickListener);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo967a(View view, Map<String, WeakReference<View>> map, JSONObject jSONObject, View view2) {
        aoi.m4687b("performClick must be called on the main UI thread.");
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    mo965a(view, (String) entry.getKey(), jSONObject, map, view2);
                    return;
                }
            }
        }
        if ("2".equals(this.f5518g.mo935k())) {
            mo965a(view, "2099", jSONObject, map, view2);
        } else if ("1".equals(this.f5518g.mo935k())) {
            mo965a(view, "1099", jSONObject, map, view2);
        }
    }

    /* renamed from: a */
    protected void m7330a(boolean z) {
        this.f5512a = z;
    }

    /* renamed from: a */
    public boolean mo968a() {
        bbq m = this.f5518g.mo937m();
        return m != null && m.m7204h();
    }

    /* renamed from: b */
    public void mo969b(View view, Map<String, WeakReference<View>> map) {
        if (!((Boolean) bbb.ck.m7064c()).booleanValue()) {
            view.setOnTouchListener(null);
            view.setClickable(false);
            view.setOnClickListener(null);
            if (map != null) {
                for (Entry value : map.entrySet()) {
                    View view2 = (View) ((WeakReference) value.getValue()).get();
                    if (view2 != null) {
                        view2.setOnTouchListener(null);
                        view2.setClickable(false);
                        view2.setOnClickListener(null);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    int[] m7333b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: c */
    int m7334c(View view) {
        return view.getMeasuredWidth();
    }

    /* renamed from: c */
    public void mo970c(View view, Map<String, WeakReference<View>> map) {
        synchronized (this.f5513b) {
            if (this.f5512a) {
            } else if (!view.isShown()) {
            } else if (view.getGlobalVisibleRect(new Rect(), null)) {
                mo966a(view, (Map) map);
            }
        }
    }

    /* renamed from: d */
    int m7336d(View view) {
        return view.getMeasuredHeight();
    }

    /* renamed from: d */
    public blo mo974d() {
        if (this.f5516e == null || this.f5516e.optJSONObject("overlay") == null) {
            return null;
        }
        blo h = m7341h();
        h.mo1305b().setVisibility(8);
        this.f5517f.m8352a(new C1011a(h).m7378a());
        return h;
    }

    /* renamed from: e */
    public View mo971e() {
        return this.f5523l != null ? (View) this.f5523l.get() : null;
    }

    /* renamed from: f */
    public Context mo972f() {
        return this.f5515d;
    }

    /* renamed from: g */
    public void m7340g() {
        this.f5514c.m2250M();
    }

    /* renamed from: h */
    blo m7341h() {
        return ako.m2344f().m9441a(this.f5515d, zzeg.m19667a(this.f5515d), false, false, this.f5519h, this.f5520i);
    }

    /* renamed from: i */
    ImageView m7342i() {
        return new ImageView(this.f5515d);
    }

    /* renamed from: j */
    public bjm m7343j() {
        if (!ako.m2336D().m8885c()) {
            return null;
        }
        if (this.f5522k == null) {
            this.f5522k = new bjm(this.f5515d, this.f5514c.m2248K());
        }
        return this.f5522k;
    }
}
