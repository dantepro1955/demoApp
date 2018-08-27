package com.p000;

import android.content.Context;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.google.android.gms.internal.zzeg;

/* renamed from: ahw */
public final class ahw {
    /* renamed from: a */
    public static final ahw f1525a = new ahw(320, 50, "320x50_mb");
    /* renamed from: b */
    public static final ahw f1526b = new ahw(468, 60, "468x60_as");
    /* renamed from: c */
    public static final ahw f1527c = new ahw(320, 100, "320x100_as");
    /* renamed from: d */
    public static final ahw f1528d = new ahw(728, 90, "728x90_as");
    /* renamed from: e */
    public static final ahw f1529e = new ahw(GenericDraweeHierarchyBuilder.DEFAULT_FADE_DURATION, 250, "300x250_as");
    /* renamed from: f */
    public static final ahw f1530f = new ahw(160, 600, "160x600_as");
    /* renamed from: g */
    public static final ahw f1531g = new ahw(-1, -2, "smart_banner");
    /* renamed from: h */
    public static final ahw f1532h = new ahw(-3, -4, "fluid");
    /* renamed from: i */
    public static final ahw f1533i = new ahw(50, 50, "50x50_mb");
    /* renamed from: j */
    public static final ahw f1534j = new ahw(-3, 0, "search_v2");
    /* renamed from: k */
    private final int f1535k;
    /* renamed from: l */
    private final int f1536l;
    /* renamed from: m */
    private final String f1537m;

    public ahw(int i, int i2) {
        String valueOf = i == -1 ? "FULL" : String.valueOf(i);
        String valueOf2 = i2 == -2 ? "AUTO" : String.valueOf(i2);
        String valueOf3 = String.valueOf("_as");
        this(i, i2, new StringBuilder(((String.valueOf(valueOf).length() + 1) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append("x").append(valueOf2).append(valueOf3).toString());
    }

    ahw(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i);
        } else if (i2 >= 0 || i2 == -2 || i2 == -4) {
            this.f1535k = i;
            this.f1536l = i2;
            this.f1537m = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i2);
        }
    }

    /* renamed from: a */
    public int m1626a() {
        return this.f1536l;
    }

    /* renamed from: a */
    public int m1627a(Context context) {
        switch (this.f1536l) {
            case -4:
            case -3:
                return -1;
            case -2:
                return zzeg.m19668b(context.getResources().getDisplayMetrics());
            default:
                return azp.m6789a().m9283a(context, this.f1536l);
        }
    }

    /* renamed from: b */
    public int m1628b() {
        return this.f1535k;
    }

    /* renamed from: b */
    public int m1629b(Context context) {
        switch (this.f1535k) {
            case -4:
            case -3:
                return -1;
            case -1:
                return zzeg.m19665a(context.getResources().getDisplayMetrics());
            default:
                return azp.m6789a().m9283a(context, this.f1535k);
        }
    }

    /* renamed from: c */
    public boolean m1630c() {
        return this.f1536l == -2;
    }

    /* renamed from: d */
    public boolean m1631d() {
        return this.f1535k == -1;
    }

    /* renamed from: e */
    public boolean m1632e() {
        return this.f1535k == -3 && this.f1536l == -4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ahw)) {
            return false;
        }
        ahw ahw = (ahw) obj;
        return this.f1535k == ahw.f1535k && this.f1536l == ahw.f1536l && this.f1537m.equals(ahw.f1537m);
    }

    public int hashCode() {
        return this.f1537m.hashCode();
    }

    public String toString() {
        return this.f1537m;
    }
}
