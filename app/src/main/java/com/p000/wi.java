package com.p000;

/* renamed from: wi */
class wi implements zj {
    /* renamed from: a */
    final /* synthetic */ wj f25852a;
    /* renamed from: b */
    final /* synthetic */ wh f25853b;

    wi(wh whVar, wj wjVar) {
        this.f25853b = whVar;
        this.f25852a = wjVar;
    }

    public void onPostbackFailure(String str, int i) {
        this.f25853b.f25847b.mo5608b("PersistentPostbackManager", "Failed to submit postback with errorCode " + i + ". Will retry later...  Postback: " + this.f25852a);
        this.f25853b.m34624e(this.f25852a);
    }

    public void onPostbackSuccess(String str) {
        this.f25853b.m34623d(this.f25852a);
        this.f25853b.f25847b.mo5606a("PersistentPostbackManager", "Successfully submitted postback: " + this.f25852a);
        this.f25853b.m34628b();
    }
}
