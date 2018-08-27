package com.p000;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* compiled from: LruLinkedHashMap */
/* renamed from: cqc */
public class cqc<K, V> extends LinkedHashMap<K, V> {
    /* renamed from: a */
    private int f19957a;

    public cqc(int i) {
        this.f19957a = i;
    }

    public boolean removeEldestEntry(Entry<K, V> entry) {
        return size() > this.f19957a;
    }
}
