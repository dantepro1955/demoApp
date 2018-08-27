package com.p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.search.SearchAdView;
import com.google.android.gms.internal.zzeg;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import com.mopub.mobileads.resource.DrawableConstants.CtaButton;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.StringTokenizer;

@bhd
/* renamed from: bkx */
public class bkx {
    /* renamed from: a */
    public static final Handler f6798a = new Handler(Looper.getMainLooper());
    /* renamed from: b */
    private static final String f6799b = AdView.class.getName();
    /* renamed from: c */
    private static final String f6800c = ahy.class.getName();
    /* renamed from: d */
    private static final String f6801d = PublisherAdView.class.getName();
    /* renamed from: e */
    private static final String f6802e = aif.class.getName();
    /* renamed from: f */
    private static final String f6803f = SearchAdView.class.getName();
    /* renamed from: g */
    private static final String f6804g = ahu.class.getName();

    /* renamed from: bkx$a */
    public interface C1281a {
        /* renamed from: a */
        void mo1260a(String str);
    }

    /* renamed from: bkx$1 */
    class C13151 implements C1281a {
        C13151(bkx bkx) {
        }

        /* renamed from: a */
        public void mo1260a(final String str) {
            new Thread(this) {
                public void run() {
                    new bkz().mo1260a(str);
                }
            }.start();
        }
    }

    /* renamed from: a */
    private void m9282a(ViewGroup viewGroup, zzeg zzeg, String str, int i, int i2) {
        if (viewGroup.getChildCount() == 0) {
            Context context = viewGroup.getContext();
            View textView = new TextView(context);
            textView.setGravity(17);
            textView.setText(str);
            textView.setTextColor(i);
            textView.setBackgroundColor(i2);
            View frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(i);
            int a = m9283a(context, 3);
            frameLayout.addView(textView, new LayoutParams(zzeg.f14936f - a, zzeg.f14933c - a, 17));
            viewGroup.addView(frameLayout, zzeg.f14936f, zzeg.f14933c);
        }
    }

    /* renamed from: a */
    public int m9283a(Context context, int i) {
        return m9284a(context.getResources().getDisplayMetrics(), i);
    }

    /* renamed from: a */
    public int m9284a(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    /* renamed from: a */
    public String m9285a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
        if (string == null || m9294a()) {
            string = "emulator";
        }
        return m9286a(string);
    }

    /* renamed from: a */
    public String m9286a(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest.getInstance("MD5").update(str.getBytes());
                return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, r1.digest())});
            } catch (NoSuchAlgorithmException e) {
                i++;
            }
        }
        return null;
    }

    /* renamed from: a */
    String m9287a(String str, String str2, int i) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        StringBuilder stringBuilder = new StringBuilder();
        int i2 = i - 1;
        if (i <= 0 || !stringTokenizer.hasMoreElements()) {
            return str;
        }
        stringBuilder.append(stringTokenizer.nextToken());
        while (true) {
            int i3 = i2 - 1;
            if (i2 > 0 && stringTokenizer.hasMoreElements()) {
                stringBuilder.append(".").append(stringTokenizer.nextToken());
                i2 = i3;
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public String m9288a(StackTraceElement[] stackTraceElementArr, String str) {
        String className;
        for (int i = 0; i + 1 < stackTraceElementArr.length; i++) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className2 = stackTraceElement.getClassName();
            if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (f6799b.equalsIgnoreCase(className2) || f6800c.equalsIgnoreCase(className2) || f6801d.equalsIgnoreCase(className2) || f6802e.equalsIgnoreCase(className2) || f6803f.equalsIgnoreCase(className2) || f6804g.equalsIgnoreCase(className2))) {
                className = stackTraceElementArr[i + 1].getClassName();
                break;
            }
        }
        className = null;
        if (str != null) {
            CharSequence a = m9287a(str, ".", 3);
            if (!(className == null || className.contains(a))) {
                return className;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m9289a(Context context, String str, String str2, Bundle bundle, boolean z) {
        m9290a(context, str, str2, bundle, z, new C13151(this));
    }

    /* renamed from: a */
    public void m9290a(Context context, String str, String str2, Bundle bundle, boolean z, C1281a c1281a) {
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = context;
            }
            bundle.putString("os", VERSION.RELEASE);
            bundle.putString("api", String.valueOf(VERSION.SDK_INT));
            bundle.putString(AdDatabaseHelper.COLUMN_APPID, applicationContext.getPackageName());
            if (str == null) {
                str = aqm.m4517b().mo569b(context) + "." + 10260000;
            }
            bundle.putString("js", str);
        }
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str2);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        c1281a.mo1260a(appendQueryParameter.toString());
    }

    /* renamed from: a */
    public void m9291a(ViewGroup viewGroup, zzeg zzeg, String str) {
        m9282a(viewGroup, zzeg, str, (int) CtaButton.BACKGROUND_COLOR, -1);
    }

    /* renamed from: a */
    public void m9292a(ViewGroup viewGroup, zzeg zzeg, String str, String str2) {
        bky.m9011e(str2);
        m9282a(viewGroup, zzeg, str, -65536, (int) CtaButton.BACKGROUND_COLOR);
    }

    /* renamed from: a */
    public void m9293a(boolean z, HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(z);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    /* renamed from: a */
    public boolean m9294a() {
        return Build.DEVICE.startsWith("generic");
    }

    /* renamed from: b */
    public int m9295b(Context context, int i) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return m9296b(displayMetrics, i);
    }

    /* renamed from: b */
    public int m9296b(DisplayMetrics displayMetrics, int i) {
        return Math.round(((float) i) / displayMetrics.density);
    }

    /* renamed from: b */
    public String m9297b(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return contentResolver == null ? null : Secure.getString(contentResolver, "android_id");
    }

    /* renamed from: b */
    public boolean m9298b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    public boolean m9299c(Context context) {
        return aqm.m4517b().mo565a(context) == 0;
    }

    /* renamed from: d */
    public boolean m9300d(Context context) {
        int a = aqm.m4517b().mo565a(context);
        return a == 0 || a == 2;
    }

    /* renamed from: e */
    public boolean m9301e(Context context) {
        if (context.getResources().getConfiguration().orientation != 2) {
            return false;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((int) (((float) displayMetrics.heightPixels) / displayMetrics.density)) < 600;
    }

    @TargetApi(17)
    /* renamed from: f */
    public boolean m9302f(Context context) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (aqd.m4915e()) {
            defaultDisplay.getRealMetrics(displayMetrics);
            i = displayMetrics.heightPixels;
            i2 = displayMetrics.widthPixels;
        } else {
            try {
                i = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i2 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
            } catch (Exception e) {
                return false;
            }
        }
        defaultDisplay.getMetrics(displayMetrics);
        boolean z = displayMetrics.heightPixels == i && displayMetrics.widthPixels == i2;
        return z;
    }

    /* renamed from: g */
    public int m9303g(Context context) {
        int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0;
    }
}
