package com.p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: sl */
public abstract class sl {
    /* renamed from: a */
    private final ArrayList<Object> f25259a;

    /* renamed from: sl$a */
    public abstract class C5696a {
        /* renamed from: a */
        private final Iterator<Object> f25258a;

        public C5696a(sl slVar) {
            this.f25258a = slVar.f25259a.iterator();
        }

        /* renamed from: a */
        public final boolean m33926a() {
            return this.f25258a.hasNext();
        }

        /* renamed from: b */
        public final Object m33927b() {
            return this.f25258a.next();
        }
    }

    public sl(int i) {
        this.f25259a = new ArrayList(i);
    }

    /* renamed from: a */
    public final Object m33929a(int i) {
        return this.f25259a.get(i);
    }

    /* renamed from: a */
    public final void m33930a(Object obj) {
        this.f25259a.add(obj);
    }

    /* renamed from: d */
    public final Object m33931d() {
        return this.f25259a.remove(0);
    }

    /* renamed from: e */
    public final void m33932e() {
        this.f25259a.clear();
    }

    /* renamed from: f */
    public final int m33933f() {
        return this.f25259a.size();
    }
}
