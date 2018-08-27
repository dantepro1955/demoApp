package com.p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.HandlerThread;
import com.inmobi.monetization.internal.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.dav.C4750a;

/* compiled from: OneSignalStateSynchronizer */
/* renamed from: daw */
public class daw {
    /* renamed from: a */
    static HashMap<Integer, C4756a> f20988a = new HashMap();
    /* renamed from: b */
    private static boolean f20989b = false;
    /* renamed from: c */
    private static boolean f20990c = false;
    /* renamed from: d */
    private static boolean f20991d = false;
    /* renamed from: e */
    private static C4757b f20992e;
    /* renamed from: f */
    private static C4757b f20993f;
    /* renamed from: g */
    private static Context f20994g;
    /* renamed from: h */
    private static final String[] f20995h = new String[]{"lat", "long", "loc_acc", "loc_type"};
    /* renamed from: i */
    private static final Set<String> f20996i = new HashSet(Arrays.asList(f20995h));

    /* compiled from: OneSignalStateSynchronizer */
    /* renamed from: daw$a */
    static class C4756a extends HandlerThread {
        /* renamed from: a */
        int f20980a;
        /* renamed from: b */
        Handler f20981b = null;
        /* renamed from: c */
        int f20982c;

        /* compiled from: OneSignalStateSynchronizer */
        /* renamed from: daw$a$1 */
        class C47551 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C4756a f20979a;

            C47551(C4756a c4756a) {
                this.f20979a = c4756a;
            }

            public void run() {
                daw.m26150a(false);
            }
        }

        C4756a(int i) {
            super("NetworkHandlerThread");
            this.f20980a = i;
            start();
            this.f20981b = new Handler(getLooper());
        }

        /* renamed from: a */
        public void m26123a() {
            this.f20982c = 0;
            this.f20981b.removeCallbacksAndMessages(null);
            this.f20981b.postDelayed(m26122d(), 5000);
        }

        /* renamed from: d */
        private Runnable m26122d() {
            switch (this.f20980a) {
                case 0:
                    return new C47551(this);
                default:
                    return null;
            }
        }

        /* renamed from: b */
        void m26124b() {
            this.f20981b.removeCallbacksAndMessages(null);
        }

