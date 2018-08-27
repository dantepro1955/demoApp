package com.p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: QueryBuilder */
/* renamed from: doq */
public class doq<T> {
    /* renamed from: a */
    public static boolean f22442a;
    /* renamed from: b */
    public static boolean f22443b;
    /* renamed from: c */
    private final dor<T> f22444c;
    /* renamed from: d */
    private StringBuilder f22445d;
    /* renamed from: e */
    private final List<Object> f22446e;
    /* renamed from: f */
    private final List<doo<T, ?>> f22447f;
    /* renamed from: g */
    private final dnt<T, ?> f22448g;
    /* renamed from: h */
    private final String f22449h;
    /* renamed from: i */
    private Integer f22450i;
    /* renamed from: j */
    private Integer f22451j;
    /* renamed from: k */
    private boolean f22452k;

    /* renamed from: a */
    public static <T2> doq<T2> m28469a(dnt<T2, ?> dnt) {
        return new doq(dnt);
    }

    protected doq(dnt<T, ?> dnt) {
        this(dnt, "T");
    }

    protected doq(dnt<T, ?> dnt, String str) {
        this.f22448g = dnt;
        this.f22449h = str;
        this.f22446e = new ArrayList();
        this.f22447f = new ArrayList();
        this.f22444c = new dor(dnt, str);
    }

    /* renamed from: f */
    private void m28474f() {
        if (this.f22445d == null) {
            this.f22445d = new StringBuilder();
        } else if (this.f22445d.length() > 0) {
            this.f22445d.append(",");
        }
    }

    /* renamed from: a */
    public doq<T> m28479a(dos dos, dos... dosArr) {
        this.f22444c.m28492a(dos, dosArr);
        return this;
    }

    /* renamed from: a */
    public doq<T> m28478a(dos dos, dos dos2, dos... dosArr) {
        this.f22444c.m28492a(m28485b(dos, dos2, dosArr), new dos[0]);
        return this;
    }

    /* renamed from: b */
    public dos m28485b(dos dos, dos dos2, dos... dosArr) {
        return this.f22444c.m28489a(" OR ", dos, dos2, dosArr);
    }

    /* renamed from: a */
    public doq<T> m28480a(dnz... dnzArr) {
        m28471a(" ASC", dnzArr);
        return this;
    }

    /* renamed from: b */
    public doq<T> m28484b(dnz... dnzArr) {
        m28471a(" DESC", dnzArr);
        return this;
    }

    /* renamed from: a */
    private void m28471a(String str, dnz... dnzArr) {
        for (dnz dnz : dnzArr) {
            m28474f();
            m28481a(this.f22445d, dnz);
            if (String.class.equals(dnz.f22367b)) {
                this.f22445d.append(" COLLATE LOCALIZED");
            }
            this.f22445d.append(str);
        }
    }

    /* renamed from: a */
    protected StringBuilder m28481a(StringBuilder stringBuilder, dnz dnz) {
        this.f22444c.m28490a(dnz);
        stringBuilder.append(this.f22449h).append('.').append('\'').append(dnz.f22370e).append('\'');
        return stringBuilder;
    }

    /* renamed from: a */
    public doq<T> m28477a(int i) {
        this.f22450i = Integer.valueOf(i);
        return this;
    }

    /* renamed from: b */
    public doq<T> m28483b(int i) {
        this.f22451j = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public dop<T> m28476a() {
        StringBuilder g = m28475g();
        int a = m28468a(g);
        int b = m28473b(g);
        String stringBuilder = g.toString();
        m28470a(stringBuilder);
        return dop.m28462a(this.f22448g, stringBuilder, this.f22446e.toArray(), a, b);
    }

    /* renamed from: g */
    private StringBuilder m28475g() {
        StringBuilder stringBuilder = new StringBuilder(doh.m28420a(this.f22448g.getTablename(), this.f22449h, this.f22448g.getAllColumns(), this.f22452k));
        m28472a(stringBuilder, this.f22449h);
        if (this.f22445d != null && this.f22445d.length() > 0) {
            stringBuilder.append(" ORDER BY ").append(this.f22445d);
        }
        return stringBuilder;
    }

    /* renamed from: a */
    private int m28468a(StringBuilder stringBuilder) {
        if (this.f22450i == null) {
            return -1;
        }
        stringBuilder.append(" LIMIT ?");
        this.f22446e.add(this.f22450i);
        return this.f22446e.size() - 1;
    }

    /* renamed from: b */
    private int m28473b(StringBuilder stringBuilder) {
        if (this.f22451j == null) {
            return -1;
        }
        if (this.f22450i == null) {
            throw new IllegalStateException("Offset cannot be set without limit");
        }
        stringBuilder.append(" OFFSET ?");
        this.f22446e.add(this.f22451j);
        return this.f22446e.size() - 1;
    }

    /* renamed from: b */
    public don<T> m28482b() {
        if (this.f22447f.isEmpty()) {
            String tablename = this.f22448g.getTablename();
            StringBuilder stringBuilder = new StringBuilder(doh.m28421a(tablename, null));
            m28472a(stringBuilder, this.f22449h);
            tablename = stringBuilder.toString().replace(this.f22449h + ".\"", '\"' + tablename + "\".\"");
            m28470a(tablename);
            return don.m28455a(this.f22448g, tablename, this.f22446e.toArray());
        }
        throw new dnw("JOINs are not supported for DELETE queries");
    }

    /* renamed from: c */
    public dom<T> m28486c() {
        StringBuilder stringBuilder = new StringBuilder(doh.m28418a(this.f22448g.getTablename(), this.f22449h));
        m28472a(stringBuilder, this.f22449h);
        String stringBuilder2 = stringBuilder.toString();
        m28470a(stringBuilder2);
        return dom.m28449a(this.f22448g, stringBuilder2, this.f22446e.toArray());
    }

    /* renamed from: a */
    private void m28470a(String str) {
        if (f22442a) {
            dnx.m28322a("Built SQL for query: " + str);
        }
        if (f22443b) {
            dnx.m28322a("Values for query: " + this.f22446e);
        }
    }

    /* renamed from: a */
    private void m28472a(StringBuilder stringBuilder, String str) {
        this.f22446e.clear();
        for (doo doo : this.f22447f) {
            stringBuilder.append(" JOIN ").append(doo.f22434b.getTablename()).append(' ');
            stringBuilder.append(doo.f22437e).append(" ON ");
            doh.m28425a(stringBuilder, doo.f22433a, doo.f22435c).append('=');
            doh.m28425a(stringBuilder, doo.f22437e, doo.f22436d);
        }
        Object obj = !this.f22444c.m28495a() ? 1 : null;
        if (obj != null) {
            stringBuilder.append(" WHERE ");
            this.f22444c.m28493a(stringBuilder, str, this.f22446e);
        }
        Object obj2 = obj;
        for (doo doo2 : this.f22447f) {
            if (!doo2.f22438f.m28495a()) {
                if (obj2 == null) {
                    stringBuilder.append(" WHERE ");
                    obj2 = 1;
                } else {
                    stringBuilder.append(" AND ");
                }
                doo2.f22438f.m28493a(stringBuilder, doo2.f22437e, this.f22446e);
            }
            obj2 = obj2;
        }
    }

    /* renamed from: d */
    public List<T> m28487d() {
        return m28476a().m28467c();
    }

    /* renamed from: e */
    public long m28488e() {
        return m28486c().m28452c();
    }
}
