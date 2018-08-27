package com.p000;

import android.support.v7.widget.RecyclerView.C0605t;
import java.util.ArrayList;
import java.util.List;
import p000.hq.C3584a;
import p000.hq.C3585b;
import p000.pq.C5650a;

/* compiled from: AdapterHelper */
/* renamed from: oq */
public class oq implements C5650a {
    /* renamed from: a */
    final ArrayList<C5649b> f24962a;
    /* renamed from: b */
    final ArrayList<C5649b> f24963b;
    /* renamed from: c */
    final C5648a f24964c;
    /* renamed from: d */
    Runnable f24965d;
    /* renamed from: e */
    final boolean f24966e;
    /* renamed from: f */
    final pq f24967f;
    /* renamed from: g */
    private C3584a<C5649b> f24968g;
    /* renamed from: h */
    private int f24969h;

    /* compiled from: AdapterHelper */
    /* renamed from: oq$a */
    public interface C5648a {
        /* renamed from: a */
        C0605t m33287a(int i);

        /* renamed from: a */
        void m33288a(int i, int i2);

        /* renamed from: a */
        void m33289a(int i, int i2, Object obj);

        /* renamed from: a */
        void m33290a(C5649b c5649b);

        /* renamed from: b */
        void m33291b(int i, int i2);

        /* renamed from: b */
        void m33292b(C5649b c5649b);

        /* renamed from: c */
        void m33293c(int i, int i2);

        /* renamed from: d */
        void m33294d(int i, int i2);
    }

    /* compiled from: AdapterHelper */
    /* renamed from: oq$b */
    public static class C5649b {
        /* renamed from: a */
        public int f24958a;
        /* renamed from: b */
        public int f24959b;
        /* renamed from: c */
        public Object f24960c;
        /* renamed from: d */
        public int f24961d;

        C5649b(int i, int i2, int i3, Object obj) {
            this.f24958a = i;
            this.f24959b = i2;
            this.f24961d = i3;
            this.f24960c = obj;
        }

