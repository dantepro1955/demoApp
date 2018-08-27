package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.GraphResponse;
import com.facebook.common.util.UriUtil;
import com.taplytics.sdk.Taplytics;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bby.C0997a;
import p000.bgu.C1002a;
import p000.bjt.C1254a;
import p000.bkn.C1184a;
import p000.bld.C1182a;

@bhd
/* renamed from: bgv */
public class bgv implements Callable<bjt> {
    /* renamed from: a */
    static long f6167a = TimeUnit.SECONDS.toMillis(60);
    /* renamed from: b */
    private final Context f6168b;
    /* renamed from: c */
    private final bkn f6169c;
    /* renamed from: d */
    private final akk f6170d;
    /* renamed from: e */
    private final avc f6171e;
    /* renamed from: f */
    private final bgu f6172f;
    /* renamed from: g */
    private final Object f6173g = new Object();
    /* renamed from: h */
    private final C1254a f6174h;
    /* renamed from: i */
    private final bbj f6175i;
    /* renamed from: j */
    private boolean f6176j;
    /* renamed from: k */
    private int f6177k;
    /* renamed from: l */
    private List<String> f6178l;
    /* renamed from: m */
    private JSONObject f6179m;
    /* renamed from: n */
    private String f6180n;

    /* renamed from: bgv$a */
    public interface C1186a<T extends C0997a> {
        /* renamed from: a */
        T mo1186a(bgv bgv, JSONObject jSONObject) throws JSONException, InterruptedException, ExecutionException;
    }

    /* renamed from: bgv$b */
    class C1187b {
        /* renamed from: a */
        public bcy f6166a;

        C1187b(bgv bgv) {
        }
    }

    public bgv(Context context, akk akk, bkn bkn, avc avc, C1254a c1254a, bbj bbj) {
        this.f6168b = context;
        this.f6170d = akk;
        this.f6169c = bkn;
        this.f6174h = c1254a;
        this.f6171e = avc;
        this.f6175i = bbj;
        this.f6172f = m8387a(context, c1254a, akk, avc);
        this.f6172f.m8351a();
        this.f6176j = false;
        this.f6177k = -2;
        this.f6178l = null;
        this.f6180n = null;
    }

