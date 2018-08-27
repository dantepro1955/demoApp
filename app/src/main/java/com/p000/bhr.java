package com.p000;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmk.C3314a;
import com.google.android.gms.internal.zzmn;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bee.C1109c;
import p000.bhe.C0219a;
import p000.bjt.C1254a;
import p000.blh.C0242c;
import p000.blh.C0892a;

@bhd
/* renamed from: bhr */
public class bhr extends bkb {
    /* renamed from: a */
    static final long f6269a = TimeUnit.SECONDS.toMillis(10);
    /* renamed from: b */
    static boolean f6270b = false;
    /* renamed from: c */
    private static final Object f6271c = new Object();
    /* renamed from: d */
    private static bee f6272d = null;
    /* renamed from: e */
    private static bcz f6273e = null;
    /* renamed from: f */
    private static bdd f6274f = null;
    /* renamed from: g */
    private static bcy f6275g = null;
    /* renamed from: h */
    private final C0219a f6276h;
    /* renamed from: i */
    private final C3314a f6277i;
    /* renamed from: j */
    private final Object f6278j = new Object();
    /* renamed from: k */
    private final Context f6279k;
    /* renamed from: l */
    private C1109c f6280l;

    /* renamed from: bhr$3 */
    class C12163 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bhr f6268a;

        C12163(bhr bhr) {
            this.f6268a = bhr;
        }