        /* renamed from: c */
        void m26125c() {
            if (this.f20982c < 3 && !this.f20981b.hasMessages(0)) {
                this.f20982c++;
                this.f20981b.postDelayed(m26122d(), (long) (this.f20982c * Constants.HTTP_TIMEOUT));
            }
        }
    }

    /* compiled from: OneSignalStateSynchronizer */
    /* renamed from: daw$b */
    class C4757b {
        /* renamed from: a */
        JSONObject f20983a;
        /* renamed from: b */
        JSONObject f20984b;
        /* renamed from: c */
        final /* synthetic */ daw f20985c;
        /* renamed from: d */
        private final int f20986d;
        /* renamed from: e */
        private String f20987e;

        private C4757b(daw daw, String str, boolean z) {
            this.f20985c = daw;
            this.f20986d = -2;
            this.f20987e = str;
            if (z) {
                m26138c();
                return;
            }
            this.f20983a = new JSONObject();
            this.f20984b = new JSONObject();
        }

        /* renamed from: a */
        private C4757b m26127a(String str) {
            C4757b c4757b = new C4757b(this.f20985c, str, false);
            try {
                c4757b.f20983a = new JSONObject(this.f20983a.toString());
                c4757b.f20984b = new JSONObject(this.f20984b.toString());
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return c4757b;
        }

        /* renamed from: a */
        private void m26131a() {
            try {
                this.f20984b.put("notification_types", m26134b());
            } catch (JSONException e) {
            }
        }

        /* renamed from: b */
        private int m26134b() {
            try {
                int i = this.f20983a.getInt("subscribableStatus");
                boolean z = this.f20983a.getBoolean("userSubscribePref");
                if (i < -2) {
                    return i;
                }
                return z ? 1 : -2;
            } catch (JSONException e) {
                e.printStackTrace();
                return 1;
            }
        }

        /* renamed from: a */
        private Set<String> m26128a(JSONObject jSONObject, JSONObject jSONObject2) {
            try {
                if (jSONObject.getDouble("lat") == jSONObject2.getDouble("lat") && jSONObject.getDouble("long") == jSONObject2.getDouble("long") && jSONObject.getDouble("loc_acc") == jSONObject2.getDouble("loc_acc") && jSONObject.getDouble("loc_type") == jSONObject2.getDouble("loc_type")) {
                    return null;
                }
                return daw.f20996i;
            } catch (Throwable th) {
                return daw.f20996i;
            }
        }

        /* renamed from: a */
        private JSONObject m26130a(C4757b c4757b, boolean z) {
            m26131a();
            c4757b.m26131a();
            JSONObject a = daw.m26155b(this.f20984b, c4757b.f20984b, null, m26128a(this.f20984b, c4757b.f20984b));
            if (!z && a.toString().equals("{}")) {
                return null;
            }
            try {
                if (!a.has("app_id")) {
                    a.put("app_id", (String) this.f20984b.opt("app_id"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return a;
        }

        /* renamed from: a */
        void m26140a(String str, Object obj) {
            try {
                this.f20984b.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: b */
        void m26141b(String str, Object obj) {
            try {
                this.f20983a.put(str, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        private void m26138c() {
            int i = 1;
            SharedPreferences f = dat.f(daw.f20994g);
            String string = f.getString("ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f20987e, null);
            if (string == null) {
                this.f20983a = new JSONObject();
                try {
                    int i2;
                    boolean z;
                    if (this.f20987e.equals("CURRENT_STATE")) {
                        i2 = f.getInt("ONESIGNAL_SUBSCRIPTION", 1);
                    } else {
                        i2 = f.getInt("ONESIGNAL_SYNCED_SUBSCRIPTION", 1);
                    }
                    if (i2 == -2) {
                        z = false;
                    } else {
                        i = i2;
                        z = true;
                    }
                    this.f20983a.put("subscribableStatus", i);
                    this.f20983a.put("userSubscribePref", z);
                } catch (JSONException e) {
                }
            } else {
                try {
                    this.f20983a = new JSONObject(string);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            string = f.getString("ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f20987e, null);
            if (string == null) {
                try {
                    this.f20984b = new JSONObject();
                    this.f20984b.put("identifier", f.getString("GT_REGISTRATION_ID", null));
                    return;
                } catch (JSONException e22) {
                    e22.printStackTrace();
                    return;
                }
            }
            this.f20984b = new JSONObject(string);
        }

        /* renamed from: d */
        private void m26139d() {
            m26136b("pkgs");
            Editor edit = dat.f(daw.f20994g).edit();
            edit.putString("ONESIGNAL_USERSTATE_SYNCVALYES_" + this.f20987e, this.f20984b.toString());
            edit.putString("ONESIGNAL_USERSTATE_DEPENDVALYES_" + this.f20987e, this.f20983a.toString());
            edit.commit();
        }

        /* renamed from: b */
        private void m26136b(String str) {
            int i = 0;
            if (this.f20984b.has(str + "_d") || !this.f20984b.has(str + "_d")) {
                try {
                    JSONArray jSONArray;
                    if (this.f20984b.has(str)) {
                        jSONArray = this.f20984b.getJSONArray(str);
                    } else {
                        jSONArray = new JSONArray();
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    if (this.f20984b.has(str + "_d")) {
                        String a = daw.m26154b(this.f20984b.getJSONArray(str + "_d"));
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            if (!a.contains(jSONArray.getString(i2))) {
                                jSONArray2.put(jSONArray.get(i2));
                            }
                        }
                    } else {
                        jSONArray2 = jSONArray;
                    }
                    if (this.f20984b.has(str + "_a")) {
                        jSONArray = this.f20984b.getJSONArray(str + "_a");
                        while (i < jSONArray.length()) {
                            jSONArray2.put(jSONArray.get(i));
                            i++;
                        }
                    }
                    this.f20984b.put(str, jSONArray2);
                    this.f20984b.remove(str + "_a");
                    this.f20984b.remove(str + "_d");
                } catch (Throwable th) {
                }
            }
        }

        /* renamed from: b */
        private void m26137b(JSONObject jSONObject, JSONObject jSONObject2) {
            if (jSONObject != null) {
                daw.m26155b(this.f20983a, jSONObject, this.f20983a, null);
            }
            if (jSONObject2 != null) {
                daw.m26155b(this.f20984b, jSONObject2, this.f20984b, null);
                if (jSONObject2.has("tags")) {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject optJSONObject = jSONObject2.optJSONObject("tags");
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String str = (String) keys.next();
                            if (!"".equals(optJSONObject.optString(str))) {
                                jSONObject3.put(str, optJSONObject.optString(str));
                            }
                        } catch (Throwable th) {
                        }
                    }
                    if (jSONObject3.toString().equals("{}")) {
                        this.f20984b.remove("tags");
                    } else {
                        this.f20984b.put("tags", jSONObject3);
                    }
                }
            }
            if (jSONObject != null || jSONObject2 != null) {
                m26139d();
            }
        }
    }

    daw() {
    }

    /* renamed from: b */
    private static JSONObject m26155b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject jSONObject4;
        Iterator keys = jSONObject2.keys();
        if (jSONObject3 != null) {
            jSONObject4 = jSONObject3;
        } else {
            jSONObject4 = new JSONObject();
        }
        while (keys.hasNext()) {
            try {
                String str = (String) keys.next();
                Object obj = jSONObject2.get(str);
                if (jSONObject.has(str)) {
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject5;
                        JSONObject jSONObject6 = jSONObject.getJSONObject(str);
                        if (jSONObject3 == null || !jSONObject3.has(str)) {
                            jSONObject5 = null;
                        } else {
                            jSONObject5 = jSONObject3.getJSONObject(str);
                        }
                        String jSONObject7 = daw.m26155b(jSONObject6, (JSONObject) obj, jSONObject5, set).toString();
                        if (!jSONObject7.equals("{}")) {
                            jSONObject4.put(str, new JSONObject(jSONObject7));
                        }
                    } else if (obj instanceof JSONArray) {
                        daw.m26149a(str, (JSONArray) obj, jSONObject.getJSONArray(str), jSONObject4);
                    } else if (set == null || !set.contains(str)) {
                        Object obj2 = jSONObject.get(str);
                        if (!obj.equals(obj2)) {
                            if (!(obj2 instanceof Integer) || "".equals(obj)) {
                                jSONObject4.put(str, obj);
                            } else if (((Number) obj2).doubleValue() != ((Number) obj).doubleValue()) {
                                jSONObject4.put(str, obj);
                            }
                        }
                    } else {
                        jSONObject4.put(str, obj);
                    }
                } else if (obj instanceof JSONObject) {
                    jSONObject4.put(str, new JSONObject(obj.toString()));
                } else if (obj instanceof JSONArray) {
                    daw.m26149a(str, (JSONArray) obj, null, jSONObject4);
                } else {
                    jSONObject4.put(str, obj);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject4;
    }

    /* renamed from: a */
    private static void m26149a(String str, JSONArray jSONArray, JSONArray jSONArray2, JSONObject jSONObject) throws JSONException {
        int i = 0;
        if (str.endsWith("_a") || str.endsWith("_d")) {
            jSONObject.put(str, jSONArray);
            return;
        }
        String b = daw.m26154b(jSONArray);
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        String b2 = jSONArray2 == null ? null : daw.m26154b(jSONArray2);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            String str2 = (String) jSONArray.get(i2);
            if (jSONArray2 == null || !b2.contains(str2)) {
                jSONArray3.put(str2);
            }
        }
        if (jSONArray2 != null) {
            while (i < jSONArray2.length()) {
                CharSequence string = jSONArray2.getString(i);
                if (!b.contains(string)) {
                    jSONArray4.put(string);
                }
                i++;
            }
        }
        if (!jSONArray3.toString().equals("[]")) {
            jSONObject.put(str + "_a", jSONArray3);
        }
        if (!jSONArray4.toString().equals("[]")) {
            jSONObject.put(str + "_d", jSONArray4);
        }
    }

    /* renamed from: b */
    private static String m26154b(JSONArray jSONArray) {
        String str = "[";
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                str = str + "\"" + jSONArray.getString(i) + "\"";
                i++;
            } catch (Throwable th) {
            }
        }
        return str + "]";
    }

    /* renamed from: a */
    public static void m26145a() {
        for (Entry value : f20988a.entrySet()) {
            ((C4756a) value.getValue()).m26124b();
        }
        if (f20993f != null) {
            f20993f.m26139d();
        }
    }

    /* renamed from: a */
    public static void m26146a(Context context) {
        f20994g = context;
        if (f20992e == null) {
            daw daw = new daw();
            daw.getClass();
            f20992e = new C4757b("CURRENT_STATE", true);
            daw = new daw();
            daw.getClass();
            f20993f = new C4757b("TOSYNC_STATE", true);
        }
    }

    /* renamed from: b */
    static C4757b m26153b() {
        daw daw = new daw();
        daw.getClass();
        return new C4757b("nonPersist", false);
    }

    /* renamed from: a */
    public static void m26150a(boolean z) {
        boolean z2 = (f20989b || !f20990c || f20991d) ? false : true;
        final JSONObject a = f20992e.m26130a(f20993f, z2);
        final JSONObject b = daw.m26155b(f20992e.f20983a, f20993f.f20983a, null, null);
        if (a == null) {
            f20992e.m26137b(b, null);
            return;
        }
        String f = dat.f();
        f20993f.m26139d();
        if (f20989b || z) {
            dav.m26116c("players/" + f, a, new C4750a() {
                /* renamed from: a */
                void mo4302a(int i, String str, Throwable th) {
                    dat.a(dat$c.WARN, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                    if (daw.m26157b(i, str, "No user with this id found")) {
                        daw.m26162e();
                        daw.m26168k();
                        return;
                    }
                    daw.m26152b(Integer.valueOf(0)).m26125c();
                }

                /* renamed from: a */
                void mo4303a(String str) {
                    daw.f20992e.m26137b(b, a);
                }
            });
        } else if (f20990c) {
            if (f == null) {
                f = "players";
            } else {
                f = "players/" + f + "/on_session";
            }
            f20991d = true;
            dav.m26117d(f, a, new C4750a() {
                /* renamed from: a */
                void mo4302a(int i, String str, Throwable th) {
                    daw.f20991d = false;
                    dat.a(dat$c.WARN, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                    if (daw.m26157b(i, str, "not a valid device_type")) {
                        daw.m26162e();
                        daw.m26168k();
                        return;
                    }
                    daw.m26152b(Integer.valueOf(0)).m26125c();
                }

                /* renamed from: a */
                void mo4303a(String str) {
                    daw.f20989b = true;
                    daw.f20991d = false;
                    daw.f20992e.m26137b(b, a);
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("id")) {
                            String string = jSONObject.getString("id");
                            dat.a(string);
                            dat.d();
                            dat.a(dat$c.INFO, "Device registered, UserId = " + string);
                            return;
                        }
                        dat.a(dat$c.INFO, "session sent, UserId = " + dat.f());
                    } catch (Throwable th) {
                        dat.a(dat$c.ERROR, "ERROR parsing on_session or create JSON Response.", th);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static boolean m26157b(int i, String str, String str2) {
        if (i != 400 || str == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("errors") && jSONObject.optString("errors").contains(str2)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: b */
    private static C4756a m26152b(Integer num) {
        if (!f20988a.containsKey(num)) {
            f20988a.put(num, new C4756a(num.intValue()));
        }
        return (C4756a) f20988a.get(num);
    }

    /* renamed from: j */
    private static C4757b m26167j() {
        if (f20993f == null) {
            f20993f = f20992e.m26127a("TOSYNC_STATE");
        }
        daw.m26168k();
        return f20993f;
    }

    /* renamed from: k */
    private static void m26168k() {
        daw.m26152b(Integer.valueOf(0)).m26123a();
    }

    /* renamed from: a */
    static void m26147a(C4757b c4757b) {
        JSONObject jSONObject = daw.m26167j().f20984b;
        daw.m26155b(jSONObject, c4757b.f20984b, jSONObject, null);
        jSONObject = daw.m26167j().f20983a;
        daw.m26155b(jSONObject, c4757b.f20983a, jSONObject, null);
        f20990c = true;
    }

    /* renamed from: b */
    static void m26156b(boolean z) {
        try {
            daw.m26167j().f20983a.put("userSubscribePref", z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    static void m26148a(String str) {
        try {
            daw.m26167j().f20984b.put("identifier", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    static boolean m26158c() {
        return f20993f.m26134b() > 0;
    }

    /* renamed from: d */
    static String m26160d() {
        return f20993f.f20984b.optString("identifier", null);
    }

    /* renamed from: e */
    static void m26162e() {
        f20989b = false;
        dat.a(null);
        f20992e.f20984b = new JSONObject();
        f20992e.m26139d();
    }
}