    /* renamed from: a */
    private C0997a m8373a(C1186a c1186a, JSONObject jSONObject, String str) throws ExecutionException, InterruptedException, JSONException {
        if (m8398b() || c1186a == null || jSONObject == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tracking_urls_and_actions");
        String[] c = m8386c(jSONObject2, "impression_tracking_urls");
        this.f6178l = c == null ? null : Arrays.asList(c);
        this.f6179m = jSONObject2.optJSONObject("active_view");
        this.f6180n = jSONObject.optString("debug_signals");
        C0997a a = c1186a.mo1186a(this, jSONObject);
        if (a == null) {
            bky.m9008c("Failed to retrieve ad assets.");
            return null;
        }
        a.mo925a(new bbz(this.f6168b, this.f6170d, this.f6172f, this.f6171e, jSONObject, a, this.f6174h.f6529a.f15042k, str));
        return a;
    }

    /* renamed from: a */
    private ble<bbr> m8375a(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        final String string = z ? jSONObject.getString("url") : jSONObject.optString("url");
        final double optDouble = jSONObject.optDouble("scale", 1.0d);
        final boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            m8396a(0, z);
            return new blc(null);
        } else if (z2) {
            return new blc(new bbr(null, Uri.parse(string), optDouble));
        } else {
            final boolean z3 = z;
            return this.f6169c.m9254a(string, new C1184a<bbr>(this) {
                /* renamed from: e */
                final /* synthetic */ bgv f6165e;

                /* renamed from: a */
                public bbr m8368a() {
                    this.f6165e.m8396a(2, z3);
                    return null;
                }

                @TargetApi(19)
                /* renamed from: a */
                public bbr m8369a(InputStream inputStream) {
                    Bitmap decodeStream;
                    Options options = new Options();
                    options.inDensity = (int) (160.0d * optDouble);
                    if (!optBoolean) {
                        options.inPreferredConfig = Config.RGB_565;
                    }
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    } catch (Throwable e) {
                        bky.m9007b("Error grabbing image.", e);
                        decodeStream = null;
                    }
                    if (decodeStream == null) {
                        this.f6165e.m8396a(2, z3);
                        return null;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    if (aqd.m4917g() && bkc.m9014b()) {
                        int width = decodeStream.getWidth();
                        int height = decodeStream.getHeight();
                        bkc.m9012a("Decoded image w: " + width + " h:" + height + " bytes: " + decodeStream.getAllocationByteCount() + " time: " + (uptimeMillis2 - uptimeMillis) + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
                    }
                    return new bbr(new BitmapDrawable(Resources.getSystem(), decodeStream), Uri.parse(string), optDouble);
                }

                /* renamed from: b */
                public /* synthetic */ Object mo1183b() {
                    return m8368a();
                }

                @TargetApi(19)
                /* renamed from: b */
                public /* synthetic */ Object mo1184b(InputStream inputStream) {
                    return m8369a(inputStream);
                }
            });
        }
    }

    /* renamed from: a */
    static blo m8376a(ble<blo> ble) {
        Throwable e;
        try {
            return (blo) ble.get((long) ((Integer) bbb.cm.m7064c()).intValue(), TimeUnit.SECONDS);
        } catch (Throwable e2) {
            bky.m9009c("InterruptedException occurred while waiting for video to load", e2);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e3) {
            e2 = e3;
            bky.m9009c("Exception occurred while waiting for video to load", e2);
        } catch (TimeoutException e4) {
            e2 = e4;
            bky.m9009c("Exception occurred while waiting for video to load", e2);
        } catch (CancellationException e5) {
            e2 = e5;
            bky.m9009c("Exception occurred while waiting for video to load", e2);
        }
        return null;
    }

    /* renamed from: a */
    private JSONObject m8378a(final String str) throws ExecutionException, InterruptedException, TimeoutException, JSONException {
        if (m8398b()) {
            return null;
        }
        final blb blb = new blb();
        final C1187b c1187b = new C1187b(this);
        this.f6172f.m8352a(new C1002a(this) {
            /* renamed from: d */
            final /* synthetic */ bgv f6146d;

            /* renamed from: a */
            public void mo1181a() {
                blb.m7770b(null);
            }

            /* renamed from: a */
            public void mo975a(final bef bef) {
                bcy c11771 = new bcy(this) {
                    /* renamed from: b */
                    final /* synthetic */ C11781 f6142b;

                    /* renamed from: a */
                    public void mo277a(blo blo, Map<String, String> map) {
                        try {
                            JSONObject jSONObject;
                            int i;
                            String str = (String) map.get(GraphResponse.SUCCESS_KEY);
                            String str2 = (String) map.get("failure");
                            if (TextUtils.isEmpty(str2)) {
                                jSONObject = new JSONObject(str);
                                i = 1;
                            } else {
                                jSONObject = new JSONObject(str2);
                                i = 0;
                            }
                            if (str.equals(jSONObject.optString("ads_id", ""))) {
                                bef.mo1028b("/nativeAdPreProcess", c1187b.f6166a);
                                if (i != 0) {
                                    JSONArray optJSONArray = jSONObject.optJSONArray("ads");
                                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                                        this.f6142b.f6146d.m8395a(3);
                                        blb.m7770b(null);
                                        return;
                                    }
                                    blb.m7770b(optJSONArray.getJSONObject(0));
                                    return;
                                }
                                this.f6142b.f6146d.m8395a(0);
                                aoi.m4685a(this.f6142b.f6146d.m8398b(), (Object) "Unable to set the ad state error!");
                                blb.m7770b(null);
                            }
                        } catch (Throwable e) {
                            bky.m9007b("Malformed native JSON response.", e);
                        }
                    }
                };
                c1187b.f6166a = c11771;
                bef.mo1023a("/nativeAdPreProcess", c11771);
                try {
                    JSONObject jSONObject = new JSONObject(this.f6146d.f6174h.f6530b.f15077c);
                    jSONObject.put("ads_id", str);
                    bef.mo1025a("google.afma.nativeAds.preProcessJsonGmsg", jSONObject);
                } catch (Throwable e) {
                    bky.m9009c("Exception occurred while invoking javascript", e);
                    blb.m7770b(null);
                }
            }
        });
        return (JSONObject) blb.get(f6167a, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    private void m8379a(C0997a c0997a) {
        if (c0997a instanceof bbu) {
            final bbu bbu = (bbu) c0997a;
            C1187b c1187b = new C1187b(this);
            final bcy c11803 = new bcy(this) {
                /* renamed from: b */
                final /* synthetic */ bgv f6151b;

                /* renamed from: a */
                public void mo277a(blo blo, Map<String, String> map) {
                    this.f6151b.m8380a(bbu, (String) map.get(UriUtil.LOCAL_ASSET_SCHEME));
                }
            };
            c1187b.f6166a = c11803;
            this.f6172f.m8352a(new C1002a(this) {
                /* renamed from: a */
                public void mo975a(bef bef) {
                    bef.mo1023a("/nativeAdCustomClick", c11803);
                }
            });
        }
    }

    /* renamed from: a */
    private void m8380a(bck bck, String str) {
        try {
            bcn c = this.f6170d.m2268c(bck.mo936l());
            if (c != null) {
                c.mo1001a(bck, str);
            }
        } catch (Throwable e) {
            bky.m9009c(new StringBuilder(String.valueOf(str).length() + 40).append("Failed to call onCustomClick for asset ").append(str).append(".").toString(), e);
        }
    }

    /* renamed from: b */
    private bjt m8383b(C0997a c0997a) {
        int i;
        synchronized (this.f6173g) {
            i = this.f6177k;
            if (c0997a == null && this.f6177k == -2) {
                i = 0;
            }
        }
        return new bjt(this.f6174h.f6529a.f15034c, null, this.f6174h.f6530b.f15078d, i, this.f6174h.f6530b.f15080f, this.f6178l, this.f6174h.f6530b.f15086l, this.f6174h.f6530b.f15085k, this.f6174h.f6529a.f15040i, false, null, null, null, null, null, 0, this.f6174h.f6532d, this.f6174h.f6530b.f15081g, this.f6174h.f6534f, this.f6174h.f6535g, this.f6174h.f6530b.f15089o, this.f6179m, i != -2 ? null : c0997a, null, null, null, this.f6174h.f6530b.f15063F, this.f6174h.f6530b.f15064G, null, this.f6174h.f6530b.f15067J, this.f6180n);
    }

    /* renamed from: b */
    private Integer m8384b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: b */
    private static List<Drawable> m8385b(List<bbr> list) throws RemoteException {
        List<Drawable> arrayList = new ArrayList();
        for (bbr a : list) {
            arrayList.add((Drawable) aqr.m4968a(a.mo921a()));
        }
        return arrayList;
    }

    /* renamed from: c */
    private String[] m8386c(JSONObject jSONObject, String str) throws JSONException {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        String[] strArr = new String[optJSONArray.length()];
        for (int i = 0; i < optJSONArray.length(); i++) {
            strArr[i] = optJSONArray.getString(i);
        }
        return strArr;
    }

    /* renamed from: a */
    bgu m8387a(Context context, C1254a c1254a, akk akk, avc avc) {
        return new bgu(context, c1254a, akk, avc);
    }

    /* renamed from: a */
    protected C1186a m8388a(JSONObject jSONObject) throws ExecutionException, InterruptedException, JSONException, TimeoutException {
        if (m8398b() || jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("template_id");
        boolean z = this.f6174h.f6529a.f15056y != null ? this.f6174h.f6529a.f15056y.f14962b : false;
        boolean z2 = this.f6174h.f6529a.f15056y != null ? this.f6174h.f6529a.f15056y.f14964d : false;
        if ("2".equals(string)) {
            return new bgx(z, z2);
        }
        if ("1".equals(string)) {
            return new bgz(z, z2);
        }
        if ("3".equals(string)) {
            final String string2 = jSONObject.getString("custom_template_id");
            final blb blb = new blb();
            bkg.f6710a.post(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ bgv f6149c;

                public void run() {
                    blb.m7770b((bco) this.f6149c.f6170d.m2249L().get(string2));
                }
            });
            if (blb.get(f6167a, TimeUnit.MILLISECONDS) != null) {
                return new bha(z);
            }
            string2 = "No handler for custom template: ";
            String valueOf = String.valueOf(jSONObject.getString("custom_template_id"));
            bky.m9008c(valueOf.length() != 0 ? string2.concat(valueOf) : new String(string2));
        } else {
            m8395a(0);
        }
        return null;
    }

    /* renamed from: a */
    bgw m8389a(Context context, avc avc, C1254a c1254a, bbj bbj, akk akk) {
        return new bgw(context, avc, c1254a, bbj, akk);
    }

    /* renamed from: a */
    public bjt m8390a() {
        try {
            this.f6172f.m8353b();
            String c = m8399c();
            JSONObject a = m8378a(c);
            C0997a a2 = m8373a(m8388a(a), a, c);
            m8379a(a2);
            return m8383b(a2);
        } catch (CancellationException e) {
            if (!this.f6176j) {
                m8395a(0);
            }
            return m8383b(null);
        } catch (ExecutionException e2) {
            if (this.f6176j) {
                m8395a(0);
            }
            return m8383b(null);
        } catch (InterruptedException e3) {
            if (this.f6176j) {
                m8395a(0);
            }
            return m8383b(null);
        } catch (Throwable e4) {
            bky.m9009c("Malformed native JSON response.", e4);
            if (this.f6176j) {
                m8395a(0);
            }
            return m8383b(null);
        } catch (Throwable e42) {
            bky.m9009c("Timeout when loading native ad.", e42);
            if (this.f6176j) {
                m8395a(0);
            }
            return m8383b(null);
        }
    }

    /* renamed from: a */
    public ble<blo> m8391a(JSONObject jSONObject, String str) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return new blc(null);
        }
        if (!TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            return m8389a(this.f6168b, this.f6171e, this.f6174h, this.f6175i, this.f6170d).m8413a(optJSONObject);
        }
        bky.m9011e("Required field 'vast_xml' is missing");
        return new blc(null);
    }

