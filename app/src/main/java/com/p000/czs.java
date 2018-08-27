package com.p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: czs */
public abstract class czs {
    /* renamed from: a */
    private final int f20830a;

    /* renamed from: czs$a */
    public static final class C4707a extends czs {
        /* renamed from: a */
        private final byte[] f20831a;

        /* renamed from: b */
        public final byte[] m25862b() {
            return this.f20831a;
        }
    }

    /* renamed from: czs$c */
    public static abstract class C4708c extends czs {
        /* renamed from: a */
        private final Map<String, czs> f20832a = new HashMap();

        C4708c(Map<String, czs> map, int i) {
            super(i);
            if (map != null) {
                this.f20832a.putAll(map);
            }
        }

        /* renamed from: a */
        private boolean m25863a(String str, Object obj) {
            if (str != null && obj != null) {
                return true;
            }
            czl.m25830b(this, "ignore this put action since either the key or the value is null: key[" + str + "] value[" + obj + "]");
            return false;
        }

        /* renamed from: a */
        public void m25864a(String str, int i) {
            if (m25863a(str, new C4710d(i))) {
                this.f20832a.put(str, new C4710d(i));
            }
        }

        /* renamed from: a */
        public void m25865a(String str, czs czs) {
            if (m25863a(str, (Object) czs)) {
                this.f20832a.put(str, czs);
            }
        }

        /* renamed from: a */
        public void m25866a(String str, String str2) {
            if (m25863a(str, (Object) str2)) {
                this.f20832a.put(str, new C4712f(str2));
            }
        }

        /* renamed from: b */
        public Set<Entry<String, czs>> m25867b() {
            return this.f20832a.entrySet();
        }
    }

    /* renamed from: czs$b */
    public static class C4709b extends C4708c {
        public C4709b() {
            this(null);
        }

        public C4709b(Map<String, czs> map) {
            super(map, 2);
        }
    }

    /* renamed from: czs$d */
    public static final class C4710d extends czs {
        /* renamed from: a */
        private final int f20833a;

        public C4710d(int i) {
            super(1);
            this.f20833a = i;
        }

        /* renamed from: b */
        public final int m25868b() {
            return this.f20833a;
        }
    }

    /* renamed from: czs$e */
    public static final class C4711e extends czs {
        /* renamed from: a */
        private final List<czs> f20834a;

        public C4711e() {
            this(null);
        }

        public C4711e(List<czs> list) {
            super(3);
            this.f20834a = new ArrayList();
            if (list != null) {
                this.f20834a.addAll(list);
            }
        }

        /* renamed from: a */
        private boolean m25869a(Object obj) {
            if (obj != null) {
                return true;
            }
            czl.m25830b(this, "ignore this add action since the value is null: value[" + obj + "]");
            return false;
        }

        /* renamed from: a */
        public final void m25870a(czs czs) {
            if (m25869a((Object) czs)) {
                this.f20834a.add(czs);
            }
        }

        /* renamed from: a */
        public final void m25871a(String str) {
            if (m25869a((Object) str)) {
                this.f20834a.add(new C4712f(str));
            }
        }

        /* renamed from: b */
        public final List<czs> m25872b() {
            return this.f20834a;
        }

        /* renamed from: c */
        public final int m25873c() {
            return this.f20834a.size();
        }
    }

    /* renamed from: czs$f */
    public static final class C4712f extends czs {
        /* renamed from: a */
        private final String f20835a;

        public C4712f(String str) {
            super(0);
            this.f20835a = str;
        }

        /* renamed from: b */
        public final String m25874b() {
            return this.f20835a;
        }
    }

    czs(int i) {
        this.f20830a = i;
    }

    /* renamed from: a */
    public final int m25861a() {
        return this.f20830a;
    }
}
