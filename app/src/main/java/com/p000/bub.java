package com.p000;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson */
/* renamed from: bub */
public final class bub {
    /* renamed from: a */
    private static final bvz<?> f7672a = new C14931();
    /* renamed from: b */
    private final ThreadLocal<Map<bvz<?>, C1499a<?>>> f7673b;
    /* renamed from: c */
    private final Map<bvz<?>, bus<?>> f7674c;
    /* renamed from: d */
    private final List<but> f7675d;
    /* renamed from: e */
    private final bvb f7676e;
    /* renamed from: f */
    private final bvc f7677f;
    /* renamed from: g */
    private final bua f7678g;
    /* renamed from: h */
    private final boolean f7679h;
    /* renamed from: i */
    private final boolean f7680i;
    /* renamed from: j */
    private final boolean f7681j;
    /* renamed from: k */
    private final boolean f7682k;
    /* renamed from: l */
    private final boolean f7683l;
    /* renamed from: m */
    private final bvn f7684m;

    /* compiled from: Gson */
    /* renamed from: bub$1 */
    static class C14931 extends bvz<Object> {
        C14931() {
        }
    }

    /* compiled from: Gson */
    /* renamed from: bub$2 */
    class C14942 extends bus<Number> {
        /* renamed from: a */
        final /* synthetic */ bub f7667a;

        C14942(bub bub) {
            this.f7667a = bub;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11010a(bwa);
        }

        /* renamed from: a */
        public Double m11010a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Double.valueOf(bwa.mo1559k());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11011a(bwc bwc, Number number) throws IOException {
            if (number == null) {
                bwc.mo1578f();
                return;
            }
            bub.m11036a(number.doubleValue());
            bwc.mo1569a(number);
        }
    }

    /* compiled from: Gson */
    /* renamed from: bub$3 */
    class C14953 extends bus<Number> {
        /* renamed from: a */
        final /* synthetic */ bub f7668a;

        C14953(bub bub) {
            this.f7668a = bub;
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11014a(bwa);
        }

        /* renamed from: a */
        public Float m11014a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Float.valueOf((float) bwa.mo1559k());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11015a(bwc bwc, Number number) throws IOException {
            if (number == null) {
                bwc.mo1578f();
                return;
            }
            bub.m11036a((double) number.floatValue());
            bwc.mo1569a(number);
        }
    }

    /* compiled from: Gson */
    /* renamed from: bub$4 */
    static class C14964 extends bus<Number> {
        C14964() {
        }

        /* renamed from: b */
        public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
            return m11018a(bwa);
        }

        /* renamed from: a */
        public Number m11018a(bwa bwa) throws IOException {
            if (bwa.mo1554f() != bwb.NULL) {
                return Long.valueOf(bwa.mo1560l());
            }
            bwa.mo1558j();
            return null;
        }

