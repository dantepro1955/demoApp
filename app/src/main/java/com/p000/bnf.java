package com.p000;

/* renamed from: bnf */
public enum bnf {
    NONE,
    GZIP;

    /* renamed from: a */
    public static bnf m9924a(String str) {
        return "GZIP".equalsIgnoreCase(str) ? GZIP : NONE;
    }
}
