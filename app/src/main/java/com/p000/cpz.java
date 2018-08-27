package com.p000;

import java.util.HashMap;

/* compiled from: HashMapBuilder */
/* renamed from: cpz */
public class cpz<K, V> {
    /* renamed from: a */
    private HashMap<K, V> f19954a;

    public cpz() {
        this.f19954a = new HashMap();
    }

    public cpz(Object... objArr) {
        this();
        m24354a(objArr);
    }

    public cpz(K k, V v) {
        this();
        m24353a(k, v);
    }

    /* renamed from: a */
    public cpz<K, V> m24354a(Object... objArr) {
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            this.f19954a.put(objArr[i], objArr[i + 1]);
        }
        return this;
    }

    /* renamed from: a */
    public cpz<K, V> m24353a(K k, V v) {
        this.f19954a.put(k, v);
        return this;
    }

    /* renamed from: a */
    public HashMap<K, V> m24355a() {
        return this.f19954a;
    }
}
