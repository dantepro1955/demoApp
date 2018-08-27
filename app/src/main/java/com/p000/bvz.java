package com.p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* compiled from: TypeToken */
/* renamed from: bvz */
public class bvz<T> {
    /* renamed from: a */
    final Class<? super T> f7664a;
    /* renamed from: b */
    final Type f7665b;
    /* renamed from: c */
    final int f7666c;

    protected bvz() {
        this.f7665b = bvz.m11002a(getClass());
        this.f7664a = bva.m11133e(this.f7665b);
        this.f7666c = this.f7665b.hashCode();
    }

    bvz(Type type) {
        this.f7665b = bva.m11132d((Type) buz.m11115a((Object) type));
        this.f7664a = bva.m11133e(this.f7665b);
        this.f7666c = this.f7665b.hashCode();
    }

    /* renamed from: a */
    static Type m11002a(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return bva.m11132d(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    /* renamed from: a */
    public final Class<? super T> m11004a() {
        return this.f7664a;
    }

    /* renamed from: b */
    public final Type m11005b() {
        return this.f7665b;
    }

    public final int hashCode() {
        return this.f7666c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bvz) && bva.m11127a(this.f7665b, ((bvz) obj).f7665b);
    }

    public final String toString() {
        return bva.m11134f(this.f7665b);
    }

    /* renamed from: a */
    public static bvz<?> m11001a(Type type) {
        return new bvz(type);
    }

    /* renamed from: b */
    public static <T> bvz<T> m11003b(Class<T> cls) {
        return new bvz(cls);
    }
}
