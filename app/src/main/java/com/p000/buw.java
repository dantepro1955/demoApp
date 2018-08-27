package com.p000;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* compiled from: SerializedName */
/* renamed from: buw */
public @interface buw {
    /* renamed from: a */
    String m11111a();

    /* renamed from: b */
    String[] m11112b() default {};
}
