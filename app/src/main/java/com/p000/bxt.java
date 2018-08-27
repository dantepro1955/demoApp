package com.p000;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.mopub.mobileads.VastIconXmlManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: BaseVideoTracker */
/* renamed from: bxt */
abstract class bxt<PlayerOrIMAAd> {
    /* renamed from: b */
    protected static final bxz[] f8100b = new bxz[]{bxz.AD_EVT_FIRST_QUARTILE, bxz.AD_EVT_MID_POINT, bxz.AD_EVT_THIRD_QUARTILE};
    /* renamed from: a */
    protected boolean f8101a;
    /* renamed from: c */
    protected final Map<bxz, Integer> f8102c = new HashMap();
    /* renamed from: d */
    protected final Handler f8103d = new Handler();
    /* renamed from: e */
    protected Map<String, String> f8104e;
    /* renamed from: f */
    protected WeakReference<PlayerOrIMAAd> f8105f;
    /* renamed from: g */
    protected WeakReference<View> f8106g;
    /* renamed from: h */
    protected final bxr f8107h;
    /* renamed from: i */
    protected final byj f8108i;
    /* renamed from: j */
    private boolean f8109j;
    /* renamed from: k */
    private WeakReference<Context> f8110k;
    /* renamed from: l */
    private byf f8111l;

    /* compiled from: BaseVideoTracker */
    /* renamed from: bxt$1 */
    class C15791 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bxt f8099a;

        C15791(bxt bxt) {
            this.f8099a = bxt;
        }

        public void run() {
            try {
                this.f8099a.m11677a("Shutting down.");
                this.f8099a.f8111l.m11743b();
                this.f8099a.f8111l = null;
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
    }

    /* renamed from: a */
    protected abstract Map<String, Object> mo1606a() throws byu;

    public bxt(String str, bxr bxr, byj byj) {
        this.f8108i = byj;
        this.f8107h = bxr;
        m11677a("Initializing.");
        this.f8111l = new byf(str, byj, bxr);
        this.f8110k = new WeakReference(bxr.mo1595c());
        this.f8109j = false;
        this.f8101a = false;
    }

    /* renamed from: a */
    public boolean mo1608a(Map<String, String> map, PlayerOrIMAAd playerOrIMAAd, View view) {
        boolean z = true;
        boolean z2 = false;
        if (map == null) {
            try {
                m11677a("trackVideoAd received null adIds object. Not tracking.");
                z = false;
            } catch (Exception e) {
                byt.m11829a(e);
            }
        }
        if (view == null) {
            m11677a("trackVideoAd received null video view instance");
        }
        if (playerOrIMAAd == null) {
            m11677a("trackVideoAd received null ad instance. Not tracking.");
            z = false;
        }
        if (z) {
            String str = "trackVideoAd tracking ids: %s | ad: %s | view: %s";
            Object[] objArr = new Object[3];
            objArr[0] = new JSONObject(map).toString();
            objArr[1] = playerOrIMAAd.toString();
            objArr[2] = view != null ? view.getClass().getSimpleName() + "@" + view.hashCode() : "null";
            m11677a(String.format(str, objArr));
            this.f8104e = map;
            this.f8105f = new WeakReference(playerOrIMAAd);
            this.f8106g = new WeakReference(view);
            mo1597b();
        }
        z2 = z;
        m11677a("Attempt to start tracking ad was " + (z2 ? "" : "un") + "successful.");
        return z2;
    }

    /* renamed from: b */
    protected void mo1597b() throws byu {
        Map a = mo1606a();
        Integer num = (Integer) a.get("height");
        m11677a(String.format("Player metadata: height = %d, width = %d, duration = %d", new Object[]{num, (Integer) a.get("width"), (Integer) a.get(VastIconXmlManager.DURATION)}));
        this.f8111l.m11740a((View) this.f8106g.get(), this.f8104e, r3, num, r5);
    }

    /* renamed from: a */
    protected JSONObject mo1596a(bxy bxy) {
        if (Double.isNaN(bxy.f8144d.doubleValue())) {
            try {
                bxy.f8144d = Double.valueOf(m11684d());
            } catch (Exception e) {
                bxy.f8144d = Double.valueOf(1.0d);
            }
        }
        return new JSONObject(bxy.m11713a());
    }

    /* renamed from: b */
    private bxy m11673b(Map<String, Object> map) {
        Integer num;
        Double d;
        bxz a = bxz.m11714a((String) map.get("type"));
        if (map.containsKey("playHead")) {
            num = (Integer) map.get("playHead");
        } else {
            num = bxy.f8141a;
        }
        if (map.containsKey("adVolume")) {
            d = (Double) map.get("adVolume");
        } else {
            d = bxy.f8142b;
        }
        return new bxy(a, num, d);
    }

    /* renamed from: a */
    public void m11678a(Map<String, Object> map) {
        try {
            m11674c(m11673b((Map) map));
        } catch (Exception e) {
            byt.m11829a(e);
        }
    }

    /* renamed from: b */
    public void m11682b(bxy bxy) {
        try {
            m11674c(bxy);
        } catch (Exception e) {
            byt.m11829a(e);
        }
    }

    /* renamed from: c */
    private void m11674c(bxy bxy) throws byu {
        m11677a(String.format("Received event: %s", new Object[]{mo1596a(bxy).toString()}));
        this.f8111l.m11742a(r0);
        bxz bxz = bxy.f8145e;
        if (bxz == bxz.AD_EVT_COMPLETE || bxz == bxz.AD_EVT_STOPPED || bxz == bxz.AD_EVT_SKIPPED) {
            this.f8102c.put(bxz, Integer.valueOf(1));
            m11683c();
        }
    }

    /* renamed from: c */
    protected void m11683c() {
        if (!this.f8109j) {
            this.f8103d.postDelayed(new C15791(this), 500);
            this.f8109j = true;
        }
    }

    /* renamed from: a */
    private int m11670a(AudioManager audioManager) throws byu {
        return audioManager.getStreamVolume(3);
    }

    /* renamed from: d */
    protected double m11684d() throws byu {
        AudioManager audioManager = (AudioManager) ((Context) this.f8110k.get()).getSystemService("audio");
        return ((double) m11670a(audioManager)) / ((double) audioManager.getStreamMaxVolume(3));
    }

    /* renamed from: e */
    protected boolean m11685e() {
        return this.f8102c.containsKey(bxz.AD_EVT_COMPLETE) || this.f8102c.containsKey(bxz.AD_EVT_STOPPED) || this.f8102c.containsKey(bxz.AD_EVT_SKIPPED);
    }

    /* renamed from: a */
    protected void m11677a(String str) {
        if (this.f8108i.mo1615b() || this.f8101a) {
            Log.d("MoatVideoTracker", str);
        }
    }

    /* renamed from: a */
    protected boolean m11679a(Integer num, Integer num2) {
        return ((double) (num2.intValue() - num.intValue())) <= Math.min(750.0d, ((double) num2.intValue()) * 0.05d);
    }
}
