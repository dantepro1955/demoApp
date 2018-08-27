package com.p000;

import android.os.IBinder;
import java.lang.reflect.Field;
import p000.bto.C1482a;

/* renamed from: btp */
public final class btp<T> extends C1482a {
    /* renamed from: a */
    private final T f7628a;

    private btp(T t) {
        this.f7628a = t;
    }

    /* renamed from: a */
    public static <T> bto m10944a(T t) {
        return new btp(t);
    }

    /* renamed from: a */
    public static <T> T m10945a(bto bto) {
        if (bto instanceof btp) {
            return ((btp) bto).f7628a;
        }
        IBinder asBinder = bto.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length == 1) {
            Field field = declaredFields[0];
            if (field.isAccessible()) {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
            } catch (Throwable e22) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e22);
            }
        }
        throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
    }
}
