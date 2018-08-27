package com.p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.facebook.places.model.PlaceFields;
import com.facebook.stetho.common.Utf8Charset;
import com.mopub.common.GpsHelper;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: ym */
class ym {
    /* renamed from: a */
    private final vm f26048a;
    /* renamed from: b */
    private final Context f26049b;
    /* renamed from: c */
    private final zi f26050c;
    /* renamed from: d */
    private final Map f26051d;

    ym(vm vmVar) {
        if (vmVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f26048a = vmVar;
        this.f26050c = vmVar.mo5561g();
        this.f26049b = vmVar.m34404i();
        this.f26051d = Collections.synchronizedMap(new HashMap());
    }

    /* renamed from: a */
    static boolean m34920a(String str, Context context) {
        if (str == null) {
            throw new IllegalArgumentException("No permission name specified");
        } else if (context != null) {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* renamed from: a */
    yp m34921a() {
        Object obj = this.f26051d.get(yp.class);
        if (obj != null) {
            return (yp) obj;
        }
        yp ypVar = new yp();
        ypVar.f26065h = Locale.getDefault();
        ypVar.f26058a = Build.MODEL;
        ypVar.f26059b = VERSION.RELEASE;
        ypVar.f26060c = Build.MANUFACTURER;
        ypVar.f26062e = VERSION.SDK_INT;
        ypVar.f26061d = Build.DEVICE;
        if (m34922a("android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f26049b.getSystemService(PlaceFields.PHONE);
            if (telephonyManager != null) {
                ypVar.f26063f = telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH);
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                try {
                    ypVar.f26064g = URLEncoder.encode(networkOperatorName, Utf8Charset.NAME);
                } catch (UnsupportedEncodingException e) {
                    ypVar.f26064g = networkOperatorName;
                }
            }
        }
        this.f26051d.put(yp.class, ypVar);
        return ypVar;
    }

    /* renamed from: a */
    boolean m34922a(String str) {
        return ym.m34920a(str, this.f26049b);
    }

    /* renamed from: b */
    yo m34923b() {
        Object obj = this.f26051d.get(yo.class);
        if (obj != null) {
            return (yo) obj;
        }
        ApplicationInfo applicationInfo = this.f26049b.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        PackageManager packageManager = this.f26049b.getPackageManager();
        PackageInfo packageInfo = null;
        try {
            packageInfo = packageManager.getPackageInfo(this.f26049b.getPackageName(), 0);
        } catch (NameNotFoundException e) {
        }
        yo yoVar = new yo();
        yoVar.f26056c = applicationInfo.packageName;
        yoVar.f26057d = lastModified;
        yoVar.f26054a = String.valueOf(packageManager.getApplicationLabel(applicationInfo));
        yoVar.f26055b = packageInfo != null ? packageInfo.versionName : "";
        this.f26051d.put(yo.class, yoVar);
        return yoVar;
    }

    /* renamed from: c */
    yn m34924c() {
        try {
            Class cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            if (cls != null) {
                Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f26049b});
                if (invoke != null) {
                    Class cls2 = invoke.getClass();
                    Object invoke2 = cls2.getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, null).invoke(invoke, null);
                    invoke = cls2.getMethod("getId", null).invoke(invoke, null);
                    yn ynVar = new yn();
                    String str = (String) invoke;
                    String str2 = str == null ? "" : str;
                    ynVar.f26052a = ((Boolean) invoke2).booleanValue();
                    ynVar.f26053b = str2;
                    return ynVar;
                }
            }
        } catch (Throwable e) {
            this.f26050c.mo5611c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e);
        } catch (Throwable e2) {
            this.f26050c.mo5609b("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e2);
        }
        yn ynVar2 = new yn();
        ynVar2.f26053b = "";
        ynVar2.f26052a = false;
        return ynVar2;
    }
}
