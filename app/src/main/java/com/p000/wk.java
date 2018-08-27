package com.p000;

/* renamed from: wk */
class wk implements zj {
    /* renamed from: a */
    final /* synthetic */ zj f25858a;
    /* renamed from: b */
    final /* synthetic */ vp f25859b;

    wk(vp vpVar, zj zjVar) {
        this.f25859b = vpVar;
        this.f25858a = zjVar;
    }

    public void onPostbackFailure(String str, int i) {
        this.f25859b.f25770a.mo5561g().mo5612d("PostbackService", "Failed to dispatch postback to URL " + str + ": " + i);
        if (this.f25858a != null) {
            this.f25858a.onPostbackFailure(str, i);
        }
    }

    public void onPostbackSuccess(String str) {
        this.f25859b.f25770a.mo5561g().mo5606a("PostbackService", "Successfully dispatched postback to URL " + str);
        if (this.f25858a != null) {
            this.f25858a.onPostbackSuccess(str);
        }
    }
}
