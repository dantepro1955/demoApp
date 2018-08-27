package com.p000;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@bhd
/* renamed from: bai */
public final class bai {
    /* renamed from: a */
    private final Date f5226a;
    /* renamed from: b */
    private final String f5227b;
    /* renamed from: c */
    private final int f5228c;
    /* renamed from: d */
    private final Set<String> f5229d;
    /* renamed from: e */
    private final Location f5230e;
    /* renamed from: f */
    private final boolean f5231f;
    /* renamed from: g */
    private final Bundle f5232g;
    /* renamed from: h */
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> f5233h;
    /* renamed from: i */
    private final String f5234i;
    /* renamed from: j */
    private final String f5235j;
    /* renamed from: k */
    private final aky f5236k;
    /* renamed from: l */
    private final int f5237l;
    /* renamed from: m */
    private final Set<String> f5238m;
    /* renamed from: n */
    private final Bundle f5239n;
    /* renamed from: o */
    private final Set<String> f5240o;
    /* renamed from: p */
    private final boolean f5241p;

    /* renamed from: bai$a */
    public static final class C0964a {
        /* renamed from: a */
        private final HashSet<String> f5211a = new HashSet();
        /* renamed from: b */
        private final Bundle f5212b = new Bundle();
        /* renamed from: c */
        private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> f5213c = new HashMap();
        /* renamed from: d */
        private final HashSet<String> f5214d = new HashSet();
        /* renamed from: e */
        private final Bundle f5215e = new Bundle();
        /* renamed from: f */
        private final HashSet<String> f5216f = new HashSet();
        /* renamed from: g */
        private Date f5217g;
        /* renamed from: h */
        private String f5218h;
        /* renamed from: i */
        private int f5219i = -1;
        /* renamed from: j */
        private Location f5220j;
        /* renamed from: k */
        private boolean f5221k = false;
        /* renamed from: l */
        private String f5222l;
        /* renamed from: m */
        private String f5223m;
        /* renamed from: n */
        private int f5224n = -1;
        /* renamed from: o */
        private boolean f5225o;

        /* renamed from: a */
        public void m6912a(int i) {
            this.f5219i = i;
        }

        /* renamed from: a */
        public void m6913a(Location location) {
            this.f5220j = location;
        }

        /* renamed from: a */
        public void m6914a(Class<? extends MediationAdapter> cls, Bundle bundle) {
            this.f5212b.putBundle(cls.getName(), bundle);
        }

        /* renamed from: a */
        public void m6915a(String str) {
            this.f5211a.add(str);
        }

        /* renamed from: a */
        public void m6916a(Date date) {
            this.f5217g = date;
        }

        /* renamed from: a */
        public void m6917a(boolean z) {
            this.f5224n = z ? 1 : 0;
        }

        /* renamed from: b */
        public void m6918b(String str) {
            this.f5214d.add(str);
        }

        /* renamed from: b */
        public void m6919b(boolean z) {
            this.f5225o = z;
        }

        /* renamed from: c */
        public void m6920c(String str) {
            this.f5214d.remove(str);
        }

        /* renamed from: d */
        public void m6921d(String str) {
            this.f5218h = str;
        }
    }

    public bai(C0964a c0964a) {
        this(c0964a, null);
    }

    public bai(C0964a c0964a, aky aky) {
        this.f5226a = c0964a.f5217g;
        this.f5227b = c0964a.f5218h;
        this.f5228c = c0964a.f5219i;
        this.f5229d = Collections.unmodifiableSet(c0964a.f5211a);
        this.f5230e = c0964a.f5220j;
        this.f5231f = c0964a.f5221k;
        this.f5232g = c0964a.f5212b;
        this.f5233h = Collections.unmodifiableMap(c0964a.f5213c);
        this.f5234i = c0964a.f5222l;
        this.f5235j = c0964a.f5223m;
        this.f5236k = aky;
        this.f5237l = c0964a.f5224n;
        this.f5238m = Collections.unmodifiableSet(c0964a.f5214d);
        this.f5239n = c0964a.f5215e;
        this.f5240o = Collections.unmodifiableSet(c0964a.f5216f);
        this.f5241p = c0964a.f5225o;
    }

    /* renamed from: a */
    public Bundle m6922a(Class<? extends MediationAdapter> cls) {
        return this.f5232g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public Date m6923a() {
        return this.f5226a;
    }

    /* renamed from: a */
    public boolean m6924a(Context context) {
        return this.f5238m.contains(azp.m6789a().m9285a(context));
    }

    /* renamed from: b */
    public String m6925b() {
        return this.f5227b;
    }

    /* renamed from: c */
    public int m6926c() {
        return this.f5228c;
    }

    /* renamed from: d */
    public Set<String> m6927d() {
        return this.f5229d;
    }

    /* renamed from: e */
    public Location m6928e() {
        return this.f5230e;
    }

    /* renamed from: f */
    public boolean m6929f() {
        return this.f5231f;
    }

    /* renamed from: g */
    public String m6930g() {
        return this.f5234i;
    }

    /* renamed from: h */
    public String m6931h() {
        return this.f5235j;
    }

    /* renamed from: i */
    public aky m6932i() {
        return this.f5236k;
    }

    /* renamed from: j */
    public Map<Class<? extends NetworkExtras>, NetworkExtras> m6933j() {
        return this.f5233h;
    }

    /* renamed from: k */
    public Bundle m6934k() {
        return this.f5232g;
    }

    /* renamed from: l */
    public int m6935l() {
        return this.f5237l;
    }

    /* renamed from: m */
    public Bundle m6936m() {
        return this.f5239n;
    }

    /* renamed from: n */
    public Set<String> m6937n() {
        return this.f5240o;
    }

    /* renamed from: o */
    public boolean m6938o() {
        return this.f5241p;
    }
}
