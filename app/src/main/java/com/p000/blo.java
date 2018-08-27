package com.p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.util.Map;
import org.json.JSONObject;
import p000.ayf.C0903b;

@bhd
/* renamed from: blo */
public interface blo extends akm, C0903b, bef {
    /* renamed from: A */
    boolean mo1288A();

    /* renamed from: B */
    void mo1289B();

    /* renamed from: C */
    void mo1290C();

    /* renamed from: D */
    OnClickListener mo1291D();

    /* renamed from: E */
    bbv mo1292E();

    /* renamed from: F */
    void mo1293F();

    /* renamed from: a */
    WebView mo1294a();

    /* renamed from: a */
    void mo1295a(int i);

    /* renamed from: a */
    void mo1296a(aio aio);

    /* renamed from: a */
    void mo1297a(Context context);

    /* renamed from: a */
    void mo1298a(Context context, zzeg zzeg, bbj bbj);

    /* renamed from: a */
    void mo1299a(bbv bbv);

    /* renamed from: a */
    void mo1300a(blu blu);

    /* renamed from: a */
    void mo1301a(zzeg zzeg);

    /* renamed from: a */
    void mo1302a(String str);

    /* renamed from: a */
    void mo1024a(String str, String str2);

    /* renamed from: a */
    void mo1303a(String str, Map<String, ?> map);

    /* renamed from: a */
    void mo1025a(String str, JSONObject jSONObject);

    /* renamed from: a */
    void mo1304a(boolean z);

    /* renamed from: b */
    View mo1305b();

    /* renamed from: b */
    void mo1306b(int i);

    /* renamed from: b */
    void mo1307b(aio aio);

    /* renamed from: b */
    void mo1308b(String str);

    /* renamed from: b */
    void mo1309b(boolean z);

    /* renamed from: c */
    void mo1310c();

    /* renamed from: c */
    void mo1311c(boolean z);

    /* renamed from: d */
    void mo1312d();

    /* renamed from: d */
    void mo1313d(boolean z);

    void destroy();

    /* renamed from: e */
    void mo1315e();

    /* renamed from: f */
    Activity mo1316f();

    /* renamed from: g */
    Context mo1317g();

    Context getContext();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    /* renamed from: h */
    ajx mo1318h();

    /* renamed from: i */
    aio mo1319i();

    /* renamed from: j */
    aio mo1320j();

    /* renamed from: k */
    zzeg mo1321k();

    /* renamed from: l */
    blp mo1322l();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    boolean mo1326m();

    void measure(int i, int i2);

    /* renamed from: n */
    avc mo1327n();

    /* renamed from: o */
    zzqh mo1328o();

    void onPause();

    void onResume();

    /* renamed from: p */
    boolean mo1331p();

    /* renamed from: q */
    int mo1332q();

    /* renamed from: r */
    boolean mo1333r();

    /* renamed from: s */
    void mo1334s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    boolean mo1340t();

    /* renamed from: u */
    boolean mo1341u();

    /* renamed from: v */
    String mo1342v();

    /* renamed from: w */
    bln mo1343w();

    /* renamed from: x */
    bbh mo1344x();

    /* renamed from: y */
    bbi mo1345y();

    /* renamed from: z */
    blu mo1346z();
}
