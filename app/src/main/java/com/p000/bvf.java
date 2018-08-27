package com.p000;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
/* renamed from: bvf */
public final class bvf<K, V> extends AbstractMap<K, V> implements Serializable {
    /* renamed from: f */
    static final /* synthetic */ boolean f7772f = (!bvf.class.desiredAssertionStatus());
    /* renamed from: g */
    private static final Comparator<Comparable> f7773g = new C15161();
    /* renamed from: a */
    Comparator<? super K> f7774a;
    /* renamed from: b */
    C1522d<K, V> f7775b;
    /* renamed from: c */
    int f7776c;
    /* renamed from: d */
    int f7777d;
    /* renamed from: e */
    final C1522d<K, V> f7778e;
    /* renamed from: h */
    private C1519a f7779h;
    /* renamed from: i */
    private C1521b f7780i;

    /* compiled from: LinkedTreeMap */
    /* renamed from: bvf$1 */
    static class C15161 implements Comparator<Comparable> {
        C15161() {
        }

        public /* synthetic */ int compare(Object obj, Object obj2) {
            return m11170a((Comparable) obj, (Comparable) obj2);
        }

        /* renamed from: a */
        public int m11170a(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: bvf$c */
    abstract class C1517c<T> implements Iterator<T> {
        /* renamed from: b */
        C1522d<K, V> f7756b = this.f7759e.f7778e.f7767d;
        /* renamed from: c */
        C1522d<K, V> f7757c = null;
        /* renamed from: d */
        int f7758d = this.f7759e.f7777d;
        /* renamed from: e */
        final /* synthetic */ bvf f7759e;

        C1517c(bvf bvf) {
            this.f7759e = bvf;
        }

        public final boolean hasNext() {
            return this.f7756b != this.f7759e.f7778e;
        }

        /* renamed from: b */
        final C1522d<K, V> m11171b() {
            C1522d<K, V> c1522d = this.f7756b;
            if (c1522d == this.f7759e.f7778e) {
                throw new NoSuchElementException();
            } else if (this.f7759e.f7777d != this.f7758d) {
                throw new ConcurrentModificationException();
            } else {
                this.f7756b = c1522d.f7767d;
                this.f7757c = c1522d;
                return c1522d;
            }
        }

        public final void remove() {
            if (this.f7757c == null) {
                throw new IllegalStateException();
            }
            this.f7759e.m11183a(this.f7757c, true);
            this.f7757c = null;
            this.f7758d = this.f7759e.f7777d;
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: bvf$a */
    class C1519a extends AbstractSet<Entry<K, V>> {
        /* renamed from: a */
        final /* synthetic */ bvf f7761a;

        /* compiled from: LinkedTreeMap */
        /* renamed from: bvf$a$1 */
        class C15181 extends C1517c<Entry<K, V>> {
            /* renamed from: a */
            final /* synthetic */ C1519a f7760a;

            C15181(C1519a c1519a) {
                this.f7760a = c1519a;
                super(c1519a.f7761a);
            }

            public /* synthetic */ Object next() {
                return m11172a();
            }

            /* renamed from: a */
            public Entry<K, V> m11172a() {
                return m11171b();
            }
        }

        C1519a(bvf bvf) {
            this.f7761a = bvf;
        }

        public int size() {
            return this.f7761a.f7776c;
        }

        public Iterator<Entry<K, V>> iterator() {
            return new C15181(this);
        }

        public boolean contains(Object obj) {
            return (obj instanceof Entry) && this.f7761a.m11182a((Entry) obj) != null;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            C1522d a = this.f7761a.m11182a((Entry) obj);
            if (a == null) {
                return false;
            }
            this.f7761a.m11183a(a, true);
            return true;
        }

        public void clear() {
            this.f7761a.clear();
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: bvf$b */
    final class C1521b extends AbstractSet<K> {
        /* renamed from: a */
        final /* synthetic */ bvf f7763a;

        /* compiled from: LinkedTreeMap */
        /* renamed from: bvf$b$1 */
        class C15201 extends C1517c<K> {
            /* renamed from: a */
            final /* synthetic */ C1521b f7762a;

            C15201(C1521b c1521b) {
                this.f7762a = c1521b;
                super(c1521b.f7763a);
            }

            public K next() {
                return m11171b().f7769f;
            }
        }

        C1521b(bvf bvf) {
            this.f7763a = bvf;
        }

        public int size() {
            return this.f7763a.f7776c;
        }

        public Iterator<K> iterator() {
            return new C15201(this);
        }

        public boolean contains(Object obj) {
            return this.f7763a.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.f7763a.m11184b(obj) != null;
        }

        public void clear() {
            this.f7763a.clear();
        }
    }

    /* compiled from: LinkedTreeMap */
    /* renamed from: bvf$d */
    static final class C1522d<K, V> implements Entry<K, V> {
        /* renamed from: a */
        C1522d<K, V> f7764a;
        /* renamed from: b */
        C1522d<K, V> f7765b;
        /* renamed from: c */
        C1522d<K, V> f7766c;
        /* renamed from: d */
        C1522d<K, V> f7767d;
        /* renamed from: e */
        C1522d<K, V> f7768e;
        /* renamed from: f */
        final K f7769f;
        /* renamed from: g */
        V f7770g;
        /* renamed from: h */
        int f7771h;

        C1522d() {
            this.f7769f = null;
            this.f7768e = this;
            this.f7767d = this;
        }

        C1522d(C1522d<K, V> c1522d, K k, C1522d<K, V> c1522d2, C1522d<K, V> c1522d3) {
            this.f7764a = c1522d;
            this.f7769f = k;
            this.f7771h = 1;
            this.f7767d = c1522d2;
            this.f7768e = c1522d3;
            c1522d3.f7767d = this;
            c1522d2.f7768e = this;
        }

        public K getKey() {
            return this.f7769f;
        }

        public V getValue() {
            return this.f7770g;
        }

        public V setValue(V v) {
            V v2 = this.f7770g;
            this.f7770g = v;
            return v2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (this.f7769f == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!this.f7769f.equals(entry.getKey())) {
                return false;
            }
            if (this.f7770g == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!this.f7770g.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = 0;
            int hashCode = this.f7769f == null ? 0 : this.f7769f.hashCode();
            if (this.f7770g != null) {
                i = this.f7770g.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            return this.f7769f + "=" + this.f7770g;
        }

        /* renamed from: a */
        public C1522d<K, V> m11173a() {
            C1522d<K, V> c1522d;
            for (C1522d<K, V> c1522d2 = this.f7765b; c1522d2 != null; c1522d2 = c1522d2.f7765b) {
                c1522d = c1522d2;
            }
            return c1522d;
        }

        /* renamed from: b */
        public C1522d<K, V> m11174b() {
            C1522d<K, V> c1522d;
            for (C1522d<K, V> c1522d2 = this.f7766c; c1522d2 != null; c1522d2 = c1522d2.f7766c) {
                c1522d = c1522d2;
            }
            return c1522d;
        }
    }

    public bvf() {
        this(f7773g);
    }

    public bvf(Comparator<? super K> comparator) {
        this.f7776c = 0;
        this.f7777d = 0;
        this.f7778e = new C1522d();
        if (comparator == null) {
            comparator = f7773g;
        }
        this.f7774a = comparator;
    }

    public int size() {
        return this.f7776c;
    }

    public V get(Object obj) {
        C1522d a = m11180a(obj);
        return a != null ? a.f7770g : null;
    }

    public boolean containsKey(Object obj) {
        return m11180a(obj) != null;
    }

    public V put(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        C1522d a = m11181a((Object) k, true);
        V v2 = a.f7770g;
        a.f7770g = v;
        return v2;
    }

    public void clear() {
        this.f7775b = null;
        this.f7776c = 0;
        this.f7777d++;
        C1522d c1522d = this.f7778e;
        c1522d.f7768e = c1522d;
        c1522d.f7767d = c1522d;
    }

    public V remove(Object obj) {
        C1522d b = m11184b(obj);
        return b != null ? b.f7770g : null;
    }

    /* renamed from: a */
    C1522d<K, V> m11181a(K k, boolean z) {
        int i;
        Comparator comparator = this.f7774a;
        C1522d<K, V> c1522d = this.f7775b;
        if (c1522d != null) {
            int compareTo;
            Comparable comparable = comparator == f7773g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    compareTo = comparable.compareTo(c1522d.f7769f);
                } else {
                    compareTo = comparator.compare(k, c1522d.f7769f);
                }
                if (compareTo == 0) {
                    return c1522d;
                }
                C1522d<K, V> c1522d2 = compareTo < 0 ? c1522d.f7765b : c1522d.f7766c;
                if (c1522d2 == null) {
                    break;
                }
                c1522d = c1522d2;
            }
            int i2 = compareTo;
            C1522d c1522d3 = c1522d;
            i = i2;
        } else {
            C1522d<K, V> c1522d4 = c1522d;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C1522d<K, V> c1522d5;
        C1522d c1522d6 = this.f7778e;
        if (c1522d3 != null) {
            c1522d5 = new C1522d(c1522d3, k, c1522d6, c1522d6.f7768e);
            if (i < 0) {
                c1522d3.f7765b = c1522d5;
            } else {
                c1522d3.f7766c = c1522d5;
            }
            m11179b(c1522d3, true);
        } else if (comparator != f7773g || (k instanceof Comparable)) {
            c1522d5 = new C1522d(c1522d3, k, c1522d6, c1522d6.f7768e);
            this.f7775b = c1522d5;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.f7776c++;
        this.f7777d++;
        return c1522d5;
    }

    /* renamed from: a */
    C1522d<K, V> m11180a(Object obj) {
        C1522d<K, V> c1522d = null;
        if (obj != null) {
            try {
                c1522d = m11181a(obj, false);
            } catch (ClassCastException e) {
            }
        }
        return c1522d;
    }

    /* renamed from: a */
    C1522d<K, V> m11182a(Entry<?, ?> entry) {
        C1522d<K, V> a = m11180a(entry.getKey());
        Object obj = (a == null || !m11177a(a.f7770g, entry.getValue())) ? null : 1;
        return obj != null ? a : null;
    }

    /* renamed from: a */
    private boolean m11177a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    void m11183a(C1522d<K, V> c1522d, boolean z) {
        int i = 0;
        if (z) {
            c1522d.f7768e.f7767d = c1522d.f7767d;
            c1522d.f7767d.f7768e = c1522d.f7768e;
        }
        C1522d c1522d2 = c1522d.f7765b;
        C1522d c1522d3 = c1522d.f7766c;
        C1522d c1522d4 = c1522d.f7764a;
        if (c1522d2 == null || c1522d3 == null) {
            if (c1522d2 != null) {
                m11176a((C1522d) c1522d, c1522d2);
                c1522d.f7765b = null;
            } else if (c1522d3 != null) {
                m11176a((C1522d) c1522d, c1522d3);
                c1522d.f7766c = null;
            } else {
                m11176a((C1522d) c1522d, null);
            }
            m11179b(c1522d4, false);
            this.f7776c--;
            this.f7777d++;
            return;
        }
        int i2;
        c1522d2 = c1522d2.f7771h > c1522d3.f7771h ? c1522d2.m11174b() : c1522d3.m11173a();
        m11183a(c1522d2, false);
        c1522d4 = c1522d.f7765b;
        if (c1522d4 != null) {
            i2 = c1522d4.f7771h;
            c1522d2.f7765b = c1522d4;
            c1522d4.f7764a = c1522d2;
            c1522d.f7765b = null;
        } else {
            i2 = 0;
        }
        c1522d4 = c1522d.f7766c;
        if (c1522d4 != null) {
            i = c1522d4.f7771h;
            c1522d2.f7766c = c1522d4;
            c1522d4.f7764a = c1522d2;
            c1522d.f7766c = null;
        }
        c1522d2.f7771h = Math.max(i2, i) + 1;
        m11176a((C1522d) c1522d, c1522d2);
    }

    /* renamed from: b */
    C1522d<K, V> m11184b(Object obj) {
        C1522d a = m11180a(obj);
        if (a != null) {
            m11183a(a, true);
        }
        return a;
    }

    /* renamed from: a */
    private void m11176a(C1522d<K, V> c1522d, C1522d<K, V> c1522d2) {
        C1522d c1522d3 = c1522d.f7764a;
        c1522d.f7764a = null;
        if (c1522d2 != null) {
            c1522d2.f7764a = c1522d3;
        }
        if (c1522d3 == null) {
            this.f7775b = c1522d2;
        } else if (c1522d3.f7765b == c1522d) {
            c1522d3.f7765b = c1522d2;
        } else if (f7772f || c1522d3.f7766c == c1522d) {
            c1522d3.f7766c = c1522d2;
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    private void m11179b(C1522d<K, V> c1522d, boolean z) {
        C1522d c1522d2;
        while (c1522d2 != null) {
            int i;
            C1522d c1522d3 = c1522d2.f7765b;
            C1522d c1522d4 = c1522d2.f7766c;
            int i2 = c1522d3 != null ? c1522d3.f7771h : 0;
            if (c1522d4 != null) {
                i = c1522d4.f7771h;
            } else {
                i = 0;
            }
            int i3 = i2 - i;
            C1522d c1522d5;
            if (i3 == -2) {
                c1522d3 = c1522d4.f7765b;
                c1522d5 = c1522d4.f7766c;
                if (c1522d5 != null) {
                    i2 = c1522d5.f7771h;
                } else {
                    i2 = 0;
                }
                if (c1522d3 != null) {
                    i = c1522d3.f7771h;
                } else {
                    i = 0;
                }
                i -= i2;
                if (i == -1 || (i == 0 && !z)) {
                    m11175a(c1522d2);
                } else if (f7772f || i == 1) {
                    m11178b(c1522d4);
                    m11175a(c1522d2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                c1522d4 = c1522d3.f7765b;
                c1522d5 = c1522d3.f7766c;
                i2 = c1522d5 != null ? c1522d5.f7771h : 0;
                if (c1522d4 != null) {
                    i = c1522d4.f7771h;
                } else {
                    i = 0;
                }
                i -= i2;
                if (i == 1 || (i == 0 && !z)) {
                    m11178b(c1522d2);
                } else if (f7772f || i == -1) {
                    m11175a(c1522d3);
                    m11178b(c1522d2);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                c1522d2.f7771h = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f7772f || i3 == -1 || i3 == 1) {
                c1522d2.f7771h = Math.max(i2, i) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            c1522d2 = c1522d2.f7764a;
        }
    }

    /* renamed from: a */
    private void m11175a(C1522d<K, V> c1522d) {
        int i;
        int i2 = 0;
        C1522d c1522d2 = c1522d.f7765b;
        C1522d c1522d3 = c1522d.f7766c;
        C1522d c1522d4 = c1522d3.f7765b;
        C1522d c1522d5 = c1522d3.f7766c;
        c1522d.f7766c = c1522d4;
        if (c1522d4 != null) {
            c1522d4.f7764a = c1522d;
        }
        m11176a((C1522d) c1522d, c1522d3);
        c1522d3.f7765b = c1522d;
        c1522d.f7764a = c1522d3;
        if (c1522d2 != null) {
            i = c1522d2.f7771h;
        } else {
            i = 0;
        }
        c1522d.f7771h = Math.max(i, c1522d4 != null ? c1522d4.f7771h : 0) + 1;
        int i3 = c1522d.f7771h;
        if (c1522d5 != null) {
            i2 = c1522d5.f7771h;
        }
        c1522d3.f7771h = Math.max(i3, i2) + 1;
    }

    /* renamed from: b */
    private void m11178b(C1522d<K, V> c1522d) {
        int i;
        int i2 = 0;
        C1522d c1522d2 = c1522d.f7765b;
        C1522d c1522d3 = c1522d.f7766c;
        C1522d c1522d4 = c1522d2.f7765b;
        C1522d c1522d5 = c1522d2.f7766c;
        c1522d.f7765b = c1522d5;
        if (c1522d5 != null) {
            c1522d5.f7764a = c1522d;
        }
        m11176a((C1522d) c1522d, c1522d2);
        c1522d2.f7766c = c1522d;
        c1522d.f7764a = c1522d2;
        if (c1522d3 != null) {
            i = c1522d3.f7771h;
        } else {
            i = 0;
        }
        c1522d.f7771h = Math.max(i, c1522d5 != null ? c1522d5.f7771h : 0) + 1;
        int i3 = c1522d.f7771h;
        if (c1522d4 != null) {
            i2 = c1522d4.f7771h;
        }
        c1522d2.f7771h = Math.max(i3, i2) + 1;
    }

    public Set<Entry<K, V>> entrySet() {
        Set set = this.f7779h;
        if (set != null) {
            return set;
        }
        Set<Entry<K, V>> c1519a = new C1519a(this);
        this.f7779h = c1519a;
        return c1519a;
    }

    public Set<K> keySet() {
        Set set = this.f7780i;
        if (set != null) {
            return set;
        }
        Set<K> c1521b = new C1521b(this);
        this.f7780i = c1521b;
        return c1521b;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
}
