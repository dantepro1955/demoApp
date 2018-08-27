package com.p000;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzqh;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bee.C1105b;
import p000.bee.C1109c;
import p000.bho.C1210a;
import p000.big.C1235a;
import p000.blh.C0242c;
import p000.blh.C0892a;

@bhd
/* renamed from: bhw */
public final class bhw extends C1210a {
    /* renamed from: a */
    private static final Object f6324a = new Object();
    /* renamed from: b */
    private static bhw f6325b;
    /* renamed from: c */
    private final Context f6326c;
    /* renamed from: d */
    private final bhv f6327d;
    /* renamed from: e */
    private final bat f6328e;
    /* renamed from: f */
    private final bee f6329f;

    /* renamed from: bhw$1 */
    class C12221 implements Callable<Void> {
        /* renamed from: a */
        final /* synthetic */ bhv f6306a;
        /* renamed from: b */
        final /* synthetic */ Context f6307b;
        /* renamed from: c */
        final /* synthetic */ zzmk f6308c;
        /* renamed from: d */
        final /* synthetic */ Bundle f6309d;

        C12221(bhv bhv, Context context, zzmk zzmk, Bundle bundle) {
            this.f6306a = bhv;
            this.f6307b = context;
            this.f6308c = zzmk;
            this.f6309d = bundle;
        }

        /* renamed from: a */
        public Void m8553a() throws Exception {
            String str = this.f6308c.f15038g.packageName;
            return null;
        }

        public /* synthetic */ Object call() throws Exception {
            return m8553a();
        }
    }

    /* renamed from: bhw$2 */
    class C12252 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bee f6312a;
        /* renamed from: b */
        final /* synthetic */ bhy f6313b;
        /* renamed from: c */
        final /* synthetic */ bbj f6314c;
        /* renamed from: d */
        final /* synthetic */ bbh f6315d;
        /* renamed from: e */
        final /* synthetic */ String f6316e;

        /* renamed from: bhw$2$2 */
        class C12242 implements C0892a {
            C12242(C12252 c12252) {
            }

            /* renamed from: a */
            public void mo852a() {
            }
        }

        C12252(bee bee, bhy bhy, bbj bbj, bbh bbh, String str) {
            this.f6312a = bee;
            this.f6313b = bhy;
            this.f6314c = bbj;
            this.f6315d = bbh;
            this.f6316e = str;
        }

