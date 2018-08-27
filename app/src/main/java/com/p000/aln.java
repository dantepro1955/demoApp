package com.p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aln */
public final class aln {
    /* renamed from: a */
    private final alp f1977a;
    /* renamed from: b */
    private final apt f1978b;
    /* renamed from: c */
    private boolean f1979c;
    /* renamed from: d */
    private long f1980d;
    /* renamed from: e */
    private long f1981e;
    /* renamed from: f */
    private long f1982f;
    /* renamed from: g */
    private long f1983g;
    /* renamed from: h */
    private long f1984h;
    /* renamed from: i */
    private boolean f1985i;
    /* renamed from: j */
    private final Map<Class<? extends alo>, alo> f1986j;
    /* renamed from: k */
    private final List<alr> f1987k;

    aln(aln aln) {
        this.f1977a = aln.f1977a;
        this.f1978b = aln.f1978b;
        this.f1980d = aln.f1980d;
        this.f1981e = aln.f1981e;
        this.f1982f = aln.f1982f;
        this.f1983g = aln.f1983g;
        this.f1984h = aln.f1984h;
        this.f1987k = new ArrayList(aln.f1987k);
        this.f1986j = new HashMap(aln.f1986j.size());
        for (Entry entry : aln.f1986j.entrySet()) {
            alo c = aln.m2486c((Class) entry.getKey());
            ((alo) entry.getValue()).mo1348a(c);
            this.f1986j.put((Class) entry.getKey(), c);
        }
    }

    aln(alp alp, apt apt) {
        aoi.m4679a((Object) alp);
        aoi.m4679a((Object) apt);
        this.f1977a = alp;
        this.f1978b = apt;
        this.f1983g = 1800000;
        this.f1984h = 3024000000L;
        this.f1986j = new HashMap();
        this.f1987k = new ArrayList();
    }

    /* renamed from: c */
    private static <T extends alo> T m2486c(Class<T> cls) {
        try {
            return (alo) cls.newInstance();
        } catch (Throwable e) {
            throw new IllegalArgumentException("dataType doesn't have default constructor", e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException("dataType default constructor is not accessible", e2);
        }
    }

    /* renamed from: a */
    public aln m2487a() {
        return new aln(this);
    }

    /* renamed from: a */
    public <T extends alo> T m2488a(Class<T> cls) {
        return (alo) this.f1986j.get(cls);
    }

    /* renamed from: a */
    public void m2489a(long j) {
        this.f1981e = j;
    }

    /* renamed from: a */
    public void m2490a(alo alo) {
        aoi.m4679a((Object) alo);
        Class cls = alo.getClass();
        if (cls.getSuperclass() != alo.class) {
            throw new IllegalArgumentException();
        }
        alo.mo1348a(m2491b(cls));
    }

    /* renamed from: b */
    public <T extends alo> T m2491b(Class<T> cls) {
        alo alo = (alo) this.f1986j.get(cls);
        if (alo != null) {
            return alo;
        }
        T c = aln.m2486c(cls);
        this.f1986j.put(cls, c);
        return c;
    }

    /* renamed from: b */
    public Collection<alo> m2492b() {
        return this.f1986j.values();
    }

    /* renamed from: c */
    public List<alr> m2493c() {
        return this.f1987k;
    }

    /* renamed from: d */
    public long m2494d() {
        return this.f1980d;
    }

    /* renamed from: e */
    public void m2495e() {
        m2499i().m2514a(this);
    }

    /* renamed from: f */
    public boolean m2496f() {
        return this.f1979c;
    }

    /* renamed from: g */
    void m2497g() {
        this.f1982f = this.f1978b.mo607b();
        if (this.f1981e != 0) {
            this.f1980d = this.f1981e;
        } else {
            this.f1980d = this.f1978b.mo606a();
        }
        this.f1979c = true;
    }

    /* renamed from: h */
    alp m2498h() {
        return this.f1977a;
    }

    /* renamed from: i */
    alq m2499i() {
        return this.f1977a.m2410n();
    }

    /* renamed from: j */
    boolean m2500j() {
        return this.f1985i;
    }

    /* renamed from: k */
    void m2501k() {
        this.f1985i = true;
    }
}
