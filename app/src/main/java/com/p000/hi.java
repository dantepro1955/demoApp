package com.p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet */
/* renamed from: hi */
public final class hi<E> implements Collection<E>, Set<E> {
    /* renamed from: a */
    static Object[] f23785a;
    /* renamed from: b */
    static int f23786b;
    /* renamed from: c */
    static Object[] f23787c;
    /* renamed from: d */
    static int f23788d;
    /* renamed from: j */
    private static final int[] f23789j = new int[0];
    /* renamed from: k */
    private static final Object[] f23790k = new Object[0];
    /* renamed from: e */
    final boolean f23791e;
    /* renamed from: f */
    int[] f23792f;
    /* renamed from: g */
    Object[] f23793g;
    /* renamed from: h */
    int f23794h;
    /* renamed from: i */
    ho<E, E> f23795i;

    /* compiled from: ArraySet */
    /* renamed from: hi$1 */
    class C53631 extends ho<E, E> {
        /* renamed from: a */
        final /* synthetic */ hi f23784a;

        C53631(hi hiVar) {
            this.f23784a = hiVar;
        }

        /* renamed from: a */
        protected int mo4810a() {
            return this.f23784a.f23794h;
        }

        /* renamed from: a */
        protected Object mo4812a(int i, int i2) {
            return this.f23784a.f23793g[i];
        }

        /* renamed from: a */
        protected int mo4811a(Object obj) {
            return this.f23784a.m30575a(obj);
        }

        /* renamed from: b */
        protected int mo4816b(Object obj) {
            return this.f23784a.m30575a(obj);
        }

        /* renamed from: b */
        protected Map<E, E> mo4817b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo4815a(E e, E e2) {
            this.f23784a.add(e);
        }

        /* renamed from: a */
        protected E mo4813a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: a */
        protected void mo4814a(int i) {
            this.f23784a.m30578c(i);
        }

        /* renamed from: c */
        protected void mo4818c() {
            this.f23784a.clear();
        }
    }

