package com.p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.facebook.LoggingBehavior;
import com.facebook.cache.disk.DiskCacheConfig;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.inmobi.commons.analytics.db.AnalyticsEvent;
import com.millennialmedia.MMException;
import com.millennialmedia.MMSDK;
import com.ninegag.android.app.model.api.ApiConfigResponse.ApiJSONString;
import com.ninegag.android.app.model.api.ApiConfigResponse.C4069a;
import com.ninegag.android.app.model.api.ApiPostsResponse.Separator;
import com.ninegag.android.app.model.api.ApiTopCommentResponse.ApiTopComments;
import com.ninegag.android.app.model.api.ApiTopCommentResponse.C4080a;
import com.ninegag.android.app.model.api.ApiUser;
import com.ninegag.android.app.model.api.ApiUser.C4081a;
import com.ninegag.android.library.rlogger.RLogger;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;

/* compiled from: ObjectManager */
/* renamed from: caf */
public class caf {
    /* renamed from: b */
    private static caf f8437b = new caf();
    /* renamed from: c */
    private static OkHttpClient f8438c = new Builder().build();
    /* renamed from: A */
    private cjm f8439A;
    /* renamed from: B */
    private HashMap<String, Object> f8440B;
    /* renamed from: C */
    private dib f8441C;
    /* renamed from: D */
    private boolean f8442D;
    /* renamed from: E */
    private HashMap<String, ApiUser> f8443E;
    /* renamed from: F */
    private hh<String, Separator[]> f8444F;
    /* renamed from: G */
    private cct f8445G;
    /* renamed from: H */
    private cjs f8446H;
    /* renamed from: I */
    private cjt f8447I;
    /* renamed from: J */
    private Locale[] f8448J = new Locale[]{Locale.ENGLISH, Locale.GERMAN, new Locale(AnalyticsEvent.TYPE_END_SESSION, "ES")};
    /* renamed from: a */
    public Context f8449a;
    /* renamed from: d */
    private boolean f8450d = false;
    /* renamed from: e */
    private boolean f8451e = false;
    /* renamed from: f */
    private boolean f8452f = false;
    /* renamed from: g */
    private boolean f8453g = false;
    /* renamed from: h */
    private cag f8454h;
    /* renamed from: i */
    private cij f8455i;
    /* renamed from: j */
    private chp f8456j;
    /* renamed from: k */
    private cip f8457k;
    /* renamed from: l */
    private chq f8458l;
    /* renamed from: m */
    private chr f8459m;
    /* renamed from: n */
    private cvv f8460n;
    /* renamed from: o */
    private cvu f8461o;
    /* renamed from: p */
    private cwf f8462p;
    /* renamed from: q */
    private HashSet<String> f8463q = new HashSet();
    /* renamed from: r */
    private dfd f8464r;
    /* renamed from: s */
    private did f8465s;
    /* renamed from: t */
    private cmc f8466t;
    /* renamed from: u */
    private cma f8467u;
    /* renamed from: v */
    private clz f8468v;
    /* renamed from: w */
    private cly f8469w;
    /* renamed from: x */
    private dmo f8470x;
    /* renamed from: y */
    private dgr f8471y;
    /* renamed from: z */
    private dgk f8472z;

    /* renamed from: a */
    public static caf m12046a() {
        return f8437b;
    }

