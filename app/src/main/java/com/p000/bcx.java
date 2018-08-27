package com.p000;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.facebook.internal.NativeProtocol;
import com.mopub.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.ako;
import p000.avc;
import p000.bbb;
import p000.bky;
import p000.blo;

@bhd
/* renamed from: bcx */
public final class bcx {
    /* renamed from: a */
    public static final bcy f5593a = new C10321();
    /* renamed from: b */
    public static final bcy f5594b = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get(Constants.VIDEO_TRACKING_URLS_KEY);
            if (TextUtils.isEmpty(str)) {
                bky.m9011e("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            Map hashMap = new HashMap();
            PackageManager packageManager = blo.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                hashMap.put(str2, Boolean.valueOf(packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != null));
            }
            blo.mo1303a("openableURLs", hashMap);
        }
    };
    /* renamed from: c */
    public static final bcy f5595c = new C10332();
    /* renamed from: d */
    public static final bcy f5596d = new C10343();
    /* renamed from: e */
    public static final bcy f5597e = new C10354();
    /* renamed from: f */
    public static final bcy f5598f = new C10365();
    /* renamed from: g */
    public static final bcy f5599g = new C10376();
    /* renamed from: h */
    public static final bcy f5600h = new C10387();
    /* renamed from: i */
    public static final bcy f5601i = new C10398();
    /* renamed from: j */
    public static final bcy f5602j = new C10409();
    /* renamed from: k */
    public static final bcy f5603k = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get("ty");
            String str2 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt((String) map.get("tx"));
                int parseInt2 = Integer.parseInt(str);
                int parseInt3 = Integer.parseInt(str2);
                avc n = blo.mo1327n();
                if (n != null) {
                    n.m5929a().mo292a(parseInt, parseInt2, parseInt3);
                }
            } catch (NumberFormatException e) {
                bky.m9011e("Could not parse touch parameters from gmsg.");
            }
        }
    };
    /* renamed from: l */
    public static final bcy f5604l = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (((Boolean) bbb.bx.m7064c()).booleanValue()) {
                blo.mo1311c(!Boolean.parseBoolean((String) map.get("disabled")));
            }
        }
    };
    /* renamed from: m */
    public static final bcy f5605m = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get(NativeProtocol.WEB_DIALOG_ACTION);
            if ("pause".equals(str)) {
                blo.mo262H();
            } else if ("resume".equals(str)) {
                blo.mo263I();
            }
        }
    };
    /* renamed from: n */
    public static final bcy f5606n = new bdj();
    /* renamed from: o */
    public static final bcy f5607o = new bdk();
    /* renamed from: p */
    public static final bcy f5608p = new bde();
    /* renamed from: q */
    public static final bcy f5609q = new bdo();
    /* renamed from: r */
    public static final bcy f5610r = new bcw();
    /* renamed from: s */
    public static final bdh f5611s = new bdh();
    /* renamed from: t */
    public static final bcy f5612t = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                blo.mo1322l().m9432i();
            } else if (map.keySet().contains("stop")) {
                blo.mo1322l().m9433j();
            } else if (map.keySet().contains("cancel")) {
                blo.mo1322l().m9434k();
            }
        }
    };
    /* renamed from: u */
    public static final bcy f5613u = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if (map.keySet().contains("start")) {
                blo.mo1313d(true);
            }
            if (map.keySet().contains("stop")) {
                blo.mo1313d(false);
            }
        }
    };
    /* renamed from: v */
    public static final bcy f5614v = new bcy() {
        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            blo.mo1303a("locationReady", ako.m2343e().m9093a((View) blo, (WindowManager) blo.getContext().getSystemService("window")));
            bky.m9011e("GET LOCATION COMPILED");
        }
    };

    /* renamed from: bcx$1 */
    class C10321 implements bcy {
        C10321() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
        }
    }

    /* renamed from: bcx$2 */
    class C10332 implements bcy {
        C10332() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            PackageManager packageManager = blo.getContext().getPackageManager();
            try {
                try {
                    JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                    JSONObject jSONObject = new JSONObject();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                            String optString = jSONObject2.optString("id");
                            Object optString2 = jSONObject2.optString("u");
                            Object optString3 = jSONObject2.optString("i");
                            Object optString4 = jSONObject2.optString("m");
                            Object optString5 = jSONObject2.optString("p");
                            Object optString6 = jSONObject2.optString("c");
                            jSONObject2.optString("f");
                            jSONObject2.optString("e");
                            Intent intent = new Intent();
                            if (!TextUtils.isEmpty(optString2)) {
                                intent.setData(Uri.parse(optString2));
                            }
                            if (!TextUtils.isEmpty(optString3)) {
                                intent.setAction(optString3);
                            }
                            if (!TextUtils.isEmpty(optString4)) {
                                intent.setType(optString4);
                            }
                            if (!TextUtils.isEmpty(optString5)) {
                                intent.setPackage(optString5);
                            }
                            if (!TextUtils.isEmpty(optString6)) {
                                String[] split = optString6.split(com.under9.android.lib.network.model.Constants.SEP, 2);
                                if (split.length == 2) {
                                    intent.setComponent(new ComponentName(split[0], split[1]));
                                }
                            }
                            try {
                                jSONObject.put(optString, packageManager.resolveActivity(intent, NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST) != null);
                            } catch (Throwable e) {
                                bky.m9007b("Error constructing openable urls response.", e);
                            }
                        } catch (Throwable e2) {
                            bky.m9007b("Error parsing the intent data.", e2);
                        }
                    }
                    blo.mo1029b("openableIntents", jSONObject);
                } catch (JSONException e3) {
                    blo.mo1029b("openableIntents", new JSONObject());
                }
            } catch (JSONException e4) {
                blo.mo1029b("openableIntents", new JSONObject());
            }
        }
    }

    /* renamed from: bcx$3 */
    class C10343 implements bcy {
        C10343() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                bky.m9011e("URL missing from click GMSG.");
                return;
            }
            Uri a;
            String d;
            Uri parse = Uri.parse(str);
            try {
                avc n = blo.mo1327n();
                if (n != null && n.m5936c(parse)) {
                    a = n.m5928a(parse, blo.getContext(), blo.mo1305b());
                    if (ako.m2336D().m8890e() && TextUtils.isEmpty(a.getQueryParameter("fbs_aeid"))) {
                        d = ako.m2336D().m8886d(blo.getContext());
                        a = ako.m2343e().m9079a(a, "fbs_aeid", d);
                        ako.m2336D().m8884c(blo.getContext(), d);
                    }
                    new bkq(blo.getContext(), blo.mo1328o().f15121a, a.toString()).mo195d();
                }
            } catch (avd e) {
                String str2 = "Unable to append parameter to URL: ";
                str = String.valueOf(str);
                bky.m9011e(str.length() != 0 ? str2.concat(str) : new String(str2));
            }
            a = parse;
            d = ako.m2336D().m8886d(blo.getContext());
            a = ako.m2343e().m9079a(a, "fbs_aeid", d);
            ako.m2336D().m8884c(blo.getContext(), d);
            new bkq(blo.getContext(), blo.mo1328o().f15121a, a.toString()).mo195d();
        }
    }

    /* renamed from: bcx$4 */
    class C10354 implements bcy {
        C10354() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            aio i = blo.mo1319i();
            if (i != null) {
                i.m1748a();
                return;
            }
            i = blo.mo1320j();
            if (i != null) {
                i.m1748a();
            } else {
                bky.m9011e("A GMSG tried to close something that wasn't an overlay.");
            }
        }
    }

    /* renamed from: bcx$5 */
    class C10365 implements bcy {
        C10365() {
        }

        /* renamed from: a */
        private void m7527a(blo blo) {
            bky.m9010d("Received support message, responding.");
            ajx h = blo.mo1318h();
            if (!(h == null || h.f1754c == null)) {
                blo.getContext();
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event", "checkSupport");
                jSONObject.put("supports", false);
                blo.mo1029b("appStreaming", jSONObject);
            } catch (Throwable th) {
                ako.m2347i().m8934a(th, "DefaultGmsgHandlers.processCheckSupportsMessage");
            }
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            if ("checkSupport".equals(map.get(NativeProtocol.WEB_DIALOG_ACTION))) {
                m7527a(blo);
                return;
            }
            aio i = blo.mo1319i();
            if (i != null) {
                i.m1754a(blo, (Map) map);
            }
        }
    }

    /* renamed from: bcx$6 */
    class C10376 implements bcy {
        C10376() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            blo.mo1309b("1".equals(map.get("custom_close")));
        }
    }

    /* renamed from: bcx$7 */
    class C10387 implements bcy {
        C10387() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = (String) map.get("u");
            if (str == null) {
                bky.m9011e("URL missing from httpTrack GMSG.");
            } else {
                new bkq(blo.getContext(), blo.mo1328o().f15121a, str).mo195d();
            }
        }
    }

    /* renamed from: bcx$8 */
    class C10398 implements bcy {
        C10398() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            String str = "Received log message: ";
            String valueOf = String.valueOf((String) map.get("string"));
            bky.m9010d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: bcx$9 */
    class C10409 implements bcy {
        C10409() {
        }

        /* renamed from: a */
        public void mo277a(blo blo, Map<String, String> map) {
            bbv E = blo.mo1292E();
            if (E != null) {
                E.mo950a();
            }
        }
    }
}
