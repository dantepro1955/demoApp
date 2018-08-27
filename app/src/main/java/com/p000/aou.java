package com.p000;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aou */
public final class aou {
    /* renamed from: a */
    private final Account f3842a;
    /* renamed from: b */
    private final Set<Scope> f3843b;
    /* renamed from: c */
    private final Set<Scope> f3844c;
    /* renamed from: d */
    private final Map<ann<?>, C0672a> f3845d;
    /* renamed from: e */
    private final int f3846e;
    /* renamed from: f */
    private final View f3847f;
    /* renamed from: g */
    private final String f3848g;
    /* renamed from: h */
    private final String f3849h;
    /* renamed from: i */
    private final avk f3850i;
    /* renamed from: j */
    private Integer f3851j;

    /* renamed from: aou$a */
    public static final class C0672a {
        /* renamed from: a */
        public final Set<Scope> f3841a;

        public C0672a(Set<Scope> set) {
            aoi.m4679a((Object) set);
            this.f3841a = Collections.unmodifiableSet(set);
        }
    }

    public aou(Account account, Set<Scope> set, Map<ann<?>, C0672a> map, int i, View view, String str, String str2, avk avk) {
        Map map2;
        this.f3842a = account;
        this.f3843b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        if (map == null) {
            map2 = Collections.EMPTY_MAP;
        }
        this.f3845d = map2;
        this.f3847f = view;
        this.f3846e = i;
        this.f3848g = str;
        this.f3849h = str2;
        this.f3850i = avk;
        Set hashSet = new HashSet(this.f3843b);
        for (C0672a c0672a : this.f3845d.values()) {
            hashSet.addAll(c0672a.f3841a);
        }
        this.f3844c = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    /* renamed from: a */
    public String m4745a() {
        return this.f3842a != null ? this.f3842a.name : null;
    }

    /* renamed from: a */
    public Set<Scope> m4746a(ann<?> ann) {
        C0672a c0672a = (C0672a) this.f3845d.get(ann);
        if (c0672a == null || c0672a.f3841a.isEmpty()) {
            return this.f3843b;
        }
        Set<Scope> hashSet = new HashSet(this.f3843b);
        hashSet.addAll(c0672a.f3841a);
        return hashSet;
    }

    /* renamed from: a */
    public void m4747a(Integer num) {
        this.f3851j = num;
    }

    /* renamed from: b */
    public Account m4748b() {
        return this.f3842a;
    }

    /* renamed from: c */
    public Account m4749c() {
        return this.f3842a != null ? this.f3842a : new Account("<<default account>>", "com.google");
    }

    /* renamed from: d */
    public Set<Scope> m4750d() {
        return this.f3843b;
    }

    /* renamed from: e */
    public Set<Scope> m4751e() {
        return this.f3844c;
    }

    /* renamed from: f */
    public Map<ann<?>, C0672a> m4752f() {
        return this.f3845d;
    }

    /* renamed from: g */
    public String m4753g() {
        return this.f3848g;
    }

    /* renamed from: h */
    public String m4754h() {
        return this.f3849h;
    }

    /* renamed from: i */
    public avk m4755i() {
        return this.f3850i;
    }

    /* renamed from: j */
    public Integer m4756j() {
        return this.f3851j;
    }
}
