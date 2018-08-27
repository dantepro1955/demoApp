package com.p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory */
/* renamed from: bvs */
public final class bvs implements but {
    /* renamed from: a */
    private final bvb f7860a;
    /* renamed from: b */
    private final bua f7861b;
    /* renamed from: c */
    private final bvc f7862c;
    /* renamed from: d */
    private final bvn f7863d;

    /* compiled from: ReflectiveTypeAdapterFactory */
    /* renamed from: bvs$b */
    static abstract class C1537b {
        /* renamed from: h */
        final String f7848h;
        /* renamed from: i */
        final boolean f7849i;
        /* renamed from: j */
        final boolean f7850j;

        /* renamed from: a */
        abstract void mo1580a(bwa bwa, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: a */
        abstract void mo1581a(bwc bwc, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: a */
        abstract boolean mo1582a(Object obj) throws IOException, IllegalAccessException;

        protected C1537b(String str, boolean z, boolean z2) {
            this.f7848h = str;
            this.f7849i = z;
            this.f7850j = z2;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory */
    /* renamed from: bvs$a */
    public static final class C1539a<T> extends bus<T> {
        /* renamed from: a */
        private final bvg<T> f7858a;
        /* renamed from: b */
        private final Map<String, C1537b> f7859b;

        C1539a(bvg<T> bvg, Map<String, C1537b> map) {
            this.f7858a = bvg;
            this.f7859b = map;
        }

        /* renamed from: b */
        public T mo1537b(bwa bwa) throws IOException {
            if (bwa.mo1554f() == bwb.NULL) {
                bwa.mo1558j();
                return null;
            }
            T a = this.f7858a.mo1545a();
            try {
                bwa.mo1550c();
                while (bwa.mo1553e()) {
                    C1537b c1537b = (C1537b) this.f7859b.get(bwa.mo1555g());
                    if (c1537b == null || !c1537b.f7850j) {
                        bwa.mo1562n();
                    } else {
                        c1537b.mo1580a(bwa, (Object) a);
                    }
                }
                bwa.mo1552d();
                return a;
            } catch (Throwable e) {
                throw new buq(e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo1536a(bwc bwc, T t) throws IOException {
            if (t == null) {
                bwc.mo1578f();
                return;
            }
            bwc.mo1576d();
            try {
                for (C1537b c1537b : this.f7859b.values()) {
                    if (c1537b.mo1582a(t)) {
                        bwc.mo1570a(c1537b.f7848h);
                        c1537b.mo1581a(bwc, (Object) t);
                    }
                }
                bwc.mo1577e();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public bvs(bvb bvb, bua bua, bvc bvc, bvn bvn) {
        this.f7860a = bvb;
        this.f7861b = bua;
        this.f7862c = bvc;
        this.f7863d = bvn;
    }

    /* renamed from: a */
    public boolean m11337a(Field field, boolean z) {
        return bvs.m11335a(field, z, this.f7862c);
    }

    /* renamed from: a */
    static boolean m11335a(Field field, boolean z, bvc bvc) {
        return (bvc.m11167a(field.getType(), z) || bvc.m11168a(field, z)) ? false : true;
    }

    /* renamed from: a */
    private List<String> m11333a(Field field) {
        buw buw = (buw) field.getAnnotation(buw.class);
        if (buw == null) {
            return Collections.singletonList(this.f7861b.mo1535a(field));
        }
        String a = buw.m11111a();
        String[] b = buw.m11112b();
        if (b.length == 0) {
            return Collections.singletonList(a);
        }
        List<String> arrayList = new ArrayList(b.length + 1);
        arrayList.add(a);
        for (Object add : b) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
        Class a = bvz.m11004a();
        if (Object.class.isAssignableFrom(a)) {
            return new C1539a(this.f7860a.m11155a((bvz) bvz), m11334a(bub, (bvz) bvz, a));
        }
        return null;
    }

    /* renamed from: a */
    private C1537b m11332a(bub bub, Field field, String str, bvz<?> bvz, boolean z, boolean z2) {
        final boolean a = bvh.m11187a(bvz.m11004a());
        buv buv = (buv) field.getAnnotation(buv.class);
        bus bus = null;
        if (buv != null) {
            bus = this.f7863d.m11214a(this.f7860a, bub, bvz, buv);
        }
        final boolean z3 = bus != null;
        if (bus == null) {
            bus = bub.m11041a((bvz) bvz);
        }
        final Field field2 = field;
        final bub bub2 = bub;
        final bvz<?> bvz2 = bvz;
        return new C1537b(this, str, z, z2) {
            /* renamed from: g */
            final /* synthetic */ bvs f7857g;

            /* renamed from: a */
            void mo1581a(bwc bwc, Object obj) throws IOException, IllegalAccessException {
                bus bus;
                Object obj2 = field2.get(obj);
                if (z3) {
                    bus = bus;
                } else {
                    bus = new bvw(bub2, bus, bvz2.m11005b());
                }
                bus.mo1536a(bwc, obj2);
            }

            /* renamed from: a */
            void mo1580a(bwa bwa, Object obj) throws IOException, IllegalAccessException {
                Object b = bus.mo1537b(bwa);
                if (b != null || !a) {
                    field2.set(obj, b);
                }
            }

            /* renamed from: a */
            public boolean mo1582a(Object obj) throws IOException, IllegalAccessException {
                if (this.i && field2.get(obj) != obj) {
                    return true;
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    private Map<String, C1537b> m11334a(bub bub, bvz<?> bvz, Class<?> cls) {
        Map<String, C1537b> linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = bvz.m11005b();
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                boolean a = m11337a(field, true);
                boolean a2 = m11337a(field, false);
                if (a || a2) {
                    field.setAccessible(true);
                    Type a3 = bva.m11124a(bvz.m11005b(), (Class) cls, field.getGenericType());
                    List a4 = m11333a(field);
                    C1537b c1537b = null;
                    int i = 0;
                    while (i < a4.size()) {
                        String str = (String) a4.get(i);
                        if (i != 0) {
                            a = false;
                        }
                        C1537b c1537b2 = (C1537b) linkedHashMap.put(str, m11332a(bub, field, str, bvz.m11001a(a3), a, a2));
                        if (c1537b != null) {
                            c1537b2 = c1537b;
                        }
                        i++;
                        c1537b = c1537b2;
                    }
                    if (c1537b != null) {
                        throw new IllegalArgumentException(b + " declares multiple JSON fields named " + c1537b.f7848h);
                    }
                }
            }
            bvz = bvz.m11001a(bva.m11124a(bvz.m11005b(), (Class) cls, cls.getGenericSuperclass()));
            cls = bvz.m11004a();
        }
        return linkedHashMap;
    }
}
