package com.p000;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory */
/* renamed from: bvn */
public final class bvn implements but {
    /* renamed from: a */
    private final bvb f7800a;

    public bvn(bvb bvb) {
        this.f7800a = bvb;
    }

    /* renamed from: a */
    public <T> bus<T> mo1546a(bub bub, bvz<T> bvz) {
        buv buv = (buv) bvz.m11004a().getAnnotation(buv.class);
        if (buv == null) {
            return null;
        }
        return m11214a(this.f7800a, bub, bvz, buv);
    }

    /* renamed from: a */
    bus<?> m11214a(bvb bvb, bub bub, bvz<?> bvz, buv buv) {
        bus<?> bus;
        Object a = bvb.m11155a(bvz.m11003b(buv.m11110a())).mo1545a();
        if (a instanceof bus) {
            bus = (bus) a;
        } else if (a instanceof but) {
            bus = ((but) a).mo1546a(bub, bvz);
        } else if ((a instanceof bup) || (a instanceof bug)) {
            bug bug;
            bup bup = a instanceof bup ? (bup) a : null;
            if (a instanceof bug) {
                bug = (bug) a;
            } else {
                bug = null;
            }
            bus = new bvv(bup, bug, bub, bvz, null);
        } else {
            throw new IllegalArgumentException("@JsonAdapter value must be TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer reference.");
        }
        if (bus != null) {
            return bus.m11007a();
        }
        return bus;
    }
}
