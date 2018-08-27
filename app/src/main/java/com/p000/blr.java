package com.p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import org.json.JSONObject;
import p000.ayf.C0902a;

@bhd
/* renamed from: blr */
class blr extends FrameLayout implements blo {
    /* renamed from: a */
    private static final int f6878a = Color.argb(0, 0, 0, 0);
    /* renamed from: b */
    private final blo f6879b;
    /* renamed from: c */
    private final bln f6880c;

    public blr(blo blo) {
        super(blo.getContext());
        this.f6879b = blo;
        this.f6880c = new bln(blo.mo1317g(), this, this);
        blp l = this.f6879b.mo1322l();
        if (l != null) {
            l.m9412a((blo) this);
        }
        addView(this.f6879b.mo1305b());
    }

    /* renamed from: A */
    public boolean mo1288A() {
        return this.f6879b.mo1288A();
    }

    /* renamed from: B */
    public void mo1289B() {
        this.f6879b.mo1289B();
    }

    /* renamed from: C */
    public void mo1290C() {
        this.f6879b.mo1290C();
    }

    /* renamed from: D */
    public OnClickListener mo1291D() {
        return this.f6879b.mo1291D();
    }

    /* renamed from: E */
    public bbv mo1292E() {
        return this.f6879b.mo1292E();
    }

    /* renamed from: F */
    public void mo1293F() {
        setBackgroundColor(f6878a);
        this.f6879b.setBackgroundColor(f6878a);
    }

    /* renamed from: H */
    public void mo262H() {
        this.f6879b.mo262H();
    }

    /* renamed from: I */
    public void mo263I() {
        this.f6879b.mo263I();
    }

    /* renamed from: a */
    public WebView mo1294a() {
        return this.f6879b.mo1294a();
    }

    /* renamed from: a */
    public void mo1295a(int i) {
        this.f6879b.mo1295a(i);
    }

    /* renamed from: a */
    public void mo1296a(aio aio) {
        this.f6879b.mo1296a(aio);
    }

    /* renamed from: a */
    public void mo1297a(Context context) {
        this.f6879b.mo1297a(context);
    }

    /* renamed from: a */
    public void mo1298a(Context context, zzeg zzeg, bbj bbj) {
        this.f6880c.m9345c();
        this.f6879b.mo1298a(context, zzeg, bbj);
    }

    /* renamed from: a */
    public void mo1249a(C0902a c0902a) {
        this.f6879b.mo1249a(c0902a);
    }

    /* renamed from: a */
    public void mo1299a(bbv bbv) {
        this.f6879b.mo1299a(bbv);
    }

    /* renamed from: a */
    public void mo1300a(blu blu) {
        this.f6879b.mo1300a(blu);
    }

    /* renamed from: a */
    public void mo1301a(zzeg zzeg) {
        this.f6879b.mo1301a(zzeg);
    }

    /* renamed from: a */
    public void mo1302a(String str) {
        this.f6879b.mo1302a(str);
    }

    /* renamed from: a */
    public void mo1023a(String str, bcy bcy) {
        this.f6879b.mo1023a(str, bcy);
    }

    /* renamed from: a */
    public void mo1024a(String str, String str2) {
        this.f6879b.mo1024a(str, str2);
    }

    /* renamed from: a */
    public void mo1303a(String str, Map<String, ?> map) {
        this.f6879b.mo1303a(str, (Map) map);
    }

    /* renamed from: a */
    public void mo1025a(String str, JSONObject jSONObject) {
        this.f6879b.mo1025a(str, jSONObject);
    }

    /* renamed from: a */
    public void mo1304a(boolean z) {
        this.f6879b.mo1304a(z);
    }

    /* renamed from: b */
    public View mo1305b() {
        return this;
    }

    /* renamed from: b */
    public void mo1306b(int i) {
        this.f6879b.mo1306b(i);
    }

    /* renamed from: b */
    public void mo1307b(aio aio) {
        this.f6879b.mo1307b(aio);
    }

