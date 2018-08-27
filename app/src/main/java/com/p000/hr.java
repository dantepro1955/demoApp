package com.p000;

import java.util.Map;

/* compiled from: SimpleArrayMap */
/* renamed from: hr */
public class hr<K, V> {
    /* renamed from: b */
    static Object[] f23776b;
    /* renamed from: c */
    static int f23777c;
    /* renamed from: d */
    static Object[] f23778d;
    /* renamed from: e */
    static int f23779e;
    /* renamed from: f */
    int[] f23780f;
    /* renamed from: g */
    Object[] f23781g;
    /* renamed from: h */
    int f23782h;

    /* renamed from: a */
    int m30551a(Object obj, int i) {
        int i2 = this.f23782h;
        if (i2 == 0) {
            return -1;
        }
        int a = hj.m30580a(this.f23780f, i2, i);
        if (a < 0 || obj.equals(this.f23781g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f23780f[i3] == i) {
            if (obj.equals(this.f23781g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.f23780f[a] == i) {
            if (obj.equals(this.f23781g[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    int m30549a() {
        int i = this.f23782h;
        if (i == 0) {
            return -1;
        }
        int a = hj.m30580a(this.f23780f, i, 0);
        if (a < 0 || this.f23781g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f23780f[i2] == 0) {
            if (this.f23781g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.f23780f[a] == 0) {
            if (this.f23781g[a << 1] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    /* renamed from: e */
    private void m30548e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (hh.class) {
                if (f23778d != null) {
                    objArr = f23778d;
                    this.f23781g = objArr;
                    f23778d = (Object[]) objArr[0];
                    this.f23780f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23779e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (hh.class) {
                if (f23776b != null) {
                    objArr = f23776b;
                    this.f23781g = objArr;
                    f23776b = (Object[]) objArr[0];
                    this.f23780f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f23777c--;
                    return;
                }
            }
        }
        this.f23780f = new int[i];
        this.f23781g = new Object[(i << 1)];
    }

    /* renamed from: a */
    private static void m30547a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (hh.class) {
                if (f23779e < 10) {
                    objArr[0] = f23778d;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23778d = objArr;
                    f23779e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (hh.class) {
                if (f23777c < 10) {
                    objArr[0] = f23776b;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f23776b = objArr;
                    f23777c++;
                }
            }
        }
    }

    public hr() {
        this.f23780f = hj.f23796a;
        this.f23781g = hj.f23798c;
        this.f23782h = 0;
    }

    public hr(int i) {
        if (i == 0) {
            this.f23780f = hj.f23796a;
            this.f23781g = hj.f23798c;
        } else {
            m30548e(i);
        }
        this.f23782h = 0;
    }

    public hr(hr hrVar) {
        this();
        if (hrVar != null) {
            m30554a(hrVar);
        }
    }

    public void clear() {
        if (this.f23782h != 0) {
            hr.m30547a(this.f23780f, this.f23781g, this.f23782h);
            this.f23780f = hj.f23796a;
            this.f23781g = hj.f23798c;
            this.f23782h = 0;
        }
    }

    /* renamed from: a */
    public void m30553a(int i) {
        if (this.f23780f.length < i) {
            Object obj = this.f23780f;
            Object obj2 = this.f23781g;
            m30548e(i);
            if (this.f23782h > 0) {
                System.arraycopy(obj, 0, this.f23780f, 0, this.f23782h);
                System.arraycopy(obj2, 0, this.f23781g, 0, this.f23782h << 1);
            }
            hr.m30547a(obj, obj2, this.f23782h);
        }
    }

    public boolean containsKey(Object obj) {
        return m30550a(obj) >= 0;
    }

    /* renamed from: a */
    public int m30550a(Object obj) {
        return obj == null ? m30549a() : m30551a(obj, obj.hashCode());
    }

    /* renamed from: b */
    int m30555b(Object obj) {
        int i = 1;
        int i2 = this.f23782h * 2;
        Object[] objArr = this.f23781g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return m30555b(obj) >= 0;
    }

    public V get(Object obj) {
        int a = m30550a(obj);
        return a >= 0 ? this.f23781g[(a << 1) + 1] : null;
    }

    /* renamed from: b */
    public K m30556b(int i) {
        return this.f23781g[i << 1];
    }

    /* renamed from: c */
    public V m30557c(int i) {
        return this.f23781g[(i << 1) + 1];
    }

    /* renamed from: a */
    public V m30552a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f23781g[i2];
        this.f23781g[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.f23782h <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = 8;
        if (k == null) {
            a = m30549a();
            i = 0;
        } else {
            i = k.hashCode();
            a = m30551a((Object) k, i);
        }
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            V v2 = this.f23781g[i3];
            this.f23781g[i3] = v;
            return v2;
        }
        a ^= -1;
        if (this.f23782h >= this.f23780f.length) {
            if (this.f23782h >= 8) {
                i2 = this.f23782h + (this.f23782h >> 1);
            } else if (this.f23782h < 4) {
                i2 = 4;
            }
            Object obj = this.f23780f;
            Object obj2 = this.f23781g;
            m30548e(i2);
            if (this.f23780f.length > 0) {
                System.arraycopy(obj, 0, this.f23780f, 0, obj.length);
                System.arraycopy(obj2, 0, this.f23781g, 0, obj2.length);
            }
            hr.m30547a(obj, obj2, this.f23782h);
        }
        if (a < this.f23782h) {
            System.arraycopy(this.f23780f, a, this.f23780f, a + 1, this.f23782h - a);
            System.arraycopy(this.f23781g, a << 1, this.f23781g, (a + 1) << 1, (this.f23782h - a) << 1);
        }
        this.f23780f[a] = i;
        this.f23781g[a << 1] = k;
        this.f23781g[(a << 1) + 1] = v;
        this.f23782h++;
        return null;
    }

    /* renamed from: a */
    public void m30554a(hr<? extends K, ? extends V> hrVar) {
        int i = 0;
        int i2 = hrVar.f23782h;
        m30553a(this.f23782h + i2);
        if (this.f23782h != 0) {
            while (i < i2) {
                put(hrVar.m30556b(i), hrVar.m30557c(i));
                i++;
            }
        } else if (i2 > 0) {
            System.arraycopy(hrVar.f23780f, 0, this.f23780f, 0, i2);
            System.arraycopy(hrVar.f23781g, 0, this.f23781g, 0, i2 << 1);
            this.f23782h = i2;
        }
    }

    public V remove(Object obj) {
        int a = m30550a(obj);
        if (a >= 0) {
            return m30558d(a);
        }
        return null;
    }

    /* renamed from: d */
    public V m30558d(int i) {
        int i2 = 8;
        V v = this.f23781g[(i << 1) + 1];
        if (this.f23782h <= 1) {
            hr.m30547a(this.f23780f, this.f23781g, this.f23782h);
            this.f23780f = hj.f23796a;
            this.f23781g = hj.f23798c;
            this.f23782h = 0;
        } else if (this.f23780f.length <= 8 || this.f23782h >= this.f23780f.length / 3) {
            this.f23782h--;
            if (i < this.f23782h) {
                System.arraycopy(this.f23780f, i + 1, this.f23780f, i, this.f23782h - i);
                System.arraycopy(this.f23781g, (i + 1) << 1, this.f23781g, i << 1, (this.f23782h - i) << 1);
            }
            this.f23781g[this.f23782h << 1] = null;
            this.f23781g[(this.f23782h << 1) + 1] = null;
        } else {
            if (this.f23782h > 8) {
                i2 = this.f23782h + (this.f23782h >> 1);
            }
            Object obj = this.f23780f;
            Object obj2 = this.f23781g;
            m30548e(i2);
            this.f23782h--;
            if (i > 0) {
                System.arraycopy(obj, 0, this.f23780f, 0, i);
                System.arraycopy(obj2, 0, this.f23781g, 0, i << 1);
            }
            if (i < this.f23782h) {
                System.arraycopy(obj, i + 1, this.f23780f, i, this.f23782h - i);
                System.arraycopy(obj2, (i + 1) << 1, this.f23781g, i << 1, (this.f23782h - i) << 1);
            }
        }
        return v;
    }

    public int size() {
        return this.f23782h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof hr) {
            hr hrVar = (hr) obj;
            if (size() != hrVar.size()) {
                return false;
            }
            i = 0;
            while (i < this.f23782h) {
                try {
                    b = m30556b(i);
                    c = m30557c(i);
                    obj2 = hrVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !hrVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.f23782h) {
                try {
                    b = m30556b(i);
                    c = m30557c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public int hashCode() {
        int[] iArr = this.f23780f;
        Object[] objArr = this.f23781g;
        int i = this.f23782h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.f23782h * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.f23782h; i++) {
            if (i > 0) {
                stringBuilder.append(", ");
            }
            hr b = m30556b(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
            stringBuilder.append('=');
            b = m30557c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append("(this Map)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
