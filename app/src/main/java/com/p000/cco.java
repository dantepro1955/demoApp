package com.p000;

import com.facebook.appevents.AppEventsConstants;

/* compiled from: GagPostListInfo */
/* renamed from: cco */
public class cco {
    /* renamed from: a */
    public String f8729a;
    /* renamed from: b */
    public String f8730b;
    /* renamed from: c */
    public int f8731c;
    /* renamed from: d */
    public String f8732d;
    /* renamed from: e */
    public String f8733e;
    /* renamed from: f */
    public String f8734f;
    /* renamed from: g */
    public String f8735g;

    /* compiled from: GagPostListInfo */
    /* renamed from: cco$a */
    static class C1673a {
        /* renamed from: a */
        String f8723a;
        /* renamed from: b */
        String f8724b;
        /* renamed from: c */
        String f8725c;
        /* renamed from: d */
        String f8726d;
        /* renamed from: e */
        String f8727e;
        /* renamed from: f */
        int f8728f;

        C1673a() {
        }

        /* renamed from: a */
        public static C1673a m12546a() {
            return new C1673a();
        }

        /* renamed from: a */
        public C1673a m12548a(String str) {
            this.f8725c = str;
            return this;
        }

        /* renamed from: a */
        public C1673a m12547a(int i) {
            this.f8728f = i;
            return this;
        }

        /* renamed from: b */
        public C1673a m12549b(String str) {
            this.f8723a = str;
            return this;
        }

        /* renamed from: c */
        public C1673a m12551c(String str) {
            this.f8724b = str;
            return this;
        }

        /* renamed from: d */
        public C1673a m12552d(String str) {
            this.f8726d = str;
            return this;
        }

        /* renamed from: e */
        public C1673a m12553e(String str) {
            this.f8727e = str;
            return this;
        }

        /* renamed from: b */
        public cco m12550b() {
            cco cco = new cco();
            cco.f8732d = this.f8723a;
            cco.f8733e = this.f8724b;
            cco.f8731c = this.f8728f;
            cco.f8730b = this.f8725c;
            cco.f8734f = this.f8726d;
            cco.f8735g = this.f8727e;
            cco.m12562a();
            return cco;
        }
    }

    private cco() {
    }

    @Deprecated
    public cco(String str, int i, String str2) {
        this.f8730b = str;
        this.f8731c = i;
        this.f8732d = str2;
        m12562a();
    }

    @Deprecated
    public cco(String str, int i, String str2, String str3) {
        this.f8730b = str;
        this.f8731c = i;
        this.f8732d = str2;
        this.f8733e = str3;
        m12562a();
    }

    @Deprecated
    public cco(String str, String str2) {
        this.f8730b = str;
        this.f8734f = str2;
        this.f8731c = 12;
        this.f8732d = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        m12562a();
    }

    /* renamed from: a */
    public static cco m12555a(String str, int i, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(i).m12549b(str2).m12550b();
    }

    /* renamed from: b */
    public static cco m12558b(String str, int i, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(i).m12551c(str2).m12549b(AppEventsConstants.EVENT_PARAM_VALUE_NO).m12550b();
    }

    /* renamed from: a */
    public static cco m12556a(String str, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(12).m12552d(str2).m12550b();
    }

    /* renamed from: b */
    public static cco m12559b(String str, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(16).m12552d(str2).m12550b();
    }

    /* renamed from: c */
    public static cco m12560c(String str, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(13).m12553e(str2).m12550b();
    }

    /* renamed from: d */
    public static cco m12561d(String str, String str2) {
        return C1673a.m12546a().m12548a(str).m12547a(14).m12549b(str2).m12550b();
    }

    /* renamed from: a */
    public static cco m12554a(String str) {
        return cco.m12558b(str, 6, "30103763");
    }

    /* renamed from: a */
    protected void m12562a() {
        if (this.f8732d == null || this.f8732d.isEmpty()) {
            this.f8732d = AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        this.f8729a = "post-list-" + this.f8731c + "-" + this.f8732d;
        if (this.f8733e != null && !this.f8733e.isEmpty()) {
            this.f8729a += "-userId-" + this.f8733e;
        }
    }

    /* renamed from: b */
    public String m12563b() {
        return this.f8729a;
    }

    /* renamed from: a */
    public static String m12557a(int i, String str) {
        return "post-list-" + i + "-" + str;
    }

    /* renamed from: c */
    public String m12564c() {
        return this.f8732d + "-" + cqa.a(this.f8731c);
    }

    public int hashCode() {
        return this.f8729a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof cco) && hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }
}
