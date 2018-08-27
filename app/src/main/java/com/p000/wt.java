package com.p000;

/* renamed from: wt */
public class wt {
    /* renamed from: a */
    private zd f25931a;
    /* renamed from: b */
    private ze f25932b;

    public wt(yy yyVar) {
        this.f25931a = yyVar.mo5552b();
        this.f25932b = yyVar.mo5553c();
    }

    public wt(zd zdVar, ze zeVar) {
        this.f25931a = zdVar;
        this.f25932b = zeVar;
    }

    /* renamed from: a */
    public zd m34662a() {
        return this.f25931a;
    }

    /* renamed from: b */
    public ze m34663b() {
        return this.f25932b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wt wtVar = (wt) obj;
        if (this.f25931a == null ? wtVar.f25931a != null : !this.f25931a.equals(wtVar.f25931a)) {
            if (this.f25932b != null) {
                if (this.f25932b.equals(wtVar.f25932b)) {
                    return true;
                }
            } else if (wtVar.f25932b == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f25931a != null ? this.f25931a.hashCode() : 0) * 31;
        if (this.f25932b != null) {
            i = this.f25932b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AdSpec{size=" + this.f25931a + ", type=" + this.f25932b + '}';
    }
}
