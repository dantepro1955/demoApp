package com.p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ImageView;
import java.io.File;

/* renamed from: zn */
public class zn {
    /* renamed from: a */
    public static int m34832a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public static String m34833a(Context context) {
        Bundle g = zn.m34844g(context);
        if (g == null) {
            return null;
        }
        String string = g.getString("applovin.sdk.key");
        return string != null ? string : "";
    }

    /* renamed from: a */
    public static void m34834a(Context context, Uri uri, zl zlVar) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (Throwable th) {
            zlVar.mo5561g().mo5609b("AppLovinSdkUtils", "Unable to open \"" + uri + "\".", th);
        }
    }

    /* renamed from: a */
    public static void m34835a(Context context, String str, zl zlVar) {
        zn.m34834a(context, Uri.parse(str), zlVar);
    }

    /* renamed from: a */
    public static void m34836a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && (drawable instanceof BitmapDrawable)) {
                ((BitmapDrawable) drawable).getBitmap().recycle();
            }
        }
    }

    /* renamed from: a */
    public static void m34837a(ImageView imageView, Uri uri, int i) {
        zn.m34836a(imageView);
        Bitmap a = xy.m34846a(new File(uri.getPath()), i);
        if (a != null) {
            imageView.setImageBitmap(a);
        }
    }

    /* renamed from: b */
    public static zm m34838b(Context context) {
        zm zmVar = new zm();
        zmVar.m34462a(zn.m34839c(context));
        zmVar.m34460a(zn.m34840d(context));
        zmVar.m34461a(zn.m34842e(context));
        zmVar.m34463b(zn.m34843f(context));
        return zmVar;
    }

    /* renamed from: c */
    private static boolean m34839c(Context context) {
        Bundle g = zn.m34844g(context);
        return g != null && g.getBoolean("applovin.sdk.verbose_logging", false);
    }

    /* renamed from: d */
    private static long m34840d(Context context) {
        Bundle g = zn.m34844g(context);
        return g != null ? (long) g.getInt("applovin.sdk.ad_refresh_seconds", -100) : -100;
    }

    /* renamed from: d */
    public static boolean m34841d(String str) {
        return str != null && str.length() > 1;
    }

    /* renamed from: e */
    private static String m34842e(Context context) {
        Bundle g = zn.m34844g(context);
        if (g != null) {
            String string = g.getString("applovin.sdk.auto_preload_ad_sizes");
            if (string != null) {
                return string;
            }
        }
        return zd.f26072a.m34951c() + "," + zd.f26074c.m34951c();
    }

    /* renamed from: f */
    private static String m34843f(Context context) {
        Bundle g = zn.m34844g(context);
        if (g != null) {
            String string = g.getString("applovin.sdk.auto_preload_ad_types");
            if (string != null) {
                return string;
            }
        }
        return ze.f26079a.m34954a() + "," + ze.f26080b.m34954a() + "," + vo.f25749b.m34954a();
    }

    /* renamed from: g */
    private static Bundle m34844g(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (Throwable e) {
            Log.e("AppLovinSdk", "Unable to retrieve application metadata", e);
            return null;
        }
    }
}
