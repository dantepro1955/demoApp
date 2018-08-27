package com.p000;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.zzec;
import com.google.android.gms.internal.zzfp;
import java.util.ArrayList;
import java.util.List;

@bhd
/* renamed from: azj */
public final class azj {
    /* renamed from: a */
    private long f5128a;
    /* renamed from: b */
    private Bundle f5129b;
    /* renamed from: c */
    private int f5130c;
    /* renamed from: d */
    private List<String> f5131d;
    /* renamed from: e */
    private boolean f5132e;
    /* renamed from: f */
    private int f5133f;
    /* renamed from: g */
    private boolean f5134g;
    /* renamed from: h */
    private String f5135h;
    /* renamed from: i */
    private zzfp f5136i;
    /* renamed from: j */
    private Location f5137j;
    /* renamed from: k */
    private String f5138k;
    /* renamed from: l */
    private Bundle f5139l;
    /* renamed from: m */
    private Bundle f5140m;
    /* renamed from: n */
    private List<String> f5141n;
    /* renamed from: o */
    private String f5142o;
    /* renamed from: p */
    private String f5143p;
    /* renamed from: q */
    private boolean f5144q;

    public azj() {
        this.f5128a = -1;
        this.f5129b = new Bundle();
        this.f5130c = -1;
        this.f5131d = new ArrayList();
        this.f5132e = false;
        this.f5133f = -1;
        this.f5134g = false;
        this.f5135h = null;
        this.f5136i = null;
        this.f5137j = null;
        this.f5138k = null;
        this.f5139l = new Bundle();
        this.f5140m = new Bundle();
        this.f5141n = new ArrayList();
        this.f5142o = null;
        this.f5143p = null;
        this.f5144q = false;
    }

    public azj(zzec zzec) {
        this.f5128a = zzec.f14914b;
        this.f5129b = zzec.f14915c;
        this.f5130c = zzec.f14916d;
        this.f5131d = zzec.f14917e;
        this.f5132e = zzec.f14918f;
        this.f5133f = zzec.f14919g;
        this.f5134g = zzec.f14920h;
        this.f5135h = zzec.f14921i;
        this.f5136i = zzec.f14922j;
        this.f5137j = zzec.f14923k;
        this.f5138k = zzec.f14924l;
        this.f5139l = zzec.f14925m;
        this.f5140m = zzec.f14926n;
        this.f5141n = zzec.f14927o;
        this.f5142o = zzec.f14928p;
        this.f5143p = zzec.f14929q;
    }

    /* renamed from: a */
    public azj m6725a(Location location) {
        this.f5137j = location;
        return this;
    }

    /* renamed from: a */
    public zzec m6726a() {
        return new zzec(7, this.f5128a, this.f5129b, this.f5130c, this.f5131d, this.f5132e, this.f5133f, this.f5134g, this.f5135h, this.f5136i, this.f5137j, this.f5138k, this.f5139l, this.f5140m, this.f5141n, this.f5142o, this.f5143p, false);
    }
}