    /* renamed from: a */
    public ble<bbr> m8392a(JSONObject jSONObject, String str, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m8375a(jSONObject2, z, z2);
    }

    /* renamed from: a */
    public List<ble<bbr>> m8393a(JSONObject jSONObject, String str, boolean z, boolean z2, boolean z3) throws JSONException {
        JSONArray jSONArray = z ? jSONObject.getJSONArray(str) : jSONObject.optJSONArray(str);
        List<ble<bbr>> arrayList = new ArrayList();
        if (jSONArray == null || jSONArray.length() == 0) {
            m8396a(0, z);
            return arrayList;
        }
        int length = z3 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(m8375a(jSONObject2, z, z2));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Future<bbr> m8394a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        boolean optBoolean = jSONObject2.optBoolean("require", true);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return m8375a(jSONObject2, optBoolean, z);
    }

    /* renamed from: a */
    public void m8395a(int i) {
        synchronized (this.f6173g) {
            this.f6176j = true;
            this.f6177k = i;
        }
    }

    /* renamed from: a */
    public void m8396a(int i, boolean z) {
        if (z) {
            m8395a(i);
        }
    }

    /* renamed from: b */
    public ble<bbq> m8397b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return new blc(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b = m8384b(optJSONObject, "text_color");
        Integer b2 = m8384b(optJSONObject, "bg_color");
        final int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        final int optInt3 = optJSONObject.optInt("presentation_ms", Taplytics.TAPLYTICS_DEFAULT_TIMEOUT);
        final int i = (this.f6174h.f6529a.f15056y == null || this.f6174h.f6529a.f15056y.f14961a < 2) ? 1 : this.f6174h.f6529a.f15056y.f14965e;
        final boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List arrayList = new ArrayList();
        if (optJSONObject.optJSONArray("images") != null) {
            arrayList = m8393a(optJSONObject, "images", false, false, true);
        } else {
            arrayList.add(m8392a(optJSONObject, "image", false, false));
        }
        final String str = optString;
        final Integer num = b2;
        final Integer num2 = b;
        final int i2 = optInt;
        return bld.m9318a(bld.m9319a(arrayList), new C1182a<List<bbr>, bbq>(this) {
            /* renamed from: a */
            public bbq m8364a(List<bbr> list) {
                bbq bbq;
                if (list != null) {
                    try {
                        if (!list.isEmpty()) {
                            bbq = new bbq(str, bgv.m8385b((List) list), num, num2, i2 > 0 ? Integer.valueOf(i2) : null, optInt3 + optInt2, i, optBoolean);
                            return bbq;
                        }
                    } catch (Throwable e) {
                        bky.m9007b("Could not get attribution icon", e);
                        return null;
                    }
                }
                bbq = null;
                return bbq;
            }

            /* renamed from: a */
            public /* synthetic */ Object mo1182a(Object obj) {
                return m8364a((List) obj);
            }
        });
    }

    /* renamed from: b */
    public boolean m8398b() {
        boolean z;
        synchronized (this.f6173g) {
            z = this.f6176j;
        }
        return z;
    }

    /* renamed from: c */
    String m8399c() {
        return UUID.randomUUID().toString();
    }

    public /* synthetic */ Object call() throws Exception {
        return m8390a();
    }
}
