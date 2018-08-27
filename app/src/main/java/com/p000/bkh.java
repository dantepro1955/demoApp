package com.p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;

@TargetApi(8)
@bhd
/* renamed from: bkh */
public class bkh {

    @TargetApi(9)
    /* renamed from: bkh$a */
    public static class C1285a extends bkh {
        public C1285a() {
            super();
        }

        /* renamed from: a */
        public int mo1261a() {
            return 6;
        }

        /* renamed from: a */
        public boolean mo1262a(Request request) {
            request.setShowRunningNotification(true);
            return true;
        }

        /* renamed from: b */
        public int mo1263b() {
            return 7;
        }
    }

    @TargetApi(11)
    /* renamed from: bkh$b */
    public static class C1287b extends C1285a {
        /* renamed from: a */
        public blp mo1264a(blo blo, boolean z) {
            return new blx(blo, z);
        }

        /* renamed from: a */
        public Set<String> mo1265a(Uri uri) {
            return uri.getQueryParameterNames();
        }

        /* renamed from: a */
        public boolean mo1262a(Request request) {
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            return true;
        }

        /* renamed from: a */
        public boolean mo1266a(final Context context, final WebSettings webSettings) {
            super.mo1266a(context, webSettings);
            return ((Boolean) bku.m9268a(new Callable<Boolean>(this) {
                /* renamed from: a */
                public Boolean m9175a() {
                    if (context.getCacheDir() != null) {
                        webSettings.setAppCachePath(context.getCacheDir().getAbsolutePath());
                        webSettings.setAppCacheMaxSize(0);
                        webSettings.setAppCacheEnabled(true);
                    }
                    webSettings.setDatabasePath(context.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                    webSettings.setDatabaseEnabled(true);
                    webSettings.setDomStorageEnabled(true);
                    webSettings.setDisplayZoomControls(false);
                    webSettings.setBuiltInZoomControls(true);
                    webSettings.setSupportZoom(true);
                    webSettings.setAllowContentAccess(false);
                    return Boolean.valueOf(true);
                }

                public /* synthetic */ Object call() throws Exception {
                    return m9175a();
                }
            })).booleanValue();
        }

        /* renamed from: a */
        public boolean mo1267a(Window window) {
            window.setFlags(16777216, 16777216);
            return true;
        }

        /* renamed from: b */
        public boolean mo1268b(View view) {
            view.setLayerType(0, null);
            return true;
        }

        /* renamed from: c */
        public WebChromeClient mo1269c(blo blo) {
            return new blw(blo);
        }

        /* renamed from: c */
        public boolean mo1270c(View view) {
            view.setLayerType(1, null);
            return true;
        }
    }

    @TargetApi(14)
    /* renamed from: bkh$c */
    public static class C1288c extends C1287b {
        /* renamed from: a */
        public String mo1271a(SslError sslError) {
            return sslError.getUrl();
        }

        /* renamed from: c */
        public WebChromeClient mo1269c(blo blo) {
            return new bly(blo);
        }
    }

    @TargetApi(16)
    /* renamed from: bkh$f */
    public static class C1289f extends C1288c {
        /* renamed from: a */
        public void mo1272a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
                mo1274a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
            }
        }

        /* renamed from: a */
        public void mo1273a(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: a */
        public void mo1274a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: a */
        public boolean mo1266a(Context context, WebSettings webSettings) {
            super.mo1266a(context, webSettings);
            webSettings.setAllowFileAccessFromFileURLs(false);
            webSettings.setAllowUniversalAccessFromFileURLs(false);
            return true;
        }
    }

    @TargetApi(17)
    /* renamed from: bkh$d */
    public static class C1290d extends C1289f {
        /* renamed from: a */
        public Drawable mo1275a(Context context, Bitmap bitmap, boolean z, float f) {
            if (!z || f <= 0.0f || f > 25.0f) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
            try {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
                RenderScript create = RenderScript.create(context);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                create2.setRadius(f);
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                return new BitmapDrawable(context.getResources(), createBitmap);
            } catch (RuntimeException e) {
                return new BitmapDrawable(context.getResources(), bitmap);
            }
        }

        /* renamed from: a */
        public String mo1276a(Context context) {
            return bkv.m9270a().m9273c(context);
        }

