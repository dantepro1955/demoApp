package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.AlertDialog.Builder;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.facebook.common.util.ByteConstants;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.internal.zzeg;
import com.google.android.gms.internal.zzqh;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.bbp.C0994a;
import p000.bkx.C1281a;

@bhd
/* renamed from: bkg */
public class bkg {
    /* renamed from: a */
    public static final Handler f6710a = new bkd(Looper.getMainLooper());
    /* renamed from: b */
    private final Object f6711b = new Object();
    /* renamed from: c */
    private boolean f6712c = true;
    /* renamed from: d */
    private String f6713d;
    /* renamed from: e */
    private boolean f6714e = false;
    /* renamed from: f */
    private bee f6715f;

    /* renamed from: bkg$a */
    final class C1283a extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ bkg f6709a;

        private C1283a(bkg bkg) {
            this.f6709a = bkg;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                this.f6709a.f6712c = true;
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                this.f6709a.f6712c = false;
            }
        }
    }

    /* renamed from: a */
    private JSONArray m9067a(Collection<?> collection) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : collection) {
            m9069a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    private JSONObject m9068a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            m9070a(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m9069a(JSONArray jSONArray, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONArray.put(m9068a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONArray.put(m9095a((Map) obj));
        } else if (obj instanceof Collection) {
            jSONArray.put(m9067a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(m9094a((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    /* renamed from: a */
    private void m9070a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (obj instanceof Bundle) {
            jSONObject.put(str, m9068a((Bundle) obj));
        } else if (obj instanceof Map) {
            jSONObject.put(str, m9095a((Map) obj));
        } else if (obj instanceof Collection) {
            if (str == null) {
                str = "null";
            }
            jSONObject.put(str, m9067a((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONObject.put(str, m9067a(Arrays.asList((Object[]) obj)));
        } else {
            jSONObject.put(str, obj);
        }
    }

    /* renamed from: a */
    private boolean m9071a(KeyguardManager keyguardManager) {
        return keyguardManager == null ? false : keyguardManager.inKeyguardRestrictedInputMode();
    }

    /* renamed from: a */
    private boolean m9072a(PowerManager powerManager) {
        return powerManager == null || powerManager.isScreenOn();
    }

    /* renamed from: b */
    public static void m9074b(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            runnable.run();
        } else {
            bkf.m9059a(runnable);
        }
    }

    /* renamed from: c */
    private Bitmap m9075c(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                bky.m9011e("Width or height of view is zero");
                return null;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            view.layout(0, 0, width, height);
            view.draw(canvas);
            return createBitmap;
        } catch (Throwable e) {
            bky.m9007b("Fail to capture the webview", e);
            return null;
        }
    }

    /* renamed from: d */
    private Bitmap m9076d(View view) {
        Bitmap drawingCache;
        Throwable e;
        try {
            boolean isDrawingCacheEnabled = view.isDrawingCacheEnabled();
            view.setDrawingCacheEnabled(true);
            drawingCache = view.getDrawingCache();
            drawingCache = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
            try {
                view.setDrawingCacheEnabled(isDrawingCacheEnabled);
            } catch (RuntimeException e2) {
                e = e2;
                bky.m9007b("Fail to capture the web view", e);
                return drawingCache;
            }
        } catch (Throwable e3) {
            Throwable th = e3;
            drawingCache = null;
            e = th;
            bky.m9007b("Fail to capture the web view", e);
            return drawingCache;
        }
        return drawingCache;
    }

    /* renamed from: n */
    private boolean m9077n(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return powerManager == null ? false : powerManager.isScreenOn();
    }

    /* renamed from: a */
    public Bitmap m9078a(View view) {
        view.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        return createBitmap;
    }

    /* renamed from: a */
    public Uri m9079a(Uri uri, String str, String str2) throws UnsupportedOperationException {
        return m9080a(uri.toString(), str, str2);
    }

    /* renamed from: a */
    public Uri m9080a(String str, String str2, String str3) throws UnsupportedOperationException {
        int indexOf = str.indexOf("&adurl");
        if (indexOf == -1) {
            indexOf = str.indexOf("?adurl");
        }
        return indexOf != -1 ? Uri.parse(new StringBuilder(str.substring(0, indexOf + 1)).append(str2).append("=").append(str3).append("&").append(str.substring(indexOf + 1)).toString()) : Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
    }

    /* renamed from: a */
    public Bundle m9081a(aym aym) {
        if (aym == null) {
            return null;
        }
        if (!((Boolean) bbb.ac.m7064c()).booleanValue() && !((Boolean) bbb.ae.m7064c()).booleanValue()) {
            return null;
        }
        if (ako.m2347i().m8942b() && ako.m2347i().m8944c()) {
            return null;
        }
        String b;
        String c;
        String str;
        if (aym.m6625f()) {
            aym.m6623d();
        }
        ayj c2 = aym.m6622c();
        if (c2 != null) {
            b = c2.m6582b();
            c = c2.m6584c();
            String d = c2.m6585d();
            if (b != null) {
                ako.m2347i().m8927a(b);
            }
            if (d != null) {
                ako.m2347i().m8939b(d);
                str = b;
                b = c;
                c = d;
            } else {
                str = b;
                b = c;
                c = d;
            }
        } else {
            b = null;
            str = ako.m2347i().m8955j();
            c = ako.m2347i().m8956k();
        }
        Bundle bundle = new Bundle(1);
        if (!(c == null || !((Boolean) bbb.ae.m7064c()).booleanValue() || ako.m2347i().m8944c())) {
            bundle.putString("v_fp_vertical", c);
        }
        if (!(str == null || !((Boolean) bbb.ac.m7064c()).booleanValue() || ako.m2347i().m8942b())) {
            bundle.putString("fingerprint", str);
            if (!str.equals(b)) {
                bundle.putString("v_fp", b);
            }
        }
        return !bundle.isEmpty() ? bundle : null;
    }

    /* renamed from: a */
    public DisplayMetrics m9082a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: a */
    public PopupWindow m9083a(View view, int i, int i2, boolean z) {
        return new PopupWindow(view, i, i2, z);
    }

    /* renamed from: a */
    public bee m9084a(Context context, zzqh zzqh) {
        bee bee;
        synchronized (this.f6711b) {
            if (this.f6715f == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f6715f = new bee(context, zzqh, (String) bbb.f5395b.m7064c());
            }
            bee = this.f6715f;
        }
        return bee;
    }

    /* renamed from: a */
    public String m9085a(Context context, View view, zzeg zzeg) {
        String str = null;
        if (((Boolean) bbb.at.m7064c()).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", zzeg.f14935e);
                jSONObject2.put("height", zzeg.f14932b);
                jSONObject.put("size", jSONObject2);
                jSONObject.put("activity", m9136f(context));
                if (!zzeg.f14934d) {
                    JSONArray jSONArray = new JSONArray();
                    while (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent != null) {
                            int i = -1;
                            if (parent instanceof ViewGroup) {
                                i = ((ViewGroup) parent).indexOfChild(view);
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", parent.getClass().getName());
                            jSONObject3.put("index_of_child", i);
                            jSONArray.put(jSONObject3);
                        }
                        View view2 = (parent == null || !(parent instanceof View)) ? null : (View) parent;
                        view = view2;
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("parents", jSONArray);
                    }
                }
                str = jSONObject.toString();
            } catch (Throwable e) {
                bky.m9009c("Fail to get view hierarchy json", e);
            }
        }
        return str;
    }

    /* renamed from: a */
    public String m9086a(Context context, avc avc, String str, View view) {
        if (avc != null) {
            try {
                Uri parse = Uri.parse(str);
                if (avc.m5937d(parse)) {
                    parse = avc.m5928a(parse, context, view);
                }
                str = parse.toString();
            } catch (Exception e) {
            }
        }
        return str;
    }

    /* renamed from: a */
    public String m9087a(final Context context, String str) {
        String str2;
        synchronized (this.f6711b) {
            if (this.f6713d != null) {
                str2 = this.f6713d;
            } else if (str == null) {
                str2 = m9119b();
            } else {
                try {
                    this.f6713d = ako.m2345g().mo1276a(context);
                } catch (Exception e) {
                }
                if (TextUtils.isEmpty(this.f6713d)) {
                    if (azp.m6789a().m9298b()) {
                        this.f6713d = m9127c(context);
                    } else {
                        this.f6713d = null;
                        f6710a.post(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ bkg f6706b;

                            public void run() {
                                synchronized (this.f6706b.f6711b) {
                                    this.f6706b.f6713d = this.f6706b.m9127c(context);
                                    this.f6706b.f6711b.notifyAll();
                                }
                            }
                        });
                        while (this.f6713d == null) {
                            try {
                                this.f6711b.wait();
                            } catch (InterruptedException e2) {
                                this.f6713d = m9119b();
                                String str3 = "Interrupted, use default user agent: ";
                                str2 = String.valueOf(this.f6713d);
                                bky.m9011e(str2.length() != 0 ? str3.concat(str2) : new String(str3));
                            }
                        }
                    }
                }
                str2 = String.valueOf(this.f6713d);
                this.f6713d = new StringBuilder((String.valueOf(str2).length() + 11) + String.valueOf(str).length()).append(str2).append(" (Mobile; ").append(str).append(")").toString();
                str2 = this.f6713d;
            }
        }
        return str2;
    }

    /* renamed from: a */
    public String m9088a(blo blo, String str) {
        return m9086a(blo.getContext(), blo.mo1327n(), str, blo.mo1305b());
    }

    /* renamed from: a */
    public String m9089a(InputStreamReader inputStreamReader) throws IOException {
        StringBuilder stringBuilder = new StringBuilder(Utility.DEFAULT_STREAM_BUFFER_SIZE);
        char[] cArr = new char[2048];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (read == -1) {
                return stringBuilder.toString();
            }
            stringBuilder.append(cArr, 0, read);
        }
    }

    /* renamed from: a */
    public String m9090a(String str) {
        return Uri.parse(str).buildUpon().query(null).build().toString();
    }

    /* renamed from: a */
    public String m9091a(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            str = str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{str2}), String.format("$1%s$2", new Object[]{Uri.encode((String) map.get(str2))}));
        }
        return str.replaceAll(String.format("(?<!@)((?:@@)*)@%s(?<!@)((?:@@)*)@", new Object[]{"[^@]+"}), String.format("$1%s$2", new Object[]{""})).replaceAll("@@", "@");
    }

    /* renamed from: a */
    public Map<String, String> m9092a(Uri uri) {
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : ako.m2345g().mo1265a(uri)) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, Integer> m9093a(View view, WindowManager windowManager) {
        DisplayMetrics a = m9082a(windowManager);
        int i = a.widthPixels;
        int i2 = a.heightPixels;
        int[] iArr = new int[2];
        Map<String, Integer> hashMap = new HashMap();
        view.getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        return hashMap;
    }

    /* renamed from: a */
    JSONArray m9094a(Object[] objArr) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a : objArr) {
            m9069a(jSONArray, a);
        }
        return jSONArray;
    }

    /* renamed from: a */
    public JSONObject m9095a(Map<String, ?> map) throws JSONException {
        String valueOf;
        try {
            JSONObject jSONObject = new JSONObject();
            for (String valueOf2 : map.keySet()) {
                m9070a(jSONObject, valueOf2, map.get(valueOf2));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            String str = "Could not convert map to JSON: ";
            valueOf2 = String.valueOf(e.getMessage());
            throw new JSONException(valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
    }

    /* renamed from: a */
    public void m9096a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: a */
    public void m9097a(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().addOnScrollChangedListener(onScrollChangedListener);
        }
    }

    /* renamed from: a */
    public void m9098a(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Throwable th) {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    public void m9099a(Context context, Uri uri) {
        try {
            Bundle bundle = new Bundle();
            if (((Boolean) bbb.dd.m7064c()).booleanValue() && aqd.m4916f()) {
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            }
            bundle.putString("com.android.browser.application_id", context.getPackageName());
            context.startActivity(new Intent("android.intent.action.VIEW", uri).putExtras(bundle));
            String valueOf = String.valueOf(uri.toString());
            bky.m9006b(new StringBuilder(String.valueOf(valueOf).length() + 26).append("Opening ").append(valueOf).append(" in a new browser.").toString());
        } catch (Throwable e) {
            bky.m9007b("No browser is found.", e);
        }
    }

    /* renamed from: a */
    public void m9100a(Context context, String str, WebSettings webSettings) {
        webSettings.setUserAgentString(m9087a(context, str));
    }

    /* renamed from: a */
    public void m9101a(final Context context, final String str, String str2, Bundle bundle, boolean z) {
        if (z) {
            bundle.putString("device", ako.m2343e().m9135e());
            bundle.putString("eids", TextUtils.join(",", bbb.m7127a()));
        }
        azp.m6789a().m9290a(context, str, str2, bundle, z, new C1281a(this) {
            /* renamed from: a */
            public void mo1260a(String str) {
                ako.m2343e().m9122b(context, str, str);
            }
        });
    }

    /* renamed from: a */
    public void m9102a(Context context, String str, List<String> list) {
        for (String bkq : list) {
            new bkq(context, str, bkq).mo195d();
        }
    }

    /* renamed from: a */
    public void m9103a(Context context, String str, boolean z, HttpURLConnection httpURLConnection) {
        m9104a(context, str, z, httpURLConnection, false);
    }

    /* renamed from: a */
    public void m9104a(Context context, String str, boolean z, HttpURLConnection httpURLConnection, boolean z2) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        httpURLConnection.setRequestProperty("User-Agent", m9087a(context, str));
        httpURLConnection.setUseCaches(z2);
    }

    /* renamed from: a */
    public void m9105a(final Context context, final List<String> list) {
        if (!(context instanceof Activity) || TextUtils.isEmpty(axl.m6366a((Activity) context))) {
            return;
        }
        if (list == null) {
            bkc.m9012a("Cannot ping urls: empty list.");
        } else if (bbp.m7192a(context)) {
            final bbp bbp = new bbp();
            bbp.m7195a(new C0994a(this) {
            });
            bbp.m7196b((Activity) context);
        } else {
            bkc.m9012a("Cannot ping url because custom tabs is not supported");
        }
    }

    /* renamed from: a */
    public void m9106a(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f6710a.post(runnable);
        }
    }

    /* renamed from: a */
    public void m9107a(List<String> list, String str) {
        for (String bkq : list) {
            new bkq(bkq, str).mo195d();
        }
    }

    /* renamed from: a */
    public boolean m9108a() {
        return this.f6712c;
    }

    /* renamed from: a */
    boolean m9109a(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    @TargetApi(24)
    /* renamed from: a */
    public boolean m9110a(Activity activity, Configuration configuration) {
        bkx a = azp.m6789a();
        int a2 = a.m9283a((Context) activity, configuration.screenHeightDp);
        int a3 = a.m9283a((Context) activity, configuration.screenWidthDp);
        DisplayMetrics a4 = m9082a((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = a4.heightPixels;
        int i2 = a4.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        identifier = ((Integer) bbb.dm.m7064c()).intValue() * ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d));
        return m9109a(i, dimensionPixelSize + a2, identifier) && m9109a(i2, a3, identifier);
    }

    /* renamed from: a */
    public boolean m9111a(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            bky.m9011e("Could not find com.google.android.gms.ads.AdActivity, please make sure it is declared in AndroidManifest.xml.");
            return false;
        }
        boolean z;
        String str = "com.google.android.gms.ads.AdActivity requires the android:configChanges value to contain \"%s\".";
        if ((resolveActivity.activityInfo.configChanges & 16) == 0) {
            bky.m9011e(String.format(str, new Object[]{"keyboard"}));
            z = false;
        } else {
            z = true;
        }
        if ((resolveActivity.activityInfo.configChanges & 32) == 0) {
            bky.m9011e(String.format(str, new Object[]{"keyboardHidden"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 128) == 0) {
            bky.m9011e(String.format(str, new Object[]{"orientation"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 256) == 0) {
            bky.m9011e(String.format(str, new Object[]{"screenLayout"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 512) == 0) {
            bky.m9011e(String.format(str, new Object[]{"uiMode"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & ByteConstants.KB) == 0) {
            bky.m9011e(String.format(str, new Object[]{"screenSize"}));
            z = false;
        }
        if ((resolveActivity.activityInfo.configChanges & 2048) != 0) {
            return z;
        }
        bky.m9011e(String.format(str, new Object[]{"smallestScreenSize"}));
        return false;
    }

    /* renamed from: a */
    public boolean m9112a(Context context, String str, String str2) {
        return ato.m5611b(context).m5605a(str2, str) == 0;
    }

    /* renamed from: a */
    public boolean m9113a(View view, Context context) {
        KeyguardManager keyguardManager = null;
        Context applicationContext = context.getApplicationContext();
        PowerManager powerManager = applicationContext != null ? (PowerManager) applicationContext.getSystemService("power") : null;
        Object systemService = context.getSystemService("keyguard");
        if (systemService != null && (systemService instanceof KeyguardManager)) {
            keyguardManager = (KeyguardManager) systemService;
        }
        return m9114a(view, powerManager, keyguardManager);
    }

    /* renamed from: a */
    public boolean m9114a(View view, PowerManager powerManager, KeyguardManager keyguardManager) {
        boolean z = ako.m2343e().m9108a() || !m9071a(keyguardManager);
        return view.getVisibility() == 0 && view.isShown() && m9072a(powerManager) && z && (!((Boolean) bbb.bm.m7064c()).booleanValue() || view.getLocalVisibleRect(new Rect()) || view.getGlobalVisibleRect(new Rect()));
    }

    /* renamed from: a */
    public boolean m9115a(ClassLoader classLoader, Class<?> cls, String str) {
        boolean z = false;
        try {
            z = cls.isAssignableFrom(Class.forName(str, false, classLoader));
        } catch (Throwable th) {
        }
        return z;
    }

    /* renamed from: a */
    public int[] m9116a(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m9137f();
        }
        return new int[]{window.findViewById(16908290).getWidth(), window.findViewById(16908290).getHeight()};
    }

    /* renamed from: b */
    public int m9117b(View view) {
        if (view == null) {
            return -1;
        }
        ViewParent parent = view.getParent();
        while (parent != null && !(parent instanceof AdapterView)) {
            parent = parent.getParent();
        }
        return parent == null ? -1 : ((AdapterView) parent).getPositionForView(view);
    }

    /* renamed from: b */
    public int m9118b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            String valueOf = String.valueOf(e);
            bky.m9011e(new StringBuilder(String.valueOf(valueOf).length() + 22).append("Could not parse value:").append(valueOf).toString());
            return 0;
        }
    }

    /* renamed from: b */
    String m9119b() {
        StringBuffer stringBuffer = new StringBuffer(256);
        stringBuffer.append("Mozilla/5.0 (Linux; U; Android");
        if (VERSION.RELEASE != null) {
            stringBuffer.append(" ").append(VERSION.RELEASE);
        }
        stringBuffer.append("; ").append(Locale.getDefault());
        if (Build.DEVICE != null) {
            stringBuffer.append("; ").append(Build.DEVICE);
            if (Build.DISPLAY != null) {
                stringBuffer.append(" Build/").append(Build.DISPLAY);
            }
        }
        stringBuffer.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m9120b(Context context, String str) {
        try {
            return new String(aqb.m4909a(context.openFileInput(str), true), Utf8Charset.NAME);
        } catch (Throwable e) {
            bky.m9007b("Error reading from internal storage.", e);
            return "";
        }
    }

    /* renamed from: b */
    public void m9121b(Activity activity, OnScrollChangedListener onScrollChangedListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            window.getDecorView().getViewTreeObserver().removeOnScrollChangedListener(onScrollChangedListener);
        }
    }

    /* renamed from: b */
    public void m9122b(Context context, String str, String str2) {
        List arrayList = new ArrayList();
        arrayList.add(str2);
        m9102a(context, str, arrayList);
    }

    /* renamed from: b */
    public void m9123b(Context context, String str, String str2, Bundle bundle, boolean z) {
        if (((Boolean) bbb.br.m7064c()).booleanValue()) {
            m9101a(context, str, str2, bundle, z);
        }
    }

    /* renamed from: b */
    public boolean m9124b(Context context) {
        if (this.f6714e) {
            return false;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.getApplicationContext().registerReceiver(new C1283a(), intentFilter);
        this.f6714e = true;
        return true;
    }

    /* renamed from: b */
    public int[] m9125b(Activity activity) {
        int[] a = m9116a(activity);
        return new int[]{azp.m6789a().m9295b((Context) activity, a[0]), azp.m6789a().m9295b((Context) activity, a[1])};
    }

    /* renamed from: c */
    public String m9126c() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: c */
    protected String m9127c(Context context) {
        try {
            return new WebView(context).getSettings().getUserAgentString();
        } catch (Exception e) {
            return m9119b();
        }
    }

    /* renamed from: c */
    public void m9128c(Context context, String str, String str2) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(str2.getBytes(Utf8Charset.NAME));
            openFileOutput.close();
        } catch (Throwable e) {
            bky.m9007b("Error writing to file in internal storage.", e);
        }
    }

    /* renamed from: c */
    public boolean m9129c(String str) {
        return TextUtils.isEmpty(str) ? false : str.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)");
    }

    /* renamed from: c */
    public int[] m9130c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null || window.findViewById(16908290) == null) {
            return m9137f();
        }
        return new int[]{window.findViewById(16908290).getTop(), window.findViewById(16908290).getBottom()};
    }

    /* renamed from: d */
    public Builder m9131d(Context context) {
        return new Builder(context);
    }

    /* renamed from: d */
    public String m9132d() {
        UUID randomUUID = UUID.randomUUID();
        byte[] toByteArray = BigInteger.valueOf(randomUUID.getLeastSignificantBits()).toByteArray();
        byte[] toByteArray2 = BigInteger.valueOf(randomUUID.getMostSignificantBits()).toByteArray();
        String bigInteger = new BigInteger(1, toByteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                instance.update(toByteArray);
                instance.update(toByteArray2);
                Object obj = new byte[8];
                System.arraycopy(instance.digest(), 0, obj, 0, 8);
                bigInteger = new BigInteger(1, obj).toString();
            } catch (NoSuchAlgorithmException e) {
            }
        }
        return bigInteger;
    }

    /* renamed from: d */
    public int[] m9133d(Activity activity) {
        int[] c = m9130c(activity);
        return new int[]{azp.m6789a().m9295b((Context) activity, c[0]), azp.m6789a().m9295b((Context) activity, c[1])};
    }

    /* renamed from: e */
    public bas m9134e(Context context) {
        return new bas(context);
    }

    /* renamed from: e */
    public String m9135e() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? str2 : new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length()).append(str).append(" ").append(str2).toString();
    }

    /* renamed from: f */
    public String m9136f(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return null;
            }
            List runningTasks = activityManager.getRunningTasks(1);
            if (!(runningTasks == null || runningTasks.isEmpty())) {
                RunningTaskInfo runningTaskInfo = (RunningTaskInfo) runningTasks.get(0);
                if (!(runningTaskInfo == null || runningTaskInfo.topActivity == null)) {
                    return runningTaskInfo.topActivity.getClassName();
                }
            }
            return null;
        } catch (Exception e) {
        }
    }

    /* renamed from: f */
    protected int[] m9137f() {
        return new int[]{0, 0};
    }

    /* renamed from: g */
    public float m9138g() {
        aki a = ako.m2363y().m2240a();
        return (a == null || !a.m2238d()) ? 1.0f : a.m2237c();
    }

    /* renamed from: g */
    public boolean m9139g(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
            if (activityManager == null || keyguardManager == null) {
                return false;
            }
            List<RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                return false;
            }
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    if (runningAppProcessInfo.importance == 100 && !keyguardManager.inKeyguardRestrictedInputMode() && m9077n(context)) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: h */
    public Bitmap m9140h(Context context) {
        if (!(context instanceof Activity)) {
            return null;
        }
        Bitmap d;
        try {
            if (((Boolean) bbb.bV.m7064c()).booleanValue()) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    d = m9076d(window.getDecorView().getRootView());
                }
                d = null;
            } else {
                d = m9075c(((Activity) context).getWindow().getDecorView());
            }
        } catch (Throwable e) {
            bky.m9007b("Fail to capture screen shot", e);
        }
        return d;
    }

    /* renamed from: h */
    public boolean m9141h() {
        aki a = ako.m2363y().m2240a();
        return a != null ? a.m2239e() : false;
    }

    /* renamed from: i */
    public AudioManager m9142i(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: i */
    public Bundle m9143i() {
        Bundle bundle = new Bundle();
        try {
            if (((Boolean) bbb.f5373F.m7064c()).booleanValue()) {
                Parcelable memoryInfo = new MemoryInfo();
                Debug.getMemoryInfo(memoryInfo);
                bundle.putParcelable("debug_memory_info", memoryInfo);
            }
            if (((Boolean) bbb.f5374G.m7064c()).booleanValue()) {
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free_memory", runtime.freeMemory());
                bundle.putLong("runtime_max_memory", runtime.maxMemory());
                bundle.putLong("runtime_total_memory", runtime.totalMemory());
            }
            bundle.putInt("web_view_count", ako.m2347i().m8971z());
        } catch (Throwable e) {
            bky.m9009c("Unable to gather memory stats", e);
        }
        return bundle;
    }

    /* renamed from: j */
    public float m9144j(Context context) {
        AudioManager i = m9142i(context);
        if (i == null) {
            return 0.0f;
        }
        int streamMaxVolume = i.getStreamMaxVolume(3);
        return streamMaxVolume != 0 ? ((float) i.getStreamVolume(3)) / ((float) streamMaxVolume) : 0.0f;
    }

    /* renamed from: k */
    public int m9145k(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo == null ? 0 : applicationInfo.targetSdkVersion;
    }

    /* renamed from: l */
    public boolean m9146l(Context context) {
        try {
            context.getClassLoader().loadClass(ClientApi.class.getName());
            return false;
        } catch (ClassNotFoundException e) {
            return true;
        } catch (Throwable th) {
            bky.m9007b("Error loading class.", th);
            ako.m2347i().m8934a(th, "AdUtil.isLiteSdk");
            return false;
        }
    }

    /* renamed from: m */
    public Bundle m9147m(Context context) {
        aym a = ako.m2347i().m8922a(context);
        return a == null ? null : m9081a(a);
    }
}