    /* renamed from: a */
    public void m12052a(Context context) {
        if (this.f8451e) {
            m12048f(context);
            return;
        }
        this.f8451e = true;
        m12065c(context);
        this.f8440B = new HashMap();
        this.f8443E = new HashMap();
        this.f8441C = new dib();
        this.f8442D = false;
        this.f8444F = new hh();
        this.f8455i = cij.m13687a();
        this.f8455i.m13698a(context);
        ctz.a().a(context);
        this.f8454h = cag.m12097a(context);
        chr.m13522a().m13536a(context);
        this.f8459m = chr.m13522a();
        chp.m13478b().m13484b(context);
        this.f8456j = chp.m13478b();
        this.f8457k = cip.m13967a();
        this.f8460n = cvv.a();
        this.f8460n.a(context);
        this.f8461o = new cvu();
        this.f8462p = new cwf(context);
        dfp.a().a(m12068d().f8417n);
        cnw.m14924b();
        m12044J();
        m12037C();
        chs.m13591a().m13594b();
        this.f8446H = new cjs();
        this.f8447I = new cjt(this.f8472z);
        m12069d(context);
        chn.m13369a(context, m12045K(), this.f8457k.m13851L(), this.f8457k.mo1774n());
        chn.m13384a(this.f8468v.m14432l());
        m12040F();
        crk.a(context, "225dac9c104265051c0da74c22840df8cd3edf23");
    }

    /* renamed from: b */
    public void m12061b(Context context) {
        if (!this.f8451e) {
            m12052a(context);
        }
        this.f8467u.a(this.f8457k.m13851L(), this.f8457k.mo1774n());
        chn.m13369a(context, this.f8468v.K(), this.f8457k.m13851L(), this.f8457k.mo1774n());
        chn.m13384a(this.f8468v.m14432l());
    }

    /* renamed from: a */
    public void m12053a(Context context, boolean z) {
        if (z) {
            dix.b(context);
        } else {
            dix.c(context);
        }
    }

    /* renamed from: c */
    public void m12065c(Context context) {
        if (!this.f8450d) {
            this.f8449a = context;
            cpq.a(context);
            Locale locale = Locale.getDefault();
            boolean z = false;
            for (Locale language : this.f8448J) {
                if (language.getLanguage().equals(locale.getLanguage())) {
                    djo.a(locale);
                    z = true;
                }
            }
            if (!z) {
                Locale.setDefault(Locale.US);
                djo.a(Locale.US);
            }
            m12039E();
            m12068d().m12020a(context);
            this.f8458l = new chq(m12068d().m12026e());
            this.f8458l.m13502a(context);
            this.f8450d = true;
            m12038D();
            dct.a().a(context, null, new can(), false, false);
            m12047e(context);
            m12049g(context);
            zl.b(context);
            try {
                MMSDK.initialize((Application) context.getApplicationContext());
            } catch (MMException e) {
            }
            try {
                com.millennialmedia.android.MMSDK.initialize(context);
            } catch (com.millennialmedia.android.MMException e2) {
            }
        }
    }

    /* renamed from: C */
    private void m12037C() {
        ctw.a().a(new cop(), false);
    }

    /* renamed from: e */
    private void m12047e(Context context) {
        cqf.a(context);
    }

    /* renamed from: d */
    public void m12069d(Context context) {
        this.f8446H.m14102a(context);
        this.f8447I.m14104a(context);
    }

    /* renamed from: D */
    private void m12038D() {
        Fresco.initialize(this.f8449a, ImagePipelineConfig.newBuilder(this.f8449a).setBitmapMemoryCacheParamsSupplier(new cpt((ActivityManager) this.f8449a.getSystemService("activity"))).setMainDiskCacheConfig(DiskCacheConfig.newBuilder(this.f8449a).setBaseDirectoryPath(new File(m12073f().m13519j(this.f8449a))).setBaseDirectoryName("v1").setMaxCacheSize(104857600).setMaxCacheSizeOnLowDiskSpace(10485760).setMaxCacheSizeOnVeryLowDiskSpace(5242880).setVersion(1).build()).build());
        dlm.a(RLogger.getInstance());
    }

    /* renamed from: f */
    private void m12048f(Context context) {
        m12068d().m12023b(context);
    }

    /* renamed from: E */
    private void m12039E() {
        djm.a();
        buc buc = new buc();
        buc.m11060a(ApiTopComments.class, new C4080a());
        buc.m11060a(ApiJSONString.class, new C4069a());
        buc.m11060a(ApiUser.class, new C4081a());
        djm.a(buc.m11059a());
    }

