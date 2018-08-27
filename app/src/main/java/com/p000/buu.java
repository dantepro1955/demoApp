package com.p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: Expose */
/* renamed from: buu */
public @interface buu {
    /* renamed from: a */
    boolean m11108a() default true;

    /* renamed from: b */
    boolean m11109b() default true;
}
