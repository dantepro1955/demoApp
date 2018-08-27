package com.p000;

import android.location.Location;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.internal.zzhc;
import java.util.Date;
import java.util.List;
import java.util.Set;
import p000.aia.C0188a;
import p000.aih.C0193a;

@bhd
/* renamed from: bfi */
public final class bfi implements NativeMediationAdRequest {
    /* renamed from: a */
    private final Date f5937a;
    /* renamed from: b */
    private final int f5938b;
    /* renamed from: c */
    private final Set<String> f5939c;
    /* renamed from: d */
    private final boolean f5940d;
    /* renamed from: e */
    private final Location f5941e;
    /* renamed from: f */
    private final int f5942f;
    /* renamed from: g */
    private final zzhc f5943g;
    /* renamed from: h */
    private final List<String> f5944h;
    /* renamed from: i */
    private final boolean f5945i;

    public bfi(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzhc zzhc, List<String> list, boolean z2) {
        this.f5937a = date;
        this.f5938b = i;
        this.f5939c = set;
        this.f5941e = location;
        this.f5940d = z;
        this.f5942f = i2;
        this.f5943g = zzhc;
        this.f5944h = list;
        this.f5945i = z2;
    }

    public Date getBirthday() {
        return this.f5937a;
    }

    public int getGender() {
        return this.f5938b;
    }

    public Set<String> getKeywords() {
        return this.f5939c;
    }

    public Location getLocation() {
        return this.f5941e;
    }

    public aih getNativeAdOptions() {
        if (this.f5943g == null) {
            return null;
        }
        C0193a b = new C0193a().m1675a(this.f5943g.f14962b).m1673a(this.f5943g.f14963c).m1678b(this.f5943g.f14964d);
        if (this.f5943g.f14961a >= 2) {
            b.m1677b(this.f5943g.f14965e);
        }
        if (this.f5943g.f14961a >= 3 && this.f5943g.f14966f != null) {
            b.m1674a(new C0188a().m1656a(this.f5943g.f14966f.f14958a).m1657a());
        }
        return b.m1676a();
    }

    public boolean isAppInstallAdRequested() {
        return this.f5944h != null && this.f5944h.contains("2");
    }

    public boolean isContentAdRequested() {
        return this.f5944h != null && this.f5944h.contains("1");
    }

    public boolean isDesignedForFamilies() {
        return this.f5945i;
    }

    public boolean isTesting() {
        return this.f5940d;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f5942f;
    }
}
