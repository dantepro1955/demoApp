package com.p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

/* renamed from: vm */
public class vm extends zl {
    /* renamed from: a */
    private String f25722a;
    /* renamed from: b */
    private zm f25723b;
    /* renamed from: c */
    private Context f25724c;
    /* renamed from: d */
    private zi f25725d;
    /* renamed from: e */
    private xk f25726e;
    /* renamed from: f */
    private ws f25727f;
    /* renamed from: g */
    private yj f25728g;
    /* renamed from: h */
    private wv f25729h;
    /* renamed from: i */
    private yt f25730i;
    /* renamed from: j */
    private vv f25731j;
    /* renamed from: k */
    private vx f25732k;
    /* renamed from: l */
    private ym f25733l;
    /* renamed from: m */
    private yh f25734m;
    /* renamed from: n */
    private vl f25735n;
    /* renamed from: o */
    private vz f25736o;
    /* renamed from: p */
    private vp f25737p;
    /* renamed from: q */
    private vn f25738q;
    /* renamed from: r */
    private wh f25739r;
    /* renamed from: s */
    private boolean f25740s = true;
    /* renamed from: t */
    private boolean f25741t = false;
    /* renamed from: u */
    private boolean f25742u = false;
    /* renamed from: v */
    private boolean f25743v = false;
    /* renamed from: w */
    private boolean f25744w = false;
    /* renamed from: x */
    private boolean f25745x = false;

