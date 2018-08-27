package com.p000;

import android.os.IBinder;
import java.lang.reflect.Field;
import p000.aqq.C0701a;

/* renamed from: aqr */
public final class aqr<T> extends C0701a {
    /* renamed from: a */
    private final T f3962a;

    private aqr(T t) {
        this.f3962a = t;
    }

    /* renamed from: a */
    public static <T> aqq m4967a(T t) {
        return new aqr(t);
    }

    /* renamed from: a */
    public static <T> T m4968a(aqq aqq) {
        int i = 0;
        if (aqq instanceof aqr) {
            return ((aqr) aqq).f3962a;
        }
        IBinder asBinder = aqq.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field2 = declaredFields[i2];
            if (field2.isSynthetic()) {
                field2 = field;
            } else {
                i++;
            }
            i2++;
            field = field2;
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        } else if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        } else {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (Throwable e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (Throwable e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        }
    }
}