    /* renamed from: g */
    private void m12049g(Context context) {
        diy.a(context);
        dix.a(context);
        diy.a(false);
        diy.a(new LoggingBehavior[]{LoggingBehavior.APP_EVENTS});
    }

    /* renamed from: F */
    private void m12040F() {
        if (m12068d().m12026e()) {
            chr.m13522a().m13571c(true, -1);
        } else {
            chr.m13522a().m13563b(true, -1);
        }
    }

    /* renamed from: G */
    private void m12041G() {
        this.f8464r = dfd.a();
        this.f8464r.a(cjo.m14071a());
        this.f8464r.a(new cjp());
        this.f8464r.a(this.f8449a);
    }

    /* renamed from: H */
    private void m12042H() {
        this.f8472z = dgk.a();
        dgq cjl = new cjl();
        cjl.a(RLogger.getInstance());
        cjl.a(new Builder());
        this.f8472z.a(this.f8449a, cjl);
        this.f8439A = new cjm();
    }

    /* renamed from: I */
    private void m12043I() {
        this.f8468v = new clz(this.f8457k.mo1775o());
        this.f8467u = new cma(this.f8449a, this.f8468v);
        this.f8467u.a(this.f8457k.m13851L(), this.f8457k.mo1774n());
        this.f8466t = new cmc();
    }

    /* renamed from: J */
    private void m12044J() {
        Object[] objArr;
        m12043I();
        m12042H();
        String c = this.f8457k.mo1763c();
        String[] strArr = (String[]) djm.a("[\"com.facebook.katana\", \"com.whatsapp/com.whatsapp.ContactPicker\"]", String[].class);
        Object[] objArr2 = (String[]) djm.a(this.f8457k.mo1761b(), String[].class);
        Object[] objArr3 = (String[]) djm.a("[\"__save__\", \"__copy_link__\", \"__report__\", \"__delete__\"]", String[].class);
        if (strArr == null) {
            objArr = new String[0];
        } else {
            String[] strArr2 = strArr;
        }
        if (objArr2 == null) {
            objArr2 = new String[0];
        }
        if (objArr3 == null) {
            objArr3 = new String[0];
        }
        for (Object add : objArr3) {
            this.f8463q.add(add);
        }
        this.f8465s = new did(this.f8449a, Arrays.asList(objArr2));
        this.f8465s.a(Arrays.asList(objArr));
        this.f8465s.b(Arrays.asList(objArr3));
        this.f8465s.a(c);
        dct.a().a(this.f8449a, null, new can(), true, m12094x().m12104c());
    }

    /* renamed from: b */
    public HashSet<String> m12060b() {
        return this.f8463q;
    }

