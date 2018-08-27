package com.p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.onesignal.SyncService;
import com.under9.android.lib.network.model.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.dav.C4750a;

/* compiled from: OneSignal */
/* renamed from: dat */
public class dat {
    /* renamed from: A */
    private static Double f16705A;
    /* renamed from: B */
    private static Float f16706B;
    /* renamed from: C */
    private static Integer f16707C;
    /* renamed from: D */
    private static C3583a f16708D;
    /* renamed from: a */
    public static String f16709a;
    /* renamed from: b */
    static String f16710b;
    /* renamed from: c */
    public static Context f16711c;
    /* renamed from: d */
    static boolean f16712d;
    /* renamed from: e */
    public static String f16713e = "native";
    /* renamed from: f */
    static Collection<JSONArray> f16714f = new ArrayList();
    /* renamed from: g */
    private static boolean f16715g;
    /* renamed from: h */
    private static dat$c f16716h = dat$c.f20961a;
    /* renamed from: i */
    private static dat$c f16717i = dat$c.f20964d;
    /* renamed from: j */
    private static String f16718j = null;
    /* renamed from: k */
    private static int f16719k = 1;
    /* renamed from: l */
    private static C1759d f16720l;
    /* renamed from: m */
    private static boolean f16721m;
    /* renamed from: n */
    private static dat$b f16722n;
    /* renamed from: o */
    private static long f16723o = 1;
    /* renamed from: p */
    private static long f16724p = -1;
    /* renamed from: q */
    private static dbc f16725q;
    /* renamed from: r */
    private static dbb f16726r;
    /* renamed from: s */
    private static daj f16727s = new dai();
    /* renamed from: t */
    private static int f16728t;
    /* renamed from: u */
    private static das f16729u;
    /* renamed from: v */
    private static boolean f16730v;
    /* renamed from: w */
    private static String f16731w;
    /* renamed from: x */
    private static boolean f16732x;
    /* renamed from: y */
    private static boolean f16733y;
    /* renamed from: z */
    private static Double f16734z;

    /* compiled from: OneSignal */
    /* renamed from: dat$d */
    public interface C1759d {
        /* renamed from: a */
        void mo1784a(String str, JSONObject jSONObject, boolean z);
    }

    /* compiled from: OneSignal */
    /* renamed from: dat$a */
    public static class C3583a {
        /* renamed from: a */
        Context f16702a;
        /* renamed from: b */
        C1759d f16703b;
        /* renamed from: c */
        boolean f16704c;

        private C3583a() {
        }

        private C3583a(Context context) {
            this.f16702a = context;
        }

        /* renamed from: a */
        public C3583a m20861a(C1759d c1759d) {
            this.f16703b = c1759d;
            return this;
        }

        /* renamed from: a */
        public void m20862a() {
            dat.m20895b(this);
        }
    }

    /* renamed from: a */
    public static C3583a m20863a(Context context) {
        return new C3583a(context);
    }

