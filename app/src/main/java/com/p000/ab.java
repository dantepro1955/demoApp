package com.p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p000.hq.C3584a;
import p000.hq.C3585b;

/* compiled from: DirectedAcyclicGraph */
/* renamed from: ab */
public final class ab<T> {
    /* renamed from: a */
    private final C3584a<ArrayList<T>> f155a = new C3585b(10);
    /* renamed from: b */
    private final hr<T, ArrayList<T>> f156b = new hr();
    /* renamed from: c */
    private final ArrayList<T> f157c = new ArrayList();
    /* renamed from: d */
    private final HashSet<T> f158d = new HashSet();

    /* renamed from: a */
    public void m145a(T t) {
        if (!this.f156b.containsKey(t)) {
            this.f156b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean m148b(T t) {
        return this.f156b.containsKey(t);
    }

    /* renamed from: a */
    public void m146a(T t, T t2) {
        if (this.f156b.containsKey(t) && this.f156b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.f156b.get(t);
            if (arrayList == null) {
                arrayList = m143c();
                this.f156b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: c */
    public List m149c(T t) {
        return (List) this.f156b.get(t);
    }

    /* renamed from: d */
    public List m150d(T t) {
        List list = null;
        int size = this.f156b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f156b.c(i);
            if (arrayList != null && arrayList.contains(t)) {
                if (list == null) {
                    arrayList = new ArrayList();
                } else {
                    List list2 = list;
                }
                arrayList.add(this.f156b.b(i));
                list = arrayList;
            }
        }
        return list;
    }

    /* renamed from: e */
    public boolean m151e(T t) {
        int size = this.f156b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f156b.c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m144a() {
        int size = this.f156b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f156b.c(i);
            if (arrayList != null) {
                m142a(arrayList);
            }
        }
        this.f156b.clear();
    }

    /* renamed from: b */
    public ArrayList<T> m147b() {
        this.f157c.clear();
        this.f158d.clear();
        int size = this.f156b.size();
        for (int i = 0; i < size; i++) {
            m141a(this.f156b.b(i), this.f157c, this.f158d);
        }
        return this.f157c;
    }

    /* renamed from: a */
    private void m141a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (hashSet.contains(t)) {
                throw new RuntimeException("This graph contains cyclic dependencies");
            }
            hashSet.add(t);
            ArrayList arrayList2 = (ArrayList) this.f156b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m141a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
        }
    }

    /* renamed from: c */
    private ArrayList<T> m143c() {
        ArrayList<T> arrayList = (ArrayList) this.f155a.mo3319a();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m142a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f155a.mo3320a(arrayList);
    }
}
