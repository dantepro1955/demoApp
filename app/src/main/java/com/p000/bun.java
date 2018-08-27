package com.p000;

import java.math.BigInteger;

/* compiled from: JsonPrimitive */
/* renamed from: bun */
public final class bun extends buh {
    /* renamed from: a */
    private static final Class<?>[] f7704a = new Class[]{Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    /* renamed from: b */
    private Object f7705b;

    public bun(Boolean bool) {
        m11094a((Object) bool);
    }

    public bun(Number number) {
        m11094a((Object) number);
    }

    public bun(String str) {
        m11094a((Object) str);
    }

    /* renamed from: a */
    void m11094a(Object obj) {
        if (obj instanceof Character) {
            this.f7705b = String.valueOf(((Character) obj).charValue());
            return;
        }
        boolean z = (obj instanceof Number) || bun.m11093b(obj);
        buz.m11116a(z);
        this.f7705b = obj;
    }

    /* renamed from: a */
    public boolean m11095a() {
        return this.f7705b instanceof Boolean;
    }

    /* renamed from: o */
    Boolean mo1544o() {
        return (Boolean) this.f7705b;
    }

    /* renamed from: g */
    public boolean mo1543g() {
        if (m11095a()) {
            return mo1544o().booleanValue();
        }
        return Boolean.parseBoolean(mo1539c());
    }

    /* renamed from: p */
    public boolean m11103p() {
        return this.f7705b instanceof Number;
    }

    /* renamed from: b */
    public Number mo1538b() {
        return this.f7705b instanceof String ? new bve((String) this.f7705b) : (Number) this.f7705b;
    }

    /* renamed from: q */
    public boolean m11104q() {
        return this.f7705b instanceof String;
    }

    /* renamed from: c */
    public String mo1539c() {
        if (m11103p()) {
            return mo1538b().toString();
        }
        if (m11095a()) {
            return mo1544o().toString();
        }
        return (String) this.f7705b;
    }

    /* renamed from: d */
    public double mo1540d() {
        return m11103p() ? mo1538b().doubleValue() : Double.parseDouble(mo1539c());
    }

    /* renamed from: e */
    public long mo1541e() {
        return m11103p() ? mo1538b().longValue() : Long.parseLong(mo1539c());
    }

    /* renamed from: f */
    public int mo1542f() {
        return m11103p() ? mo1538b().intValue() : Integer.parseInt(mo1539c());
    }

    /* renamed from: b */
    private static boolean m11093b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class isAssignableFrom : f7704a) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f7705b == null) {
            return 31;
        }
        long longValue;
        if (bun.m11092a(this)) {
            longValue = mo1538b().longValue();
            return (int) (longValue ^ (longValue >>> 32));
        } else if (!(this.f7705b instanceof Number)) {
            return this.f7705b.hashCode();
        } else {
            longValue = Double.doubleToLongBits(mo1538b().doubleValue());
            return (int) (longValue ^ (longValue >>> 32));
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bun bun = (bun) obj;
        if (this.f7705b == null) {
            if (bun.f7705b != null) {
                return false;
            }
            return true;
        } else if (bun.m11092a(this) && bun.m11092a(bun)) {
            if (mo1538b().longValue() != bun.mo1538b().longValue()) {
                return false;
            }
            return true;
        } else if (!(this.f7705b instanceof Number) || !(bun.f7705b instanceof Number)) {
            return this.f7705b.equals(bun.f7705b);
        } else {
            double doubleValue = mo1538b().doubleValue();
            double doubleValue2 = bun.mo1538b().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: a */
    private static boolean m11092a(bun bun) {
        if (!(bun.f7705b instanceof Number)) {
            return false;
        }
        Number number = (Number) bun.f7705b;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }
}