    /* renamed from: K */
    private String m12045K() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f8468v.K() + ";");
        stringBuilder.append("maxMemory:" + m12068d().f8416m + "MB;");
        stringBuilder.append("BM size:" + m12068d().f8417n + "KB;");
        stringBuilder.append("approxBMCapacity: " + m12068d().f8418o);
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public cjs m12064c() {
        return this.f8446H;
    }

    /* renamed from: d */
    public cac m12068d() {
        return cac.m12016a();
    }

    /* renamed from: e */
    public chq m12071e() {
        return this.f8458l;
    }

    /* renamed from: f */
    public chq m12073f() {
        return this.f8458l;
    }

    /* renamed from: g */
    public cij m12075g() {
        return this.f8455i;
    }

    /* renamed from: h */
    public cip m12077h() {
        return this.f8457k;
    }

    /* renamed from: i */
    public chr m12079i() {
        return this.f8459m;
    }

    /* renamed from: j */
    public chp m12080j() {
        return this.f8456j;
    }

    /* renamed from: k */
    public cvv m12081k() {
        return this.f8460n;
    }

    /* renamed from: l */
    public cvu m12082l() {
        return this.f8461o;
    }

    /* renamed from: m */
    public cwf m12083m() {
        return this.f8462p;
    }

    /* renamed from: n */
    public synchronized dfd m12084n() {
        if (this.f8464r == null) {
            m12041G();
        }
        return this.f8464r;
    }

    /* renamed from: o */
    public cmc m12085o() {
        return this.f8466t;
    }

    /* renamed from: p */
    public cma m12086p() {
        return this.f8467u;
    }

    /* renamed from: q */
    public clz m12087q() {
        return this.f8468v;
    }

    /* renamed from: r */
    public cly m12088r() {
        if (this.f8469w == null) {
            this.f8470x = new dmo();
            this.f8469w = new cly(this.f8449a, this.f8470x);
            this.f8469w.a(this.f8457k.m13851L(), this.f8457k.mo1774n());
        }
        return this.f8469w;
    }

    /* renamed from: s */
    public did m12089s() {
        return this.f8465s;
    }

    /* renamed from: t */
    public dgk m12090t() {
        return this.f8472z;
    }

    /* renamed from: u */
    public dgr m12091u() {
        if (this.f8471y == null) {
            this.f8471y = dgr.a();
            this.f8471y.a(this.f8449a, new cjk());
        }
        return this.f8471y;
    }

    /* renamed from: v */
    public cjm m12092v() {
        return this.f8439A;
    }

    /* renamed from: w */
    public chs m12093w() {
        return chs.m13591a();
    }

    /* renamed from: x */
    public cag m12094x() {
        return this.f8454h;
    }

    /* renamed from: a */
    public void m12056a(String str, ApiUser apiUser) {
        this.f8443E.put(str, apiUser);
    }

    /* renamed from: a */
    public ApiUser m12051a(String str) {
        if (this.f8443E.containsKey(str)) {
            return (ApiUser) this.f8443E.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public void m12055a(String str, cct cct) {
        this.f8445G = cct;
    }

    /* renamed from: b */
    public cct m12059b(String str) {
        return this.f8445G;
    }

    /* renamed from: y */
    public dib m12095y() {
        return this.f8441C;
    }

    /* renamed from: z */
    public boolean m12096z() {
        return this.f8442D;
    }

    /* renamed from: a */
    public void m12058a(boolean z) {
        this.f8442D = z;
    }

    /* renamed from: c */
    public Separator[] m12067c(String str) {
        Separator[] separatorArr;
        synchronized (this.f8444F) {
            if (this.f8444F.containsKey(str)) {
                separatorArr = (Separator[]) this.f8444F.get(str);
            } else {
                separatorArr = null;
            }
        }
        return separatorArr;
    }

    /* renamed from: a */
    public void m12057a(String str, Separator[] separatorArr) {
        synchronized (this.f8444F) {
            this.f8444F.put(str, separatorArr);
        }
    }

    /* renamed from: a */
    public void m12054a(Object obj) {
        dhe.c(obj);
    }

    /* renamed from: b */
    public void m12062b(Object obj) {
        dhe.c("broadcast", obj);
    }

    /* renamed from: c */
    public void m12066c(Object obj) {
        dhe.a(obj);
    }

    /* renamed from: d */
    public void m12070d(Object obj) {
        dhe.a("broadcast", obj);
    }

    /* renamed from: e */
    public void m12072e(Object obj) {
        dhe.a("tabbar", obj);
    }

    /* renamed from: f */
    public void m12074f(Object obj) {
        dhe.b(obj);
    }

    /* renamed from: g */
    public void m12076g(Object obj) {
        dhe.b("broadcast", obj);
    }

    /* renamed from: h */
    public void m12078h(Object obj) {
        dhe.b("tabbar", obj);
    }

    /* renamed from: A */
    public static boolean m12036A() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    /* renamed from: B */
    public boolean m12050B() {
        return this.f8453g;
    }

    /* renamed from: b */
    public void m12063b(boolean z) {
        this.f8453g = z;
    }
}
