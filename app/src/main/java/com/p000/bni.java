package com.p000;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: bni */
public class bni {
    /* renamed from: a */
    private final bmw f7103a;
    /* renamed from: b */
    private volatile Boolean f7104b;
    /* renamed from: c */
    private String f7105c;
    /* renamed from: d */
    private Set<Integer> f7106d;

    protected bni(bmw bmw) {
        aoi.m4679a((Object) bmw);
        this.f7103a = bmw;
    }

    /* renamed from: A */
    public int m9932A() {
        return ((Integer) bnp.f7118E.m9985a()).intValue();
    }

    /* renamed from: B */
    public int m9933B() {
        return ((Integer) bnp.f7119F.m9985a()).intValue();
    }

    /* renamed from: C */
    public long m9934C() {
        return ((Long) bnp.f7120G.m9985a()).longValue();
    }

    /* renamed from: D */
    public long m9935D() {
        return ((Long) bnp.f7129P.m9985a()).longValue();
    }

    /* renamed from: a */
    public boolean m9936a() {
        if (this.f7104b == null) {
            synchronized (this) {
                if (this.f7104b == null) {
                    ApplicationInfo applicationInfo = this.f7103a.m9767b().getApplicationInfo();
                    String a = aqe.m4924a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = str != null && str.equals(a);
                        this.f7104b = Boolean.valueOf(z);
                    }
                    if ((this.f7104b == null || !this.f7104b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f7104b = Boolean.TRUE;
                    }
                    if (this.f7104b == null) {
                        this.f7104b = Boolean.TRUE;
                        this.f7103a.m9771f().zzbT("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f7104b.booleanValue();
    }

    /* renamed from: b */
    public boolean m9937b() {
        return ((Boolean) bnp.f7132b.m9985a()).booleanValue();
    }

    /* renamed from: c */
    public int m9938c() {
        return ((Integer) bnp.f7151u.m9985a()).intValue();
    }

    /* renamed from: d */
    public int m9939d() {
        return ((Integer) bnp.f7155y.m9985a()).intValue();
    }

    /* renamed from: e */
    public int m9940e() {
        return ((Integer) bnp.f7156z.m9985a()).intValue();
    }

    /* renamed from: f */
    public int m9941f() {
        return ((Integer) bnp.f7114A.m9985a()).intValue();
    }

    /* renamed from: g */
    public long m9942g() {
        return ((Long) bnp.f7140j.m9985a()).longValue();
    }

    /* renamed from: h */
    public long m9943h() {
        return ((Long) bnp.f7139i.m9985a()).longValue();
    }

    /* renamed from: i */
    public long m9944i() {
        return ((Long) bnp.f7143m.m9985a()).longValue();
    }

    /* renamed from: j */
    public long m9945j() {
        return ((Long) bnp.f7144n.m9985a()).longValue();
    }

    /* renamed from: k */
    public int m9946k() {
        return ((Integer) bnp.f7145o.m9985a()).intValue();
    }

    /* renamed from: l */
    public int m9947l() {
        return ((Integer) bnp.f7146p.m9985a()).intValue();
    }

    /* renamed from: m */
    public long m9948m() {
        return (long) ((Integer) bnp.f7116C.m9985a()).intValue();
    }

    /* renamed from: n */
    public String m9949n() {
        return (String) bnp.f7148r.m9985a();
    }

    /* renamed from: o */
    public String m9950o() {
        return (String) bnp.f7147q.m9985a();
    }

    /* renamed from: p */
    public String m9951p() {
        return (String) bnp.f7149s.m9985a();
    }

    /* renamed from: q */
    public String m9952q() {
        return (String) bnp.f7150t.m9985a();
    }

    /* renamed from: r */
    public bnd m9953r() {
        return bnd.m9913a((String) bnp.f7152v.m9985a());
    }

    /* renamed from: s */
    public bnf m9954s() {
        return bnf.m9924a((String) bnp.f7153w.m9985a());
    }

    /* renamed from: t */
    public Set<Integer> m9955t() {
        String str = (String) bnp.f7115B.m9985a();
        if (this.f7106d == null || this.f7105c == null || !this.f7105c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            Set hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException e) {
                }
            }
            this.f7105c = str;
            this.f7106d = hashSet;
        }
        return this.f7106d;
    }

    /* renamed from: u */
    public long m9956u() {
        return ((Long) bnp.f7124K.m9985a()).longValue();
    }

    /* renamed from: v */
    public long m9957v() {
        return ((Long) bnp.f7125L.m9985a()).longValue();
    }

    /* renamed from: w */
    public long m9958w() {
        return ((Long) bnp.f7128O.m9985a()).longValue();
    }

    /* renamed from: x */
    public int m9959x() {
        return ((Integer) bnp.f7136f.m9985a()).intValue();
    }

    /* renamed from: y */
    public int m9960y() {
        return ((Integer) bnp.f7138h.m9985a()).intValue();
    }

    /* renamed from: z */
    public String m9961z() {
        return "google_analytics_v4.db";
    }
}
