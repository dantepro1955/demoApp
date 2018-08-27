package com.p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p000.att.C0806a;
import p000.awe.C0858a;
import p000.awe.C0859b;

/* renamed from: brt */
class brt {
    /* renamed from: a */
    private static final brm<C0806a> f7462a = new brm(brz.m10584a(), true);
    /* renamed from: b */
    private final bqw f7463b;
    /* renamed from: c */
    private final Map<String, bqx> f7464c;
    /* renamed from: d */
    private final Map<String, bqx> f7465d;
    /* renamed from: e */
    private final Map<String, bqx> f7466e;
    /* renamed from: f */
    private final bsc<C0858a, brm<C0806a>> f7467f;
    /* renamed from: g */
    private final bsc<String, C1431b> f7468g;
    /* renamed from: h */
    private final Set<C0859b> f7469h;
    /* renamed from: i */
    private final bqs f7470i;
    /* renamed from: j */
    private final Map<String, C1432c> f7471j;
    /* renamed from: k */
    private volatile String f7472k;
    /* renamed from: l */
    private int f7473l;

    /* renamed from: brt$a */
    interface C1428a {
        /* renamed from: a */
        void mo1422a(C0859b c0859b, Set<C0858a> set, Set<C0858a> set2, brr brr);
    }

    /* renamed from: brt$2 */
    class C14302 implements C1428a {
        C14302(brt brt) {
        }

        /* renamed from: a */
        public void mo1422a(C0859b c0859b, Set<C0858a> set, Set<C0858a> set2, brr brr) {
            set.addAll(c0859b.m6132c());
            set2.addAll(c0859b.m6133d());
            brr.mo1414e();
            brr.mo1415f();
        }
    }

    /* renamed from: brt$b */
    static class C1431b {
        /* renamed from: a */
        private brm<C0806a> f7454a;
        /* renamed from: b */
        private C0806a f7455b;

        public C1431b(brm<C0806a> brm, C0806a c0806a) {
            this.f7454a = brm;
            this.f7455b = c0806a;
        }

        /* renamed from: a */
        public brm<C0806a> m10550a() {
            return this.f7454a;
        }

        /* renamed from: b */
        public C0806a m10551b() {
            return this.f7455b;
        }
    }

    /* renamed from: brt$c */
    static class C1432c {
        /* renamed from: a */
        private final Set<C0859b> f7456a = new HashSet();
        /* renamed from: b */
        private final Map<C0859b, List<C0858a>> f7457b = new HashMap();
        /* renamed from: c */
        private final Map<C0859b, List<C0858a>> f7458c = new HashMap();
        /* renamed from: d */
        private final Map<C0859b, List<String>> f7459d = new HashMap();
        /* renamed from: e */
        private final Map<C0859b, List<String>> f7460e = new HashMap();
        /* renamed from: f */
        private C0858a f7461f;

        /* renamed from: a */
        public Set<C0859b> m10552a() {
            return this.f7456a;
        }

        /* renamed from: b */
        public Map<C0859b, List<C0858a>> m10553b() {
            return this.f7457b;
        }

        /* renamed from: c */
        public Map<C0859b, List<String>> m10554c() {
            return this.f7459d;
        }

        /* renamed from: d */
        public Map<C0859b, List<String>> m10555d() {
            return this.f7460e;
        }

        /* renamed from: e */
        public Map<C0859b, List<C0858a>> m10556e() {
            return this.f7458c;
        }

        /* renamed from: f */
        public C0858a m10557f() {
            return this.f7461f;
        }
    }