        /* renamed from: a */
        public boolean mo1266a(Context context, WebSettings webSettings) {
            super.mo1266a(context, webSettings);
            webSettings.setMediaPlaybackRequiresUserGesture(false);
            return true;
        }

        /* renamed from: b */
        public void mo1277b(Context context) {
            bkv.m9270a().m9272b(context);
            ako.m2347i().m8969x();
        }
    }

    @TargetApi(18)
    /* renamed from: bkh$e */
    public static class C1291e extends C1290d {
        /* renamed from: a */
        public boolean mo1278a(View view) {
            return super.mo1278a(view) || view.getWindowId() != null;
        }

        /* renamed from: c */
        public int mo1279c() {
            return 14;
        }
    }

    @TargetApi(19)
    /* renamed from: bkh$g */
    public static class C1292g extends C1291e {
        /* renamed from: a */
        public boolean mo1278a(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: d */
        public LayoutParams mo1280d() {
            return new LayoutParams(-1, -1);
        }
    }

    @TargetApi(21)
    /* renamed from: bkh$h */
    public static class C1293h extends C1292g {
        /* renamed from: a */
        public blp mo1264a(blo blo, boolean z) {
            return new bma(blo, z);
        }

        /* renamed from: c */
        public CookieManager mo1281c(Context context) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable e) {
                bky.m9007b("Failed to obtain CookieManager.", e);
                ako.m2347i().m8934a(e, "ApiLevelUtil.getCookieManager");
                return null;
            }
        }
    }

    private bkh() {
    }

    /* renamed from: a */
    public static bkh m9148a(int i) {
        return i >= 21 ? new C1293h() : i >= 19 ? new C1292g() : i >= 18 ? new C1291e() : i >= 17 ? new C1290d() : i >= 16 ? new C1289f() : i >= 14 ? new C1288c() : i >= 11 ? new C1287b() : i >= 9 ? new C1285a() : new bkh();
    }

    /* renamed from: a */
    public int mo1261a() {
        return 0;
    }

    /* renamed from: a */
    public Drawable mo1275a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: a */
    public blp mo1264a(blo blo, boolean z) {
        return new blp(blo, z);
    }

    /* renamed from: a */
    public String mo1276a(Context context) {
        return "";
    }

    /* renamed from: a */
    public String mo1271a(SslError sslError) {
        return "";
    }

    /* renamed from: a */
    public Set<String> mo1265a(Uri uri) {
        if (uri.isOpaque()) {
            return Collections.emptySet();
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        Set linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: a */
    public void mo1272a(Activity activity, OnGlobalLayoutListener onGlobalLayoutListener) {
        Window window = activity.getWindow();
        if (window != null && window.getDecorView() != null && window.getDecorView().getViewTreeObserver() != null) {
            mo1274a(window.getDecorView().getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    /* renamed from: a */
    public void mo1273a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public void mo1274a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: a */
    public boolean mo1262a(Request request) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1266a(Context context, WebSettings webSettings) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1278a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public boolean mo1267a(Window window) {
        return false;
    }

    /* renamed from: a */
    public boolean m9162a(blo blo) {
        if (blo == null) {
            return false;
        }
        blo.onPause();
        return true;
    }

    /* renamed from: b */
    public int mo1263b() {
        return 1;
    }

    /* renamed from: b */
    public void mo1277b(Context context) {
        ako.m2347i().m8969x();
    }

    /* renamed from: b */
    public boolean mo1268b(View view) {
        return false;
    }

    /* renamed from: b */
    public boolean m9166b(blo blo) {
        if (blo == null) {
            return false;
        }
        blo.onResume();
        return true;
    }

    /* renamed from: c */
    public int mo1279c() {
        return 5;
    }

    /* renamed from: c */
    public CookieManager mo1281c(Context context) {
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable e) {
            bky.m9007b("Failed to obtain CookieManager.", e);
            ako.m2347i().m8934a(e, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: c */
    public WebChromeClient mo1269c(blo blo) {
        return null;
    }

    /* renamed from: c */
    public boolean mo1270c(View view) {
        return false;
    }

    /* renamed from: d */
    public LayoutParams mo1280d() {
        return new LayoutParams(-2, -2);
    }
}
