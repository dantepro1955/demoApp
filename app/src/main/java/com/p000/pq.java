package com.p000;

import java.util.List;
import p000.oq.C5649b;

/* compiled from: OpReorderer */
/* renamed from: pq */
class pq {
    /* renamed from: a */
    final C5650a f25116a;

    /* compiled from: OpReorderer */
    /* renamed from: pq$a */
    interface C5650a {
        /* renamed from: a */
        C5649b mo5406a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo5407a(C5649b c5649b);
    }

    public pq(C5650a c5650a) {
        this.f25116a = c5650a;
    }

    /* renamed from: a */
    void m33645a(List<C5649b> list) {
        while (true) {
            int b = m33643b(list);
            if (b != -1) {
                m33642a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m33642a(List<C5649b> list, int i, int i2) {
        C5649b c5649b = (C5649b) list.get(i);
        C5649b c5649b2 = (C5649b) list.get(i2);
        switch (c5649b2.f24958a) {
            case 1:
                m33644c(list, i, c5649b, i2, c5649b2);
                return;
            case 2:
                m33646a(list, i, c5649b, i2, c5649b2);
                return;
            case 4:
                m33647b(list, i, c5649b, i2, c5649b2);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    void m33646a(List<C5649b> list, int i, C5649b c5649b, int i2, C5649b c5649b2) {
        int i3;
        C5649b c5649b3;
        int i4 = 0;
        if (c5649b.f24959b < c5649b.f24961d) {
            i3 = (c5649b2.f24959b == c5649b.f24959b && c5649b2.f24961d == c5649b.f24961d - c5649b.f24959b) ? 1 : 0;
        } else if (c5649b2.f24959b == c5649b.f24961d + 1 && c5649b2.f24961d == c5649b.f24959b - c5649b.f24961d) {
            i4 = 1;
            i3 = 1;
        } else {
            i3 = 0;
            i4 = 1;
        }
        if (c5649b.f24961d < c5649b2.f24959b) {
            c5649b2.f24959b--;
        } else if (c5649b.f24961d < c5649b2.f24959b + c5649b2.f24961d) {
            c5649b2.f24961d--;
            c5649b.f24958a = 2;
            c5649b.f24961d = 1;
            if (c5649b2.f24961d == 0) {
                list.remove(i2);
                this.f25116a.mo5407a(c5649b2);
                return;
            }
            return;
        }
        if (c5649b.f24959b <= c5649b2.f24959b) {
            c5649b2.f24959b++;
            c5649b3 = null;
        } else if (c5649b.f24959b < c5649b2.f24959b + c5649b2.f24961d) {
            c5649b3 = this.f25116a.mo5406a(2, c5649b.f24959b + 1, (c5649b2.f24959b + c5649b2.f24961d) - c5649b.f24959b, null);
            c5649b2.f24961d = c5649b.f24959b - c5649b2.f24959b;
        } else {
            c5649b3 = null;
        }
        if (i3 != 0) {
            list.set(i, c5649b2);
            list.remove(i2);
            this.f25116a.mo5407a(c5649b);
            return;
        }
        if (i4 != 0) {
            if (c5649b3 != null) {
                if (c5649b.f24959b > c5649b3.f24959b) {
                    c5649b.f24959b -= c5649b3.f24961d;
                }
                if (c5649b.f24961d > c5649b3.f24959b) {
                    c5649b.f24961d -= c5649b3.f24961d;
                }
            }
            if (c5649b.f24959b > c5649b2.f24959b) {
                c5649b.f24959b -= c5649b2.f24961d;
            }
            if (c5649b.f24961d > c5649b2.f24959b) {
                c5649b.f24961d -= c5649b2.f24961d;
            }
        } else {
            if (c5649b3 != null) {
                if (c5649b.f24959b >= c5649b3.f24959b) {
                    c5649b.f24959b -= c5649b3.f24961d;
                }
                if (c5649b.f24961d >= c5649b3.f24959b) {
                    c5649b.f24961d -= c5649b3.f24961d;
                }
            }
            if (c5649b.f24959b >= c5649b2.f24959b) {
                c5649b.f24959b -= c5649b2.f24961d;
            }
            if (c5649b.f24961d >= c5649b2.f24959b) {
                c5649b.f24961d -= c5649b2.f24961d;
            }
        }
        list.set(i, c5649b2);
        if (c5649b.f24959b != c5649b.f24961d) {
            list.set(i2, c5649b);
        } else {
            list.remove(i2);
        }
        if (c5649b3 != null) {
            list.add(i, c5649b3);
        }
    }

    /* renamed from: c */
    private void m33644c(List<C5649b> list, int i, C5649b c5649b, int i2, C5649b c5649b2) {
        int i3 = 0;
        if (c5649b.f24961d < c5649b2.f24959b) {
            i3 = -1;
        }
        if (c5649b.f24959b < c5649b2.f24959b) {
            i3++;
        }
        if (c5649b2.f24959b <= c5649b.f24959b) {
            c5649b.f24959b += c5649b2.f24961d;
        }
        if (c5649b2.f24959b <= c5649b.f24961d) {
            c5649b.f24961d += c5649b2.f24961d;
        }
        c5649b2.f24959b = i3 + c5649b2.f24959b;
        list.set(i, c5649b2);
        list.set(i2, c5649b);
    }

    /* renamed from: b */
    void m33647b(List<C5649b> list, int i, C5649b c5649b, int i2, C5649b c5649b2) {
        Object obj;
        Object obj2 = null;
        if (c5649b.f24961d < c5649b2.f24959b) {
            c5649b2.f24959b--;
            obj = null;
        } else if (c5649b.f24961d < c5649b2.f24959b + c5649b2.f24961d) {
            c5649b2.f24961d--;
            obj = this.f25116a.mo5406a(4, c5649b.f24959b, 1, c5649b2.f24960c);
        } else {
            obj = null;
        }
        if (c5649b.f24959b <= c5649b2.f24959b) {
            c5649b2.f24959b++;
        } else if (c5649b.f24959b < c5649b2.f24959b + c5649b2.f24961d) {
            int i3 = (c5649b2.f24959b + c5649b2.f24961d) - c5649b.f24959b;
            obj2 = this.f25116a.mo5406a(4, c5649b.f24959b + 1, i3, c5649b2.f24960c);
            c5649b2.f24961d -= i3;
        }
        list.set(i2, c5649b);
        if (c5649b2.f24961d > 0) {
            list.set(i, c5649b2);
        } else {
            list.remove(i);
            this.f25116a.mo5407a(c5649b2);
        }
        if (obj != null) {
            list.add(i, obj);
        }
        if (obj2 != null) {
            list.add(i, obj2);
        }
    }

    /* renamed from: b */
    private int m33643b(List<C5649b> list) {
        Object obj = null;
        int size = list.size() - 1;
        while (size >= 0) {
            Object obj2;
            if (((C5649b) list.get(size)).f24958a != 8) {
                obj2 = 1;
            } else if (obj != null) {
                return size;
            } else {
                obj2 = obj;
            }
            size--;
            obj = obj2;
        }
        return -1;
    }
}
