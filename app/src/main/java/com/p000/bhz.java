package com.p000;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.internal.zzmk;
import com.google.android.gms.internal.zzmn;
import com.google.android.gms.internal.zzmp;
import com.google.android.gms.internal.zzoo;
import com.google.android.gms.internal.zzor;
import com.millennialmedia.internal.utils.EnvironmentUtils;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

@bhd
/* renamed from: bhz */
public final class bhz {
    /* renamed from: A */
    private zzmp f6342A;
    /* renamed from: B */
    private boolean f6343B = false;
    /* renamed from: C */
    private String f6344C;
    /* renamed from: D */
    private List<String> f6345D;
    /* renamed from: E */
    private boolean f6346E;
    /* renamed from: F */
    private String f6347F;
    /* renamed from: G */
    private zzor f6348G;
    /* renamed from: H */
    private boolean f6349H;
    /* renamed from: I */
    private final zzmk f6350I;
    /* renamed from: a */
    private String f6351a;
    /* renamed from: b */
    private String f6352b;
    /* renamed from: c */
    private String f6353c;
    /* renamed from: d */
    private List<String> f6354d;
    /* renamed from: e */
    private String f6355e;
    /* renamed from: f */
    private String f6356f;
    /* renamed from: g */
    private String f6357g;
    /* renamed from: h */
    private List<String> f6358h;
    /* renamed from: i */
    private long f6359i = -1;
    /* renamed from: j */
    private boolean f6360j = false;
    /* renamed from: k */
    private final long f6361k = -1;
    /* renamed from: l */
    private List<String> f6362l;
    /* renamed from: m */
    private long f6363m = -1;
    /* renamed from: n */
    private int f6364n = -1;
    /* renamed from: o */
    private boolean f6365o = false;
    /* renamed from: p */
    private boolean f6366p = false;
    /* renamed from: q */
    private boolean f6367q = false;
    /* renamed from: r */
    private boolean f6368r = true;
    /* renamed from: s */
    private boolean f6369s = true;
    /* renamed from: t */
    private String f6370t = "";
    /* renamed from: u */
    private boolean f6371u = false;
    /* renamed from: v */
    private boolean f6372v = false;
    /* renamed from: w */
    private zzoo f6373w;
    /* renamed from: x */
    private List<String> f6374x;
    /* renamed from: y */
    private List<String> f6375y;
    /* renamed from: z */
    private boolean f6376z = false;

    public bhz(zzmk zzmk, String str) {
        this.f6352b = str;
        this.f6350I = zzmk;
    }

    /* renamed from: A */
    private void m8592A(Map<String, List<String>> map) {
        this.f6343B |= m8604d(map, "X-Afma-Auto-Collect-Location");
    }

    /* renamed from: B */
    private void m8593B(Map<String, List<String>> map) {
        List c = bhz.m8601c(map, "X-Afma-Remote-Ping-Urls");
        if (c != null) {
            this.f6345D = c;
        }
    }

    /* renamed from: C */
    private void m8594C(Map<String, List<String>> map) {
        Object a = bhz.m8598a(map, "X-Afma-Auto-Protection-Configuration");
        if (a == null || TextUtils.isEmpty(a)) {
            Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204").buildUpon();
            buildUpon.appendQueryParameter("id", "gmob-apps-blocked-navigation");
            if (!TextUtils.isEmpty(this.f6356f)) {
                buildUpon.appendQueryParameter("debugDialog", this.f6356f);
            }
            boolean booleanValue = ((Boolean) bbb.f5404j.m7064c()).booleanValue();
            String[] strArr = new String[1];
            String valueOf = String.valueOf(buildUpon.toString());
            String valueOf2 = String.valueOf("navigationURL");
            strArr[0] = new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append(valueOf).append("&").append(valueOf2).append("={NAVIGATION_URL}").toString();
            this.f6342A = new zzmp(booleanValue, Arrays.asList(strArr));
            return;
        }
        try {
            this.f6342A = zzmp.m19675a(new JSONObject(a));
        } catch (Throwable e) {
            bky.m9009c("Error parsing configuration JSON", e);
            this.f6342A = new zzmp();
        }
    }

    /* renamed from: D */
    private void m8595D(Map<String, List<String>> map) {
        this.f6344C = bhz.m8598a(map, "Set-Cookie");
    }

