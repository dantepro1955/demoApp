package com.p000;

import android.net.Uri;

/* renamed from: vi */
public class vi implements vt, yy {
    /* renamed from: a */
    private final zd f25680a;
    /* renamed from: b */
    private final ze f25681b;
    /* renamed from: c */
    private final long f25682c;
    /* renamed from: d */
    private final String f25683d;
    /* renamed from: e */
    private final vj f25684e;
    /* renamed from: f */
    private final String f25685f;
    /* renamed from: g */
    private final String f25686g;
    /* renamed from: h */
    private final float f25687h;
    /* renamed from: i */
    private final float f25688i;
    /* renamed from: j */
    private final int f25689j;
    /* renamed from: k */
    private final String f25690k;
    /* renamed from: l */
    private final String f25691l;
    /* renamed from: m */
    private final String f25692m;
    /* renamed from: n */
    private final String f25693n;
    /* renamed from: o */
    private final vd f25694o;

    private vi(String str, zd zdVar, ze zeVar, String str2, vj vjVar, vd vdVar, float f, float f2, int i, long j, String str3, String str4, String str5, String str6, String str7) {
        if (zdVar == null) {
            throw new IllegalArgumentException("No size specified");
        } else if (zeVar == null) {
            throw new IllegalArgumentException("No type specified");
        } else {
            this.f25680a = zdVar;
            this.f25681b = zeVar;
            this.f25683d = str2;
            this.f25682c = j;
            this.f25686g = str;
            this.f25684e = vjVar;
            this.f25687h = f;
            this.f25689j = i;
            this.f25685f = str3;
            this.f25694o = vdVar;
            this.f25688i = f2;
            this.f25690k = str4;
            this.f25691l = str5;
            this.f25692m = str6;
            this.f25693n = str7;
        }
    }

    /* renamed from: a */
    public long mo5551a() {
        return this.f25682c;
    }

    /* renamed from: a */
    public String m34319a(int i) {
        String l = m34330l();
        return zn.m34841d(l) ? Uri.parse(l.replace("{CLCODE}", m34326h())).buildUpon().appendQueryParameter("pv", Integer.toString(i)).build().toString() : "";
    }

    /* renamed from: b */
    public zd mo5552b() {
        return this.f25680a;
    }

    /* renamed from: c */
    public ze mo5553c() {
        return this.f25681b;
    }

    /* renamed from: d */
    public vj m34322d() {
        return this.f25684e;
    }

    /* renamed from: e */
    public float m34323e() {
        return this.f25687h;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        vi viVar = (vi) obj;
        if (this.f25682c != viVar.f25682c || Float.compare(viVar.f25687h, this.f25687h) != 0 || Float.compare(viVar.f25688i, this.f25688i) != 0 || this.f25689j != viVar.f25689j) {
            return false;
        }
        if (this.f25680a != null) {
            if (!this.f25680a.equals(viVar.f25680a)) {
                return false;
            }
        } else if (viVar.f25680a != null) {
            return false;
        }
        if (this.f25681b != null) {
            if (!this.f25681b.equals(viVar.f25681b)) {
                return false;
            }
        } else if (viVar.f25681b != null) {
            return false;
        }
        if (this.f25683d != null) {
            if (!this.f25683d.equals(viVar.f25683d)) {
                return false;
            }
        } else if (viVar.f25683d != null) {
            return false;
        }
        if (this.f25684e != viVar.f25684e) {
            return false;
        }
        if (this.f25685f != null) {
            if (!this.f25685f.equals(viVar.f25685f)) {
                return false;
            }
        } else if (viVar.f25685f != null) {
            return false;
        }
        if (this.f25686g != null) {
            if (!this.f25686g.equals(viVar.f25686g)) {
                return false;
            }
        } else if (viVar.f25686g != null) {
            return false;
        }
        if (this.f25690k != null) {
            if (!this.f25690k.equals(viVar.f25690k)) {
                return false;
            }
        } else if (viVar.f25690k != null) {
            return false;
        }
        if (this.f25691l != null) {
            if (!this.f25691l.equals(viVar.f25691l)) {
                return false;
            }
        } else if (viVar.f25691l != null) {
            return false;
        }
        if (this.f25692m != null) {
            if (!this.f25692m.equals(viVar.f25692m)) {
                return false;
            }
        } else if (viVar.f25692m != null) {
            return false;
        }
        if (this.f25693n != null) {
            if (!this.f25693n.equals(viVar.f25693n)) {
                return false;
            }
        } else if (viVar.f25693n != null) {
            return false;
        }
        if (this.f25694o != viVar.f25694o) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public float m34324f() {
        return this.f25688i;
    }

    /* renamed from: g */
    public int m34325g() {
        return this.f25689j;
    }

    /* renamed from: h */
    public String m34326h() {
        return this.f25685f;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f25693n != null ? this.f25693n.hashCode() : 0) + (((this.f25692m != null ? this.f25692m.hashCode() : 0) + (((this.f25691l != null ? this.f25691l.hashCode() : 0) + (((this.f25690k != null ? this.f25690k.hashCode() : 0) + (((((this.f25688i != 0.0f ? Float.floatToIntBits(this.f25688i) : 0) + (((this.f25687h != 0.0f ? Float.floatToIntBits(this.f25687h) : 0) + (((this.f25686g != null ? this.f25686g.hashCode() : 0) + (((this.f25685f != null ? this.f25685f.hashCode() : 0) + (((this.f25684e != null ? this.f25684e.hashCode() : 0) + (((this.f25683d != null ? this.f25683d.hashCode() : 0) + (((((this.f25681b != null ? this.f25681b.hashCode() : 0) + ((this.f25680a != null ? this.f25680a.hashCode() : 0) * 31)) * 31) + ((int) (this.f25682c ^ (this.f25682c >>> 32)))) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + this.f25689j) * 31)) * 31)) * 31)) * 31)) * 31;
        if (this.f25694o != null) {
            i = this.f25694o.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public vd m34327i() {
        return this.f25694o;
    }

    /* renamed from: j */
    public String m34328j() {
        return this.f25686g;
    }

    /* renamed from: k */
    public String m34329k() {
        return this.f25683d;
    }

    /* renamed from: l */
    public String m34330l() {
        return this.f25690k;
    }

    /* renamed from: m */
    public String m34331m() {
        return this.f25692m;
    }

    /* renamed from: n */
    public String m34332n() {
        return this.f25693n;
    }

    /* renamed from: o */
    public String m34333o() {
        String str = this.f25691l;
        return zn.m34841d(str) ? str.replace("{CLCODE}", m34326h()) : "";
    }

    public String toString() {
        return "AppLovinAdImpl{size=" + this.f25680a + ", type=" + this.f25681b + ", adIdNumber=" + this.f25682c + ", videoFilename='" + this.f25683d + '\'' + ", target=" + this.f25684e + ", clCode='" + this.f25685f + '\'' + ", htmlSource='" + this.f25686g + '\'' + ", videoCloseDelay=" + this.f25687h + ", poststitialCloseDelay=" + this.f25688i + ", countdownLength=" + this.f25689j + ", completionUrl='" + this.f25690k + '\'' + ", supplementalClickTrackingUrl='" + this.f25691l + '\'' + ", muteImageFilename='" + this.f25692m + '\'' + ", unmuteImageFilename='" + this.f25693n + '\'' + ", closeStyle=" + this.f25694o + '}';
    }
}
