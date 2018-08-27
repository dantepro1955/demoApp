package com.p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.places.model.PlaceFields;
import java.util.Locale;

@bhd
/* renamed from: bic */
public final class bic {
    /* renamed from: a */
    public final int f6417a;
    /* renamed from: b */
    public final boolean f6418b;
    /* renamed from: c */
    public final boolean f6419c;
    /* renamed from: d */
    public final String f6420d;
    /* renamed from: e */
    public final String f6421e;
    /* renamed from: f */
    public final boolean f6422f;
    /* renamed from: g */
    public final boolean f6423g;
    /* renamed from: h */
    public final boolean f6424h;
    /* renamed from: i */
    public final boolean f6425i;
    /* renamed from: j */
    public final String f6426j;
    /* renamed from: k */
    public final String f6427k;
    /* renamed from: l */
    public final int f6428l;
    /* renamed from: m */
    public final int f6429m;
    /* renamed from: n */
    public final int f6430n;
    /* renamed from: o */
    public final int f6431o;
    /* renamed from: p */
    public final int f6432p;
    /* renamed from: q */
    public final int f6433q;
    /* renamed from: r */
    public final float f6434r;
    /* renamed from: s */
    public final int f6435s;
    /* renamed from: t */
    public final int f6436t;
    /* renamed from: u */
    public final double f6437u;
    /* renamed from: v */
    public final boolean f6438v;
    /* renamed from: w */
    public final boolean f6439w;
    /* renamed from: x */
    public final int f6440x;
    /* renamed from: y */
    public final String f6441y;
    /* renamed from: z */
    public final boolean f6442z;

    /* renamed from: bic$a */
    public static final class C1232a {
        /* renamed from: a */
        private int f6391a;
        /* renamed from: b */
        private boolean f6392b;
        /* renamed from: c */
        private boolean f6393c;
        /* renamed from: d */
        private int f6394d;
        /* renamed from: e */
        private int f6395e;
        /* renamed from: f */
        private int f6396f;
        /* renamed from: g */
        private String f6397g;
        /* renamed from: h */
        private int f6398h;
        /* renamed from: i */
        private int f6399i;
        /* renamed from: j */
        private int f6400j;
        /* renamed from: k */
        private boolean f6401k;
        /* renamed from: l */
        private int f6402l;
        /* renamed from: m */
        private double f6403m;
        /* renamed from: n */
        private boolean f6404n;
        /* renamed from: o */
        private String f6405o;
        /* renamed from: p */
        private boolean f6406p;
        /* renamed from: q */
        private boolean f6407q;
        /* renamed from: r */
        private String f6408r;
        /* renamed from: s */
        private boolean f6409s;
        /* renamed from: t */
        private boolean f6410t;
        /* renamed from: u */
        private String f6411u;
        /* renamed from: v */
        private String f6412v;
        /* renamed from: w */
        private float f6413w;
        /* renamed from: x */
        private int f6414x;
        /* renamed from: y */
        private int f6415y;
        /* renamed from: z */
        private boolean f6416z;

        public C1232a(Context context) {
            boolean z = true;
            PackageManager packageManager = context.getPackageManager();
            m8657a(context);
            m8658b(context);
            m8659c(context);
            Locale locale = Locale.getDefault();
            this.f6406p = C1232a.m8655a(packageManager, "geo:0,0?q=donuts") != null;
            if (C1232a.m8655a(packageManager, "http://www.google.com") == null) {
                z = false;
            }
            this.f6407q = z;
            this.f6408r = locale.getCountry();
            this.f6409s = azp.m6789a().m9294a();
            this.f6410t = apw.m4892c(context);
            this.f6411u = locale.getLanguage();
            this.f6412v = C1232a.m8656a(context, packageManager);
            Resources resources = context.getResources();
            if (resources != null) {
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                if (displayMetrics != null) {
                    this.f6413w = displayMetrics.density;
                    this.f6414x = displayMetrics.widthPixels;
                    this.f6415y = displayMetrics.heightPixels;
                }
            }
        }

        public C1232a(Context context, bic bic) {
            context.getPackageManager();
            m8657a(context);
            m8658b(context);
            m8659c(context);
            m8660d(context);
            this.f6406p = bic.f6418b;
            this.f6407q = bic.f6419c;
            this.f6408r = bic.f6421e;
            this.f6409s = bic.f6422f;
            this.f6410t = bic.f6423g;
            this.f6411u = bic.f6426j;
            this.f6412v = bic.f6427k;
            this.f6413w = bic.f6434r;
            this.f6414x = bic.f6435s;
            this.f6415y = bic.f6436t;
        }

