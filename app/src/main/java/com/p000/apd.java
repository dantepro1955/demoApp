package com.p000;

/* renamed from: apd */
public final class apd {
    /* renamed from: a */
    public static final int f3898a = (23 - " PII_LOG".length());
    /* renamed from: b */
    private static final String f3899b = null;
    /* renamed from: c */
    private final String f3900c;
    /* renamed from: d */
    private final String f3901d;

    public apd(String str) {
        this(str, null);
    }

    public apd(String str, String str2) {
        aoi.m4680a((Object) str, (Object) "log tag cannot be null");
        aoi.m4690b(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, Integer.valueOf(23));
        this.f3900c = str;
        if (str2 == null || str2.length() <= 0) {
            this.f3901d = null;
        } else {
            this.f3901d = str2;
        }
    }
}
