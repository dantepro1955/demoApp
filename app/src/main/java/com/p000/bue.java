package com.p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray */
/* renamed from: bue */
public final class bue extends buh implements Iterable<buh> {
    /* renamed from: a */
    private final List<buh> f7701a = new ArrayList();

    /* renamed from: a */
    public void m11078a(buh buh) {
        if (buh == null) {
            buh = buj.f7702a;
        }
        this.f7701a.add(buh);
    }

    /* renamed from: a */
    public int m11076a() {
        return this.f7701a.size();
    }

    public Iterator<buh> iterator() {
        return this.f7701a.iterator();
    }

    /* renamed from: a */
    public buh m11077a(int i) {
        return (buh) this.f7701a.get(i);
    }

    /* renamed from: b */
    public Number mo1538b() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1538b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public String mo1539c() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1539c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public double mo1540d() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1540d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public long mo1541e() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1541e();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public int mo1542f() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1542f();
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public boolean mo1543g() {
        if (this.f7701a.size() == 1) {
            return ((buh) this.f7701a.get(0)).mo1543g();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof bue) && ((bue) obj).f7701a.equals(this.f7701a));
    }

    public int hashCode() {
        return this.f7701a.hashCode();
    }
}