    /* renamed from: A */
    private static boolean m34389A() {
        return (VERSION.RELEASE.startsWith("1.") || VERSION.RELEASE.startsWith("2.0") || VERSION.RELEASE.startsWith("2.1")) ? false : true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    private void m34390d(Context r7) {
        /*
        r6 = this;
        r5 = 615; // 0x267 float:8.62E-43 double:3.04E-321;
        r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r7);
        r0 = "com.applovin.sdk.impl.lastKnownVersionCode";
        r2 = 0;
        r0 = r1.getInt(r0, r2);	 Catch:{ Exception -> 0x003a }
        if (r0 >= r5) goto L_0x0032;
    L_0x000f:
        r0 = "AppLovinSdkImpl";
        r2 = "SDK has been updated since last run. Continuing...";
        android.util.Log.i(r0, r2);	 Catch:{ Exception -> 0x003a }
        r0 = r6.m34403h();	 Catch:{ Exception -> 0x003a }
        r0.m34661d();	 Catch:{ Exception -> 0x003a }
        r0 = r6.m34403h();	 Catch:{ Exception -> 0x003a }
        r0.m34659b();	 Catch:{ Exception -> 0x003a }
    L_0x0024:
        r0 = r1.edit();
        r1 = "com.applovin.sdk.impl.lastKnownVersionCode";
        r0 = r0.putInt(r1, r5);
        r0.apply();
    L_0x0031:
        return;
    L_0x0032:
        r0 = "AppLovinSdkImpl";
        r2 = "SDK has not been updated since last run. Continuing...";
        android.util.Log.d(r0, r2);	 Catch:{ Exception -> 0x003a }
        goto L_0x0024;
    L_0x003a:
        r0 = move-exception;
        r2 = r6.mo5561g();	 Catch:{ all -> 0x0054 }
        r3 = "AppLovinSdkImpl";
        r4 = "Unable to check for SDK update";
        r2.mo5609b(r3, r4, r0);	 Catch:{ all -> 0x0054 }
        r0 = r1.edit();
        r1 = "com.applovin.sdk.impl.lastKnownVersionCode";
        r0 = r0.putInt(r1, r5);
        r0.apply();
        goto L_0x0031;
    L_0x0054:
        r0 = move-exception;
        r1 = r1.edit();
        r2 = "com.applovin.sdk.impl.lastKnownVersionCode";
        r1 = r1.putInt(r2, r5);
        r1.apply();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: vm.d(android.content.Context):void");
    }

    /* renamed from: a */
    Object m34391a(wr wrVar) {
        return this.f25727f.m34655a(wrVar);
    }

    /* renamed from: a */
    public String mo5557a() {
        return this.f25722a;
    }

    /* renamed from: a */
    public void m34393a(String str, zm zmVar, Context context) {
        this.f25722a = str;
        this.f25723b = zmVar;
        this.f25724c = context;
        try {
            yf yfVar = new yf();
            this.f25725d = yfVar;
            this.f25727f = new ws(this);
            this.f25726e = new xk(this);
            this.f25728g = new yj(this);
            this.f25729h = new wv(this);
            this.f25730i = new yt(this);
            this.f25733l = new ym(this);
            this.f25735n = new vl(this);
            this.f25736o = new vz(this);
            this.f25737p = new vp(this);
            this.f25738q = new vn(this);
            this.f25739r = new wh(this);
            this.f25731j = new vv(this);
            this.f25732k = new vx(this);
            this.f25734m = new yh(this);
            if (!vm.m34389A()) {
                this.f25743v = true;
                Log.e("AppLovinSdk", "Unable to initalize AppLovin SDK: Android SDK version has to be at least level 8");
            }
            if (str == null || str.length() < 1) {
                this.f25744w = true;
                Log.e("AppLovinSdk", "Unable to find AppLovin SDK key. Please add     meta-data android:name=\"applovin.sdk.key\" android:value=\"YOUR_SDK_KEY_HERE\" into AndroidManifest.xml.");
                Writer stringWriter = new StringWriter();
                new Throwable("").printStackTrace(new PrintWriter(stringWriter));
                Log.e("AppLovinSdk", "Called with an invalid SDK key from: " + stringWriter.toString());
            }
            if (mo5558c()) {
                m34396b(false);
                return;
            }
            yfVar.m34876a(this.f25727f);
            if (zmVar instanceof vr) {
                yfVar.m34877a(((vr) zmVar).m34468a());
            }
            m34390d(context);
            this.f25727f.m34660c();
            if (((Boolean) this.f25727f.m34655a(wp.f25898b)).booleanValue()) {
                this.f25727f.m34658a(zmVar);
                this.f25727f.m34659b();
            }
            m34419x();
        } catch (Throwable th) {
            Log.e("AppLovinSdk", "Failed to load AppLovin SDK, ad serving will be disabled", th);
            m34396b(false);
        }
    }

    /* renamed from: a */
    public void m34394a(boolean z) {
        this.f25745x = z;
    }

    /* renamed from: a */
    public boolean m34395a(Context context) {
        try {
            mo5561g().mo5606a("AppLovinSdk", "Checking if sdk is initialized in main activity...");
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            String stackTraceString = Log.getStackTraceString(new Throwable());
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            if (queryIntentActivities != null) {
                mo5561g().mo5606a("AppLovinSdk", "Found " + queryIntentActivities.size() + " main activities for this application");
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if (stackTraceString.contains(resolveInfo.activityInfo.name)) {
                        return true;
                    }
                }
            }
            mo5561g().mo5610c("AppLovinSdk", "AppLovin SDK was initialized too late in session; SDK should always be initialized within main activity and/or any relevant entry points");
            mo5561g().mo5610c("AppLovinSdk", "Initialization instead happened from: " + stackTraceString);
        } catch (Throwable th) {
            mo5561g().mo5609b("AppLovinSdk", "Error checking if sdk is initialized in main activity...", th);
        }
        return false;
    }

    /* renamed from: b */
    void m34396b(boolean z) {
        this.f25740s = false;
        this.f25741t = z;
        this.f25742u = true;
    }

    /* renamed from: b */
    public boolean m34397b() {
        return this.f25741t;
    }

    /* renamed from: c */
    public boolean mo5558c() {
        return this.f25743v || this.f25744w;
    }

    /* renamed from: d */
    public zc mo5559d() {
        return this.f25735n;
    }

    /* renamed from: e */
    public zo mo5560e() {
        return this.f25734m;
    }

    /* renamed from: f */
    public boolean m34401f() {
        return this.f25745x;
    }

    /* renamed from: g */
    public zi mo5561g() {
        return this.f25725d;
    }

    /* renamed from: h */
    public ws m34403h() {
        return this.f25727f;
    }

    /* renamed from: i */
    public Context m34404i() {
        return this.f25724c;
    }

    /* renamed from: j */
    public yj m34405j() {
        return this.f25728g;
    }

    /* renamed from: k */
    public void mo5562k() {
    }

    /* renamed from: l */
    xk m34407l() {
        return this.f25726e;
    }

    /* renamed from: m */
    wv m34408m() {
        return this.f25729h;
    }

    /* renamed from: n */
    public yt m34409n() {
        return this.f25730i;
    }

    /* renamed from: o */
    vv m34410o() {
        return this.f25731j;
    }

    /* renamed from: p */
    vx m34411p() {
        return this.f25732k;
    }

    /* renamed from: q */
    public vp m34412q() {
        return this.f25737p;
    }

    /* renamed from: r */
    public yx mo5563r() {
        return this.f25736o;
    }

    /* renamed from: s */
    public zh m34414s() {
        return this.f25738q;
    }

    /* renamed from: t */
    public wh m34415t() {
        return this.f25739r;
    }

    /* renamed from: u */
    public ym m34416u() {
        return this.f25733l;
    }

    /* renamed from: v */
    boolean m34417v() {
        return this.f25740s;
    }

    /* renamed from: w */
    boolean m34418w() {
        return this.f25742u;
    }

    /* renamed from: x */
    void m34419x() {
        this.f25740s = true;
        this.f25726e.m34805a(new xj(this), 0);
    }

    /* renamed from: y */
    void m34420y() {
        this.f25727f.m34661d();
        this.f25727f.m34659b();
        this.f25729h.m34702a();
    }

    /* renamed from: z */
    public /* synthetic */ zk mo5564z() {
        return m34412q();
    }
}