    /* renamed from: a */
    private brm<C0806a> m10558a(C0806a c0806a, Set<String> set, bsa bsa) {
        if (!c0806a.f4509l) {
            return new brm(c0806a, true);
        }
        C0806a a;
        int i;
        brm a2;
        String str;
        String valueOf;
        switch (c0806a.f4498a) {
            case 2:
                a = awe.m6136a(c0806a);
                a.f4500c = new C0806a[c0806a.f4500c.length];
                for (i = 0; i < c0806a.f4500c.length; i++) {
                    a2 = m10558a(c0806a.f4500c[i], (Set) set, bsa.mo1418a(i));
                    if (a2 == f7462a) {
                        return f7462a;
                    }
                    a.f4500c[i] = (C0806a) a2.m10537a();
                }
                return new brm(a, false);
            case 3:
                a = awe.m6136a(c0806a);
                if (c0806a.f4501d.length != c0806a.f4502e.length) {
                    str = "Invalid serving value: ";
                    valueOf = String.valueOf(c0806a.toString());
                    brd.m10493a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                    return f7462a;
                }
                a.f4501d = new C0806a[c0806a.f4501d.length];
                a.f4502e = new C0806a[c0806a.f4501d.length];
                for (i = 0; i < c0806a.f4501d.length; i++) {
                    a2 = m10558a(c0806a.f4501d[i], (Set) set, bsa.mo1419b(i));
                    brm a3 = m10558a(c0806a.f4502e[i], (Set) set, bsa.mo1420c(i));
                    if (a2 == f7462a || a3 == f7462a) {
                        return f7462a;
                    }
                    a.f4501d[i] = (C0806a) a2.m10537a();
                    a.f4502e[i] = (C0806a) a3.m10537a();
                }
                return new brm(a, false);
            case 4:
                if (set.contains(c0806a.f4503f)) {
                    valueOf = String.valueOf(c0806a.f4503f);
                    str = String.valueOf(set.toString());
                    brd.m10493a(new StringBuilder((String.valueOf(valueOf).length() + 79) + String.valueOf(str).length()).append("Macro cycle detected.  Current macro reference: ").append(valueOf).append(".  Previous macro references: ").append(str).append(".").toString());
                    return f7462a;
                }
                set.add(c0806a.f4503f);
                brm<C0806a> a4 = bsb.m10597a(m10559a(c0806a.f4503f, (Set) set, bsa.mo1417a()), c0806a.f4508k);
                set.remove(c0806a.f4503f);
                return a4;
            case 7:
                a = awe.m6136a(c0806a);
                a.f4507j = new C0806a[c0806a.f4507j.length];
                for (i = 0; i < c0806a.f4507j.length; i++) {
                    a2 = m10558a(c0806a.f4507j[i], (Set) set, bsa.mo1421d(i));
                    if (a2 == f7462a) {
                        return f7462a;
                    }
                    a.f4507j[i] = (C0806a) a2.m10537a();
                }
                return new brm(a, false);
            default:
                brd.m10493a("Unknown type: " + c0806a.f4498a);
                return f7462a;
        }
    }

