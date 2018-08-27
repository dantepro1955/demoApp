package com.p000;

import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.flurry.android.AdCreative;
import com.mopub.common.AdType;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: zd */
public class zd {
    /* renamed from: a */
    public static final zd f26072a = new zd(-1, 50, "BANNER");
    /* renamed from: b */
    public static final zd f26073b = new zd(-1, 75, "LEADER");
    /* renamed from: c */
    public static final zd f26074c = new zd(-1, -1, "INTER");
    /* renamed from: d */
    public static final zd f26075d = new zd(GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, 250, "MREC");
    /* renamed from: e */
    private final int f26076e;
    /* renamed from: f */
    private final int f26077f;
    /* renamed from: g */
    private final String f26078g;

    zd(int i, int i2, String str) {
        if (i < 0 && i != -1) {
            throw new IllegalArgumentException("Ad width must be a positive number. Number provided: " + i);
        } else if (i > 9999) {
            throw new IllegalArgumentException("Ad width must be less then 9999. Number provided: " + i);
        } else if (i2 < 0 && i2 != -1) {
            throw new IllegalArgumentException("Ad height must be a positive number. Number provided: " + i2);
        } else if (i2 > 9999) {
            throw new IllegalArgumentException("Ad height must be less then 9999. Number provided: " + i2);
        } else if (str == null) {
            throw new IllegalArgumentException("No label specified");
        } else if (str.length() > 9) {
            throw new IllegalArgumentException("Provided label is too long. Label provided: " + str);
        } else {
            this.f26076e = i;
            this.f26077f = i2;
            this.f26078g = str;
        }
    }

    public zd(String str) {
        this(0, 0, str);
    }

    /* renamed from: a */
    public static zd m34946a(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        String toLowerCase = str.toLowerCase(Locale.ENGLISH);
        if (toLowerCase.equals(AdCreative.kFormatBanner)) {
            return f26072a;
        }
        if (toLowerCase.equals(AdType.INTERSTITIAL) || toLowerCase.equals("inter")) {
            return f26074c;
        }
        if (toLowerCase.equals("mrec")) {
            return f26075d;
        }
        if (toLowerCase.equals("leader")) {
            return f26073b;
        }
        String[] split = str.split("x");
        return split.length == 2 ? new zd(zd.m34947b(split[0]), zd.m34947b(split[1]), str) : new zd(0, 0, str);
    }

    /* renamed from: b */
    private static int m34947b(String str) {
        if ("span".equalsIgnoreCase(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    /* renamed from: d */
    public static Set m34948d() {
        Set hashSet = new HashSet(4);
        hashSet.add(f26072a);
        hashSet.add(f26075d);
        hashSet.add(f26074c);
        hashSet.add(f26073b);
        return hashSet;
    }

    /* renamed from: a */
    public int m34949a() {
        return this.f26076e;
    }

    /* renamed from: b */
    public int m34950b() {
        return this.f26077f;
    }

    /* renamed from: c */
    public String m34951c() {
        return this.f26078g.toUpperCase(Locale.ENGLISH);
    }

    public String toString() {
        return m34951c();
    }
}
