package com.p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* compiled from: AppLink */
/* renamed from: ro */
public class ro {
    /* renamed from: a */
    private Uri f25347a;
    /* renamed from: b */
    private List<C5724a> f25348b;
    /* renamed from: c */
    private Uri f25349c;

    /* compiled from: AppLink */
    /* renamed from: ro$a */
    public static class C5724a {
        /* renamed from: a */
        private final Uri f25343a;
        /* renamed from: b */
        private final String f25344b;
        /* renamed from: c */
        private final String f25345c;
        /* renamed from: d */
        private final String f25346d;

        public C5724a(String str, String str2, Uri uri, String str3) {
            this.f25344b = str;
            this.f25345c = str2;
            this.f25343a = uri;
            this.f25346d = str3;
        }
    }

    public ro(Uri uri, List<C5724a> list, Uri uri2) {
        this.f25347a = uri;
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f25348b = list;
        this.f25349c = uri2;
    }
}
