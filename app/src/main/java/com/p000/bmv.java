package com.p000;

/* renamed from: bmv */
public class bmv {
    /* renamed from: a */
    public static final String f7023a = String.valueOf(aqm.f3774b / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
    /* renamed from: b */
    public static final String f7024b;

    static {
        String str = "ma";
        String valueOf = String.valueOf(f7023a);
        f7024b = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }
}