        /* renamed from: a */
        public void m11019a(bwc bwc, Number number) throws IOException {
            if (number == null) {
                bwc.mo1578f();
            } else {
                bwc.mo1573b(number.toString());
            }
        }
    }

    /* compiled from: Gson */
    /* renamed from: bub$a */
    static class C1499a<T> extends bus<T> {
        /* renamed from: a */
        private bus<T> f7671a;

        C1499a() {
        }

        /* renamed from: a */
        public void m11030a(bus<T> bus) {
            if (this.f7671a != null) {
                throw new AssertionError();
            }
            this.f7671a = bus;
        }

        /* renamed from: b */
        public T mo1537b(bwa bwa) throws IOException {
            if (this.f7671a != null) {
                return this.f7671a.mo1537b(bwa);
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public void mo1536a(bwc bwc, T t) throws IOException {
            if (this.f7671a == null) {
                throw new IllegalStateException();
            }
            this.f7671a.mo1536a(bwc, t);
        }
    }

    public bub() {
        this(bvc.f7747a, btz.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, bur.DEFAULT, Collections.emptyList());
    }

    bub(bvc bvc, bua bua, Map<Type, bud<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, bur bur, List<but> list) {
        this.f7673b = new ThreadLocal();
        this.f7674c = new ConcurrentHashMap();
        this.f7676e = new bvb(map);
        this.f7677f = bvc;
        this.f7678g = bua;
        this.f7679h = z;
        this.f7681j = z3;
        this.f7680i = z4;
        this.f7682k = z5;
        this.f7683l = z6;
        List arrayList = new ArrayList();
        arrayList.add(bvx.f7927Y);
        arrayList.add(bvr.f7846a);
        arrayList.add(bvc);
        arrayList.addAll(list);
        arrayList.add(bvx.f7906D);
        arrayList.add(bvx.f7941m);
        arrayList.add(bvx.f7935g);
        arrayList.add(bvx.f7937i);
        arrayList.add(bvx.f7939k);
        bus a = bub.m11033a(bur);
        arrayList.add(bvx.m11488a(Long.TYPE, Long.class, a));
        arrayList.add(bvx.m11488a(Double.TYPE, Double.class, m11035a(z7)));
        arrayList.add(bvx.m11488a(Float.TYPE, Float.class, m11039b(z7)));
        arrayList.add(bvx.f7952x);
        arrayList.add(bvx.f7943o);
        arrayList.add(bvx.f7945q);
        arrayList.add(bvx.m11487a(AtomicLong.class, bub.m11034a(a)));
        arrayList.add(bvx.m11487a(AtomicLongArray.class, bub.m11038b(a)));
        arrayList.add(bvx.f7947s);
        arrayList.add(bvx.f7954z);
        arrayList.add(bvx.f7908F);
        arrayList.add(bvx.f7910H);
        arrayList.add(bvx.m11487a(BigDecimal.class, bvx.f7904B));
        arrayList.add(bvx.m11487a(BigInteger.class, bvx.f7905C));
        arrayList.add(bvx.f7912J);
        arrayList.add(bvx.f7914L);
        arrayList.add(bvx.f7918P);
        arrayList.add(bvx.f7920R);
        arrayList.add(bvx.f7925W);
        arrayList.add(bvx.f7916N);
        arrayList.add(bvx.f7932d);
        arrayList.add(bvm.f7797a);
        arrayList.add(bvx.f7923U);
        arrayList.add(bvu.f7866a);
        arrayList.add(bvt.f7864a);
        arrayList.add(bvx.f7921S);
        arrayList.add(bvk.f7791a);
        arrayList.add(bvx.f7930b);
        arrayList.add(new bvl(this.f7676e));
        arrayList.add(new bvq(this.f7676e, z2));
        this.f7684m = new bvn(this.f7676e);
        arrayList.add(this.f7684m);
        arrayList.add(bvx.f7928Z);
        arrayList.add(new bvs(this.f7676e, bua, bvc, this.f7684m));
        this.f7675d = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private bus<Number> m11035a(boolean z) {
        if (z) {
            return bvx.f7950v;
        }
        return new C14942(this);
    }

    /* renamed from: b */
    private bus<Number> m11039b(boolean z) {
        if (z) {
            return bvx.f7949u;
        }
        return new C14953(this);
    }

    /* renamed from: a */
    static void m11036a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this" + " behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: a */
    private static bus<Number> m11033a(bur bur) {
        if (bur == bur.DEFAULT) {
            return bvx.f7948t;
        }
        return new C14964();
    }

    /* renamed from: a */
    private static bus<AtomicLong> m11034a(final bus<Number> bus) {
        return new bus<AtomicLong>() {
            /* renamed from: b */
            public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
                return m11022a(bwa);
            }

            /* renamed from: a */
            public void m11024a(bwc bwc, AtomicLong atomicLong) throws IOException {
                bus.mo1536a(bwc, Long.valueOf(atomicLong.get()));
            }

            /* renamed from: a */
            public AtomicLong m11022a(bwa bwa) throws IOException {
                return new AtomicLong(((Number) bus.mo1537b(bwa)).longValue());
            }
        }.m11007a();
    }

    /* renamed from: b */
    private static bus<AtomicLongArray> m11038b(final bus<Number> bus) {
        return new bus<AtomicLongArray>() {
            /* renamed from: b */
            public /* synthetic */ Object mo1537b(bwa bwa) throws IOException {
                return m11026a(bwa);
            }

            /* renamed from: a */
            public void m11028a(bwc bwc, AtomicLongArray atomicLongArray) throws IOException {
                bwc.mo1572b();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    bus.mo1536a(bwc, Long.valueOf(atomicLongArray.get(i)));
                }
                bwc.mo1574c();
            }

            /* renamed from: a */
            public AtomicLongArray m11026a(bwa bwa) throws IOException {
                List arrayList = new ArrayList();
                bwa.mo1548a();
                while (bwa.mo1553e()) {
                    arrayList.add(Long.valueOf(((Number) bus.mo1537b(bwa)).longValue()));
                }
                bwa.mo1549b();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }
        }.m11007a();
    }

    /* renamed from: a */
    public <T> bus<T> m11041a(bvz<T> bvz) {
        Object obj;
        Map map = this.f7674c;
        if (bvz == null) {
            obj = f7672a;
        } else {
            bvz<T> bvz2 = bvz;
        }
        bus<T> bus = (bus) map.get(obj);
        if (bus == null) {
            Map map2;
            Map map3 = (Map) this.f7673b.get();
            Object obj2 = null;
            if (map3 == null) {
                HashMap hashMap = new HashMap();
                this.f7673b.set(hashMap);
                map2 = hashMap;
                obj2 = 1;
            } else {
                map2 = map3;
            }
            C1499a c1499a = (C1499a) map2.get(bvz);
            if (c1499a == null) {
                try {
                    C1499a c1499a2 = new C1499a();
                    map2.put(bvz, c1499a2);
                    for (but a : this.f7675d) {
                        bus = a.mo1546a(this, bvz);
                        if (bus != null) {
                            c1499a2.m11030a(bus);
                            this.f7674c.put(bvz, bus);
                            map2.remove(bvz);
                            if (obj2 != null) {
                                this.f7673b.remove();
                            }
                        }
                    }
                    throw new IllegalArgumentException("GSON cannot handle " + bvz);
                } catch (Throwable th) {
                    map2.remove(bvz);
                    if (obj2 != null) {
                        this.f7673b.remove();
                    }
                }
            }
        }
        return bus;
    }

    /* renamed from: a */
    public <T> bus<T> m11040a(but but, bvz<T> bvz) {
        if (!this.f7675d.contains(but)) {
            but = this.f7684m;
        }
        Object obj = null;
        for (but but2 : this.f7675d) {
            if (obj != null) {
                bus<T> a = but2.mo1546a(this, bvz);
                if (a != null) {
                    return a;
                }
            } else if (but2 == but) {
                obj = 1;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + bvz);
    }

    /* renamed from: a */
    public <T> bus<T> m11042a(Class<T> cls) {
        return m11041a(bvz.m11003b(cls));
    }

    /* renamed from: a */
    public String m11052a(Object obj) {
        if (obj == null) {
            return m11051a(buj.f7702a);
        }
        return m11053a(obj, obj.getClass());
    }

    /* renamed from: a */
    public String m11053a(Object obj, Type type) {
        Appendable stringWriter = new StringWriter();
        m11057a(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m11057a(Object obj, Type type, Appendable appendable) throws bui {
        try {
            m11056a(obj, type, m11044a(bvi.m11189a(appendable)));
        } catch (Throwable e) {
            throw new bui(e);
        }
    }

    /* renamed from: a */
    public void m11056a(Object obj, Type type, bwc bwc) throws bui {
        bus a = m11041a(bvz.m11001a(type));
        boolean g = bwc.m11297g();
        bwc.m11289b(true);
        boolean h = bwc.m11298h();
        bwc.m11292c(this.f7680i);
        boolean i = bwc.m11299i();
        bwc.m11294d(this.f7679h);
        try {
            a.mo1536a(bwc, obj);
            bwc.m11289b(g);
            bwc.m11292c(h);
            bwc.m11294d(i);
        } catch (Throwable e) {
            throw new bui(e);
        } catch (Throwable th) {
            bwc.m11289b(g);
            bwc.m11292c(h);
            bwc.m11294d(i);
        }
    }

    /* renamed from: a */
    public String m11051a(buh buh) {
        Appendable stringWriter = new StringWriter();
        m11055a(buh, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public void m11055a(buh buh, Appendable appendable) throws bui {
        try {
            m11054a(buh, m11044a(bvi.m11189a(appendable)));
        } catch (Throwable e) {
            throw new bui(e);
        }
    }

    /* renamed from: a */
    public bwc m11044a(Writer writer) throws IOException {
        if (this.f7681j) {
            writer.write(")]}'\n");
        }
        bwc bwc = new bwc(writer);
        if (this.f7682k) {
            bwc.m11291c("  ");
        }
        bwc.m11294d(this.f7679h);
        return bwc;
    }

    /* renamed from: a */
    public bwa m11043a(Reader reader) {
        bwa bwa = new bwa(reader);
        bwa.m11234a(this.f7683l);
        return bwa;
    }

    /* renamed from: a */
    public void m11054a(buh buh, bwc bwc) throws bui {
        boolean g = bwc.m11297g();
        bwc.m11289b(true);
        boolean h = bwc.m11298h();
        bwc.m11292c(this.f7680i);
        boolean i = bwc.m11299i();
        bwc.m11294d(this.f7679h);
        try {
            bvi.m11190a(buh, bwc);
            bwc.m11289b(g);
            bwc.m11292c(h);
            bwc.m11294d(i);
        } catch (Throwable e) {
            throw new bui(e);
        } catch (Throwable th) {
            bwc.m11289b(g);
            bwc.m11292c(h);
            bwc.m11294d(i);
        }
    }

    /* renamed from: a */
    public <T> T m11049a(String str, Class<T> cls) throws buq {
        return bvh.m11185a((Class) cls).cast(m11050a(str, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m11050a(String str, Type type) throws buq {
        if (str == null) {
            return null;
        }
        return m11048a(new StringReader(str), type);
    }

    /* renamed from: a */
    public <T> T m11048a(Reader reader, Type type) throws bui, buq {
        bwa a = m11043a(reader);
        Object a2 = m11047a(a, type);
        bub.m11037a(a2, a);
        return a2;
    }

    /* renamed from: a */
    private static void m11037a(Object obj, bwa bwa) {
        if (obj != null) {
            try {
                if (bwa.mo1554f() != bwb.END_DOCUMENT) {
                    throw new bui("JSON document was not fully consumed.");
                }
            } catch (Throwable e) {
                throw new buq(e);
            } catch (Throwable e2) {
                throw new bui(e2);
            }
        }
    }

    /* renamed from: a */
    public <T> T m11047a(bwa bwa, Type type) throws bui, buq {
        boolean z = true;
        boolean q = bwa.m11249q();
        bwa.m11234a(true);
        try {
            bwa.mo1554f();
            z = false;
            T b = m11041a(bvz.m11001a(type)).mo1537b(bwa);
            bwa.m11234a(q);
            return b;
        } catch (Throwable e) {
            if (z) {
                bwa.m11234a(q);
                return null;
            }
            throw new buq(e);
        } catch (Throwable e2) {
            throw new buq(e2);
        } catch (Throwable e22) {
            throw new buq(e22);
        } catch (Throwable th) {
            bwa.m11234a(q);
        }
    }

    /* renamed from: a */
    public <T> T m11045a(buh buh, Class<T> cls) throws buq {
        return bvh.m11185a((Class) cls).cast(m11046a(buh, (Type) cls));
    }

    /* renamed from: a */
    public <T> T m11046a(buh buh, Type type) throws buq {
        if (buh == null) {
            return null;
        }
        return m11047a(new bvo(buh), type);
    }

    public String toString() {
        return "{serializeNulls:" + this.f7679h + "factories:" + this.f7675d + ",instanceCreators:" + this.f7676e + "}";
    }
}
