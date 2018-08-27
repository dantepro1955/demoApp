package com.p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.internal.ServerProtocol;
import com.inmobi.monetization.internal.NativeAd;
import com.mopub.nativeads.MoPubNativeAdPositioning.MoPubClientPositioning;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p000.bxw.C1582a;

/* compiled from: ViewTrackerImpl */
/* renamed from: byn */
class byn implements C1582a, bym {
    /* renamed from: a */
    private View f8224a;
    /* renamed from: b */
    private final WebView f8225b;
    /* renamed from: c */
    private boolean f8226c;
    /* renamed from: d */
    private final bxw f8227d;
    /* renamed from: e */
    private final bxr f8228e;
    /* renamed from: f */
    private final byj f8229f;
    /* renamed from: g */
    private byv<String> f8230g;

    byn(View view, WebView webView, boolean z, bxr bxr, byj byj) {
        this(view, webView, z, new bxx(webView.getContext(), byj), bxr, byj);
    }

    byn(View view, WebView webView, boolean z, bxw bxw, bxr bxr, byj byj) {
        bys.m11828a(view);
        bys.m11828a(webView);
        bys.m11828a(bxr);
        bys.m11828a(bxw);
        if (byj.mo1615b()) {
            Log.d("MoatViewTracker", "In initialization method.");
        }
        this.f8228e = bxr;
        this.f8224a = view;
        this.f8225b = webView;
        this.f8226c = z;
        this.f8227d = bxw;
        this.f8229f = byj;
        this.f8230g = byv.m11830a();
    }

    /* renamed from: c */
    public boolean mo1625c() throws byu {
        if (this.f8229f.mo1615b()) {
            Log.d("MoatViewTracker", "Attempting bridge installation.");
        }
        boolean a = this.f8227d.mo1599a(this.f8225b, this);
        if (this.f8229f.mo1615b()) {
            Log.d("MoatViewTracker", "Bridge " + (a ? "" : "not ") + "installed.");
        }
        return a;
    }

    /* renamed from: d */
    public void mo1626d() {
        this.f8227d.mo1598a();
    }

    /* renamed from: a */
    private static String m11810a(Map<String, String> map, boolean z) {
        StringBuilder stringBuilder = new StringBuilder("{");
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (stringBuilder.length() > 1) {
                stringBuilder.append(',');
            }
            stringBuilder.append('\"').append(str).append('\"').append(':');
            if (z) {
                stringBuilder.append('\"').append(str2).append('\"');
            } else {
                stringBuilder.append(str2);
            }
        }
        stringBuilder.append("}");
        return "" + stringBuilder;
    }

    /* renamed from: a */
    private static String m11809a(Rect rect) {
        int i = rect.left;
        int i2 = rect.right - rect.left;
        int i3 = rect.bottom - rect.top;
        return new StringBuilder("{").append('\"').append("x").append('\"').append(":").append(i).append(',').append('\"').append("y").append('\"').append(":").append(rect.top).append(',').append('\"').append("w").append('\"').append(":").append(i2).append(',').append('\"').append("h").append('\"').append(":").append(i3).append('}') + "";
    }

    /* renamed from: a */
    public String mo1623a() throws byu {
        int i = 0;
        Map hashMap = new HashMap();
        try {
            Rect i2 = m11816i();
            Rect c = m11813c(i2);
            Rect f = m11824f();
            m11811a(hashMap, "screen", i2);
            m11811a(hashMap, "visible", c);
            m11811a(hashMap, "maybe", c);
            m11811a(hashMap, "view", f);
            if (m11815h()) {
                i = 1;
            }
            hashMap.put("inFocus", i + "");
            hashMap.put("dr", "" + m11817j().density);
            return byn.m11810a(hashMap, false);
        } catch (Exception e) {
            return "{}";
        }
    }

    /* renamed from: g */
    private String m11814g() {
        Exception e;
        if (this.f8230g.m11834c()) {
            return (String) this.f8230g.m11832b();
        }
        String str = "_unknown_";
        String charSequence;
        try {
            Context context = this.f8225b.getContext();
            charSequence = context.getPackageManager().getApplicationLabel(context.getApplicationContext().getApplicationInfo()).toString();
            try {
                this.f8230g = byv.m11831a(charSequence);
                return charSequence;
            } catch (Exception e2) {
                e = e2;
                byt.m11829a(e);
                return charSequence;
            }
        } catch (Exception e3) {
            Exception exception = e3;
            charSequence = str;
            e = exception;
            byt.m11829a(e);
            return charSequence;
        }
    }

    /* renamed from: e */
    public Map<String, String> m11823e() {
        Map<String, String> hashMap = new HashMap();
        String str = "4724e28a731f8ba73e9eecc4d5c807705dd80963";
        str = "AOL";
        str = "1.7.11";
        String g = m11814g();
        String num = Integer.toString(VERSION.SDK_INT);
        Object obj = this.f8226c ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO;
        hashMap.put("versionHash", "4724e28a731f8ba73e9eecc4d5c807705dd80963");
        hashMap.put("appName", g);
        hashMap.put(NativeAd.KEY_NAMESPACE, "AOL");
        hashMap.put(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, "1.7.11");
        hashMap.put("deviceOS", num);
        hashMap.put("isNative", obj);
        return hashMap;
    }

    /* renamed from: b */
    public String mo1624b() {
        try {
            return byn.m11810a(m11823e(), true);
        } catch (Exception e) {
            return "{}";
        }
    }

    /* renamed from: h */
    private boolean m11815h() {
        return this.f8224a.isShown() && !this.f8228e.mo1593a();
    }

    /* renamed from: a */
    private void m11811a(Map<String, String> map, String str, Rect rect) {
        map.put(str, byn.m11809a(m11812b(rect)));
    }

    /* renamed from: f */
    public Rect m11824f() throws byu {
        int[] iArr = new int[]{MoPubClientPositioning.NO_REPEAT, MoPubClientPositioning.NO_REPEAT};
        this.f8224a.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, this.f8224a.getWidth() + i, this.f8224a.getHeight() + i2);
    }

    /* renamed from: i */
    private Rect m11816i() {
        DisplayMetrics j = m11817j();
        return new Rect(0, 0, j.widthPixels, j.heightPixels);
    }

    /* renamed from: b */
    private Rect m11812b(Rect rect) {
        float f = m11817j().density;
        if (f == 0.0f) {
            return rect;
        }
        return new Rect(Math.round(((float) rect.left) / f), Math.round(((float) rect.top) / f), Math.round(((float) rect.right) / f), Math.round(((float) rect.bottom) / f));
    }

    /* renamed from: j */
    private DisplayMetrics m11817j() {
        return this.f8224a.getContext().getResources().getDisplayMetrics();
    }

    /* renamed from: c */
    private Rect m11813c(Rect rect) {
        Rect k = m11818k();
        if (!this.f8224a.getGlobalVisibleRect(k)) {
            k = m11818k();
        }
        k.left = Math.min(Math.max(0, k.left), rect.right);
        k.right = Math.min(Math.max(0, k.right), rect.right);
        k.top = Math.min(Math.max(0, k.top), rect.bottom);
        k.bottom = Math.min(Math.max(0, k.bottom), rect.bottom);
        return k;
    }

    /* renamed from: k */
    private Rect m11818k() {
        return new Rect(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
    }
}
