package com.p000;

import android.text.Layout;
import android.util.LruCache;

/* compiled from: TextViewCacheProvider */
/* renamed from: dke */
public class dke {
    /* renamed from: a */
    private static LruCache<String, C4947a> f21840a;
    /* renamed from: b */
    private int f21841b;

    /* compiled from: TextViewCacheProvider */
    /* renamed from: dke$a */
    public static class C4947a {
        /* renamed from: a */
        public String f21836a;
        /* renamed from: b */
        public String f21837b;
        /* renamed from: c */
        public boolean f21838c = false;
        /* renamed from: d */
        public Layout f21839d;

        public C4947a(String str, String str2, boolean z, Layout layout) {
            this.f21836a = str;
            this.f21837b = str2;
            this.f21838c = z;
            this.f21839d = layout;
        }
    }

    /* renamed from: a */
    private LruCache<String, C4947a> m27688a() {
        if (f21840a == null) {
            f21840a = new LruCache(this.f21841b);
        }
        return f21840a;
    }

    /* renamed from: a */
    public void m27690a(String str, C4947a c4947a) {
        m27688a().put(str, c4947a);
    }

    /* renamed from: a */
    public C4947a m27689a(String str) {
        return (C4947a) m27688a().get(str);
    }
}
