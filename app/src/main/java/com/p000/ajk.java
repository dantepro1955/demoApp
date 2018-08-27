package com.p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.facebook.internal.AnalyticsEvents;
import com.inmobi.commons.ads.cache.AdDatabaseHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p000.bgb.C0210a;

@bhd
/* renamed from: ajk */
public class ajk extends C0210a {
    /* renamed from: a */
    private String f1688a;
    /* renamed from: b */
    private Context f1689b;
    /* renamed from: c */
    private String f1690c;
    /* renamed from: d */
    private ArrayList<String> f1691d;

    public ajk(String str, ArrayList<String> arrayList, Context context, String str2) {
        this.f1690c = str;
        this.f1691d = arrayList;
        this.f1688a = str2;
        this.f1689b = context;
    }

    /* renamed from: a */
    protected int m1871a(int i) {
        return i == 0 ? 1 : i == 1 ? 2 : i == 4 ? 3 : 0;
    }

    /* renamed from: a */
    public String mo215a() {
        return this.f1690c;
    }

    /* renamed from: b */
    Map<String, String> m1873b() {
        String packageName = this.f1689b.getPackageName();
        Object obj = "";
        try {
            obj = ato.m5611b(this.f1689b).m5609b(packageName, 0).versionName;
        } catch (Throwable e) {
            bky.m9009c("Error to retrieve app version", e);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - ako.m2347i().m8949e().m8973a();
        Map<String, String> hashMap = new HashMap();
        hashMap.put("sessionid", ako.m2347i().m8923a());
        hashMap.put(AdDatabaseHelper.COLUMN_APPID, packageName);
        hashMap.put("osversion", String.valueOf(VERSION.SDK_INT));
        hashMap.put("sdkversion", this.f1688a);
        hashMap.put("appversion", obj);
        hashMap.put("timestamp", String.valueOf(elapsedRealtime));
        return hashMap;
    }

    /* renamed from: b */
    public void mo216b(int i) {
        if (i == 1) {
            m1875c();
        }
        Map b = m1873b();
        b.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, String.valueOf(i));
        b.put("sku", this.f1690c);
        List linkedList = new LinkedList();
        Iterator it = this.f1691d.iterator();
        while (it.hasNext()) {
            linkedList.add(ako.m2343e().m9091a((String) it.next(), b));
        }
        ako.m2343e().m9102a(this.f1689b, this.f1688a, linkedList);
    }

    /* renamed from: c */
    void m1875c() {
        try {
            this.f1689b.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter").getDeclaredMethod("reportWithProductId", new Class[]{Context.class, String.class, String.class, Boolean.TYPE}).invoke(null, new Object[]{this.f1689b, this.f1690c, "", Boolean.valueOf(true)});
        } catch (ClassNotFoundException e) {
            bky.m9011e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (NoSuchMethodException e2) {
            bky.m9011e("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
        } catch (Throwable e3) {
            bky.m9009c("Fail to report a conversion.", e3);
        }
    }

    /* renamed from: c */
    public void mo217c(int i) {
        if (i == 0) {
            m1875c();
        }
        Map b = m1873b();
        b.put("google_play_status", String.valueOf(i));
        b.put("sku", this.f1690c);
        b.put(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, String.valueOf(m1871a(i)));
        List linkedList = new LinkedList();
        Iterator it = this.f1691d.iterator();
        while (it.hasNext()) {
            linkedList.add(ako.m2343e().m9091a((String) it.next(), b));
        }
        ako.m2343e().m9102a(this.f1689b, this.f1688a, linkedList);
    }
}