    /* renamed from: a */
    private brm<C0806a> m10559a(String str, Set<String> set, brf brf) {
        this.f7473l++;
        C1431b c1431b = (C1431b) this.f7468g.m10600a(str);
        if (c1431b != null) {
            m10563a(c1431b.m10551b(), (Set) set);
            this.f7473l--;
            return c1431b.m10550a();
        }
        C1432c c1432c = (C1432c) this.f7471j.get(str);
        if (c1432c == null) {
            String valueOf = String.valueOf(m10562a());
            brd.m10493a(new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(str).length()).append(valueOf).append("Invalid macro: ").append(str).toString());
            this.f7473l--;
            return f7462a;
        }
        C0858a f;
        brm a = m10566a(str, c1432c.m10552a(), c1432c.m10553b(), c1432c.m10554c(), c1432c.m10556e(), c1432c.m10555d(), set, brf.mo1407b());
        if (((Set) a.m10537a()).isEmpty()) {
            f = c1432c.m10557f();
        } else {
            if (((Set) a.m10537a()).size() > 1) {
                valueOf = String.valueOf(m10562a());
                brd.m10495b(new StringBuilder((String.valueOf(valueOf).length() + 37) + String.valueOf(str).length()).append(valueOf).append("Multiple macros active for macroName ").append(str).toString());
            }
            f = (C0858a) ((Set) a.m10537a()).iterator().next();
        }
        if (f == null) {
            this.f7473l--;
            return f7462a;
        }
        brm a2 = m10560a(this.f7466e, f, (Set) set, brf.mo1406a());
        boolean z = a.m10538b() && a2.m10538b();
        brm<C0806a> brm = a2 == f7462a ? f7462a : new brm((C0806a) a2.m10537a(), z);
        C0806a b = f.m6129b();
        if (brm.m10538b()) {
            this.f7468g.m10601a(str, new C1431b(brm, b));
        }
        m10563a(b, (Set) set);
        this.f7473l--;
        return brm;
    }

    /* renamed from: a */
    private brm<C0806a> m10560a(Map<String, bqx> map, C0858a c0858a, Set<String> set, bro bro) {
        boolean z = true;
        C0806a c0806a = (C0806a) c0858a.m6127a().get(ats.FUNCTION.toString());
        if (c0806a == null) {
            brd.m10493a("No function id in properties");
            return f7462a;
        }
        String str = c0806a.f4504g;
        bqx bqx = (bqx) map.get(str);
        if (bqx == null) {
            brd.m10493a(String.valueOf(str).concat(" has no backing implementation."));
            return f7462a;
        }
        brm<C0806a> brm = (brm) this.f7467f.m10600a(c0858a);
        if (brm != null) {
            return brm;
        }
        Map hashMap = new HashMap();
        boolean z2 = true;
        for (Entry entry : c0858a.m6127a().entrySet()) {
            brm a = m10558a((C0806a) entry.getValue(), (Set) set, bro.mo1408a((String) entry.getKey()).mo1409a((C0806a) entry.getValue()));
            if (a == f7462a) {
                return f7462a;
            }
            boolean z3;
            if (a.m10538b()) {
                c0858a.m6128a((String) entry.getKey(), (C0806a) a.m10537a());
                z3 = z2;
            } else {
                z3 = false;
            }
            hashMap.put((String) entry.getKey(), (C0806a) a.m10537a());
            z2 = z3;
        }
        if (bqx.m10480a(hashMap.keySet())) {
            if (!(z2 && bqx.m10479a())) {
                z = false;
            }
            brm = new brm(bqx.m10478a(hashMap), z);
            if (!z) {
                return brm;
            }
            this.f7467f.m10601a(c0858a, brm);
            return brm;
        }
        String valueOf = String.valueOf(bqx.m10481b());
        String valueOf2 = String.valueOf(hashMap.keySet());
        brd.m10493a(new StringBuilder(((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()).append("Incorrect keys for function ").append(str).append(" required ").append(valueOf).append(" had ").append(valueOf2).toString());
        return f7462a;
    }

    /* renamed from: a */
    private brm<Set<C0858a>> m10561a(Set<C0859b> set, Set<String> set2, C1428a c1428a, brs brs) {
        Set hashSet = new HashSet();
        Collection hashSet2 = new HashSet();
        boolean z = true;
        for (C0859b c0859b : set) {
            brr a = brs.mo1416a();
            brm a2 = m10565a(c0859b, (Set) set2, a);
            if (((Boolean) a2.m10537a()).booleanValue()) {
                c1428a.mo1422a(c0859b, hashSet, hashSet2, a);
            }
            boolean z2 = z && a2.m10538b();
            z = z2;
        }
        hashSet.removeAll(hashSet2);
        return new brm(hashSet, z);
    }

    /* renamed from: a */
    private String m10562a() {
        if (this.f7473l <= 1) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Integer.toString(this.f7473l));
        for (int i = 2; i < this.f7473l; i++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(": ");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private void m10563a(C0806a c0806a, Set<String> set) {
        if (c0806a != null) {
            brm a = m10558a(c0806a, (Set) set, new brl());
            if (a != f7462a) {
                Object c = brz.m10591c((C0806a) a.m10537a());
                if (c instanceof Map) {
                    this.f7470i.m10458a((Map) c);
                } else if (c instanceof List) {
                    for (Object c2 : (List) c2) {
                        if (c2 instanceof Map) {
                            this.f7470i.m10458a((Map) c2);
                        } else {
                            brd.m10495b("pushAfterEvaluate: value not a Map");
                        }
                    }
                } else {
                    brd.m10495b("pushAfterEvaluate: value not a Map or List");
                }
            }
        }
    }

    /* renamed from: a */
    brm<Boolean> m10564a(C0858a c0858a, Set<String> set, bro bro) {
        brm a = m10560a(this.f7465d, c0858a, (Set) set, bro);
        Object b = brz.m10588b((C0806a) a.m10537a());
        brz.m10590c(b);
        return new brm(b, a.m10538b());
    }

    /* renamed from: a */
    brm<Boolean> m10565a(C0859b c0859b, Set<String> set, brr brr) {
        boolean z = true;
        for (C0858a a : c0859b.m6131b()) {
            brm a2 = m10564a(a, (Set) set, brr.mo1410a());
            if (((Boolean) a2.m10537a()).booleanValue()) {
                brz.m10590c(Boolean.valueOf(false));
                return new brm(Boolean.valueOf(false), a2.m10538b());
            }
            boolean z2 = z && a2.m10538b();
            z = z2;
        }
        for (C0858a a3 : c0859b.m6130a()) {
            a2 = m10564a(a3, (Set) set, brr.mo1411b());
            if (((Boolean) a2.m10537a()).booleanValue()) {
                z = z && a2.m10538b();
            } else {
                brz.m10590c(Boolean.valueOf(false));
                return new brm(Boolean.valueOf(false), a2.m10538b());
            }
        }
        brz.m10590c(Boolean.valueOf(true));
        return new brm(Boolean.valueOf(true), z);
    }

    /* renamed from: a */
    brm<Set<C0858a>> m10566a(String str, Set<C0859b> set, Map<C0859b, List<C0858a>> map, Map<C0859b, List<String>> map2, Map<C0859b, List<C0858a>> map3, Map<C0859b, List<String>> map4, Set<String> set2, brs brs) {
        final Map<C0859b, List<C0858a>> map5 = map;
        final Map<C0859b, List<String>> map6 = map2;
        final Map<C0859b, List<C0858a>> map7 = map3;
        final Map<C0859b, List<String>> map8 = map4;
        return m10561a((Set) set, (Set) set2, new C1428a(this) {
            /* renamed from: a */
            public void mo1422a(C0859b c0859b, Set<C0858a> set, Set<C0858a> set2, brr brr) {
                List list = (List) map5.get(c0859b);
                map6.get(c0859b);
                if (list != null) {
                    set.addAll(list);
                    brr.mo1412c();
                }
                list = (List) map7.get(c0859b);
                map8.get(c0859b);
                if (list != null) {
                    set2.addAll(list);
                    brr.mo1413d();
                }
            }
        }, brs);
    }

    /* renamed from: a */
    brm<Set<C0858a>> m10567a(Set<C0859b> set, brs brs) {
        return m10561a((Set) set, new HashSet(), new C14302(this), brs);
    }

    /* renamed from: a */
    public synchronized void m10568a(String str) {
        m10569b(str);
        bsf a = this.f7463b.m10477a(str).m10476a();
        for (C0858a a2 : (Set) m10567a(this.f7469h, a.m10614b()).m10537a()) {
            m10560a(this.f7464c, a2, new HashSet(), a.m10613a());
        }
        m10569b(null);
    }

    /* renamed from: b */
    synchronized void m10569b(String str) {
        this.f7472k = str;
    }
}
