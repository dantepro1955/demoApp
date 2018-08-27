package com.p000;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

@bhd
/* renamed from: bfd */
public final class bfd implements MediationAdRequest {
    /* renamed from: a */
    private final Date f5924a;
    /* renamed from: b */
    private final int f5925b;
    /* renamed from: c */
    private final Set<String> f5926c;
    /* renamed from: d */
    private final boolean f5927d;
    /* renamed from: e */
    private final Location f5928e;
    /* renamed from: f */
    private final int f5929f;
    /* renamed from: g */
    private final boolean f5930g;

    public bfd(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2) {
        this.f5924a = date;
        this.f5925b = i;
        this.f5926c = set;
        this.f5928e = location;
        this.f5927d = z;
        this.f5929f = i2;
        this.f5930g = z2;
    }

    public Date getBirthday() {
        return this.f5924a;
    }

    public int getGender() {
        return this.f5925b;
    }

    public Set<String> getKeywords() {
        return this.f5926c;
    }

    public Location getLocation() {
        return this.f5928e;
    }

    public boolean isDesignedForFamilies() {
        return this.f5930g;
    }

    public boolean isTesting() {
        return this.f5927d;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f5929f;
    }
}
