package com.p000;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* compiled from: Excluder */
/* renamed from: bvc */
public final class bvc implements but, Cloneable {
    /* renamed from: a */
    public static final bvc f7747a = new bvc();
    /* renamed from: b */
    private double f7748b = -1.0d;
    /* renamed from: c */
    private int f7749c = 136;
    /* renamed from: d */
    private boolean f7750d = true;
    /* renamed from: e */
    private boolean f7751e;
    /* renamed from: f */
    private List<btx> f7752f = Collections.emptyList();
    /* renamed from: g */
    private List<btx> f7753g = Collections.emptyList();

    protected /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m11166a();
    }

    /* renamed from: a */
    protected bvc m11166a() {
        try {
            return (bvc) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
        Class a = bvz.m11004a();
        final boolean a2 = m11167a(a, true);
        final boolean a3 = m11167a(a, false);
        if (!a2 && !a3) {
            return null;
        }
        final bub bub2 = bub;
        final bvz<T> bvz2 = bvz;
        return new bus<T>(this) {
            /* renamed from: e */
            final /* synthetic */ bvc f7745e;
            /* renamed from: f */
            private bus<T> f7746f;

            /* renamed from: b */
            public T mo1537b(bwa bwa) throws IOException {
                if (!a3) {
                    return m11156b().mo1537b(bwa);
                }
                bwa.mo1562n();
                return null;
            }

            /* renamed from: a */
            public void mo1536a(bwc bwc, T t) throws IOException {
                if (a2) {
                    bwc.mo1578f();
                } else {
                    m11156b().mo1536a(bwc, t);
                }
            }

            /* renamed from: b */
            private bus<T> m11156b() {
                bus<T> bus = this.f7746f;
                if (bus != null) {
                    return bus;
                }
                bus = bub2.m11040a(this.f7745e, bvz2);
                this.f7746f = bus;
                return bus;
            }
        };
    }

    /* renamed from: a */
    public boolean m11168a(Field field, boolean z) {
        if ((this.f7749c & field.getModifiers()) != 0) {
            return true;
        }
        if (this.f7748b != -1.0d && !m11160a((bux) field.getAnnotation(bux.class), (buy) field.getAnnotation(buy.class))) {
            return true;
        }
        if (field.isSynthetic()) {
            return true;
        }
        if (this.f7751e) {
            buu buu = (buu) field.getAnnotation(buu.class);
            if (buu == null || (z ? !buu.m11108a() : !buu.m11109b())) {
                return true;
            }
        }
        if (!this.f7750d && m11163b(field.getType())) {
            return true;
        }
        if (m11162a(field.getType())) {
            return true;
        }
        List<btx> list = z ? this.f7752f : this.f7753g;
        if (!list.isEmpty()) {
            bty bty = new bty(field);
            for (btx a : list) {
                if (a.m10987a(bty)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m11167a(Class<?> cls, boolean z) {
        if (this.f7748b != -1.0d && !m11160a((bux) cls.getAnnotation(bux.class), (buy) cls.getAnnotation(buy.class))) {
            return true;
        }
        if (!this.f7750d && m11163b(cls)) {
            return true;
        }
        if (m11162a((Class) cls)) {
            return true;
        }
        for (btx a : z ? this.f7752f : this.f7753g) {
            if (a.m10988a((Class) cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11162a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m11163b(Class<?> cls) {
        return cls.isMemberClass() && !m11164c(cls);
    }

    /* renamed from: c */
    private boolean m11164c(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    private boolean m11160a(bux bux, buy buy) {
        return m11159a(bux) && m11161a(buy);
    }

    /* renamed from: a */
    private boolean m11159a(bux bux) {
        if (bux == null || bux.m11113a() <= this.f7748b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m11161a(buy buy) {
        if (buy == null || buy.m11114a() > this.f7748b) {
            return true;
        }
        return false;
    }
}
