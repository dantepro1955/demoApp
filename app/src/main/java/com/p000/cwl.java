package com.p000;

/* compiled from: FloatEvaluator */
/* renamed from: cwl */
public class cwl implements cwt<Number> {
    /* renamed from: a */
    public Float m25220a(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + ((number2.floatValue() - floatValue) * f));
    }
}
