package com.p000;

import com.facebook.internal.ServerProtocol;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@bhd
/* renamed from: bib */
class bib {
    /* renamed from: a */
    private final List<String> f6379a;
    /* renamed from: b */
    private final List<String> f6380b;
    /* renamed from: c */
    private final String f6381c;
    /* renamed from: d */
    private final String f6382d;
    /* renamed from: e */
    private final String f6383e;
    /* renamed from: f */
    private final String f6384f;
    /* renamed from: g */
    private final boolean f6385g;
    /* renamed from: h */
    private final boolean f6386h;
    /* renamed from: i */
    private final String f6387i;
    /* renamed from: j */
    private final String f6388j;
    /* renamed from: k */
    private String f6389k;
    /* renamed from: l */
    private int f6390l;

    public bib(int i, Map<String, String> map) {
        this.f6389k = (String) map.get("url");
        this.f6382d = (String) map.get("base_uri");
        this.f6383e = (String) map.get("post_parameters");
        this.f6385g = bib.m8643b((String) map.get("drt_include"));
        this.f6386h = bib.m8643b((String) map.get("pan_include"));
        this.f6381c = (String) map.get("activation_overlay_url");
        this.f6380b = m8644c((String) map.get("check_packages"));
        this.f6387i = (String) map.get("request_id");
        this.f6384f = (String) map.get("type");
        this.f6379a = m8644c((String) map.get("errors"));
        this.f6390l = i;
        this.f6388j = (String) map.get("fetched_ad");
    }

    /* renamed from: b */
    private static boolean m8643b(String str) {
        return str != null && (str.equals("1") || str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE));
    }

    /* renamed from: c */
    private List<String> m8644c(String str) {
        return str == null ? null : Arrays.asList(str.split(","));
    }

    /* renamed from: a */
    public int m8645a() {
        return this.f6390l;
    }

    /* renamed from: a */
    public void m8646a(String str) {
        this.f6389k = str;
    }

    /* renamed from: b */
    public List<String> m8647b() {
        return this.f6379a;
    }

    /* renamed from: c */
    public String m8648c() {
        return this.f6382d;
    }

    /* renamed from: d */
    public String m8649d() {
        return this.f6383e;
    }

    /* renamed from: e */
    public String m8650e() {
        return this.f6389k;
    }

    /* renamed from: f */
    public String m8651f() {
        return this.f6384f;
    }

    /* renamed from: g */
    public boolean m8652g() {
        return this.f6385g;
    }

    /* renamed from: h */
    public String m8653h() {
        return this.f6387i;
    }

    /* renamed from: i */
    public String m8654i() {
        return this.f6388j;
    }
}