        public void run() {
            if (this.f6268a.f6280l != null) {
                this.f6268a.f6280l.j_();
                this.f6268a.f6280l = null;
            }
        }
    }

    /* renamed from: bhr$a */
    public static class C1217a implements bkl<beb> {
        /* renamed from: a */
        public void m8517a(beb beb) {
            bhr.m8528b(beb);
        }

        /* renamed from: a */
        public /* synthetic */ void mo1031a(Object obj) {
            m8517a((beb) obj);
        }
    }

    /* renamed from: bhr$b */
    public static class C1218b implements bkl<beb> {
        /* renamed from: a */
        public void m8519a(beb beb) {
            bhr.m8526a(beb);
        }

        /* renamed from: a */
        public /* synthetic */ void mo1031a(Object obj) {
            m8519a((beb) obj);
        }
    }

    /* renamed from: bhr$c */
    public static class C1219c implements bcy {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get("request_id");
            String str2 = "Invalid request: ";
            String valueOf = String.valueOf((String) map.get("errors"));
            bky.m9011e(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            bhr.f6274f.m7569b(str);
        }
    }

    public bhr(Context context, C3314a c3314a, C0219a c0219a) {
        super(true);
        this.f6276h = c0219a;
        this.f6279k = context;
        this.f6277i = c3314a;
        synchronized (f6271c) {
            if (!f6270b) {
                f6274f = new bdd();
                f6273e = new bcz(context.getApplicationContext(), c3314a.f14993j);
                f6275g = new C1219c();
                f6272d = new bee(this.f6279k.getApplicationContext(), this.f6277i.f14993j, (String) bbb.f5395b.m7064c(), new C1218b(), new C1217a());
                f6270b = true;
            }
        }
    }

    /* renamed from: a */
    private zzmn m8524a(zzmk zzmk) {
        final String c = ako.m2343e().m9126c();
        final JSONObject a = m8525a(zzmk, c);
        if (a == null) {
            return new zzmn(0);
        }
        long b = ako.m2349k().mo607b();
        Future a2 = f6274f.m7566a(c);
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bhr f6267c;

            /* renamed from: bhr$2$1 */
            class C12131 implements C0242c<bef> {
                /* renamed from: a */
                final /* synthetic */ C12152 f6263a;

                C12131(C12152 c12152) {
                    this.f6263a = c12152;
                }

                /* renamed from: a */
                public void m8514a(bef bef) {
                    try {
                        bef.mo1025a("AFMA_getAdapterLessMediationAd", a);
                    } catch (Throwable e) {
                        bky.m9007b("Error requesting an ad url", e);
                        bhr.f6274f.m7569b(c);
                    }
                }

                /* renamed from: a */
                public /* synthetic */ void mo289a(Object obj) {
                    m8514a((bef) obj);
                }
            }

            /* renamed from: bhr$2$2 */
            class C12142 implements C0892a {
                /* renamed from: a */
                final /* synthetic */ C12152 f6264a;

                C12142(C12152 c12152) {
                    this.f6264a = c12152;
                }

                /* renamed from: a */
                public void mo852a() {
                    bhr.f6274f.m7569b(c);
                }
            }

            public void run() {
                this.f6267c.f6280l = bhr.f6272d.m7834a();
                this.f6267c.f6280l.mo1032a(new C12131(this), new C12142(this));
            }
        });
        try {
            JSONObject jSONObject = (JSONObject) a2.get(f6269a - (ako.m2349k().mo607b() - b), TimeUnit.MILLISECONDS);
            if (jSONObject == null) {
                return new zzmn(-1);
            }
            zzmn a3 = bhx.m8567a(this.f6279k, zzmk, jSONObject.toString());
            return (a3.f15079e == -3 || !TextUtils.isEmpty(a3.f15077c)) ? a3 : new zzmn(3);
        } catch (CancellationException e) {
            return new zzmn(-1);
        } catch (InterruptedException e2) {
            return new zzmn(-1);
        } catch (TimeoutException e3) {
            return new zzmn(2);
        } catch (ExecutionException e4) {
            return new zzmn(0);
        }
    }

    /* renamed from: a */
    private JSONObject m8525a(zzmk zzmk, String str) {
        Throwable e;
        Object obj;
        Info advertisingIdInfo;
        Map hashMap;
        JSONObject jSONObject = null;
        Bundle bundle = zzmk.f15034c.f14915c.getBundle("sdk_less_server_data");
        if (bundle != null) {
            bic bic;
            try {
                bic = (bic) ako.m2352n().m8665a(this.f6279k).get();
            } catch (Throwable e2) {
                bky.m9009c("Error grabbing device info: ", e2);
                obj = jSONObject;
            }
            JSONObject a = bhx.m8573a(this.f6279k, new bhu().m8546a(zzmk).m8543a(bic));
            if (a != null) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f6279k);
                } catch (IOException e3) {
                    e2 = e3;
                    bky.m9009c("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put(AdDatabaseHelper.COLUMN_AD_ID, advertisingIdInfo.getId());
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = ako.m2343e().m9095a(hashMap);
                    return jSONObject;
                } catch (IllegalStateException e4) {
                    e2 = e4;
                    bky.m9009c("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put(AdDatabaseHelper.COLUMN_AD_ID, advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = ako.m2343e().m9095a(hashMap);
                    return jSONObject;
                } catch (ank e5) {
                    e2 = e5;
                    bky.m9009c("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put(AdDatabaseHelper.COLUMN_AD_ID, advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = ako.m2343e().m9095a(hashMap);
                    return jSONObject;
                } catch (anl e6) {
                    e2 = e6;
                    bky.m9009c("Cannot get advertising id info", e2);
                    obj = jSONObject;
                    hashMap = new HashMap();
                    hashMap.put("request_id", str);
                    hashMap.put("request_param", a);
                    hashMap.put("data", bundle);
                    if (advertisingIdInfo != null) {
                        hashMap.put(AdDatabaseHelper.COLUMN_AD_ID, advertisingIdInfo.getId());
                        if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                        }
                        hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                    }
                    jSONObject = ako.m2343e().m9095a(hashMap);
                    return jSONObject;
                }
                hashMap = new HashMap();
                hashMap.put("request_id", str);
                hashMap.put("request_param", a);
                hashMap.put("data", bundle);
                if (advertisingIdInfo != null) {
                    hashMap.put(AdDatabaseHelper.COLUMN_AD_ID, advertisingIdInfo.getId());
                    if (advertisingIdInfo.isLimitAdTrackingEnabled()) {
                    }
                    hashMap.put("lat", Integer.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled() ? 0 : 1));
                }
                try {
                    jSONObject = ako.m2343e().m9095a(hashMap);
                } catch (JSONException e7) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    protected static void m8526a(beb beb) {
        beb.mo1023a("/loadAd", f6274f);
        beb.mo1023a("/fetchHttpRequest", f6273e);
        beb.mo1023a("/invalidRequest", f6275g);
    }

    /* renamed from: b */
    protected static void m8528b(beb beb) {
        beb.mo1028b("/loadAd", f6274f);
        beb.mo1028b("/fetchHttpRequest", f6273e);
        beb.mo1028b("/invalidRequest", f6275g);
    }

    /* renamed from: a */
    public void mo196a() {
        bky.m9006b("SdkLessAdLoaderBackgroundTask started.");
        String d = ako.m2336D().m8886d(this.f6279k);
        zzmk zzmk = new zzmk(this.f6277i, -1, ako.m2336D().m8880b(this.f6279k), ako.m2336D().m8883c(this.f6279k), d);
        ako.m2336D().m8889e(this.f6279k, d);
        zzmn a = m8524a(zzmk);
        zzmk zzmk2 = zzmk;
        ben ben = null;
        zzeg zzeg = null;
        final C1254a c1254a = new C1254a(zzmk2, a, ben, zzeg, a.f15079e, ako.m2349k().mo607b(), a.f15088n, null);
        bkx.f6798a.post(new Runnable(this) {
            /* renamed from: b */
            final /* synthetic */ bhr f6262b;

            public void run() {
                this.f6262b.f6276h.mo234a(c1254a);
                if (this.f6262b.f6280l != null) {
                    this.f6262b.f6280l.j_();
                    this.f6262b.f6280l = null;
                }
            }
        });
    }

    /* renamed from: b */
    public void mo197b() {
        synchronized (this.f6278j) {
            bkx.f6798a.post(new C12163(this));
        }
    }
}