    /* renamed from: b */
    private static void m20895b(C3583a c3583a) {
        f16708D = c3583a;
        Context context = f16708D.f16702a;
        f16708D.f16702a = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            dat.m20870a(context, bundle.getString("onesignal_google_project_number").substring(4), bundle.getString("onesignal_app_id"), f16708D.f16703b);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m20870a(Context context, String str, String str2, C1759d c1759d) {
        if (f16708D == null) {
            f16708D = new C3583a();
        }
        f16729u = new das();
        f16728t = f16729u.a();
        try {
            UUID.fromString(str2);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str2) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str2)) {
                dat.m20874a(dat$c.f20964d, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            if (f16728t == 1) {
                try {
                    Double.parseDouble(str);
                    if (str.length() < 8 || str.length() > 16) {
                        throw new IllegalArgumentException("Google Project number (Sender_ID) should be a 10 to 14 digit number in length.");
                    }
                } catch (Throwable th) {
                    dat.m20875a(dat$c.f20962b, "Google Project number (Sender_ID) format is invalid. Please use the 10 to 14 digit number found in the Google Developer Console for your project.\nExample: '703322744261'\n", th);
                    f16719k = -6;
                }
                try {
                    Class.forName("com.google.android.gms.gcm.GoogleCloudMessaging");
                } catch (Throwable th2) {
                    dat.m20875a(dat$c.f20962b, "The GCM Google Play services client library was not found. Please make sure to include it in your project.", th2);
                    f16719k = -4;
                }
            }
            f16710b = str;
            try {
                Class.forName("ik");
                try {
                    Class.forName("android.support.v4.content.WakefulBroadcastReceiver");
                    Class.forName("em");
                } catch (Throwable th22) {
                    dat.m20875a(dat$c.f20962b, "The included Android Support Library v4 is to old or incomplete. Please update your project's android-support-v4.jar to the latest revision.", th22);
                    f16719k = -5;
                }
            } catch (Throwable th222) {
                dat.m20875a(dat$c.f20962b, "Could not find the Android Support Library v4. Please make sure android-support-v4.jar has been correctly added to your project.", th222);
                f16719k = -3;
            }
            if (f16712d) {
                if (context != null) {
                    f16711c = context.getApplicationContext();
                }
                if (c1759d != null) {
                    f16720l = c1759d;
                }
                if (f16720l != null) {
                    dat.m20927v();
                    return;
                }
                return;
            }
            boolean z = context instanceof Activity;
            f16721m = z;
            f16709a = str2;
            f16711c = context.getApplicationContext();
            if (z) {
                dae.f20925b = (Activity) context;
            } else {
                dae.f20924a = true;
            }
            f16720l = c1759d;
            f16723o = SystemClock.elapsedRealtime();
            daw.a(f16711c);
            f16711c.startService(new Intent(f16711c, SyncService.class));
            if (VERSION.SDK_INT > 13) {
                ((Application) f16711c).registerActivityLifecycleCallbacks(new daf());
            } else {
                dag.a();
            }
            try {
                Class.forName("com.amazon.device.iap.PurchasingListener");
                f16726r = new dbb(f16711c);
            } catch (ClassNotFoundException e) {
            }
            String e2 = dat.m20906e();
            if (e2 == null) {
                dat.m20899c(f16709a);
            } else if (!e2.equals(f16709a)) {
                dat.m20874a(dat$c.f20966f, "APP ID changed, clearing user id as it is no longer valid.");
                dat.m20899c(f16709a);
                daw.e();
            }
            if (f16721m || dat.m20909f() == null) {
                dat.m20926u();
            }
            if (f16720l != null) {
                dat.m20927v();
            }
            if (dbc.a(f16711c)) {
                f16725q = new dbc(f16711c);
            }
            f16712d = true;
        } catch (Throwable th2222) {
            dat.m20875a(dat$c.f20962b, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th2222);
        }
    }

    /* renamed from: u */
    private static void m20926u() {
        if (!f16715g) {
            dax day;
            f16715g = true;
            if (f16728t == 2) {
                day = new day();
            } else {
                day = new daz();
            }
            day.a(f16711c, f16710b, new dat$1());
            dap.a(f16711c, f16708D.f16704c, new dat$2());
        }
    }

    /* renamed from: v */
    private static void m20927v() {
        for (JSONArray a : f16714f) {
            dat.m20881a(a, false);
        }
        f16714f.clear();
    }

    /* renamed from: w */
    private static void m20928w() {
        String d = daw.d();
        if (f16731w != null && !f16731w.equals(d)) {
            daw.a(f16731w);
            dat.m20903d();
        }
    }

    /* renamed from: a */
    private static boolean m20887a(dat$c dat_c) {
        return dat_c.compareTo(f16716h) < 1 || dat_c.compareTo(f16717i) < 1;
    }

    /* renamed from: a */
    static void m20874a(dat$c dat_c, String str) {
        dat.m20875a(dat_c, str, null);
    }

