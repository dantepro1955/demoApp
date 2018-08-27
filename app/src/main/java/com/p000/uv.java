package com.p000;

import java.lang.ref.WeakReference;

/* renamed from: uv */
class uv implements zb, zf {
    /* renamed from: a */
    private final WeakReference f25648a;
    /* renamed from: b */
    private final zc f25649b;
    /* renamed from: c */
    private final zi f25650c;

    uv(ty tyVar, zl zlVar) {
        if (tyVar == null) {
            throw new IllegalArgumentException("No view specified");
        } else if (zlVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else {
            this.f25648a = new WeakReference(tyVar);
            this.f25650c = zlVar.mo5561g();
            this.f25649b = zlVar.mo5559d();
        }
    }

    /* renamed from: a */
    public void mo5548a(int i) {
        ty tyVar = (ty) this.f25648a.get();
        if (tyVar != null) {
            tyVar.m34227b(i);
        }
    }

    /* renamed from: a */
    public void mo5549a(yy yyVar) {
        ty tyVar = (ty) this.f25648a.get();
        if (tyVar != null) {
            tyVar.m34228b(yyVar);
        } else {
            this.f25650c.mo5613e("AppLovinAdView", "Ad view has been garbage collected by the time an ad was recieved");
        }
    }

    /* renamed from: b */
    public void mo5550b(yy yyVar) {
        ty tyVar = (ty) this.f25648a.get();
        if (tyVar != null) {
            tyVar.m34228b(yyVar);
            return;
        }
        this.f25649b.mo5555a((zf) this, yyVar.mo5552b());
        this.f25650c.mo5613e("AppLovinAdView", "Ad view has been garbage collected by the time an ad was updated");
    }

    public String toString() {
        return "[AdViewController listener: " + hashCode() + "]";
    }
}
