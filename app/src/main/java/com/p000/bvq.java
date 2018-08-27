package com.p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: MapTypeAdapterFactory */
/* renamed from: bvq */
public final class bvq implements but {
    /* renamed from: a */
    final boolean f7843a;
    /* renamed from: b */
    private final bvb f7844b;

    /* compiled from: MapTypeAdapterFactory */
    /* renamed from: bvq$a */
    final class C1534a<K, V> extends bus<Map<K, V>> {
        /* renamed from: a */
        final /* synthetic */ bvq f7839a;
        /* renamed from: b */
        private final bus<K> f7840b;
        /* renamed from: c */
        private final bus<V> f7841c;
        /* renamed from: d */
        private final bvg<? extends Map<K, V>> f7842d;

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11315a(bwa);
        }

        public C1534a(bvq bvq, bub bub, Type type, bus<K> bus, Type type2, bus<V> bus2, bvg<? extends Map<K, V>> bvg) {
            this.f7839a = bvq;
            this.f7840b = new bvw(bub, bus, type);
            this.f7841c = new bvw(bub, bus2, type2);
            this.f7842d = bvg;
        }

        /* renamed from: a */
        public Map<K, V> m11315a(bwa bwa) throws IOException {
            bwb f = bwa.mo1554f();
            if (f == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            Map<K, V> map = (Map) this.f7842d.mo1545a();
            Object b;
            if (f == bwb.BEGIN_ARRAY) {
                bwa.mo1548a();
                while (bwa.mo1553e()) {
                    bwa.mo1548a();
                    b = this.f7840b.mo1537b(bwa);
                    if (map.put(b, this.f7841c.mo1537b(bwa)) != null) {
                        throw new buq("duplicate key: " + b);
                    }
                    bwa.mo1549b();
                }
                bwa.mo1549b();
                return map;
            }
            bwa.mo1550c();
            while (bwa.mo1553e()) {
                bvd.f7754a.mo1583a(bwa);
                b = this.f7840b.mo1537b(bwa);
                if (map.put(b, this.f7841c.mo1537b(bwa)) != null) {
                    throw new buq("duplicate key: " + b);
                }
            }
            bwa.mo1552d();
            return map;
        }

        /* renamed from: a */
        public void m11317a(bwc bwc, Map<K, V> map) throws IOException {
            int i = 0;
            if (map == null) {
                bwc.mo1578f();
            } else if (this.f7839a.f7843a) {
                List arrayList = new ArrayList(map.size());
                List arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                for (Entry entry : map.entrySet()) {
                    int i3;
                    buh a = this.f7840b.m11006a(entry.getKey());
                    arrayList.add(a);
                    arrayList2.add(entry.getValue());
                    if (a.m11068h() || a.m11069i()) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    i2 = i3 | i2;
                }
                if (i2 != 0) {
                    bwc.mo1572b();
                    while (i < arrayList.size()) {
                        bwc.mo1572b();
                        bvi.m11190a((buh) arrayList.get(i), bwc);
                        this.f7841c.mo1536a(bwc, arrayList2.get(i));
                        bwc.mo1574c();
                        i++;
                    }
                    bwc.mo1574c();
                    return;
                }
                bwc.mo1576d();
                while (i < arrayList.size()) {
                    bwc.mo1570a(m11314a((buh) arrayList.get(i)));
                    this.f7841c.mo1536a(bwc, arrayList2.get(i));
                    i++;
                }
                bwc.mo1577e();
            } else {
                bwc.mo1576d();
                for (Entry entry2 : map.entrySet()) {
                    bwc.mo1570a(String.valueOf(entry2.getKey()));
                    this.f7841c.mo1536a(bwc, entry2.getValue());
                }
                bwc.mo1577e();
            }
        }

        /* renamed from: a */
        private String m11314a(buh buh) {
            if (buh.m11070j()) {
                bun n = buh.m11074n();
                if (n.m11103p()) {
                    return String.valueOf(n.mo1538b());
                }
                if (n.m11095a()) {
                    return Boolean.toString(n.mo1543g());
                }
                if (n.m11104q()) {
                    return n.mo1539c();
                }
                throw new AssertionError();
            } else if (buh.m11071k()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }
    }

    public bvq(bvb bvb, boolean z) {
        this.f7844b = bvb;
        this.f7843a = z;
    }

    /* renamed from: a */
    public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
        Type b = bvz.m11005b();
        if (!Map.class.isAssignableFrom(bvz.m11004a())) {
            return null;
        }
        Type[] b2 = bva.m11130b(b, bva.m11133e(b));
        bus a = m11319a(bub, b2[0]);
        bus a2 = bub.m11041a(bvz.m11001a(b2[1]));
        bvg a3 = this.f7844b.m11155a((bvz) bvz);
        return new C1534a(this, bub, b2[0], a, b2[1], a2, a3);
    }

    /* renamed from: a */
    private bus<?> m11319a(bub bub, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return bvx.f7934f;
        }
        return bub.m11041a(bvz.m11001a(type));
    }
}
