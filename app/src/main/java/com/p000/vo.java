package com.p000;

/* renamed from: vo */
public class vo implements vt, ys {
    /* renamed from: a */
    public static final zd f25748a = new zd("NATIVE");
    /* renamed from: b */
    public static final ze f25749b = new ze("NATIVE");
    /* renamed from: c */
    public static final wt f25750c = new wt(f25748a, f25749b);
    /* renamed from: d */
    private final vm f25751d;
    /* renamed from: e */
    private String f25752e;
    /* renamed from: f */
    private String f25753f;
    /* renamed from: g */
    private String f25754g;
    /* renamed from: h */
    private String f25755h;
    /* renamed from: i */
    private String f25756i;
    /* renamed from: j */
    private String f25757j;
    /* renamed from: k */
    private String f25758k;
    /* renamed from: l */
    private String f25759l;
    /* renamed from: m */
    private String f25760m;
    /* renamed from: n */
    private String f25761n;
    /* renamed from: o */
    private float f25762o;
    /* renamed from: p */
    private String f25763p;
    /* renamed from: q */
    private String f25764q;
    /* renamed from: r */
    private String f25765r;
    /* renamed from: s */
    private String f25766s;
    /* renamed from: t */
    private String f25767t;
    /* renamed from: u */
    private String f25768u;
    /* renamed from: v */
    private long f25769v;

    private vo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f, String str10, String str11, String str12, String str13, String str14, String str15, String str16, long j, vm vmVar) {
        this.f25752e = str;
        this.f25753f = str2;
        this.f25754g = str3;
        this.f25755h = str4;
        this.f25756i = str5;
        this.f25757j = str6;
        this.f25758k = str7;
        this.f25760m = str8;
        this.f25761n = str9;
        this.f25762o = f;
        this.f25763p = str10;
        this.f25764q = str11;
        this.f25765r = str12;
        this.f25766s = str13;
        this.f25767t = str14;
        this.f25768u = str15;
        this.f25759l = str16;
        this.f25769v = j;
        this.f25751d = vmVar;
    }

    /* renamed from: a */
    public String m34431a() {
        return this.f25752e;
    }

    /* renamed from: a */
    public void m34432a(String str) {
        this.f25760m = str;
    }

    /* renamed from: b */
    public String m34433b() {
        return this.f25753f;
    }

    /* renamed from: b */
    public void m34434b(String str) {
        this.f25761n = str;
    }

    /* renamed from: c */
    public String m34435c() {
        return this.f25755h;
    }

    /* renamed from: c */
    public void m34436c(String str) {
        this.f25763p = str;
    }

    /* renamed from: d */
    public String m34437d() {
        return this.f25756i;
    }

    /* renamed from: e */
    public String m34438e() {
        return this.f25757j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vo voVar = (vo) obj;
        if (this.f25758k == null ? voVar.f25758k != null : !this.f25758k.equals(voVar.f25758k)) {
            return false;
        }
        if (this.f25768u == null ? voVar.f25768u != null : !this.f25768u.equals(voVar.f25768u)) {
            return false;
        }
        if (this.f25765r == null ? voVar.f25765r != null : !this.f25765r.equals(voVar.f25765r)) {
            return false;
        }
        if (this.f25759l == null ? voVar.f25759l != null : !this.f25759l.equals(voVar.f25759l)) {
            return false;
        }
        if (this.f25757j == null ? voVar.f25757j != null : !this.f25757j.equals(voVar.f25757j)) {
            return false;
        }
        if (this.f25764q == null ? voVar.f25764q != null : !this.f25764q.equals(voVar.f25764q)) {
            return false;
        }
        if (this.f25752e == null ? voVar.f25752e != null : !this.f25752e.equals(voVar.f25752e)) {
            return false;
        }
        if (this.f25753f == null ? voVar.f25753f != null : !this.f25753f.equals(voVar.f25753f)) {
            return false;
        }
        if (this.f25754g == null ? voVar.f25754g != null : !this.f25754g.equals(voVar.f25754g)) {
            return false;
        }
        if (this.f25755h == null ? voVar.f25755h != null : !this.f25755h.equals(voVar.f25755h)) {
            return false;
        }
        if (this.f25756i == null ? voVar.f25756i != null : !this.f25756i.equals(voVar.f25756i)) {
            return false;
        }
        if (this.f25767t == null ? voVar.f25767t != null : !this.f25767t.equals(voVar.f25767t)) {
            return false;
        }
        if (this.f25766s != null) {
            if (this.f25766s.equals(voVar.f25766s)) {
                return true;
            }
        } else if (voVar.f25766s == null) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String m34439f() {
        return this.f25759l;
    }

    /* renamed from: g */
    public String m34440g() {
        return this.f25760m;
    }

    /* renamed from: h */
    public String m34441h() {
        return this.f25761n;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f25767t != null ? this.f25767t.hashCode() : 0) + (((this.f25766s != null ? this.f25766s.hashCode() : 0) + (((this.f25765r != null ? this.f25765r.hashCode() : 0) + (((this.f25764q != null ? this.f25764q.hashCode() : 0) + (((this.f25759l != null ? this.f25759l.hashCode() : 0) + (((this.f25758k != null ? this.f25758k.hashCode() : 0) + (((this.f25757j != null ? this.f25757j.hashCode() : 0) + (((this.f25756i != null ? this.f25756i.hashCode() : 0) + (((this.f25755h != null ? this.f25755h.hashCode() : 0) + (((this.f25754g != null ? this.f25754g.hashCode() : 0) + (((this.f25753f != null ? this.f25753f.hashCode() : 0) + ((this.f25752e != null ? this.f25752e.hashCode() : 0) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f25768u != null) {
            i = this.f25768u.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public float m34442i() {
        return this.f25762o;
    }

    /* renamed from: j */
    public String m34443j() {
        return this.f25763p;
    }

    /* renamed from: k */
    public String m34444k() {
        return this.f25764q;
    }

    /* renamed from: l */
    public String m34445l() {
        return this.f25765r;
    }

    /* renamed from: m */
    public long m34446m() {
        return this.f25769v;
    }

    /* renamed from: n */
    public boolean m34447n() {
        boolean z = (this.f25760m == null || this.f25760m.equals(this.f25752e)) ? false : true;
        boolean z2 = (this.f25761n == null || this.f25761n.equals(this.f25753f)) ? false : true;
        return z && z2;
    }

    /* renamed from: o */
    public boolean m34448o() {
        return (this.f25763p == null || this.f25763p.equals(this.f25755h)) ? false : true;
    }

    public String toString() {
        return "WidgetSlot{clCode='" + this.f25768u + '\'' + ", sourceIconUrl='" + this.f25752e + '\'' + ", sourceImageUrl='" + this.f25753f + '\'' + ", sourceStarRatingImageUrl='" + this.f25754g + '\'' + ", sourceVideoUrl='" + this.f25755h + '\'' + ", title='" + this.f25756i + '\'' + ", descriptionText='" + this.f25757j + '\'' + ", captionText='" + this.f25758k + '\'' + ", ctaText='" + this.f25759l + '\'' + ", iconUrl='" + this.f25760m + '\'' + ", imageUrl='" + this.f25761n + '\'' + ", starRating='" + this.f25762o + '\'' + ", videoUrl='" + this.f25763p + '\'' + ", impressionTrackingUrl='" + this.f25764q + '\'' + ", clickUrl='" + this.f25765r + '\'' + ", videoStartTrackingUrl='" + this.f25766s + '\'' + ", videoEndTrackingUrl='" + this.f25767t + '\'' + '}';
    }
}