        /* renamed from: a */
        String m33295a() {
            switch (this.f24958a) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                case 4:
                    return "up";
                case 8:
                    return "mv";
                default:
                    return "??";
            }
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m33295a() + ",s:" + this.f24959b + "c:" + this.f24961d + ",p:" + this.f24960c + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C5649b c5649b = (C5649b) obj;
            if (this.f24958a != c5649b.f24958a) {
                return false;
            }
            if (this.f24958a == 8 && Math.abs(this.f24961d - this.f24959b) == 1 && this.f24961d == c5649b.f24959b && this.f24959b == c5649b.f24961d) {
                return true;
            }
            if (this.f24961d != c5649b.f24961d) {
                return false;
            }
            if (this.f24959b != c5649b.f24959b) {
                return false;
            }
            if (this.f24960c != null) {
                if (this.f24960c.equals(c5649b.f24960c)) {
                    return true;
                }
                return false;
            } else if (c5649b.f24960c != null) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            return (((this.f24958a * 31) + this.f24959b) * 31) + this.f24961d;
        }
    }

    public oq(C5648a c5648a) {
        this(c5648a, false);
    }

    oq(C5648a c5648a, boolean z) {
        this.f24968g = new C3585b(30);
        this.f24962a = new ArrayList();
        this.f24963b = new ArrayList();
        this.f24969h = 0;
        this.f24964c = c5648a;
        this.f24966e = z;
        this.f24967f = new pq(this);
    }

    /* renamed from: a */
    public void m33308a() {
        m33309a(this.f24962a);
        m33309a(this.f24963b);
        this.f24969h = 0;
    }

    /* renamed from: b */
    public void m33316b() {
        this.f24967f.m33645a(this.f24962a);
        int size = this.f24962a.size();
        for (int i = 0; i < size; i++) {
            C5649b c5649b = (C5649b) this.f24962a.get(i);
            switch (c5649b.f24958a) {
                case 1:
                    m33304f(c5649b);
                    break;
                case 2:
                    m33299c(c5649b);
                    break;
                case 4:
                    m33301d(c5649b);
                    break;
                case 8:
                    m33298b(c5649b);
                    break;
            }
            if (this.f24965d != null) {
                this.f24965d.run();
            }
        }
        this.f24962a.clear();
    }

    /* renamed from: c */
    public void m33319c() {
        int size = this.f24963b.size();
        for (int i = 0; i < size; i++) {
            this.f24964c.m33292b((C5649b) this.f24963b.get(i));
        }
        m33309a(this.f24963b);
        this.f24969h = 0;
    }

    /* renamed from: b */
    private void m33298b(C5649b c5649b) {
        m33305g(c5649b);
    }

    /* renamed from: c */
    private void m33299c(C5649b c5649b) {
        int i = c5649b.f24959b;
        int i2 = c5649b.f24959b + c5649b.f24961d;
        Object obj = -1;
        int i3 = c5649b.f24959b;
        int i4 = 0;
        while (i3 < i2) {
            Object obj2;
            int i5;
            if (this.f24964c.m33287a(i3) != null || m33302d(i3)) {
                if (obj == null) {
                    m33303e(mo5406a(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = 1;
            } else {
                if (obj == 1) {
                    m33305g(mo5406a(2, i, i4, null));
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                obj = null;
            }
            if (obj2 != null) {
                i5 = i3 - i4;
                i3 = i2 - i4;
                i2 = 1;
            } else {
                int i6 = i3;
                i3 = i2;
                i2 = i4 + 1;
                i5 = i6;
            }
            i4 = i2;
            i2 = i3;
            i3 = i5 + 1;
        }
        if (i4 != c5649b.f24961d) {
            mo5407a(c5649b);
            c5649b = mo5406a(2, i, i4, null);
        }
        if (obj == null) {
            m33303e(c5649b);
        } else {
            m33305g(c5649b);
        }
    }

    /* renamed from: d */
    private void m33301d(C5649b c5649b) {
        int i = c5649b.f24959b;
        int i2 = c5649b.f24959b + c5649b.f24961d;
        int i3 = c5649b.f24959b;
        Object obj = -1;
        int i4 = 0;
        while (i3 < i2) {
            int i5;
            Object obj2;
            if (this.f24964c.m33287a(i3) != null || m33302d(i3)) {
                if (obj == null) {
                    m33303e(mo5406a(4, i, i4, c5649b.f24960c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = 1;
            } else {
                if (obj == 1) {
                    m33305g(mo5406a(4, i, i4, c5649b.f24960c));
                    i4 = 0;
                    i = i3;
                }
                i5 = i;
                i = i4;
                obj2 = null;
            }
            i3++;
            Object obj3 = obj2;
            i4 = i + 1;
            i = i5;
            obj = obj3;
        }
        if (i4 != c5649b.f24961d) {
            Object obj4 = c5649b.f24960c;
            mo5407a(c5649b);
            c5649b = mo5406a(4, i, i4, obj4);
        }
        if (obj == null) {
            m33303e(c5649b);
        } else {
            m33305g(c5649b);
        }
    }

    /* renamed from: e */
    private void m33303e(C5649b c5649b) {
        if (c5649b.f24958a == 1 || c5649b.f24958a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int i;
        int d = m33300d(c5649b.f24959b, c5649b.f24958a);
        int i2 = c5649b.f24959b;
        switch (c5649b.f24958a) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + c5649b);
        }
        int i3 = 1;
        int i4 = d;
        d = i2;
        for (i2 = 1; i2 < c5649b.f24961d; i2++) {
            Object obj;
            int d2 = m33300d(c5649b.f24959b + (i * i2), c5649b.f24958a);
            int i5;
            switch (c5649b.f24958a) {
                case 2:
                    if (d2 != i4) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                case 4:
                    if (d2 != i4 + 1) {
                        obj = null;
                        break;
                    } else {
                        i5 = 1;
                        break;
                    }
                default:
                    obj = null;
                    break;
            }
            if (obj != null) {
                i3++;
            } else {
                C5649b a = mo5406a(c5649b.f24958a, i4, i3, c5649b.f24960c);
                m33311a(a, d);
                mo5407a(a);
                if (c5649b.f24958a == 4) {
                    d += i3;
                }
                i3 = 1;
                i4 = d2;
            }
        }
        Object obj2 = c5649b.f24960c;
        mo5407a(c5649b);
        if (i3 > 0) {
            C5649b a2 = mo5406a(c5649b.f24958a, i4, i3, obj2);
            m33311a(a2, d);
            mo5407a(a2);
        }
    }

    /* renamed from: a */
    void m33311a(C5649b c5649b, int i) {
        this.f24964c.m33290a(c5649b);
        switch (c5649b.f24958a) {
            case 2:
                this.f24964c.m33288a(i, c5649b.f24961d);
                return;
            case 4:
                this.f24964c.m33289a(i, c5649b.f24961d, c5649b.f24960c);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: d */
    private int m33300d(int i, int i2) {
        int i3;
        int i4 = i;
        for (int size = this.f24963b.size() - 1; size >= 0; size--) {
            C5649b c5649b = (C5649b) this.f24963b.get(size);
            if (c5649b.f24958a == 8) {
                int i5;
                int i6;
                if (c5649b.f24959b < c5649b.f24961d) {
                    i5 = c5649b.f24959b;
                    i3 = c5649b.f24961d;
                } else {
                    i5 = c5649b.f24961d;
                    i3 = c5649b.f24959b;
                }
                if (i4 < i5 || i4 > r2) {
                    if (i4 < c5649b.f24959b) {
                        if (i2 == 1) {
                            c5649b.f24959b++;
                            c5649b.f24961d++;
                            i6 = i4;
                        } else if (i2 == 2) {
                            c5649b.f24959b--;
                            c5649b.f24961d--;
                        }
                    }
                    i6 = i4;
                } else if (i5 == c5649b.f24959b) {
                    if (i2 == 1) {
                        c5649b.f24961d++;
                    } else if (i2 == 2) {
                        c5649b.f24961d--;
                    }
                    i6 = i4 + 1;
                } else {
                    if (i2 == 1) {
                        c5649b.f24959b++;
                    } else if (i2 == 2) {
                        c5649b.f24959b--;
                    }
                    i6 = i4 - 1;
                }
                i4 = i6;
            } else if (c5649b.f24959b <= i4) {
                if (c5649b.f24958a == 1) {
                    i4 -= c5649b.f24961d;
                } else if (c5649b.f24958a == 2) {
                    i4 += c5649b.f24961d;
                }
            } else if (i2 == 1) {
                c5649b.f24959b++;
            } else if (i2 == 2) {
                c5649b.f24959b--;
            }
        }
        for (i3 = this.f24963b.size() - 1; i3 >= 0; i3--) {
            c5649b = (C5649b) this.f24963b.get(i3);
            if (c5649b.f24958a == 8) {
                if (c5649b.f24961d == c5649b.f24959b || c5649b.f24961d < 0) {
                    this.f24963b.remove(i3);
                    mo5407a(c5649b);
                }
            } else if (c5649b.f24961d <= 0) {
                this.f24963b.remove(i3);
                mo5407a(c5649b);
            }
        }
        return i4;
    }

    /* renamed from: d */
    private boolean m33302d(int i) {
        int size = this.f24963b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C5649b c5649b = (C5649b) this.f24963b.get(i2);
            if (c5649b.f24958a == 8) {
                if (m33306a(c5649b.f24961d, i2 + 1) == i) {
                    return true;
                }
            } else if (c5649b.f24958a == 1) {
                int i3 = c5649b.f24959b + c5649b.f24961d;
                for (int i4 = c5649b.f24959b; i4 < i3; i4++) {
                    if (m33306a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m33304f(C5649b c5649b) {
        m33305g(c5649b);
    }

    /* renamed from: g */
    private void m33305g(C5649b c5649b) {
        this.f24963b.add(c5649b);
        switch (c5649b.f24958a) {
            case 1:
                this.f24964c.m33293c(c5649b.f24959b, c5649b.f24961d);
                return;
            case 2:
                this.f24964c.m33291b(c5649b.f24959b, c5649b.f24961d);
                return;
            case 4:
                this.f24964c.m33289a(c5649b.f24959b, c5649b.f24961d, c5649b.f24960c);
                return;
            case 8:
                this.f24964c.m33294d(c5649b.f24959b, c5649b.f24961d);
                return;
            default:
                throw new IllegalArgumentException("Unknown update op type for " + c5649b);
        }
    }

    /* renamed from: d */
    public boolean m33321d() {
        return this.f24962a.size() > 0;
    }

    /* renamed from: a */
    public boolean m33312a(int i) {
        return (this.f24969h & i) != 0;
    }

    /* renamed from: b */
    public int m33315b(int i) {
        return m33306a(i, 0);
    }

    /* renamed from: a */
    int m33306a(int i, int i2) {
        int size = this.f24963b.size();
        int i3 = i;
        while (i2 < size) {
            C5649b c5649b = (C5649b) this.f24963b.get(i2);
            if (c5649b.f24958a == 8) {
                if (c5649b.f24959b == i3) {
                    i3 = c5649b.f24961d;
                } else {
                    if (c5649b.f24959b < i3) {
                        i3--;
                    }
                    if (c5649b.f24961d <= i3) {
                        i3++;
                    }
                }
            } else if (c5649b.f24959b > i3) {
                continue;
            } else if (c5649b.f24958a == 2) {
                if (i3 < c5649b.f24959b + c5649b.f24961d) {
                    return -1;
                }
                i3 -= c5649b.f24961d;
            } else if (c5649b.f24958a == 1) {
                i3 += c5649b.f24961d;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public boolean m33314a(int i, int i2, Object obj) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f24962a.add(mo5406a(4, i, i2, obj));
        this.f24969h |= 4;
        if (this.f24962a.size() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public boolean m33317b(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f24962a.add(mo5406a(1, i, i2, null));
        this.f24969h |= 1;
        if (this.f24962a.size() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public boolean m33320c(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f24962a.add(mo5406a(2, i, i2, null));
        this.f24969h |= 2;
        if (this.f24962a.size() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m33313a(int i, int i2, int i3) {
        boolean z = true;
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f24962a.add(mo5406a(8, i, i2, null));
        this.f24969h |= 8;
        if (this.f24962a.size() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    public void m33322e() {
        m33319c();
        int size = this.f24962a.size();
        for (int i = 0; i < size; i++) {
            C5649b c5649b = (C5649b) this.f24962a.get(i);
            switch (c5649b.f24958a) {
                case 1:
                    this.f24964c.m33292b(c5649b);
                    this.f24964c.m33293c(c5649b.f24959b, c5649b.f24961d);
                    break;
                case 2:
                    this.f24964c.m33292b(c5649b);
                    this.f24964c.m33288a(c5649b.f24959b, c5649b.f24961d);
                    break;
                case 4:
                    this.f24964c.m33292b(c5649b);
                    this.f24964c.m33289a(c5649b.f24959b, c5649b.f24961d, c5649b.f24960c);
                    break;
                case 8:
                    this.f24964c.m33292b(c5649b);
                    this.f24964c.m33294d(c5649b.f24959b, c5649b.f24961d);
                    break;
            }
            if (this.f24965d != null) {
                this.f24965d.run();
            }
        }
        m33309a(this.f24962a);
        this.f24969h = 0;
    }

    /* renamed from: c */
    public int m33318c(int i) {
        int size = this.f24962a.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            C5649b c5649b = (C5649b) this.f24962a.get(i3);
            switch (c5649b.f24958a) {
                case 1:
                    if (c5649b.f24959b > i2) {
                        break;
                    }
                    i2 += c5649b.f24961d;
                    break;
                case 2:
                    if (c5649b.f24959b <= i2) {
                        if (c5649b.f24959b + c5649b.f24961d <= i2) {
                            i2 -= c5649b.f24961d;
                            break;
                        }
                        return -1;
                    }
                    continue;
                case 8:
                    if (c5649b.f24959b != i2) {
                        if (c5649b.f24959b < i2) {
                            i2--;
                        }
                        if (c5649b.f24961d > i2) {
                            break;
                        }
                        i2++;
                        break;
                    }
                    i2 = c5649b.f24961d;
                    break;
                default:
                    break;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public boolean m33323f() {
        return (this.f24963b.isEmpty() || this.f24962a.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public C5649b mo5406a(int i, int i2, int i3, Object obj) {
        C5649b c5649b = (C5649b) this.f24968g.a();
        if (c5649b == null) {
            return new C5649b(i, i2, i3, obj);
        }
        c5649b.f24958a = i;
        c5649b.f24959b = i2;
        c5649b.f24961d = i3;
        c5649b.f24960c = obj;
        return c5649b;
    }

    /* renamed from: a */
    public void mo5407a(C5649b c5649b) {
        if (!this.f24966e) {
            c5649b.f24960c = null;
            this.f24968g.a(c5649b);
        }
    }

    /* renamed from: a */
    void m33309a(List<C5649b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5407a((C5649b) list.get(i));
        }
        list.clear();
    }
}
