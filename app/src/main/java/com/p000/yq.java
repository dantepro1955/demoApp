package com.p000;

/* renamed from: yq */
class yq implements xd {
    /* renamed from: a */
    final /* synthetic */ wn f26066a;
    /* renamed from: b */
    final /* synthetic */ vn f26067b;

    yq(vn vnVar, wn wnVar) {
        this.f26067b = vnVar;
        this.f26066a = wnVar;
    }

    /* renamed from: a */
    public void mo5616a(yn ynVar) {
        try {
            this.f26067b.f25746a.m34415t().m34627a(this.f26067b.m34424a(this.f26066a, ynVar).toString(), this.f26066a.m34640b());
        } catch (Throwable e) {
            this.f26067b.f25746a.mo5561g().mo5609b("EventServiceImpl", "Unable to track event due to failure to convert event parameters into JSONObject for event: " + this.f26066a, e);
        }
    }
}