    /* renamed from: b */
    public void mo1308b(String str) {
        this.f6879b.mo1308b(str);
    }

    /* renamed from: b */
    public void mo1028b(String str, bcy bcy) {
        this.f6879b.mo1028b(str, bcy);
    }

    /* renamed from: b */
    public void mo1029b(String str, JSONObject jSONObject) {
        this.f6879b.mo1029b(str, jSONObject);
    }

    /* renamed from: b */
    public void mo1309b(boolean z) {
        this.f6879b.mo1309b(z);
    }

    /* renamed from: c */
    public void mo1310c() {
        this.f6879b.mo1310c();
    }

    /* renamed from: c */
    public void mo1311c(boolean z) {
        this.f6879b.mo1311c(z);
    }

    /* renamed from: d */
    public void mo1312d() {
        this.f6879b.mo1312d();
    }

    /* renamed from: d */
    public void mo1313d(boolean z) {
        this.f6879b.mo1313d(z);
    }

    public void destroy() {
        this.f6879b.destroy();
    }

    /* renamed from: e */
    public void mo1315e() {
        this.f6879b.mo1315e();
    }

    /* renamed from: f */
    public Activity mo1316f() {
        return this.f6879b.mo1316f();
    }

    /* renamed from: g */
    public Context mo1317g() {
        return this.f6879b.mo1317g();
    }

    /* renamed from: h */
    public ajx mo1318h() {
        return this.f6879b.mo1318h();
    }

    /* renamed from: i */
    public aio mo1319i() {
        return this.f6879b.mo1319i();
    }

    /* renamed from: j */
    public aio mo1320j() {
        return this.f6879b.mo1320j();
    }

    /* renamed from: k */
    public zzeg mo1321k() {
        return this.f6879b.mo1321k();
    }

    /* renamed from: l */
    public blp mo1322l() {
        return this.f6879b.mo1322l();
    }

    public void loadData(String str, String str2, String str3) {
        this.f6879b.loadData(str, str2, str3);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f6879b.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public void loadUrl(String str) {
        this.f6879b.loadUrl(str);
    }

    /* renamed from: m */
    public boolean mo1326m() {
        return this.f6879b.mo1326m();
    }

    /* renamed from: n */
    public avc mo1327n() {
        return this.f6879b.mo1327n();
    }

    /* renamed from: o */
    public zzqh mo1328o() {
        return this.f6879b.mo1328o();
    }

    public void onPause() {
        this.f6880c.m9344b();
        this.f6879b.onPause();
    }

    public void onResume() {
        this.f6879b.onResume();
    }

    /* renamed from: p */
    public boolean mo1331p() {
        return this.f6879b.mo1331p();
    }

    /* renamed from: q */
    public int mo1332q() {
        return this.f6879b.mo1332q();
    }

    /* renamed from: r */
    public boolean mo1333r() {
        return this.f6879b.mo1333r();
    }

    /* renamed from: s */
    public void mo1334s() {
        this.f6880c.m9345c();
        this.f6879b.mo1334s();
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f6879b.setOnClickListener(onClickListener);
    }

    public void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f6879b.setOnTouchListener(onTouchListener);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f6879b.setWebChromeClient(webChromeClient);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        this.f6879b.setWebViewClient(webViewClient);
    }

    public void stopLoading() {
        this.f6879b.stopLoading();
    }

    /* renamed from: t */
    public boolean mo1340t() {
        return this.f6879b.mo1340t();
    }

    /* renamed from: u */
    public boolean mo1341u() {
        return this.f6879b.mo1341u();
    }

    /* renamed from: v */
    public String mo1342v() {
        return this.f6879b.mo1342v();
    }

    /* renamed from: w */
    public bln mo1343w() {
        return this.f6880c;
    }

    /* renamed from: x */
    public bbh mo1344x() {
        return this.f6879b.mo1344x();
    }

    /* renamed from: y */
    public bbi mo1345y() {
        return this.f6879b.mo1345y();
    }

    /* renamed from: z */
    public blu mo1346z() {
        return this.f6879b.mo1346z();
    }
}
