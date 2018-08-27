package com.p000;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import p000.bvs.C1539a;

/* compiled from: TypeAdapterRuntimeTypeWrapper */
/* renamed from: bvw */
final class bvw<T> extends bus<T> {
    /* renamed from: a */
    private final bub f7881a;
    /* renamed from: b */
    private final bus<T> f7882b;
    /* renamed from: c */
    private final Type f7883c;

    bvw(bub bub, bus<T> bus, Type type) {
        this.f7881a = bub;
        this.f7882b = bus;
        this.f7883c = type;
    }

    /* renamed from: b */
    public T mo1537b(bwa bwa) throws IOException {
        return this.f7882b.mo1537b(bwa);
    }

    /* renamed from: a */
    public void mo1536a(bwc bwc, T t) throws IOException {
        bus bus = this.f7882b;
        Type a = m11354a(this.f7883c, (Object) t);
        if (a != this.f7883c) {
            bus = this.f7881a.m11041a(bvz.m11001a(a));
            if ((bus instanceof C1539a) && !(this.f7882b instanceof C1539a)) {
                bus = this.f7882b;
            }
        }
        bus.mo1536a(bwc, t);
    }

    /* renamed from: a */
    private Type m11354a(Type type, Object obj) {
        if (obj == null) {
            return type;
        }
        if (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) {
            return obj.getClass();
        }
        return type;
    }
}