    /* renamed from: a */
    static void m20875a(dat$c dat_c, String str, Throwable th) {
        if (dat_c.compareTo(f16717i) < 1) {
            if (dat_c == dat$c.f20967g) {
                Log.v("OneSignal", str, th);
            } else if (dat_c == dat$c.f20966f) {
                Log.d("OneSignal", str, th);
            } else if (dat_c == dat$c.f20965e) {
                Log.i("OneSignal", str, th);
            } else if (dat_c == dat$c.f20964d) {
                Log.w("OneSignal", str, th);
            } else if (dat_c == dat$c.f20963c || dat_c == dat$c.f20962b) {
                Log.e("OneSignal", str, th);
            }
        }
        if (dat_c.compareTo(f16716h) < 1 && dae.f20925b != null) {
            try {
                String str2 = str + "\n";
                if (th != null) {
                    str2 = str2 + th.getMessage();
                    Writer stringWriter = new StringWriter();
                    th.printStackTrace(new PrintWriter(stringWriter));
                    str2 = str2 + stringWriter.toString();
                }
                dat.m20876a(new dat$3(dat_c, str2));
            } catch (Throwable th2) {
                Log.e("OneSignal", "Error showing logging message.", th2);
            }
        }
    }

    /* renamed from: b */
    private static void m20896b(String str, int i, Throwable th, String str2) {
        String str3 = "";
        if (str2 != null && dat.m20887a(dat$c.f20965e)) {
            str3 = "\n" + str2 + "\n";
        }
        dat.m20875a(dat$c.f20964d, "HTTP code: " + i + " " + str + str3, th);
    }

    /* renamed from: a */
    public static void m20867a() {
        dat.m20874a(dat$c.f20965e, "Deprecated! onPaused is now tracked automatically, please remove calls to OneSignal.onPaused() and OneSignal.onResume().");
    }