        /* renamed from: a */
        private static ResolveInfo m8655a(PackageManager packageManager, String str) {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST);
        }

        /* renamed from: a */
        private static String m8656a(Context context, PackageManager packageManager) {
            String str = null;
            ResolveInfo a = C1232a.m8655a(packageManager, "market://details?id=com.google.android.gms.ads");
            if (a != null) {
                ActivityInfo activityInfo = a.activityInfo;
                if (activityInfo != null) {
                    try {
                        PackageInfo b = ato.m5611b(context).m5609b(activityInfo.packageName, 0);
                        if (b != null) {
                            int i = b.versionCode;
                            String valueOf = String.valueOf(activityInfo.packageName);
                            str = new StringBuilder(String.valueOf(valueOf).length() + 12).append(i).append(".").append(valueOf).toString();
                        }
                    } catch (NameNotFoundException e) {
                    }
                }
            }
            return str;
        }

        /* renamed from: a */
        private void m8657a(Context context) {
            AudioManager i = ako.m2343e().m9142i(context);
            if (i != null) {
                try {
                    this.f6391a = i.getMode();
                    this.f6392b = i.isMusicActive();
                    this.f6393c = i.isSpeakerphoneOn();
                    this.f6394d = i.getStreamVolume(3);
                    this.f6395e = i.getRingerMode();
                    this.f6396f = i.getStreamVolume(2);
                    return;
                } catch (Throwable th) {
                    ako.m2347i().m8934a(th, "DeviceInfo.gatherAudioInfo");
                }
            }
            this.f6391a = -2;
            this.f6392b = false;
            this.f6393c = false;
            this.f6394d = 0;
            this.f6395e = 0;
            this.f6396f = 0;
        }

        @TargetApi(16)
        /* renamed from: b */
        private void m8658b(Context context) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(PlaceFields.PHONE);
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            this.f6397g = telephonyManager.getNetworkOperator();
            this.f6399i = telephonyManager.getNetworkType();
            this.f6400j = telephonyManager.getPhoneType();
            this.f6398h = -2;
            this.f6401k = false;
            this.f6402l = -1;
            if (ako.m2343e().m9112a(context, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE")) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    this.f6398h = activeNetworkInfo.getType();
                    this.f6402l = activeNetworkInfo.getDetailedState().ordinal();
                } else {
                    this.f6398h = -1;
                }
                if (VERSION.SDK_INT >= 16) {
                    this.f6401k = connectivityManager.isActiveNetworkMetered();
                }
            }
        }

        /* renamed from: c */
        private void m8659c(Context context) {
            boolean z = false;
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, -1);
                this.f6403m = (double) (((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
                if (intExtra == 2 || intExtra == 5) {
                    z = true;
                }
                this.f6404n = z;
                return;
            }
            this.f6403m = -1.0d;
            this.f6404n = false;
        }

        /* renamed from: d */
        private void m8660d(Context context) {
            this.f6405o = Build.FINGERPRINT;
            this.f6416z = bbp.m7192a(context);
        }

        /* renamed from: a */
        public bic m8661a() {
            return new bic(this.f6391a, this.f6406p, this.f6407q, this.f6397g, this.f6408r, this.f6409s, this.f6410t, this.f6392b, this.f6393c, this.f6411u, this.f6412v, this.f6394d, this.f6398h, this.f6399i, this.f6400j, this.f6395e, this.f6396f, this.f6413w, this.f6414x, this.f6415y, this.f6403m, this.f6404n, this.f6401k, this.f6402l, this.f6405o, this.f6416z);
        }
    }

    bic(int i, boolean z, boolean z2, String str, String str2, boolean z3, boolean z4, boolean z5, boolean z6, String str3, String str4, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, double d, boolean z7, boolean z8, int i10, String str5, boolean z9) {
        this.f6417a = i;
        this.f6418b = z;
        this.f6419c = z2;
        this.f6420d = str;
        this.f6421e = str2;
        this.f6422f = z3;
        this.f6423g = z4;
        this.f6424h = z5;
        this.f6425i = z6;
        this.f6426j = str3;
        this.f6427k = str4;
        this.f6428l = i2;
        this.f6429m = i3;
        this.f6430n = i4;
        this.f6431o = i5;
        this.f6432p = i6;
        this.f6433q = i7;
        this.f6434r = f;
        this.f6435s = i8;
        this.f6436t = i9;
        this.f6437u = d;
        this.f6438v = z7;
        this.f6439w = z8;
        this.f6440x = i10;
        this.f6441y = str5;
        this.f6442z = z9;
    }
}
