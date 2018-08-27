package com.p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: MapCollections */
/* renamed from: ho */
abstract class ho<K, V> {
    /* renamed from: b */
    C5365b f23772b;
    /* renamed from: c */
    C5366c f23773c;
    /* renamed from: d */
    C5368e f23774d;

    /* compiled from: MapCollections */
    /* renamed from: ho$a */
    final class C5364a<T> implements Iterator<T> {
        /* renamed from: a */
        final int f23806a;
        /* renamed from: b */
        int f23807b;
        /* renamed from: c */
        int f23808c;
        /* renamed from: d */
        boolean f23809d = false;
        /* renamed from: e */
        final /* synthetic */ ho f23810e;

        C5364a(ho hoVar, int i) {
            this.f23810e = hoVar;
            this.f23806a = i;
            this.f23807b = hoVar.mo4810a();
        }

        public boolean hasNext() {
            return this.f23808c < this.f23807b;
        }

        public T next() {
            T a = this.f23810e.mo4812a(this.f23808c, this.f23806a);
            this.f23808c++;
            this.f23809d = true;
            return a;
        }

        public void remove() {
            if (this.f23809d) {
                this.f23808c--;
                this.f23807b--;
                this.f23809d = false;
                this.f23810e.mo4814a(this.f23808c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    /* renamed from: ho$b */
    final class C5365b implements Set<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ ho f23811a;

        C5365b(ho hoVar) {
            this.f23811a = hoVar;
        }

        public /* synthetic */ boolean add(Object obj) {
            return m30599a((Entry) obj);
        }

        /* renamed from: a */
        public boolean m30599a(Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = this.f23811a.mo4810a();
            for (Entry entry : collection) {
                this.f23811a.mo4815a(entry.getKey(), entry.getValue());
            }
            return a != this.f23811a.mo4810a();
        }

        public void clear() {
            this.f23811a.mo4818c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = this.f23811a.mo4811a(entry.getKey());
            if (a >= 0) {
                return hj.m30582a(this.f23811a.mo4812a(a, 1), entry.getValue());
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f23811a.mo4810a() == 0;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C5367d(this.f23811a);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.f23811a.mo4810a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public boolean equals(Object obj) {
            return ho.m30521a((Set) this, obj);
        }

        public int hashCode() {
            int a = this.f23811a.mo4810a() - 1;
            int i = 0;
            while (a >= 0) {
                int i2;
                Object a2 = this.f23811a.mo4812a(a, 0);
                Object a3 = this.f23811a.mo4812a(a, 1);
                int hashCode = a2 == null ? 0 : a2.hashCode();
                if (a3 == null) {
                    i2 = 0;
                } else {
                    i2 = a3.hashCode();
                }
                a--;
                i += i2 ^ hashCode;
            }
            return i;
        }
    }

    /* compiled from: MapCollections */
    /* renamed from: ho$c */
    final class C5366c implements Set<K> {
        /* renamed from: a */
        final /* synthetic */ ho f23812a;

        C5366c(ho hoVar) {
            this.f23812a = hoVar;
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f23812a.mo4818c();
        }

        public boolean contains(Object obj) {
            return this.f23812a.mo4811a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return ho.m30520a(this.f23812a.mo4817b(), (Collection) collection);
        }

        public boolean isEmpty() {
            return this.f23812a.mo4810a() == 0;
        }

        public Iterator<K> iterator() {
            return new C5364a(this.f23812a, 0);
        }

        public boolean remove(Object obj) {
            int a = this.f23812a.mo4811a(obj);
            if (a < 0) {
                return false;
            }
            this.f23812a.mo4814a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return ho.m30522b(this.f23812a.mo4817b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return ho.m30523c(this.f23812a.mo4817b(), collection);
        }

        public int size() {
            return this.f23812a.mo4810a();
        }

        public Object[] toArray() {
            return this.f23812a.m30533b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f23812a.m30530a((Object[]) tArr, 0);
        }

        public boolean equals(Object obj) {
            return ho.m30521a((Set) this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = this.f23812a.mo4810a() - 1; a >= 0; a--) {
                Object a2 = this.f23812a.mo4812a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }
    }

    /* compiled from: MapCollections */
    /* renamed from: ho$d */
    final class C5367d implements Iterator<Entry<K, V>>, Entry<K, V> {
        /* renamed from: a */
        int f23813a;
        /* renamed from: b */
        int f23814b;
        /* renamed from: c */
        boolean f23815c = false;
        /* renamed from: d */
        final /* synthetic */ ho f23816d;

        public /* synthetic */ Object next() {
            return m30600a();
        }

        C5367d(ho hoVar) {
            this.f23816d = hoVar;
            this.f23813a = hoVar.mo4810a() - 1;
            this.f23814b = -1;
        }

        public boolean hasNext() {
            return this.f23814b < this.f23813a;
        }

        /* renamed from: a */
        public Entry<K, V> m30600a() {
            this.f23814b++;
            this.f23815c = true;
            return this;
        }

        public void remove() {
            if (this.f23815c) {
                this.f23816d.mo4814a(this.f23814b);
                this.f23814b--;
                this.f23813a--;
                this.f23815c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public K getKey() {
            if (this.f23815c) {
                return this.f23816d.mo4812a(this.f23814b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f23815c) {
                return this.f23816d.mo4812a(this.f23814b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V setValue(V v) {
            if (this.f23815c) {
                return this.f23816d.mo4813a(this.f23814b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f23815c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!(hj.m30582a(entry.getKey(), this.f23816d.mo4812a(this.f23814b, 0)) && hj.m30582a(entry.getValue(), this.f23816d.mo4812a(this.f23814b, 1)))) {
                    z = false;
                }
                return z;
            }
        }

        public final int hashCode() {
            int i = 0;
            if (this.f23815c) {
                Object a = this.f23816d.mo4812a(this.f23814b, 0);
                Object a2 = this.f23816d.mo4812a(this.f23814b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return i ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    /* renamed from: ho$e */
    final class C5368e implements Collection<V> {
        /* renamed from: a */
        final /* synthetic */ ho f23817a;

        C5368e(ho hoVar) {
            this.f23817a = hoVar;
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.f23817a.mo4818c();
        }

        public boolean contains(Object obj) {
            return this.f23817a.mo4816b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return this.f23817a.mo4810a() == 0;
        }

        public Iterator<V> iterator() {
            return new C5364a(this.f23817a, 1);
        }

        public boolean remove(Object obj) {
            int b = this.f23817a.mo4816b(obj);
            if (b < 0) {
                return false;
            }
            this.f23817a.mo4814a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = this.f23817a.mo4810a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(this.f23817a.mo4812a(i, 1))) {
                    this.f23817a.mo4814a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = this.f23817a.mo4810a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(this.f23817a.mo4812a(i, 1))) {
                    this.f23817a.mo4814a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return this.f23817a.mo4810a();
        }

        public Object[] toArray() {
            return this.f23817a.m30533b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f23817a.m30530a((Object[]) tArr, 1);
        }
    }

    /* renamed from: a */
    protected abstract int mo4810a();

    /* renamed from: a */
    protected abstract int mo4811a(Object obj);

    /* renamed from: a */
    protected abstract Object mo4812a(int i, int i2);

    /* renamed from: a */
    protected abstract V mo4813a(int i, V v);

    /* renamed from: a */
    protected abstract void mo4814a(int i);

    /* renamed from: a */
    protected abstract void mo4815a(K k, V v);

    /* renamed from: b */
    protected abstract int mo4816b(Object obj);

    /* renamed from: b */
    protected abstract Map<K, V> mo4817b();

    /* renamed from: c */
    protected abstract void mo4818c();

    ho() {
    }

    /* renamed from: a */
    public static <K, V> boolean m30520a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static <K, V> boolean m30522b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m30523c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public Object[] m30533b(int i) {
        int a = mo4810a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo4812a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public <T> T[] m30530a(T[] tArr, int i) {
        T[] tArr2;
        int a = mo4810a();
        if (tArr.length < a) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo4812a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    /* renamed from: a */
    public static <T> boolean m30521a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (!(set.size() == set2.size() && set.containsAll(set2))) {
                z = false;
            }
            return z;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    /* renamed from: d */
    public Set<Entry<K, V>> m30535d() {
        if (this.f23772b == null) {
            this.f23772b = new C5365b(this);
        }
        return this.f23772b;
    }

    /* renamed from: e */
    public Set<K> m30536e() {
        if (this.f23773c == null) {
            this.f23773c = new C5366c(this);
        }
        return this.f23773c;
    }

    /* renamed from: f */
    public Collection<V> m30537f() {
        if (this.f23774d == null) {
            this.f23774d = new C5368e(this);
        }
        return this.f23774d;
    }
}
