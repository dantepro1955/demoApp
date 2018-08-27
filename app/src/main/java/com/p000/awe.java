package com.p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import p000.att.C0806a;

/* renamed from: awe */
public class awe {

    /* renamed from: awe$a */
    public static class C0858a {
        /* renamed from: a */
        private final Map<String, C0806a> f4755a;
        /* renamed from: b */
        private final C0806a f4756b;

        /* renamed from: a */
        public Map<String, C0806a> m6127a() {
            return Collections.unmodifiableMap(this.f4755a);
        }

        /* renamed from: a */
        public void m6128a(String str, C0806a c0806a) {
            this.f4755a.put(str, c0806a);
        }

        /* renamed from: b */
        public C0806a m6129b() {
            return this.f4756b;
        }

        public String toString() {
            String valueOf = String.valueOf(m6127a());
            String valueOf2 = String.valueOf(this.f4756b);
            return new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(valueOf2).length()).append("Properties: ").append(valueOf).append(" pushAfterEvaluate: ").append(valueOf2).toString();
        }
    }

    /* renamed from: awe$b */
    public static class C0859b {
        /* renamed from: a */
        private final List<C0858a> f4757a;
        /* renamed from: b */
        private final List<C0858a> f4758b;
        /* renamed from: c */
        private final List<C0858a> f4759c;
        /* renamed from: d */
        private final List<C0858a> f4760d;
        /* renamed from: e */
        private final List<C0858a> f4761e;
        /* renamed from: f */
        private final List<C0858a> f4762f;

        /* renamed from: a */
        public List<C0858a> m6130a() {
            return this.f4757a;
        }

        /* renamed from: b */
        public List<C0858a> m6131b() {
            return this.f4758b;
        }

        /* renamed from: c */
        public List<C0858a> m6132c() {
            return this.f4759c;
        }

        /* renamed from: d */
        public List<C0858a> m6133d() {
            return this.f4760d;
        }

        /* renamed from: e */
        public List<C0858a> m6134e() {
            return this.f4761e;
        }

        /* renamed from: f */
        public List<C0858a> m6135f() {
            return this.f4762f;
        }

        public String toString() {
            String valueOf = String.valueOf(m6130a());
            String valueOf2 = String.valueOf(m6131b());
            String valueOf3 = String.valueOf(m6132c());
            String valueOf4 = String.valueOf(m6133d());
            String valueOf5 = String.valueOf(m6134e());
            String valueOf6 = String.valueOf(m6135f());
            return new StringBuilder((((((String.valueOf(valueOf).length() + 102) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()).append("Positive predicates: ").append(valueOf).append("  Negative predicates: ").append(valueOf2).append("  Add tags: ").append(valueOf3).append("  Remove tags: ").append(valueOf4).append("  Add macros: ").append(valueOf5).append("  Remove macros: ").append(valueOf6).toString();
        }
    }

    /* renamed from: a */
    public static C0806a m6136a(C0806a c0806a) {
        C0806a c0806a2 = new C0806a();
        c0806a2.f4498a = c0806a.f4498a;
        c0806a2.f4508k = (int[]) c0806a.f4508k.clone();
        if (c0806a.f4509l) {
            c0806a2.f4509l = c0806a.f4509l;
        }
        return c0806a2;
    }
}
