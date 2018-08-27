package com.p000;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: ArrayMap */
/* renamed from: hh */
public class hh<K, V> extends hr<K, V> implements Map<K, V> {
    /* renamed from: a */
    ho<K, V> f23783a;

    /* compiled from: ArrayMap */
    /* renamed from: hh$1 */
    class C53621 extends ho<K, V> {
        /* renamed from: a */
        final /* synthetic */ hh f23775a;

        C53621(hh hhVar) {
            this.f23775a = hhVar;
        }

        /* renamed from: a */
        protected int mo4810a() {
            return this.f23775a.h;
        }

        /* renamed from: a */
        protected Object mo4812a(int i, int i2) {
            return this.f23775a.g[(i << 1) + i2];
        }

        /* renamed from: a */
        protected int mo4811a(Object obj) {
            return this.f23775a.m30550a(obj);
        }

        /* renamed from: b */
        protected int mo4816b(Object obj) {
            return this.f23775a.m30555b(obj);
        }

        /* renamed from: b */
        protected Map<K, V> mo4817b() {
            return this.f23775a;
        }

        /* renamed from: a */
        protected void mo4815a(K k, V v) {
            this.f23775a.put(k, v);
        }

        /* renamed from: a */
        protected V mo4813a(int i, V v) {
            return this.f23775a.m30552a(i, (Object) v);
        }

        /* renamed from: a */
        protected void mo4814a(int i) {
            this.f23775a.m30558d(i);
        }

        /* renamed from: c */
        protected void mo4818c() {
            this.f23775a.clear();
        }
    }

    public hh(int i) {
        super(i);
    }

    public hh(hr hrVar) {
        super(hrVar);
    }

    /* renamed from: b */
    private ho<K, V> m30559b() {
        if (this.f23783a == null) {
            this.f23783a = new C53621(this);
        }
        return this.f23783a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m30553a(this.h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public boolean m30560a(Collection<?> collection) {
        return ho.m30523c(this, collection);
    }

    public Set<Entry<K, V>> entrySet() {
        return m30559b().m30535d();
    }

    public Set<K> keySet() {
        return m30559b().m30536e();
    }

    public Collection<V> values() {
        return m30559b().m30537f();
    }
}