        public void run() {
            C1109c a = this.f6312a.m7834a();
            this.f6313b.m8590a(a);
            this.f6314c.m7167a(this.f6315d, "rwc");
            final bbh a2 = this.f6314c.m7161a();
            a.mo1032a(new C0242c<bef>(this) {
                /* renamed from: b */
                final /* synthetic */ C12252 f6311b;

                /* renamed from: a */
                public void m8554a(bef bef) {
                    this.f6311b.f6314c.m7167a(a2, "jsf");
                    this.f6311b.f6314c.m7168b();
                    bef.mo1023a("/invalidRequest", this.f6311b.f6313b.f6335b);
                    bef.mo1023a("/loadAdURL", this.f6311b.f6313b.f6336c);
                    bef.mo1023a("/loadAd", this.f6311b.f6313b.f6337d);
                    try {
                        bef.mo1024a("AFMA_getAd", this.f6311b.f6316e);
                    } catch (Throwable e) {
                        bky.m9007b("Error requesting an ad url", e);
                    }
                }

                /* renamed from: a */
                public /* synthetic */ void mo289a(Object obj) {
                    m8554a((bef) obj);
                }
            }, new C12242(this));
        }
    }

    /* renamed from: bhw$3 */
    class C12263 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ bhv f6317a;
        /* renamed from: b */
        final /* synthetic */ Context f6318b;
        /* renamed from: c */
        final /* synthetic */ bhy f6319c;
        /* renamed from: d */
        final /* synthetic */ zzmk f6320d;

        C12263(bhv bhv, Context context, bhy bhy, zzmk zzmk) {
            this.f6317a = bhv;
            this.f6318b = context;
            this.f6319c = bhy;
            this.f6320d = zzmk;
        }

        public void run() {
            this.f6317a.f6300e.mo1201a(this.f6318b, this.f6319c, this.f6320d.f15042k);
        }
    }

    /* renamed from: bhw$4 */
    class C12274 implements bkl<beb> {
        C12274(bhw bhw) {
        }

        /* renamed from: a */
        public void m8557a(beb beb) {
            beb.mo1023a("/log", bcx.f5601i);
        }

        /* renamed from: a */
        public /* synthetic */ void mo1031a(Object obj) {
            m8557a((beb) obj);
        }
    }

    bhw(Context context, bat bat, bhv bhv) {
        this.f6326c = context;
        this.f6327d = bhv;
        this.f6328e = bat;
        this.f6329f = new bee(context.getApplicationContext() != null ? context.getApplicationContext() : context, zzqh.m19684a(), bat.m7051a(), new C12274(this), new C1105b());
    }

    /* renamed from: a */
    public static bhw m8559a(Context context, bat bat, bhv bhv) {
        bhw bhw;
        synchronized (f6324a) {
            if (f6325b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                f6325b = new bhw(context, bat, bhv);
            }
            bhw = f6325b;
        }
        return bhw;
    }

    /* renamed from: a */
    private static zzmn m8560a(Context context, bee bee, bat bat, bhv bhv, zzmk zzmk) {
        Future a;
        Future a2;
        Bundle bundle;
        Future future;
        Throwable e;
        String str;
        bky.m9006b("Starting ad request from service using: AFMA_getAd");
        bbb.m7128a(context);
        bbj bbj = new bbj(((Boolean) bbb.f5387T.m7064c()).booleanValue(), "load_ad", zzmk.f15035d.f14931a);
        if (zzmk.f15032a > 10 && zzmk.f15010A != -1) {
            bbj.m7167a(bbj.m7162a(zzmk.f15010A), "cts");
        }
        bbh a3 = bbj.m7161a();
        Future a4 = bhv.f6304i.mo1158a(context);
        Future a5 = bhv.f6303h.mo1202a(context);
        Future a6 = bhv.f6298c.mo1250a(zzmk.f15038g.packageName);
        Future a7 = bhv.f6305j.mo1252a(zzmk);
        Future a8 = ako.m2352n().m8665a(context);
        blc blc = new blc(null);
        Bundle bundle2 = zzmk.f15034c.f14915c;
        Object obj = (bundle2 == null || bundle2.getString("_ad") == null) ? null : 1;
        if (zzmk.f15017H && obj == null) {
            a = bhv.f6301f.mo1037a(zzmk.f15037f);
        } else {
            Object obj2 = blc;
        }
        blc = new blc(null);
        if (((Boolean) bbb.aM.m7064c()).booleanValue()) {
            a2 = bhv.f6305j.mo1251a(context);
        } else {
            Object obj3 = blc;
        }
        Bundle bundle3 = (zzmk.f15032a < 4 || zzmk.f15046o == null) ? null : zzmk.f15046o;
        if (!((Boolean) bbb.aj.m7064c()).booleanValue() || bhv.f6296a == null) {
            bundle = bundle3;
            future = null;
        } else {
            if (bundle3 == null && ((Boolean) bbb.ak.m7064c()).booleanValue()) {
                bkc.m9012a("contentInfo is not present, but we'll still launch the app index task");
                bundle3 = new Bundle();
            }
            if (bundle3 != null) {
                bundle = bundle3;
                future = bkf.m9060a(new C12221(bhv, context, zzmk, bundle3));
            } else {
                bundle = bundle3;
                future = null;
            }
        }
        if (ako.m2343e().m9112a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() == null) {
                bky.m9006b("Device is offline.");
            }
        }
        String uuid = zzmk.f15032a >= 7 ? zzmk.f15053v : UUID.randomUUID().toString();
        bhy bhy = new bhy(uuid, zzmk.f15037f.packageName);
        if (zzmk.f15034c.f14915c != null) {
            String string = zzmk.f15034c.f14915c.getString("_ad");
            if (string != null) {
                return bhx.m8567a(context, zzmk, string);
            }
        }
        List a9 = bhv.f6299d.mo911a(zzmk);
        if (future != null) {
            try {
                bkc.m9012a("Waiting for app index fetching task.");
                future.get(((Long) bbb.al.m7064c()).longValue(), TimeUnit.MILLISECONDS);
                bkc.m9012a("App index fetching task completed.");
            } catch (ExecutionException e2) {
                e = e2;
                bky.m9009c("Failed to fetch app index signal", e);
            } catch (InterruptedException e3) {
                e = e3;
                bky.m9009c("Failed to fetch app index signal", e);
            } catch (TimeoutException e4) {
                bky.m9006b("Timed out waiting for app index fetching task");
            }
        }
        bundle2 = (Bundle) bhw.m8562a(a4, (Long) bbb.cR.m7064c());
        C1235a c1235a = (C1235a) bhw.m8562a(a5, (Long) bbb.bB.m7064c());
        Location location = (Location) bhw.m8562a(a, (Long) bbb.cz.m7064c());
        Info info = (Info) bhw.m8562a(a2, (Long) bbb.aN.m7064c());
        try {
            str = (String) a7.get();
        } catch (Throwable e5) {
            ako.m2347i().m8934a(e5, "AdRequestServiceImpl.loadAdAsync.qs");
            bky.m9009c("Error fetching qs signals. Continuing.", e5);
            str = null;
        }
        String str2 = null;
        try {
            str2 = (String) a6.get();
        } catch (Throwable e52) {
            ako.m2347i().m8934a(e52, "AdRequestServiceImpl.loadAdAsync.ds");
            bky.m9009c("Error fetching drt signals. Continuing.", e52);
        }
        try {
            JSONObject a10 = bhx.m8573a(context, new bhu().m8546a(zzmk).m8543a((bic) a8.get()).m8544a(c1235a).m8541a(location).m8542a(bundle2).m8547a(str).m8545a(info).m8548a(a9).m8550b(bundle).m8551b(str2).m8549a(bhv.f6297b.mo857a(context)));
            if (a10 == null) {
                return new zzmn(0);
            }
            if (zzmk.f15032a < 7) {
                try {
                    a10.put("request_id", uuid);
                } catch (JSONException e6) {
                }
            }
            String jSONObject = a10.toString();
            bbj.m7167a(a3, "arc");
            bkg.f6710a.post(new C12252(bee, bhy, bbj, bbj.m7161a(), jSONObject));
            zzmn zzmn;
            try {
                bib bib = (bib) bhy.m8591b().get(10, TimeUnit.SECONDS);
                if (bib == null) {
                    zzmn = new zzmn(0);
                    return zzmn;
                } else if (bib.m8645a() != -2) {
                    zzmn = new zzmn(bib.m8645a());
                    bkg.f6710a.post(new C12263(bhv, context, bhy, zzmk));
                    return zzmn;
                } else {
                    if (bbj.m7171e() != null) {
                        bbj.m7167a(bbj.m7171e(), "rur");
                    }
                    zzmn = null;
                    if (!TextUtils.isEmpty(bib.m8654i())) {
                        zzmn = bhx.m8567a(context, zzmk, bib.m8654i());
                    }
                    if (zzmn == null && !TextUtils.isEmpty(bib.m8650e())) {
                        zzmn = bhw.m8561a(zzmk, context, zzmk.f15042k.f15121a, bib.m8650e(), str2, bib, bbj, bhv);
                    }
                    if (zzmn == null) {
                        zzmn = new zzmn(0);
                    }
                    bbj.m7167a(a3, "tts");
                    zzmn.f15099y = bbj.m7169c();
                    bkg.f6710a.post(new C12263(bhv, context, bhy, zzmk));
                    return zzmn;
                }
            } catch (Exception e7) {
                zzmn = new zzmn(0);
                return zzmn;
            } finally {
                bkg.f6710a.post(new C12263(bhv, context, bhy, zzmk));
            }
        } catch (Throwable e8) {
            ako.m2347i().m8934a(e8, "AdRequestServiceImpl.loadAdAsync.di");
            bky.m9009c("Error fetching device info. This is not recoverable.", e8);
            return new zzmn(0);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static com.google.android.gms.internal.zzmn m8561a(com.google.android.gms.internal.zzmk r13, Context r14, String r15, String r16, String r17, p000.bib r18, p000.bbj r19, p000.bhv r20) {
        /*
        if (r19 == 0) goto L_0x00db;
    L_0x0002:
        r2 = r19.m7161a();
        r3 = r2;
    L_0x0007:
        r8 = new bhz;	 Catch:{ IOException -> 0x00e6 }
        r2 = r18.m8648c();	 Catch:{ IOException -> 0x00e6 }
        r8.<init>(r13, r2);	 Catch:{ IOException -> 0x00e6 }
        r4 = "AdRequestServiceImpl: Sending request: ";
        r2 = java.lang.String.valueOf(r16);	 Catch:{ IOException -> 0x00e6 }
        r5 = r2.length();	 Catch:{ IOException -> 0x00e6 }
        if (r5 == 0) goto L_0x00df;
    L_0x001c:
        r2 = r4.concat(r2);	 Catch:{ IOException -> 0x00e6 }
    L_0x0020:
        p000.bky.m9006b(r2);	 Catch:{ IOException -> 0x00e6 }
        r4 = new java.net.URL;	 Catch:{ IOException -> 0x00e6 }
        r0 = r16;
        r4.<init>(r0);	 Catch:{ IOException -> 0x00e6 }
        r2 = 0;
        r5 = p000.ako.m2349k();	 Catch:{ IOException -> 0x00e6 }
        r10 = r5.mo607b();	 Catch:{ IOException -> 0x00e6 }
        r6 = r2;
        r7 = r4;
    L_0x0035:
        r2 = r7.openConnection();	 Catch:{ IOException -> 0x00e6 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x00e6 }
        r4 = p000.ako.m2343e();	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4.m9103a(r14, r15, r5, r2);	 Catch:{ all -> 0x010b }
        r4 = android.text.TextUtils.isEmpty(r17);	 Catch:{ all -> 0x010b }
        if (r4 != 0) goto L_0x0056;
    L_0x0049:
        r4 = r18.m8652g();	 Catch:{ all -> 0x010b }
        if (r4 == 0) goto L_0x0056;
    L_0x004f:
        r4 = "x-afma-drt-cookie";
        r0 = r17;
        r2.addRequestProperty(r4, r0);	 Catch:{ all -> 0x010b }
    L_0x0056:
        r4 = r13.f15018I;	 Catch:{ all -> 0x010b }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r5 != 0) goto L_0x0068;
    L_0x005e:
        r5 = "Sending webview cookie in ad request header.";
        p000.bky.m9006b(r5);	 Catch:{ all -> 0x010b }
        r5 = "Cookie";
        r2.addRequestProperty(r5, r4);	 Catch:{ all -> 0x010b }
    L_0x0068:
        if (r18 == 0) goto L_0x0094;
    L_0x006a:
        r4 = r18.m8649d();	 Catch:{ all -> 0x010b }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r4 != 0) goto L_0x0094;
    L_0x0074:
        r4 = 1;
        r2.setDoOutput(r4);	 Catch:{ all -> 0x010b }
        r4 = r18.m8649d();	 Catch:{ all -> 0x010b }
        r9 = r4.getBytes();	 Catch:{ all -> 0x010b }
        r4 = r9.length;	 Catch:{ all -> 0x010b }
        r2.setFixedLengthStreamingMode(r4);	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ all -> 0x0105 }
        r12 = r2.getOutputStream();	 Catch:{ all -> 0x0105 }
        r4.<init>(r12);	 Catch:{ all -> 0x0105 }
        r4.write(r9);	 Catch:{ all -> 0x0197 }
        p000.aqb.m4908a(r4);	 Catch:{ all -> 0x010b }
    L_0x0094:
        r9 = r2.getResponseCode();	 Catch:{ all -> 0x010b }
        r12 = r2.getHeaderFields();	 Catch:{ all -> 0x010b }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 < r4) goto L_0x0116;
    L_0x00a0:
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 >= r4) goto L_0x0116;
    L_0x00a4:
        r6 = r7.toString();	 Catch:{ all -> 0x010b }
        r5 = 0;
        r4 = new java.io.InputStreamReader;	 Catch:{ all -> 0x0110 }
        r7 = r2.getInputStream();	 Catch:{ all -> 0x0110 }
        r4.<init>(r7);	 Catch:{ all -> 0x0110 }
        r5 = p000.ako.m2343e();	 Catch:{ all -> 0x0194 }
        r5 = r5.m9089a(r4);	 Catch:{ all -> 0x0194 }
        p000.aqb.m4908a(r4);	 Catch:{ all -> 0x010b }
        p000.bhw.m8563a(r6, r12, r5, r9);	 Catch:{ all -> 0x010b }
        r8.m8628a(r6, r12, r5);	 Catch:{ all -> 0x010b }
        if (r19 == 0) goto L_0x00d2;
    L_0x00c5:
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x010b }
        r5 = 0;
        r6 = "ufe";
        r4[r5] = r6;	 Catch:{ all -> 0x010b }
        r0 = r19;
        r0.m7167a(r3, r4);	 Catch:{ all -> 0x010b }
    L_0x00d2:
        r3 = r8.m8627a(r10);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
    L_0x00da:
        return r2;
    L_0x00db:
        r2 = 0;
        r3 = r2;
        goto L_0x0007;
    L_0x00df:
        r2 = new java.lang.String;	 Catch:{ IOException -> 0x00e6 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x00e6 }
        goto L_0x0020;
    L_0x00e6:
        r2 = move-exception;
        r3 = "Error while connecting to ad server: ";
        r2 = r2.getMessage();
        r2 = java.lang.String.valueOf(r2);
        r4 = r2.length();
        if (r4 == 0) goto L_0x018d;
    L_0x00f7:
        r2 = r3.concat(r2);
    L_0x00fb:
        p000.bky.m9011e(r2);
        r2 = new com.google.android.gms.internal.zzmn;
        r3 = 2;
        r2.<init>(r3);
        goto L_0x00da;
    L_0x0105:
        r3 = move-exception;
        r4 = r5;
    L_0x0107:
        p000.aqb.m4908a(r4);	 Catch:{ all -> 0x010b }
        throw r3;	 Catch:{ all -> 0x010b }
    L_0x010b:
        r3 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        throw r3;	 Catch:{ IOException -> 0x00e6 }
    L_0x0110:
        r3 = move-exception;
        r4 = r5;
    L_0x0112:
        p000.aqb.m4908a(r4);	 Catch:{ all -> 0x010b }
        throw r3;	 Catch:{ all -> 0x010b }
    L_0x0116:
        r4 = r7.toString();	 Catch:{ all -> 0x010b }
        r5 = 0;
        p000.bhw.m8563a(r4, r12, r5, r9);	 Catch:{ all -> 0x010b }
        r4 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r9 < r4) goto L_0x015d;
    L_0x0122:
        r4 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r9 >= r4) goto L_0x015d;
    L_0x0126:
        r4 = "Location";
        r4 = r2.getHeaderField(r4);	 Catch:{ all -> 0x010b }
        r5 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x010b }
        if (r5 == 0) goto L_0x0142;
    L_0x0132:
        r3 = "No location header to follow redirect.";
        p000.bky.m9011e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.internal.zzmn;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x0142:
        r5 = new java.net.URL;	 Catch:{ all -> 0x010b }
        r5.<init>(r4);	 Catch:{ all -> 0x010b }
        r4 = r6 + 1;
        r6 = 5;
        if (r4 <= r6) goto L_0x0181;
    L_0x014c:
        r3 = "Too many redirects.";
        p000.bky.m9011e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.internal.zzmn;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x015d:
        r3 = 46;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x010b }
        r4.<init>(r3);	 Catch:{ all -> 0x010b }
        r3 = "Received error HTTP response code: ";
        r3 = r4.append(r3);	 Catch:{ all -> 0x010b }
        r3 = r3.append(r9);	 Catch:{ all -> 0x010b }
        r3 = r3.toString();	 Catch:{ all -> 0x010b }
        p000.bky.m9011e(r3);	 Catch:{ all -> 0x010b }
        r3 = new com.google.android.gms.internal.zzmn;	 Catch:{ all -> 0x010b }
        r4 = 0;
        r3.<init>(r4);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        r2 = r3;
        goto L_0x00da;
    L_0x0181:
        r8.m8629a(r12);	 Catch:{ all -> 0x010b }
        r2.disconnect();	 Catch:{ IOException -> 0x00e6 }
        if (r20 == 0) goto L_0x0189;
    L_0x0189:
        r6 = r4;
        r7 = r5;
        goto L_0x0035;
    L_0x018d:
        r2 = new java.lang.String;
        r2.<init>(r3);
        goto L_0x00fb;
    L_0x0194:
        r3 = move-exception;
        goto L_0x0112;
    L_0x0197:
        r3 = move-exception;
        goto L_0x0107;
        */
        throw new UnsupportedOperationException("Method not decompiled: bhw.a(com.google.android.gms.internal.zzmk, android.content.Context, java.lang.String, java.lang.String, java.lang.String, bib, bbj, bhv):com.google.android.gms.internal.zzmn");
    }

    /* renamed from: a */
    private static <T> T m8562a(Future<T> future, Long l) {
        Throwable e;
        try {
            return future.get(l.longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable e2) {
            bky.m9009c("InterruptedException caught while resolving future.", e2);
            Thread.currentThread().interrupt();
            return null;
        } catch (RuntimeException e3) {
            e2 = e3;
            bky.m9009c("Exception caught while resolving future", e2);
            return null;
        } catch (TimeoutException e4) {
            e2 = e4;
            bky.m9009c("Exception caught while resolving future", e2);
            return null;
        } catch (ExecutionException e5) {
            e2 = e5;
            bky.m9009c("Exception caught while resolving future", e2);
            return null;
        }
    }

    /* renamed from: a */
    private static void m8563a(String str, Map<String, List<String>> map, String str2, int i) {
        if (bky.m9005a(2)) {
            bkc.m9012a(new StringBuilder(String.valueOf(str).length() + 39).append("Http Response: {\n  URL:\n    ").append(str).append("\n  Headers:").toString());
            if (map != null) {
                for (String str3 : map.keySet()) {
                    String str32;
                    bkc.m9012a(new StringBuilder(String.valueOf(str32).length() + 5).append("    ").append(str32).append(":").toString());
                    for (String str322 : (List) map.get(str322)) {
                        String str4 = "      ";
                        str322 = String.valueOf(str322);
                        bkc.m9012a(str322.length() != 0 ? str4.concat(str322) : new String(str4));
                    }
                }
            }
            bkc.m9012a("  Body:");
            if (str2 != null) {
                for (int i2 = 0; i2 < Math.min(str2.length(), 100000); i2 += 1000) {
                    bkc.m9012a(str2.substring(i2, Math.min(str2.length(), i2 + 1000)));
                }
            } else {
                bkc.m9012a("    null");
            }
            bkc.m9012a("  Response Code:\n    " + i + "\n}");
        }
    }

    /* renamed from: a */
    public zzmn mo1193a(zzmk zzmk) {
        return bhw.m8560a(this.f6326c, this.f6329f, this.f6328e, this.f6327d, zzmk);
    }

    /* renamed from: a */
    public void mo1194a(final zzmk zzmk, final bhp bhp) {
        ako.m2347i().m8928a(this.f6326c, zzmk.f15042k);
        bkf.m9059a(new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ bhw f6323c;

            public void run() {
                zzmn a;
                try {
                    a = this.f6323c.mo1193a(zzmk);
                } catch (Throwable e) {
                    ako.m2347i().m8934a(e, "AdRequestServiceImpl.loadAdAsync");
                    bky.m9009c("Could not fetch ad response due to an Exception.", e);
                    a = null;
                }
                if (a == null) {
                    a = new zzmn(0);
                }
                try {
                    bhp.mo1192a(a);
                } catch (Throwable e2) {
                    bky.m9009c("Fail to forward ad response.", e2);
                }
            }
        });
    }
}