    /* renamed from: a */
    private int m30571a(Object obj, int i) {
        int i2 = this.f23794h;
        if (i2 == 0) {
            return -1;
        }
        int a = hj.m30580a(this.f23792f, i2, i);
        if (a < 0 || obj.equals(this.f23793g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f23792f[i3] == i) {
            if (obj.equals(this.f23793g[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f23792f[a] == i) {
            if (obj.equals(this.f23793g[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private int m30570a() {
        int i = this.f23794h;
        if (i == 0) {
            return -1;
        }
        int a = hj.m30580a(this.f23792f, i, 0);
        if (a < 0 || this.f23793g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f23792f[i2] == 0) {
            if (this.f23793g[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f23792f[a] == 0) {
            if (this.f23793g[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: d */
    private void m30574d(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (hi.class) {
                if (f23787c != null) {
                    objArr = f23787c;
                    this.f23793g = objArr;
                    f23787c = (Object[]) objArr[0];
                    this.f23792f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23788d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (hi.class) {
                if (f23785a != null) {
                    objArr = f23785a;
                    this.f23793g = objArr;
                    f23785a = (Object[]) objArr[0];
                    this.f23792f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23786b--;
                    return;
                }
            }
        }
        this.f23792f = new int[i];
        this.f23793g = new Object[i];
    }

    /* renamed from: a */
    private static void m30572a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (hi.class) {
                if (f23788d < 10) {
                    objArr[0] = f23787c;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23787c = objArr;
                    f23788d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (hi.class) {
                if (f23786b < 10) {
                    objArr[0] = f23785a;
                    objArr[1] = iArr;
                    for (i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23785a = objArr;
                    f23786b++;
                }
            }
        }
    }

    public hi() {
        this(0, false);
    }

    public hi(int i, boolean z) {
        this.f23791e = z;
        if (i == 0) {
            this.f23792f = f23789j;
            this.f23793g = f23790k;
        } else {
            m30574d(i);
        }
        this.f23794h = 0;
    }

    public void clear() {
        if (this.f23794h != 0) {
            hi.m30572a(this.f23792f, this.f23793g, this.f23794h);
            this.f23792f = f23789j;
            this.f23793g = f23790k;
            this.f23794h = 0;
        }
    }

    /* renamed from: a */
    public void m30576a(int i) {
        if (this.f23792f.length < i) {
            Object obj = this.f23792f;
            Object obj2 = this.f23793g;
            m30574d(i);
            if (this.f23794h > 0) {
                System.arraycopy(obj, 0, this.f23792f, 0, this.f23794h);
                System.arraycopy(obj2, 0, this.f23793g, 0, this.f23794h);
            }
            hi.m30572a(obj, obj2, this.f23794h);
        }
    }

    public boolean contains(Object obj) {
        return m30575a(obj) >= 0;
    }

    /* renamed from: a */
    public int m30575a(Object obj) {
        if (obj == null) {
            return m30570a();
        }
        return m30571a(obj, this.f23791e ? System.identityHashCode(obj) : obj.hashCode());
    }

    /* renamed from: b */
    public E m30577b(int i) {
        return this.f23793g[i];
    }

    public boolean isEmpty() {
        return this.f23794h <= 0;
    }

    public boolean add(E e) {
        int a;
        int i;
        if (e == null) {
            a = m30570a();
            i = 0;
        } else {
            a = this.f23791e ? System.identityHashCode(e) : e.hashCode();
            i = a;
            a = m30571a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2 = a ^ -1;
        if (this.f23794h >= this.f23792f.length) {
            a = this.f23794h >= 8 ? this.f23794h + (this.f23794h >> 1) : this.f23794h >= 4 ? 8 : 4;
            Object obj = this.f23792f;
            Object obj2 = this.f23793g;
            m30574d(a);
            if (this.f23792f.length > 0) {
                System.arraycopy(obj, 0, this.f23792f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f23793g, 0, obj2.length);
            }
            hi.m30572a(obj, obj2, this.f23794h);
        }
        if (i2 < this.f23794h) {
            System.arraycopy(this.f23792f, i2, this.f23792f, i2 + 1, this.f23794h - i2);
            System.arraycopy(this.f23793g, i2, this.f23793g, i2 + 1, this.f23794h - i2);
        }
        this.f23792f[i2] = i;
        this.f23793g[i2] = e;
        this.f23794h++;
        return true;
    }

    public boolean remove(Object obj) {
        int a = m30575a(obj);
        if (a < 0) {
            return false;
        }
        m30578c(a);
        return true;
    }

    /* renamed from: c */
    public E m30578c(int i) {
        int i2 = 8;
        E e = this.f23793g[i];
        if (this.f23794h <= 1) {
            hi.m30572a(this.f23792f, this.f23793g, this.f23794h);
            this.f23792f = f23789j;
            this.f23793g = f23790k;
            this.f23794h = 0;
        } else if (this.f23792f.length <= 8 || this.f23794h >= this.f23792f.length / 3) {
            this.f23794h--;
            if (i < this.f23794h) {
                System.arraycopy(this.f23792f, i + 1, this.f23792f, i, this.f23794h - i);
                System.arraycopy(this.f23793g, i + 1, this.f23793g, i, this.f23794h - i);
            }
            this.f23793g[this.f23794h] = null;
        } else {
            if (this.f23794h > 8) {
                i2 = this.f23794h + (this.f23794h >> 1);
            }
            Object obj = this.f23792f;
            Object obj2 = this.f23793g;
            m30574d(i2);
            this.f23794h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f23792f, 0, i);
                System.arraycopy(obj2, 0, this.f23793g, 0, i);
            }
            if (i < this.f23794h) {
                System.arraycopy(obj, i + 1, this.f23792f, i, this.f23794h - i);
                System.arraycopy(obj2, i + 1, this.f23793g, i, this.f23794h - i);
            }
        }
        return e;
    }

    public int size() {
        return this.f23794h;
    }

    public Object[] toArray() {
        Object obj = new Object[this.f23794h];
        System.arraycopy(this.f23793g, 0, obj, 0, this.f23794h);
        return obj;
    }

    public <T> T[] toArray(T[] tArr) {
        Object obj;
        if (tArr.length < this.f23794h) {
            obj = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f23794h);
        } else {
            obj = tArr;
        }
        System.arraycopy(this.f23793g, 0, obj, 0, this.f23794h);
        if (obj.length > this.f23794h) {
            obj[this.f23794h] = null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f23794h) {
            try {
                if (!set.contains(m30577b(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int[] iArr = this.f23792f;
        int i2 = 0;
        while (i < this.f23794h) {
            i2 += iArr[i];
            i++;
        }
        return i2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f23794h * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.f23794h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            hi b = m30577b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: b */
    private ho<E, E> m30573b() {
        if (this.f23795i == null) {
            this.f23795i = new C53631(this);
        }
        return this.f23795i;
    }

    public Iterator<E> iterator() {
        return m30573b().m30536e().iterator();
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        m30576a(this.f23794h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f23794h - 1; i >= 0; i--) {
            if (!collection.contains(this.f23793g[i])) {
                m30578c(i);
                z = true;
            }
        }
        return z;
    }
}