    /* renamed from: a */
    public static void m20884a(boolean z) {
        f16721m = false;
        if (f16712d) {
            if (f16726r != null) {
                f16726r.a();
            }
            if (f16723o != -1) {
                long elapsedRealtime = (long) ((((double) (SystemClock.elapsedRealtime() - f16723o)) / 1000.0d) + 0.5d);
                f16723o = SystemClock.elapsedRealtime();
                if (elapsedRealtime >= 0 && elapsedRealtime <= 604800) {
                    if (f16711c == null) {
                        dat.m20874a(dat$c.f20963c, "Android Context not found, please call OneSignal.init when your app starts.");
                        return;
                    }
                    elapsedRealtime += dat.m20910g();
                    if (z || elapsedRealtime < 60 || dat.m20909f() == null) {
                        dat.m20892b(elapsedRealtime);
                    } else {
                        dat.m20869a(elapsedRealtime, true);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m20869a(long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", f16709a);
            jSONObject.put(ServerProtocol.DIALOG_PARAM_STATE, "ping");
            jSONObject.put("active_time", j);
            dat.m20883a(jSONObject);
            String str = "players/" + dat.m20909f() + "/on_focus";
            C4750a dat_4 = new dat$4();
            if (z) {
                dav.d(str, jSONObject, dat_4);
            } else {
                dav.b(str, jSONObject, dat_4);
            }
        } catch (Throwable th) {
            dat.m20875a(dat$c.f20963c, "Generating on_focus:JSON Failed.", th);
        }
    }

    /* renamed from: b */
    static void m20891b() {
        f16721m = true;
        f16723o = SystemClock.elapsedRealtime();
        dat.m20926u();
        if (f16725q != null) {
            f16725q.a();
        }
    }

    /* renamed from: c */
    static boolean m20900c() {
        return f16721m;
    }

    /* renamed from: a */
    private static void m20883a(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", f16729u.b());
        } catch (Throwable th) {
        }
    }

    /* renamed from: x */
    private static int m20929x() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    /* renamed from: y */
    private static void m20930y() {
        dat.m20874a(dat$c.f20966f, "registerUser: registerForPushFired:" + f16732x + ", locationFired: " + f16733y);
        if (!f16732x || !f16733y) {
            return;
        }
        if (f16730v) {
            dat.m20928w();
            return;
        }
        f16730v = true;
        new Thread(new dat$5()).start();
    }

    /* renamed from: a */
    public static void m20873a(dat$b dat_b) {
        f16722n = dat_b;
        if (dat.m20909f() != null) {
            dat.m20931z();
        }
    }

    /* renamed from: d */
    static void m20903d() {
        if (f16722n != null) {
            dat.m20876a(new dat$6());
        }
    }

    /* renamed from: z */
    private static void m20931z() {
        if (f16722n != null) {
            String d = daw.d();
            if (!daw.c()) {
                d = null;
            }
            String f = dat.m20909f();
            if (f != null) {
                f16722n.a(f, d);
                if (d != null) {
                    f16722n = null;
                }
            }
        }
    }

    /* renamed from: a */
    static void m20882a(JSONArray jSONArray, boolean z, C4750a c4750a) {
        if (dat.m20909f() != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", f16709a);
                if (z) {
                    jSONObject.put("existing", true);
                }
                jSONObject.put("purchases", jSONArray);
                dav.b("players/" + dat.m20909f() + "/on_purchase", jSONObject, c4750a);
            } catch (Throwable th) {
                dat.m20875a(dat$c.f20963c, "Failed to generate JSON for sendPurchases.", th);
            }
        }
    }

    /* renamed from: a */
    private static boolean m20886a(Context context, JSONArray jSONArray) {
        boolean z = false;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("custom")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
                    if (jSONObject2.has("u")) {
                        String string = jSONObject2.getString("u");
                        if (!string.contains(Constants.SCHEME_SEP)) {
                            string = "http://" + string;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(string));
                        intent.addFlags(1476919296);
                        context.startActivity(intent);
                        z = true;
                    }
                }
            } catch (Throwable th) {
                dat.m20875a(dat$c.f20963c, "Error parsing JSON item " + i + Constants.SEP + length + " for launching a web URL.", th);
            }
        }
        return z;
    }

    /* renamed from: a */
    private static void m20881a(JSONArray jSONArray, boolean z) {
        Throwable th;
        if (f16720l == null) {
            f16714f.add(jSONArray);
            return;
        }
        int length = jSONArray.length();
        int i = 0;
        JSONObject jSONObject = null;
        String str = null;
        while (i < length) {
            JSONObject jSONObject2;
            try {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                if (jSONObject3.has("custom")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.getString("custom"));
                    jSONObject2 = new JSONObject();
                    if (jSONObject4.has("a")) {
                        jSONObject2 = jSONObject4.getJSONObject("a");
                    }
                    if (jSONObject3.has("title")) {
                        jSONObject2.put("title", jSONObject3.getString("title"));
                    }
                    if (jSONObject4.has("u")) {
                        jSONObject2.put("launchURL", jSONObject4.getString("u"));
                    }
                    if (jSONObject3.has("sound")) {
                        jSONObject2.put("sound", jSONObject3.getString("sound"));
                    }
                    if (jSONObject3.has("sicon")) {
                        jSONObject2.put("smallIcon", jSONObject3.getString("sicon"));
                    }
                    if (jSONObject3.has("licon")) {
                        jSONObject2.put("largeIcon", jSONObject3.getString("licon"));
                    }
                    if (jSONObject3.has("bicon")) {
                        jSONObject2.put("bigPicture", jSONObject3.getString("bicon"));
                    }
                    if (jSONObject2.equals(new JSONObject())) {
                        jSONObject2 = null;
                    }
                } else {
                    jSONObject2 = null;
                }
                if (str == null) {
                    try {
                        str = jSONObject3.getString("alert");
                    } catch (Throwable th2) {
                        th = th2;
                        dat.m20875a(dat$c.f20963c, "Error parsing JSON item " + i + Constants.SEP + length + " for callback.", th);
                        i++;
                        jSONObject = jSONObject2;
                    }
                } else {
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    if (!jSONObject.has("stacked_notifications")) {
                        jSONObject.put("stacked_notifications", new JSONArray());
                    }
                    jSONObject2.put(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, jSONObject3.getString("alert"));
                    jSONObject.getJSONArray("stacked_notifications").put(jSONObject2);
                    jSONObject2 = jSONObject;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                jSONObject2 = jSONObject;
                th = th4;
                dat.m20875a(dat$c.f20963c, "Error parsing JSON item " + i + Constants.SEP + length + " for callback.", th);
                i++;
                jSONObject = jSONObject2;
            }
            i++;
            jSONObject = jSONObject2;
        }
        dat.m20879a(str, jSONObject, z);
    }

    /* renamed from: a */
    private static void m20879a(String str, JSONObject jSONObject, boolean z) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            f16720l.mo1784a(str, jSONObject, z);
        } else {
            dat.m20876a(new dat$7(str, jSONObject, z));
        }
    }

    /* renamed from: a */
    static void m20880a(JSONArray jSONArray) {
        dat.m20893b(f16711c, jSONArray);
        dat.m20881a(jSONArray, true);
    }

    /* renamed from: a */
    public static void m20871a(Context context, JSONArray jSONArray, boolean z) {
        dat.m20893b(context, jSONArray);
        boolean equals = "DISABLE".equals(das.a(context, "com.onesignal.NotificationOpened.DEFAULT"));
        boolean z2;
        if (equals) {
            z2 = false;
        } else {
            z2 = dat.m20886a(context, jSONArray);
        }
        dat.m20881a(jSONArray, false);
        if (!z && !r0) {
            dat.m20894b(context, jSONArray, equals);
        }
    }

    /* renamed from: b */
    private static void m20894b(Context context, JSONArray jSONArray, boolean z) {
        Object obj = 1;
        PackageManager packageManager = context.getPackageManager();
        Object obj2 = null;
        Intent intent = new Intent().setAction("com.onesignal.NotificationOpened.RECEIVE").setPackage(context.getPackageName());
        if (packageManager.queryBroadcastReceivers(intent, 32).size() > 0) {
            intent.putExtra("onesignal_data", jSONArray.toString());
            context.sendBroadcast(intent);
            obj2 = 1;
        }
        if (packageManager.queryIntentActivities(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST).size() > 0) {
            if (obj2 == null) {
                intent.putExtra("onesignal_data", jSONArray.toString());
            }
            intent.setFlags(268566528);
            context.startActivity(intent);
        } else {
            obj = obj2;
        }
        if (obj == null && !z) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null) {
                launchIntentForPackage.setFlags(268566528);
                context.startActivity(launchIntentForPackage);
            }
        }
    }

    /* renamed from: b */
    private static void m20893b(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.has("custom")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("custom"));
                    if (jSONObject2.has("i")) {
                        String string = jSONObject2.getString("i");
                        jSONObject2 = new JSONObject();
                        jSONObject2.put("app_id", dat.m20911g(context));
                        jSONObject2.put("player_id", dat.m20912h(context));
                        jSONObject2.put("opened", true);
                        dav.a("notifications/" + string, jSONObject2, new dat$8());
                    }
                }
            } catch (Throwable th) {
                dat.m20875a(dat$c.f20963c, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    /* renamed from: c */
    private static void m20899c(String str) {
        if (f16711c != null) {
            Editor edit = dat.m20908f(f16711c).edit();
            edit.putString("GT_APP_ID", str);
            edit.commit();
        }
    }

    /* renamed from: e */
    public static String m20906e() {
        return dat.m20911g(f16711c);
    }

    /* renamed from: g */
    private static String m20911g(Context context) {
        if (context == null) {
            return "";
        }
        return dat.m20908f(context).getString("GT_APP_ID", null);
    }

    /* renamed from: h */
    private static String m20912h(Context context) {
        if (context == null) {
            return "";
        }
        return dat.m20908f(context).getString("GT_PLAYER_ID", null);
    }

    /* renamed from: f */
    public static String m20909f() {
        if (f16718j == null && f16711c != null) {
            f16718j = dat.m20908f(f16711c).getString("GT_PLAYER_ID", null);
        }
        return f16718j;
    }

    /* renamed from: a */
    static void m20877a(String str) {
        f16718j = str;
        if (f16711c != null) {
            Editor edit = dat.m20908f(f16711c).edit();
            edit.putString("GT_PLAYER_ID", f16718j);
            edit.commit();
        }
    }

    /* renamed from: b */
    static boolean m20898b(Context context) {
        return dat.m20908f(context).getBoolean("GT_VIBRATE_ENABLED", true);
    }

    /* renamed from: c */
    static boolean m20901c(Context context) {
        return dat.m20908f(context).getBoolean("GT_SOUND_ENABLED", true);
    }

    /* renamed from: d */
    static boolean m20904d(Context context) {
        return dat.m20908f(context).getBoolean("ONESIGNAL_ALWAYS_SHOW_NOTIF", false);
    }

    /* renamed from: e */
    static boolean m20907e(Context context) {
        return dat.m20908f(context).getBoolean("ONESIGNAL_INAPP_ALERT", false);
    }

    /* renamed from: b */
    public static void m20897b(boolean z) {
        if (f16711c == null) {
            dat.m20874a(dat$c.f20963c, "OneSignal.init has not been called. Could not set subscription.");
        } else {
            daw.b(z);
        }
    }

    /* renamed from: g */
    public static long m20910g() {
        if (f16724p == -1 && f16711c != null) {
            f16724p = dat.m20908f(f16711c).getLong("GT_UNSENT_ACTIVE_TIME", 0);
        }
        dat.m20874a(dat$c.f20965e, "GetUnsentActiveTime: " + f16724p);
        return f16724p;
    }

    /* renamed from: b */
    private static void m20892b(long j) {
        f16724p = j;
        if (f16711c != null) {
            dat.m20874a(dat$c.f20965e, "SaveUnsentActiveTime: " + f16724p);
            Editor edit = dat.m20908f(f16711c).edit();
            edit.putLong("GT_UNSENT_ACTIVE_TIME", j);
            edit.commit();
        }
    }

    /* renamed from: f */
    static SharedPreferences m20908f(Context context) {
        return context.getSharedPreferences(dat.class.getSimpleName(), 0);
    }

    /* renamed from: a */
    static boolean m20888a(String str, Context context) {
        if (str == null || "".equals(str)) {
            return false;
        }
        SQLiteDatabase readableDatabase = new dau(context).getReadableDatabase();
        Cursor query = readableDatabase.query("notification", new String[]{"notification_id"}, "notification_id = ?", new String[]{str}, null, null, null);
        boolean moveToFirst = query.moveToFirst();
        query.close();
        readableDatabase.close();
        if (!moveToFirst) {
            return false;
        }
        dat.m20874a(dat$c.f20966f, "Duplicate GCM message received, skipping processing. " + str);
        return true;
    }

    /* renamed from: a */
    static void m20876a(Runnable runnable) {
        new Handler(Looper.getMainLooper()).post(runnable);
    }

    /* renamed from: a */
    static boolean m20885a(Context context, Bundle bundle) {
        if (bundle.isEmpty()) {
            return true;
        }
        try {
            if (bundle.containsKey("custom")) {
                JSONObject jSONObject = new JSONObject(bundle.getString("custom"));
                if (jSONObject.has("i")) {
                    return dat.m20888a(jSONObject.getString("i"), context);
                }
                dat.m20874a(dat$c.f20966f, "Not a OneSignal formatted GCM message. No 'i' field in custom.");
                return true;
            }
            dat.m20874a(dat$c.f20966f, "Not a OneSignal formatted GCM message. No 'custom' field in the bundle.");
            return true;
        } catch (Throwable th) {
            dat.m20875a(dat$c.f20966f, "Could not parse bundle for duplicate, probably not a OneSignal notification.", th);
            return true;
        }
    }
}
