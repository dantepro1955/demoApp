package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.under9.android.lib.network.model.Constants;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;

/* compiled from: PiwikMetricsController */
/* renamed from: dit */
public class dit {
    /* renamed from: a */
    private static dte f21760a;
    /* renamed from: b */
    private static String f21761b = "";
    /* renamed from: c */
    private static String f21762c = "";
    /* renamed from: d */
    private static String f21763d = "";
    /* renamed from: e */
    private static String f21764e = "";
    /* renamed from: f */
    private static String f21765f = "";
    /* renamed from: g */
    private static String f21766g = "";
    /* renamed from: h */
    private static boolean f21767h = false;
    /* renamed from: i */
    private static final Set<String> f21768i = new HashSet();
    /* renamed from: j */
    private static final Set<String> f21769j = new HashSet();
    /* renamed from: k */
    private static String f21770k = "";

    /* renamed from: a */
    public static synchronized void m27470a(Context context, String str, int i) {
        synchronized (dit.class) {
            try {
                if (f21760a == null) {
                    f21760a = new diw(str, i, null, dtb.m29229a(context));
                }
            } catch (MalformedURLException e) {
                if (dit.m27481b()) {
                    Log.d("PiwikMetricsController", "Exception=" + e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27477a(boolean z) {
        f21767h = z;
    }

    /* renamed from: b */
    private static boolean m27481b() {
        return f21767h;
    }

    /* renamed from: a */
    public static dte m27467a() {
        return f21760a;
    }

    /* renamed from: a */
    public static void m27468a(int i) {
        if (f21760a != null) {
            f21760a.a(i);
        }
    }

    /* renamed from: a */
    public static void m27469a(long j) {
        if (f21760a != null) {
            f21760a.a(j);
        }
    }

    /* renamed from: a */
    public static void m27473a(String str) {
        f21762c = str;
    }

    /* renamed from: b */
    public static void m27479b(String str) {
        f21761b = str;
    }

    /* renamed from: c */
    public static void m27484c(String str) {
        f21763d = str;
        if (f21760a != null) {
            f21760a.a(f21763d);
        }
    }

    /* renamed from: d */
    public static void m27487d(String str) {
        if (f21760a != null) {
            f21760a.b(str);
        }
    }

    /* renamed from: e */
    public static void m27489e(String str) {
        f21765f = str;
    }

    /* renamed from: f */
    public static void m27490f(String str) {
        f21770k = str;
    }

    /* renamed from: g */
    public static void m27492g(String str) {
        f21769j.add(str);
    }

    /* renamed from: c */
    private static dtd m27482c() {
        return new dtd().m29239a(dtc.USER_AGENT, f21762c).m29239a(dtc.LANGUAGE, f21761b);
    }

    /* renamed from: a */
    private static dtd m27466a(dtd dtd, diu diu) {
        if (diu != null) {
            diu.m27495a(1, "DeviceUUID", f21765f);
            return dtd.m29239a(dtc.VISIT_SCOPE_CUSTOM_VARIABLES, diu.toString());
        }
        dsz dsz = new dsz();
        dsz.m29196a(1, "DeviceUUID", f21765f);
        dsz.m29196a(2, "eventUUID", UUID.randomUUID().toString());
        dsz.m29196a(3, "eventSeqNum", String.valueOf(dit.m27488e()));
        dsz.m29196a(4, "eventSource", "mobile");
        dsz.m29196a(5, "Experiments", f21770k);
        return dtd.m29239a(dtc.VISIT_SCOPE_CUSTOM_VARIABLES, dsz.toString());
    }

    /* renamed from: a */
    public static void m27474a(String str, String str2) {
        if (f21760a != null) {
            dit.m27476a(str, str2, null, null, dit.m27485d());
        }
    }

    /* renamed from: a */
    public static void m27475a(String str, String str2, String str3) {
        if (f21760a != null) {
            dit.m27476a(str, str2, str3, null, dit.m27485d());
        }
    }

    /* renamed from: a */
    public static void m27476a(String str, String str2, String str3, Long l, diu diu) {
        try {
            if (f21760a != null) {
                dtd c = dit.m27482c();
                c.m29239a(dtc.EVENT_CATEGORY, str).m29239a(dtc.EVENT_ACTION, str2);
                if (!TextUtils.isEmpty(f21766g)) {
                    if (TextUtils.isEmpty(f21764e) || !dit.m27491f()) {
                        c.m29239a(dtc.URL_PATH, f21766g);
                    } else {
                        c.m29239a(dtc.URL_PATH, f21766g + Constants.SEP + f21764e);
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    c.m29239a(dtc.EVENT_NAME, str3);
                }
                if (l != null) {
                    c.m29236a(dtc.EVENT_VALUE, (float) l.longValue());
                }
                if (diu != null) {
                    dit.m27471a(diu);
                    dit.m27478b(diu);
                    dit.m27483c(diu);
                    dit.m27486d(diu);
                }
                dit.m27466a(c, diu);
                f21760a.a(c);
                if (dit.m27481b()) {
                    Log.d("PiwikMetricsController", "userId=[" + f21760a.g() + "]" + " visitorId=[" + f21760a.h() + "]" + " category=[" + str + "]" + " action=[" + str2 + "]" + " label=[" + str3 + "]" + " value=[" + l + "]" + " lang=[" + f21761b + "]" + " cvars=[" + c.m29243b(dtc.VISIT_SCOPE_CUSTOM_VARIABLES) + "]" + " user-agent=[" + f21760a.f().m29243b(dtc.USER_AGENT) + " ]" + " url=[" + c.m29243b(dtc.URL_PATH) + "]");
                }
            }
        } catch (Exception e) {
            if (dit.m27481b()) {
                Log.d("PiwikMetricsController", "Exception=" + e);
            }
        }
    }

    /* renamed from: h */
    public static void m27493h(String str) {
        f21766g = str;
        f21764e = null;
        try {
            if (f21760a != null) {
                dtd c = dit.m27482c();
                c.m29235a(1, "DeviceUUID", f21765f);
                c.m29235a(2, "eventUUID", UUID.randomUUID().toString());
                c.m29235a(3, "eventSeqNum", String.valueOf(dit.m27488e()));
                c.m29235a(4, "Experiments", f21770k);
                f21760a.a(c, str);
                if (dit.m27481b()) {
                    Log.d("PiwikMetricsController", "userId=[" + f21760a.g() + "]" + " visitorId=[" + f21760a.h() + "]" + " logScreenName=[" + str + "]" + " user-agent=[" + f21760a.f().m29243b(dtc.USER_AGENT) + "]" + " cvars=[" + c.m29243b(dtc.SCREEN_SCOPE_CUSTOM_VARIABLES) + "]");
                }
            }
        } catch (Exception e) {
            if (dit.m27481b()) {
                Log.d("PiwikMetricsController", "Exception=" + e);
            }
        }
    }

    /* renamed from: b */
    public static void m27480b(String str, String str2) {
        dit.m27493h(str);
        f21764e = str2;
    }

    /* renamed from: d */
    private static diu m27485d() {
        diu diu = new diu();
        diu.m27495a(2, "eventUUID", UUID.randomUUID().toString());
        diu.m27495a(3, "eventSeqNum", String.valueOf(dit.m27488e()));
        diu.m27495a(4, "Experiments", f21770k);
        return diu;
    }

    /* renamed from: a */
    private static void m27471a(diu diu) {
        dit.m27472a(diu, "eventUUID", UUID.randomUUID().toString());
    }

    /* renamed from: b */
    private static void m27478b(diu diu) {
        int i = 2;
        while (diu.containsKey(String.valueOf(i))) {
            try {
                if (!"eventSeqNum".equals(((JSONArray) diu.get(String.valueOf(i))).getString(0))) {
                    int i2 = i + 1;
                    if (i2 <= 10) {
                        i = i2;
                    } else {
                        return;
                    }
                }
                return;
            } catch (Throwable e) {
                if (dit.m27481b()) {
                    Log.e("PiwikMetricsController", e.getMessage(), e);
                    return;
                }
                return;
            }
        }
        diu.m27495a(i, "eventSeqNum", String.valueOf(dit.m27488e()));
    }

    /* renamed from: c */
    private static void m27483c(diu diu) {
        dit.m27472a(diu, "eventSource", "mobile");
    }

    /* renamed from: d */
    private static void m27486d(diu diu) {
        dit.m27472a(diu, "Experiments", f21770k);
    }

    /* renamed from: a */
    private static void m27472a(diu diu, String str, String str2) {
        int i = 2;
        while (diu.containsKey(String.valueOf(i))) {
            try {
                if (!str.equals(((JSONArray) diu.get(String.valueOf(i))).getString(0))) {
                    int i2 = i + 1;
                    if (i2 <= 10) {
                        i = i2;
                    } else {
                        return;
                    }
                }
                return;
            } catch (Throwable e) {
                if (dit.m27481b()) {
                    Log.e("PiwikMetricsController", e.getMessage(), e);
                    return;
                }
                return;
            }
        }
        diu.m27495a(i, str, str2);
    }

    /* renamed from: e */
    private static synchronized long m27488e() {
        long j;
        synchronized (dit.class) {
            SharedPreferences k = f21760a.k();
            j = k.getLong("eventSeqNum", 0);
            k.edit().putLong("eventSeqNum", 1 + j).commit();
        }
        return j;
    }

    /* renamed from: f */
    private static boolean m27491f() {
        boolean z;
        for (String startsWith : f21768i) {
            if (f21766g.startsWith(startsWith)) {
                z = true;
                break;
            }
        }
        z = false;
        if (f21769j.contains(f21766g)) {
            return true;
        }
        return z;
    }
}
