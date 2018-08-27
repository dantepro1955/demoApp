package com.p000;

/* renamed from: vg */
class vg implements za {
    /* renamed from: a */
    final /* synthetic */ ug f25676a;
    /* renamed from: b */
    final /* synthetic */ vf f25677b;

    vg(vf vfVar, ug ugVar) {
        this.f25677b = vfVar;
        this.f25676a = ugVar;
    }

    /* renamed from: a */
    public void mo5526a(yy yyVar) {
        this.f25677b.f25667a.runOnUiThread(this.f25677b.f25672f);
        za e = this.f25676a.m34267e();
        if (!(this.f25677b.f25675i || e == null)) {
            e.mo5526a(yyVar);
            this.f25677b.f25675i = true;
        }
        this.f25676a.m34263a(false);
    }

    /* renamed from: b */
    public void mo5527b(yy yyVar) {
        super.show();
        if (!this.f25677b.f25674h) {
            za e = this.f25676a.m34267e();
            if (e != null) {
                e.mo5527b(yyVar);
            }
            this.f25677b.f25674h = true;
        }
    }
}