    /* renamed from: E */
    private void m8596E(Map<String, List<String>> map) {
        Object a = bhz.m8598a(map, "X-Afma-Safe-Browsing");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f6348G = zzor.m19683a(new JSONObject(a));
            } catch (Throwable e) {
                bky.m9009c("Error parsing safe browsing header", e);
            }
        }
    }

    /* renamed from: F */
    private void m8597F(Map<String, List<String>> map) {
        Object a = bhz.m8598a(map, "X-Afma-Pool");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f6349H = new JSONObject(a).getBoolean("never_pool");
            } catch (Throwable e) {
                bky.m9009c("Error parsing interstitial pool header", e);
            }
        }
    }

    /* renamed from: a */
    static String m8598a(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    /* renamed from: b */
    static long m8599b(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            try {
                return (long) (Float.parseFloat(str2) * 1000.0f);
            } catch (NumberFormatException e) {
                bky.m9011e(new StringBuilder((String.valueOf(str).length() + 36) + String.valueOf(str2).length()).append("Could not parse float from ").append(str).append(" header: ").append(str2).toString());
            }
        }
        return -1;
    }

    /* renamed from: b */
    private void m8600b(Map<String, List<String>> map) {
        this.f6351a = bhz.m8598a(map, "X-Afma-Ad-Size");
    }

    /* renamed from: c */
    static List<String> m8601c(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        if (!(list == null || list.isEmpty())) {
            String str2 = (String) list.get(0);
            if (str2 != null) {
                return Arrays.asList(str2.trim().split("\\s+"));
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m8602c(Map<String, List<String>> map) {
        this.f6347F = bhz.m8598a(map, "X-Afma-Ad-Slot-Size");
    }

    /* renamed from: d */
    private void m8603d(Map<String, List<String>> map) {
        List c = bhz.m8601c(map, "X-Afma-Click-Tracking-Urls");
        if (c != null) {
            this.f6354d = c;
        }
    }

    /* renamed from: d */
    private boolean m8604d(Map<String, List<String>> map, String str) {
        List list = (List) map.get(str);
        return (list == null || list.isEmpty() || !Boolean.valueOf((String) list.get(0)).booleanValue()) ? false : true;
    }

    /* renamed from: e */
    private void m8605e(Map<String, List<String>> map) {
        this.f6355e = bhz.m8598a(map, "X-Afma-Debug-Signals");
    }

    /* renamed from: f */
    private void m8606f(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Debug-Dialog");
        if (list != null && !list.isEmpty()) {
            this.f6356f = (String) list.get(0);
        }
    }

    /* renamed from: g */
    private void m8607g(Map<String, List<String>> map) {
        List c = bhz.m8601c(map, "X-Afma-Tracking-Urls");
        if (c != null) {
            this.f6358h = c;
        }
    }

    /* renamed from: h */
    private void m8608h(Map<String, List<String>> map) {
        long b = bhz.m8599b(map, "X-Afma-Interstitial-Timeout");
        if (b != -1) {
            this.f6359i = b;
        }
    }

    /* renamed from: i */
    private void m8609i(Map<String, List<String>> map) {
        this.f6357g = bhz.m8598a(map, "X-Afma-ActiveView");
    }

    /* renamed from: j */
    private void m8610j(Map<String, List<String>> map) {
        this.f6366p = "native".equals(bhz.m8598a(map, "X-Afma-Ad-Format"));
    }

    /* renamed from: k */
    private void m8611k(Map<String, List<String>> map) {
        this.f6365o |= m8604d(map, "X-Afma-Custom-Rendering-Allowed");
    }

    /* renamed from: l */
    private void m8612l(Map<String, List<String>> map) {
        this.f6360j |= m8604d(map, "X-Afma-Mediation");
    }

    /* renamed from: m */
    private void m8613m(Map<String, List<String>> map) {
        this.f6346E |= m8604d(map, "X-Afma-Render-In-Browser");
    }

    /* renamed from: n */
    private void m8614n(Map<String, List<String>> map) {
        List c = bhz.m8601c(map, "X-Afma-Manual-Tracking-Urls");
        if (c != null) {
            this.f6362l = c;
        }
    }

    /* renamed from: o */
    private void m8615o(Map<String, List<String>> map) {
        long b = bhz.m8599b(map, "X-Afma-Refresh-Rate");
        if (b != -1) {
            this.f6363m = b;
        }
    }

    /* renamed from: p */
    private void m8616p(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Orientation");
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            if (EnvironmentUtils.ORIENTATION_PORTRAIT.equalsIgnoreCase(str)) {
                this.f6364n = ako.m2345g().mo1263b();
            } else if (EnvironmentUtils.ORIENTATION_LANDSCAPE.equalsIgnoreCase(str)) {
                this.f6364n = ako.m2345g().mo1261a();
            }
        }
    }

    /* renamed from: q */
    private void m8617q(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Use-HTTPS");
        if (list != null && !list.isEmpty()) {
            this.f6367q = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: r */
    private void m8618r(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Url-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.f6368r = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: s */
    private void m8619s(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Content-Vertical-Opted-Out");
        if (list != null && !list.isEmpty()) {
            this.f6369s = Boolean.valueOf((String) list.get(0)).booleanValue();
        }
    }

    /* renamed from: t */
    private void m8620t(Map<String, List<String>> map) {
        List list = (List) map.get("X-Afma-Gws-Query-Id");
        if (list != null && !list.isEmpty()) {
            this.f6370t = (String) list.get(0);
        }
    }

    /* renamed from: u */
    private void m8621u(Map<String, List<String>> map) {
        String a = bhz.m8598a(map, "X-Afma-Fluid");
        if (a != null && a.equals("height")) {
            this.f6371u = true;
        }
    }

    /* renamed from: v */
    private void m8622v(Map<String, List<String>> map) {
        this.f6372v = "native_express".equals(bhz.m8598a(map, "X-Afma-Ad-Format"));
    }

    /* renamed from: w */
    private void m8623w(Map<String, List<String>> map) {
        this.f6373w = zzoo.m19680a(bhz.m8598a(map, "X-Afma-Rewards"));
    }

    /* renamed from: x */
    private void m8624x(Map<String, List<String>> map) {
        if (this.f6374x == null) {
            this.f6374x = bhz.m8601c(map, "X-Afma-Reward-Video-Start-Urls");
        }
    }

    /* renamed from: y */
    private void m8625y(Map<String, List<String>> map) {
        if (this.f6375y == null) {
            this.f6375y = bhz.m8601c(map, "X-Afma-Reward-Video-Complete-Urls");
        }
    }

    /* renamed from: z */
    private void m8626z(Map<String, List<String>> map) {
        this.f6376z |= m8604d(map, "X-Afma-Use-Displayed-Impression");
    }

    /* renamed from: a */
    public zzmn m8627a(long j) {
        return new zzmn(this.f6350I, this.f6352b, this.f6353c, this.f6354d, this.f6358h, this.f6359i, this.f6360j, -1, this.f6362l, this.f6363m, this.f6364n, this.f6351a, j, this.f6356f, this.f6357g, this.f6365o, this.f6366p, this.f6367q, this.f6368r, false, this.f6370t, this.f6371u, this.f6372v, this.f6373w, this.f6374x, this.f6375y, this.f6376z, this.f6342A, this.f6343B, this.f6344C, this.f6345D, this.f6346E, this.f6347F, this.f6348G, this.f6355e, this.f6369s, this.f6349H);
    }

    /* renamed from: a */
    public void m8628a(String str, Map<String, List<String>> map, String str2) {
        this.f6353c = str2;
        m8629a((Map) map);
    }

    /* renamed from: a */
    public void m8629a(Map<String, List<String>> map) {
        m8600b(map);
        m8602c(map);
        m8603d(map);
        m8605e(map);
        m8606f(map);
        m8607g(map);
        m8608h(map);
        m8612l(map);
        m8614n(map);
        m8615o(map);
        m8616p(map);
        m8609i(map);
        m8617q(map);
        m8611k(map);
        m8610j(map);
        m8618r(map);
        m8619s(map);
        m8620t(map);
        m8621u(map);
        m8622v(map);
        m8623w(map);
        m8624x(map);
        m8625y(map);
        m8626z(map);
        m8592A(map);
        m8595D(map);
        m8594C(map);
        m8593B(map);
        m8596E(map);
        m8613m(map);
        m8597F(map);
    }
}
