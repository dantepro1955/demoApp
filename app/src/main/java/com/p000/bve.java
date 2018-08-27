package com.p000;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* compiled from: LazilyParsedNumber */
/* renamed from: bve */
public final class bve extends Number {
    /* renamed from: a */
    private final String f7755a;

    public bve(String str) {
        this.f7755a = str;
    }

    public int intValue() {
        try {
            return Integer.parseInt(this.f7755a);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.f7755a);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.f7755a).intValue();
            }
        }
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f7755a);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.f7755a).longValue();
        }
    }

    public float floatValue() {
        return Float.parseFloat(this.f7755a);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f7755a);
    }

    public String toString() {
        return this.f7755a;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f7755a);
    }

    public int hashCode() {
        return this.f7755a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bve)) {
            return false;
        }
        bve bve = (bve) obj;
        if (this.f7755a == bve.f7755a || this.f7755a.equals(bve.f7755a)) {
            return true;
        }
        return false;
    }
}
